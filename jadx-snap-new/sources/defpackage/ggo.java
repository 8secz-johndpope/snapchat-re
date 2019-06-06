package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.Set;

/* renamed from: ggo */
public final class ggo {
    final ifi a;
    public final Uri b;
    public final rzg c;
    public final Set<gdy> d;
    public final Long e;
    public final Long f;
    public final Boolean g;
    public final Boolean h;

    public /* synthetic */ ggo(ifi ifi, Uri uri, rzg rzg, Set set) {
        this(ifi, uri, rzg, set, null, null, null, null);
    }

    public ggo(ifi ifi, Uri uri, rzg rzg, Set<? extends gdy> set, Long l, Long l2, Boolean bool, Boolean bool2) {
        akcr.b(ifi, "eventLogger");
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(rzg, "schedulingContext");
        this.a = ifi;
        this.b = uri;
        this.c = rzg;
        this.d = set;
        this.e = l;
        this.f = l2;
        this.g = bool;
        this.h = bool2;
    }

    /* JADX WARNING: Missing block: B:18:0x0056, code skipped:
            if (defpackage.akcr.a(r2.h, r3.h) != false) goto L_0x005b;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x005b;
    L_0x0002:
        r0 = r3 instanceof defpackage.ggo;
        if (r0 == 0) goto L_0x0059;
    L_0x0006:
        r3 = (defpackage.ggo) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x003a:
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x0044:
        r0 = r2.g;
        r1 = r3.g;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x0059;
    L_0x004e:
        r0 = r2.h;
        r3 = r3.h;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r3 = 0;
        return r3;
    L_0x005b:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ifi ifi = this.a;
        int i = 0;
        int hashCode = (ifi != null ? ifi.hashCode() : 0) * 31;
        Uri uri = this.b;
        hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        rzg rzg = this.c;
        hashCode = (hashCode + (rzg != null ? rzg.hashCode() : 0)) * 31;
        Set set = this.d;
        hashCode = (hashCode + (set != null ? set.hashCode() : 0)) * 31;
        Long l = this.e;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        l = this.f;
        hashCode = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Boolean bool = this.g;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.h;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ContentResolverTrackingInfo(eventLogger=");
        stringBuilder.append(this.a);
        stringBuilder.append(", uri=");
        stringBuilder.append(this.b);
        stringBuilder.append(", schedulingContext=");
        stringBuilder.append(this.c);
        stringBuilder.append(", cacheAccessControls=");
        stringBuilder.append(this.d);
        stringBuilder.append(", totalLatency=");
        stringBuilder.append(this.e);
        stringBuilder.append(", contentManagerLatency=");
        stringBuilder.append(this.f);
        stringBuilder.append(", requestAlreadyLoading=");
        stringBuilder.append(this.g);
        stringBuilder.append(", success=");
        stringBuilder.append(this.h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
