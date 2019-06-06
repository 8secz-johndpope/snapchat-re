package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.record.MessageMediaRefModel.Factory;
import defpackage.ainw;

@AutoValue
public abstract class MessageMediaRefRecord implements MessageMediaRefModel {
    public static final Factory<MessageMediaRefModel> FACTORY;
    public static final ainw<MessageMediaRefModel> GET_MEDIA_REFS_MAPPER;

    static {
        Factory factory = new Factory(-$$Lambda$WIiSLLctNi_GHI8DhQaR620NWmI.INSTANCE);
        FACTORY = factory;
        GET_MEDIA_REFS_MAPPER = factory.getMediaRefsByMessageIdMapper();
    }
}
