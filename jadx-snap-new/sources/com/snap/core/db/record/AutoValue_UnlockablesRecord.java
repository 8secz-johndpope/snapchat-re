package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snapchat.soju.android.Geofence;
import java.util.Arrays;

final class AutoValue_UnlockablesRecord extends UnlockablesRecord {
    private final byte[] checksum;
    private final byte[] data;
    private final long dataVersion;
    private final Long expirationTime;
    private final Geofence geofence;
    private final boolean highSensitivity;
    private final boolean lowSensitivity;
    private final int orderPosition;
    private final boolean removedLocally;
    private final PersistableUnlockableType type;
    private final UnlockMechanism unlockMechanism;
    private final long unlockableId;
    private final long updateTime;

    AutoValue_UnlockablesRecord(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, byte[] bArr, long j2, boolean z, boolean z2, Geofence geofence, Long l, long j3, int i, boolean z3, byte[] bArr2) {
        PersistableUnlockableType persistableUnlockableType2 = persistableUnlockableType;
        UnlockMechanism unlockMechanism2 = unlockMechanism;
        byte[] bArr3 = bArr;
        this.unlockableId = j;
        if (persistableUnlockableType2 != null) {
            this.type = persistableUnlockableType2;
            if (unlockMechanism2 != null) {
                this.unlockMechanism = unlockMechanism2;
                if (bArr3 != null) {
                    this.data = bArr3;
                    this.dataVersion = j2;
                    this.lowSensitivity = z;
                    this.highSensitivity = z2;
                    this.geofence = geofence;
                    this.expirationTime = l;
                    this.updateTime = j3;
                    this.orderPosition = i;
                    this.removedLocally = z3;
                    this.checksum = bArr2;
                    return;
                }
                throw new NullPointerException("Null data");
            }
            throw new NullPointerException("Null unlockMechanism");
        }
        throw new NullPointerException("Null type");
    }

    public final byte[] checksum() {
        return this.checksum;
    }

    public final byte[] data() {
        return this.data;
    }

    public final long dataVersion() {
        return this.dataVersion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UnlockablesRecord) {
            UnlockablesRecord unlockablesRecord = (UnlockablesRecord) obj;
            if (this.unlockableId == unlockablesRecord.unlockableId() && this.type.equals(unlockablesRecord.type()) && this.unlockMechanism.equals(unlockablesRecord.unlockMechanism())) {
                boolean z = unlockablesRecord instanceof AutoValue_UnlockablesRecord;
                if (Arrays.equals(this.data, z ? ((AutoValue_UnlockablesRecord) unlockablesRecord).data : unlockablesRecord.data()) && this.dataVersion == unlockablesRecord.dataVersion() && this.lowSensitivity == unlockablesRecord.lowSensitivity() && this.highSensitivity == unlockablesRecord.highSensitivity()) {
                    Geofence geofence = this.geofence;
                    if (geofence != null ? !geofence.equals(unlockablesRecord.geofence()) : unlockablesRecord.geofence() != null) {
                        Long l = this.expirationTime;
                        if (l != null ? !l.equals(unlockablesRecord.expirationTime()) : unlockablesRecord.expirationTime() != null) {
                            if (this.updateTime == unlockablesRecord.updateTime() && this.orderPosition == unlockablesRecord.orderPosition() && this.removedLocally == unlockablesRecord.removedLocally()) {
                                if (Arrays.equals(this.checksum, z ? ((AutoValue_UnlockablesRecord) unlockablesRecord).checksum : unlockablesRecord.checksum())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final Long expirationTime() {
        return this.expirationTime;
    }

    public final Geofence geofence() {
        return this.geofence;
    }

    public final int hashCode() {
        long j = this.unlockableId;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.unlockMechanism.hashCode()) * 1000003) ^ Arrays.hashCode(this.data)) * 1000003;
        long j2 = this.dataVersion;
        int i = 1231;
        hashCode = (((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.lowSensitivity ? 1231 : 1237)) * 1000003) ^ (this.highSensitivity ? 1231 : 1237)) * 1000003;
        Geofence geofence = this.geofence;
        int i2 = 0;
        hashCode = (hashCode ^ (geofence == null ? 0 : geofence.hashCode())) * 1000003;
        Long l = this.expirationTime;
        if (l != null) {
            i2 = l.hashCode();
        }
        hashCode = (hashCode ^ i2) * 1000003;
        long j3 = this.updateTime;
        hashCode = (((hashCode ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.orderPosition) * 1000003;
        if (!this.removedLocally) {
            i = 1237;
        }
        return Arrays.hashCode(this.checksum) ^ ((hashCode ^ i) * 1000003);
    }

    public final boolean highSensitivity() {
        return this.highSensitivity;
    }

    public final boolean lowSensitivity() {
        return this.lowSensitivity;
    }

    public final int orderPosition() {
        return this.orderPosition;
    }

    public final boolean removedLocally() {
        return this.removedLocally;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockablesRecord{unlockableId=");
        stringBuilder.append(this.unlockableId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", unlockMechanism=");
        stringBuilder.append(this.unlockMechanism);
        stringBuilder.append(", data=");
        stringBuilder.append(Arrays.toString(this.data));
        stringBuilder.append(", dataVersion=");
        stringBuilder.append(this.dataVersion);
        stringBuilder.append(", lowSensitivity=");
        stringBuilder.append(this.lowSensitivity);
        stringBuilder.append(", highSensitivity=");
        stringBuilder.append(this.highSensitivity);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.geofence);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", updateTime=");
        stringBuilder.append(this.updateTime);
        stringBuilder.append(", orderPosition=");
        stringBuilder.append(this.orderPosition);
        stringBuilder.append(", removedLocally=");
        stringBuilder.append(this.removedLocally);
        stringBuilder.append(", checksum=");
        stringBuilder.append(Arrays.toString(this.checksum));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final PersistableUnlockableType type() {
        return this.type;
    }

    public final UnlockMechanism unlockMechanism() {
        return this.unlockMechanism;
    }

    public final long unlockableId() {
        return this.unlockableId;
    }

    public final long updateTime() {
        return this.updateTime;
    }
}
