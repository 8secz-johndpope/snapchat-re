package com.snap.core.db.record;

import com.snap.core.db.column.PlaybackSnapType;
import com.snap.core.db.record.PlaybackSnapViewModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$dxenfuWWGCR2c4LcmfKemDQx32Q implements Creator {
    public static final /* synthetic */ -$$Lambda$dxenfuWWGCR2c4LcmfKemDQx32Q INSTANCE = new -$$Lambda$dxenfuWWGCR2c4LcmfKemDQx32Q();

    private /* synthetic */ -$$Lambda$dxenfuWWGCR2c4LcmfKemDQx32Q() {
    }

    public final PlaybackSnapViewModel create(long j, PlaybackSnapType playbackSnapType, long j2, String str, long j3, Long l, Long l2, long j4, String str2, Long l3) {
        return new AutoValue_PlaybackSnapViewRecord(j, playbackSnapType, j2, str, j3, l, l2, j4, str2, l3);
    }
}
