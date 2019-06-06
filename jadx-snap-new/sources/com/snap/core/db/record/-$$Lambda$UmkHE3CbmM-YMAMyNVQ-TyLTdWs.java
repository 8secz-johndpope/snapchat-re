package com.snap.core.db.record;

import com.snap.core.db.record.MessagingSnapModel.GetDownloadInfoForDirectSnapsCreator;
import com.snap.core.db.record.MessagingSnapModel.GetDownloadInfoForDirectSnapsModel;
import defpackage.aesg;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$UmkHE3CbmM-YMAMyNVQ-TyLTdWs implements GetDownloadInfoForDirectSnapsCreator {
    public static final /* synthetic */ -$$Lambda$UmkHE3CbmM-YMAMyNVQ-TyLTdWs INSTANCE = new -$$Lambda$UmkHE3CbmM-YMAMyNVQ-TyLTdWs();

    private /* synthetic */ -$$Lambda$UmkHE3CbmM-YMAMyNVQ-TyLTdWs() {
    }

    public final GetDownloadInfoForDirectSnapsModel create(String str, String str2, String str3, String str4, aesg aesg) {
        return new AutoValue_MessagingSnapRecord_DirectSnapInfo(str, str2, str3, str4, aesg);
    }
}
