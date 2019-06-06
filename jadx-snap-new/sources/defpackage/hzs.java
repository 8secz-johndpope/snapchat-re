package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: hzs */
public final class hzs implements DbSchema {
    private final hyk a;
    private final hyo b;

    /* renamed from: hzs$a */
    public enum a implements IndexSpec {
        ;
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
    }

    /* renamed from: hzs$b */
    public enum b implements TableSpec {
        USER_DEVICE(iaa.b);
        
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

    public hzs(hyk hyk, hyo hyo) {
        akcr.b(hyk, "fideliusEventLogger");
        akcr.b(hyo, "fideliusFeatureFlagManager");
        this.a = hyk;
        this.b = hyo;
    }

    public final /* bridge */ /* synthetic */ ide getAttribution() {
        return hyn.a;
    }

    public final String getDatabaseName() {
        return "fidelius_database.db";
    }

    public final List<a> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return new hzt(this, this.a, this.b);
    }

    public final List<b> getTables() {
        return ajyh.a((Object[]) b.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 9;
    }
}
