package com.snap.core.db.record;

import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesRecord.SimpleUnlockable;
import com.snapchat.soju.android.Geofence;
import java.util.Arrays;

final class AutoValue_UnlockablesRecord_SimpleUnlockable extends SimpleUnlockable {
    private final byte[] checksum;
    private final Long expirationTime;
    private final Geofence geofence;
    private final boolean highSensitivity;
    private final boolean lowSensitivity;
    private final UnlockMechanism unlockMechanism;
    private final long unlockableId;

    AutoValue_UnlockablesRecord_SimpleUnlockable(long j, UnlockMechanism unlockMechanism, Geofence geofence, Long l, boolean z, boolean z2, byte[] bArr) {
        this.unlockableId = j;
        if (unlockMechanism != null) {
            this.unlockMechanism = unlockMechanism;
            this.geofence = geofence;
            this.expirationTime = l;
            this.lowSensitivity = z;
            this.highSensitivity = z2;
            this.checksum = bArr;
            return;
        }
        throw new NullPointerException("Null unlockMechanism");
    }

    public final byte[] checksum() {
        return this.checksum;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SimpleUnlockable) {
            SimpleUnlockable simpleUnlockable = (SimpleUnlockable) obj;
            if (this.unlockableId == simpleUnlockable.unlockableId() && this.unlockMechanism.equals(simpleUnlockable.unlockMechanism())) {
                Geofence geofence = this.geofence;
                if (geofence != null ? !geofence.equals(simpleUnlockable.geofence()) : simpleUnlockable.geofence() != null) {
                    Long l = this.expirationTime;
                    if (l != null ? !l.equals(simpleUnlockable.expirationTime()) : simpleUnlockable.expirationTime() != null) {
                        if (this.lowSensitivity == simpleUnlockable.lowSensitivity() && this.highSensitivity == simpleUnlockable.highSensitivity()) {
                            if (Arrays.equals(this.checksum, simpleUnlockable instanceof AutoValue_UnlockablesRecord_SimpleUnlockable ? ((AutoValue_UnlockablesRecord_SimpleUnlockable) simpleUnlockable).checksum : simpleUnlockable.checksum())) {
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
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.unlockMechanism.hashCode()) * 1000003;
        Geofence geofence = this.geofence;
        int i = 0;
        hashCode = (hashCode ^ (geofence == null ? 0 : geofence.hashCode())) * 1000003;
        Long l = this.expirationTime;
        if (l != null) {
            i = l.hashCode();
        }
        hashCode = (hashCode ^ i) * 1000003;
        i = 1231;
        hashCode = (hashCode ^ (this.lowSensitivity ? 1231 : 1237)) * 1000003;
        if (!this.highSensitivity) {
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

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SimpleUnlockable{unlockableId=");
        stringBuilder.append(this.unlockableId);
        stringBuilder.append(", unlockMechanism=");
        stringBuilder.append(this.unlockMechanism);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.geofence);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.expirationTime);
        stringBuilder.append(", lowSensitivity=");
        stringBuilder.append(this.lowSensitivity);
        stringBuilder.append(", highSensitivity=");
        stringBuilder.append(this.highSensitivity);
        stringBuilder.append(", checksum=");
        stringBuilder.append(Arrays.toString(this.checksum));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final UnlockMechanism unlockMechanism() {
        return this.unlockMechanism;
    }

    public final long unlockableId() {
        return this.unlockableId;
    }
}
