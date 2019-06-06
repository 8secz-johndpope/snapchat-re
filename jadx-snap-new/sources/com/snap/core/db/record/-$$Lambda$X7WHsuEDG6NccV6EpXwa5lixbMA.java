package com.snap.core.db.record;

import com.snap.core.db.record.FriendModel.SelectIdForKeysCreator;
import com.snap.core.db.record.FriendModel.SelectIdForKeysModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$X7WHsuEDG6NccV6EpXwa5lixbMA implements SelectIdForKeysCreator {
    public static final /* synthetic */ -$$Lambda$X7WHsuEDG6NccV6EpXwa5lixbMA INSTANCE = new -$$Lambda$X7WHsuEDG6NccV6EpXwa5lixbMA();

    private /* synthetic */ -$$Lambda$X7WHsuEDG6NccV6EpXwa5lixbMA() {
    }

    public final SelectIdForKeysModel create(long j, String str) {
        return new AutoValue_FriendRecord_FriendId(j, str);
    }
}
