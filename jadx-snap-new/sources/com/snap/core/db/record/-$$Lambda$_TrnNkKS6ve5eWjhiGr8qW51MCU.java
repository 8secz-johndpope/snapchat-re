package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectDisplayNameForUsernameCreator;
import com.snap.core.db.record.FriendModel.SelectDisplayNameForUsernameModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$_TrnNkKS6ve5eWjhiGr8qW51MCU implements SelectDisplayNameForUsernameCreator {
    public static final /* synthetic */ -$$Lambda$_TrnNkKS6ve5eWjhiGr8qW51MCU INSTANCE = new -$$Lambda$_TrnNkKS6ve5eWjhiGr8qW51MCU();

    private /* synthetic */ -$$Lambda$_TrnNkKS6ve5eWjhiGr8qW51MCU() {
    }

    public final SelectDisplayNameForUsernameModel create(long j, String str) {
        return new AutoValue_FriendRecord_DisplayName(j, str);
    }
}
