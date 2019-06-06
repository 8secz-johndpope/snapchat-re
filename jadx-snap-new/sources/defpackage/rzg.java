package defpackage;

import android.net.Uri;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.Set;

/* renamed from: rzg */
public final class rzg implements Comparable<rzg> {
    public final idl a;
    public final rzc b;
    public final float c;
    public final Uri d;
    public final String e;

    /* renamed from: rzg$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static Set<rzg> a(idl idl) {
            akcr.b(idl, "uiPage");
            return a.a(new rzg(idl));
        }

        public static Set<rzg> a(rzg rzg) {
            if (rzg != null) {
                Set a = ajzs.a(rzg);
                if (a != null) {
                    return a;
                }
            }
            return ajyy.a;
        }
    }

    static {
        a aVar = new a();
    }

    public rzg(idl idl) {
        if (idl == null) {
            idl = idn.a;
        }
        this(idl, rzc.UserInitiated, (float) MapboxConstants.MINIMUM_ZOOM, null, 28);
    }

    public rzg(idl idl, Uri uri) {
        akcr.b(uri, "contentUri");
        if (idl == null) {
            idl = idn.a;
        }
        this(idl, rzc.UserInitiated, uri);
    }

    public rzg(idl idl, rzc rzc, float f, Uri uri, String str) {
        akcr.b(idl, "uiPage");
        akcr.b(rzc, "priority");
        this.a = idl;
        this.b = rzc;
        this.c = f;
        this.d = uri;
        this.e = str;
    }

    private rzg(idl idl, rzc rzc, Uri uri) {
        akcr.b(idl, "uiPage");
        akcr.b(rzc, "priority");
        akcr.b(uri, "contentUri");
        this(idl, rzc, 1.0f, uri, 16);
    }

    private static int a(float f, float f2) {
        f -= f2;
        return f < -1.0E-6f ? 1 : f > 1.0E-6f ? -1 : 0;
    }

    /* renamed from: a */
    public final int compareTo(rzg rzg) {
        akcr.b(rzg, "other");
        return this.b.ordinal() < rzg.b.ordinal() ? -1 : this.b.ordinal() == rzg.b.ordinal() ? rzg.a(this.c, rzg.c) : 1;
    }

    /* JADX WARNING: Missing block: B:12:0x0038, code skipped:
            if (defpackage.akcr.a(r2.e, r3.e) != false) goto L_0x003d;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x003d;
    L_0x0002:
        r0 = r3 instanceof defpackage.rzg;
        if (r0 == 0) goto L_0x003b;
    L_0x0006:
        r3 = (defpackage.rzg) r3;
        r0 = r2.a;
        r1 = r3.a;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0012:
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x001c:
        r0 = r2.c;
        r1 = r3.c;
        r0 = java.lang.Float.compare(r0, r1);
        if (r0 != 0) goto L_0x003b;
    L_0x0026:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x003b;
    L_0x0030:
        r0 = r2.e;
        r3 = r3.e;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x003d;
    L_0x003b:
        r3 = 0;
        return r3;
    L_0x003d:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rzg.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        idl idl = this.a;
        int i = 0;
        int hashCode = (idl != null ? idl.hashCode() : 0) * 31;
        rzc rzc = this.b;
        hashCode = (((hashCode + (rzc != null ? rzc.hashCode() : 0)) * 31) + Float.floatToIntBits(this.c)) * 31;
        Uri uri = this.d;
        hashCode = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append('@');
        idl idl = this.a;
        akcr.b(idl, "receiver$0");
        String str = "";
        stringBuilder.append(String.valueOf(ajyu.a((Iterable) idl.getHierarchy(), (CharSequence) "/", (CharSequence) str, (CharSequence) str, 0, null, null, 56)));
        return stringBuilder.toString();
    }
}
