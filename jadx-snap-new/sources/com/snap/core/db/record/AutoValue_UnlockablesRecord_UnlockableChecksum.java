package com.snap.core.db.record;

import com.snap.core.db.record.UnlockablesRecord.UnlockableChecksum;
import java.util.Arrays;

final class AutoValue_UnlockablesRecord_UnlockableChecksum extends UnlockableChecksum {
    private final byte[] checksum;
    private final long unlockableId;

    AutoValue_UnlockablesRecord_UnlockableChecksum(long j, byte[] bArr) {
        this.unlockableId = j;
        this.checksum = bArr;
    }

    public final byte[] checksum() {
        return this.checksum;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof UnlockableChecksum) {
            UnlockableChecksum unlockableChecksum = (UnlockableChecksum) obj;
            if (this.unlockableId == unlockableChecksum.unlockableId()) {
                if (Arrays.equals(this.checksum, unlockableChecksum instanceof AutoValue_UnlockablesRecord_UnlockableChecksum ? ((AutoValue_UnlockablesRecord_UnlockableChecksum) unlockableChecksum).checksum : unlockableChecksum.checksum())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.unlockableId;
        return Arrays.hashCode(this.checksum) ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockableChecksum{unlockableId=");
        stringBuilder.append(this.unlockableId);
        stringBuilder.append(", checksum=");
        stringBuilder.append(Arrays.toString(this.checksum));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final long unlockableId() {
        return this.unlockableId;
    }
}
