package com.snap.core.db.record;

import com.snap.core.db.record.SnapTokenModel.Creator;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$IshfBQpBZPbDBWCjIjvRYuzxoW4 implements Creator {
    public static final /* synthetic */ -$$Lambda$IshfBQpBZPbDBWCjIjvRYuzxoW4 INSTANCE = new -$$Lambda$IshfBQpBZPbDBWCjIjvRYuzxoW4();

    private /* synthetic */ -$$Lambda$IshfBQpBZPbDBWCjIjvRYuzxoW4() {
    }

    public final SnapTokenModel create(long j, String str, String str2, String str3, byte[] bArr) {
        return new AutoValue_SnapTokenRecord(j, str, str2, str3, bArr);
    }
}
