package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: wso */
public final class wso implements DbSchema {

    /* renamed from: wso$a */
    public enum a implements IndexSpec {
        ;
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

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

    /* renamed from: wso$b */
    public enum b implements TableSpec {
        DURABLE_JOB_TABLE(wsm.d);
        
        private final String creationStatement;
        private final String tableName;
        private final TableType tableType;

        private b(String str, TableType tableType) {
            this.tableName = r3;
            this.creationStatement = str;
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
        return wqv.g;
    }

    public final String getDatabaseName() {
        return "shake2report";
    }

    public final List<a> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return new wsp(this);
    }

    public final List<b> getTables() {
        return ajyh.a((Object[]) b.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 2;
    }
}
