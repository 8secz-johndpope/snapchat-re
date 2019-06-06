package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.DiscoverStorySnapModel.Factory;
import com.snap.core.db.record.DiscoverStorySnapModel.PlayableStorySnapsModel;
import com.snap.core.db.record.DiscoverStorySnapModel.PrefetchStorySnapsModel;
import com.snap.core.db.record.DiscoverStorySnapModel.StoryMediaInfoModel;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.gcp;

@AutoValue
public abstract class DiscoverStorySnapRecord implements DiscoverStorySnapModel {
    private static final ainu<DynamicSnapSource, Long> DYNAMIC_SNAP_SOURCE_ADAPTER = new IntegerEnumColumnAdapter(DynamicSnapSource.class);
    public static final Factory<DiscoverStorySnapRecord> FACTORY;
    private static final ainu<FeatureType, Long> FEATURE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeatureType.class);
    public static final ainw<PlayableStorySnapsModelRecord> SELECT_PLAYABLE_STORY_SNAPS_MODEL_ROW_MAPPER;
    public static final ainw<PrefetchStorySnapModelRecord> SELECT_PREFETCH_SNAPS_MODEL_ROW_MAPPER = FACTORY.prefetchStorySnapsMapper(-$$Lambda$bKTLQrMEj-MjRXTNneOe7N-W-fs.INSTANCE);
    private static final ainu<gcp, Long> SNAP_TYPE_ADAPTER = new IntegerEnumColumnAdapter(gcp.class);
    public static final ainw<StorySnapMediaInfoRecord> STORY_SNAP_MEDIA_INFO_ROW_MAPPER = FACTORY.storyMediaInfoMapper(-$$Lambda$6EZvbY07HKIppNQfpYsrXREduNE.INSTANCE);

    @AutoValue
    public static abstract class PlayableStorySnapsModelRecord implements PlayableStorySnapsModel {
        public static final String PLAYABLE_SNAP_CREATION_COLUMN = "creationTimestampMs";
        public static final String PLAYABLE_SNAP_ROW_COLUMN = "S._id";
    }

    @AutoValue
    public static abstract class PrefetchStorySnapModelRecord implements PrefetchStorySnapsModel {
    }

    @AutoValue
    public static abstract class StorySnapMediaInfoRecord implements StoryMediaInfoModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$ZUqLrIIGodOu_tV7lyRwC44zVdY.INSTANCE, SNAP_TYPE_ADAPTER, FEATURE_TYPE_ADAPTER, DYNAMIC_SNAP_SOURCE_ADAPTER);
        FACTORY = factory;
        SELECT_PLAYABLE_STORY_SNAPS_MODEL_ROW_MAPPER = factory.playableStorySnapsMapper(-$$Lambda$YzPTmGSw3N59PGGbhjdZ6IwkWv8.INSTANCE);
    }
}
