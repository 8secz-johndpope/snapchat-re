package defpackage;

import defpackage.abkd.a;

/* renamed from: nkn */
public final class nkn implements a, niw {
    private akrl a;
    private Boolean b;
    private abkq c;
    private final ajei d;
    private final ftl e;
    private final abqo f;

    /* renamed from: nkn$1 */
    static final class 1 extends akcq implements akbl<abkq, ajxw> {
        1(nkn nkn) {
            super(1, nkn);
        }

        public final String getName() {
            return "onSessionChanged";
        }

        public final akej getOwner() {
            return akde.a(nkn.class);
        }

        public final String getSignature() {
            return "onSessionChanged(Lcom/snapchat/android/core/user/UserSession;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((nkn) this.receiver).a((abkq) obj);
            return ajxw.a;
        }
    }

    public nkn(gpb gpb, ajei ajei, ftl ftl, abqo abqo) {
        akcr.b(gpb, "userAuthStore");
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ftl, "configProvider");
        akcr.b(abqo, "clock");
        this.d = ajei;
        this.e = ftl;
        this.f = abqo;
        ajej f = gpb.c().j(ajfu.a).f((ajfb) new nko(new 1(this)));
        akcr.a((Object) f, "userAuthStore.observeUse…cribe(::onSessionChanged)");
        ajvv.a(f, this.d);
    }

    public final String a() {
        abkq abkq = this.c;
        return abkq != null ? abkq.b : null;
    }

    public final synchronized void a(abkq abkq) {
        this.a = null;
        this.b = null;
        this.c = abkq;
    }

    public final String b() {
        abkq abkq = this.c;
        return abkq != null ? abkq.a : null;
    }

    public final String c() {
        abkq abkq = this.c;
        return abkq != null ? abkq.f : null;
    }

    public final String d() {
        abkq abkq = this.c;
        return abkq != null ? abkq.l : null;
    }

    public final boolean e() {
        return this.e.a((fth) jic.ENABLE_BIRTHDAY_PARTY);
    }

    /* JADX WARNING: Missing block: B:21:0x0066, code skipped:
            return false;
     */
    public final synchronized boolean f() {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.a;	 Catch:{ all -> 0x0067 }
        r1 = defpackage.abqo.d();	 Catch:{ all -> 0x0067 }
        r1 = r1.au_();	 Catch:{ all -> 0x0067 }
        r0 = defpackage.akcr.a(r0, r1);	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x001b;
    L_0x0011:
        r0 = r5.b;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x001b;
    L_0x0015:
        r0 = r0.booleanValue();	 Catch:{ all -> 0x0067 }
        monitor-exit(r5);
        return r0;
    L_0x001b:
        r0 = r5.c;	 Catch:{ all -> 0x0067 }
        r1 = 0;
        if (r0 == 0) goto L_0x0065;
    L_0x0020:
        r0 = r0.h;	 Catch:{ all -> 0x0067 }
        if (r0 == 0) goto L_0x0065;
    L_0x0024:
        r0 = (java.lang.Number) r0;	 Catch:{ all -> 0x0067 }
        r2 = r0.longValue();	 Catch:{ all -> 0x0067 }
        r0 = defpackage.abqo.d();	 Catch:{ all -> 0x0067 }
        r0 = r0.au_();	 Catch:{ all -> 0x0067 }
        r5.a = r0;	 Catch:{ all -> 0x0067 }
        r0 = defpackage.abqo.d();	 Catch:{ all -> 0x0067 }
        r0 = r0.au_();	 Catch:{ all -> 0x0067 }
        r4 = "clock.dateTimeNow().toLocalDate()";
        defpackage.akcr.a(r0, r4);	 Catch:{ all -> 0x0067 }
        r0 = r0.e();	 Catch:{ all -> 0x0067 }
        r2 = defpackage.abqo.a(r2);	 Catch:{ all -> 0x0067 }
        r2 = r2.au_();	 Catch:{ all -> 0x0067 }
        r3 = "clock.dateTimeNow(it).toLocalDate()";
        defpackage.akcr.a(r2, r3);	 Catch:{ all -> 0x0067 }
        r2 = r2.e();	 Catch:{ all -> 0x0067 }
        r0 = defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0067 }
        if (r0 != 0) goto L_0x005d;
    L_0x005c:
        r1 = 1;
    L_0x005d:
        r0 = java.lang.Boolean.valueOf(r1);	 Catch:{ all -> 0x0067 }
        r5.b = r0;	 Catch:{ all -> 0x0067 }
        monitor-exit(r5);
        return r1;
    L_0x0065:
        monitor-exit(r5);
        return r1;
    L_0x0067:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkn.f():boolean");
    }

    public final boolean g() {
        abkq abkq = this.c;
        if (abkq != null) {
            String str = abkq.d;
            if (str != null) {
                return akgb.c(str, "@snapchat.com") || akgb.c(str, "@snap.com");
            }
        }
        return false;
    }
}
