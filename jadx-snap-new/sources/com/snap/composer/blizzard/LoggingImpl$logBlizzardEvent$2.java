package com.snap.composer.blizzard;

import defpackage.aavd;
import defpackage.abhr;
import defpackage.akcr;
import java.util.LinkedHashMap;
import java.util.Map;

public final class LoggingImpl$logBlizzardEvent$2 extends abhr {
    private /* synthetic */ Event a;

    LoggingImpl$logBlizzardEvent$2(Event event) {
        this.a = event;
    }

    public final Map<String, Object> asDictionary() {
        Object asDictionary = super.asDictionary();
        Map linkedHashMap = new LinkedHashMap();
        akcr.a(asDictionary, "source");
        linkedHashMap.putAll(asDictionary);
        linkedHashMap.put("event_name", getEventName());
        for (String str : this.a.getParameters().keySet()) {
            Object obj = this.a.getParameters().get(str);
            if (obj != null) {
                linkedHashMap.put(str, obj);
            }
        }
        return linkedHashMap;
    }

    public final String getEventName() {
        return this.a.getName();
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }
}
