package com.snap.core.db.column;

import defpackage.akco;
import defpackage.akcr;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public final class CalendarDate {
    public static final Companion Companion = new Companion();
    private static final SimpleDateFormat monthDayFormat = new SimpleDateFormat("MM-dd", Locale.US);
    private final int day;
    private final int month;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(akco akco) {
            this();
        }

        public final CalendarDate parse(String str) {
            if (str != null) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                try {
                    int i = new GregorianCalendar().get(1);
                    gregorianCalendar.setTime(CalendarDate.monthDayFormat.parse(str));
                    gregorianCalendar.set(1, i);
                    return new CalendarDate(gregorianCalendar.get(2) + 1, gregorianCalendar.get(5));
                } catch (ParseException unused) {
                }
            }
            return null;
        }
    }

    public CalendarDate(int i, int i2) {
        this.month = i;
        this.day = i2;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = calendarDate.month;
        }
        if ((i3 & 2) != 0) {
            i2 = calendarDate.day;
        }
        return calendarDate.copy(i, i2);
    }

    public static final CalendarDate parse(String str) {
        return Companion.parse(str);
    }

    public final int component1() {
        return this.month;
    }

    public final int component2() {
        return this.day;
    }

    public final CalendarDate copy(int i, int i2) {
        return new CalendarDate(i, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CalendarDate) {
                CalendarDate calendarDate = (CalendarDate) obj;
                if ((this.month == calendarDate.month ? 1 : null) != null) {
                    if ((this.day == calendarDate.day ? 1 : null) != null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int hashCode() {
        return (this.month * 31) + this.day;
    }

    public final boolean isSameDay(Calendar calendar) {
        akcr.b(calendar, "other");
        return calendar.get(5) == this.day && calendar.get(2) + 1 == this.month;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CalendarDate(month=");
        stringBuilder.append(this.month);
        stringBuilder.append(", day=");
        stringBuilder.append(this.day);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
