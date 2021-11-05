import com.sun.tools.jconsole.JConsoleContext;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Chapter3 {


    //todo:converting string to date time
    public void convertToDate(String data,String time){
        LocalDate localDate=LocalDate.parse(data);
        LocalTime localTime= LocalTime.parse(time);
        LocalDateTime a= LocalDateTime.of(localDate,localTime);
        System.out.println(a);

    }

    //todo:formatting dateTime
    public void formateDateTime(String date,String time){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("MM-yyy-DD HH:mm");
        System.out.println(dateTimeFormatter.format(LocalDateTime.of(LocalDate.parse(date),LocalTime.parse(time))));
    }

    //todo:instant
    public void instantExemple(){
        Instant instant=Instant.now();
        System.out.println(instant);
        System.out.println(instant.minus(10, ChronoUnit.DAYS));
    }
    //tood:period exemple
    public void periodExemple(){
        LocalDate data1=LocalDate.now();
        LocalDate data2=data1.minus(10,ChronoUnit.DAYS);
        Period period=Period.between(data1,data2);
        System.out.println(period);
    }
    //todo:extracting from localdatetime
    public void extractingLocalDateTime(){
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getYear());
    }

    //todo:display all the avealabel zone with UTC and GMT
    public void allAvealeblZones(){
        Set<String> zonesId=ZoneId.getAvailableZoneIds();
        zonesId.forEach(zone->{
            System.out.println(LocalDateTime.now(ZoneId.of(zone)));
        });
    }
    //todo:fllight
    public void flight(){

        LocalDateTime localDateTime=LocalDateTime.now();
        ZonedDateTime australiaZoneTime=localDateTime.atZone(ZoneId.of("Australia/Perth"));
        ZonedDateTime arrive=australiaZoneTime.plus(15,ChronoUnit.HOURS).plus(30,ChronoUnit.MINUTES);
        ZonedDateTime bucharest=australiaZoneTime.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        ZonedDateTime bucharestarrive=arrive.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        System.out.println(bucharestarrive);


    }

}
