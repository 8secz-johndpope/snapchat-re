package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: gbi */
public final class gbi implements DbSchema {
    private final hws a;

    /* renamed from: gbi$a */
    public enum a implements IndexSpec {
        DURABLE_JOB_UUID("durable_job_uuid", b.DURABLE_JOB_TABLE, true, gbk.b),
        DURABLE_JOB_UNIQUE_TAG("durable_job_unique_tag", b.DURABLE_JOB_TABLE, false, gbk.d),
        DURABLE_JOB_SCOPE("durable_job_scope", b.DURABLE_JOB_TABLE, false, gbk.c),
        DURABLE_JOB_GROUP_TAG("durable_job_group_tag", b.DURABLE_JOB_TABLE, false, gbk.e);
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

        private a(String str, TableSpec tableSpec, boolean z, String... strArr) {
            this.indexName = str;
            this.table = tableSpec;
            this.unique = z;
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

    /* renamed from: gbi$b */
    public enum b implements TableSpec {
        DURABLE_JOB_TABLE(gbk.h);
        
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

    public gbi(hws hws) {
        akcr.b(hws, "jobScheduler");
        this.a = hws;
    }

    public final /* bridge */ /* synthetic */ ide getAttribution() {
        return hwj.a;
    }

    public final String getDatabaseName() {
        return "durable_job";
    }

    public final List<a> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return new gbj(this.a, this);
    }

    public final List<b> getTables() {
        return ajyh.a((Object[]) b.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 7;
    }
}
