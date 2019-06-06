package com.snap.camera.subcomponents.swipetooltip;

import defpackage.achb;
import defpackage.achi;
import defpackage.achk;
import defpackage.ajev;
import defpackage.ajwl;
import defpackage.akcr;
import defpackage.k;
import defpackage.s;
import defpackage.t;
import defpackage.zjk;
import defpackage.zjm;

public final class TransitionDetector implements achk<zjm, zjk>, k {
    public final ajwl<a> a;
    public final achb<zjm, zjk> b;

    public static final class a {
        public final b a;
        public final zjm b;
        public final zjm c;

        public a(b bVar, zjm zjm, zjm zjm2) {
            akcr.b(bVar, "type");
            akcr.b(zjm, "source");
            akcr.b(zjm2, "dest");
            this.a = bVar;
            this.b = zjm;
            this.c = zjm2;
        }

        /* JADX WARNING: Missing block: B:8:0x0024, code skipped:
            if (defpackage.akcr.a(r2.c, r3.c) != false) goto L_0x0029;
     */
        public final boolean equals(java.lang.Object r3) {
            /*
            r2 = this;
            if (r2 == r3) goto L_0x0029;
        L_0x0002:
            r0 = r3 instanceof com.snap.camera.subcomponents.swipetooltip.TransitionDetector.a;
            if (r0 == 0) goto L_0x0027;
        L_0x0006:
            r3 = (com.snap.camera.subcomponents.swipetooltip.TransitionDetector.a) r3;
            r0 = r2.a;
            r1 = r3.a;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x0012:
            r0 = r2.b;
            r1 = r3.b;
            r0 = defpackage.akcr.a(r0, r1);
            if (r0 == 0) goto L_0x0027;
        L_0x001c:
            r0 = r2.c;
            r3 = r3.c;
            r3 = defpackage.akcr.a(r0, r3);
            if (r3 == 0) goto L_0x0027;
        L_0x0026:
            goto L_0x0029;
        L_0x0027:
            r3 = 0;
            return r3;
        L_0x0029:
            r3 = 1;
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.camera.subcomponents.swipetooltip.TransitionDetector$a.equals(java.lang.Object):boolean");
        }

        public final int hashCode() {
            b bVar = this.a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            zjm zjm = this.b;
            hashCode = (hashCode + (zjm != null ? zjm.hashCode() : 0)) * 31;
            zjm = this.c;
            if (zjm != null) {
                i = zjm.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder("Event(type=");
            stringBuilder.append(this.a);
            stringBuilder.append(", source=");
            stringBuilder.append(this.b);
            stringBuilder.append(", dest=");
            stringBuilder.append(this.c);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    public enum b {
        TRANSITION_START,
        TRANSITION_COMPLETE,
        TRANSITION_ABORTED,
        APP_FOREGROUND
    }

    public static final class c implements ajev {
        private /* synthetic */ TransitionDetector a;

        public c(TransitionDetector transitionDetector) {
            this.a = transitionDetector;
        }

        public final void run() {
            Object a = t.a();
            akcr.a(a, "ProcessLifecycleOwner.get()");
            a.getLifecycle().b(this.a);
            this.a.b.b((achk) this.a);
        }
    }

    public TransitionDetector(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.b = achb;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<Event>()");
        this.a = ajwl;
    }

    private final void a(b bVar, achi<zjm, zjk> achi) {
        ajwl ajwl = this.a;
        Object e = achi.e.e();
        akcr.a(e, "navigationEvent.sourcePage.pageType");
        zjm zjm = (zjm) e;
        Object e2 = achi.f.e();
        akcr.a(e2, "navigationEvent.destinationPage.pageType");
        ajwl.a(new a(bVar, zjm, (zjm) e2));
    }

    public final void a(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.k && achi.l) {
            a(b.TRANSITION_START, achi);
        }
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        if (achi.j) {
            a(b.TRANSITION_COMPLETE, achi);
        }
    }

    public final void c(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        a(b.TRANSITION_ABORTED, achi);
    }

    @s(a = defpackage.j.a.ON_START)
    public final void onAppForeground() {
        zjm zjm = (zjm) this.b.h();
        if (zjm != null) {
            this.a.a(new a(b.APP_FOREGROUND, zjm, zjm));
        }
    }
}
