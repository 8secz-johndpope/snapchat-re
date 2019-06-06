package com.snap.messaging.friendsfeed;

import defpackage.aedh;
import defpackage.aelt;
import defpackage.aelz;
import defpackage.aezk;
import defpackage.ajdx;
import defpackage.akxa;
import defpackage.akxk;
import defpackage.akxy;
import defpackage.gjh;

public interface FriendsFeedHttpInterface {

    public static final class a extends aedh implements aezk {
    }

    @akxy(a = "/ufs/friend_conversation")
    ajdx<akxa<aelz>> fetchChatConversation(@akxk aelt aelt);

    @akxy(a = "/ufs/group_conversation")
    ajdx<akxa<aelz>> fetchGroupConversation(@akxk aelt aelt);

    @gjh
    @akxy(a = "/ufs_internal/debug")
    ajdx<akxa<String>> fetchRankingDebug(@akxk a aVar);

    @akxy(a = "/ufs/friend_feed")
    ajdx<akxa<aelz>> syncFriendsFeed(@akxk aelt aelt);

    @akxy(a = "/ufs/conversations_stories")
    ajdx<akxa<aelz>> syncStoriesConversations(@akxk aelt aelt);
}
