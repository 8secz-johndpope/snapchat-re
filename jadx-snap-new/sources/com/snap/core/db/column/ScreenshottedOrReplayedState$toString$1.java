package com.snap.core.db.column;

import com.brightcove.player.media.CuePointFields;
import com.google.common.base.MoreObjects;
import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.core.db.column.ScreenshottedOrReplayedState.Record;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;

final class ScreenshottedOrReplayedState$toString$1 extends akcs implements akbl<Record, String> {
    public static final ScreenshottedOrReplayedState$toString$1 INSTANCE = new ScreenshottedOrReplayedState$toString$1();

    ScreenshottedOrReplayedState$toString$1() {
        super(1);
    }

    public final String invoke(Record record) {
        akcr.b(record, "it");
        String str = "replayed";
        Object toStringHelper = MoreObjects.toStringHelper("ScreenshottedOrReplayedState").add("userId", record.getUserId()).add(CuePointFields.TIME, record.getTimestamp()).add(str, record.getReplayed()).add(MapboxNavigationEvent.KEY_SCREENSHOT, record.getScreenshotCount()).add("screenRecord", record.getScreenRecordCount()).toString();
        akcr.a(toStringHelper, "MoreObjects.toStringHelp…              .toString()");
        return toStringHelper;
    }
}
