package defpackage;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.DbSchemaVersionController;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import java.util.List;

/* renamed from: ohg */
public final class ohg implements DbSchema {

    /* renamed from: ohg$a */
    public enum a implements IndexSpec {
        MEDIA_PACKAGE_SESSION_ID("media_package_session_id", b.MEDIA_PACKAGE_TABLE, ohi.c),
        MEDIA_PACKAGE_FILE_LOOKUP_SESSION_ID("media_package_file_lookup_session_id", b.MEDIA_PACKAGE_FILE_LOOKUP_TABLE, ohf.b),
        MEDIA_PACKAGE_FILE_LOOKUP_URI("media_package_file_lookup_uri", b.MEDIA_PACKAGE_FILE_LOOKUP_TABLE, ohf.c);
        
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

    /* renamed from: ohg$b */
    public enum b implements TableSpec {
        MEDIA_PACKAGE_TABLE(ohi.a, ohi.e),
        MEDIA_PACKAGE_FILE_LOOKUP_TABLE(ohf.a, ohf.d),
        MEDIA_PACKAGE_SHARED_FILES(ohk.a, ohk.f);
        
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
        return yet.a;
    }

    public final String getDatabaseName() {
        return "media_packages";
    }

    public final List<a> getIndices() {
        return ajyh.a((Object[]) a.values());
    }

    public final /* synthetic */ DbSchemaVersionController getSchemaVersionController() {
        return new ohh(this);
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
