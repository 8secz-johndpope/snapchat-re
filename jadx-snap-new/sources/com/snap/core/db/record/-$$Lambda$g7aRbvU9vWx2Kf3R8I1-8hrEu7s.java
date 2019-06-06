package com.snap.core.db.record;

import com.snap.core.db.column.AdType;
import com.snap.core.db.record.PromotedStorySnapModel.PlayableSnapsCreator;
import com.snap.core.db.record.PromotedStorySnapModel.PlayableSnapsModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$g7aRbvU9vWx2Kf3R8I1-8hrEu7s implements PlayableSnapsCreator {
    public static final /* synthetic */ -$$Lambda$g7aRbvU9vWx2Kf3R8I1-8hrEu7s INSTANCE = new -$$Lambda$g7aRbvU9vWx2Kf3R8I1-8hrEu7s();

    private /* synthetic */ -$$Lambda$g7aRbvU9vWx2Kf3R8I1-8hrEu7s() {
    }

    public final PlayableSnapsModel create(long j, String str, long j2, String str2, AdType adType, String str3, String str4, String str5, String str6, String str7, Long l, long j3) {
        return new AutoValue_PromotedStorySnapRecord_PlayablePromotedSnapRecord(j, str, j2, str2, adType, str3, str4, str5, str6, str7, l, j3);
    }
}
