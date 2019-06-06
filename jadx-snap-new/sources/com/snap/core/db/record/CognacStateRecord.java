package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.CognacStateModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class CognacStateRecord implements CognacStateModel {
    public static final ainw<CognacStateRecord> COGNAC_STATE_CONVERSATION_ID_MAPPER = FACTORY.selectStateForConversationsMapper();
    public static final Factory<CognacStateRecord> FACTORY;
    public static final ainw<CognacStateRecord> SELECT_BY_CONVERSATION_ID_MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$kPXvGDB7AJVwFW8MRnkbRyELMI0.INSTANCE);
        FACTORY = factory;
        SELECT_BY_CONVERSATION_ID_MAPPER = factory.selectStateForConversationMapper();
    }
}
