package com.snap.core.db.record;

import com.snap.core.db.column.ScreenshottedOrReplayedState;
import com.snap.core.db.column.SnapServerStatus;
import com.snap.core.db.record.MessageRecord.SnapUpdateInfoNew;
import defpackage.gcj;
import defpackage.gcm;

final class AutoValue_MessageRecord_SnapUpdateInfoNew extends SnapUpdateInfoNew {
    private final String convId;
    private final long feedRowId;
    private final String key;
    private final Long lastReadTimestamp;
    private final String lastReader;
    private final String lastWriter;
    private final gcj preserved;
    private final gcm savedStates;
    private final ScreenshottedOrReplayedState screenshottedOrReplayed;
    private final SnapServerStatus snapServerStatus;
    private final long timestamp;

    AutoValue_MessageRecord_SnapUpdateInfoNew(String str, SnapServerStatus snapServerStatus, long j, gcm gcm, gcj gcj, ScreenshottedOrReplayedState screenshottedOrReplayedState, Long l, String str2, String str3, String str4, long j2) {
        if (str != null) {
            this.key = str;
            this.snapServerStatus = snapServerStatus;
            this.timestamp = j;
            this.savedStates = gcm;
            if (gcj != null) {
                this.preserved = gcj;
                this.screenshottedOrReplayed = screenshottedOrReplayedState;
                this.lastReadTimestamp = l;
                this.lastReader = str2;
                this.lastWriter = str3;
                if (str4 != null) {
                    this.convId = str4;
                    this.feedRowId = j2;
                    return;
                }
                throw new NullPointerException("Null convId");
            }
            throw new NullPointerException("Null preserved");
        }
        throw new NullPointerException("Null key");
    }

    public final String convId() {
        return this.convId;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SnapUpdateInfoNew) {
            SnapUpdateInfoNew snapUpdateInfoNew = (SnapUpdateInfoNew) obj;
            if (this.key.equals(snapUpdateInfoNew.key())) {
                SnapServerStatus snapServerStatus = this.snapServerStatus;
                if (snapServerStatus != null ? !snapServerStatus.equals(snapUpdateInfoNew.snapServerStatus()) : snapUpdateInfoNew.snapServerStatus() != null) {
                    if (this.timestamp == snapUpdateInfoNew.timestamp()) {
                        gcm gcm = this.savedStates;
                        if (gcm != null ? !gcm.equals(snapUpdateInfoNew.savedStates()) : snapUpdateInfoNew.savedStates() != null) {
                            if (this.preserved.equals(snapUpdateInfoNew.preserved())) {
                                ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
                                if (screenshottedOrReplayedState != null ? !screenshottedOrReplayedState.equals(snapUpdateInfoNew.screenshottedOrReplayed()) : snapUpdateInfoNew.screenshottedOrReplayed() != null) {
                                    Long l = this.lastReadTimestamp;
                                    if (l != null ? !l.equals(snapUpdateInfoNew.lastReadTimestamp()) : snapUpdateInfoNew.lastReadTimestamp() != null) {
                                        String str = this.lastReader;
                                        if (str != null ? !str.equals(snapUpdateInfoNew.lastReader()) : snapUpdateInfoNew.lastReader() != null) {
                                            str = this.lastWriter;
                                            if (str != null ? !str.equals(snapUpdateInfoNew.lastWriter()) : snapUpdateInfoNew.lastWriter() != null) {
                                                return this.convId.equals(snapUpdateInfoNew.convId()) && this.feedRowId == snapUpdateInfoNew.feedRowId();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final long feedRowId() {
        return this.feedRowId;
    }

    public final int hashCode() {
        int hashCode = (this.key.hashCode() ^ 1000003) * 1000003;
        SnapServerStatus snapServerStatus = this.snapServerStatus;
        int i = 0;
        hashCode = (hashCode ^ (snapServerStatus == null ? 0 : snapServerStatus.hashCode())) * 1000003;
        long j = this.timestamp;
        hashCode = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        gcm gcm = this.savedStates;
        hashCode = (((hashCode ^ (gcm == null ? 0 : gcm.hashCode())) * 1000003) ^ this.preserved.hashCode()) * 1000003;
        ScreenshottedOrReplayedState screenshottedOrReplayedState = this.screenshottedOrReplayed;
        hashCode = (hashCode ^ (screenshottedOrReplayedState == null ? 0 : screenshottedOrReplayedState.hashCode())) * 1000003;
        Long l = this.lastReadTimestamp;
        hashCode = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        String str = this.lastReader;
        hashCode = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        str = this.lastWriter;
        if (str != null) {
            i = str.hashCode();
        }
        hashCode = (((hashCode ^ i) * 1000003) ^ this.convId.hashCode()) * 1000003;
        long j2 = this.feedRowId;
        return hashCode ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String key() {
        return this.key;
    }

    public final Long lastReadTimestamp() {
        return this.lastReadTimestamp;
    }

    public final String lastReader() {
        return this.lastReader;
    }

    public final String lastWriter() {
        return this.lastWriter;
    }

    public final gcj preserved() {
        return this.preserved;
    }

    public final gcm savedStates() {
        return this.savedStates;
    }

    public final ScreenshottedOrReplayedState screenshottedOrReplayed() {
        return this.screenshottedOrReplayed;
    }

    public final SnapServerStatus snapServerStatus() {
        return this.snapServerStatus;
    }

    public final long timestamp() {
        return this.timestamp;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapUpdateInfoNew{key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", snapServerStatus=");
        stringBuilder.append(this.snapServerStatus);
        stringBuilder.append(", timestamp=");
        stringBuilder.append(this.timestamp);
        stringBuilder.append(", savedStates=");
        stringBuilder.append(this.savedStates);
        stringBuilder.append(", preserved=");
        stringBuilder.append(this.preserved);
        stringBuilder.append(", screenshottedOrReplayed=");
        stringBuilder.append(this.screenshottedOrReplayed);
        stringBuilder.append(", lastReadTimestamp=");
        stringBuilder.append(this.lastReadTimestamp);
        stringBuilder.append(", lastReader=");
        stringBuilder.append(this.lastReader);
        stringBuilder.append(", lastWriter=");
        stringBuilder.append(this.lastWriter);
        stringBuilder.append(", convId=");
        stringBuilder.append(this.convId);
        stringBuilder.append(", feedRowId=");
        stringBuilder.append(this.feedRowId);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
