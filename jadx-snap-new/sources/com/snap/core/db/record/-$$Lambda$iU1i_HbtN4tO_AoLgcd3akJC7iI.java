package com.snap.core.db.record;

import com.snap.core.db.record.MessageModel.GetMessageByKeyCreator;
import com.snap.core.db.record.MessageModel.GetMessageByKeyModel;
import defpackage.gcj;
import defpackage.gcm;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$iU1i_HbtN4tO_AoLgcd3akJC7iI implements GetMessageByKeyCreator {
    public static final /* synthetic */ -$$Lambda$iU1i_HbtN4tO_AoLgcd3akJC7iI INSTANCE = new -$$Lambda$iU1i_HbtN4tO_AoLgcd3akJC7iI();

    private /* synthetic */ -$$Lambda$iU1i_HbtN4tO_AoLgcd3akJC7iI() {
    }

    public final GetMessageByKeyModel create(String str, long j, long j2, Long l, gcm gcm, gcj gcj, boolean z) {
        return new AutoValue_MessageRecord_MessageInfo(str, j, j2, l, gcm, gcj, z);
    }
}
