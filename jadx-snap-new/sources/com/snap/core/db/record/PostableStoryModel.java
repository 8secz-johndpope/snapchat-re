package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.GroupStoryRankType;
import com.snap.core.db.column.PrivacyType;
import com.snapchat.soju.android.Geofence;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainy;
import defpackage.pa;

public interface PostableStoryModel {
    public static final String ADDTHIRDPARTYAPPSTORYTTL = "ALTER TABLE PostableStory\nADD COLUMN thirdPartyAppStoryTtl INTEGER";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS PostableStory (\n\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER, -- as DatabaseKey<Story>\n    subtext TEXT,\n    isSpectaclesStory INTEGER,\n    geofence TEXT,\n    groupStoryRankType INTEGER,\n    customTitle TEXT,\n    hasActiveStory INTEGER,\n    lastActionTimestamp INTEGER,\n    mostRecentPostTimestamp INTEGER,\n    creationTimestamp INTEGER,\n    thumbnailUrl TEXT,\n    myStoryPrivacyOverride INTEGER,\n    thirdPartyAppStoryTtl INTEGER\n)";
    @Deprecated
    public static final String CREATIONTIMESTAMP = "creationTimestamp";
    @Deprecated
    public static final String CUSTOMTITLE = "customTitle";
    public static final String DROPTABLE = "DROP TABLE PostableStory";
    @Deprecated
    public static final String GEOFENCE = "geofence";
    @Deprecated
    public static final String GROUPSTORYRANKTYPE = "groupStoryRankType";
    @Deprecated
    public static final String HASACTIVESTORY = "hasActiveStory";
    @Deprecated
    public static final String ISSPECTACLESSTORY = "isSpectaclesStory";
    @Deprecated
    public static final String LASTACTIONTIMESTAMP = "lastActionTimestamp";
    @Deprecated
    public static final String MOSTRECENTPOSTTIMESTAMP = "mostRecentPostTimestamp";
    @Deprecated
    public static final String MYSTORYPRIVACYOVERRIDE = "myStoryPrivacyOverride";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String SUBTEXT = "subtext";
    @Deprecated
    public static final String TABLE_NAME = "PostableStory";
    @Deprecated
    public static final String THIRDPARTYAPPSTORYTTL = "thirdPartyAppStoryTtl";
    @Deprecated
    public static final String THUMBNAILURL = "thumbnailUrl";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends PostableStoryModel> {
        T create(long j, String str, Long l, String str2, Boolean bool, Geofence geofence, GroupStoryRankType groupStoryRankType, String str3, Boolean bool2, Long l2, Long l3, Long l4, String str4, PrivacyType privacyType, Long l5);
    }

    public static final class UpdatePostableStory extends ainy {
        private final Factory<? extends PostableStoryModel> postableStoryModelFactory;

        public UpdatePostableStory(pa paVar, Factory<? extends PostableStoryModel> factory) {
            super("PostableStory", paVar.a("UPDATE PostableStory\nSET storyId=?,\n    subtext=?,\n    groupStoryRankType=?,\n    hasActiveStory=?,\n    lastActionTimestamp=?,\n    mostRecentPostTimestamp=?,\n    creationTimestamp=?,\n    customTitle=?,\n    thumbnailUrl=?,\n    myStoryPrivacyOverride=?\nWHERE storyRowId=?"));
            this.postableStoryModelFactory = factory;
        }

        public final void bind(String str, String str2, GroupStoryRankType groupStoryRankType, Boolean bool, Long l, Long l2, Long l3, String str3, String str4, PrivacyType privacyType, Long l4) {
            bindString(1, str);
            if (str2 == null) {
                bindNull(2);
            } else {
                bindString(2, str2);
            }
            if (groupStoryRankType == null) {
                bindNull(3);
            } else {
                bindLong(3, ((Long) this.postableStoryModelFactory.groupStoryRankTypeAdapter.encode(groupStoryRankType)).longValue());
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (l2 == null) {
                bindNull(6);
            } else {
                bindLong(6, l2.longValue());
            }
            if (l3 == null) {
                bindNull(7);
            } else {
                bindLong(7, l3.longValue());
            }
            if (str3 == null) {
                bindNull(8);
            } else {
                bindString(8, str3);
            }
            if (str4 == null) {
                bindNull(9);
            } else {
                bindString(9, str4);
            }
            if (privacyType == null) {
                bindNull(10);
            } else {
                bindLong(10, ((Long) this.postableStoryModelFactory.myStoryPrivacyOverrideAdapter.encode(privacyType)).longValue());
            }
            if (l4 == null) {
                bindNull(11);
            } else {
                bindLong(11, l4.longValue());
            }
        }
    }

    public static final class Factory<T extends PostableStoryModel> {
        public final Creator<T> creator;
        public final ainu<Geofence, String> geofenceAdapter;
        public final ainu<GroupStoryRankType, Long> groupStoryRankTypeAdapter;
        public final ainu<PrivacyType, Long> myStoryPrivacyOverrideAdapter;

        public Factory(Creator<T> creator, ainu<Geofence, String> ainu, ainu<GroupStoryRankType, Long> ainu2, ainu<PrivacyType, Long> ainu3) {
            this.creator = creator;
            this.geofenceAdapter = ainu;
            this.groupStoryRankTypeAdapter = ainu2;
            this.myStoryPrivacyOverrideAdapter = ainu3;
        }
    }

    public static final class Mapper<T extends PostableStoryModel> implements ainw<T> {
        private final Factory<T> postableStoryModelFactory;

        public Mapper(Factory<T> factory) {
            this.postableStoryModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            Creator creator = this.postableStoryModelFactory.creator;
            boolean z = false;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            Long valueOf = cursor2.isNull(2) ? null : Long.valueOf(cursor2.getLong(2));
            String string2 = cursor2.isNull(3) ? null : cursor2.getString(3);
            if (cursor2.isNull(4)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(4) == 1);
            }
            Geofence geofence = cursor2.isNull(5) ? null : (Geofence) this.postableStoryModelFactory.geofenceAdapter.decode(cursor2.getString(5));
            GroupStoryRankType groupStoryRankType = cursor2.isNull(6) ? null : (GroupStoryRankType) this.postableStoryModelFactory.groupStoryRankTypeAdapter.decode(Long.valueOf(cursor2.getLong(6)));
            String string3 = cursor2.isNull(7) ? null : cursor2.getString(7);
            if (cursor2.isNull(8)) {
                bool2 = null;
            } else {
                if (cursor2.getInt(8) == 1) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            return creator.create(j, string, valueOf, string2, bool, geofence, groupStoryRankType, string3, bool2, cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.isNull(13) ? null : (PrivacyType) this.postableStoryModelFactory.myStoryPrivacyOverrideAdapter.decode(Long.valueOf(cursor2.getLong(13))), cursor2.isNull(14) ? null : Long.valueOf(cursor2.getLong(14)));
        }
    }

    public static final class DeletePostableStoryByKey extends ainy {
        public DeletePostableStoryByKey(pa paVar) {
            super("PostableStory", paVar.a("DELETE FROM PostableStory\nWHERE storyId=?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertPostableStory extends ainy {
        private final Factory<? extends PostableStoryModel> postableStoryModelFactory;

        public InsertPostableStory(pa paVar, Factory<? extends PostableStoryModel> factory) {
            super("PostableStory", paVar.a("INSERT INTO PostableStory (\n    storyId,\n    storyRowId,\n    subtext,\n    groupStoryRankType,\n    hasActiveStory,\n    lastActionTimestamp,\n    mostRecentPostTimestamp,\n    creationTimestamp,\n    customTitle,\n    thumbnailUrl,\n    myStoryPrivacyOverride)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.postableStoryModelFactory = factory;
        }

        public final void bind(String str, Long l, String str2, GroupStoryRankType groupStoryRankType, Boolean bool, Long l2, Long l3, Long l4, String str3, String str4, PrivacyType privacyType) {
            bindString(1, str);
            if (l == null) {
                bindNull(2);
            } else {
                bindLong(2, l.longValue());
            }
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (groupStoryRankType == null) {
                bindNull(4);
            } else {
                bindLong(4, ((Long) this.postableStoryModelFactory.groupStoryRankTypeAdapter.encode(groupStoryRankType)).longValue());
            }
            if (bool == null) {
                bindNull(5);
            } else {
                bindLong(5, bool.booleanValue() ? 1 : 0);
            }
            if (l2 == null) {
                bindNull(6);
            } else {
                bindLong(6, l2.longValue());
            }
            if (l3 == null) {
                bindNull(7);
            } else {
                bindLong(7, l3.longValue());
            }
            if (l4 == null) {
                bindNull(8);
            } else {
                bindLong(8, l4.longValue());
            }
            if (str3 == null) {
                bindNull(9);
            } else {
                bindString(9, str3);
            }
            if (str4 == null) {
                bindNull(10);
            } else {
                bindString(10, str4);
            }
            if (privacyType == null) {
                bindNull(11);
            } else {
                bindLong(11, ((Long) this.postableStoryModelFactory.myStoryPrivacyOverrideAdapter.encode(privacyType)).longValue());
            }
        }
    }

    long _id();

    Long creationTimestamp();

    String customTitle();

    Geofence geofence();

    GroupStoryRankType groupStoryRankType();

    Boolean hasActiveStory();

    Boolean isSpectaclesStory();

    Long lastActionTimestamp();

    Long mostRecentPostTimestamp();

    PrivacyType myStoryPrivacyOverride();

    String storyId();

    Long storyRowId();

    String subtext();

    Long thirdPartyAppStoryTtl();

    String thumbnailUrl();
}
