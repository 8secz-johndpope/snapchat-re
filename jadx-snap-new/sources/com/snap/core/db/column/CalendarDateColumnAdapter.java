package com.snap.core.db.column;

import defpackage.ainu;

public class CalendarDateColumnAdapter implements ainu<CalendarDate, Long> {
    public CalendarDate decode(Long l) {
        return new CalendarDate((int) (l.longValue() >> 32), (int) l.longValue());
    }

    public Long encode(CalendarDate calendarDate) {
        if (calendarDate.getMonth() <= 0 || calendarDate.getMonth() > 12) {
            throw new IllegalArgumentException("Month must be 1~12");
        } else if (calendarDate.getDay() > 0 && calendarDate.getDay() <= 31) {
            return Long.valueOf((((long) calendarDate.getMonth()) << 32) | (((long) calendarDate.getDay()) & 4294967295L));
        } else {
            throw new IllegalArgumentException("Day must be 1~31");
        }
    }
}
