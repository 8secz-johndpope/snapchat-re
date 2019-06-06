package com.snap.core.db.api;

public interface IndexSpec {
    String[] getIndexColumns();

    String getIndexName();

    TableSpec getTable();

    boolean getUnique();
}
