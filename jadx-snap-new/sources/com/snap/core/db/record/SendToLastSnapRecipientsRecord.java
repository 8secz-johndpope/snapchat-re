package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.record.SendToLastSnapRecipientsModel.Factory;
import defpackage.ainu;

@AutoValue
public abstract class SendToLastSnapRecipientsRecord implements SendToLastSnapRecipientsModel {
    public static final Factory<SendToLastSnapRecipientsRecord> FACTORY = new Factory(-$$Lambda$41lYaZOnJX45dv-luwaG3DcCSp0.INSTANCE, FEED_KIND_TYPE_ADAPTER);
    private static final ainu<FeedKind, Long> FEED_KIND_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeedKind.class);
}
