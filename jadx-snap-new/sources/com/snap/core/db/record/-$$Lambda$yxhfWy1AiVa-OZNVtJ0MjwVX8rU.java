package com.snap.core.db.record;

import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForSnapIdCreator;
import com.snap.core.db.record.MessageModel.GetMessageMediaInfoForSnapIdModel;
import defpackage.aesg;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$yxhfWy1AiVa-OZNVtJ0MjwVX8rU implements GetMessageMediaInfoForSnapIdCreator {
    public static final /* synthetic */ -$$Lambda$yxhfWy1AiVa-OZNVtJ0MjwVX8rU INSTANCE = new -$$Lambda$yxhfWy1AiVa-OZNVtJ0MjwVX8rU();

    private /* synthetic */ -$$Lambda$yxhfWy1AiVa-OZNVtJ0MjwVX8rU() {
    }

    public final GetMessageMediaInfoForSnapIdModel create(String str, String str2, String str3, String str4, String str5, String str6, aesg aesg, gcp gcp) {
        return new AutoValue_MessageRecord_MischiefPlayableSnapInfo(str, str2, str3, str4, str5, str6, aesg, gcp);
    }
}
