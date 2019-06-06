package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: yfi */
public final class yfi implements DbSchema {
    private final yff a = new yff(this);

    /* renamed from: yfi$a */
    public enum a implements IndexSpec {
        JOURNAL_ENTRY_KEY("journal_entry_key", b.JOURNAL_ENTRY, yfg.c, yfg.d),
        JOURNAL_ENTRY_STATUS("journal_entry_status", b.JOURNAL_ENTRY, yfg.c, yfg.f),
        JOURNAL_ENTRY_READ_TIME("journal_entry_read_time", r20, r2);
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

        private a(String str, TableSpec tableSpec, String... strArr) {
            this.indexName = str;
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

    /* renamed from: yfi$b */
    public enum b implements TableSpec {
        JOURNAL(yfh.a, yfh.b),
        JOURNAL_ENTRY(yfg.a, yfg.b);
        
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

    public final /* bridge */ /* synthetic */ ide getAttribution() {
        return yfe.a;
    }

    public final String getDatabaseName() {
        return "journal.db";
    }

    public final List<IndexSpec> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* bridge */ /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return this.a;
    }

    public final List<b> getTables() {
        return ajyh.a((Object[]) b.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 3;
    }
}
