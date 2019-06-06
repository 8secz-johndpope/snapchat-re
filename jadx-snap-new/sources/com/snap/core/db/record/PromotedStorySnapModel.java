package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.AdType;
import com.snap.core.db.column.FeatureType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface PromotedStorySnapModel {
    @Deprecated
    public static final String ADSNAPKEY = "adSnapKey";
    @Deprecated
    public static final String ADTYPE = "adType";
    @Deprecated
    public static final String BRANDNAME = "brandName";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS PromotedStorySnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    snapId  TEXT NOT NULL,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    featureType INTEGER NOT NULL,\n    mediaUrl TEXT NOT NULL,\n    mediaDurationMillis INTEGER,\n    adSnapKey TEXT,\n    brandName TEXT,\n    headline TEXT,\n    adType INTEGER,\n    timestamp INTEGER NOT NULL,\n    politicalAdName TEXT,\n    UNIQUE (snapId, featureType)\n)";
    @Deprecated
    public static final String FEATURETYPE = "featureType";
    @Deprecated
    public static final String HEADLINE = "headline";
    @Deprecated
    public static final String MEDIADURATIONMILLIS = "mediaDurationMillis";
    @Deprecated
    public static final String MEDIAURL = "mediaUrl";
    @Deprecated
    public static final String POLITICALADNAME = "politicalAdName";
    @Deprecated
    public static final String SNAPID = "snapId";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String TABLE_NAME = "PromotedStorySnap";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends PromotedStorySnapModel> {
        T create(long j, String str, String str2, long j2, FeatureType featureType, String str3, Long l, String str4, String str5, String str6, AdType adType, long j3, String str7);
    }

    public static final class Factory<T extends PromotedStorySnapModel> {
        public final ainu<AdType, Long> adTypeAdapter;
        public final Creator<T> creator;
        public final ainu<FeatureType, Long> featureTypeAdapter;

        final class GetNextPromotedStorySnapIdQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            GetNextPromotedStorySnapIdQuery(long j, FeatureType featureType) {
                super("SELECT\n    S.snapId\nFROM PromotedStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.snapId = V.snapId AND V.type = 3)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    V.snapId IS NULL\nORDER BY S._id", new aioa(PromotedStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class GetUnviewedPromotedStorySnapCountQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            GetUnviewedPromotedStorySnapCountQuery(long j, FeatureType featureType) {
                super("SELECT\n    COUNT(*)\nFROM PromotedStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.snapId = V.snapId AND V.type = 3)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    V.snapId IS NULL", new aioa(PromotedStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class MediaFetchInfoQuery extends ainx {
            private final FeatureType featureType;
            private final String snapId;

            MediaFetchInfoQuery(String str, FeatureType featureType) {
                super("SELECT\n    _id,\n    adSnapKey,\n    mediaUrl\nFROM PromotedStorySnap\nWHERE snapId =?1 AND featureType = ?2", new aioa(PromotedStorySnapModel.TABLE_NAME));
                this.snapId = str;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.snapId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class PlayableSnapsQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            PlayableSnapsQuery(long j, FeatureType featureType) {
                super("SELECT\n    promotedSnap._id,\n    promotedSnap.snapId,\n    promotedSnap.storyRowId,\n    promotedSnap.storyId,\n    promotedSnap.adType,\n    promotedSnap.brandName,\n    promotedSnap.headline,\n    promotedSnap.adSnapKey,\n    promotedSnap.mediaUrl,\n    promotedSnap.politicalAdName,\n    V.viewStartTimestampMillis AS lastView,\n    promotedSnap.timestamp\nFROM PromotedStorySnap promotedSnap\nLEFT OUTER JOIN PlaybackSnapView V ON (promotedSnap.snapId = V.snapId AND V.type = 3)\nWHERE\n    promotedSnap.storyRowId = ?1 AND\n    featureType = ?2\nORDER BY promotedSnap._id", new aioa(PromotedStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        public Factory(Creator<T> creator, ainu<FeatureType, Long> ainu, ainu<AdType, Long> ainu2) {
            this.creator = creator;
            this.featureTypeAdapter = ainu;
            this.adTypeAdapter = ainu2;
        }

        public final ainx getNextPromotedStorySnapId(long j, FeatureType featureType) {
            return new GetNextPromotedStorySnapIdQuery(j, featureType);
        }

        public final ainw<String> getNextPromotedStorySnapIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getUnviewedPromotedStorySnapCount(long j, FeatureType featureType) {
            return new GetUnviewedPromotedStorySnapCountQuery(j, featureType);
        }

        public final ainw<Long> getUnviewedPromotedStorySnapCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx mediaFetchInfo(String str, FeatureType featureType) {
            return new MediaFetchInfoQuery(str, featureType);
        }

        public final <R extends MediaFetchInfoModel> MediaFetchInfoMapper<R> mediaFetchInfoMapper(MediaFetchInfoCreator<R> mediaFetchInfoCreator) {
            return new MediaFetchInfoMapper(mediaFetchInfoCreator);
        }

        public final ainx playableSnaps(long j, FeatureType featureType) {
            return new PlayableSnapsQuery(j, featureType);
        }

        public final <R extends PlayableSnapsModel> PlayableSnapsMapper<R, T> playableSnapsMapper(PlayableSnapsCreator<R> playableSnapsCreator) {
            return new PlayableSnapsMapper(playableSnapsCreator, this);
        }
    }

    public interface MediaFetchInfoCreator<T extends MediaFetchInfoModel> {
        T create(long j, String str, String str2);
    }

    public interface MediaFetchInfoModel {
        long _id();

        String adSnapKey();

        String mediaUrl();
    }

    public interface PlayableSnapsCreator<T extends PlayableSnapsModel> {
        T create(long j, String str, long j2, String str2, AdType adType, String str3, String str4, String str5, String str6, String str7, Long l, long j3);
    }

    public interface PlayableSnapsModel {
        long _id();

        String adSnapKey();

        AdType adType();

        String brandName();

        String headline();

        Long lastView();

        String mediaUrl();

        String politicalAdName();

        String snapId();

        String storyId();

        long storyRowId();

        long timestamp();
    }

    public static final class Mapper<T extends PromotedStorySnapModel> implements ainw<T> {
        private final Factory<T> promotedStorySnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.promotedStorySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            String str;
            AdType adType;
            Cursor cursor2 = cursor;
            Creator creator = this.promotedStorySnapModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            String string2 = cursor2.getString(2);
            long j2 = cursor2.getLong(3);
            FeatureType featureType = (FeatureType) this.promotedStorySnapModelFactory.featureTypeAdapter.decode(Long.valueOf(cursor2.getLong(4)));
            String string3 = cursor2.getString(5);
            Long valueOf = cursor2.isNull(6) ? null : Long.valueOf(cursor2.getLong(6));
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            if (cursor2.isNull(10)) {
                str = string6;
                adType = null;
            } else {
                str = string6;
                adType = (AdType) this.promotedStorySnapModelFactory.adTypeAdapter.decode(Long.valueOf(cursor2.getLong(10)));
            }
            return creator.create(j, string, string2, j2, featureType, string3, valueOf, string4, string5, str, adType, cursor2.getLong(11), cursor2.isNull(12) ? null : cursor2.getString(12));
        }
    }

    public static final class MediaFetchInfoMapper<T extends MediaFetchInfoModel> implements ainw<T> {
        private final MediaFetchInfoCreator<T> creator;

        public MediaFetchInfoMapper(MediaFetchInfoCreator<T> mediaFetchInfoCreator) {
            this.creator = mediaFetchInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.getString(2));
        }
    }

    public static final class PlayableSnapsMapper<T extends PlayableSnapsModel, T1 extends PromotedStorySnapModel> implements ainw<T> {
        private final PlayableSnapsCreator<T> creator;
        private final Factory<T1> promotedStorySnapModelFactory;

        public PlayableSnapsMapper(PlayableSnapsCreator<T> playableSnapsCreator, Factory<T1> factory) {
            this.creator = playableSnapsCreator;
            this.promotedStorySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getLong(2), cursor2.getString(3), cursor2.isNull(4) ? null : (AdType) this.promotedStorySnapModelFactory.adTypeAdapter.decode(Long.valueOf(cursor2.getLong(4))), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.getString(8), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.getLong(11));
        }
    }

    public static final class ClearAllSnapByFeatureType extends ainy {
        private final Factory<? extends PromotedStorySnapModel> promotedStorySnapModelFactory;

        public ClearAllSnapByFeatureType(pa paVar, Factory<? extends PromotedStorySnapModel> factory) {
            super(PromotedStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM PromotedStorySnap\nWHERE featureType = ?"));
            this.promotedStorySnapModelFactory = factory;
        }

        public final void bind(FeatureType featureType) {
            bindLong(1, ((Long) this.promotedStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class ClearPromotedSnapsOlderThanByFeatureType extends ainy {
        private final Factory<? extends PromotedStorySnapModel> promotedStorySnapModelFactory;

        public ClearPromotedSnapsOlderThanByFeatureType(pa paVar, Factory<? extends PromotedStorySnapModel> factory) {
            super(PromotedStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM PromotedStorySnap\nWHERE timestamp < ? AND featureType = ?"));
            this.promotedStorySnapModelFactory = factory;
        }

        public final void bind(long j, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.promotedStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class InsertPromotedStorySnap extends ainy {
        private final Factory<? extends PromotedStorySnapModel> promotedStorySnapModelFactory;

        public InsertPromotedStorySnap(pa paVar, Factory<? extends PromotedStorySnapModel> factory) {
            super(PromotedStorySnapModel.TABLE_NAME, paVar.a("INSERT INTO PromotedStorySnap(\n    snapId,\n    storyId,\n    storyRowId,\n    featureType,\n    mediaUrl,\n    mediaDurationMillis,\n    adSnapKey,\n    brandName,\n    headline,\n    adType,\n    timestamp,\n    politicalAdName)\nVALUES(?,?,?,?,?,?,?,?,?,?,?,?)"));
            this.promotedStorySnapModelFactory = factory;
        }

        public final void bind(String str, String str2, long j, FeatureType featureType, String str3, Long l, String str4, String str5, String str6, AdType adType, long j2, String str7) {
            bindString(1, str);
            bindString(2, str2);
            bindLong(3, j);
            bindLong(4, ((Long) this.promotedStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
            bindString(5, str3);
            if (l == null) {
                bindNull(6);
            } else {
                bindLong(6, l.longValue());
            }
            if (str4 == null) {
                bindNull(7);
            } else {
                bindString(7, str4);
            }
            if (str5 == null) {
                bindNull(8);
            } else {
                bindString(8, str5);
            }
            if (str6 == null) {
                bindNull(9);
            } else {
                bindString(9, str6);
            }
            if (adType == null) {
                bindNull(10);
            } else {
                bindLong(10, ((Long) this.promotedStorySnapModelFactory.adTypeAdapter.encode(adType)).longValue());
            }
            bindLong(11, j2);
            if (str7 == null) {
                bindNull(12);
            } else {
                bindString(12, str7);
            }
        }
    }

    public static final class UpdatePromotedStorySnap extends ainy {
        private final Factory<? extends PromotedStorySnapModel> promotedStorySnapModelFactory;

        public UpdatePromotedStorySnap(pa paVar, Factory<? extends PromotedStorySnapModel> factory) {
            super(PromotedStorySnapModel.TABLE_NAME, paVar.a("UPDATE PromotedStorySnap\nSET\n    storyId =?,\n    storyRowId =?,\n    mediaUrl =?,\n    mediaDurationMillis =?,\n    adSnapKey =?,\n    brandName =?,\n    headline =?,\n    adType =?,\n    timestamp =?,\n    politicalAdName =?\nWHERE\n    snapId =? AND featureType =?"));
            this.promotedStorySnapModelFactory = factory;
        }

        public final void bind(String str, long j, String str2, Long l, String str3, String str4, String str5, AdType adType, long j2, String str6, String str7, FeatureType featureType) {
            bindString(1, str);
            bindLong(2, j);
            bindString(3, str2);
            if (l == null) {
                bindNull(4);
            } else {
                bindLong(4, l.longValue());
            }
            if (str3 == null) {
                bindNull(5);
            } else {
                bindString(5, str3);
            }
            if (str4 == null) {
                bindNull(6);
            } else {
                bindString(6, str4);
            }
            if (str5 == null) {
                bindNull(7);
            } else {
                bindString(7, str5);
            }
            if (adType == null) {
                bindNull(8);
            } else {
                bindLong(8, ((Long) this.promotedStorySnapModelFactory.adTypeAdapter.encode(adType)).longValue());
            }
            bindLong(9, j2);
            if (str6 == null) {
                bindNull(10);
            } else {
                bindString(10, str6);
            }
            bindString(11, str7);
            bindLong(12, ((Long) this.promotedStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    long _id();

    String adSnapKey();

    AdType adType();

    String brandName();

    FeatureType featureType();

    String headline();

    Long mediaDurationMillis();

    String mediaUrl();

    String politicalAdName();

    String snapId();

    String storyId();

    long storyRowId();

    long timestamp();
}
