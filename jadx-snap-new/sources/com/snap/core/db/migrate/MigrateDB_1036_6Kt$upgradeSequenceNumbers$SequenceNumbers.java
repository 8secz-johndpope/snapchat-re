package com.snap.core.db.migrate;

public final class MigrateDB_1036_6Kt$upgradeSequenceNumbers$SequenceNumbers {
    private Long processedEarliest;
    private Long processedLatest;
    private Long serverEarliest;
    private Long serverLatest;
    private Long update;

    public final Long getProcessedEarliest() {
        return this.processedEarliest;
    }

    public final Long getProcessedLatest() {
        return this.processedLatest;
    }

    public final Long getServerEarliest() {
        return this.serverEarliest;
    }

    public final Long getServerLatest() {
        return this.serverLatest;
    }

    public final Long getUpdate() {
        return this.update;
    }

    public final void setProcessedEarliest(Long l) {
        this.processedEarliest = l;
    }

    public final void setProcessedLatest(Long l) {
        this.processedLatest = l;
    }

    public final void setServerEarliest(Long l) {
        this.serverEarliest = l;
    }

    public final void setServerLatest(Long l) {
        this.serverLatest = l;
    }

    public final void setUpdate(Long l) {
        this.update = l;
    }
}
