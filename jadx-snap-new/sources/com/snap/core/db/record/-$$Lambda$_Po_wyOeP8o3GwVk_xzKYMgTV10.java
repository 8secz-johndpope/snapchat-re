package com.snap.core.db.record;

import com.snap.core.db.record.MessageModel.GetBasicInfoForMessageCreator;
import com.snap.core.db.record.MessageModel.GetBasicInfoForMessageModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$_Po_wyOeP8o3GwVk_xzKYMgTV10 implements GetBasicInfoForMessageCreator {
    public static final /* synthetic */ -$$Lambda$_Po_wyOeP8o3GwVk_xzKYMgTV10 INSTANCE = new -$$Lambda$_Po_wyOeP8o3GwVk_xzKYMgTV10();

    private /* synthetic */ -$$Lambda$_Po_wyOeP8o3GwVk_xzKYMgTV10() {
    }

    public final GetBasicInfoForMessageModel create(String str, Long l, String str2, String str3) {
        return new AutoValue_MessageRecord_BasicInfoForMessageModel(str, l, str2, str3);
    }
}
