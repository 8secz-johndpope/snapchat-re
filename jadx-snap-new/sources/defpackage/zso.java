package defpackage;

import com.snap.core.db.column.PersistableUnlockableType;
import com.snap.core.db.column.UnlockMechanism;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.soju.android.Geofence;
import java.util.Arrays;

/* renamed from: zso */
public final class zso {
    public final long a;
    public final PersistableUnlockableType b;
    public final UnlockMechanism c;
    public final long d;
    public final byte[] e;
    public final long f;
    public final Geofence g;
    public final boolean h;
    public final boolean i;
    public final byte[] j;

    public zso(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, long j2, byte[] bArr, long j3, Geofence geofence, boolean z, boolean z2, byte[] bArr2) {
        akcr.b(persistableUnlockableType, "type");
        akcr.b(unlockMechanism, UnlockablesModel.UNLOCKMECHANISM);
        akcr.b(bArr, "serializedData");
        this.a = j;
        this.b = persistableUnlockableType;
        this.c = unlockMechanism;
        this.d = j2;
        this.e = bArr;
        this.f = j3;
        this.g = geofence;
        this.h = z;
        this.i = z2;
        this.j = bArr2;
    }

    public /* synthetic */ zso(long j, PersistableUnlockableType persistableUnlockableType, UnlockMechanism unlockMechanism, long j2, byte[] bArr, long j3, byte[] bArr2) {
        this(j, persistableUnlockableType, unlockMechanism, j2, bArr, j3, null, false, false, bArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            zso zso = (zso) obj;
            return this.a == zso.a && this.b == zso.b && this.c == zso.c && this.d == zso.d && Arrays.equals(this.e, zso.e) && this.f == zso.f && (akcr.a(this.g, zso.g) ^ 1) == 0 && this.h == zso.h && this.i == zso.i && Arrays.equals(this.j, zso.j);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.unlockables.model.UnlockableDbModel");
        }
    }

    public final int hashCode() {
        int hashCode = ((((((((((Long.valueOf(this.a).hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Long.valueOf(this.d).hashCode()) * 31) + Arrays.hashCode(this.e)) * 31) + Long.valueOf(this.f).hashCode()) * 31;
        Geofence geofence = this.g;
        return ((((((hashCode + (geofence != null ? geofence.hashCode() : 0)) * 31) + Boolean.valueOf(this.h).hashCode()) * 31) + Boolean.valueOf(this.i).hashCode()) * 31) + Arrays.hashCode(this.j);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UnlockableDbModel(unlockableId=");
        stringBuilder.append(this.a);
        stringBuilder.append(", type=");
        stringBuilder.append(this.b);
        stringBuilder.append(", unlockMechanism=");
        stringBuilder.append(this.c);
        stringBuilder.append(", expirationTime=");
        stringBuilder.append(this.d);
        stringBuilder.append(", serializedData=");
        stringBuilder.append(Arrays.toString(this.e));
        stringBuilder.append(", dataVersion=");
        stringBuilder.append(this.f);
        stringBuilder.append(", geofence=");
        stringBuilder.append(this.g);
        stringBuilder.append(", lowSensitivity=");
        stringBuilder.append(this.h);
        stringBuilder.append(", highSensitivity=");
        stringBuilder.append(this.i);
        stringBuilder.append(", checksum=");
        stringBuilder.append(Arrays.toString(this.j));
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
