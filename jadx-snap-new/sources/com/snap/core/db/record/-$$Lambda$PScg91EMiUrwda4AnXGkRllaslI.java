package com.snap.core.db.record;

import com.snap.core.db.record.StoryInteractionSignalsModel.GetCorpusInteractionFeaturesCreator;
import com.snap.core.db.record.StoryInteractionSignalsModel.GetCorpusInteractionFeaturesModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$PScg91EMiUrwda4AnXGkRllaslI implements GetCorpusInteractionFeaturesCreator {
    public static final /* synthetic */ -$$Lambda$PScg91EMiUrwda4AnXGkRllaslI INSTANCE = new -$$Lambda$PScg91EMiUrwda4AnXGkRllaslI();

    private /* synthetic */ -$$Lambda$PScg91EMiUrwda4AnXGkRllaslI() {
    }

    public final GetCorpusInteractionFeaturesModel create(long j, double d, double d2, double d3, double d4, long j2, long j3) {
        return new AutoValue_StoryInteractionSignalsRecord_CorpusInteractionFeaturesRecord(j, d, d2, d3, d4, j2, j3);
    }
}
