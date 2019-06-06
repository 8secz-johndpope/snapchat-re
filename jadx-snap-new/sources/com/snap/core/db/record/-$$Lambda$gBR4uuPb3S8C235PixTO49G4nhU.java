package com.snap.core.db.record;

import com.snap.core.db.record.StorySnapModel.SelectLocallyPersistedPostedFieldsCreator;
import com.snap.core.db.record.StorySnapModel.SelectLocallyPersistedPostedFieldsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$gBR4uuPb3S8C235PixTO49G4nhU implements SelectLocallyPersistedPostedFieldsCreator {
    public static final /* synthetic */ -$$Lambda$gBR4uuPb3S8C235PixTO49G4nhU INSTANCE = new -$$Lambda$gBR4uuPb3S8C235PixTO49G4nhU();

    private /* synthetic */ -$$Lambda$gBR4uuPb3S8C235PixTO49G4nhU() {
    }

    public final SelectLocallyPersistedPostedFieldsModel create(long j, String str, Boolean bool, Long l) {
        return new AutoValue_StorySnapRecord_SelectLocallyPersistedPostedFieldsRecord(j, str, bool, l);
    }
}
