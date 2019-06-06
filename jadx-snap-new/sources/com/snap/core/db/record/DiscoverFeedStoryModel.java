package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.FeatureType;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface DiscoverFeedStoryModel {
    public static final String ADDTIMESTAMP = "ALTER TABLE DiscoverFeedStory\nADD timestamp INTEGER NOT NULL DEFAULT 0";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS DiscoverFeedStory (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    storyId TEXT NOT NULL,\n    featureType INTEGER NOT NULL,\n    timestamp INTEGER NOT NULL DEFAULT 0,\n    UNIQUE (storyId, featureType)\n)";
    @Deprecated
    public static final String FEATURETYPE = "featureType";
    @Deprecated
    public static final String STORYID = "storyId";
    @Deprecated
    public static final String TABLE_NAME = "DiscoverFeedStory";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends DiscoverFeedStoryModel> {
        T create(long j, String str, FeatureType featureType, long j2);
    }

    public static final class Factory<T extends DiscoverFeedStoryModel> {
        public final Creator<T> creator;
        public final ainu<FeatureType, Long> featureTypeAdapter;

        final class GetDiscoverFeedStoryRowIdQuery extends ainx {
            private final FeatureType featureType;
            private final String storyId;

            GetDiscoverFeedStoryRowIdQuery(String str, FeatureType featureType) {
                super("SELECT\n    _id\nFROM DiscoverFeedStory\nWHERE\n    storyId = ?1 AND\n    featureType = ?2", new aioa(DiscoverFeedStoryModel.TABLE_NAME));
                this.storyId = str;
                this.featureType = featureType;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.storyId);
                pcVar.bindLong(2, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
            }
        }

        final class GetStoryRowIdsInBatchQuery extends ainx {
            private final FeatureType featureType;
            private final String[] storyId;

            GetStoryRowIdsInBatchQuery(FeatureType featureType, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n storyId,\n _id\nFROM DiscoverFeedStory\nWHERE featureType = ?1 AND storyId IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(DiscoverFeedStoryModel.TABLE_NAME));
                this.featureType = featureType;
                this.storyId = strArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.featureTypeAdapter.encode(this.featureType)).longValue());
                String[] strArr = this.storyId;
                int length = strArr.length;
                int i = 2;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator, ainu<FeatureType, Long> ainu) {
            this.creator = creator;
            this.featureTypeAdapter = ainu;
        }

        public final ainx getDiscoverFeedStoryRowId(String str, FeatureType featureType) {
            return new GetDiscoverFeedStoryRowIdQuery(str, featureType);
        }

        public final ainw<Long> getDiscoverFeedStoryRowIdMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }

        public final ainx getStoryRowIdsInBatch(FeatureType featureType, String[] strArr) {
            return new GetStoryRowIdsInBatchQuery(featureType, strArr);
        }

        public final <R extends GetStoryRowIdsInBatchModel> GetStoryRowIdsInBatchMapper<R> getStoryRowIdsInBatchMapper(GetStoryRowIdsInBatchCreator<R> getStoryRowIdsInBatchCreator) {
            return new GetStoryRowIdsInBatchMapper(getStoryRowIdsInBatchCreator);
        }
    }

    public interface GetStoryRowIdsInBatchCreator<T extends GetStoryRowIdsInBatchModel> {
        T create(String str, long j);
    }

    public interface GetStoryRowIdsInBatchModel {
        long _id();

        String storyId();
    }

    public static final class GetStoryRowIdsInBatchMapper<T extends GetStoryRowIdsInBatchModel> implements ainw<T> {
        private final GetStoryRowIdsInBatchCreator<T> creator;

        public GetStoryRowIdsInBatchMapper(GetStoryRowIdsInBatchCreator<T> getStoryRowIdsInBatchCreator) {
            this.creator = getStoryRowIdsInBatchCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getString(0), cursor.getLong(1));
        }
    }

    public static final class Mapper<T extends DiscoverFeedStoryModel> implements ainw<T> {
        private final Factory<T> discoverFeedStoryModelFactory;

        public Mapper(Factory<T> factory) {
            this.discoverFeedStoryModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.discoverFeedStoryModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), (FeatureType) this.discoverFeedStoryModelFactory.featureTypeAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.getLong(3));
        }
    }

    public static final class CleanupStoryOlderThan extends ainy {
        private final Factory<? extends DiscoverFeedStoryModel> discoverFeedStoryModelFactory;

        public CleanupStoryOlderThan(pa paVar, Factory<? extends DiscoverFeedStoryModel> factory) {
            super(DiscoverFeedStoryModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverFeedStory\nWHERE timestamp < ? AND featureType = ?"));
            this.discoverFeedStoryModelFactory = factory;
        }

        public final void bind(long j, FeatureType featureType) {
            bindLong(1, j);
            bindLong(2, ((Long) this.discoverFeedStoryModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class ClearAll extends ainy {
        private final Factory<? extends DiscoverFeedStoryModel> discoverFeedStoryModelFactory;

        public ClearAll(pa paVar, Factory<? extends DiscoverFeedStoryModel> factory) {
            super(DiscoverFeedStoryModel.TABLE_NAME, paVar.a("DELETE FROM DiscoverFeedStory\nWHERE featureType = ?"));
            this.discoverFeedStoryModelFactory = factory;
        }

        public final void bind(FeatureType featureType) {
            bindLong(1, ((Long) this.discoverFeedStoryModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class InsertDiscoverFeedStory extends ainy {
        private final Factory<? extends DiscoverFeedStoryModel> discoverFeedStoryModelFactory;

        public InsertDiscoverFeedStory(pa paVar, Factory<? extends DiscoverFeedStoryModel> factory) {
            super(DiscoverFeedStoryModel.TABLE_NAME, paVar.a("INSERT INTO DiscoverFeedStory(\n    storyId,\n    timestamp,\n    featureType)\nVALUES(?, ?, ?)"));
            this.discoverFeedStoryModelFactory = factory;
        }

        public final void bind(String str, long j, FeatureType featureType) {
            bindString(1, str);
            bindLong(2, j);
            bindLong(3, ((Long) this.discoverFeedStoryModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    public static final class UpdateDiscoverFeedStory extends ainy {
        private final Factory<? extends DiscoverFeedStoryModel> discoverFeedStoryModelFactory;

        public UpdateDiscoverFeedStory(pa paVar, Factory<? extends DiscoverFeedStoryModel> factory) {
            super(DiscoverFeedStoryModel.TABLE_NAME, paVar.a("UPDATE DiscoverFeedStory\nSET storyId =?,\n    timestamp =?\nWHERE\n    storyId = ? AND\n    featureType = ?"));
            this.discoverFeedStoryModelFactory = factory;
        }

        public final void bind(String str, long j, String str2, FeatureType featureType) {
            bindString(1, str);
            bindLong(2, j);
            bindString(3, str2);
            bindLong(4, ((Long) this.discoverFeedStoryModelFactory.featureTypeAdapter.encode(featureType)).longValue());
        }
    }

    long _id();

    FeatureType featureType();

    String storyId();

    long timestamp();
}
