package com.snap.core.db.record;

import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.StoryKind;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForPlayingBySnapRowIdCreator;
import com.snap.core.db.record.StorySnapModel.SelectStorySnapForPlayingBySnapRowIdModel;
import defpackage.gcp;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$JIa_gwi0BgMiRX-z3FbESlfiHr0 implements SelectStorySnapForPlayingBySnapRowIdCreator {
    public static final /* synthetic */ -$$Lambda$JIa_gwi0BgMiRX-z3FbESlfiHr0 INSTANCE = new -$$Lambda$JIa_gwi0BgMiRX-z3FbESlfiHr0();

    private /* synthetic */ -$$Lambda$JIa_gwi0BgMiRX-z3FbESlfiHr0() {
    }

    public final SelectStorySnapForPlayingBySnapRowIdModel create(long j, String str, String str2, String str3, String str4, gcp gcp, String str5, String str6, String str7, String str8, long j2, long j3, boolean z, Boolean bool, String str9, boolean z2, Boolean bool2, String str10, String str11, String str12, String str13, String str14, String str15, Boolean bool3, String str16, Boolean bool4, Long l, long j4, String str17, String str18, long j5, String str19, Boolean bool5, GroupStoryType groupStoryType, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, Integer num, StoryKind storyKind, String str28, FriendLinkType friendLinkType, long j6, Integer num2, Long l2, String str29, MessageClientStatus messageClientStatus, String str30, String str31, String str32) {
        return new AutoValue_StorySnapRecord_SelectStorySnapsForPlayingRecord(j, str, str2, str3, str4, gcp, str5, str6, str7, str8, j2, j3, z, bool, str9, z2, bool2, str10, str11, str12, str13, str14, str15, bool3, str16, bool4, l, j4, str17, str18, j5, str19, bool5, groupStoryType, str20, str21, str22, str23, str24, str25, str26, str27, num, storyKind, str28, friendLinkType, j6, num2, l2, str29, messageClientStatus, str30, str31, str32);
    }
}
