package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.PrivacyType;
import com.snap.core.db.record.PostableStoryModel.Factory;
import com.snapchat.soju.android.Geofence;
import defpackage.ainu;

@AutoValue
public abstract class PostableStoryRecord implements PostableStoryModel {
    public static final Factory<PostableStoryRecord> FACTORY = new Factory(-$$Lambda$EfT2InwYIdr8wzlApfQBts1aB1I.INSTANCE, GEOFENCE_ADAPTER, GROUP_STORY_RANK_TYPE_ADAPTER, PRIVACY_TYPE_COLUMN_ADAPTER);
    private static final ainu<Geofence, String> GEOFENCE_ADAPTER = new ainu<Geofence, String>() {
        public final Geofence decode(String str) {
            return new Geofence();
        }

        public final String encode(Geofence geofence) {
            return "";
        }
    };
    private static final ainu<GroupStoryRankType, Long> GROUP_STORY_RANK_TYPE_ADAPTER = new IntegerEnumColumnAdapter(GroupStoryRankType.class);
    private static final ainu<PrivacyType, Long> PRIVACY_TYPE_COLUMN_ADAPTER = new IntegerEnumColumnAdapter(PrivacyType.class);
}
