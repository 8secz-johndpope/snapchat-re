package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverFeedStoryModel.Factory;
import com.snap.core.db.record.DiscoverFeedStoryModel.GetStoryRowIdsInBatchModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class DiscoverFeedStoryRecord implements DiscoverFeedStoryModel {
    public static final Factory<DiscoverFeedStoryRecord> FACTORY;
    private static final ainu<FeatureType, Long> FEATURE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeatureType.class);
    public static final ainw<StoryIdModelRecord> SELECT_STORY_IDS_MAPPER;

    @AutoValue
    public static abstract class StoryIdModelRecord implements GetStoryRowIdsInBatchModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$KOSrulupRk7uE8e5aycqe3riwdQ.INSTANCE, FEATURE_TYPE_ADAPTER);
        FACTORY = factory;
        SELECT_STORY_IDS_MAPPER = factory.getStoryRowIdsInBatchMapper(-$$Lambda$wV7yWw9iOdoWTe2FnnzvNttGsjs.INSTANCE);
    }
}
