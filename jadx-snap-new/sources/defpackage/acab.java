package defpackage;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acab */
public final class acab {
    @SerializedName(alternate = {"a"}, value = "venueItems")
    public List<acac> a = new ArrayList();
    @SerializedName(alternate = {"b"}, value = "selectedVenueId")
    public String b;
    @SerializedName(alternate = {"c"}, value = "yOffset")
    public Double c = null;

    public acab(acab acab) {
        this.a = new ArrayList(acab.a);
        this.c = acab.c;
        this.b = acab.b;
    }

    public acab(List<affu> list) {
        for (affu affu : list) {
            if (affu != null) {
                this.a.add(new acac(affu));
            }
        }
    }

    public final List<acac> a() {
        return this.a;
    }

    public final void a(Double d) {
        this.c = d;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(List<acac> list) {
        this.a = list;
    }

    public final Long b(String str) {
        for (long j = 0; j < ((long) this.a.size()); j++) {
            if (TextUtils.equals(((acac) this.a.get((int) j)).c(), str)) {
                return Long.valueOf(j);
            }
        }
        return null;
    }

    public final String b() {
        return this.b;
    }

    public final Double c() {
        return this.c;
    }

    /* JADX WARNING: Missing block: B:22:0x004a, code skipped:
            if (r3.equals(r2) != false) goto L_0x004c;
     */
    public final boolean equals(java.lang.Object r5) {
        /*
        r4 = this;
        r0 = 0;
        if (r5 == 0) goto L_0x0057;
    L_0x0003:
        r1 = r4.getClass();
        r2 = r5.getClass();
        if (r1 == r2) goto L_0x000e;
    L_0x000d:
        goto L_0x0057;
    L_0x000e:
        r1 = 1;
        if (r4 != r5) goto L_0x0012;
    L_0x0011:
        return r1;
    L_0x0012:
        r5 = (defpackage.acab) r5;
        r2 = r5.a;
        r2 = r2.size();
        r3 = r4.a;
        r3 = r3.size();
        if (r2 != r3) goto L_0x0057;
    L_0x0022:
        r2 = r5.a;
        r3 = r4.a;
        r2 = r2.containsAll(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x002c:
        r2 = r4.a;
        r3 = r5.a;
        r2 = r2.containsAll(r3);
        if (r2 == 0) goto L_0x0057;
    L_0x0036:
        r2 = r5.c;
        if (r2 != 0) goto L_0x003e;
    L_0x003a:
        r2 = r4.c;
        if (r2 == 0) goto L_0x004c;
    L_0x003e:
        r2 = r5.c;
        if (r2 == 0) goto L_0x0057;
    L_0x0042:
        r3 = r4.c;
        if (r3 == 0) goto L_0x0057;
    L_0x0046:
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0057;
    L_0x004c:
        r5 = r5.b;
        r2 = r4.b;
        r5 = android.text.TextUtils.equals(r5, r2);
        if (r5 == 0) goto L_0x0057;
    L_0x0056:
        return r1;
    L_0x0057:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acab.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return new akmd().a(this.a).a;
    }
}
