package com.snap.core.db.record;

import com.google.auto.value.AutoValue;
import com.snap.core.db.api.column.IntegerEnumColumnAdapter;
import com.snap.core.db.column.CalendarDate;
import com.snap.core.db.column.CalendarDateColumnAdapter;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.Friendmojis;
import com.snap.core.db.column.FriendmojisColumnAdapter;
import com.snap.core.db.record.FriendModel.Factory;
import com.snap.core.db.record.FriendModel.SelectAllFriendUserScoresModel;
import com.snap.core.db.record.FriendModel.SelectBitmojiForUsernameModel;
import com.snap.core.db.record.FriendModel.SelectBlockedFriendModel;
import com.snap.core.db.record.FriendModel.SelectDisplayNameForUsernameModel;
import com.snap.core.db.record.FriendModel.SelectExistingUserDataModel;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUserIdsModel;
import com.snap.core.db.record.FriendModel.SelectFriendLinkTypesByUsernamesModel;
import com.snap.core.db.record.FriendModel.SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel;
import com.snap.core.db.record.FriendModel.SelectFriendsByLinkTypesModel;
import com.snap.core.db.record.FriendModel.SelectIdForKeysModel;
import com.snap.core.db.record.FriendModel.SelectUserNameAndRowIdByUserIdsModel;
import com.snap.core.db.record.FriendModel.SelectUserNameByUserIdsModel;
import defpackage.ainu;
import defpackage.ainw;

@AutoValue
public abstract class FriendRecord implements FriendModel {
    private static final ainu<CalendarDate, Long> BIRTHDAY_COLUMN_MAPPER = new CalendarDateColumnAdapter();
    public static final ainw<Long> COUNT_MUTUAL_FRIENDS_MAPPER = FACTORY.countMutualFriendsMapper();
    public static final Factory<FriendRecord> FACTORY;
    private static final ainu<Friendmojis, String> FRIENDMOJI_COLUMN_MAPPER = new FriendmojisColumnAdapter();
    private static final ainu<FriendLinkType, Long> LINK_TYPE_MAPPER = new IntegerEnumColumnAdapter(FriendLinkType.class);
    public static final ainw<UserScore> SELECT_ALL_FRIEND_USER_SCORES_MAPPER = FACTORY.selectAllFriendUserScoresMapper(-$$Lambda$fOfZg9XSLfT3sAhTjyHXlSs4zWA.INSTANCE);
    public static final ainw<String> SELECT_ALL_MUTUAL_FRIEND_USER_ID_MAPPER = FACTORY.selectAllMutualFriendUserIdsMapper();
    public static final ainw<BitmojiInfo> SELECT_BITMOJI_FOR_USERNAME_MAPPER = FACTORY.selectBitmojiForUsernameMapper(-$$Lambda$CVWDh-KKpWLgVr3Gq3EtbQoNKjA.INSTANCE);
    public static final ainw<DisplayInfo> SELECT_BLOCK_MAPPER = FACTORY.selectBlockedFriendMapper(-$$Lambda$KiO0G1ugXa76IwnXxBciszoRIrI.INSTANCE);
    public static final ainw<ExistingUserData> SELECT_EXISTING_USER_DATA_MAPPER = FACTORY.selectExistingUserDataMapper(-$$Lambda$aNR1Hi66kXUwyFPnAwp7G0qLbRM.INSTANCE);
    public static final ainw<FriendInfoAndLinkType> SELECT_FRIEND_BY_LINK_TYPES = FACTORY.selectFriendsByLinkTypesMapper(-$$Lambda$sA9N-C_EJoxW210ljnXsh595g0o.INSTANCE);
    public static final ainw<FriendId> SELECT_ID_FOR_KEYS_MAPPER;
    public static final ainw<DisplayName> SELECT_NAME_MAPPER = FACTORY.selectDisplayNameForUsernameMapper(-$$Lambda$_TrnNkKS6ve5eWjhiGr8qW51MCU.INSTANCE);
    public static final ainw<UserIdAndLinkType> SELECT_USERID_AND_LINK_TYPE = FACTORY.selectFriendLinkTypesByUserIdsMapper(-$$Lambda$Zk6h0eElHShuXASzkpFD9vy0B0w.INSTANCE);
    public static final ainw<UsernameAndAddedTimestamp> SELECT_USERNAME_AND_ADDED_TIMESTAMP_MAPPER = FACTORY.selectFriendsAndAddedTimestampsByLinkTypeAddedBeforeMapper(-$$Lambda$7ICGadgj6zJlq5M37vp6yLq9I9w.INSTANCE);
    public static final ainw<UsernameAndLinkType> SELECT_USERNAME_AND_LINK_TYPE = FACTORY.selectFriendLinkTypesByUsernamesMapper(-$$Lambda$e6DFUDEiMVvQwRgm5KyCq8Mup64.INSTANCE);
    public static final ainw<UserIdAndUsernameAndRow> SELECT_USERNAME_AND_ROW_ID_BY_USER_IDS_MAPPER = FACTORY.selectUserNameAndRowIdByUserIdsMapper(-$$Lambda$K9jmeK5f59sPSi_WJjDGHgDsR9k.INSTANCE);
    public static final ainw<UserIdAndUsername> SELECT_USERNAME_BY_USER_IDS_MAPPER = FACTORY.selectUserNameByUserIdsMapper(-$$Lambda$935TDypeEMZoFkWUzIkGHDLflPE.INSTANCE);

    @AutoValue
    public static abstract class ExistingUserData implements SelectExistingUserDataModel {
    }

    @AutoValue
    public static abstract class FriendId implements SelectIdForKeysModel {
    }

    @AutoValue
    public static abstract class UserScore implements SelectAllFriendUserScoresModel {
    }

    @AutoValue
    public static abstract class BitmojiInfo implements SelectBitmojiForUsernameModel {
    }

    @AutoValue
    public static abstract class DisplayInfo implements SelectBlockedFriendModel {
    }

    @AutoValue
    public static abstract class DisplayName implements SelectDisplayNameForUsernameModel {
    }

    @AutoValue
    public static abstract class FriendInfoAndLinkType implements SelectFriendsByLinkTypesModel {
    }

    @AutoValue
    public static abstract class UserIdAndLinkType implements SelectFriendLinkTypesByUserIdsModel {
    }

    @AutoValue
    public static abstract class UserIdAndUsername implements SelectUserNameByUserIdsModel {
    }

    @AutoValue
    public static abstract class UserIdAndUsernameAndRow implements SelectUserNameAndRowIdByUserIdsModel {
    }

    @AutoValue
    public static abstract class UsernameAndAddedTimestamp implements SelectFriendsAndAddedTimestampsByLinkTypeAddedBeforeModel {
    }

    @AutoValue
    public static abstract class UsernameAndLinkType implements SelectFriendLinkTypesByUsernamesModel {
    }

    static {
        Factory factory = new Factory(-$$Lambda$YEYuJsSL7OJoDd8fv6_c_STzvxU.INSTANCE, FRIENDMOJI_COLUMN_MAPPER, BIRTHDAY_COLUMN_MAPPER, LINK_TYPE_MAPPER);
        FACTORY = factory;
        SELECT_ID_FOR_KEYS_MAPPER = factory.selectIdForKeysMapper(-$$Lambda$X7WHsuEDG6NccV6EpXwa5lixbMA.INSTANCE);
    }
}
