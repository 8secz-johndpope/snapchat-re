package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.AdType;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.record.PromotedStorySnapModel.Factory;
import com.snap.core.db.record.PromotedStorySnapModel.MediaFetchInfoModel;
import com.snap.core.db.record.PromotedStorySnapModel.PlayableSnapsModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class PromotedStorySnapRecord implements PromotedStorySnapModel {
    private static final ainu<AdType, Long> AD_TYPE_ADAPTER = new IntegerEnumColumnAdapter(AdType.class);
    public static final Factory<PromotedStorySnapRecord> FACTORY;
    private static final ainu<FeatureType, Long> FEATURE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeatureType.class);
    public static final ainw<PlayablePromotedSnapRecord> PROMOTED_PLAYABLE_SNAP_RECORD_ROW_MAPPER;
    public static final ainw<MediaFetchInfoRecord> PROMOTED_SNAP_MEDIA_FETCH_INFO_MAPPER = FACTORY.mediaFetchInfoMapper(-$$Lambda$vtQKnqtKu2iShZRRNcKPTGta44o.INSTANCE);

    @AutoValue
    public static abstract class MediaFetchInfoRecord implements MediaFetchInfoModel {
    }

    @AutoValue
    public static abstract class PlayablePromotedSnapRecord implements PlayableSnapsModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$3dCKwxRK8Gfmr11w_SaJM2ZXCbM.INSTANCE, FEATURE_TYPE_ADAPTER, AD_TYPE_ADAPTER);
        FACTORY = factory;
        PROMOTED_PLAYABLE_SNAP_RECORD_ROW_MAPPER = factory.playableSnapsMapper(-$$Lambda$g7aRbvU9vWx2Kf3R8I1-8hrEu7s.INSTANCE);
    }
}
