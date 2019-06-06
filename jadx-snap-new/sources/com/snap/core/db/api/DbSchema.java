package com.snap.core.db.api;

import defpackage.ide;
import java.util.List;

public interface DbSchema {
    ide getAttribution();

    String getDatabaseName();

    List<IndexSpec> getIndices();

    DbSchemaVersionController getSchemaVersionController();

    List<TableSpec> getTables();

    List<TriggerSpec> getTriggers();

    int getVersion();
}
