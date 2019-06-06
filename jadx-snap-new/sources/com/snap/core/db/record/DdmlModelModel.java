package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.adsy;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface DdmlModelModel {
    @Deprecated
    public static final String APPLICATIONID = "applicationId";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS DdmlModel(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    applicationId TEXT NOT NULL UNIQUE,\n    modelId TEXT NOT NULL UNIQUE,\n    modelSpecAndParams BLOB NOT NULL,\n    timestamp INTEGER NOT NULL\n)";
    @Deprecated
    public static final String MODELID = "modelId";
    @Deprecated
    public static final String MODELSPECANDPARAMS = "modelSpecAndParams";
    @Deprecated
    public static final String TABLE_NAME = "DdmlModel";
    @Deprecated
    public static final String TIMESTAMP = "timestamp";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends DdmlModelModel> {
        T create(long j, String str, String str2, adsy adsy, long j2);
    }

    public static final class Factory<T extends DdmlModelModel> {
        public final Creator<T> creator;
        public final ainu<adsy, byte[]> modelSpecAndParamsAdapter;

        final class GetModelSpecAndParamsQuery extends ainx {
            private final String modelId;

            GetModelSpecAndParamsQuery(String str) {
                super("SELECT modelSpecAndParams\nFROM DdmlModel\nWHERE modelId= ?1", new aioa(DdmlModelModel.TABLE_NAME));
                this.modelId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.modelId);
            }
        }

        final class GetTimestampQuery extends ainx {
            private final String modelId;

            GetTimestampQuery(String str) {
                super("SELECT timestamp\nFROM DdmlModel\nWHERE modelId= ?1", new aioa(DdmlModelModel.TABLE_NAME));
                this.modelId = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.modelId);
            }
        }

        public Factory(Creator<T> creator, ainu<adsy, byte[]> ainu) {
            this.creator = creator;
            this.modelSpecAndParamsAdapter = ainu;
        }

        public final ainx getModelSpecAndParams(String str) {
            return new GetModelSpecAndParamsQuery(str);
        }

        public final ainw<adsy> getModelSpecAndParamsMapper() {
            return new ainw<adsy>() {
                public adsy map(Cursor cursor) {
                    return (adsy) Factory.this.modelSpecAndParamsAdapter.decode(cursor.getBlob(0));
                }
            };
        }

        public final ainx getTimestamp(String str) {
            return new GetTimestampQuery(str);
        }

        public final ainw<Long> getTimestampMapper() {
            return new ainw<Long>() {
                public Long map(Cursor cursor) {
                    return Long.valueOf(cursor.getLong(0));
                }
            };
        }
    }

    public static final class Mapper<T extends DdmlModelModel> implements ainw<T> {
        private final Factory<T> ddmlModelModelFactory;

        public Mapper(Factory<T> factory) {
            this.ddmlModelModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.ddmlModelModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), (adsy) this.ddmlModelModelFactory.modelSpecAndParamsAdapter.decode(cursor.getBlob(3)), cursor.getLong(4));
        }
    }

    public static final class DeleteForApplicationId extends ainy {
        public DeleteForApplicationId(pa paVar) {
            super(DdmlModelModel.TABLE_NAME, paVar.a("DELETE FROM DdmlModel\nWHERE applicationId= ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class InsertOrReplaceRow extends ainy {
        private final Factory<? extends DdmlModelModel> ddmlModelModelFactory;

        public InsertOrReplaceRow(pa paVar, Factory<? extends DdmlModelModel> factory) {
            super(DdmlModelModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO DdmlModel(\n    applicationId,\n    modelId,\n    modelSpecAndParams,\n    timestamp)\nVALUES(?, ?, ?, ?)"));
            this.ddmlModelModelFactory = factory;
        }

        public final void bind(String str, String str2, adsy adsy, long j) {
            bindString(1, str);
            bindString(2, str2);
            bindBlob(3, (byte[]) this.ddmlModelModelFactory.modelSpecAndParamsAdapter.encode(adsy));
            bindLong(4, j);
        }
    }

    long _id();

    String applicationId();

    String modelId();

    adsy modelSpecAndParams();

    long timestamp();
}
