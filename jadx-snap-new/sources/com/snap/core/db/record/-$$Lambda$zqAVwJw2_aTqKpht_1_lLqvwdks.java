package com.snap.core.db.record;

import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageModel.GetSnapInfoForDifferentialUpdateCreator;
import com.snap.core.db.record.MessageModel.GetSnapInfoForDifferentialUpdateModel;
import defpackage.gcj;
import defpackage.gcm;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$zqAVwJw2_aTqKpht_1_lLqvwdks implements GetSnapInfoForDifferentialUpdateCreator {
    public static final /* synthetic */ -$$Lambda$zqAVwJw2_aTqKpht_1_lLqvwdks INSTANCE = new -$$Lambda$zqAVwJw2_aTqKpht_1_lLqvwdks();

    private /* synthetic */ -$$Lambda$zqAVwJw2_aTqKpht_1_lLqvwdks() {
    }

    public final GetSnapInfoForDifferentialUpdateModel create(String str, long j, long j2, gcp gcp, String str2, SnapServerStatus snapServerStatus, gcm gcm, gcj gcj) {
        return new AutoValue_MessageRecord_SnapDifferentialInfo(str, j, j2, gcp, str2, snapServerStatus, gcm, gcj);
    }
}
