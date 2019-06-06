package defpackage;

import com.google.android.gms.common.internal.zzbg;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.zzw;
import com.snap.core.db.record.DdmlModelModel;
import java.util.Arrays;

/* renamed from: cao */
public final class cao {
    public final String a;
    public final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    cao(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        zzbq.zza(zzw.zzhb(str) ^ 1, "ApplicationId must be set.");
        this.a = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.b = str5;
        this.f = str6;
        this.g = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cao)) {
            return false;
        }
        cao cao = (cao) obj;
        return zzbg.equal(this.a, cao.a) && zzbg.equal(this.c, cao.c) && zzbg.equal(this.d, cao.d) && zzbg.equal(this.e, cao.e) && zzbg.equal(this.b, cao.b) && zzbg.equal(this.f, cao.f) && zzbg.equal(this.g, cao.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.d, this.e, this.b, this.f, this.g});
    }

    public final String toString() {
        return zzbg.zzx(this).zzg(DdmlModelModel.APPLICATIONID, this.a).zzg("apiKey", this.c).zzg("databaseUrl", this.d).zzg("gcmSenderId", this.b).zzg("storageBucket", this.f).zzg("projectId", this.g).toString();
    }
}
