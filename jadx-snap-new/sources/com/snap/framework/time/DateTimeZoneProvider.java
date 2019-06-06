package com.snap.framework.time;

import android.support.annotation.Keep;
import com.google.common.collect.ImmutableSet;
import defpackage.akrc;
import defpackage.akus;
import java.util.Date;
import java.util.Set;
import java.util.TimeZone;

@Keep
public class DateTimeZoneProvider implements akus {
    public static final Set<String> AVAILABLE_IDS = ImmutableSet.copyOf(TimeZone.getAvailableIDs());

    public Set<String> getAvailableIDs() {
        return AVAILABLE_IDS;
    }

    public akrc getZone(String str) {
        if (str == null) {
            return akrc.a;
        }
        TimeZone timeZone = TimeZone.getTimeZone(str);
        if (timeZone == null) {
            return akrc.a;
        }
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return akrc.a(rawOffset);
    }
}
