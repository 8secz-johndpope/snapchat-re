package defpackage;

import defpackage.yes.b;
import java.io.IOException;

/* renamed from: owe */
public final class owe implements oom {
    private static final String c = c;
    private final ajwy<ygi> a;
    private final ajwy<iha> b;

    /* renamed from: owe$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public owe(ajwy<ygi> ajwy, ajwy<iha> ajwy2) {
        akcr.b(ajwy, "fileManager");
        akcr.b(ajwy2, "serializationHelper");
        this.a = ajwy;
        this.b = ajwy2;
    }

    /* JADX WARNING: Missing block: B:16:0x0047, code skipped:
            defpackage.akax.a(r3, r0);
     */
    public final java.lang.String a(java.lang.String r3) {
        /*
        r2 = this;
        r0 = "snapId";
        defpackage.akcr.b(r3, r0);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = c;
        r0.append(r1);
        r1 = ": Retrieving Edits should be done on a background thread";
        r0.append(r1);
        r0 = r0.toString();
        defpackage.abmr.a(r0);
        r0 = r2.a;
        r0 = r0.get();
        r0 = (defpackage.ygi) r0;
        r1 = defpackage.oyc.OVERLAY_METADATA;
        r1 = (defpackage.ygp) r1;
        r3 = r0.c(r1, r3);
        r0 = 0;
        if (r3 != 0) goto L_0x002f;
    L_0x002e:
        return r0;
    L_0x002f:
        r1 = "fileManager.get().getFil…           ?: return null";
        defpackage.akcr.a(r3, r1);
        r3 = (java.io.Closeable) r3;
        r1 = r3;
        r1 = (defpackage.yeu) r1;	 Catch:{ Throwable -> 0x0045 }
        r1 = r1.e();	 Catch:{ IOException -> 0x003e }
        goto L_0x003f;
    L_0x003e:
        r1 = r0;
    L_0x003f:
        defpackage.akax.a(r3, r0);
        return r1;
    L_0x0043:
        r1 = move-exception;
        goto L_0x0047;
    L_0x0045:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0043 }
    L_0x0047:
        defpackage.akax.a(r3, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.owe.a(java.lang.String):java.lang.String");
    }

    public final boolean a(String str, abyy abyy) {
        akcr.b(str, "snapId");
        akcr.b(abyy, "edits");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(": Storing Edits should be done on a background thread");
        abmr.a(stringBuilder.toString());
        String b = ((iha) this.b.get()).b(abyy);
        boolean z = false;
        if (b == null) {
            return false;
        }
        b a = ((ygi) this.a.get()).a((ygp) oyc.OVERLAY_METADATA, str, 1);
        if (a == null) {
            return false;
        }
        try {
            a.a(b);
            a.f();
            z = true;
        } catch (IOException unused) {
        } finally {
            a.h();
        }
        return z;
    }
}
