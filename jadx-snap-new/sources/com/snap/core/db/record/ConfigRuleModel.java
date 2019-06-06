package com.snap.core.db.record;

import android.database.Cursor;
import defpackage.acbz;
import defpackage.ainu;
import defpackage.ainw;
import defpackage.ainx;
import defpackage.ainy;
import defpackage.aioa;
import defpackage.pa;
import defpackage.pc;

public interface ConfigRuleModel {
    @Deprecated
    public static final String CONFIG_ID = "config_id";
    @Deprecated
    public static final String CONFIG_RESULT = "config_result";
    public static final String CREATEINDEX = "CREATE UNIQUE INDEX IF NOT EXISTS config_id_index ON ConfigRule(config_id)";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS ConfigRule (\n    _id INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,\n    rule_id BLOB NOT NULL,\n    config_id TEXT NOT NULL,\n    priority INTEGER,\n    config_result BLOB NOT NULL,\n    last_updated INTEGER NOT NULL,\n    ttl INTEGER NOT NULL\n)";
    @Deprecated
    public static final String LAST_UPDATED = "last_updated";
    @Deprecated
    public static final String PRIORITY = "priority";
    @Deprecated
    public static final String RULE_ID = "rule_id";
    @Deprecated
    public static final String TABLE_NAME = "ConfigRule";
    @Deprecated
    public static final String TTL = "ttl";
    @Deprecated
    public static final String _ID = "_id";

    public interface Creator<T extends ConfigRuleModel> {
        T create(long j, byte[] bArr, String str, Long l, acbz acbz, long j2, long j3);
    }

    public static final class Factory<T extends ConfigRuleModel> {
        public final ainu<acbz, byte[]> config_resultAdapter;
        public final Creator<T> creator;

        final class SelectConfigRulesByConfigIdQuery extends ainx {
            private final String config_id;

            SelectConfigRulesByConfigIdQuery(String str) {
                super("SELECT * FROM ConfigRule\nWHERE config_id = ?1\nORDER BY priority DESC", new aioa(ConfigRuleModel.TABLE_NAME));
                this.config_id = str;
            }

            public final void bindTo(pc pcVar) {
                pcVar.bindString(1, this.config_id);
            }
        }

        public Factory(Creator<T> creator, ainu<acbz, byte[]> ainu) {
            this.creator = creator;
            this.config_resultAdapter = ainu;
        }

        public final ainx SelectConfigRulesByConfigId(String str) {
            return new SelectConfigRulesByConfigIdQuery(str);
        }

        public final Mapper<T> selectConfigRulesByConfigIdMapper() {
            return new Mapper(this);
        }
    }

    public static final class Mapper<T extends ConfigRuleModel> implements ainw<T> {
        private final Factory<T> configRuleModelFactory;

        public Mapper(Factory<T> factory) {
            this.configRuleModelFactory = factory;
        }

        public final T map(Cursor cursor) {
            return this.configRuleModelFactory.creator.create(cursor.getLong(0), cursor.getBlob(1), cursor.getString(2), cursor.isNull(3) ? null : Long.valueOf(cursor.getLong(3)), (acbz) this.configRuleModelFactory.config_resultAdapter.decode(cursor.getBlob(4)), cursor.getLong(5), cursor.getLong(6));
        }
    }

    public static final class RefreshAllTtls extends ainy {
        public RefreshAllTtls(pa paVar) {
            super(ConfigRuleModel.TABLE_NAME, paVar.a("UPDATE ConfigRule\nSET last_updated = ?\nWHERE last_updated < ?"));
        }

        public final void bind(long j, long j2) {
            bindLong(1, j);
            bindLong(2, j2);
        }
    }

    public static final class DeleteConfigByConfigId extends ainy {
        public DeleteConfigByConfigId(pa paVar) {
            super(ConfigRuleModel.TABLE_NAME, paVar.a("DELETE FROM ConfigRule WHERE config_id = ?"));
        }

        public final void bind(String str) {
            bindString(1, str);
        }
    }

    public static final class DeleteConfigRule extends ainy {
        public DeleteConfigRule(pa paVar) {
            super(ConfigRuleModel.TABLE_NAME, paVar.a("DELETE FROM ConfigRule WHERE config_id = ? AND rule_id = ?"));
        }

        public final void bind(String str, byte[] bArr) {
            bindString(1, str);
            bindBlob(2, bArr);
        }
    }

    public static final class InsertConfig extends ainy {
        private final Factory<? extends ConfigRuleModel> configRuleModelFactory;

        public InsertConfig(pa paVar, Factory<? extends ConfigRuleModel> factory) {
            super(ConfigRuleModel.TABLE_NAME, paVar.a("INSERT INTO ConfigRule(rule_id, config_id, priority,config_result, last_updated, ttl)\nVALUES (?, ?, ?, ?, ?, ?)"));
            this.configRuleModelFactory = factory;
        }

        public final void bind(byte[] bArr, String str, Long l, acbz acbz, long j, long j2) {
            bindBlob(1, bArr);
            bindString(2, str);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            bindBlob(4, (byte[]) this.configRuleModelFactory.config_resultAdapter.encode(acbz));
            bindLong(5, j);
            bindLong(6, j2);
        }
    }

    public static final class InsertOrReplaceConfig extends ainy {
        private final Factory<? extends ConfigRuleModel> configRuleModelFactory;

        public InsertOrReplaceConfig(pa paVar, Factory<? extends ConfigRuleModel> factory) {
            super(ConfigRuleModel.TABLE_NAME, paVar.a("INSERT OR REPLACE INTO ConfigRule(\n    rule_id,\n    config_id,\n    priority,\n    config_result,\n    last_updated,\n    ttl\n) VALUES (\n?, ?, ?, ?, ?, ?\n)"));
            this.configRuleModelFactory = factory;
        }

        public final void bind(byte[] bArr, String str, Long l, acbz acbz, long j, long j2) {
            bindBlob(1, bArr);
            bindString(2, str);
            if (l == null) {
                bindNull(3);
            } else {
                bindLong(3, l.longValue());
            }
            bindBlob(4, (byte[]) this.configRuleModelFactory.config_resultAdapter.encode(acbz));
            bindLong(5, j);
            bindLong(6, j2);
        }
    }

    long _id();

    String config_id();

    acbz config_result();

    long last_updated();

    Long priority();

    byte[] rule_id();

    long ttl();
}
