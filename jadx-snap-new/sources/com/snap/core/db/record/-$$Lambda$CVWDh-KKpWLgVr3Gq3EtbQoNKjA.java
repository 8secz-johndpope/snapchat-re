package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectBitmojiForUsernameCreator;
import com.snap.core.db.record.FriendModel.SelectBitmojiForUsernameModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$CVWDh-KKpWLgVr3Gq3EtbQoNKjA implements SelectBitmojiForUsernameCreator {
    public static final /* synthetic */ -$$Lambda$CVWDh-KKpWLgVr3Gq3EtbQoNKjA INSTANCE = new -$$Lambda$CVWDh-KKpWLgVr3Gq3EtbQoNKjA();

    private /* synthetic */ -$$Lambda$CVWDh-KKpWLgVr3Gq3EtbQoNKjA() {
    }

    public final SelectBitmojiForUsernameModel create(String str, String str2) {
        return new AutoValue_FriendRecord_BitmojiInfo(str, str2);
    }
}
