package co.homelane.utils;

import java.time.*;

public final class ApplicationUtils {

    public static ZonedDateTime getZonedTime(LocalDateTime localDateTime) {
        ZoneId zone = ZoneId.systemDefault();
        ZoneOffset zoneOffSet = zone.getRules().getOffset(localDateTime);
        return getZoneDateTime(localDateTime.atOffset(zoneOffSet));
    }

    public static ZonedDateTime getZoneDateTime(OffsetDateTime offsetDateTime) {
        ZoneOffset zoneOffSet = offsetDateTime.getOffset();
        ZoneId zoneId = ZoneId.of(zoneOffSet.getId());
        return offsetDateTime.atZoneSameInstant(zoneId);
    }


    public static LocalDateTime getdate(String date) {
        String[] dateDataArr = date.split("-");
        LocalDateTime dateTime = LocalDateTime.of(Integer.parseInt(dateDataArr[0]),
                Integer.parseInt(dateDataArr[1]), Integer.parseInt(dateDataArr[2]), 0, 0);

        return dateTime;
    }

    private ApplicationUtils() {
    }
}
