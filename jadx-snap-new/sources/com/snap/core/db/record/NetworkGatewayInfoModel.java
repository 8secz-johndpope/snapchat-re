package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;

public interface NetworkGatewayInfoModel {
    @Deprecated
    public static final String AUTHTOKEN = "authToken";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS NetworkGatewayInfo(\n    _id INTEGER NOT NULL DEFAULT 0,\n    authToken TEXT NOT NULL,\n    server TEXT NOT NULL\n)";
    @Deprecated
    public static final String SERVER = "server";
    @Deprecated
    public static final String TABLE_NAME = "NetworkGatewayInfo";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends NetworkGatewayInfoModel> {
        T create(long j, String str, String str2);
    }

    public static final class UpdateInfo extends ainy {
        public UpdateInfo(pa paVar) {
            super(NetworkGatewayInfoModel.TABLE_NAME, paVar.a("UPDATE NetworkGatewayInfo\nSET authToken=?, server=?"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    public static final class Factory<T extends NetworkGatewayInfoModel> {
        public final Creator<T> creator;

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getInfo() {
            return new ainx("SELECT *\nFROM NetworkGatewayInfo\nLIMIT 1", new aioa(NetworkGatewayInfoModel.TABLE_NAME));
        }

        public final Mapper<T> getInfoMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends NetworkGatewayInfoModel> implements ainw<T> {
        private final Factory<T> networkGatewayInfoModelFactory;

        public Mapper(Factory<T> factory) {
            this.networkGatewayInfoModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.networkGatewayInfoModelFactory.creator.create(cursor.getLong(0), cursor.getString(1), cursor.getString(2));
        }
    }

    public static final class InsertInfo extends ainy {
        public InsertInfo(pa paVar) {
            super(NetworkGatewayInfoModel.TABLE_NAME, paVar.a("INSERT INTO NetworkGatewayInfo(authToken, server) VALUES(?, ?)"));
        }

        public final void bind(String str, String str2) {
            bindString(1, str);
            bindString(2, str2);
        }
    }

    long _id();

    String authToken();

    String server();
}
