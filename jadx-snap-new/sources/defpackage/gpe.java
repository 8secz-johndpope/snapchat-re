package defpackage;

/* renamed from: gpe */
public final class gpe {
    gpg a;
    gpg b;
    a c;
    final aipn<zfo> d;
    final aipn<gph> e;

    /* renamed from: gpe$a */
    public static final class a {
        final gpg a;
        final zfn b;

        public a(gpg gpg, zfn zfn) {
            akcr.b(gpg, "cpuEvent");
            akcr.b(zfn, "endSessionMetric");
            this.a = gpg;
            this.b = zfn;
        }

        /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (defpackage.akcr.a(r2.b, r3.b) != false) goto L_0x001f;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x001f;
        L_0x0002:
            r0 = r3 instanceof defpackage.gpe.a;
            if (r0 == 0) goto L_0x001d;
        L_0x0006:
            r3 = (defpackage.gpe.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x001d;
        L_0x0012:
            r0 = r2.b;
            r3 = r3.b;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x001d;
        L_0x001c:
            goto L_0x001f;
        L_0x001d:
            r3 = 0;
            return r3;
        L_0x001f:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gpe$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            gpg gpg = this.a;
            int i = 0;
            int hashCode = (gpg != null ? gpg.hashCode() : 0) * 31;
            zfn zfn = this.b;
            if (zfn != null) {
                i = zfn.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("EventsToReport(cpuEvent=");
            stringBuilder.append(this.a);
            stringBuilder.append(", endSessionMetric=");
            stringBuilder.append(this.b);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public gpe(aipn<zfo> aipn, aipn<gph> aipn2) {
        akcr.b(aipn, "cpuStatsLogger");
        akcr.b(aipn2, "cpuEventReporter");
        this.d = aipn;
        this.e = aipn2;
    }
}
