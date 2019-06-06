package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.acgp;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface UploadedMediaModel {
    @Deprecated
    public static final String CONTENT_ID = "content_id";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS uploaded_media (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    session_id TEXT NOT NULL,\n    content_id TEXT NOT NULL,\n    encryption_key TEXT NOT NULL,\n    encryption_iv TEXT NOT NULL,\n    upload_size INTEGER NOT NULL,\n    upload_location BLOB NOT NULL,\n    expiration_timestamp_sec INTEGER NOT NULL\n)";
    @Deprecated
    public static final String ENCRYPTION_IV = "encryption_iv";
    @Deprecated
    public static final String ENCRYPTION_KEY = "encryption_key";
    @Deprecated
    public static final String EXPIRATION_TIMESTAMP_SEC = "expiration_timestamp_sec";
    @Deprecated
    public static final String SESSION_ID = "session_id";
    @Deprecated
    public static final String TABLE_NAME = "uploaded_media";
    @Deprecated
    public static final String UPLOAD_LOCATION = "upload_location";
    @Deprecated
    public static final String UPLOAD_SIZE = "upload_size";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends UploadedMediaModel> {
        T create(long j, String str, String str2, String str3, String str4, long j2, acgp acgp, long j3);
    }

    public static final class Factory<T extends UploadedMediaModel> {
        public final Creator<T> creator;
        public final ainu<acgp, byte[]> upload_locationAdapter;

        final class SelectUploadedMediaQuery extends ainx {
            private final String content_id;
            private final String session_id;

            SelectUploadedMediaQuery(String str, String str2) {
                super("SELECT * FROM uploaded_media\nWHERE session_id = ?1\nAND content_id = ?2", new aioa(UploadedMediaModel.TABLE_NAME));
                this.session_id = str;
                this.content_id = str2;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.session_id);
                pcVar.bindString(2, this.content_id);
            }
        }

        public Factory(Creator<T> creator, ainu<acgp, byte[]> ainu) {
            this.creator = creator;
            this.upload_locationAdapter = ainu;
        }

        public final ainx selectUploadedMedia(String str, String str2) {
            return new SelectUploadedMediaQuery(str, str2);
        }

        public final Mapper<T> selectUploadedMediaMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends UploadedMediaModel> implements ainw<T> {
        private final Factory<T> uploadedMediaModelFactory;

        public Mapper(Factory<T> factory) {
            this.uploadedMediaModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.uploadedMediaModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getLong(5), (acgp) this.uploadedMediaModelFactory.upload_locationAdapter.decode(cursor.getBlob(6)), cursor.getLong(7));
        }
    }

    public static final class DeleteExpired extends ainy {
        public DeleteExpired(pa paVar) {
            super(UploadedMediaModel.TABLE_NAME, paVar.a("DELETE FROM uploaded_media\nWHERE expiration_timestamp_sec < ?"));
        }

        public final void bind(long j) {
            bindLong(1, j);
        }
    }

    public static final class DeleteUploadMedia extends ainy {
        public DeleteUploadMedia(pa paVar) {
            super(UploadedMediaModel.TABLE_NAME, paVar.a("DELETE FROM uploaded_media\nWHERE session_id = ?\nAND content_id = ?"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    public static final class InsertUploadedMedia extends ainy {
        private final Factory<? extends UploadedMediaModel> uploadedMediaModelFactory;

        public InsertUploadedMedia(pa paVar, Factory<? extends UploadedMediaModel> factory) {
            super(UploadedMediaModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO uploaded_media (\n    session_id,\n    content_id,\n    encryption_key,\n    encryption_iv,\n    upload_size,\n    upload_location,\n    expiration_timestamp_sec\n) VALUES(?, ?, ?, ?, ?, ?, ?)"));
            this.uploadedMediaModelFactory = factory;
        }

        public final void bind(String str, String str2, String str3, String str4, long j, acgp acgp, long j2) {
            bindString(1, str);
            bindString(2, str2);
            bindString(3, str3);
            bindString(4, str4);
            bindLong(5, j);
            bindBlob(6, (byte[]) this.uploadedMediaModelFactory.upload_locationAdapter.encode(acgp));
            bindLong(7, j2);
        }
    }

    long _id();

    String content_id();

    String encryption_iv();

    String encryption_key();

    long expiration_timestamp_sec();

    String session_id();

    acgp upload_location();

    long upload_size();
}
