package defpackage;

import java.util.UUID;

/* renamed from: eiq */
public final class eiq implements dof {
    private UUID a;
    private aaig b;
    private String c;
    private aaif d;
    private aasa e;
    private boolean f;
    private final aipn<dug> g;

    public eiq(aipn<dug> aipn) {
        akcr.b(aipn, "cameraTelemetry");
        this.g = aipn;
    }

    /* JADX WARNING: Missing block: B:6:0x0019, code skipped:
            if (r1 == null) goto L_0x001b;
     */
    public final void a(defpackage.dof.a r3) {
        /*
        r2 = this;
        r0 = "stepName";
        defpackage.akcr.b(r3, r0);
        r0 = r2.b;
        r1 = defpackage.aaig.TAP_AND_HOLD;
        if (r0 == r1) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r0 = new aacq;
        r0.<init>();
        r1 = r2.a;
        if (r1 == 0) goto L_0x001b;
    L_0x0015:
        r1 = r1.toString();
        if (r1 != 0) goto L_0x001d;
    L_0x001b:
        r1 = "unknown";
    L_0x001d:
        r0.a(r1);
        r3 = r3.toString();
        r0.b(r3);
        r3 = r2.g;
        r3 = r3.get();
        r3 = (defpackage.dug) r3;
        r0 = (defpackage.aajt) r0;
        r3.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiq.a(dof$a):void");
    }

    public final void a(dqu dqu) {
        aasa aasa;
        if (dqu != null) {
            int i = eir.a[dqu.ordinal()];
            if (i == 1) {
                aasa = aasa.ANDROID_DEFAULT_RECORDER;
            } else if (i == 2) {
                aasa = aasa.SCMEDIA_RECORDER;
            }
            this.e = aasa;
        }
        aasa = null;
        this.e = aasa;
    }

    /* JADX WARNING: Missing block: B:3:0x0017, code skipped:
            if (r1 == null) goto L_0x0019;
     */
    public final void a(java.lang.String r3, defpackage.aasc r4, java.lang.String r5) {
        /*
        r2 = this;
        r0 = "reason";
        defpackage.akcr.b(r3, r0);
        r0 = "mediaType";
        defpackage.akcr.b(r4, r0);
        r0 = new aaih;
        r0.<init>();
        r1 = r2.a;
        if (r1 == 0) goto L_0x0019;
    L_0x0013:
        r1 = r1.toString();
        if (r1 != 0) goto L_0x001b;
    L_0x0019:
        r1 = "unknown";
    L_0x001b:
        r0.a(r1);
        r0.a(r4);
        r0.b(r3);
        r3 = r2.d;
        r0.a(r3);
        r3 = r2.b;
        r0.a(r3);
        r3 = r2.c;
        r0.c(r3);
        r3 = r2.f;
        r3 = java.lang.Boolean.valueOf(r3);
        r0.a(r3);
        if (r5 != 0) goto L_0x0040;
    L_0x003e:
        r5 = "null";
    L_0x0040:
        r0.d(r5);
        r3 = r2.e;
        r0.a(r3);
        r3 = r2.g;
        r3 = r3.get();
        r3 = (defpackage.dug) r3;
        r0 = (defpackage.aajt) r0;
        r3.a(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eiq.a(java.lang.String, aasc, java.lang.String):void");
    }

    public final void a(UUID uuid, aaig aaig, String str, aaif aaif, boolean z) {
        akcr.b(aaig, "type");
        akcr.b(str, "page");
        akcr.b(aaif, "buttonName");
        this.a = uuid;
        this.b = aaig;
        this.c = str;
        this.d = aaif;
        this.f = z;
        this.e = null;
    }
}
