package com.snap.core.db.api;

public interface TableSpec {
    String getCreationStatement();

    String getTableName();

    TableType getTableType();
}
