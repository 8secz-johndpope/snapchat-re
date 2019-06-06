package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeatureType;
import com.snap.core.db.column.PublisherPageSnapType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface PublisherSnapPageModel {
    public static final String ADDFEATURETYPE = "ALTER TABLE PublisherSnapPage\nADD featureType INTEGER NOT NULL DEFAULT 0";
    public static final String ADDPUBLISHERFORMALNAME = "ALTER TABLE PublisherSnapPage\nADD publisherFormalName TEXT";
    public static final String ADDPUBLISHERID = "ALTER TABLE PublisherSnapPage\nADD publisherId INTEGER NOT NULL DEFAULT 0";
    public static final String ADDPUBLISHTIMESTAMPMS = "ALTER TABLE PublisherSnapPage\nADD publishTimestampMs INTEGER";
    public static final String ADDTHUMBNAILURL = "ALTER TABLE PublisherSnapPage\nADD thumbnailUrl TEXT";
    public static final String ADDTILEBADGEBGCOLOR = "ALTER TABLE PublisherSnapPage\nADD tileBadgeBgColor INTEGER";
    public static final String ADDTILEBADGESIZE = "ALTER TABLE PublisherSnapPage\nADD tileBadgeSize INTEGER";
    public static final String ADDTILEBADGETEXTCOLOR = "ALTER TABLE PublisherSnapPage\nADD tileBadgeTextColor INTEGER";
    public static final String ADDTILEBADGETITLE = "ALTER TABLE PublisherSnapPage\nADD tileBadgeTitle TEXT";
    public static final String ADDTILEHEADLINE = "ALTER TABLE PublisherSnapPage\nADD tileHeadline TEXT";
    public static final String ADDTILEID = "ALTER TABLE PublisherSnapPage\nADD tileId TEXT";
    public static final String ADDTILEIMAGEURL = "ALTER TABLE PublisherSnapPage\nADD tileImageUrl TEXT";
    public static final String ADDTILEPROGRESS = "ALTER TABLE PublisherSnapPage\nADD tileProgress INTEGER";
    public static final String ADDTILESHOWSUBTITLE = "ALTER TABLE PublisherSnapPage\nADD tileShowSubtitle TEXT";
    public static final String ADDTIMESTAMP = "ALTER TABLE PublisherSnapPage\nADD timestamp INTEGER NOT NULL DEFAULT 0";
    @Deprecated
    public static final String ADTYPE = "adType";
    public static final String CREATEPUBLISHERSNAPPAGEINDEX = "CREATE INDEX IF NOT EXISTS publisher_snap_story_row_id ON PublisherSnapPage(storyRowId)";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS PublisherSnapPage (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    pageId INTEGER NOT NULL,\n    storyId TEXT NOT NULL,\n    storyRowId INTEGER NOT NULL,\n    editionId INTEGER NOT NULL,\n    publisherFormalName TEXT, -- display name --\n    publisherName TEXT, -- name index for linkability check --\n    snapType INTEGER NOT NULL,\n    url TEXT,\n    pageHash TEXT,\n    adType INTEGER,\n    -- Rich media info\n    swipeUpKey TEXT,\n    shareable  INTEGER DEFAULT 0 NOT NULL,\n    isAutoAdvance INTEGER DEFAULT 0 NOT NULL,\n    isSkippable INTEGER DEFAULT 0 NOT NULL,\n    slugType TEXT,\n\n    featureType INTEGER NOT NULL,\n    publishTimestampMs INTEGER,\n    thumbnailUrl TEXT,\n    timestamp INTEGER NOT NULL DEFAULT 0,\n    publisherId INTEGER NOT NULL DEFAULT 0,\n\n    -- tile info for logging and switching tiles\n    tileId TEXT,\n    tileImageUrl TEXT,\n    tileHeadline TEXT,\n    tileProgress INTEGER,\n    tileShowSubtitle TEXT,\n    tileBadgeSize INTEGER,\n    tileBadgeTitle TEXT,\n    tileBadgeBgColor INTEGER,\n    tileBadgeTextColor INTEGER,\n\n    UNIQUE (pageId, featureType)\n)";
    @Deprecated
    public static final String EDITIONID = "editionId";
    @Deprecated
    public static final String FEATURETYPE = "featureType";
    @Deprecated
    public static final String ISAUTOADVANCE = "isAutoAdvance";
    @Deprecated
    public static final String ISSKIPPABLE = "isSkippable";
    @Deprecated
    public static final String PAGEHASH = "pageHash";
    @Deprecated
    public static final String PAGEID = "pageId";
    @Deprecated
    public static final String PUBLISHERFORMALNAME = "publisherFormalName";
    @Deprecated
    public static final String PUBLISHERID = "publisherId";
    @Deprecated
    public static final String PUBLISHERNAME = "publisherName";
    @Deprecated
    public static final String PUBLISHTIMESTAMPMS = "publishTimestampMs";
    @Deprecated
    public static final String SHAREABLE = "shareable";
    @Deprecated
    public static final String SLUGTYPE = "slugType";
    @Deprecated
    public static final String SNAPTYPE = "snapType";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String STORYROWID = "storyRowId";
    @Deprecated
    public static final String SWIPEUPKEY = "swipeUpKey";
    @Deprecated
    public static final String TABLE_NAME = "PublisherSnapPage";
    @Deprecated
    public static final String THUMBNAILURL = "thumbnailUrl";
    @Deprecated
    public static final String TILEBADGEBGCOLOR = "tileBadgeBgColor";
    @Deprecated
    public static final String TILEBADGESIZE = "tileBadgeSize";
    @Deprecated
    public static final String TILEBADGETEXTCOLOR = "tileBadgeTextColor";
    @Deprecated
    public static final String TILEBADGETITLE = "tileBadgeTitle";
    @Deprecated
    public static final String TILEHEADLINE = "tileHeadline";
    @Deprecated
    public static final String TILEID = "tileId";
    @Deprecated
    public static final String TILEIMAGEURL = "tileImageUrl";
    @Deprecated
    public static final String TILEPROGRESS = "tileProgress";
    @Deprecated
    public static final String TILESHOWSUBTITLE = "tileShowSubtitle";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String URL = "url";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends PublisherSnapPageModel> {
        T create(long j, long j2, String str, long j3, long j4, String str2, String str3, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, String str6, boolean z, boolean z2, boolean z3, String str7, FeatureType featureType, Long l2, String str8, long j5, long j6, String str9, String str10, String str11, Long l3, String str12, Long l4, String str13, Long l5, Long l6);
    }

    public static final class Factory<T extends PublisherSnapPageModel> {
        public final Creator<T> creator;
        public final ainu<FeatureType, Long> featureTypeAdapter;
        public final ainu<PublisherPageSnapType, Long> snapTypeAdapter;

        final class GetNextSnapIdIgnoreAdsQuery extends ainx {
            private final FeatureType featureType;
            private final PublisherPageSnapType[] snapType;
            private final long storyRowId;

            GetNextSnapIdIgnoreAdsQuery(long j, FeatureType featureType, PublisherPageSnapType[] publisherPageSnapTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    S.pageId\nFROM PublisherSnapPage AS S\nLEFT OUTER JOIN PlaybackSnapView V ON (CAST(S.pageId AS TEXT) = V.snapId AND V.type = 1)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    snapType IN ");
                stringBuilder.append(ainz.a(publisherPageSnapTypeArr.length));
                stringBuilder.append(" AND\n    adType == 0 AND\n    V.snapId IS NULL");
                super(stringBuilder.toString(), new aioa(PublisherSnapPageModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.snapType = publisherPageSnapTypeArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                PublisherPageSnapType[] publisherPageSnapTypeArr = this.snapType;
                int length = publisherPageSnapTypeArr.length;
                int i = 3;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, ((Long) Factory.this.snapTypeAdapter.encode(publisherPageSnapTypeArr[i2])).longValue());
                    i2++;
                    i = i3;
                }
            }
        }

        final class GetPubisherSnapByIdQuery extends ainx {
            private final long _id;

            GetPubisherSnapByIdQuery(long j) {
                super("SELECT *\nFROM PublisherSnapPage\nWHERE _id = ?1", new aioa(PublisherSnapPageModel.TABLE_NAME));
                this._id = j;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this._id);
            }
        }

        final class GetPublisherSnapsByStoryIdQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            GetPublisherSnapsByStoryIdQuery(long j, FeatureType featureType) {
                super("SELECT *\nFROM PublisherSnapPage\nWHERE storyRowId =?1 AND featureType = ?2", new aioa(PublisherSnapPageModel.TABLE_NAME));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class GetUnviewedSnapCountIgnoreAdsQuery extends ainx {
            private final FeatureType featureType;
            private final PublisherPageSnapType[] snapType;
            private final long storyRowId;

            GetUnviewedSnapCountIgnoreAdsQuery(long j, FeatureType featureType, PublisherPageSnapType[] publisherPageSnapTypeArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    COUNT(*)\nFROM PublisherSnapPage AS S\nLEFT OUTER JOIN PlaybackSnapView V ON (CAST(S.pageId AS TEXT) = V.snapId AND V.type = 1)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2 AND\n    snapType IN ");
                stringBuilder.append(ainz.a(publisherPageSnapTypeArr.length));
                stringBuilder.append(" AND\n    adType == 0 AND\n    V.snapId IS NULL");
                super(stringBuilder.toString(), new aioa(PublisherSnapPageModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.snapType = publisherPageSnapTypeArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                PublisherPageSnapType[] publisherPageSnapTypeArr = this.snapType;
                int length = publisherPageSnapTypeArr.length;
                int i = 3;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, ((Long) Factory.this.snapTypeAdapter.encode(publisherPageSnapTypeArr[i2])).longValue());
                    i2++;
                    i = i3;
                }
            }
        }

        final class PageMediaInfoQuery extends ainx {
            private final FeatureType featureType;
            private final long pageId;

            PageMediaInfoQuery(long j, FeatureType featureType) {
                super("SELECT\n    _id,\n    url\nFROM PublisherSnapPage\nWHERE\n    pageId = ?1 AND\n    featureType = ?2", new aioa(PublisherSnapPageModel.TABLE_NAME));
                this.pageId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.pageId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class PlayablePagesQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            PlayablePagesQuery(long j, FeatureType featureType) {
                super("SELECT\n    S._id,\n    S.pageId,\n    S.storyId,\n    S.storyRowId,\n    editionId ,\n    publisherFormalName,\n    publisherName,\n    publisherId,\n    snapType,\n    url,\n    pageHash,\n    adType,\n    V.viewStartTimestampMillis AS lastView,\n    publishTimestampMs,\n    thumbnailUrl\nFROM PublisherSnapPage S\nLEFT OUTER JOIN PlaybackSnapView V ON (CAST(S.pageId AS TEXT) = V.snapId AND V.type = 1)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2\nORDER BY S._id", new aioa(PublisherSnapPageModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class PrefetchPublisherSnapsQuery extends ainx {
            private final long arg3;
            private final FeatureType featureType;
            private final long storyRowId;

            PrefetchPublisherSnapsQuery(long j, FeatureType featureType, long j2) {
                super("SELECT\n    S.pageId,\n    publishTimestampMs,\n    V.viewStartTimestampMillis AS lastView\nFROM PublisherSnapPage S\nLEFT OUTER JOIN PlaybackSnapView V ON (CAST(S.pageId AS TEXT) = V.snapId AND V.type = 1)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2\nLIMIT ?3", new aioa(PublisherSnapPageModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
                this.arg3 = j2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                pcVar.bindLong(3, this.arg3);
            }
        }

        final class RichMediaInfoQuery extends ainx {
            private final FeatureType featureType;
            private final long pageId;

            RichMediaInfoQuery(long j, FeatureType featureType) {
                super("SELECT\n    swipeUpKey,\n    shareable,\n    isAutoAdvance,\n    isSkippable,\n    slugType\nFROM PublisherSnapPage\nWHERE\n    pageId = ?1 AND\n    featureType = ?2", new aioa(PublisherSnapPageModel.TABLE_NAME));
                this.pageId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.pageId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class SnapTileInfoQuery extends ainx {
            private final FeatureType featureType;
            private final long storyRowId;

            SnapTileInfoQuery(long j, FeatureType featureType) {
                super("SELECT\n    S._id,\n    S.pageId,\n    S.tileId,\n    S.tileImageUrl,\n    S.tileHeadline,\n    S.tileProgress,\n    S.tileShowSubtitle,\n    S.tileBadgeSize,\n    S.tileBadgeTitle,\n    S.tileBadgeBgColor,\n    S.tileBadgeTextColor,\n    V.viewStartTimestampMillis AS lastView\nFROM PublisherSnapPage S\nLEFT OUTER JOIN PlaybackSnapView V ON (CAST(S.pageId AS TEXT) = V.snapId AND V.type = 1)\nWHERE\n    S.storyRowId = ?1 AND\n    featureType = ?2\nORDER BY S._id", new aioa(PublisherSnapPageModel.TABLE_NAME, "PlaybackSnapView"));
                this.storyRowId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.storyRowId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class StoryInfoQuery extends ainx {
            private final FeatureType featureType;
            private final long pageId;

            StoryInfoQuery(long j, FeatureType featureType) {
                super("SELECT\n    _id,\n    storyId,\n    storyRowId\nFROM PublisherSnapPage\nWHERE pageId = ?1 AND featureType = ?2", new aioa(PublisherSnapPageModel.TABLE_NAME));
                this.pageId = j;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, this.pageId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        public Factory(Creator<T> creator, ainu<PublisherPageSnapType, Long> ainu, ainu<FeatureType, Long> ainu2) {
            this.creator = creator;
            this.snapTypeAdapter = ainu;
            this.featureTypeAdapter = ainu2;
        }

        public final ainx getNextSnapIdIgnoreAds(long j, FeatureType featureType, PublisherPageSnapType[] publisherPageSnapTypeArr) {
            return new GetNextSnapIdIgnoreAdsQuery(j, featureType, publisherPageSnapTypeArr);
        }

        public final ainw<Long> getNextSnapIdIgnoreAdsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getPubisherSnapById(long j) {
            return new GetPubisherSnapByIdQuery(j);
        }

        public final Mapper<T> getPubisherSnapByIdMapper() {
            return new Mapper(this);
        }

        public final ainx getPublisherSnapsByStoryId(long j, FeatureType featureType) {
            return new GetPublisherSnapsByStoryIdQuery(j, featureType);
        }

        public final Mapper<T> getPublisherSnapsByStoryIdMapper() {
            return new Mapper(this);
        }

        public final ainx getUnviewedSnapCountIgnoreAds(long j, FeatureType featureType, PublisherPageSnapType[] publisherPageSnapTypeArr) {
            return new GetUnviewedSnapCountIgnoreAdsQuery(j, featureType, publisherPageSnapTypeArr);
        }

        public final ainw<Long> getUnviewedSnapCountIgnoreAdsMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx pageMediaInfo(long j, FeatureType featureType) {
            return new PageMediaInfoQuery(j, featureType);
        }

        public final <R extends PageMediaInfoModel> PageMediaInfoMapper<R> pageMediaInfoMapper(PageMediaInfoCreator<R> pageMediaInfoCreator) {
            return new PageMediaInfoMapper(pageMediaInfoCreator);
        }

        public final ainx playablePages(long j, FeatureType featureType) {
            return new PlayablePagesQuery(j, featureType);
        }

        public final <R extends PlayablePagesModel> PlayablePagesMapper<R, T> playablePagesMapper(PlayablePagesCreator<R> playablePagesCreator) {
            return new PlayablePagesMapper(playablePagesCreator, this);
        }

        public final ainx prefetchPublisherSnaps(long j, FeatureType featureType, long j2) {
            return new PrefetchPublisherSnapsQuery(j, featureType, j2);
        }

        public final <R extends PrefetchPublisherSnapsModel> PrefetchPublisherSnapsMapper<R> prefetchPublisherSnapsMapper(PrefetchPublisherSnapsCreator<R> prefetchPublisherSnapsCreator) {
            return new PrefetchPublisherSnapsMapper(prefetchPublisherSnapsCreator);
        }

        public final ainx richMediaInfo(long j, FeatureType featureType) {
            return new RichMediaInfoQuery(j, featureType);
        }

        public final <R extends RichMediaInfoModel> RichMediaInfoMapper<R> richMediaInfoMapper(RichMediaInfoCreator<R> richMediaInfoCreator) {
            return new RichMediaInfoMapper(richMediaInfoCreator);
        }

        public final ainx snapTileInfo(long j, FeatureType featureType) {
            return new SnapTileInfoQuery(j, featureType);
        }

        public final <R extends SnapTileInfoModel> SnapTileInfoMapper<R> snapTileInfoMapper(SnapTileInfoCreator<R> snapTileInfoCreator) {
            return new SnapTileInfoMapper(snapTileInfoCreator);
        }

        public final ainx storyInfo(long j, FeatureType featureType) {
            return new StoryInfoQuery(j, featureType);
        }

        public final <R extends StoryInfoModel> StoryInfoMapper<R> storyInfoMapper(StoryInfoCreator<R> storyInfoCreator) {
            return new StoryInfoMapper(storyInfoCreator);
        }
    }

    public interface PageMediaInfoCreator<T extends PageMediaInfoModel> {
        T create(long j, String str);
    }

    public interface PageMediaInfoModel {
        long _id();

        String url();
    }

    public interface PlayablePagesCreator<T extends PlayablePagesModel> {
        T create(long j, long j2, String str, long j3, long j4, String str2, String str3, long j5, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, Long l2, Long l3, String str6);
    }

    public interface PlayablePagesModel {
        long _id();

        Long adType();

        long editionId();

        Long lastView();

        String pageHash();

        long pageId();

        Long publishTimestampMs();

        String publisherFormalName();

        long publisherId();

        String publisherName();

        PublisherPageSnapType snapType();

        String storyId();

        long storyRowId();

        String thumbnailUrl();

        String url();
    }

    public interface PrefetchPublisherSnapsCreator<T extends PrefetchPublisherSnapsModel> {
        T create(long j, Long l, Long l2);
    }

    public interface PrefetchPublisherSnapsModel {
        Long lastView();

        long pageId();

        Long publishTimestampMs();
    }

    public interface RichMediaInfoCreator<T extends RichMediaInfoModel> {
        T create(String str, boolean z, boolean z2, boolean z3, String str2);
    }

    public interface RichMediaInfoModel {
        boolean isAutoAdvance();

        boolean isSkippable();

        boolean shareable();

        String slugType();

        String swipeUpKey();
    }

    public interface SnapTileInfoCreator<T extends SnapTileInfoModel> {
        T create(long j, long j2, String str, String str2, String str3, Long l, String str4, Long l2, String str5, Long l3, Long l4, Long l5);
    }

    public interface SnapTileInfoModel {
        long _id();

        Long lastView();

        long pageId();

        Long tileBadgeBgColor();

        Long tileBadgeSize();

        Long tileBadgeTextColor();

        String tileBadgeTitle();

        String tileHeadline();

        String tileId();

        String tileImageUrl();

        Long tileProgress();

        String tileShowSubtitle();
    }

    public interface StoryInfoCreator<T extends StoryInfoModel> {
        T create(long j, String str, long j2);
    }

    public interface StoryInfoModel {
        long _id();

        String storyId();

        long storyRowId();
    }

    public static final class Mapper<T extends PublisherSnapPageModel> implements ainw<T> {
        private final Factory<T> publisherSnapPageModelFactory;

        public Mapper(Factory<T> factory) {
            this.publisherSnapPageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            Creator creator = this.publisherSnapPageModelFactory.creator;
            long j = cursor2.getLong(0);
            long j2 = cursor2.getLong(1);
            String string = cursor2.getString(2);
            long j3 = cursor2.getLong(3);
            long j4 = cursor2.getLong(4);
            String string2 = cursor2.isNull(5) ? null : cursor2.getString(5);
            String string3 = cursor2.isNull(6) ? null : cursor2.getString(6);
            PublisherPageSnapType publisherPageSnapType = (PublisherPageSnapType) this.publisherSnapPageModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(7)));
            String string4 = cursor2.isNull(8) ? null : cursor2.getString(8);
            String string5 = cursor2.isNull(9) ? null : cursor2.getString(9);
            Long valueOf = cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10));
            String string6 = cursor2.isNull(11) ? null : cursor2.getString(11);
            PublisherPageSnapType publisherPageSnapType2 = publisherPageSnapType;
            boolean z = true;
            boolean z2 = cursor2.getInt(12) == 1;
            boolean z3 = cursor2.getInt(13) == 1;
            if (cursor2.getInt(14) != 1) {
                z = false;
            }
            return creator.create(j, j2, string, j3, j4, string2, string3, publisherPageSnapType2, string4, string5, valueOf, string6, z2, z3, z, cursor2.isNull(15) ? null : cursor2.getString(15), (FeatureType) this.publisherSnapPageModelFactory.featureTypeAdapter.decode(Long.valueOf(cursor2.getLong(16))), cursor2.isNull(17) ? null : Long.valueOf(cursor2.getLong(17)), cursor2.isNull(18) ? null : cursor2.getString(18), cursor2.getLong(19), cursor2.getLong(20), cursor2.isNull(21) ? null : cursor2.getString(21), cursor2.isNull(22) ? null : cursor2.getString(22), cursor2.isNull(23) ? null : cursor2.getString(23), cursor2.isNull(24) ? null : Long.valueOf(cursor2.getLong(24)), cursor2.isNull(25) ? null : cursor2.getString(25), cursor2.isNull(26) ? null : Long.valueOf(cursor2.getLong(26)), cursor2.isNull(27) ? null : cursor2.getString(27), cursor2.isNull(28) ? null : Long.valueOf(cursor2.getLong(28)), cursor2.isNull(29) ? null : Long.valueOf(cursor2.getLong(29)));
        }
    }

    public static final class PageMediaInfoMapper<T extends PageMediaInfoModel> implements ainw<T> {
        private final PageMediaInfoCreator<T> creator;

        public PageMediaInfoMapper(PageMediaInfoCreator<T> pageMediaInfoCreator) {
            this.creator = pageMediaInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getString(1));
        }
    }

    public static final class PlayablePagesMapper<T extends PlayablePagesModel, T1 extends PublisherSnapPageModel> implements ainw<T> {
        private final PlayablePagesCreator<T> creator;
        private final Factory<T1> publisherSnapPageModelFactory;

        public PlayablePagesMapper(PlayablePagesCreator<T> playablePagesCreator, Factory<T1> factory) {
            this.creator = playablePagesCreator;
            this.publisherSnapPageModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getLong(1), cursor2.getString(2), cursor2.getLong(3), cursor2.getLong(4), cursor2.isNull(5) ? null : cursor2.getString(5), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.getLong(7), (PublisherPageSnapType) this.publisherSnapPageModelFactory.snapTypeAdapter.decode(Long.valueOf(cursor2.getLong(8))), cursor2.isNull(9) ? null : cursor2.getString(9), cursor2.isNull(10) ? null : cursor2.getString(10), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)), cursor2.isNull(12) ? null : Long.valueOf(cursor2.getLong(12)), cursor2.isNull(13) ? null : Long.valueOf(cursor2.getLong(13)), cursor2.isNull(14) ? null : cursor2.getString(14));
        }
    }

    public static final class PrefetchPublisherSnapsMapper<T extends PrefetchPublisherSnapsModel> implements ainw<T> {
        private final PrefetchPublisherSnapsCreator<T> creator;

        public PrefetchPublisherSnapsMapper(PrefetchPublisherSnapsCreator<T> prefetchPublisherSnapsCreator) {
            this.creator = prefetchPublisherSnapsCreator;
        }

        public final T map(Cursor cursor) {
            PrefetchPublisherSnapsCreator prefetchPublisherSnapsCreator = this.creator;
            long j = cursor.getLong(0);
            Long l = null;
            Long valueOf = cursor.isNull(1) ? null : Long.valueOf(cursor.getLong(1));
            if (!cursor.isNull(2)) {
                l = Long.valueOf(cursor.getLong(2));
            }
            return prefetchPublisherSnapsCreator.create(j, valueOf, l);
        }
    }

    public static final class RichMediaInfoMapper<T extends RichMediaInfoModel> implements ainw<T> {
        private final RichMediaInfoCreator<T> creator;

        public RichMediaInfoMapper(RichMediaInfoCreator<T> richMediaInfoCreator) {
            this.creator = richMediaInfoCreator;
        }

        public final T map(Cursor cursor) {
            RichMediaInfoCreator richMediaInfoCreator = this.creator;
            String string = cursor.isNull(0) ? null : cursor.getString(0);
            boolean z = true;
            boolean z2 = cursor.getInt(1) == 1;
            boolean z3 = cursor.getInt(2) == 1;
            if (cursor.getInt(3) != 1) {
                z = false;
            }
            return richMediaInfoCreator.create(string, z2, z3, z, cursor.isNull(4) ? null : cursor.getString(4));
        }
    }

    public static final class SnapTileInfoMapper<T extends SnapTileInfoModel> implements ainw<T> {
        private final SnapTileInfoCreator<T> creator;

        public SnapTileInfoMapper(SnapTileInfoCreator<T> snapTileInfoCreator) {
            this.creator = snapTileInfoCreator;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.creator.create(cursor2.getLong(0), cursor2.getLong(1), cursor2.isNull(2) ? null : cursor2.getString(2), cursor2.isNull(3) ? null : cursor2.getString(3), cursor2.isNull(4) ? null : cursor2.getString(4), cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5)), cursor2.isNull(6) ? null : cursor2.getString(6), cursor2.isNull(7) ? null : Long.valueOf(cursor2.getLong(7)), cursor2.isNull(8) ? null : cursor2.getString(8), cursor2.isNull(9) ? null : Long.valueOf(cursor2.getLong(9)), cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)), cursor2.isNull(11) ? null : Long.valueOf(cursor2.getLong(11)));
        }
    }

    public static final class StoryInfoMapper<T extends StoryInfoModel> implements ainw<T> {
        private final StoryInfoCreator<T> creator;

        public StoryInfoMapper(StoryInfoCreator<T> storyInfoCreator) {
            this.creator = storyInfoCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getLong(2));
        }
    }

    public static final class CleanupPublisherSnapsOlderThan extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public CleanupPublisherSnapsOlderThan(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("DELETE FROM PublisherSnapPage\nWHERE timestamp < ? AND featureType = ?"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(long j, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class ClearAll extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public ClearAll(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("DELETE FROM PublisherSnapPage\nWHERE featureType = ?"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(FeatureType featureType) {
            bindLong(1, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class DeletePageByStory extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public DeletePageByStory(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("DELETE FROM PublisherSnapPage\nWHERE\n    storyRowId = ? AND\n    featureType = ?"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(long j, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class InsertPublisherSnapPage extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public InsertPublisherSnapPage(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("INSERT INTO PublisherSnapPage(\n    pageId,\n    storyId,\n    storyRowId,\n    editionId ,\n    publisherFormalName,\n    publisherName,\n    snapType,\n    url,\n    pageHash,\n    adType,\n    featureType,\n    swipeUpKey,\n    shareable  ,\n    isAutoAdvance,\n    isSkippable,\n    slugType,\n    timestamp,\n    publisherId,\n    publishTimestampMs,\n    thumbnailUrl,\n    tileId,\n    tileImageUrl,\n    tileHeadline,\n    tileProgress,\n    tileShowSubtitle,\n    tileBadgeSize,\n    tileBadgeTitle,\n    tileBadgeBgColor,\n    tileBadgeTextColor)\nVALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(long j, String str, long j2, long j3, String str2, String str3, PublisherPageSnapType publisherPageSnapType, String str4, String str5, Long l, FeatureType featureType, String str6, boolean z, boolean z2, boolean z3, String str7, long j4, long j5, Long l2, String str8, String str9, String str10, String str11, Long l3, String str12, Long l4, String str13, Long l5, Long l6) {
            String str14 = str2;
            String str15 = str3;
            String str16 = str4;
            String str17 = str5;
            String str18 = str6;
            String str19 = str7;
            String str20 = str8;
            String str21 = str9;
            String str22 = str10;
            String str23 = str11;
            String str24 = str12;
            String str25 = str13;
            bindLong(1, j);
            bindString(2, str);
            bindLong(3, j2);
            bindLong(4, j3);
            if (str14 == null) {
                bindNull(5);
            } else {
                bindString(5, str14);
            }
            if (str15 == null) {
                bindNull(6);
            } else {
                bindString(6, str15);
            }
            bindLong(7, ((Long) this.publisherSnapPageModelFactory.snapTypeAdapter.encode(publisherPageSnapType)).longValue());
            if (str16 == null) {
                bindNull(8);
            } else {
                bindString(8, str16);
            }
            if (str17 == null) {
                bindNull(9);
            } else {
                bindString(9, str17);
            }
            if (l == null) {
                bindNull(10);
            } else {
                bindLong(10, l.longValue());
            }
            bindLong(11, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
            if (str18 == null) {
                bindNull(12);
            } else {
                bindString(12, str18);
            }
            long j6 = 1;
            bindLong(13, z ? 1 : 0);
            bindLong(14, z2 ? 1 : 0);
            if (!z3) {
                j6 = 0;
            }
            bindLong(15, j6);
            if (str19 == null) {
                bindNull(16);
            } else {
                bindString(16, str19);
            }
            bindLong(17, j4);
            bindLong(18, j5);
            if (l2 == null) {
                bindNull(19);
            } else {
                bindLong(19, l2.longValue());
            }
            if (str20 == null) {
                bindNull(20);
            } else {
                bindString(20, str20);
            }
            if (str21 == null) {
                bindNull(21);
            } else {
                bindString(21, str21);
            }
            if (str22 == null) {
                bindNull(22);
            } else {
                bindString(22, str22);
            }
            if (str23 == null) {
                bindNull(23);
            } else {
                bindString(23, str23);
            }
            if (l3 == null) {
                bindNull(24);
            } else {
                bindLong(24, l3.longValue());
            }
            if (str24 == null) {
                bindNull(25);
            } else {
                bindString(25, str24);
            }
            if (l4 == null) {
                bindNull(26);
            } else {
                bindLong(26, l4.longValue());
            }
            if (str25 == null) {
                bindNull(27);
            } else {
                bindString(27, str25);
            }
            if (l5 == null) {
                bindNull(28);
            } else {
                bindLong(28, l5.longValue());
            }
            if (l6 == null) {
                bindNull(29);
            } else {
                bindLong(29, l6.longValue());
            }
        }
    }

    public static final class UpdatePublisherSnapPage extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public UpdatePublisherSnapPage(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("UPDATE PublisherSnapPage\nSET\n    editionId =?,\n    publisherId =?,\n    publisherFormalName = ?,\n    publisherName =?,\n    snapType =?,\n    url =?,\n    pageHash =?,\n    adType =?,\n    storyId =?,\n    storyRowId=?,\n    timestamp =?,\n    tileId =?,\n    tileImageUrl =?,\n    tileHeadline =?,\n    tileProgress =?,\n    tileShowSubtitle =?,\n    tileBadgeSize =?,\n    tileBadgeTitle =?,\n    tileBadgeBgColor =?,\n    tileBadgeTextColor =?\nWHERE\n    pageId = ? AND\n    featureType = ?"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(long j, long j2, String str, String str2, PublisherPageSnapType publisherPageSnapType, String str3, String str4, Long l, String str5, long j3, long j4, String str6, String str7, String str8, Long l2, String str9, Long l3, String str10, Long l4, Long l5, long j5, FeatureType featureType) {
            String str11 = str;
            String str12 = str2;
            String str13 = str3;
            String str14 = str4;
            String str15 = str6;
            String str16 = str7;
            String str17 = str8;
            String str18 = str9;
            String str19 = str10;
            long j6 = j;
            bindLong(1, j);
            bindLong(2, j2);
            if (str11 == null) {
                bindNull(3);
            } else {
                bindString(3, str11);
            }
            if (str12 == null) {
                bindNull(4);
            } else {
                bindString(4, str12);
            }
            bindLong(5, ((Long) this.publisherSnapPageModelFactory.snapTypeAdapter.encode(publisherPageSnapType)).longValue());
            if (str13 == null) {
                bindNull(6);
            } else {
                bindString(6, str13);
            }
            if (str14 == null) {
                bindNull(7);
            } else {
                bindString(7, str14);
            }
            if (l == null) {
                bindNull(8);
            } else {
                bindLong(8, l.longValue());
            }
            bindString(9, str5);
            bindLong(10, j3);
            bindLong(11, j4);
            if (str15 == null) {
                bindNull(12);
            } else {
                bindString(12, str15);
            }
            if (str16 == null) {
                bindNull(13);
            } else {
                bindString(13, str16);
            }
            if (str17 == null) {
                bindNull(14);
            } else {
                bindString(14, str17);
            }
            if (l2 == null) {
                bindNull(15);
            } else {
                bindLong(15, l2.longValue());
            }
            if (str18 == null) {
                bindNull(16);
            } else {
                bindString(16, str18);
            }
            if (l3 == null) {
                bindNull(17);
            } else {
                bindLong(17, l3.longValue());
            }
            if (str19 == null) {
                bindNull(18);
            } else {
                bindString(18, str19);
            }
            if (l4 == null) {
                bindNull(19);
            } else {
                bindLong(19, l4.longValue());
            }
            if (l5 == null) {
                bindNull(20);
            } else {
                bindLong(20, l5.longValue());
            }
            bindLong(21, j5);
            bindLong(22, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class UpdateRichMediaInfo extends ainy {
        private final Factory<? extends PublisherSnapPageModel> publisherSnapPageModelFactory;

        public UpdateRichMediaInfo(pa paVar, Factory<? extends PublisherSnapPageModel> factory) {
            super(PublisherSnapPageModel.TABLE_NAME, paVar.a("UPDATE PublisherSnapPage\nSET\n    swipeUpKey =?,\n    shareable =? ,\n    isAutoAdvance =?,\n    isSkippable =?,\n    slugType =?\nWHERE\n    pageId = ? AND\n    featureType = ?"));
            this.publisherSnapPageModelFactory = factory;
        }

        public final void bind(String str, boolean z, boolean z2, boolean z3, String str2, long j, FeatureType featureType) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            long j2 = 1;
            bindLong(2, z ? 1 : 0);
            bindLong(3, z2 ? 1 : 0);
            if (!z3) {
                j2 = 0;
            }
            bindLong(4, j2);
            if (str2 == null) {
                bindNull(5);
            } else {
                bindString(5, str2);
            }
            bindLong(6, j);
            bindLong(7, ((Long) this.publisherSnapPageModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    long _id();

    Long adType();

    long editionId();

    FeatureType featureType();

    boolean isAutoAdvance();

    boolean isSkippable();

    String pageHash();

    long pageId();

    Long publishTimestampMs();

    String publisherFormalName();

    long publisherId();

    String publisherName();

    boolean shareable();

    String slugType();

    PublisherPageSnapType snapType();

    String storyId();

    long storyRowId();

    String swipeUpKey();

    String thumbnailUrl();

    Long tileBadgeBgColor();

    Long tileBadgeSize();

    Long tileBadgeTextColor();

    String tileBadgeTitle();

    String tileHeadline();

    String tileId();

    String tileImageUrl();

    Long tileProgress();

    String tileShowSubtitle();

    long timestamp();

    String url();
}
