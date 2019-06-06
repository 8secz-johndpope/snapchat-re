package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.PublisherPageSnapType;
import com.snap.core.db.record.PublisherSnapPageModel.Factory;
import com.snap.core.db.record.PublisherSnapPageModel.PageMediaInfoModel;
import com.snap.core.db.record.PublisherSnapPageModel.PlayablePagesModel;
import com.snap.core.db.record.PublisherSnapPageModel.PrefetchPublisherSnapsModel;
import com.snap.core.db.record.PublisherSnapPageModel.RichMediaInfoModel;
import com.snap.core.db.record.PublisherSnapPageModel.SnapTileInfoModel;
import com.snap.core.db.record.PublisherSnapPageModel.StoryInfoModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class PublisherSnapPageRecord implements PublisherSnapPageModel {
    public static final Factory<PublisherSnapPageRecord> FACTORY;
    private static final ainu<FeatureType, Long> FEATURE_TYPE_ADAPTER = new IntegerEnumColumnAdapter(FeatureType.class);
    public static final ainw<PlayablePagesRecord> PAGES_RECORD_ROW_MAPPER;
    public static final ainw<PageMediaInfoRecord> PAGE_MEDIA_INFO_RECORD_ROW_MAPPER = FACTORY.pageMediaInfoMapper(-$$Lambda$PXgpp22gSl2k3lEwYlxGtGIMo4U.INSTANCE);
    public static final ainw<PrefetchSnapRecord> PREFETCH_SNAP_RECORD_ROW_MAPPER = FACTORY.prefetchPublisherSnapsMapper(-$$Lambda$qNbFXpTwo99nowgEk8uaRnFuw2g.INSTANCE);
    public static final ainw<RichMediaInfoRecord> RICH_MEDIA_INFO_RECORD_ROW_MAPPER = FACTORY.richMediaInfoMapper(-$$Lambda$sHEBd_C9hDg-MxlPAqPnF7oh3mQ.INSTANCE);
    public static final ainw<SnapTileInfoRecord> SNAP_TILE_INFO_RECORD_ROW_MAPPER = FACTORY.snapTileInfoMapper(-$$Lambda$rXI3_BJh40PqCtoIQv6A8fwRexk.INSTANCE);
    private static final ainu<PublisherPageSnapType, Long> SNAP_TYPE_ADAPTER = new IntegerEnumColumnAdapter(PublisherPageSnapType.class);
    public static final ainw<StoryInfoRecord> STORY_INFO_RECORD_ROW_MAPPER = FACTORY.storyInfoMapper(-$$Lambda$3CKqacAljsmbZ2Td-PpVvl8wxMA.INSTANCE);

    @AutoValue
    public static abstract class PageMediaInfoRecord implements PageMediaInfoModel {
    }

    @AutoValue
    public static abstract class PlayablePagesRecord implements PlayablePagesModel {
    }

    @AutoValue
    public static abstract class PrefetchSnapRecord implements PrefetchPublisherSnapsModel {
    }

    @AutoValue
    public static abstract class RichMediaInfoRecord implements RichMediaInfoModel {
    }

    @AutoValue
    public static abstract class SnapTileInfoRecord implements SnapTileInfoModel {
    }

    @AutoValue
    public static abstract class StoryInfoRecord implements StoryInfoModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$c6NDMZVR1NQmKDXMwa5a95KBNfE.INSTANCE, SNAP_TYPE_ADAPTER, FEATURE_TYPE_ADAPTER);
        FACTORY = factory;
        PAGES_RECORD_ROW_MAPPER = factory.playablePagesMapper(-$$Lambda$D6aPkQv4pJEoFJ4hDVxnLYWKJ9U.INSTANCE);
    }
}
