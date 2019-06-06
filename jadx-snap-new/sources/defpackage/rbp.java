package defpackage;

import android.content.Context;
import com.snap.core.db.record.LocalMessageActionModel;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: rbp */
public final class rbp {
    public final ajwl<Boolean> a;
    public final zfw b = zgb.a(qxo.b.callsite("TopPromptDataSource"));
    public ajwl<Boolean> c;
    public ajej d;
    public int e;
    final ajxe f;
    rbv g;
    public final ajei h;
    public final ajdp<qzi> i;
    final Context j;
    final gpb k;
    final qwx l;
    final rbt m;
    final iha n;
    final iqm o;
    final ftl p;
    final aipn<qxh> q;
    private final ajxe r = ajxh.a(new e(this));
    private final ajxe s;
    private final zgb t;
    private final hxs u;

    /* renamed from: rbp$e */
    static final class e extends akcs implements akbk<Map<String, Long>> {
        private /* synthetic */ rbp a;

        e(rbp rbp) {
            this.a = rbp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.l.a();
        }
    }

    /* renamed from: rbp$a */
    static final class a extends akcs implements akbk<qxh> {
        private /* synthetic */ rbp a;

        a(rbp rbp) {
            this.a = rbp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (qxh) this.a.q.get();
        }
    }

    /* renamed from: rbp$h */
    static final class h extends akcs implements akbk<qzh> {
        private /* synthetic */ rbp a;

        h(rbp rbp) {
            this.a = rbp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            rbp rbp = this.a;
            String j = rbp.p.j(qyi.FEED_HEADER_PROMPT_V2);
            CharSequence charSequence = j;
            Object obj = (charSequence == null || akgb.a(charSequence)) ? 1 : null;
            if (obj != null) {
                return qzh.c;
            }
            Object obj2 = (qzh) rbp.n.a(j, qzh.class);
            if (obj2 == null) {
                obj2 = qzh.c;
            }
            return obj2;
        }
    }

    /* renamed from: rbp$f */
    static final class f<T> implements ajfl<Boolean> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            return bool.booleanValue();
        }
    }

    /* renamed from: rbp$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ rbp a;

        g(rbp rbp) {
            this.a = rbp;
        }

        /* JADX WARNING: Removed duplicated region for block: B:75:0x01f0  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01f0  */
        /* JADX WARNING: Missing block: B:55:0x016a, code skipped:
            r9 = 1;
     */
        /* JADX WARNING: Missing block: B:90:0x01e4, code skipped:
            continue;
     */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r13) {
            /*
            r12 = this;
            r13 = (java.lang.Boolean) r13;
            r0 = "it";
            defpackage.akcr.b(r13, r0);
            r13 = r12.a;
            r0 = "queryForPromptType must not be called on the main thread.";
            defpackage.abmr.a(r0);
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_CONTACT_SYNC_FEED_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x0022;
        L_0x001a:
            r0 = defpackage.qzf.CONTACT_SYNC;
        L_0x001c:
            r0 = r13.b(r0);
            goto L_0x01ea;
        L_0x0022:
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_SUICIDE_PREVENTION_FEED_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x0031;
        L_0x002e:
            r0 = defpackage.qzf.SUICIDE_PREVENTION;
            goto L_0x001c;
        L_0x0031:
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_NOTIFICATION_FEED_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x0040;
        L_0x003d:
            r0 = defpackage.qzf.NOTIFICATION_PERMISSION;
            goto L_0x001c;
        L_0x0040:
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_PHONE_VERIFICATION_FEED_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x004f;
        L_0x004c:
            r0 = defpackage.qzf.PHONE_NUMBER_VERIFICATION;
            goto L_0x001c;
        L_0x004f:
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_BDAY_FEED_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x005e;
        L_0x005b:
            r0 = defpackage.qzf.BIRTHDAY_PARTY;
            goto L_0x001c;
        L_0x005e:
            r0 = r13.p;
            r1 = defpackage.qyi.SHOW_EMAIL_HEADER_PROMPT;
            r1 = (defpackage.fth) r1;
            r0 = r0.a(r1);
            if (r0 == 0) goto L_0x006d;
        L_0x006a:
            r0 = defpackage.qzf.EMAIL_VERIFICATION;
            goto L_0x001c;
        L_0x006d:
            r0 = r13.a();
            r1 = defpackage.qzh.c;
            r0 = defpackage.akcr.a(r0, r1);
            r7 = 1;
            r0 = r0 ^ r7;
            if (r0 == 0) goto L_0x01e8;
        L_0x007b:
            r0 = r13.a();
            r0 = r0.b;
            r13.e = r0;
            r0 = r13.a();
            r0 = r0.a;
            r0 = (java.lang.Iterable) r0;
            r0 = r0.iterator();
        L_0x008f:
            r1 = r0.hasNext();
            if (r1 == 0) goto L_0x01e8;
        L_0x0095:
            r1 = r0.next();
            r8 = r1;
            r8 = (defpackage.qzi) r8;
            r1 = "model";
            defpackage.akcr.b(r8, r1);
            r1 = r8.a;
            r2 = defpackage.rbq.a;
            r1 = r1.ordinal();
            r1 = r2[r1];
            r9 = 0;
            switch(r1) {
                case 1: goto L_0x016c;
                case 2: goto L_0x0143;
                case 3: goto L_0x011b;
                case 4: goto L_0x010e;
                case 5: goto L_0x00ea;
                case 6: goto L_0x00b1;
                default: goto L_0x00af;
            };
        L_0x00af:
            goto L_0x01e4;
        L_0x00b1:
            r6 = r8.e;
            r3 = r8.f;
            r1 = r13.p;
            r2 = defpackage.qyi.SHOW_CONTACT_SYNC_FEED_HEADER_PROMPT;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x016a;
        L_0x00c1:
            r1 = r13.m;
            r1 = r1.c();
            if (r1 == 0) goto L_0x01e4;
        L_0x00c9:
            r1 = r13.o;
            r1 = r1.d();
            if (r1 != 0) goto L_0x01e4;
        L_0x00d1:
            r1 = r13.l;
            r2 = defpackage.qzf.CONTACT_SYNC;
            r1 = r1.a(r2);
            if (r1 >= r6) goto L_0x01e4;
        L_0x00db:
            r2 = defpackage.qzf.CONTACT_SYNC;
            r4 = java.lang.System.currentTimeMillis();
            r1 = r13;
            r1 = r1.a(r2, r3, r4, r6);
            if (r1 == 0) goto L_0x01e4;
        L_0x00e8:
            goto L_0x016a;
        L_0x00ea:
            r6 = r8.e;
            r3 = r8.f;
            r1 = r13.p;
            r2 = defpackage.qyi.SHOW_EMAIL_HEADER_PROMPT;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x016a;
        L_0x00fa:
            r2 = defpackage.qzf.EMAIL_VERIFICATION;
            r4 = java.lang.System.currentTimeMillis();
            r1 = r13;
            r1 = r1.a(r2, r3, r4, r6);
            if (r1 == 0) goto L_0x01e4;
        L_0x0107:
            r1 = r13.m;
            r1.b();
            goto L_0x01e4;
        L_0x010e:
            r1 = r13.p;
            r2 = defpackage.qyi.SHOW_SUICIDE_PREVENTION_FEED_HEADER_PROMPT;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 == 0) goto L_0x01e4;
        L_0x011a:
            goto L_0x016a;
        L_0x011b:
            r6 = r8.e;
            r3 = r8.f;
            r1 = r13.p;
            r2 = defpackage.qyi.SHOW_PHONE_VERIFICATION_FEED_HEADER_PROMPT;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x016a;
        L_0x012b:
            r1 = r13.k;
            r1 = r1.a();
            r1 = r1.e;
            if (r1 != 0) goto L_0x01e4;
        L_0x0135:
            r2 = defpackage.qzf.PHONE_NUMBER_VERIFICATION;
            r4 = java.lang.System.currentTimeMillis();
            r1 = r13;
            r1 = r1.a(r2, r3, r4, r6);
            if (r1 == 0) goto L_0x01e4;
        L_0x0142:
            goto L_0x016a;
        L_0x0143:
            r6 = r8.e;
            r3 = r8.f;
            r1 = r13.p;
            r2 = defpackage.qyi.SHOW_NOTIFICATION_FEED_HEADER_PROMPT;
            r2 = (defpackage.fth) r2;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x016a;
        L_0x0153:
            r1 = r13.m;
            r2 = r13.j;
            r1 = r1.a(r2);
            if (r1 != 0) goto L_0x01e4;
        L_0x015d:
            r2 = defpackage.qzf.NOTIFICATION_PERMISSION;
            r4 = java.lang.System.currentTimeMillis();
            r1 = r13;
            r1 = r1.a(r2, r3, r4, r6);
            if (r1 == 0) goto L_0x01e4;
        L_0x016a:
            r9 = 1;
            goto L_0x01e4;
        L_0x016c:
            r6 = r8.e;
            r3 = r8.f;
            r1 = r13.k;
            r1 = r1.a();
            r1 = r1.h;
            if (r1 == 0) goto L_0x01e4;
        L_0x017a:
            r2 = r13.p;
            r4 = defpackage.qyi.SHOW_BDAY_FEED_HEADER_PROMPT;
            r4 = (defpackage.fth) r4;
            r2 = r2.a(r4);
            if (r2 != 0) goto L_0x016a;
        L_0x0186:
            r1 = r1.longValue();
            r4 = new akqy;
            r4.<init>();
            r5 = "DateTime.now()";
            defpackage.akcr.a(r4, r5);
            r5 = "now";
            defpackage.akcr.b(r4, r5);
            r5 = new akqy;
            r5.<init>(r1);
            r1 = r4.d();
            r2 = r5.b;
            r2 = r2.E();
            r10 = r5.a;
            r1 = r2.b(r10, r1);
            r1 = r5.b_(r1);
            r4 = (defpackage.akrw) r4;
            r1 = (defpackage.akrw) r1;
            r1 = defpackage.akrd.a(r4, r1);
            r2 = "Days.daysBetween(now, birthday)";
            defpackage.akcr.a(r1, r2);
            r1 = r1.c();
            r2 = 6;
            if (r1 >= 0) goto L_0x01c7;
        L_0x01c6:
            goto L_0x01cb;
        L_0x01c7:
            if (r2 < r1) goto L_0x01cb;
        L_0x01c9:
            r1 = 1;
            goto L_0x01cc;
        L_0x01cb:
            r1 = 0;
        L_0x01cc:
            if (r1 == 0) goto L_0x01e4;
        L_0x01ce:
            r1 = r13.m;
            r1 = r1.a();
            if (r1 != 0) goto L_0x01e4;
        L_0x01d6:
            r2 = defpackage.qzf.BIRTHDAY_PARTY;
            r4 = java.lang.System.currentTimeMillis();
            r1 = r13;
            r1 = r1.a(r2, r3, r4, r6);
            if (r1 == 0) goto L_0x01e4;
        L_0x01e3:
            goto L_0x016a;
        L_0x01e4:
            if (r9 == 0) goto L_0x008f;
        L_0x01e6:
            r0 = r8;
            goto L_0x01ea;
        L_0x01e8:
            r0 = defpackage.qzi.h;
        L_0x01ea:
            r1 = r0.a;
            r2 = defpackage.qzf.UNDEFINED;
            if (r1 == r2) goto L_0x0211;
        L_0x01f0:
            r1 = r13.f;
            r1 = r1.b();
            r2 = r1;
            r2 = (defpackage.qxh) r2;
            r1 = r0.a;
            r3 = r1.b();
            r4 = defpackage.aakg.VIEW;
            r1 = r0.e;
            r5 = (long) r1;
            r13 = r13.a();
            r13 = r13.b;
            r7 = (long) r13;
            r13 = r0.f;
            r9 = (long) r13;
            r2.a(r3, r4, r5, r7, r9);
        L_0x0211:
            return r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rbp$g.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: rbp$i */
    public static final class i extends akcq implements akbl<Boolean, ajxw> {
        public i(ajwl ajwl) {
            super(1, ajwl);
        }

        public final String getName() {
            return "onNext";
        }

        public final akej getOwner() {
            return akde.a(ajwl.class);
        }

        public final String getSignature() {
            return "onNext(Ljava/lang/Object;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((ajwl) this.receiver).a(Boolean.valueOf(((Boolean) obj).booleanValue()));
            return ajxw.a;
        }
    }

    /* renamed from: rbp$j */
    static final class j<V> implements Callable<T> {
        private /* synthetic */ rbp a;
        private /* synthetic */ rbv b;

        j(rbp rbp, rbv rbv) {
            this.a = rbp;
            this.b = rbv;
        }

        public final /* synthetic */ Object call() {
            rbp.a(this.a, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: rbp$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ rbp a;

        b(rbp rbp) {
            this.a = rbp;
        }

        public final /* synthetic */ Object call() {
            rbp rbp = this.a;
            rbv rbv = rbp.g;
            if (rbv == null) {
                akcr.a();
            }
            rbp.a(rbp, rbv);
            return ajxw.a;
        }
    }

    /* renamed from: rbp$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ rbp a;
        private /* synthetic */ rbv b;

        c(rbp rbp, rbv rbv) {
            this.a = rbp;
            this.b = rbv;
        }

        public final /* synthetic */ Object call() {
            rbp.a(this.a, this.b);
            return ajxw.a;
        }
    }

    /* renamed from: rbp$d */
    static final class d<V> implements Callable<T> {
        private /* synthetic */ rbv a;
        private /* synthetic */ rbp b;
        private /* synthetic */ qzf c;

        d(rbv rbv, rbp rbp, qzf qzf) {
            this.a = rbv;
            this.b = rbp;
            this.c = qzf;
        }

        public final /* synthetic */ Object call() {
            rbp.a(this.b, this.a);
            return ajxw.a;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(rbp.class), "promptToFirstTimeShownMap", "getPromptToFirstTimeShownMap()Ljava/util/Map;"), new akdc(akde.a(rbp.class), LocalMessageActionModel.ANALYTICS, "getAnalytics()Lcom/snap/messaging/friendsfeed/analytics/ScalableFeedHeaderPromptAnalytics;"), new akdc(akde.a(rbp.class), "serverPrompts", "getServerPrompts()Lcom/snap/messaging/friendsfeed/model/ServerPromptsModel;")};
    }

    public rbp(Context context, gpb gpb, qwx qwx, rbt rbt, zgb zgb, iha iha, iqm iqm, ftl ftl, hxs hxs, aipn<qxh> aipn) {
        akcr.b(context, "context");
        akcr.b(gpb, "userAuthStore");
        akcr.b(qwx, "feedTopPromptStore");
        akcr.b(rbt, "topPromptPreferencesInterface");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(iha, "serializationHelper");
        akcr.b(iqm, "contactApi");
        akcr.b(ftl, "configProvider");
        akcr.b(hxs, "featureConfiguration");
        akcr.b(aipn, "analyticsLazy");
        this.j = context;
        this.k = gpb;
        this.l = qwx;
        this.m = rbt;
        this.t = zgb;
        this.n = iha;
        this.o = iqm;
        this.p = ftl;
        this.u = hxs;
        this.q = aipn;
        Object i = ajwl.i(Boolean.FALSE);
        String str = "BehaviorSubject.createDefault(false)";
        akcr.a(i, str);
        this.a = i;
        i = ajwl.i(Boolean.FALSE);
        akcr.a(i, str);
        this.c = i;
        i = ajfq.INSTANCE;
        akcr.a(i, "Disposables.disposed()");
        this.d = i;
        this.e = 4;
        this.f = ajxh.a(new a(this));
        this.s = ajxh.a(new h(this));
        this.h = new ajei();
        i = this.c.a((ajfl) f.a).a((ajdw) this.b.f()).p(new g(this));
        akcr.a(i, "visibilitySource.filter … { queryForPromptType() }");
        this.i = igs.a(i);
    }

    public static final /* synthetic */ void a(rbp rbp, rbv rbv) {
        hxs hxs = rbp.u;
        fth fth = jic.FEED_HEADER_PROMPT_V2_STATE_SYNC;
        Object b = rbp.n.b(rbv);
        akcr.a(b, "serializationHelper.toJs…ng(topPromptsSyncedState)");
        hxs.a(fth, b);
    }

    private final Map<String, Long> b() {
        return (Map) this.r.b();
    }

    private void c() {
        this.a.a(Boolean.TRUE);
    }

    /* Access modifiers changed, original: final */
    public final qzh a() {
        return (qzh) this.s.b();
    }

    public final void a(qzf qzf) {
        akcr.b(qzf, "promptType");
        rbv rbv = this.g;
        if (rbv != null) {
            rbv.a(qzf);
            rbv.a = Long.valueOf(System.currentTimeMillis());
            this.h.a(ajdx.c((Callable) new d(rbv, this, qzf)).b(ajwh.b).c());
        }
        c();
    }

    /* JADX WARNING: Missing block: B:18:0x00c0, code skipped:
            if (r3 == null) goto L_0x00a8;
     */
    public final boolean a(defpackage.qzf r16, int r17, long r18, int r20) {
        /*
        r15 = this;
        r0 = r15;
        r1 = r16;
        r2 = "promptType";
        defpackage.akcr.b(r1, r2);
        r3 = r0.g;
        r4 = 1;
        r5 = 0;
        r6 = 0;
        if (r3 != 0) goto L_0x00c5;
    L_0x000f:
        r3 = r0.p;
        r7 = defpackage.jic.SHOULD_RESET_TOP_PROMPTS_SYNCED_STATE;
        r7 = (defpackage.fth) r7;
        r3 = r3.a(r7);
        if (r3 == 0) goto L_0x0074;
    L_0x001b:
        r3 = new rbv;
        r7 = 5;
        r7 = new defpackage.rbu[r7];
        r8 = new rbu;
        r9 = defpackage.qzf.BIRTHDAY_PARTY;
        r8.<init>(r9, r6, r5);
        r7[r6] = r8;
        r8 = new rbu;
        r9 = defpackage.qzf.NOTIFICATION_PERMISSION;
        r8.<init>(r9, r6, r5);
        r7[r4] = r8;
        r8 = 2;
        r9 = new rbu;
        r10 = defpackage.qzf.PHONE_NUMBER_VERIFICATION;
        r9.<init>(r10, r6, r5);
        r7[r8] = r9;
        r8 = 3;
        r9 = new rbu;
        r10 = defpackage.qzf.EMAIL_VERIFICATION;
        r9.<init>(r10, r6, r5);
        r7[r8] = r9;
        r8 = 4;
        r9 = new rbu;
        r10 = defpackage.qzf.CONTACT_SYNC;
        r9.<init>(r10, r6, r5);
        r7[r8] = r9;
        r7 = defpackage.ajym.b(r7);
        r3.<init>(r5, r7);
        r0.g = r3;
        r3 = r0.h;
        r7 = new rbp$b;
        r7.<init>(r15);
        r7 = (java.util.concurrent.Callable) r7;
        r7 = defpackage.ajdx.c(r7);
        r8 = defpackage.ajwh.b;
        r7 = r7.b(r8);
        r7 = r7.c();
        r3.a(r7);
        goto L_0x00c5;
    L_0x0074:
        r3 = r0.p;
        r7 = defpackage.jic.FEED_HEADER_PROMPT_V2_STATE_SYNC;
        r7 = (defpackage.fth) r7;
        r3 = r3.j(r7);
        r7 = defpackage.jic.FEED_HEADER_PROMPT_V2_STATE_SYNC;
        r7 = r7.a();
        r8 = "IdentityConfigurationKey…PT_V2_STATE_SYNC.delegate";
        defpackage.akcr.a(r7, r8);
        r7 = r7.b();
        r7 = defpackage.akcr.a(r3, r7);
        if (r7 == 0) goto L_0x0095;
    L_0x0093:
        r3 = r5;
        goto L_0x00c3;
    L_0x0095:
        r7 = r3;
        r7 = (java.lang.CharSequence) r7;
        if (r7 == 0) goto L_0x00a3;
    L_0x009a:
        r7 = defpackage.akgb.a(r7);
        if (r7 == 0) goto L_0x00a1;
    L_0x00a0:
        goto L_0x00a3;
    L_0x00a1:
        r7 = 0;
        goto L_0x00a4;
    L_0x00a3:
        r7 = 1;
    L_0x00a4:
        r8 = "promptToFirstTimeShownMap";
        if (r7 == 0) goto L_0x00b6;
    L_0x00a8:
        r3 = r0.l;
        r7 = r15.b();
        defpackage.akcr.a(r7, r8);
        r3 = defpackage.rbv.a.a(r3, r7);
        goto L_0x00c3;
    L_0x00b6:
        r7 = r0.n;
        r9 = defpackage.rbv.class;
        r3 = r7.a(r3, r9);
        r3 = (defpackage.rbv) r3;
        if (r3 != 0) goto L_0x00c3;
    L_0x00c2:
        goto L_0x00a8;
    L_0x00c3:
        r0.g = r3;
    L_0x00c5:
        r3 = r0.g;
        if (r3 != 0) goto L_0x00ca;
    L_0x00c9:
        return r6;
    L_0x00ca:
        if (r3 != 0) goto L_0x00cf;
    L_0x00cc:
        defpackage.akcr.a();
    L_0x00cf:
        r3 = r3.b;
        r3 = (java.lang.Iterable) r3;
        r3 = r3.iterator();
        r7 = r5;
        r8 = 0;
    L_0x00d9:
        r9 = r3.hasNext();
        if (r9 == 0) goto L_0x00f1;
    L_0x00df:
        r9 = r3.next();
        r9 = (defpackage.rbu) r9;
        r10 = r9.a;
        if (r10 != r1) goto L_0x00d9;
    L_0x00e9:
        r7 = r9.b;
        r8 = r9.c;
        r14 = r8;
        r8 = r7;
        r7 = r14;
        goto L_0x00d9;
    L_0x00f1:
        r3 = r0.g;
        if (r3 != 0) goto L_0x00f8;
    L_0x00f5:
        defpackage.akcr.a();
    L_0x00f8:
        defpackage.akcr.b(r1, r2);
        r9 = "topPromptsSyncedState";
        defpackage.akcr.b(r3, r9);
        r10 = r20;
        if (r8 < r10) goto L_0x0105;
    L_0x0104:
        return r6;
    L_0x0105:
        r8 = r0.e;
        defpackage.akcr.b(r3, r9);
        r10 = r3.a;
        if (r10 == 0) goto L_0x0156;
    L_0x010e:
        r10 = r10.longValue();
        r10 = r18 - r10;
        r12 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r10 = r12.toDays(r10);
        r12 = (long) r8;
        r8 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r8 >= 0) goto L_0x0121;
    L_0x011f:
        r8 = 1;
        goto L_0x0122;
    L_0x0121:
        r8 = 0;
    L_0x0122:
        if (r8 != 0) goto L_0x0157;
    L_0x0124:
        r10 = r3.b;
        r10 = (java.lang.Iterable) r10;
        r10 = r10.iterator();
    L_0x012c:
        r11 = r10.hasNext();
        if (r11 == 0) goto L_0x013b;
    L_0x0132:
        r11 = r10.next();
        r11 = (defpackage.rbu) r11;
        r11.c = r5;
        goto L_0x012c;
    L_0x013b:
        r5 = r0.h;
        r10 = new rbp$c;
        r10.<init>(r15, r3);
        r10 = (java.util.concurrent.Callable) r10;
        r10 = defpackage.ajdx.c(r10);
        r11 = defpackage.ajwh.b;
        r10 = r10.b(r11);
        r10 = r10.c();
        r5.a(r10);
        goto L_0x0157;
    L_0x0156:
        r8 = 0;
    L_0x0157:
        if (r8 == 0) goto L_0x015a;
    L_0x0159:
        return r6;
    L_0x015a:
        if (r7 == 0) goto L_0x0170;
    L_0x015c:
        r1 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r2 = r7.longValue();
        r2 = r18 - r2;
        r1 = r1.toDays(r2);
        r3 = r17;
        r7 = (long) r3;
        r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1));
        if (r3 < 0) goto L_0x0211;
    L_0x016f:
        return r6;
    L_0x0170:
        r5 = "excludedPrompt";
        defpackage.akcr.b(r1, r5);
        defpackage.akcr.b(r3, r9);
        r5 = r3.b;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
    L_0x0180:
        r7 = r5.hasNext();
        if (r7 == 0) goto L_0x01bd;
    L_0x0186:
        r7 = r5.next();
        r7 = (defpackage.rbu) r7;
        r8 = r7.a;
        r8 = r8.a();
        r10 = r16.a();
        r8 = defpackage.akcr.a(r8, r10);
        r8 = r8 ^ r4;
        if (r8 == 0) goto L_0x0180;
    L_0x019d:
        r8 = r7.c;
        if (r8 == 0) goto L_0x0180;
    L_0x01a1:
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r7 = r7.c;
        if (r7 != 0) goto L_0x01aa;
    L_0x01a7:
        defpackage.akcr.a();
    L_0x01aa:
        r10 = r7.longValue();
        r10 = r18 - r10;
        r7 = r8.toDays(r10);
        r10 = r0.e;
        r10 = (long) r10;
        r12 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1));
        if (r12 >= 0) goto L_0x0180;
    L_0x01bb:
        r5 = 1;
        goto L_0x01be;
    L_0x01bd:
        r5 = 0;
    L_0x01be:
        if (r5 == 0) goto L_0x01c1;
    L_0x01c0:
        return r6;
    L_0x01c1:
        defpackage.akcr.b(r1, r2);
        defpackage.akcr.b(r3, r9);
        r2 = defpackage.qzf.UNDEFINED;
        if (r1 == r2) goto L_0x0211;
    L_0x01cb:
        r2 = java.lang.Long.valueOf(r18);
        r5 = "displayPromptType";
        defpackage.akcr.b(r1, r5);
        r5 = r3.b;
        r5 = (java.lang.Iterable) r5;
        r5 = r5.iterator();
    L_0x01dc:
        r6 = r5.hasNext();
        if (r6 == 0) goto L_0x01f7;
    L_0x01e2:
        r6 = r5.next();
        r6 = (defpackage.rbu) r6;
        r7 = r6.a;
        r7 = r7.id;
        r8 = r1.id;
        r7 = defpackage.akcr.a(r7, r8);
        if (r7 == 0) goto L_0x01dc;
    L_0x01f4:
        r6.c = r2;
        goto L_0x01dc;
    L_0x01f7:
        r1 = r0.h;
        r2 = new rbp$j;
        r2.<init>(r15, r3);
        r2 = (java.util.concurrent.Callable) r2;
        r2 = defpackage.ajdx.c(r2);
        r3 = defpackage.ajwh.b;
        r2 = r2.b(r3);
        r2 = r2.c();
        r1.a(r2);
    L_0x0211:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbp.a(qzf, int, long, int):boolean");
    }

    public final qzi b(qzf qzf) {
        akcr.b(qzf, "type");
        if (!qzf.hasDefault) {
            return qzi.h;
        }
        return new qzi(qzf, qzf.defaultIcon, qzf.a(this.j), qzf.b(this.j), 1, 2, 0);
    }
}
