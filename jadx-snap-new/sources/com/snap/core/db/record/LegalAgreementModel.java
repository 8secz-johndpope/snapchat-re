package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface LegalAgreementModel {
    @Deprecated
    public static final String AGREEMENTNAME = "agreementName";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS LegalAgreement(\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    agreementName TEXT NOT NULL UNIQUE,\n    hasBeenAccepted INTEGER DEFAULT 0 NOT NULL,\n    mustBeAccepted INTEGER DEFAULT 1 NOT NULL\n)";
    @Deprecated
    public static final String HASBEENACCEPTED = "hasBeenAccepted";
    @Deprecated
    public static final String MUSTBEACCEPTED = "mustBeAccepted";
    @Deprecated
    public static final String TABLE_NAME = "LegalAgreement";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends LegalAgreementModel> {
        T create(long j, String str, boolean z, boolean z2);
    }

    public static final class Factory<T extends LegalAgreementModel> {
        public final Creator<T> creator;

        final class GetLegalAgreementQuery extends ainx {
            private final String agreementName;

            GetLegalAgreementQuery(String str) {
                super("SELECT agreementName, hasBeenAccepted, mustBeAccepted\nFROM LegalAgreement\nWHERE agreementName = ?1", new aioa(LegalAgreementModel.TABLE_NAME));
                this.agreementName = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.agreementName);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx getLegalAgreement(String str) {
            return new GetLegalAgreementQuery(str);
        }

        public final <R extends GetLegalAgreementModel> GetLegalAgreementMapper<R> getLegalAgreementMapper(GetLegalAgreementCreator<R> getLegalAgreementCreator) {
            return new GetLegalAgreementMapper(getLegalAgreementCreator);
        }
    }

    public interface GetLegalAgreementCreator<T extends GetLegalAgreementModel> {
        T create(String str, boolean z, boolean z2);
    }

    public interface GetLegalAgreementModel {
        String agreementName();

        boolean hasBeenAccepted();

        boolean mustBeAccepted();
    }

    public static final class GetLegalAgreementMapper<T extends GetLegalAgreementModel> implements ainw<T> {
        private final GetLegalAgreementCreator<T> creator;

        public GetLegalAgreementMapper(GetLegalAgreementCreator<T> getLegalAgreementCreator) {
            this.creator = getLegalAgreementCreator;
        }

        public final T map(Cursor cursor) {
            GetLegalAgreementCreator getLegalAgreementCreator = this.creator;
            boolean z = false;
            String string = cursor.getString(0);
            boolean z2 = cursor.getInt(1) == 1;
            if (cursor.getInt(2) == 1) {
                z = true;
            }
            return getLegalAgreementCreator.create(string, z2, z);
        }
    }

    public static final class Mapper<T extends LegalAgreementModel> implements ainw<T> {
        private final Factory<T> legalAgreementModelFactory;

        public Mapper(Factory<T> factory) {
            this.legalAgreementModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Creator creator = this.legalAgreementModelFactory.creator;
            boolean z = false;
            long j = cursor.getLong(0);
            String string = cursor.getString(1);
            boolean z2 = cursor.getInt(2) == 1;
            if (cursor.getInt(3) == 1) {
                z = true;
            }
            return creator.create(j, string, z2, z);
        }
    }

    public static final class InsertOrUpdateLegalAgreement extends ainy {
        public InsertOrUpdateLegalAgreement(pa paVar) {
            super(LegalAgreementModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO LegalAgreement(agreementName, hasBeenAccepted, mustBeAccepted)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, boolean z, boolean z2) {
            bindString(1, str);
            long j = 1;
            bindLong(2, z ? 1 : 0);
            if (!z2) {
                j = 0;
            }
            bindLong(3, j);
        }
    }

    public static final class SetLegalAgreementAsAccepted extends ainy {
        public SetLegalAgreementAsAccepted(pa paVar) {
            super(LegalAgreementModel.TABLE_NAME, paVar.a("UPDATE LegalAgreement\nSET hasBeenAccepted = 1\nWHERE agreementName = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    long _id();

    String agreementName();

    boolean hasBeenAccepted();

    boolean mustBeAccepted();
}
