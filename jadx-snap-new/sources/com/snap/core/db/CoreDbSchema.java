package com.snap.core.db;

import com.snap.core.db.api.DbSchema;
import com.snap.core.db.api.IndexSpec;
import com.snap.core.db.api.SnapDbCoreFeature;
import com.snap.core.db.api.TableSpec;
import com.snap.core.db.api.TableType;
import com.snap.core.db.api.TriggerSpec;
import defpackage.ajyh;
import defpackage.ajyi;
import defpackage.ajyw;
import java.util.List;

public final class CoreDbSchema implements DbSchema {

    public enum Indices implements IndexSpec {
        DATA_FETCHED_TIME("data_fetched_time", Tables.DATA_CONSUMPTION, false, DataConsumptionModel.Companion.getFETCHBEGINTIMESTAMP()),
        FIRST_ACCESSED_TIME("first_accessed_time", Tables.DATA_CONSUMPTION, false, DataConsumptionModel.Companion.getFIRSTACCESSEDTIMESTAMP());
        
        private final String[] indexColumns;
        private final String indexName;
        private final TableSpec table;
        private final boolean unique;

        private Indices(String str, TableSpec tableSpec, boolean z, String... strArr) {
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

    public enum Tables implements TableSpec {
        DATA_CONSUMPTION(DataConsumptionModel.Companion.getTABLE_NAME(), DataConsumptionModel.Companion.getCREATE_TABLE(), null, 4, null);
        
        private final String creationStatement;
        private final String tableName;
        private final TableType tableType;

        private Tables(String str, String str2, TableType tableType) {
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

    public final SnapDbCoreFeature getAttribution() {
        return SnapDbCoreFeature.INSTANCE;
    }

    public final String getDatabaseName() {
        return "core.db";
    }

    public final List<Indices> getIndices() {
        return ajyh.a((Object[]) Indices.values());
    }

    public final CoreDbSchemaVersionController getSchemaVersionController() {
        return new CoreDbSchemaVersionController(this);
    }

    public final List<Tables> getTables() {
        return ajyi.i(Tables.values());
    }

    public final List<TriggerSpec> getTriggers() {
        return ajyw.a;
    }

    public final int getVersion() {
        return 3;
    }
}
