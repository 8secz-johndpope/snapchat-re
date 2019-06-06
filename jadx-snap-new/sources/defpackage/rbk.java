package defpackage;

/* renamed from: rbk */
public final class rbk {
    public final ajwl<Boolean> a;
    final ajwl<Long> b;
    public final ajwl<Boolean> c;
    public final ajwl<Boolean> d;
    final ajwl<Boolean> e;
    public final ajwl<Boolean> f;
    public final ajwl<Boolean> g;
    private final ajwl<Long> h;
    private final ftl i;
    private final aipn<ira> j;
    private final psw k;

    /* renamed from: rbk$a */
    public static final class a<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> implements ajfj<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {
        private /* synthetic */ rbk a;

        public a(rbk rbk) {
            this.a = rbk;
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
        public final R apply(T1 r17, T2 r18, T3 r19, T4 r20, T5 r21, T6 r22, T7 r23, T8 r24, T9 r25) {
            /*
            r16 = this;
            r0 = r16;
            r1 = r25;
            r1 = (java.lang.Boolean) r1;
            r2 = r24;
            r2 = (java.lang.Boolean) r2;
            r3 = r23;
            r3 = (java.lang.Boolean) r3;
            r12 = r3.booleanValue();
            r3 = r22;
            r3 = (java.lang.Boolean) r3;
            r4 = r21;
            r4 = (defpackage.psw.a) r4;
            r5 = r20;
            r5 = (java.lang.Boolean) r5;
            r6 = r19;
            r6 = (java.lang.Long) r6;
            r7 = r18;
            r7 = (java.lang.Boolean) r7;
            r8 = r17;
            r8 = (java.lang.Boolean) r8;
            r8 = r8.booleanValue();
            r9 = 1;
            r10 = 0;
            if (r8 != 0) goto L_0x003f;
        L_0x0032:
            r11 = "showQuickAddUnit";
            defpackage.akcr.a(r7, r11);
            r7 = r7.booleanValue();
            if (r7 == 0) goto L_0x003f;
        L_0x003d:
            r7 = 1;
            goto L_0x0040;
        L_0x003f:
            r7 = 0;
        L_0x0040:
            r11 = r0.a;
            r11 = r11.b;
            r11.a(r6);
            r11 = r0.a;
            r11 = r11.d;
            r13 = java.lang.Boolean.valueOf(r8);
            r11.a(r13);
            r11 = defpackage.psw.a.FEED_ONLY;
            if (r4 != r11) goto L_0x0057;
        L_0x0056:
            goto L_0x0058;
        L_0x0057:
            r9 = 0;
        L_0x0058:
            r4 = r0.a;
            r4 = r4.e;
            r10 = java.lang.Boolean.valueOf(r9);
            r4.a(r10);
            r4 = r0.a;
            r4 = r4.f;
            r4.a(r3);
            r4 = r0.a;
            r4 = r4.g;
            r4.a(r2);
            r15 = new rbj;
            r4 = "lastCheckForNewStories";
            defpackage.akcr.a(r6, r4);
            r10 = r6.longValue();
            r4 = "useLoqConversations";
            defpackage.akcr.a(r5, r4);
            r13 = r5.booleanValue();
            r4 = "prefetchSnapStackInOpera";
            defpackage.akcr.a(r3, r4);
            r3 = r3.booleanValue();
            r4 = "forceSyncAndClearLocalData";
            defpackage.akcr.a(r2, r4);
            r2 = r2.booleanValue();
            r4 = "useStackDrawLayout";
            defpackage.akcr.a(r1, r4);
            r14 = r1.booleanValue();
            r4 = r15;
            r5 = r7;
            r6 = r10;
            r10 = r13;
            r11 = r3;
            r13 = r2;
            r4.<init>(r5, r6, r8, r9, r10, r11, r12, r13, r14);
            return r15;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rbk$a.apply(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    public rbk(ftl ftl, aipn<ira> aipn, psw psw) {
        akcr.b(ftl, "configProvider");
        akcr.b(aipn, "identityApi");
        akcr.b(psw, "arroyoConfig");
        this.i = ftl;
        this.j = aipn;
        this.k = psw;
        Object i = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(i, str);
        this.a = i;
        Long valueOf = Long.valueOf(0);
        Object i2 = ajwl.i(valueOf);
        String str2 = "BehaviorSubject.createDefault(0L)";
        akcr.a(i2, str2);
        this.b = i2;
        i2 = ajwl.i(Boolean.FALSE);
        akcr.a(i2, str);
        this.c = i2;
        i2 = ajwl.i(Boolean.FALSE);
        akcr.a(i2, str);
        this.d = i2;
        i = ajwl.i(valueOf);
        akcr.a(i, str2);
        this.h = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.e = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.f = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.g = i;
    }

    public final ajdp<rbj> a() {
        ajdp p = ((ira) this.j.get()).p();
        Object p2 = this.i.p(jic.SHOW_QUICK_ADD_UNIT);
        akcr.a(p2, "configProvider.observeBo…nKey.SHOW_QUICK_ADD_UNIT)");
        Object t = this.i.t(qyi.LAST_CHECK_FOR_NEW_STORIES_MS);
        akcr.a(t, "configProvider.observeLo…CHECK_FOR_NEW_STORIES_MS)");
        Object p3 = this.i.p(qyi.USE_LOQ_CONVERSATIONS);
        akcr.a(p3, "configProvider.observeBo…ey.USE_LOQ_CONVERSATIONS)");
        Object i = this.k.a().i();
        akcr.a(i, "arroyoConfig.getArroyoMode().toObservable()");
        Object p4 = this.i.p(qyi.PREFETCH_SNAP_STACK_IN_OPERA);
        akcr.a(p4, "configProvider.observeBo…ETCH_SNAP_STACK_IN_OPERA)");
        ajdp d = this.k.d();
        Object p5 = this.i.p(qyi.FORCE_SYNC_AND_CLEAR_LOCAL_DATA);
        akcr.a(p5, "configProvider.observeBo…YNC_AND_CLEAR_LOCAL_DATA)");
        Object p6 = this.i.p(qyi.USE_SDL);
        akcr.a(p6, "configProvider.observeBo…ConfigurationKey.USE_SDL)");
        p = ajdp.a(p, (ajdt) p2, (ajdt) t, (ajdt) p3, (ajdt) i, (ajdt) p4, d, (ajdt) p5, (ajdt) p6, new a(this));
        if (p == null) {
            akcr.a();
        }
        return igs.a(p);
    }
}
