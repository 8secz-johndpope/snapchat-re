package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: hzv */
public final class hzv implements DbSchema {
    private final String a;

    /* renamed from: hzv$a */
    public enum a implements IndexSpec {
        SNAP_ENCRYPTION_KEY_TABLE_TIMESTAMP_INDEX(b.SNAP_ENCRYPTION_KEY, hzz.c);
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

        private a(TableSpec tableSpec, String... strArr) {
            this.indexName = r3;
            this.table = tableSpec;
            this.unique = false;
            this.indexColumns = strArr;
        }

        public final String[] getIndexColumns() {
            return this.indexColumns;
        }

        public final String getIndexName() {
            return this.indexName;
        }

        public final TableSpec getTable() {
            return this.table;
        }

        public final boolean getUnique() {
            return this.unique;
        }
    }

    /* renamed from: hzv$b */
    public enum b implements TableSpec {
        FRIEND_DEVICE_INFO(hzy.a, hzy.b),
        USER_IDENTITY(iab.a, iab.b),
        SNAP_ENCRYPTION_KEY(hzz.a, hzz.b);
        
        private final String creationStatement;
        private final String tableName;
        private final TableType tableType;

        private b(String str, String str2, TableType tableType) {
            this.tableName = str;
            this.creationStatement = str2;
            this.tableType = tableType;
        }

        public final String getCreationStatement() {
            return this.creationStatement;
        }

        public final String getTableName() {
            return this.tableName;
        }

        public final TableType getTableType() {
            return this.tableType;
        }
    }

    public hzv(String str) {
        akcr.b(str, "dbName");
        this.a = str;
    }

    public final /* bridge */ /* synthetic */ ide getAttribution() {
        return hyn.a;
    }

    public final String getDatabaseName() {
        return this.a;
    }

    public final List<a> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return new hzw(this);
    }

    public final List<b> getTables() {
        return ajyh.a((Object[]) b.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 6;
    }
}
