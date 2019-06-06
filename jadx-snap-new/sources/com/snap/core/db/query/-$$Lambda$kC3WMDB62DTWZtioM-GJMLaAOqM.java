package com.snap.core.db.query;

import com.snap.core.db.query.ContactsOnSnapchatModel.SelectContactsOnSnapchatCreator;
import com.snap.core.db.query.ContactsOnSnapchatModel.SelectContactsOnSnapchatModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$kC3WMDB62DTWZtioM-GJMLaAOqM implements SelectContactsOnSnapchatCreator {
    public static final /* synthetic */ -$$Lambda$kC3WMDB62DTWZtioM-GJMLaAOqM INSTANCE = new -$$Lambda$kC3WMDB62DTWZtioM-GJMLaAOqM();

    private /* synthetic */ -$$Lambda$kC3WMDB62DTWZtioM-GJMLaAOqM() {
    }

    public final SelectContactsOnSnapchatModel create(long j, String str, String str2, String str3, String str4, String str5, boolean z, Long l, Boolean bool, Long l2, Long l3) {
        return new AutoValue_LegacyContactsQueries_WithDisplayInfo(j, str, str2, str3, str4, str5, z, l, bool, l2, l3);
    }
}
