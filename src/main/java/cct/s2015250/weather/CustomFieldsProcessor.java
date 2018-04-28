package cct.s2015250.weather;

import cct.s2015250.weather.payload.WeatherData;
import cct.s2015250.weather.payload.forecast.Forecast;
import cct.s2015250.weather.payload.forecast.Tabular;
import cct.s2015250.weather.payload.forecast.Temperature;
import cct.s2015250.weather.payload.forecast.Time;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CustomFieldsProcessor {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    public WeatherData calculateCustomFields(WeatherData weatherData) {
        WeatherData result = new WeatherData();
        result.setLocation(weatherData.getLocation());
        result.setCredit(weatherData.getCredit());
        result.setMeta(weatherData.getMeta());
        result.setSun(weatherData.getSun());
        result.setForecast(recalculateForecast(weatherData.getForecast()));
        return result;
    }

    private Forecast recalculateForecast(Forecast forecast) {
        Forecast newForecast = new Forecast();
        Tabular tabular = new Tabular();
        tabular.setTime(new ArrayList<>());

        LocalDateTime today = LocalDateTime.now();

        List<Time> dayOne = groupByDay(forecast.getTabular().getTime(), today, 0);
        List<Time> dayTwo = groupByDay(forecast.getTabular().getTime(), today, 1);
        List<Time> dayThree = groupByDay(forecast.getTabular().getTime(), today, 2);
        List<Time> dayFour = groupByDay(forecast.getTabular().getTime(), today, 3);
        List<Time> dayFive = groupByDay(forecast.getTabular().getTime(), today, 4);
        List<Time> daySix = groupByDay(forecast.getTabular().getTime(), today, 5);
        List<Time> daySeven = groupByDay(forecast.getTabular().getTime(), today, 6);

        if (dayOne.size() > 0) {
            tabular.getTime().add(compileTodayData(dayOne));
        }
        tabular.getTime().add(compileDailyData(dayTwo));
        tabular.getTime().add(compileDailyData(dayThree));
        tabular.getTime().add(compileDailyData(dayFour));
        tabular.getTime().add(compileDailyData(dayFive));
        tabular.getTime().add(compileDailyData(daySix));
        if (daySix.size() > 0) {
            tabular.getTime().add(compileDailyData(daySeven));
        }

        newForecast.setTabular(tabular);
        return newForecast;
    }

    private Time compileTodayData(List<Time> dayList) {
        Time result = new Time();
        result.setFrom(dayList.get(0).getFrom());
        result.setTo(dayList.get(dayList.size() - 1).getTo());
        result.setSymbol(dayList.get(0).getSymbol());
        result.setPressure(dayList.get(0).getPressure());
        result.setWindSpeed(dayList.get(0).getWindSpeed());
        result.setWindDirection(dayList.get(0).getWindDirection());
        result.setPrecipitation(dayList.get(0).getPrecipitation());
        result.setTemperature(dayList.get(0).getTemperature());
        result.setMinTemperature(calculateMinTemp(dayList));
        result.setMaxTemperature(calculateMaxTemp(dayList));
        result.setRealFeel(dayList.get(0).getRealFeel());
        return result;
    }

    private Time compileDailyData(List<Time> dayList) {
        Time result = new Time();
        result.setFrom(dayList.get(0).getFrom());
        result.setTo(dayList.get(3).getTo());
        result.setSymbol(dayList.get(2).getSymbol());
        result.setMinTemperature(calculateMinTemp(dayList));
        result.setMaxTemperature(calculateMaxTemp(dayList));
        return result;
    }

    private Temperature calculateMaxTemp(List<Time> dayList) {
        Temperature temperature = new Temperature();
        temperature.setUnit(dayList.get(0).getTemperature().getUnit());
        temperature.setValue(dayList.stream().map(t -> Integer.valueOf(t.getTemperature().getValue()))
                .max(Comparator.naturalOrder()).get().toString());
        return temperature;
    }

    private Temperature calculateMinTemp(List<Time> dayList) {
        Temperature temperature = new Temperature();
        temperature.setUnit(dayList.get(0).getTemperature().getUnit());
        temperature.setValue(dayList.stream().map(t -> Integer.valueOf(t.getTemperature().getValue()))
                .min(Comparator.naturalOrder()).get().toString());
        return temperature;
    }

    private List<Time> groupByDay(List<Time> originalList, LocalDateTime today, int offset) {
        return originalList.stream().filter(t ->
                today.plusDays(offset).getDayOfMonth() == LocalDate.parse(t.getFrom(), dtf).getDayOfMonth()
        ).collect(Collectors.toList());
    }
}
