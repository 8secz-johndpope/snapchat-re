package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.Factory;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatModel;
import defpackage.ainw;

@AutoValue
public abstract class LegacyContactsNotOnSnapchatQueries implements ContactsNotOnSnapchatModel {
    public static final ainw<WithDisplayInfo> CONTACTS_NOT_ON_SNAPCHAT_MAPPER;
    public static final Factory FACTORY;

    @AutoValue
    public static abstract class WithDisplayInfo implements SelectContactsNotOnSnapchatModel {
    }

    static {
        Factory factory = new Factory();
        FACTORY = factory;
        CONTACTS_NOT_ON_SNAPCHAT_MAPPER = factory.selectContactsNotOnSnapchatMapper(-$$Lambda$Q_X-_-KXMpkJYVWyxOet3SWlIB4.INSTANCE);
    }
}
