package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.PlaybackSnapType;
import com.snap.core.db.record.PlaybackSnapViewModel.Factory;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectAllFromPlaybakcSnapViewModel;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectViewedModel;
import defpackage.ainw;

@AutoValue
public abstract class PlaybackSnapViewRecord implements PlaybackSnapViewModel {
    public static final Factory<PlaybackSnapViewRecord> FACTORY;
    public static final ainw<SelectAll> SELECT_ALL_MAPPER = FACTORY.selectAllFromPlaybakcSnapViewMapper(-$$Lambda$8ZPMauxu1WQNBFEvzka0rDX_Chw.INSTANCE);
    public static final ainw<SelectViewed> SELECT_VIEWED_MAPPER;

    @AutoValue
    public static abstract class SelectAll implements SelectAllFromPlaybakcSnapViewModel {
    }

    @AutoValue
    public static abstract class SelectViewed implements SelectViewedModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$dxenfuWWGCR2c4LcmfKemDQx32Q.INSTANCE, new IntegerEnumColumnAdapter(PlaybackSnapType.class));
        FACTORY = factory;
        SELECT_VIEWED_MAPPER = factory.selectViewedMapper(-$$Lambda$2Ud2nml-gXXxAjEoAp9lDfOO6IE.INSTANCE);
    }
}
