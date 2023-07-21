package classfile;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Set;

public class CalendarDateDemo {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date :"+currentDate);
        LocalDate localDate=LocalDate.parse("2016-04-20");
        System.out.println("Local date :"+localDate);
        int year=localDate.getYear();
        System.out.println("Year :"+year);
        int month=localDate.getMonthValue();
        System.out.println("Month :"+month);
        int day=localDate.getDayOfMonth();
        System.out.println("Day :"+day);

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Previous Month Date :"+previousMonthSameDay);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();//returns the date plus the first hour of the day
        System.out.println("Beginning of Day :"+beginningOfDay);

        LocalDateTime beginningOfDay1 = LocalDate.parse(LocalDate.now().toString()).atStartOfDay();
        System.out.println("Beginning of Day :"+beginningOfDay1);

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth()); // returns first day of month
        System.out.println("First day of month :"+firstDayOfMonth);

//        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
//        for (String zoneIds:allZoneIds){
//            System.out.println(zoneIds);
//        }

//        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(),);

        DayOfWeek dayOfWeek = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("Day of the week: "+dayOfWeek);//output: Sunday
        int dayOfMonth = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("Day of the month: "+dayOfMonth);//output: 12


        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println(notBefore);
        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));
        System.out.println(isAfter);

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getHour()+":"+localTime.getMinute()+":"+localTime.getSecond());
        LocalTime localTime1=LocalTime.parse("06:30");
        System.out.println(localTime1);
        System.out.println(localTime1.getHour()+":"+localTime1.getMinute()+":"+localTime1.getSecond());
        LocalTime localTime2=LocalTime.of(03,30,00);
        System.out.println(localTime2);
        System.out.println(localTime2.getHour()+":"+localTime2.getMinute()+":"+localTime2.getSecond());
        System.out.println(localTime2.plusHours(1));
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIDNIGHT.plusHours(1));

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println("Instance date and time: "+ldt);
        LocalDateTime l=LocalDateTime.of(LocalDate.now(),LocalTime.now());
        System.out.println("Instance LocalDateTime using factory of() method: "+l);
        System.out.println("Local Date Time using factory of() method: "+LocalDateTime.of(2015,Month.APRIL,02,
                07,00,00));
        System.out.println("LocalDateTime using factory parse() method: "+LocalDateTime.parse("2019-01-01T09:40:00"));

        System.out.println("5 days to this date and time: "+LocalDateTime.now().plusDays(5));

        Set<String> getZoneIds=ZoneId.getAvailableZoneIds();
        for (String zoneIds:getZoneIds){
            System.out.println(zoneIds);
        }
        System.out.println(getZoneIds.size());
        ZoneId z=ZoneId.of("Asia/Shanghai");
        System.out.println(z);

        System.out.println(ZoneId.of("Africa/Lagos"));

        ZonedDateTime zdt=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Africa/Lagos"));
        System.out.println(zdt);
        System.out.println("Retirement date: "+LocalDate.of(1974,Month.JULY,04).plusYears(60).plusMonths(1));

        LocalTime lt=LocalTime.MAX;
        System.out.println(lt);
        LocalTime lt2=LocalTime.MIN;
        System.out.println(lt2);
        System.out.println(Duration.between(lt, lt2));
        System.out.println(ChronoUnit.SECONDS.between(lt, lt2));
        System.out.println(MonthDay.now());
        System.out.println(YearMonth.of(2015,Month.APRIL));
        LocalDateTime inJune = LocalDateTime.now().withMonth(Month.JULY.getValue());
        System.out.println(inJune);
        System.out.println(LocalDateTime.now().plusMonths(1));
        LocalTime truncated = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
        System.out.println(truncated);
        System.out.println(LocalDateTime.now().getHour());
        //\u000dSystem.out.println("How?");

    }
}
