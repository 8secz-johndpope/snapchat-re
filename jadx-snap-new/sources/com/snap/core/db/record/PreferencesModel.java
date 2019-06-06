package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.ainz;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface PreferencesModel {
    @Deprecated
    public static final String BOOLEANVALUE = "booleanValue";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS Preferences (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    key TEXT NOT NULL,\n    type INTEGER NOT NULL,\n    booleanValue INTEGER,\n    intValue INTEGER,\n    longValue INTEGER,\n    floatValue REAL,\n    doubleValue REAL,\n    stringValue TEXT,\n    -- needSync, version added in version 6\n    needSync INTEGER,\n    version INTEGER,\n    UNIQUE(key, type) ON CONFLICT REPLACE\n)";
    @Deprecated
    public static final String DOUBLEVALUE = "doubleValue";
    @Deprecated
    public static final String FLOATVALUE = "floatValue";
    @Deprecated
    public static final String INTVALUE = "intValue";
    @Deprecated
    public static final String KEY = "key";
    @Deprecated
    public static final String LONGVALUE = "longValue";
    @Deprecated
    public static final String NEEDSYNC = "needSync";
    @Deprecated
    public static final String STRINGVALUE = "stringValue";
    @Deprecated
    public static final String TABLE_NAME = "Preferences";
    @Deprecated
    public static final String TYPE = "type";
    @Deprecated
    public static final String VERSION = "version";
    @Deprecated
    public static final String _ID = "_id";

    public static final class Factory<T extends PreferencesModel> {
        public final Creator<T> creator;

        final class SelectByKeyQuery extends ainx {
            private final String key;
            private final int type;

            SelectByKeyQuery(String str, int i) {
                super("SELECT * FROM Preferences\nWHERE key = ?1\n    AND type = ?2", new aioa(PreferencesModel.TABLE_NAME));
                this.key = str;
                this.type = i;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
                pcVar.bindLong(2, (long) this.type);
            }
        }

        final class SelectByKeysQuery extends ainx {
            private final String[] key;
            private final int type;

            SelectByKeysQuery(int i, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM Preferences\nWHERE type = ?1 AND key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(PreferencesModel.TABLE_NAME));
                this.type = i;
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, (long) this.type);
                String[] strArr = this.key;
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

        final class SelectAllByKeysQuery extends ainx {
            private final String[] key;

            SelectAllByKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM Preferences\nWHERE key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(PreferencesModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectAllByTypeQuery extends ainx {
            private final int type;

            SelectAllByTypeQuery(int i) {
                super("SELECT * FROM Preferences\nWHERE type = ?1", new aioa(PreferencesModel.TABLE_NAME));
                this.type = i;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, (long) this.type);
            }
        }

        final class DeleteKeysByTypeQuery extends ainx {
            private final String[] key;
            private final int type;

            DeleteKeysByTypeQuery(int i, String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Preferences\nWHERE type = ?1 AND key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(PreferencesModel.TABLE_NAME));
                this.type = i;
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindLong(1, (long) this.type);
                String[] strArr = this.key;
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

        final class DeleteKeysQuery extends ainx {
            private final String[] key;

            DeleteKeysQuery(String[] strArr) {
                StringBuilder stringBuilder = new StringBuilder("DELETE FROM Preferences\nWHERE key IN ");
                stringBuilder.append(ainz.a(strArr.length));
                super(stringBuilder.toString(), new aioa(PreferencesModel.TABLE_NAME));
                this.key = strArr;
            }

            public final void bindTo(pc pcVar) {
                String[] strArr = this.key;
                int length = strArr.length;
                int i = 1;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i + 1;
                    pcVar.bindString(i, strArr[i2]);
                    i2++;
                    i = i3;
                }
            }
        }

        final class SelectAllByFeatureQuery extends ainx {
            private final String arg1;

            SelectAllByFeatureQuery(String str) {
                super("SELECT * FROM Preferences\nWHERE key LIKE ?1||'~'||'%'", new aioa(PreferencesModel.TABLE_NAME));
                this.arg1 = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.arg1;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectByFeatureQuery extends ainx {
            private final String arg1;
            private final int type;

            SelectByFeatureQuery(String str, int i) {
                super("SELECT * FROM Preferences\nWHERE key LIKE ?1||'~'||'%'\n    AND type = ?2", new aioa(PreferencesModel.TABLE_NAME));
                this.arg1 = str;
                this.type = i;
            }

            public final void bindTo(pc pcVar) {
                String str = this.arg1;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
                pcVar.bindLong(2, (long) this.type);
            }
        }

        final class SelectByFeatureWithTweakQuery extends ainx {
            private final String arg1;

            SelectByFeatureWithTweakQuery(String str) {
                super("SELECT key.*, tweak.* FROM Preferences key\nLEFT JOIN Preferences tweak ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.type = 0\n    AND key.key LIKE ?1||'~'||'%'\nUNION ALL\nSELECT key.*,tweak.* FROM Preferences tweak\nLEFT JOIN Preferences key ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.key IS NULL\n    AND tweak.type = 1\n    AND tweak.key LIKE ?1||'~'||'%'", new aioa(PreferencesModel.TABLE_NAME));
                this.arg1 = str;
            }

            public final void bindTo(pc pcVar) {
                String str = this.arg1;
                if (str != null) {
                    pcVar.bindString(1, str);
                } else {
                    pcVar.bindNull(1);
                }
            }
        }

        final class SelectByKeyWithTweakQuery extends ainx {
            private final String key;

            SelectByKeyWithTweakQuery(String str) {
                super("SELECT key.*, tweak.* FROM Preferences key\nLEFT JOIN Preferences tweak ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.type = 0\n    AND key.key = ?1\nUNION ALL\nSELECT key.*,tweak.* FROM Preferences tweak\nLEFT JOIN Preferences key ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.key IS NULL\n    AND tweak.type = 1\n    AND tweak.key = ?1", new aioa(PreferencesModel.TABLE_NAME));
                this.key = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.key);
            }
        }

        public Factory(Creator<T> creator) {
            this.creator = creator;
        }

        public final ainx deleteKeys(String[] strArr) {
            return new DeleteKeysQuery(strArr);
        }

        public final ainx deleteKeysByType(int i, String[] strArr) {
            return new DeleteKeysByTypeQuery(i, strArr);
        }

        public final ainx selectAllByFeature(String str) {
            return new SelectAllByFeatureQuery(str);
        }

        public final Mapper<T> selectAllByFeatureMapper() {
            return new Mapper(this);
        }

        public final ainx selectAllByKeys(String[] strArr) {
            return new SelectAllByKeysQuery(strArr);
        }

        public final Mapper<T> selectAllByKeysMapper() {
            return new Mapper(this);
        }

        public final ainx selectAllByType(int i) {
            return new SelectAllByTypeQuery(i);
        }

        public final Mapper<T> selectAllByTypeMapper() {
            return new Mapper(this);
        }

        public final ainx selectAllFromPreferences() {
            return new ainx("SELECT * FROM Preferences", new aioa(PreferencesModel.TABLE_NAME));
        }

        public final Mapper<T> selectAllFromPreferencesMapper() {
            return new Mapper(this);
        }

        public final ainx selectAllWithTweak() {
            return new ainx("SELECT key.*, tweak.* FROM Preferences key\nLEFT JOIN Preferences tweak ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.type = 0\nUNION ALL\nSELECT key.*,tweak.* FROM Preferences tweak\nLEFT JOIN Preferences key ON (key.key = tweak.key AND key.type = 0 AND tweak.type = 1)\nWHERE key.key IS NULL\n    AND tweak.type = 1", new aioa(PreferencesModel.TABLE_NAME));
        }

        public final <R extends SelectAllWithTweakModel<T>> SelectAllWithTweakMapper<T, R> selectAllWithTweakMapper(SelectAllWithTweakCreator<T, R> selectAllWithTweakCreator) {
            return new SelectAllWithTweakMapper(selectAllWithTweakCreator, this);
        }

        public final ainx selectByFeature(String str, int i) {
            return new SelectByFeatureQuery(str, i);
        }

        public final Mapper<T> selectByFeatureMapper() {
            return new Mapper(this);
        }

        public final ainx selectByFeatureWithTweak(String str) {
            return new SelectByFeatureWithTweakQuery(str);
        }

        public final <R extends SelectByFeatureWithTweakModel<T>> SelectByFeatureWithTweakMapper<T, R> selectByFeatureWithTweakMapper(SelectByFeatureWithTweakCreator<T, R> selectByFeatureWithTweakCreator) {
            return new SelectByFeatureWithTweakMapper(selectByFeatureWithTweakCreator, this);
        }

        public final ainx selectByKey(String str, int i) {
            return new SelectByKeyQuery(str, i);
        }

        public final Mapper<T> selectByKeyMapper() {
            return new Mapper(this);
        }

        public final ainx selectByKeyWithTweak(String str) {
            return new SelectByKeyWithTweakQuery(str);
        }

        public final <R extends SelectByKeyWithTweakModel<T>> SelectByKeyWithTweakMapper<T, R> selectByKeyWithTweakMapper(SelectByKeyWithTweakCreator<T, R> selectByKeyWithTweakCreator) {
            return new SelectByKeyWithTweakMapper(selectByKeyWithTweakCreator, this);
        }

        public final ainx selectByKeys(int i, String[] strArr) {
            return new SelectByKeysQuery(i, strArr);
        }

        public final Mapper<T> selectByKeysMapper() {
            return new Mapper(this);
        }
    }

    public static final class SelectByKeyWithTweakMapper<T1 extends PreferencesModel, T extends SelectByKeyWithTweakModel<T1>> implements ainw<T> {
        private final SelectByKeyWithTweakCreator<T1, T> creator;
        private final Factory<T1> preferencesModelFactory;

        public SelectByKeyWithTweakMapper(SelectByKeyWithTweakCreator<T1, T> selectByKeyWithTweakCreator, Factory<T1> factory) {
            this.creator = selectByKeyWithTweakCreator;
            this.preferencesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            PreferencesModel preferencesModel;
            Cursor cursor2 = cursor;
            SelectByKeyWithTweakCreator selectByKeyWithTweakCreator = this.creator;
            boolean z = false;
            PreferencesModel preferencesModel2 = null;
            if (cursor2.isNull(0)) {
                preferencesModel = null;
            } else {
                Boolean bool;
                Boolean bool2;
                Creator creator = this.preferencesModelFactory.creator;
                long j = cursor2.getLong(0);
                String string = cursor2.getString(1);
                int i = cursor2.getInt(2);
                if (cursor2.isNull(3)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(cursor2.getInt(3) == 1);
                }
                Integer valueOf = cursor2.isNull(4) ? null : Integer.valueOf(cursor2.getInt(4));
                Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
                Float valueOf3 = cursor2.isNull(6) ? null : Float.valueOf(cursor2.getFloat(6));
                Double valueOf4 = cursor2.isNull(7) ? null : Double.valueOf(cursor2.getDouble(7));
                String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
                if (cursor2.isNull(9)) {
                    bool2 = null;
                } else {
                    bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
                }
                preferencesModel = creator.create(j, string, i, bool, valueOf, valueOf2, valueOf3, valueOf4, string2, bool2, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
            }
            if (!cursor2.isNull(11)) {
                Boolean bool3;
                Boolean bool4;
                Long valueOf5;
                Creator creator2 = this.preferencesModelFactory.creator;
                long j2 = cursor2.getLong(11);
                String string3 = cursor2.getString(12);
                int i2 = cursor2.getInt(13);
                if (cursor2.isNull(14)) {
                    bool3 = null;
                } else {
                    bool3 = Boolean.valueOf(cursor2.getInt(14) == 1);
                }
                Integer valueOf6 = cursor2.isNull(15) ? null : Integer.valueOf(cursor2.getInt(15));
                Long valueOf7 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
                Float valueOf8 = cursor2.isNull(17) ? null : Float.valueOf(cursor2.getFloat(17));
                Double valueOf9 = cursor2.isNull(18) ? null : Double.valueOf(cursor2.getDouble(18));
                String string4 = cursor2.isNull(19) ? null : cursor2.getString(19);
                if (cursor2.isNull(20)) {
                    bool4 = null;
                } else {
                    if (cursor2.getInt(20) == 1) {
                        z = true;
                    }
                    bool4 = Boolean.valueOf(z);
                }
                if (!cursor2.isNull(21)) {
                    valueOf5 = Long.valueOf(cursor2.getLong(21));
                }
                preferencesModel2 = creator2.create(j2, string3, i2, bool3, valueOf6, valueOf7, valueOf8, valueOf9, string4, bool4, valueOf5);
            }
            return selectByKeyWithTweakCreator.create(preferencesModel, preferencesModel2);
        }
    }

    public static final class SelectByFeatureWithTweakMapper<T1 extends PreferencesModel, T extends SelectByFeatureWithTweakModel<T1>> implements ainw<T> {
        private final SelectByFeatureWithTweakCreator<T1, T> creator;
        private final Factory<T1> preferencesModelFactory;

        public SelectByFeatureWithTweakMapper(SelectByFeatureWithTweakCreator<T1, T> selectByFeatureWithTweakCreator, Factory<T1> factory) {
            this.creator = selectByFeatureWithTweakCreator;
            this.preferencesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            PreferencesModel preferencesModel;
            Cursor cursor2 = cursor;
            SelectByFeatureWithTweakCreator selectByFeatureWithTweakCreator = this.creator;
            boolean z = false;
            PreferencesModel preferencesModel2 = null;
            if (cursor2.isNull(0)) {
                preferencesModel = null;
            } else {
                Boolean bool;
                Boolean bool2;
                Creator creator = this.preferencesModelFactory.creator;
                long j = cursor2.getLong(0);
                String string = cursor2.getString(1);
                int i = cursor2.getInt(2);
                if (cursor2.isNull(3)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(cursor2.getInt(3) == 1);
                }
                Integer valueOf = cursor2.isNull(4) ? null : Integer.valueOf(cursor2.getInt(4));
                Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
                Float valueOf3 = cursor2.isNull(6) ? null : Float.valueOf(cursor2.getFloat(6));
                Double valueOf4 = cursor2.isNull(7) ? null : Double.valueOf(cursor2.getDouble(7));
                String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
                if (cursor2.isNull(9)) {
                    bool2 = null;
                } else {
                    bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
                }
                preferencesModel = creator.create(j, string, i, bool, valueOf, valueOf2, valueOf3, valueOf4, string2, bool2, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
            }
            if (!cursor2.isNull(11)) {
                Boolean bool3;
                Boolean bool4;
                Long valueOf5;
                Creator creator2 = this.preferencesModelFactory.creator;
                long j2 = cursor2.getLong(11);
                String string3 = cursor2.getString(12);
                int i2 = cursor2.getInt(13);
                if (cursor2.isNull(14)) {
                    bool3 = null;
                } else {
                    bool3 = Boolean.valueOf(cursor2.getInt(14) == 1);
                }
                Integer valueOf6 = cursor2.isNull(15) ? null : Integer.valueOf(cursor2.getInt(15));
                Long valueOf7 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
                Float valueOf8 = cursor2.isNull(17) ? null : Float.valueOf(cursor2.getFloat(17));
                Double valueOf9 = cursor2.isNull(18) ? null : Double.valueOf(cursor2.getDouble(18));
                String string4 = cursor2.isNull(19) ? null : cursor2.getString(19);
                if (cursor2.isNull(20)) {
                    bool4 = null;
                } else {
                    if (cursor2.getInt(20) == 1) {
                        z = true;
                    }
                    bool4 = Boolean.valueOf(z);
                }
                if (!cursor2.isNull(21)) {
                    valueOf5 = Long.valueOf(cursor2.getLong(21));
                }
                preferencesModel2 = creator2.create(j2, string3, i2, bool3, valueOf6, valueOf7, valueOf8, valueOf9, string4, bool4, valueOf5);
            }
            return selectByFeatureWithTweakCreator.create(preferencesModel, preferencesModel2);
        }
    }

    public static final class Mapper<T extends PreferencesModel> implements ainw<T> {
        private final Factory<T> preferencesModelFactory;

        public Mapper(Factory<T> factory) {
            this.preferencesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            Boolean bool;
            Boolean bool2;
            Cursor cursor2 = cursor;
            Creator creator = this.preferencesModelFactory.creator;
            long j = cursor2.getLong(0);
            String string = cursor2.getString(1);
            int i = cursor2.getInt(2);
            if (cursor2.isNull(3)) {
                bool = null;
            } else {
                bool = Boolean.valueOf(cursor2.getInt(3) == 1);
            }
            Integer valueOf = cursor2.isNull(4) ? null : Integer.valueOf(cursor2.getInt(4));
            Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
            Float valueOf3 = cursor2.isNull(6) ? null : Float.valueOf(cursor2.getFloat(6));
            Double valueOf4 = cursor2.isNull(7) ? null : Double.valueOf(cursor2.getDouble(7));
            String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
            if (cursor2.isNull(9)) {
                bool2 = null;
            } else {
                bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
            }
            return creator.create(j, string, i, bool, valueOf, valueOf2, valueOf3, valueOf4, string2, bool2, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
        }
    }

    public interface Creator<T extends PreferencesModel> {
        T create(long j, String str, int i, Boolean bool, Integer num, Long l, Float f, Double d, String str2, Boolean bool2, Long l2);
    }

    public interface SelectByKeyWithTweakCreator<T1 extends PreferencesModel, T extends SelectByKeyWithTweakModel<T1>> {
        T create(T1 t1, T1 t12);
    }

    public interface SelectByFeatureWithTweakCreator<T1 extends PreferencesModel, T extends SelectByFeatureWithTweakModel<T1>> {
        T create(T1 t1, T1 t12);
    }

    public static final class SetString extends ainy {
        public SetString(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, stringValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, String str2) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
        }
    }

    public static final class DeleteKeyByType extends ainy {
        public DeleteKeyByType(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key = ?\n    AND type = ?"));
        }

        public final void bind(String str, int i) {
            bindString(1, str);
            bindLong(2, (long) i);
        }
    }

    public static final class SetFeatureBoolean extends ainy {
        public SetFeatureBoolean(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, booleanValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Boolean bool, Boolean bool2, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            long j = 1;
            if (bool == null) {
                bindNull(3);
            } else {
                bindLong(3, bool.booleanValue() ? 1 : 0);
            }
            if (bool2 == null) {
                bindNull(4);
            } else {
                if (!bool2.booleanValue()) {
                    j = 0;
                }
                bindLong(4, j);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
        }
    }

    public static final class SetLong extends ainy {
        public SetLong(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, longValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
        }
    }

    public static final class SetFeatureString extends ainy {
        public SetFeatureString(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, stringValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, String str2, Boolean bool, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (str2 == null) {
                bindNull(3);
            } else {
                bindString(3, str2);
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
        }
    }

    public static final class SetInteger extends ainy {
        public SetInteger(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, intValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, Integer num) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (num == null) {
                bindNull(3);
            } else {
                bindLong(3, (long) num.intValue());
            }
        }
    }

    public interface SelectAllWithTweakCreator<T1 extends PreferencesModel, T extends SelectAllWithTweakModel<T1>> {
        T create(T1 t1, T1 t12);
    }

    public interface SelectAllWithTweakModel<T1 extends PreferencesModel> {
        T1 key();

        T1 tweak();
    }

    public interface SelectByFeatureWithTweakModel<T1 extends PreferencesModel> {
        T1 key();

        T1 tweak();
    }

    public interface SelectByKeyWithTweakModel<T1 extends PreferencesModel> {
        T1 key();

        T1 tweak();
    }

    public static final class SelectAllWithTweakMapper<T1 extends PreferencesModel, T extends SelectAllWithTweakModel<T1>> implements ainw<T> {
        private final SelectAllWithTweakCreator<T1, T> creator;
        private final Factory<T1> preferencesModelFactory;

        public SelectAllWithTweakMapper(SelectAllWithTweakCreator<T1, T> selectAllWithTweakCreator, Factory<T1> factory) {
            this.creator = selectAllWithTweakCreator;
            this.preferencesModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            PreferencesModel preferencesModel;
            Cursor cursor2 = cursor;
            SelectAllWithTweakCreator selectAllWithTweakCreator = this.creator;
            boolean z = false;
            PreferencesModel preferencesModel2 = null;
            if (cursor2.isNull(0)) {
                preferencesModel = null;
            } else {
                Boolean bool;
                Boolean bool2;
                Creator creator = this.preferencesModelFactory.creator;
                long j = cursor2.getLong(0);
                String string = cursor2.getString(1);
                int i = cursor2.getInt(2);
                if (cursor2.isNull(3)) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(cursor2.getInt(3) == 1);
                }
                Integer valueOf = cursor2.isNull(4) ? null : Integer.valueOf(cursor2.getInt(4));
                Long valueOf2 = cursor2.isNull(5) ? null : Long.valueOf(cursor2.getLong(5));
                Float valueOf3 = cursor2.isNull(6) ? null : Float.valueOf(cursor2.getFloat(6));
                Double valueOf4 = cursor2.isNull(7) ? null : Double.valueOf(cursor2.getDouble(7));
                String string2 = cursor2.isNull(8) ? null : cursor2.getString(8);
                if (cursor2.isNull(9)) {
                    bool2 = null;
                } else {
                    bool2 = Boolean.valueOf(cursor2.getInt(9) == 1);
                }
                preferencesModel = creator.create(j, string, i, bool, valueOf, valueOf2, valueOf3, valueOf4, string2, bool2, cursor2.isNull(10) ? null : Long.valueOf(cursor2.getLong(10)));
            }
            if (!cursor2.isNull(11)) {
                Boolean bool3;
                Boolean bool4;
                Long valueOf5;
                Creator creator2 = this.preferencesModelFactory.creator;
                long j2 = cursor2.getLong(11);
                String string3 = cursor2.getString(12);
                int i2 = cursor2.getInt(13);
                if (cursor2.isNull(14)) {
                    bool3 = null;
                } else {
                    bool3 = Boolean.valueOf(cursor2.getInt(14) == 1);
                }
                Integer valueOf6 = cursor2.isNull(15) ? null : Integer.valueOf(cursor2.getInt(15));
                Long valueOf7 = cursor2.isNull(16) ? null : Long.valueOf(cursor2.getLong(16));
                Float valueOf8 = cursor2.isNull(17) ? null : Float.valueOf(cursor2.getFloat(17));
                Double valueOf9 = cursor2.isNull(18) ? null : Double.valueOf(cursor2.getDouble(18));
                String string4 = cursor2.isNull(19) ? null : cursor2.getString(19);
                if (cursor2.isNull(20)) {
                    bool4 = null;
                } else {
                    if (cursor2.getInt(20) == 1) {
                        z = true;
                    }
                    bool4 = Boolean.valueOf(z);
                }
                if (!cursor2.isNull(21)) {
                    valueOf5 = Long.valueOf(cursor2.getLong(21));
                }
                preferencesModel2 = creator2.create(j2, string3, i2, bool3, valueOf6, valueOf7, valueOf8, valueOf9, string4, bool4, valueOf5);
            }
            return selectAllWithTweakCreator.create(preferencesModel, preferencesModel2);
        }
    }

    public static final class DeleteAllByType extends ainy {
        public DeleteAllByType(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE type = ?"));
        }

        public final void bind(int i) {
            bindLong(1, (long) i);
        }
    }

    public static final class DeleteFeature extends ainy {
        public DeleteFeature(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key LIKE ?||'~'||'%'"));
        }

        public final void bind(String str) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
        }
    }

    public static final class DeleteFeatureByType extends ainy {
        public DeleteFeatureByType(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key LIKE ?||'~'||'%'\n    AND type = ?"));
        }

        public final void bind(String str, int i) {
            if (str == null) {
                bindNull(1);
            } else {
                bindString(1, str);
            }
            bindLong(2, (long) i);
        }
    }

    public static final class DeleteKey extends ainy {
        public DeleteKey(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class DeleteSyncToken extends ainy {
        public DeleteSyncToken(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key = 'GLOBAL~FRIENDS_FEED_SYNC_TOKEN'"));
        }
    }

    public static final class DeleteUnknownFeatures extends ainy {
        public DeleteUnknownFeatures(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("DELETE FROM Preferences\nWHERE key NOT REGEXP ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class SetBoolean extends ainy {
        public SetBoolean(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, booleanValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, Boolean bool) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (bool == null) {
                bindNull(3);
            } else {
                bindLong(3, bool.booleanValue() ? 1 : 0);
            }
        }
    }

    public static final class SetDouble extends ainy {
        public SetDouble(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, doubleValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, Double d) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (d == null) {
                bindNull(3);
            } else {
                bindDouble(3, d.doubleValue());
            }
        }
    }

    public static final class SetFeatureDouble extends ainy {
        public SetFeatureDouble(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, doubleValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Double d, Boolean bool, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (d == null) {
                bindNull(3);
            } else {
                bindDouble(3, d.doubleValue());
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
        }
    }

    public static final class SetFeatureFloat extends ainy {
        public SetFeatureFloat(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, floatValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Float f, Boolean bool, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (f == null) {
                bindNull(3);
            } else {
                bindDouble(3, (double) f.floatValue());
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
        }
    }

    public static final class SetFeatureInteger extends ainy {
        public SetFeatureInteger(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, intValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Integer num, Boolean bool, Long l) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (num == null) {
                bindNull(3);
            } else {
                bindLong(3, (long) num.intValue());
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
        }
    }

    public static final class SetFeatureLong extends ainy {
        public SetFeatureLong(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, longValue, needSync, version)\nVALUES(?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Long l, Boolean bool, Long l2) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            if (bool == null) {
                bindNull(4);
            } else {
                bindLong(4, bool.booleanValue() ? 1 : 0);
            }
            if (l2 == null) {
                bindNull(5);
            } else {
                bindLong(5, l2.longValue());
            }
        }
    }

    public static final class SetFloat extends ainy {
        public SetFloat(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(key, type, floatValue)\nVALUES(?, ?, ?)"));
        }

        public final void bind(String str, int i, Float f) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (f == null) {
                bindNull(3);
            } else {
                bindDouble(3, (double) f.floatValue());
            }
        }
    }

    public static final class SetKey extends ainy {
        public SetKey(pa paVar) {
            super(PreferencesModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO Preferences(\n    key,\n    type,\n    booleanValue,\n    intValue,\n    longValue,\n    floatValue,\n    doubleValue,\n    stringValue\n)\nVALUES(?, ?, ?, ?, ?, ?, ?, ?)"));
        }

        public final void bind(String str, int i, Boolean bool, Integer num, Long l, Float f, Double d, String str2) {
            bindString(1, str);
            bindLong(2, (long) i);
            if (bool == null) {
                bindNull(3);
            } else {
                bindLong(3, bool.booleanValue() ? 1 : 0);
            }
            if (num == null) {
                bindNull(4);
            } else {
                bindLong(4, (long) num.intValue());
            }
            if (l == null) {
                bindNull(5);
            } else {
                bindLong(5, l.longValue());
            }
            if (f == null) {
                bindNull(6);
            } else {
                bindDouble(6, (double) f.floatValue());
            }
            if (d == null) {
                bindNull(7);
            } else {
                bindDouble(7, d.doubleValue());
            }
            if (str2 == null) {
                bindNull(8);
            } else {
                bindString(8, str2);
            }
        }
    }

    long _id();

    Boolean booleanValue();

    Double doubleValue();

    Float floatValue();

    Integer intValue();

    String key();

    Long longValue();

    Boolean needSync();

    String stringValue();

    int type();

    Long version();
}
