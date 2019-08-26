package xyz.iamraj.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.stream.Stream;

public class TimestampDiff {

    public static void main(String[] args) {

        long currentTimeStamp = getCurrentTimeStamp();
        long lastTimestamp = 1565141326842L;
        System.out.println("Current timestamp "+currentTimeStamp);
        long days = currentTimeStamp - lastTimestamp;
        System.out.println("days "+days/(24 * 60 * 60 * 1000));

        long diffDays = (getCurrentTimeStamp() - lastTimestamp) / (24 * 60 * 60 * 1000);
        System.out.println("def "+diffDays);
        System.out.println("\n");

        // substracting the days from the timestamp
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lastTimestamp);
        calendar.add(Calendar.DATE, -30);
        long ll = calendar.getTimeInMillis();
        long minnum = Stream.of(1564968526842L,1565792513080L)
                .min(Comparator.comparing(Long::valueOf))
                .get();

        System.out.println(minnum);

    }
    public static long getCurrentTimeStamp() {
        long timeStamp = LocalDateTime.now().toInstant(ZoneOffset.UTC).toEpochMilli();
        return timeStamp;
    }
}
