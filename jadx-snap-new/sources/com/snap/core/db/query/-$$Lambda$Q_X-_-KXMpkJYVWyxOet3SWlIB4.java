package com.snap.core.db.query;

import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatCreator;
import com.snap.core.db.query.ContactsNotOnSnapchatModel.SelectContactsNotOnSnapchatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$Q_X-_-KXMpkJYVWyxOet3SWlIB4 implements SelectContactsNotOnSnapchatCreator {
    public static final /* synthetic */ -$$Lambda$Q_X-_-KXMpkJYVWyxOet3SWlIB4 INSTANCE = new -$$Lambda$Q_X-_-KXMpkJYVWyxOet3SWlIB4();

    private /* synthetic */ -$$Lambda$Q_X-_-KXMpkJYVWyxOet3SWlIB4() {
    }

    public final SelectContactsNotOnSnapchatModel create(long j, String str, String str2) {
        return new AutoValue_LegacyContactsNotOnSnapchatQueries_WithDisplayInfo(j, str, str2);
    }
}
