package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface CognacAppListModel {
    public static final String ADDISCOMPATIBLE = "ALTER TABLE CognacAppList\nADD COLUMN isCompatible INTEGER DEFAULT 1 NOT NULL";
    public static final String ADDPRIVACYPOLICYURL = "ALTER TABLE CognacAppList\nADD COLUMN privacyPolicyUrl TEXT";
    public static final String ADDPUBLISHERTYPE = "ALTER TABLE CognacAppList\nADD COLUMN publisherType INTEGER DEFAULT 1 NOT NULL";
    public static final String ADDTERMSOFSERVICEURL = "ALTER TABLE CognacAppList\nADD COLUMN termsOfServiceUrl TEXT";
    @Deprecated
    public static final String BUILDID = "buildId";
    @Deprecated
    public static final String CONTENTURL = "contentUrl";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS CognacAppList (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL UNIQUE,\n\n    name TEXT NOT NULL,\n    imageUrl TEXT NOT NULL,\n    contentUrl TEXT,\n    buildId TEXT,\n    description TEXT,\n    timestamp INTEGER NOT NULL,\n    isTargeted INTEGER NOT NULL,\n    isCompatible INTEGER NOT NULL,\n    publisherType INTEGER NOT NULL,\n\n     -- preload url \n    preloadUrl TEXT,\n    preloadUrlPrefix TEXT,\n\n     -- cognac image resources \n    iconUrl TEXT,\n    loadingImageUrl TEXT,\n    logoUrl TEXT,\n    verticalImageUrl TEXT,\n    horizontalImageUrl TEXT,\n    squareImageUrl TEXT,\n\n     -- player limits \n    maxPlayerNumber INTEGER NOT NULL,\n    minPlayerNumber INTEGER NOT NULL,\n\n    privacyPolicyUrl TEXT,\n    termsOfServiceUrl TEXT\n)";
    @Deprecated
    public static final String DESCRIPTION = "description";
    @Deprecated
    public static final String HORIZONTALIMAGEURL = "horizontalImageUrl";
    @Deprecated
    public static final String ICONURL = "iconUrl";
    @Deprecated
    public static final String IMAGEURL = "imageUrl";
    @Deprecated
    public static final String ISCOMPATIBLE = "isCompatible";
    @Deprecated
    public static final String ISTARGETED = "isTargeted";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String LOADINGIMAGEURL = "loadingImageUrl";
    @Deprecated
    public static final String LOGOURL = "logoUrl";
    @Deprecated
    public static final String MAXPLAYERNUMBER = "maxPlayerNumber";
    @Deprecated
    public static final String MINPLAYERNUMBER = "minPlayerNumber";
    @Deprecated
    public static final String NAME = "name";
    @Deprecated
    public static final String PRELOADURL = "preloadUrl";
    @Deprecated
    public static final String PRELOADURLPREFIX = "preloadUrlPrefix";
    @Deprecated
    public static final String PRIVACYPOLICYURL = "privacyPolicyUrl";
    @Deprecated
    public static final String PUBLISHERTYPE = "publisherType";
    @Deprecated
    public static final String SQUAREIMAGEURL = "squareImageUrl";
    @Deprecated
    public static final String TABLE_NAME = "CognacAppList";
    @Deprecated
    public static final String TERMSOFSERVICEURL = "termsOfServiceUrl";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String VERTICALIMAGEURL = "verticalImageUrl";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends CognacAppListModel> {
        T create(long j, String str, String str2, String str3, String str4, String str5, String str6, long j2, boolean z, boolean z2, long j3, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j4, long j5, String str15, String str16);
    }

    public static final class Factory<T extends CognacAppListModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx selectAllFromCognacAppList() {
            return new ainx("SELECT * FROM CognacAppList", new aioa(CognacAppListModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllFromCognacAppListMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends CognacAppListModel> implements ainw<T> {
        private final Factory<T> cognacAppListModelFactory;

        public Mapper(Factory<T> factory) {
            this.cognacAppListModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.cognacAppListModelFactory.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getString(2), cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.getLong(7), cursor2.getInt(8) == 1, cursor2.getInt(9) == 1, cursor2.getLong(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : cursor2.getString(15), cursor2.isNull(16) ? null : cursor2.getString(16), cursor2.isNull(17) ? null : cursor2.getString(17), cursor2.isNull(18) ? null : cursor2.getString(18), cursor2.getLong(19), cursor2.getLong(20), cursor2.isNull(21) ? null : cursor2.getString(21), cursor2.isNull(22) ? null : cursor2.getString(22));
        }
    }

    public static final class ClearAll extends ainy {
        public ClearAll(pa paVar) {
            super(CognacAppListModel.TABLE_NAME, paVar.a("DELETE FROM CognacAppList"));
        }
    }

    public static final class InsertApp extends ainy {
        public InsertApp(pa paVar) {
            super(CognacAppListModel.TABLE_NAME, paVar.a("INSERT INTO CognacAppList(\n    key,\n    name,\n    imageUrl,\n    contentUrl,\n    buildId,\n    description,\n    timestamp,\n    isTargeted,\n    isCompatible,\n    publisherType,\n    preloadUrl,\n    preloadUrlPrefix,\n    iconUrl,\n    loadingImageUrl,\n    logoUrl,\n    verticalImageUrl,\n    horizontalImageUrl,\n    squareImageUrl,\n    maxPlayerNumber,\n    minPlayerNumber,\n    privacyPolicyUrl,\n    termsOfServiceUrl\n)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"));
        }

        public final void bind(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, boolean z2, long j2, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, long j3, long j4, String str15, String str16) {
            String str17 = str4;
            String str18 = str5;
            String str19 = str6;
            String str20 = str7;
            String str21 = str8;
            String str22 = str9;
            String str23 = str10;
            String str24 = str11;
            String str25 = str12;
            String str26 = str13;
            String str27 = str14;
            String str28 = str15;
            String str29 = str16;
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            if (str17 == null) {
                bindNull(4);
            } else {
                bindString(4, str17);
            }
            if (str18 == null) {
                bindNull(5);
            } else {
                bindString(5, str18);
            }
            if (str19 == null) {
                bindNull(6);
            } else {
                bindString(6, str19);
            }
            bindLong(7, j);
            long j5 = 0;
            bindLong(8, z ? 1 : 0);
            if (z2) {
                j5 = 1;
            }
            bindLong(9, j5);
            bindLong(10, j2);
            if (str20 == null) {
                bindNull(11);
            } else {
                bindString(11, str20);
            }
            if (str21 == null) {
                bindNull(12);
            } else {
                bindString(12, str21);
            }
            if (str22 == null) {
                bindNull(13);
            } else {
                bindString(13, str22);
            }
            if (str23 == null) {
                bindNull(14);
            } else {
                bindString(14, str23);
            }
            if (str24 == null) {
                bindNull(15);
            } else {
                bindString(15, str24);
            }
            if (str25 == null) {
                bindNull(16);
            } else {
                bindString(16, str25);
            }
            if (str26 == null) {
                bindNull(17);
            } else {
                bindString(17, str26);
            }
            if (str27 == null) {
                bindNull(18);
            } else {
                bindString(18, str27);
            }
            bindLong(19, j3);
            bindLong(20, j4);
            if (str28 == null) {
                bindNull(21);
            } else {
                bindString(21, str28);
            }
            if (str29 == null) {
                bindNull(22);
            } else {
                bindString(22, str29);
            }
        }
    }

    long _id();

    String buildId();

    String contentUrl();

    String description();

    String horizontalImageUrl();

    String iconUrl();

    String imageUrl();

    boolean isCompatible();

    boolean isTargeted();

    String key();

    String loadingImageUrl();

    String logoUrl();

    long maxPlayerNumber();

    long minPlayerNumber();

    String name();

    String preloadUrl();

    String preloadUrlPrefix();

    String privacyPolicyUrl();

    long publisherType();

    String squareImageUrl();

    String termsOfServiceUrl();

    long timestamp();

    String verticalImageUrl();
}
