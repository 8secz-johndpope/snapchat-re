package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.record.SnapModel.Factory;
import com.snap.core.db.record.SnapModel.SelectSnapsForPlayingModel;
import defpackage.ainu;
import defpackage.gcp;

@AutoValue
public abstract class SnapRecord implements SnapModel {
    public static final Factory<SnapRecord> FACTORY = new Factory(-$$Lambda$tFY2dvJ72xrgxgPeuiHc-0Z1hhY.INSTANCE, SNAP_TYPE_ADAPTER);
    private static final ainu<gcp, Long> SNAP_TYPE_ADAPTER = new IntegerEnumColumnAdapter(gcp.class);

    @AutoValue
    public static abstract class PlayableSnapRecord implements SelectSnapsForPlayingModel {
    }
}
