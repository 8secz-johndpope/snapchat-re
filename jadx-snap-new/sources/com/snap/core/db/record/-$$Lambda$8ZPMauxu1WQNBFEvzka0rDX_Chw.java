package com.snap.core.db.record;

import com.snap.core.db.column.PlaybackSnapType;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectAllFromPlaybakcSnapViewCreator;
import com.snap.core.db.record.PlaybackSnapViewModel.SelectAllFromPlaybakcSnapViewModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$8ZPMauxu1WQNBFEvzka0rDX_Chw implements SelectAllFromPlaybakcSnapViewCreator {
    public static final /* synthetic */ -$$Lambda$8ZPMauxu1WQNBFEvzka0rDX_Chw INSTANCE = new -$$Lambda$8ZPMauxu1WQNBFEvzka0rDX_Chw();

    private /* synthetic */ -$$Lambda$8ZPMauxu1WQNBFEvzka0rDX_Chw() {
    }

    public final SelectAllFromPlaybakcSnapViewModel create(PlaybackSnapType playbackSnapType, long j, String str, long j2, String str2, Long l) {
        return new AutoValue_PlaybackSnapViewRecord_SelectAll(playbackSnapType, j, str, j2, str2, l);
    }
}
