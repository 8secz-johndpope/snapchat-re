package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.DynamicSnapSource;
import com.snap.core.db.column.FeatureType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.gcp;
import defpackage.pa;
import defpackage.pc;

public interface DiscoverStorySnapModel {
    public static final String ADDDISPLAYNAME = "ALTER TABLE DiscoverStorySnap\nADD displayName TEXT";
    public static final String ADDDYNAMICSNAPSOURCE = "ALTER TABLE DiscoverStorySnap\nADD dynamicSnapSource INTEGER NOT NULL DEFAULT 0";
    public static final String ADDENCRYPTEDGEOLOGGINGDATACOLUMN = "ALTER TABLE DiscoverStorySnap\nADD encryptedGeoLoggingData TEXT";
    public static final String ADDFEATURETYPE = "ALTER TABLE DiscoverStorySnap\nADD featureType INTEGER NOT NULL DEFAULT 0";
    public static final String ADDFILTERIDCOLUMN = "ALTER TABLE DiscoverStorySnap\nADD filterId TEXT";
    public static final String ADDSHAREABLE = "ALTER TABLE DiscoverStorySnap\nADD shareable INTEGER NOT NULL DEFAULT 0";
    public static final String ADDSTORYFILTERIDCOLUMN = "ALTER TABLE DiscoverStorySnap\nADD storyFilterId TEXT";
    public static final String ADDSTREAMINGMEDIAIV = "ALTER TABLE DiscoverStorySnap\nADD streamingMediaIv TEXT";
    public static final String ADDSTREAMINGMEDIAKEY = "ALTER TABLE DiscoverStorySnap\nADD streamingMediaKey TEXT";
    public static final String ADDSTREAMINGMETADATAURL = "ALTER TABLE DiscoverStorySnap\nADD streamingMetadataUrl TEXT";
    public static final String ADDTHUMBNAILURL = "ALTER TABLE DiscoverStorySnap\nADD thumbnailUrl TEXT";
    public static final String ADDTIMESTAMP = "ALTER TABLE DiscoverStorySnap\nADD timestamp INTEGER NOT NULL DEFAULT 0";
    public static final String ADDUNLOCKABLESSNAPINFOCOLUMN = "ALTER TABLE DiscoverStorySnap\nADD unlockablesSnapInfo TEXT";
    public static final String ADDVENUEIDCOLUMN = "ALTER TABLE DiscoverStorySnap\nADD venueId TEXT";
    @Deprecated
    public static final String ATTACHMENTURL = "attachmentUrl";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS DiscoverStorySnap (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    rawSnapId TEXT NOT NULL,\n    creationTimestampMs INTEGER NOT NULL,\n    expirationTimestampMs INTEGER NOT NULL,\n    title TEXT,\n    subTitles TEXT,\n    attachmentUrl TEXT,\n    lensId TEXT,\n    snapSource TEXT,\n    hasSnappablesMetadata INTEGER DEFAULT 0 NOT NULL,\n\n     -- media info \n    mediaType INTEGER NOT NULL,\n    mediaId TEXT,\n    mediaUrl TEXT,\n    mediaKey TEXT,\n    mediaIv TEXT,\n    duration INTEGER NOT NULL,\n    isZipped INTEGER DEFAULT 0 NOT NULL,\n    isInfiniteDuration INTEGER DEFAULT 0  NOT NULL,\n\n     -- streaming media info \n    streamingMediaKey TEXT,\n    streamingMediaIv TEXT,\n    streamingMetadataUrl TEXT,\n    featureType INTEGER NOT NULL,\n    displayName TEXT,\n    timestamp INTEGER NOT NULL DEFAULT 0,\n    thumbnailUrl TEXT,\n    shareable INTEGER NOT NULL DEFAULT 0,\n    dynamicSnapSource INTEGER NOT NULL DEFAULT 0,\n\n     -- filter info \n    filterId TEXT,\n    storyFilterId TEXT,\n    venueId TEXT,\n    unlockablesSnapInfo TEXT,\n    encryptedGeoLoggingData TEXT,\n\n    UNIQUE (rawSnapId, featureType)\n)";
    @Deprecated
    public static final String CREATIONTIMESTAMPMS = "creationTimestampMs";
    @Deprecated
    public static final String DISPLAYNAME = "displayName";
    public static final String DROPALLDISCOVERSTORYSNAPS = "DROP TABLE IF EXISTS DiscoverStorySnap";
    @Deprecated
    public static final String DURATION = "duration";
    @Deprecated
    public static final String DYNAMICSNAPSOURCE = "dynamicSnapSource";
    @Deprecated
    public static final String ENCRYPTEDGEOLOGGINGDATA = "encryptedGeoLoggingData";
    @Deprecated
    public static final String EXPIRATIONTIMESTAMPMS = "expirationTimestampMs";
    @Deprecated
    public static final String FEATURETYPE = "featureType";
    @Deprecated
    public static final String FILTERID = "filterId";
    @Deprecated
    public static final String HASSNAPPABLESMETADATA = "hasSnappablesMetadata";
    @Deprecated
    public static final String ISINFINITEDURATION = "isInfiniteDuration";
    @Deprecated
    public static final String ISZIPPED = "isZipped";
    @Deprecated
    public static final String LENSID = "lensId";
    @Deprecated
    public static final String MEDIAID = "mediaId";
    @Deprecated
    public static final String MEDIAIV = "mediaIv";
    @Deprecated
    public static final String MEDIAKEY = "mediaKey";
    @Deprecated
    public static final String MEDIATYPE = "mediaType";
    @Deprecated
    public static final String MEDIAURL = "mediaUrl";
    @Deprecated
    public static final String RAWSNAPID = "rawSnapId";
    @Deprecated
    public static final String SHAREABLE = "shareable";
    @Deprecated
    public static final String SNAPSOURCE = "snapSource";
    @Deprecated
    public static final String STORYFILTERID = "storyFilterId";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String STREAMINGMEDIAIV = "streamingMediaIv";
    @Deprecated
    public static final String STREAMINGMEDIAKEY = "streamingMediaKey";
    @Deprecated
    public static final String STREAMINGMETADATAURL = "streamingMetadataUrl";
    @Deprecated
    public static final String SUBTITLES = "subTitles";
    @Deprecated
    public static final String TABLE_NAME = "DiscoverStorySnap";
    @Deprecated
    public static final String THUMBNAILURL = "thumbnailUrl";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String TITLE = "title";
    @Deprecated
    public static final String UNLOCKABLESSNAPINFO = "unlockablesSnapInfo";
    @Deprecated
    public static final String VENUEID = "venueId";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends DiscoverStorySnapModel> {
        T create(long j, String str, long j2, String str2, long j3, long j4, String str3, String str4, String str5, String str6, String str7, boolean z, gcp gcp, String str8, String str9, String str10, String str11, long j5, boolean z2, boolean z3, String str12, String str13, String str14, FeatureType featureType, String str15, long j6, String str16, boolean z4, DynamicSnapSource dynamicSnapSource, String str17, String str18, String str19, String str20, String str21);
    }

    public static final class Factory<T extends DiscoverStorySnapModel> {
        public final Creator<T> creator;
        public final ainu<DynamicSnapSource, Long> dynamicSnapSourceAdapter;
        public final ainu<FeatureType, Long> featureTypeAdapter;
        public final ainu<gcp, Long> mediaTypeAdapter;

        final class DeleteDiscoverSnapByStoryQuery extends ainx {
            private final FeatureType featureType;
            private final long[] storyRowId;

            DeleteDiscoverSnapByStoryQuery(FeatureType featureType, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM DiscoverStorySnap\nWHERE\nfeatureType = ?1\nAND storyRowId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(DiscoverStorySnapModel.TABLE_NAME));
                this.featureType = featureType;
                this.storyRowId = jArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                long[] jArr = this.storyRowId;
                int length = jArr.length;
                int i = 2;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetNextDiscoverStorySnapIdQuery extends ainx {
            private final Object arg4;
            private final long expirationTimestampMs;
            private final FeatureType featureType;
            private final long storyRowId;

            GetNextDiscoverStorySnapIdQuery(long j, FeatureType featureType, long j2, Object obj) {
                super("SELECT\n    rawSnapId\nFROM DiscoverStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.rawSnapId = V.snapId AND V.type = 2)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    expirationTimestampMs > ?3 AND\n    V.snapId IS NULL\nORDER BY ?4", new aioa(DiscoverStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.expirationTimestampMs = j2;
                this.arg4 = obj;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                pcVar.bindLong(3, this.expirationTimestampMs);
                Object obj = this.arg4;
                if (obj == null) {
                    pcVar.bindNull(4);
                } else if (obj instanceof String) {
                    pcVar.bindString(4, (String) obj);
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                    pcVar.bindLong(4, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    pcVar.bindLong(4, ((Boolean) obj).booleanValue() ? 0 : 1);
                } else if (obj instanceof byte[]) {
                    pcVar.bindBlob(4, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    pcVar.bindDouble(4, ((Double) obj).doubleValue());
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg4");
                }
            }
        }

        final class GetStorySnapByIdQuery extends ainx {
            private final long _id;

            GetStorySnapByIdQuery(long j) {
                super("SELECT *\nFROM DiscoverStorySnap\nWHERE _id = ?1", new aioa(DiscoverStorySnapModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetStorySnapsByStoryIdQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            GetStorySnapsByStoryIdQuery(long j, FeatureType featureType) {
                super("SELECT *\nFROM DiscoverStorySnap\nWHERE storyRowId =?1 AND featureType =?2", new aioa(DiscoverStorySnapModel.TABLE_NAME));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class GetUnviewedDiscoverStorySnapCountQuery extends ainx {
            private final long expirationTimestampMs;
            private final FeatureType featureType;
            private final long storyRowId;

            GetUnviewedDiscoverStorySnapCountQuery(long j, FeatureType featureType, long j2) {
                super("SELECT\n    COUNT(*)\nFROM DiscoverStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.rawSnapId = V.snapId AND V.type = 2)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    expirationTimestampMs > ?3 AND\n    V.snapId IS NULL", new aioa(DiscoverStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.expirationTimestampMs = j2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                pcVar.bindLong(3, this.expirationTimestampMs);
            }
        }

        final class PlayableStorySnapsQuery extends ainx {
            private final Object arg4;
            private final long expirationTimestampMs;
            private final FeatureType featureType;
            private final long storyRowId;

            PlayableStorySnapsQuery(long j, FeatureType featureType, long j2, Object obj) {
                super("SELECT\n    S._id,\n    S.storyId,\n    S.storyRowId,\n    rawSnapId,\n    creationTimestampMs,\n    title,\n    subTitles,\n    attachmentUrl,\n    lensId,\n    mediaType,\n    mediaId,\n    mediaUrl,\n    mediaKey,\n    mediaIv,\n    streamingMetadataUrl,\n    streamingMediaKey,\n    streamingMediaIv,\n    duration,\n    isZipped,\n    isInfiniteDuration,\n    V.viewStartTimestampMillis AS lastView,\n    displayName,\n    thumbnailUrl,\n    expirationTimestampMs,\n    shareable,\n    dynamicSnapSource,\n    filterId,\n    storyFilterId,\n    venueId,\n    unlockablesSnapInfo,\n    encryptedGeoLoggingData\nFROM DiscoverStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.rawSnapId = V.snapId AND V.type = 2)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    expirationTimestampMs > ?3\nORDER BY ?4", new aioa(DiscoverStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.expirationTimestampMs = j2;
                this.arg4 = obj;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                pcVar.bindLong(3, this.expirationTimestampMs);
                Object obj = this.arg4;
                if (obj == null) {
                    pcVar.bindNull(4);
                } else if (obj instanceof String) {
                    pcVar.bindString(4, (String) obj);
                } else if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                    pcVar.bindLong(4, ((Long) obj).longValue());
                } else if (obj instanceof Boolean) {
                    pcVar.bindLong(4, ((Boolean) obj).booleanValue() ? 0 : 1);
                } else if (obj instanceof byte[]) {
                    pcVar.bindBlob(4, (byte[]) obj);
                } else if ((obj instanceof Float) || (obj instanceof Double)) {
                    pcVar.bindDouble(4, ((Double) obj).doubleValue());
                } else {
                    throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg4");
                }
            }
        }

        final class PrefetchStorySnapsQuery extends ainx {
            private final Object arg4;
            private final long arg5;
            private final long expirationTimestampMs;
            private final FeatureType featureType;
            private final long storyRowId;

            PrefetchStorySnapsQuery(long j, FeatureType featureType, long j2, Object obj, long j3) {
                super("SELECT\n    S._id,\n    streamingMetadataUrl,\n    V.viewStartTimestampMillis AS lastView,\n    creationTimestampMs\nFROM DiscoverStorySnap AS S\nLEFT OUTER JOIN PlaybackSnapView AS V ON (S.rawSnapId = V.snapId AND V.type = 2)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    expirationTimestampMs > ?3\nORDER BY ?4\nLIMIT ?5", new aioa(DiscoverStorySnapModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.expirationTimestampMs = j2;
                this.arg4 = obj;
                this.arg5 = j3;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                pcVar.bindLong(3, this.expirationTimestampMs);
                Object obj = this.arg4;
                if (obj == null) {
                    pcVar.bindNull(4);
                } else if (obj instanceof String) {
                    pcVar.bindString(4, (String) obj);
                } else {
                    long longValue;
                    if ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short)) {
                        longValue = ((Long) obj).longValue();
                    } else if (obj instanceof Boolean) {
                        longValue = ((Boolean) obj).booleanValue() ? 0 : 1;
                    } else if (obj instanceof byte[]) {
                        pcVar.bindBlob(4, (byte[]) obj);
                    } else if ((obj instanceof Float) || (obj instanceof Double)) {
                        pcVar.bindDouble(4, ((Double) obj).doubleValue());
                    } else {
                        throw new IllegalArgumentException("Attempting to bind an object that is not one of String, Integer, Short, Long, Float, Double, Boolean, or byte[] to argument arg4");
                    }
                    pcVar.bindLong(4, longValue);
                }
                pcVar.bindLong(5, this.arg5);
            }
        }

        final class StoryMediaInfoQuery extends ainx {
            private final long _id;
            private final FeatureType featureType;

            StoryMediaInfoQuery(long j, FeatureType featureType) {
                super("SELECT\n    rawSnapId,\n    mediaType,\n    mediaId,\n    mediaUrl,\n    mediaKey,\n    mediaIv,\n    streamingMetadataUrl,\n    streamingMediaKey,\n    streamingMediaIv\nFROM DiscoverStorySnap\nWHERE\n    _id = ?1 AND\n    featureType = ?2", new aioa(DiscoverStorySnapModel.TABLE_NAME));
                this._id = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        public Factory(Creator<T> creator, ainu<gcp, Long> ainu, ainu<FeatureType, Long> ainu2, ainu<DynamicSnapSource, Long> ainu3) {
            this.creator = creator;
            this.mediaTypeAdapter = ainu;
            this.featureTypeAdapter = ainu2;
            this.dynamicSnapSourceAdapter = ainu3;
        }

        public final ainx deleteDiscoverSnapByStory(FeatureType featureType, long[] jArr) {
            return new DeleteDiscoverSnapByStoryQuery(featureType, jArr);
        }

        public final ainx getNextDiscoverStorySnapId(long j, FeatureType featureType, long j2, Object obj) {
            return new GetNextDiscoverStorySnapIdQuery(j, featureType, j2, obj);
        }

        public final ainw<String> getNextDiscoverStorySnapIdMapper() {
            return new ainw<String>() {
                public String map(Cursor cursor) {
                    return cursor.getString(0);
                }
            };
        }

        public final ainx getStorySnapById(long j) {
            return new GetStorySnapByIdQuery(j);
        }

        public final Mapper<T> getStorySnapByIdMapper() {
            return new Mapper(this);
        }

        public final ainx getStorySnapsByStoryId(long j, FeatureType featureType) {
            return new GetStorySnapsByStoryIdQuery(j, featureType);
        }

        public final Mapper<T> getStorySnapsByStoryIdMapper() {
            return new Mapper(this);
        }

        public final ainx getUnviewedDiscoverStorySnapCount(long j, FeatureType featureType, long j2) {
            return new GetUnviewedDiscoverStorySnapCountQuery(j, featureType, j2);
        }

        public final ainw<Long> getUnviewedDiscoverStorySnapCountMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx playableStorySnaps(long j, FeatureType featureType, long j2, Object obj) {
            return new PlayableStorySnapsQuery(j, featureType, j2, obj);
        }

        public final <R extends PlayableStorySnapsModel> PlayableStorySnapsMapper<R, T> playableStorySnapsMapper(PlayableStorySnapsCreator<R> playableStorySnapsCreator) {
            return new PlayableStorySnapsMapper(playableStorySnapsCreator, this);
        }

        public final ainx prefetchStorySnaps(long j, FeatureType featureType, long j2, Object obj, long j3) {
            return new PrefetchStorySnapsQuery(j, featureType, j2, obj, j3);
        }

        public final <R extends PrefetchStorySnapsModel> PrefetchStorySnapsMapper<R> prefetchStorySnapsMapper(PrefetchStorySnapsCreator<R> prefetchStorySnapsCreator) {
            return new PrefetchStorySnapsMapper(prefetchStorySnapsCreator);
        }

        public final ainx storyMediaInfo(long j, FeatureType featureType) {
            return new StoryMediaInfoQuery(j, featureType);
        }

        public final <R extends StoryMediaInfoModel> StoryMediaInfoMapper<R, T> storyMediaInfoMapper(StoryMediaInfoCreator<R> storyMediaInfoCreator) {
            return new StoryMediaInfoMapper(storyMediaInfoCreator, this);
        }
    }

    public interface PlayableStorySnapsCreator<T extends PlayableStorySnapsModel> {
        T create(long j, String str, long j2, String str2, long j3, String str3, String str4, String str5, String str6, gcp gcp, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j4, boolean z, boolean z2, Long l, String str14, String str15, long j5, boolean z3, DynamicSnapSource dynamicSnapSource, String str16, String str17, String str18, String str19, String str20);
    }

    public interface PlayableStorySnapsModel {
        long _id();

        String attachmentUrl();

        long creationTimestampMs();

        String displayName();

        long duration();

        DynamicSnapSource dynamicSnapSource();

        String encryptedGeoLoggingData();

        long expirationTimestampMs();

        String filterId();

        boolean isInfiniteDuration();

        boolean isZipped();

        Long lastView();

        String lensId();

        String mediaId();

        String mediaIv();

        String mediaKey();

        gcp mediaType();

        String mediaUrl();

        String rawSnapId();

        boolean shareable();

        String storyFilterId();

        String storyId();

        long storyRowId();

        String streamingMediaIv();

        String streamingMediaKey();

        String streamingMetadataUrl();

        String subTitles();

        String thumbnailUrl();

        String title();

        String unlockablesSnapInfo();

        String venueId();
    }

    public interface PrefetchStorySnapsCreator<T extends PrefetchStorySnapsModel> {
        T create(long j, String str, Long l, long j2);
    }

    public interface PrefetchStorySnapsModel {
        long _id();

        long creationTimestampMs();

        Long lastView();

        String streamingMetadataUrl();
    }

    public interface StoryMediaInfoCreator<T extends StoryMediaInfoModel> {
        T create(String str, gcp gcp, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public interface StoryMediaInfoModel {
        String mediaId();

        String mediaIv();

        String mediaKey();

        gcp mediaType();

        String mediaUrl();

        String rawSnapId();

        String streamingMediaIv();

        String streamingMediaKey();

        String streamingMetadataUrl();
    }

    public static final class Mapper<T extends DiscoverStorySnapModel> implements ainw<T> {
        private final Factory<T> discoverStorySnapModelFactory;

        public Mapper(Factory<T> factory) {
            this.discoverStorySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            Creator creator = this.discoverStorySnapModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            long j2 = cursor2.getLong(2);
            String string2 = cursor2.getString(3);
            long j3 = cursor2.getLong(4);
            long j4 = cursor2.getLong(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            String string4 = cursor2.isNull(7) ? null : cursor2.getString(7);
            String string5 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string6 = cursor2.isNull(9) ? null : cursor2.getString(9);
            String string7 = cursor2.isNull(10) ? null : cursor2.getString(10);
            String str = string4;
            boolean z = cursor2.getInt(11) == 1;
            gcp gcp = (gcp) this.discoverStorySnapModelFactory.mediaTypeAdapter.decode(Long.valueOf(cursor2.getLong(12)));
            String string8 = cursor2.isNull(13) ? null : cursor2.getString(13);
            String string9 = cursor2.isNull(14) ? null : cursor2.getString(14);
            String string10 = cursor2.isNull(15) ? null : cursor2.getString(15);
            String string11 = cursor2.isNull(16) ? null : cursor2.getString(16);
            long j5 = cursor2.getLong(17);
            gcp gcp2 = gcp;
            boolean z2 = cursor2.getInt(18) == 1;
            boolean z3 = cursor2.getInt(19) == 1;
            String string12 = cursor2.isNull(20) ? null : cursor2.getString(20);
            String string13 = cursor2.isNull(21) ? null : cursor2.getString(21);
            String string14 = cursor2.isNull(22) ? null : cursor2.getString(22);
            boolean z4 = z3;
            FeatureType featureType = (FeatureType) this.discoverStorySnapModelFactory.featureTypeAdapter.decode(Long.valueOf(cursor2.getLong(23)));
            String string15 = cursor2.isNull(24) ? null : cursor2.getString(24);
            long j6 = cursor2.getLong(25);
            String string16 = cursor2.isNull(26) ? null : cursor2.getString(26);
            FeatureType featureType2 = featureType;
            z3 = true;
            if (cursor2.getInt(27) != 1) {
                z3 = false;
            }
            return creator.create(j, string, j2, string2, j3, j4, string3, str, string5, string6, string7, z, gcp2, string8, string9, string10, string11, j5, z2, z4, string12, string13, string14, featureType2, string15, j6, string16, z3, (DynamicSnapSource) this.discoverStorySnapModelFactory.dynamicSnapSourceAdapter.decode(Long.valueOf(cursor2.getLong(28))), cursor2.isNull(29) ? null : cursor2.getString(29), cursor2.isNull(30) ? null : cursor2.getString(30), cursor2.isNull(31) ? null : cursor2.getString(31), cursor2.isNull(32) ? null : cursor2.getString(32), cursor2.isNull(33) ? null : cursor2.getString(33));
        }
    }

    public static final class PlayableStorySnapsMapper<T extends PlayableStorySnapsModel, T1 extends DiscoverStorySnapModel> implements ainw<T> {
        private final PlayableStorySnapsCreator<T> creator;
        private final Factory<T1> discoverStorySnapModelFactory;

        public PlayableStorySnapsMapper(PlayableStorySnapsCreator<T> playableStorySnapsCreator, Factory<T1> factory) {
            this.creator = playableStorySnapsCreator;
            this.discoverStorySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getString(1), cursor2.getLong(2), cursor2.getString(3), cursor2.getLong(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : cursor2.getString(7), cursor2.isNull(8) ? null : cursor2.getString(8), (gcp) this.discoverStorySnapModelFactory.mediaTypeAdapter.decode(Long.valueOf(cursor2.getLong(9))), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : cursor2.getString(11), cursor2.isNull(12) ? null : cursor2.getString(12), cursor2.isNull(13) ? null : cursor2.getString(13), cursor2.isNull(14) ? null : cursor2.getString(14), cursor2.isNull(15) ? null : cursor2.getString(15), cursor2.isNull(16) ? null : cursor2.getString(16), cursor2.getLong(17), cursor2.getInt(18) == 1, cursor2.getInt(19) == 1, cursor2.isNull(20) ? null : Long.valueOf(cursor2.getLong(20)), cursor2.isNull(21) ? null : cursor2.getString(21), cursor2.isNull(22) ? null : cursor2.getString(22), cursor2.getLong(23), cursor2.getInt(24) == 1, (DynamicSnapSource) this.discoverStorySnapModelFactory.dynamicSnapSourceAdapter.decode(Long.valueOf(cursor2.getLong(25))), cursor2.isNull(26) ? null : cursor2.getString(26), cursor2.isNull(27) ? null : cursor2.getString(27), cursor2.isNull(28) ? null : cursor2.getString(28), cursor2.isNull(29) ? null : cursor2.getString(29), cursor2.isNull(30) ? null : cursor2.getString(30));
        }
    }

    public static final class PrefetchStorySnapsMapper<T extends PrefetchStorySnapsModel> implements ainw<T> {
        private final PrefetchStorySnapsCreator<T> creator;

        public PrefetchStorySnapsMapper(PrefetchStorySnapsCreator<T> prefetchStorySnapsCreator) {
            this.creator = prefetchStorySnapsCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1), cursor.isNull(2) ? null : Long.valueOf(cursor.getLong(2)), cursor.getLong(3));
        }
    }

    public static final class StoryMediaInfoMapper<T extends StoryMediaInfoModel, T1 extends DiscoverStorySnapModel> implements ainw<T> {
        private final StoryMediaInfoCreator<T> creator;
        private final Factory<T1> discoverStorySnapModelFactory;

        public StoryMediaInfoMapper(StoryMediaInfoCreator<T> storyMediaInfoCreator, Factory<T1> factory) {
            this.creator = storyMediaInfoCreator;
            this.discoverStorySnapModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), (gcp) this.discoverStorySnapModelFactory.mediaTypeAdapter.decode(Long.valueOf(cursor.getLong(1))), cursor.isNull(2) ? null : cursor.getString(2), cursor.isNull(3) ? null : cursor.getString(3), cursor.isNull(4) ? null : cursor.getString(4), cursor.isNull(5) ? null : cursor.getString(5), cursor.isNull(6) ? null : cursor.getString(6), cursor.isNull(7) ? null : cursor.getString(7), cursor.isNull(8) ? null : cursor.getString(8));
        }
    }

    public static final class CleanupSnapsOlderThan extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public CleanupSnapsOlderThan(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverStorySnap\nWHERE  (timestamp < ? OR expirationTimestampMs < ?) AND featureType = ?"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(long j, long j2, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, j2);
            bindLong(3, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class ClearAll extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public ClearAll(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverStorySnap\nWHERE featureType = ?"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(FeatureType featureType) {
            bindLong(1, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class ClearExpiredSnaps extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public ClearExpiredSnaps(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverStorySnap\nWHERE\n    expirationTimestampMs <= ? AND\n    featureType = ?"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(long j, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class DeleteDiscoverSnapById extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public DeleteDiscoverSnapById(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverStorySnap\nWHERE\n    rawSnapId = ? AND\n    featureType = ?"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(String str, FeatureType featureType) {
            bindString(1, str);
            bindLong(2, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class InsertDiscoverStorySnap extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public InsertDiscoverStorySnap(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("INSERT INTO DiscoverStorySnap(\n    storyId,\n    storyRowId,\n    rawSnapId,\n    creationTimestampMs,\n    expirationTimestampMs,\n    title,\n    subTitles,\n    attachmentUrl,\n    lensId,\n    snapSource,\n    hasSnappablesMetadata,\n    timestamp,\n    featureType,\n\n     -- media info \n    mediaType,\n    mediaId,\n    mediaUrl,\n    mediaKey,\n    mediaIv,\n    duration,\n    isZipped,\n    isInfiniteDuration,\n\n     -- streaming media info\n    streamingMediaKey,\n    streamingMediaIv,\n    streamingMetadataUrl,\n    displayName,\n    thumbnailUrl,\n    shareable,\n    dynamicSnapSource,\n\n     -- filter info \n    filterId,\n    storyFilterId,\n    venueId,\n    unlockablesSnapInfo,\n    encryptedGeoLoggingData)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(String str, long j, String str2, long j2, long j3, String str3, String str4, String str5, String str6, String str7, boolean z, long j4, FeatureType featureType, gcp gcp, String str8, String str9, String str10, String str11, long j5, boolean z2, boolean z3, String str12, String str13, String str14, String str15, String str16, boolean z4, DynamicSnapSource dynamicSnapSource, String str17, String str18, String str19, String str20, String str21) {
            String str22 = str3;
            String str23 = str4;
            String str24 = str5;
            String str25 = str6;
            String str26 = str7;
            String str27 = str8;
            String str28 = str9;
            String str29 = str10;
            String str30 = str11;
            String str31 = str12;
            String str32 = str13;
            String str33 = str14;
            String str34 = str15;
            String str35 = str16;
            String str36 = str17;
            bindString(1, str);
            bindLong(2, j);
            bindString(3, str2);
            bindLong(4, j2);
            bindLong(5, j3);
            if (str22 == null) {
                bindNull(6);
            } else {
                bindString(6, str22);
            }
            if (str23 == null) {
                bindNull(7);
            } else {
                bindString(7, str23);
            }
            if (str24 == null) {
                bindNull(8);
            } else {
                bindString(8, str24);
            }
            if (str25 == null) {
                bindNull(9);
            } else {
                bindString(9, str25);
            }
            if (str26 == null) {
                bindNull(10);
            } else {
                bindString(10, str26);
            }
            long j6 = 1;
            bindLong(11, z ? 1 : 0);
            bindLong(12, j4);
            bindLong(13, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
            bindLong(14, ((Long) this.discoverStorySnapModelFactory.mediaTypeAdapter.encode(gcp)).longValue());
            if (str27 == null) {
                bindNull(15);
            } else {
                bindString(15, str27);
            }
            if (str28 == null) {
                bindNull(16);
            } else {
                bindString(16, str28);
            }
            if (str29 == null) {
                bindNull(17);
            } else {
                bindString(17, str29);
            }
            if (str30 == null) {
                bindNull(18);
            } else {
                bindString(18, str30);
            }
            bindLong(19, j5);
            bindLong(20, z2 ? 1 : 0);
            bindLong(21, z3 ? 1 : 0);
            if (str31 == null) {
                bindNull(22);
            } else {
                bindString(22, str31);
            }
            if (str32 == null) {
                bindNull(23);
            } else {
                bindString(23, str32);
            }
            str27 = str14;
            if (str27 == null) {
                bindNull(24);
            } else {
                bindString(24, str27);
            }
            str27 = str15;
            if (str27 == null) {
                bindNull(25);
            } else {
                bindString(25, str27);
            }
            str22 = str16;
            if (str22 == null) {
                bindNull(26);
            } else {
                bindString(26, str22);
            }
            if (!z4) {
                j6 = 0;
            }
            bindLong(27, j6);
            bindLong(28, ((Long) this.discoverStorySnapModelFactory.dynamicSnapSourceAdapter.encode(dynamicSnapSource)).longValue());
            str22 = str17;
            if (str22 == null) {
                bindNull(29);
            } else {
                bindString(29, str22);
            }
            str22 = str18;
            if (str22 == null) {
                bindNull(30);
            } else {
                bindString(30, str22);
            }
            str22 = str19;
            if (str22 == null) {
                bindNull(31);
            } else {
                bindString(31, str22);
            }
            str22 = str20;
            if (str22 == null) {
                bindNull(32);
            } else {
                bindString(32, str22);
            }
            str22 = str21;
            if (str22 == null) {
                bindNull(33);
            } else {
                bindString(33, str22);
            }
        }
    }

    public static final class UpdateDiscoverStorySnap extends ainy {
        private final Factory<? extends DiscoverStorySnapModel> discoverStorySnapModelFactory;

        public UpdateDiscoverStorySnap(pa paVar, Factory<? extends DiscoverStorySnapModel> factory) {
            super(DiscoverStorySnapModel.TABLE_NAME, paVar.a("UPDATE DiscoverStorySnap\nSET creationTimestampMs =?,\n    expirationTimestampMs =?,\n    title =?,\n    subTitles =?,\n    attachmentUrl =?,\n    lensId =?,\n    snapSource =?,\n    hasSnappablesMetadata =?,\n    mediaType =?,\n    mediaId =?,\n    mediaUrl =?,\n    mediaKey =?,\n    mediaIv =?,\n    duration =?,\n    isZipped =?,\n    isInfiniteDuration =?,\n    storyId =?,\n    storyRowId =?,\n    timestamp =?,\n    filterId =?,\n    storyFilterId =?,\n    venueId =?,\n    unlockablesSnapInfo =?,\n    encryptedGeoLoggingData =?\nWHERE\n    rawSnapId = ? AND\n    featureType = ?"));
            this.discoverStorySnapModelFactory = factory;
        }

        public final void bind(long j, long j2, String str, String str2, String str3, String str4, String str5, boolean z, gcp gcp, String str6, String str7, String str8, String str9, long j3, boolean z2, boolean z3, String str10, long j4, long j5, String str11, String str12, String str13, String str14, String str15, String str16, FeatureType featureType) {
            String str17 = str;
            String str18 = str2;
            String str19 = str3;
            String str20 = str4;
            String str21 = str5;
            String str22 = str6;
            String str23 = str7;
            String str24 = str8;
            String str25 = str9;
            String str26 = str11;
            String str27 = str12;
            String str28 = str13;
            String str29 = str14;
            String str30 = str15;
            bindLong(1, j);
            bindLong(2, j2);
            if (str17 == null) {
                bindNull(3);
            } else {
                bindString(3, str17);
            }
            if (str18 == null) {
                bindNull(4);
            } else {
                bindString(4, str18);
            }
            if (str19 == null) {
                bindNull(5);
            } else {
                bindString(5, str19);
            }
            if (str20 == null) {
                bindNull(6);
            } else {
                bindString(6, str20);
            }
            if (str21 == null) {
                bindNull(7);
            } else {
                bindString(7, str21);
            }
            long j6 = 1;
            bindLong(8, z ? 1 : 0);
            bindLong(9, ((Long) this.discoverStorySnapModelFactory.mediaTypeAdapter.encode(gcp)).longValue());
            if (str22 == null) {
                bindNull(10);
            } else {
                bindString(10, str22);
            }
            if (str23 == null) {
                bindNull(11);
            } else {
                bindString(11, str23);
            }
            if (str24 == null) {
                bindNull(12);
            } else {
                bindString(12, str24);
            }
            if (str25 == null) {
                bindNull(13);
            } else {
                bindString(13, str25);
            }
            bindLong(14, j3);
            bindLong(15, z2 ? 1 : 0);
            if (!z3) {
                j6 = 0;
            }
            bindLong(16, j6);
            bindString(17, str10);
            bindLong(18, j4);
            bindLong(19, j5);
            if (str26 == null) {
                bindNull(20);
            } else {
                bindString(20, str26);
            }
            if (str27 == null) {
                bindNull(21);
            } else {
                bindString(21, str27);
            }
            if (str28 == null) {
                bindNull(22);
            } else {
                bindString(22, str28);
            }
            str18 = str14;
            if (str18 == null) {
                bindNull(23);
            } else {
                bindString(23, str18);
            }
            str17 = str15;
            if (str17 == null) {
                bindNull(24);
            } else {
                bindString(24, str17);
            }
            bindString(25, str16);
            bindLong(26, ((Long) this.discoverStorySnapModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    long _id();

    String attachmentUrl();

    long creationTimestampMs();

    String displayName();

    long duration();

    DynamicSnapSource dynamicSnapSource();

    String encryptedGeoLoggingData();

    long expirationTimestampMs();

    FeatureType featureType();

    String filterId();

    boolean hasSnappablesMetadata();

    boolean isInfiniteDuration();

    boolean isZipped();

    String lensId();

    String mediaId();

    String mediaIv();

    String mediaKey();

    gcp mediaType();

    String mediaUrl();

    String rawSnapId();

    boolean shareable();

    String snapSource();

    String storyFilterId();

    String storyId();

    long storyRowId();

    String streamingMediaIv();

    String streamingMediaKey();

    String streamingMetadataUrl();

    String subTitles();

    String thumbnailUrl();

    long timestamp();

    String title();

    String unlockablesSnapInfo();

    String venueId();
}
