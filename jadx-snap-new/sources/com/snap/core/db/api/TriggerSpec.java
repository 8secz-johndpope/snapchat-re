package com.snap.core.db.api;

public interface TriggerSpec {
    String getTableName();

    String getTriggerName();

    String getTriggerStatement();
}
