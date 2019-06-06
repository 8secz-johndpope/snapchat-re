package com.snap.core.db.record;

import com.snap.core.db.record.TalkAuthContextModel.SelectTalkAuthContextCreator;
import com.snap.core.db.record.TalkAuthContextModel.SelectTalkAuthContextModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$PB_kSrpIclHvS-8LW--ZMFdaO3o implements SelectTalkAuthContextCreator {
    public static final /* synthetic */ -$$Lambda$PB_kSrpIclHvS-8LW--ZMFdaO3o INSTANCE = new -$$Lambda$PB_kSrpIclHvS-8LW--ZMFdaO3o();

    private /* synthetic */ -$$Lambda$PB_kSrpIclHvS-8LW--ZMFdaO3o() {
    }

    public final SelectTalkAuthContextModel create(String str, String str2, String str3) {
        return new AutoValue_TalkAuthContextRecord_BasicTalkAuth(str, str2, str3);
    }
}
