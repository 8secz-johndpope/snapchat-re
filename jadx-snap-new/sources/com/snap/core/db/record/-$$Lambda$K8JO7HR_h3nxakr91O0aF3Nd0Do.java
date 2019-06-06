package com.snap.core.db.record;

import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.record.MessageModel.GetMessageInfoForDifferentialUpdateCreator;
import com.snap.core.db.record.MessageModel.GetMessageInfoForDifferentialUpdateModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$K8JO7HR_h3nxakr91O0aF3Nd0Do implements GetMessageInfoForDifferentialUpdateCreator {
    public static final /* synthetic */ -$$Lambda$K8JO7HR_h3nxakr91O0aF3Nd0Do INSTANCE = new -$$Lambda$K8JO7HR_h3nxakr91O0aF3Nd0Do();

    private /* synthetic */ -$$Lambda$K8JO7HR_h3nxakr91O0aF3Nd0Do() {
    }

    public final GetMessageInfoForDifferentialUpdateModel create(long j, String str, long j2, String str2, MessageClientStatus messageClientStatus, gcj gcj, gcm gcm) {
        return new AutoValue_MessageRecord_MessageDifferentialInfo(j, str, j2, str2, messageClientStatus, gcj, gcm);
    }
}
