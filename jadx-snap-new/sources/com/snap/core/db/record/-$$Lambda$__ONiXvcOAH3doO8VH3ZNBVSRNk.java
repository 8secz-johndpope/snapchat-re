package com.snap.core.db.record;

import com.snap.core.db.record.FeedMemberModel.SelectMembersForAvatarCreator;
import com.snap.core.db.record.FeedMemberModel.SelectMembersForAvatarModel;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$__ONiXvcOAH3doO8VH3ZNBVSRNk implements SelectMembersForAvatarCreator {
    public static final /* synthetic */ -$$Lambda$__ONiXvcOAH3doO8VH3ZNBVSRNk INSTANCE = new -$$Lambda$__ONiXvcOAH3doO8VH3ZNBVSRNk();

    private /* synthetic */ -$$Lambda$__ONiXvcOAH3doO8VH3ZNBVSRNk() {
    }

    public final SelectMembersForAvatarModel create(Integer num, String str, String str2, String str3, String str4) {
        return new AutoValue_FeedMemberRecord_FeedAvatarMember(num, str, str2, str3, str4);
    }
}
