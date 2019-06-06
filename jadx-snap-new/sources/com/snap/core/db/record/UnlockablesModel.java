package com.snap.core.db.record;

import android.database.Cursor;
import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snapchat.soju.android.Geofence;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface UnlockablesModel {
    public static final String ADDCOLUMNCHECKSUM = "ALTER TABLE Unlockables\nADD COLUMN checksum BLOB DEFAULT NULL";
    public static final String ADDCOLUMNDATAVERSION = "ALTER TABLE Unlockables\nADD COLUMN dataVersion INTEGER NOT NULL DEFAULT 0";
    public static final String ADDCOLUMNREMOVEDLOCALLY = "ALTER TABLE Unlockables\nADD COLUMN removedLocally INTEGER NOT NULL DEFAULT 0";
    public static final String ADDORDERPOSITION = "ALTER TABLE Unlockables\nADD COLUMN orderPosition INTEGER NOT NULL DEFAULT 0";
    public static final String ADDUPDATETIME = "ALTER TABLE Unlockables\nADD COLUMN updateTime INTEGER NOT NULL DEFAULT 0";
    @Deprecated
    public static final String CHECKSUM = "checksum";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Unlockables (\n    unlockableId INTEGER NOT NULL UNIQUE PRIMARY KEY,\n\n    type INTEGER NOT NULL,\n    unlockMechanism INTEGER NOT NULL DEFAULT 0,\n\n    -- GeofilterResponse --\n    data BLOB NOT NULL,\n    dataVersion INTEGER NOT NULL DEFAULT 0,\n\n    -- delivery purpose --\n    lowSensitivity INTEGER NOT NULL DEFAULT 0,\n    highSensitivity INTEGER NOT NULL DEFAULT 0,\n\n    -- TODO: indexing on geofence id to support mulyi-location --\n    geofence TEXT,\n    expirationTime INTEGER,\n\n    updateTime INTEGER NOT NULL DEFAULT 0,\n    orderPosition INTEGER NOT NULL DEFAULT 0,\n\n    removedLocally INTEGER NOT NULL DEFAULT 0,\n\n    checksum BLOB\n)";
    @Deprecated
    public static final String DATA = "data";
    @Deprecated
    public static final String DATAVERSION = "dataVersion";
    @Deprecated
    public static final String EXPIRATIONTIME = "expirationTime";
    @Deprecated
    public static final String GEOFENCE = "geofence";
    @Deprecated
    public static final String HIGHSENSITIVITY = "highSensitivity";
    @Deprecated
    public static final String LOWSENSITIVITY = "lowSensitivity";
    @Deprecated
    public static final String ORDERPOSITION = "orderPosition";
    @Deprecated
    public static final String REMOVEDLOCALLY = "removedLocally";
    @Deprecated
    public static final String TABLE_NAME = "Unlockables";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String UNLOCKABLEID = "unlockableId";
    @Deprecated
    public static final String UNLOCKMECHANISM = "unlockMechanism";
    @Deprecated
    public static final String UPDATETIME = "updateTime";

    public interface Creator<T extends UnlockablesModel> {
        T create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, long j3, int i, boolean z3, byte[] bArr2);
    }

    public interface SelectByTypeCreator<T extends SelectByTypeModel> {
        T create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2);
    }

    public interface SelectAllFromUnlockablesCreator<T extends SelectAllFromUnlockablesModel> {
        T create(long j, UnlockMechanism unlockMechanism, Geofence geofence, Long l, boolean z, boolean z2, byte[] bArr);
    }

    public interface SelectChecksumCreator<T extends SelectChecksumModel> {
        T create(long j, byte[] bArr);
    }

    public static final class Factory<T extends UnlockablesModel> {
        public final Creator<T> creator;
        public final ainu<Geofence, String> geofenceAdapter;
        public final ainu<PersistableUnlockableType, Long> typeAdapter;
        public final ainu<UnlockMechanism, Long> unlockMechanismAdapter;

        final class SelectByTypeQuery extends ainx {
            private final Long expirationTime;
            private final PersistableUnlockableType type;

            SelectByTypeQuery(PersistableUnlockableType persistableUnlockableType, Long l) {
                super("SELECT\n    Unlockables.unlockableId,\n    Unlockables.type,\n    Unlockables.unlockMechanism,\n    Unlockables.geofence,\n    Unlockables.expirationTime,\n    Unlockables.data,\n    Unlockables.dataVersion,\n    Unlockables.checksum\nFROM Unlockables\nWHERE type = ?1 AND expirationTime > ?2 AND removedLocally = 0\nORDER BY updateTime DESC, orderPosition", new aioa(UnlockablesModel.TABLE_NAME));
                this.type = persistableUnlockableType;
                this.expirationTime = l;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.typeAdapter.encode(this.type)).longValue());
                Long l = this.expirationTime;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
            }
        }

        final class SelectByTypeAndUnlockMechanismQuery extends ainx {
            private final Long expirationTime;
            private final PersistableUnlockableType type;
            private final UnlockMechanism[] unlockMechanism;

            SelectByTypeAndUnlockMechanismQuery(PersistableUnlockableType persistableUnlockableType, Long l, UnlockMechanism[] unlockMechanismArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Unlockables.unlockableId,\n    Unlockables.type,\n    Unlockables.unlockMechanism,\n    Unlockables.geofence,\n    Unlockables.expirationTime,\n    Unlockables.data,\n    Unlockables.dataVersion,\n    Unlockables.checksum\nFROM Unlockables\nWHERE type = ?1 AND expirationTime > ?2 AND removedLocally = 0 AND unlockMechanism IN ");
                stringBuilder.append(ainz.a(unlockMechanismArr.length));
                stringBuilder.append("\nORDER BY updateTime DESC, orderPosition");
                super(stringBuilder.toString(), new aioa(UnlockablesModel.TABLE_NAME));
                this.type = persistableUnlockableType;
                this.expirationTime = l;
                this.unlockMechanism = unlockMechanismArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, ((Long) Factory.this.typeAdapter.encode(this.type)).longValue());
                Long l = this.expirationTime;
                if (l != null) {
                    pcVar.bindLong(2, l.longValue());
                } else {
                    pcVar.bindNull(2);
                }
                int i = 3;
                UnlockMechanism[] unlockMechanismArr = this.unlockMechanism;
                int length = unlockMechanismArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, ((Long) Factory.this.unlockMechanismAdapter.encode(unlockMechanismArr[i2])).longValue());
                    i2++;
                    i = i3;
                }
            }
        }

        final class DeleteUnlockablesByIdsQuery extends ainx {
            private final long[] unlockableId;

            DeleteUnlockablesByIdsQuery(long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Unlockables\nWHERE Unlockables.unlockableId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(UnlockablesModel.TABLE_NAME));
                this.unlockableId = jArr;
            }

            public final void bindTo(pc pcVar) {
                long[] jArr = this.unlockableId;
                int length = jArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectByIdsQuery extends ainx {
            private final Long expirationTime;
            private final long[] unlockableId;

            SelectByIdsQuery(Long l, long[] jArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT\n    Unlockables.unlockableId,\n    Unlockables.type,\n    Unlockables.unlockMechanism,\n    Unlockables.geofence,\n    Unlockables.expirationTime,\n    Unlockables.data,\n    Unlockables.dataVersion,\n    Unlockables.checksum\nFROM Unlockables\nWHERE expirationTime > ?1 AND removedLocally = 0 AND Unlockables.unlockableId IN ");
                stringBuilder.append(ainz.a(jArr.length));
                super(stringBuilder.toString(), new aioa(UnlockablesModel.TABLE_NAME));
                this.expirationTime = l;
                this.unlockableId = jArr;
            }

            public final void bindTo(pc pcVar) {
                Long l = this.expirationTime;
                if (l != null) {
                    pcVar.bindLong(1, l.longValue());
                } else {
                    pcVar.bindNull(1);
                }
                int i = 2;
                long[] jArr = this.unlockableId;
                int length = jArr.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindLong(i, jArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        public Factory(Creator<T> creator, ainu<PersistableUnlockableType, Long> ainu, ainu<UnlockMechanism, Long> ainu2, ainu<Geofence, String> ainu3) {
            this.creator = creator;
            this.typeAdapter = ainu;
            this.unlockMechanismAdapter = ainu2;
            this.geofenceAdapter = ainu3;
        }

        public final ainx deleteUnlockablesByIds(long[] jArr) {
            return new DeleteUnlockablesByIdsQuery(jArr);
        }

        public final ainx selectAllFromUnlockables() {
            return new ainx("SELECT\n    Unlockables.unlockableId,\n    Unlockables.unlockMechanism,\n    Unlockables.geofence,\n    Unlockables.expirationTime,\n    Unlockables.lowSensitivity,\n    Unlockables.highSensitivity,\n    Unlockables.checksum\nFROM Unlockables", new aioa(UnlockablesModel.TABLE_NAME));
        }

        public final <R extends SelectAllFromUnlockablesModel> SelectAllFromUnlockablesMapper<R, T> selectAllFromUnlockablesMapper(SelectAllFromUnlockablesCreator<R> selectAllFromUnlockablesCreator) {
            return new SelectAllFromUnlockablesMapper(selectAllFromUnlockablesCreator, this);
        }

        public final ainx selectByIds(Long l, long[] jArr) {
            return new SelectByIdsQuery(l, jArr);
        }

        public final <R extends SelectByIdsModel> SelectByIdsMapper<R, T> selectByIdsMapper(SelectByIdsCreator<R> selectByIdsCreator) {
            return new SelectByIdsMapper(selectByIdsCreator, this);
        }

        public final ainx selectByType(PersistableUnlockableType persistableUnlockableType, Long l) {
            return new SelectByTypeQuery(persistableUnlockableType, l);
        }

        public final ainx selectByTypeAndUnlockMechanism(PersistableUnlockableType persistableUnlockableType, Long l, UnlockMechanism[] unlockMechanismArr) {
            return new SelectByTypeAndUnlockMechanismQuery(persistableUnlockableType, l, unlockMechanismArr);
        }

        public final <R extends SelectByTypeAndUnlockMechanismModel> SelectByTypeAndUnlockMechanismMapper<R, T> selectByTypeAndUnlockMechanismMapper(SelectByTypeAndUnlockMechanismCreator<R> selectByTypeAndUnlockMechanismCreator) {
            return new SelectByTypeAndUnlockMechanismMapper(selectByTypeAndUnlockMechanismCreator, this);
        }

        public final <R extends SelectByTypeModel> SelectByTypeMapper<R, T> selectByTypeMapper(SelectByTypeCreator<R> selectByTypeCreator) {
            return new SelectByTypeMapper(selectByTypeCreator, this);
        }

        public final ainx selectChecksum() {
            return new ainx("SELECT\n    Unlockables.unlockableId,\n    Unlockables.checksum\nFROM Unlockables", new aioa(UnlockablesModel.TABLE_NAME));
        }

        public final <R extends SelectChecksumModel> SelectChecksumMapper<R> selectChecksumMapper(SelectChecksumCreator<R> selectChecksumCreator) {
            return new SelectChecksumMapper(selectChecksumCreator);
        }
    }

    public static final class SelectByTypeMapper<T extends SelectByTypeModel, T1 extends UnlockablesModel> implements ainw<T> {
        private final SelectByTypeCreator<T> creator;
        private final Factory<T1> unlockablesModelFactory;

        public SelectByTypeMapper(SelectByTypeCreator<T> selectByTypeCreator, Factory<T1> factory) {
            this.creator = selectByTypeCreator;
            this.unlockablesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), (PersistableUnlockableType) this.unlockablesModelFactory.typeAdapter.decode(Long.valueOf(cursor.getLong(1))), (UnlockMechanism) this.unlockablesModelFactory.unlockMechanismAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : (Geofence) this.unlockablesModelFactory.geofenceAdapter.decode(cursor.getString(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.getBlob(5), cursor.getLong(6), cursor.isNull(7) ? null : cursor.getBlob(7));
        }
    }

    public static final class SelectAllFromUnlockablesMapper<T extends SelectAllFromUnlockablesModel, T1 extends UnlockablesModel> implements ainw<T> {
        private final SelectAllFromUnlockablesCreator<T> creator;
        private final Factory<T1> unlockablesModelFactory;

        public SelectAllFromUnlockablesMapper(SelectAllFromUnlockablesCreator<T> selectAllFromUnlockablesCreator, Factory<T1> factory) {
            this.creator = selectAllFromUnlockablesCreator;
            this.unlockablesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            SelectAllFromUnlockablesCreator selectAllFromUnlockablesCreator = this.creator;
            long j = cursor.getLong(0);
            UnlockMechanism unlockMechanism = (UnlockMechanism) this.unlockablesModelFactory.unlockMechanismAdapter.decode(Long.valueOf(cursor.getLong(1)));
            byte[] bArr = null;
            Geofence geofence = cursor.isNull(2) ? null : (Geofence) this.unlockablesModelFactory.geofenceAdapter.decode(cursor.getString(2));
            Long valueOf = cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3));
            boolean z = cursor.getInt(4) == 1;
            boolean z2 = cursor.getInt(5) == 1;
            if (!cursor.isNull(6)) {
                bArr = cursor.getBlob(6);
            }
            return selectAllFromUnlockablesCreator.create(j, unlockMechanism, geofence, valueOf, z, z2, bArr);
        }
    }

    public static final class SelectChecksumMapper<T extends SelectChecksumModel> implements ainw<T> {
        private final SelectChecksumCreator<T> creator;

        public SelectChecksumMapper(SelectChecksumCreator<T> selectChecksumCreator) {
            this.creator = selectChecksumCreator;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), cursor.isNull(1) ? null : cursor.getBlob(1));
        }
    }

    public interface SelectAllFromUnlockablesModel {
        byte[] checksum();

        Long expirationTime();

        Geofence geofence();

        boolean highSensitivity();

        boolean lowSensitivity();

        UnlockMechanism unlockMechanism();

        long unlockableId();
    }

    public interface SelectChecksumModel {
        byte[] checksum();

        long unlockableId();
    }

    public static final class UpsertUnlockable extends ainy {
        private final Factory<? extends UnlockablesModel> unlockablesModelFactory;

        public UpsertUnlockable(pa paVar, Factory<? extends UnlockablesModel> factory) {
            super(UnlockablesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Unlockables (\n    unlockableId,\n    type,\n    unlockMechanism,\n    data,\n    dataVersion,\n    lowSensitivity,\n    highSensitivity,\n    geofence,\n    expirationTime,\n    removedLocally,\n    checksum)\nVALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9,\n    (SELECT removedLocally FROM Unlockables WHERE unlockableId = ?1),\n    ?10\n)"));
            this.unlockablesModelFactory = factory;
        }

        public final void bind(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, byte[] bArr2) {
            bindLong(1, j);
            bindLong(2, ((Long) this.unlockablesModelFactory.typeAdapter.encode(persistableUnlockableType)).longValue());
            bindLong(3, ((Long) this.unlockablesModelFactory.unlockMechanismAdapter.encode(unlockMechanism)).longValue());
            bindBlob(4, bArr);
            bindLong(5, j2);
            j = 1;
            bindLong(6, z ? 1 : 0);
            if (!z2) {
                j = 0;
            }
            bindLong(7, j);
            if (geofence == null) {
                bindNull(8);
            } else {
                bindString(8, (String) this.unlockablesModelFactory.geofenceAdapter.encode(geofence));
            }
            if (l == null) {
                bindNull(9);
            } else {
                bindLong(9, l.longValue());
            }
            if (bArr2 == null) {
                bindNull(10);
            } else {
                bindBlob(10, bArr2);
            }
        }
    }

    public interface SelectByIdsCreator<T extends SelectByIdsModel> {
        T create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2);
    }

    public interface SelectByIdsModel {
        byte[] checksum();

        byte[] data();

        long dataVersion();

        Long expirationTime();

        Geofence geofence();

        PersistableUnlockableType type();

        UnlockMechanism unlockMechanism();

        long unlockableId();
    }

    public interface SelectByTypeAndUnlockMechanismCreator<T extends SelectByTypeAndUnlockMechanismModel> {
        T create(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2);
    }

    public interface SelectByTypeAndUnlockMechanismModel {
        byte[] checksum();

        byte[] data();

        long dataVersion();

        Long expirationTime();

        Geofence geofence();

        PersistableUnlockableType type();

        UnlockMechanism unlockMechanism();

        long unlockableId();
    }

    public interface SelectByTypeModel {
        byte[] checksum();

        byte[] data();

        long dataVersion();

        Long expirationTime();

        Geofence geofence();

        PersistableUnlockableType type();

        UnlockMechanism unlockMechanism();

        long unlockableId();
    }

    public static final class Mapper<T extends UnlockablesModel> implements ainw<T> {
        private final Factory<T> unlockablesModelFactory;

        public Mapper(Factory<T> factory) {
            this.unlockablesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Cursor cursor2 = cursor;
            return this.unlockablesModelFactory.creator.create(cursor2.getLong(0), (PersistableUnlockableType) this.unlockablesModelFactory.typeAdapter.decode(Long.valueOf(cursor2.getLong(1))), (UnlockMechanism) this.unlockablesModelFactory.unlockMechanismAdapter.decode(Long.valueOf(cursor2.getLong(2))), cursor2.getBlob(3), cursor2.getLong(4), cursor2.getInt(5) == 1, cursor2.getInt(6) == 1, cursor2.isNull(7) ? null : (Geofence) this.unlockablesModelFactory.geofenceAdapter.decode(cursor2.getString(7)), cursor2.isNull(8) ? null : Long.valueOf(cursor2.getLong(8)), cursor2.getLong(9), cursor2.getInt(10), cursor2.getInt(11) == 1, cursor2.isNull(12) ? null : cursor2.getBlob(12));
        }
    }

    public static final class SelectByIdsMapper<T extends SelectByIdsModel, T1 extends UnlockablesModel> implements ainw<T> {
        private final SelectByIdsCreator<T> creator;
        private final Factory<T1> unlockablesModelFactory;

        public SelectByIdsMapper(SelectByIdsCreator<T> selectByIdsCreator, Factory<T1> factory) {
            this.creator = selectByIdsCreator;
            this.unlockablesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), (PersistableUnlockableType) this.unlockablesModelFactory.typeAdapter.decode(Long.valueOf(cursor.getLong(1))), (UnlockMechanism) this.unlockablesModelFactory.unlockMechanismAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : (Geofence) this.unlockablesModelFactory.geofenceAdapter.decode(cursor.getString(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.getBlob(5), cursor.getLong(6), cursor.isNull(7) ? null : cursor.getBlob(7));
        }
    }

    public static final class SelectByTypeAndUnlockMechanismMapper<T extends SelectByTypeAndUnlockMechanismModel, T1 extends UnlockablesModel> implements ainw<T> {
        private final SelectByTypeAndUnlockMechanismCreator<T> creator;
        private final Factory<T1> unlockablesModelFactory;

        public SelectByTypeAndUnlockMechanismMapper(SelectByTypeAndUnlockMechanismCreator<T> selectByTypeAndUnlockMechanismCreator, Factory<T1> factory) {
            this.creator = selectByTypeAndUnlockMechanismCreator;
            this.unlockablesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.creator.create(cursor.getLong(0), (PersistableUnlockableType) this.unlockablesModelFactory.typeAdapter.decode(Long.valueOf(cursor.getLong(1))), (UnlockMechanism) this.unlockablesModelFactory.unlockMechanismAdapter.decode(Long.valueOf(cursor.getLong(2))), cursor.isNull(3) ? null : (Geofence) this.unlockablesModelFactory.geofenceAdapter.decode(cursor.getString(3)), cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4)), cursor.getBlob(5), cursor.getLong(6), cursor.isNull(7) ? null : cursor.getBlob(7));
        }
    }

    public static final class UpdateExpirationTime extends ainy {
        public UpdateExpirationTime(pa paVar) {
            super(UnlockablesModel.TABLE_NAME, paVar.a("UPDATE Unlockables\nSET expirationTime = ?\nWHERE unlockableId = ?"));
        }

        public final void bind(Long l, long j) {
            if (l == null) {
                bindNull(1);
            } else {
                bindLong(1, l.longValue());
            }
            bindLong(2, j);
        }
    }

    public static final class UpdateRemovedLocallyUnlockable extends ainy {
        public UpdateRemovedLocallyUnlockable(pa paVar) {
            super(UnlockablesModel.TABLE_NAME, paVar.a("UPDATE Unlockables\nSET removedLocally = ?\nWHERE unlockableId = ?"));
        }

        public final void bind(boolean z, long j) {
            bindLong(1, z ? 1 : 0);
            bindLong(2, j);
        }
    }

    public static final class UpsertLocIndependentUnlockable extends ainy {
        private final Factory<? extends UnlockablesModel> unlockablesModelFactory;

        public UpsertLocIndependentUnlockable(pa paVar, Factory<? extends UnlockablesModel> factory) {
            super(UnlockablesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Unlockables (\n    unlockableId,\n    type,\n    unlockMechanism,\n    data,\n    dataVersion,\n    expirationTime,\n    updateTime,\n    orderPosition,\n    removedLocally,\n    checksum)\nVALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8,\n    (SELECT removedLocally FROM Unlockables WHERE unlockableId = ?1),\n    ?9\n)"));
            this.unlockablesModelFactory = factory;
        }

        public final void bind(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, Long l, long j3, int i, byte[] bArr2) {
            bindLong(1, j);
            bindLong(2, ((Long) this.unlockablesModelFactory.typeAdapter.encode(persistableUnlockableType)).longValue());
            bindLong(3, ((Long) this.unlockablesModelFactory.unlockMechanismAdapter.encode(unlockMechanism)).longValue());
            bindBlob(4, bArr);
            bindLong(5, j2);
            if (l == null) {
                bindNull(6);
            } else {
                bindLong(6, l.longValue());
            }
            bindLong(7, j3);
            bindLong(8, (long) i);
            if (bArr2 == null) {
                bindNull(9);
            } else {
                bindBlob(9, bArr2);
            }
        }
    }

    byte[] checksum();

    byte[] data();

    long dataVersion();

    Long expirationTime();

    Geofence geofence();

    boolean highSensitivity();

    boolean lowSensitivity();

    int orderPosition();

    boolean removedLocally();

    PersistableUnlockableType type();

    UnlockMechanism unlockMechanism();

    long unlockableId();

    long updateTime();
}
