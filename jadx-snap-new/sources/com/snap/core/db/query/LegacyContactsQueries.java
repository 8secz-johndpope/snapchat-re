package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.ContactsOnSnapchatModel.Factory;
import com.snap.core.db.query.ContactsOnSnapchatModel.SelectContactsOnSnapchatModel;
import defpackage.ainw;

@AutoValue
public abstract class LegacyContactsQueries implements ContactsOnSnapchatModel {
    public static final ainw<WithDisplayInfo> CONTACTS_ON_SNAPCHAT_MAPPER;
    public static final Factory FACTORY;

    @AutoValue
    public static abstract class WithDisplayInfo implements SelectContactsOnSnapchatModel {
    }

    static {
        Factory factory = new Factory();
        FACTORY = factory;
        CONTACTS_ON_SNAPCHAT_MAPPER = factory.selectContactsOnSnapchatMapper(-$$Lambda$kC3WMDB62DTWZtioM-GJMLaAOqM.INSTANCE);
    }
}
