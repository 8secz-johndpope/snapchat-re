package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.StoryCorpusSignalsModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class StoryCorpusSignalsRecord implements StoryCorpusSignalsModel {
    public static final Factory<StoryCorpusSignalsRecord> FACTORY;
    public static final ainw<StoryCorpusSignalsRecord> MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$TmXJPXKB4LPp36EYDscBZMA40Uw.INSTANCE);
        FACTORY = factory;
        MAPPER = factory.selectSignalMapper();
    }
}
