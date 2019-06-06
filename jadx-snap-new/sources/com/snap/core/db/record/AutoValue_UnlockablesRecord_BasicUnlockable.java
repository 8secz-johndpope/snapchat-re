package com.snap.core.db.record;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesRecord.BasicUnlockable;
import com.snapchat.soju.android.Geofence;
import java.util.Arrays;

final class AutoValue_UnlockablesRecord_BasicUnlockable extends BasicUnlockable {
    private final byte[] checksum;
    private final byte[] data;
    private final long dataVersion;
    private final Long expirationTime;
    private final Geofence geofence;
    private final PersistableUnlockableType type;
    private final UnlockMechanism unlockMechanism;
    private final long unlockableId;

    AutoValue_UnlockablesRecord_BasicUnlockable(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, Geofence geofence, Long l, byte[] bArr, long j2, byte[] bArr2) {
        this.unlockableId = j;
        if (persistableUnlockableType != null) {
            this.type = persistableUnlockableType;
            if (unlockMechanism != null) {
                this.unlockMechanism = unlockMechanism;
                this.geofence = geofence;
                this.expirationTime = l;
                if (bArr != null) {
                    this.data = bArr;
                    this.dataVersion = j2;
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
        if (obj instanceof BasicUnlockable) {
            BasicUnlockable basicUnlockable = (BasicUnlockable) obj;
            if (this.unlockableId == basicUnlockable.unlockableId() && this.type.equals(basicUnlockable.type()) && this.unlockMechanism.equals(basicUnlockable.unlockMechanism())) {
                Geofence geofence = this.geofence;
                if (geofence != null ? !geofence.equals(basicUnlockable.geofence()) : basicUnlockable.geofence() != null) {
                    Long l = this.expirationTime;
                    if (l != null ? !l.equals(basicUnlockable.expirationTime()) : basicUnlockable.expirationTime() != null) {
                        boolean z = basicUnlockable instanceof AutoValue_UnlockablesRecord_BasicUnlockable;
                        if (Arrays.equals(this.data, z ? ((AutoValue_UnlockablesRecord_BasicUnlockable) basicUnlockable).data : basicUnlockable.data()) && this.dataVersion == basicUnlockable.dataVersion()) {
                            if (Arrays.equals(this.checksum, z ? ((AutoValue_UnlockablesRecord_BasicUnlockable) basicUnlockable).checksum : basicUnlockable.checksum())) {
                                return true;
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
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.type.hashCode()) * 1000003) ^ this.unlockMechanism.hashCode()) * 1000003;
        Geofence geofence = this.geofence;
        int i = 0;
        hashCode = (hashCode ^ (geofence == null ? 0 : geofence.hashCode())) * 1000003;
        Long l = this.expirationTime;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (((hashCode ^ i) * 1000003) ^ Arrays.hashCode(this.data)) * 1000003;
        long j2 = this.dataVersion;
        return Arrays.hashCode(this.checksum) ^ ((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BasicUnlockable{unlockableId=");
        stringBuilder.append(this.unlockableId);
        stringBuilder.append(", type=");
        stringBuilder.append(this.type);
        stringBuilder.append(", unlockMechanism=");
        stringBuilder.append(this.unlockMechanism);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.geofence);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", data=");
        stringBuilder.append(Arrays.toString(this.data));
        stringBuilder.append(", dataVersion=");
        stringBuilder.append(this.dataVersion);
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
}
