package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.StoryInteractionSignalsModel.Factory;
import com.snap.core.db.record.StoryInteractionSignalsModel.GetCorpusInteractionFeaturesModel;
import defpackage.ainw;

@AutoValue
public abstract class StoryInteractionSignalsRecord implements StoryInteractionSignalsModel {
    public static final ainw<StoryInteractionSignalsRecord> BULK_SELECT_SIGNALS_MAPPER;
    public static final ainw<CorpusInteractionFeaturesRecord> CORPUS_INTERACTION_FEATURES_MAPPER = FACTORY.getCorpusInteractionFeaturesMapper(-$$Lambda$PScg91EMiUrwda4AnXGkRllaslI.INSTANCE);
    public static final Factory<StoryInteractionSignalsRecord> FACTORY;
    public static final ainw<StoryInteractionSignalsRecord> SELECT_SIGNALS_MAPPER = FACTORY.selectSignalByRowIdMapper();

    @AutoValue
    public static abstract class CorpusInteractionFeaturesRecord implements GetCorpusInteractionFeaturesModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$-eQCBit8hf3yr3LteLVAc8fgCOU.INSTANCE);
        FACTORY = factory;
        BULK_SELECT_SIGNALS_MAPPER = factory.bulkSelectSignalsMapper();
    }
}
