package com.snap.core.db.query;

import com.google.auto.value.AutoValue;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.query.SearchModel.Factory;
import com.snap.core.db.query.SearchModel.GetAllAddedFriendsModel;
import com.snap.core.db.query.SearchModel.GetAllFriendsStatusModel;
import com.snap.core.db.query.SearchModel.GetGroupStoriesModel;
import com.snap.core.db.query.SearchModel.GetRecentFriendsModel;
import com.snap.core.db.query.SearchModel.GetSearchBestFriendsModel;
import com.snap.core.db.query.SearchModel.GetSearchGroupsModel;
import com.snap.core.db.query.SearchModel.GetSearchSuggestedFriendsModel;
import com.snap.core.db.record.FriendRecord;
import com.snap.core.db.record.SuggestedFriendPlacementRecord;
import defpackage.ainw;

public class LegacySearchQueries implements SearchModel {
    public static final Factory FACTORY;
    public static final ainw<Friend> SELECT_ALL_ADDED_FRIENDS_MAPPER = FACTORY.getAllAddedFriendsMapper(-$$Lambda$eNwkFQ7uW3wrFc0lwi3re_3fpzM.INSTANCE);
    public static final ainw<FriendsStatus> SELECT_ALL_FRIENDS_STATUS_MAPPER = FACTORY.getAllFriendsStatusMapper(-$$Lambda$pslfz53feLmdWElmlesCOjCTRSA.INSTANCE);
    public static final ainw<Friend> SELECT_BEST_FRIEND_MAPPER;
    public static final ainw<Group> SELECT_GROUPS_MAPPER = FACTORY.getSearchGroupsMapper(-$$Lambda$9go_4JxI0fzUQ1A3a42UecKruYo.INSTANCE);
    public static final ainw<GroupStory> SELECT_GROUP_STORIES_MAPPER = FACTORY.getGroupStoriesMapper(-$$Lambda$1pl5fwZ6-f3lDq34kFAknGqL6tY.INSTANCE);
    public static final ainw<Friend> SELECT_RECENT_FRIENDS_MAPPER = FACTORY.getRecentFriendsMapper(-$$Lambda$MLKmu-TIBuOq4jkiVnOkssK-Eew.INSTANCE);
    public static final ainw<SuggestedFriend> SELECT_SUGGESTED_FRIENDS_IN_PLACEMENT_MAPPER = FACTORY.getSearchSuggestedFriendsMapper(-$$Lambda$Bs4L1iFGoTPc6OSvFGB4j8tIGDs.INSTANCE);

    public interface Friend extends GetAllAddedFriendsModel, GetRecentFriendsModel, GetSearchBestFriendsModel {
        boolean isSuggestedFriend();
    }

    @AutoValue
    public static abstract class FriendsStatus implements GetAllFriendsStatusModel {
    }

    @AutoValue
    public static abstract class Group implements GetSearchGroupsModel {
    }

    @AutoValue
    public static abstract class GroupStory implements GetGroupStoriesModel {
    }

    @AutoValue
    public static abstract class SuggestedFriend implements GetSearchSuggestedFriendsModel {
    }

    @AutoValue
    public static abstract class FriendImpl implements Friend {
        public boolean isSuggestedFriend() {
            return friendLinkType() == FriendLinkType.SUGGESTED;
        }
    }

    static {
        Factory factory = new Factory(SuggestedFriendPlacementRecord.FACTORY, FriendRecord.FACTORY);
        FACTORY = factory;
        SELECT_BEST_FRIEND_MAPPER = factory.getSearchBestFriendsMapper(-$$Lambda$NIu0q8c96b_kob6YYbuEBx4HfBc.INSTANCE);
    }
}
