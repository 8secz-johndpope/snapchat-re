package defpackage;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.snap.core.db.record.ConnectedAppsModel;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.exz.b;
import defpackage.fbq.e;
import defpackage.fbq.f;
import defpackage.fbq.g;
import defpackage.fch.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: fbo */
public final class fbo implements eyl {
    private final aipn<ezd> A;
    final ajwo<Pair<MotionEvent, Boolean>> a;
    final ajei b = new ajei();
    final fbs c = new fbs();
    zkf d;
    ViewGroup e;
    zmh f;
    zmh g;
    fbq h;
    String i;
    boolean j = true;
    boolean k = true;
    WeakReference<abit> l = new WeakReference(null);
    int m;
    int n;
    final fdd o;
    final aipn<eyo> p;
    final ajwy<fap> q;
    private final zfw r = zgb.a(eym.f, "drawer");
    private final ajei s = new ajei();
    private boolean t;
    private final fcp u;
    private final fcj v;
    private final exz w;
    private final aipn<gfu> x;
    private final ezh y;
    private final abkq z;

    /* renamed from: fbo$a */
    static final class a<T> implements ajfb<gej> {
        public static final a a = new a();

        a() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fbo$b */
    static final class b<T> implements ajfb<Throwable> {
        private /* synthetic */ String a;

        b(String str) {
            this.a = str;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: fbo$c */
    static final class c implements ajev {
        private /* synthetic */ fbo a;

        c(fbo fbo) {
            this.a = fbo;
        }

        public final void run() {
            this.a.j = true;
        }
    }

    /* renamed from: fbo$g */
    static final class g implements ajev {
        private /* synthetic */ fbo a;
        private /* synthetic */ fbj b;

        g(fbo fbo, fbj fbj) {
            this.a = fbo;
            this.b = fbj;
        }

        public final void run() {
            this.a.k = true;
        }
    }

    /* renamed from: fbo$j */
    static final class j<T> implements ajfb<List<fgo>> {
        private /* synthetic */ fbo a;
        private /* synthetic */ fce b;

        j(fbo fbo, fce fce) {
            this.a = fbo;
            this.b = fce;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            fbo fbo = this.a;
            akcr.a(obj, "items");
            String str = this.b.a;
            fch a = a.a(fbo.n, fbo.m, obj.size(), false);
            ViewGroup viewGroup = fbo.e;
            if (viewGroup == null) {
                akcr.a("containerView");
            }
            Object context = viewGroup.getContext();
            akcr.a(context, "containerView.context");
            fbd fbd = new fbd(context, a, fbo.n, fbo.m);
            String str2 = fbo.i;
            if (str2 == null) {
                akcr.a();
            }
            Object obj2 = fbo.p.get();
            akcr.a(obj2, "fragmentService.get()");
            zms zms = new zms((zlx) new fbx(a, str2, (eyo) obj2), fbt.class);
            fby fby = new fby(fbo.o, str, fbo.c);
            zkf zkf = fbo.d;
            if (zkf == null) {
                akcr.a("bus");
            }
            zke a2 = zkf.a();
            akcr.a((Object) a2, "bus.eventDispatcher");
            fbo.g = new zmh(zms, a2, null, null, ajyl.a(fby), 44);
            fbq fbq = fbo.h;
            String str3 = "target";
            if (fbq == null) {
                akcr.a(str3);
            }
            RecyclerView b = fbq.b();
            zmh zmh = fbo.g;
            String str4 = "puppyBuildAdapter";
            if (zmh == null) {
                akcr.a(str4);
            }
            b.setAdapter(zmh);
            zmh zmh2 = fbo.g;
            if (zmh2 == null) {
                akcr.a(str4);
            }
            ajvv.a(zmh2.e(), fbo.b);
            fbq = fbo.h;
            if (fbq == null) {
                akcr.a(str3);
            }
            int size = obj.size();
            zmh zmh3 = fbo.g;
            if (zmh3 == null) {
                akcr.a(str4);
            }
            fbq.a(a, size, fbd, zmh3);
        }
    }

    /* renamed from: fbo$k */
    static final class k<T> implements ajfb<List<fgm>> {
        private /* synthetic */ fbo a;
        private /* synthetic */ fch b;

        k(fbo fbo, fch fch) {
            this.a = fbo;
            this.b = fch;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (List) obj;
            akcr.a(obj, "updatedItems");
            Collection arrayList = new ArrayList();
            for (Object next : (Iterable) obj) {
                Object obj2 = (fgm) next;
                akcr.a(obj2, "it");
                if (obj2.l()) {
                    arrayList.add(next);
                }
            }
            List list = (List) arrayList;
            fch a = a.a(this.a.n, this.a.m, list.size(), obj.size() != list.size());
            ViewGroup viewGroup = this.a.e;
            if (viewGroup == null) {
                akcr.a("containerView");
            }
            Object next2 = viewGroup.getContext();
            akcr.a(next2, "containerView.context");
            fbd fbd = new fbd(next2, this.b, this.a.n, this.a.m);
            this.a.a(a, fbd);
            fbq a2 = fbo.a(this.a);
            int size = list.size();
            zmh zmh = this.a.f;
            if (zmh == null) {
                akcr.a("adapter");
            }
            a2.a(a, size, fbd, zmh);
        }
    }

    /* renamed from: fbo$d */
    static final class d extends akcs implements akbl<String, ajxw> {
        private /* synthetic */ fbo a;
        private /* synthetic */ boolean b;

        d(fbo fbo, boolean z) {
            this.a = fbo;
            this.b = z;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            fap fap;
            aafi aafi;
            if (this.b) {
                fap = (fap) this.a.q.get();
                aafi = aafi.REPLACE;
            } else {
                fap = (fap) this.a.q.get();
                aafi = aafi.LAUNCH;
            }
            fap.a(aafi);
            return ajxw.a;
        }
    }

    /* renamed from: fbo$e */
    static final class e extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ fbo a;
        private /* synthetic */ String b;

        e(fbo fbo, String str) {
            this.a = fbo;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "error");
            fbo.a(this.a).a(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: fbo$f */
    static final class f extends akcs implements akbk<ajxw> {
        private /* synthetic */ fbo a;
        private /* synthetic */ fbb b;

        f(fbo fbo, fbb fbb) {
            this.a = fbo;
            this.b = fbb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            abif h;
            abit abit = (abit) this.a.l.get();
            if (abit != null) {
                h = abit.h();
                if (h != null) {
                    h.c();
                }
            }
            abit = (abit) this.a.l.get();
            if (abit != null) {
                h = abit.h();
                if (h != null) {
                    h.a(abjc.NONE);
                }
            }
            this.a.a(this.b.a, this.b.b);
            return ajxw.a;
        }
    }

    /* renamed from: fbo$h */
    static final class h extends akcs implements akbk<ajxw> {
        private /* synthetic */ fbo a;
        private /* synthetic */ fbj b;

        h(fbo fbo, fbj fbj) {
            this.a = fbo;
            this.b = fbj;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ((fap) this.a.q.get()).a(aafi.HIDE);
            return ajxw.a;
        }
    }

    /* renamed from: fbo$i */
    static final class i extends akcs implements akbl<Throwable, ajxw> {
        private /* synthetic */ fbo a;
        private /* synthetic */ fbj b;

        i(fbo fbo, fbj fbj) {
            this.a = fbo;
            this.b = fbj;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "error");
            fbo.a(this.a).a(this.b.b);
            return ajxw.a;
        }
    }

    public fbo(fdd fdd, fcp fcp, fcj fcj, exz exz, aipn<eyo> aipn, aipn<gfu> aipn2, ezh ezh, abkq abkq, ajwy<fap> ajwy, aipn<ezd> aipn3) {
        akcr.b(fdd, "cognacLauncherItemManager");
        akcr.b(fcp, "cognacDockItemManagerV2");
        akcr.b(fcj, "actionHandler");
        akcr.b(exz, "alertService");
        akcr.b(aipn, "fragmentService");
        akcr.b(aipn2, "contentResolver");
        akcr.b(ezh, "webGLSupportStore");
        akcr.b(abkq, "userSession");
        akcr.b(ajwy, "cognacAnalytics");
        akcr.b(aipn3, "tweakService");
        this.o = fdd;
        this.u = fcp;
        this.v = fcj;
        this.w = exz;
        this.p = aipn;
        this.x = aipn2;
        this.y = ezh;
        this.z = abkq;
        this.q = ajwy;
        this.A = aipn3;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Pa…<MotionEvent, Boolean>>()");
        this.a = ajwo;
        zgb zgb = new zgb();
    }

    public final ajej a() {
        this.t = true;
        this.d = new zkf();
        zkf zkf = this.d;
        if (zkf == null) {
            akcr.a("bus");
        }
        ajej a = zkf.a(this);
        akcr.a((Object) a, "bus.subscribe(this)");
        ajvv.a(a, this.s);
        List<String> arrayList = new ArrayList();
        Object b = this.o.b();
        akcr.a(b, "cognacLauncherItemManager.cognacLauncherItems");
        for (Object obj : (Iterable) b) {
            akcr.a(obj, "item");
            Object c = obj.c();
            akcr.a(c, "item.imageUrl");
            arrayList.add(c);
            c = obj.h();
            String str = "item.imageResources";
            akcr.a(c, str);
            c = c.c();
            akcr.a(c, "item.imageResources.logoImageUrl");
            arrayList.add(c);
            c = obj.h();
            akcr.a(c, str);
            c = c.e();
            akcr.a(c, "item.imageResources.horizontalImageUrl");
            arrayList.add(c);
            Object obj2 = obj2.h();
            akcr.a(obj2, str);
            obj2 = obj2.a();
            akcr.a(obj2, "item.imageResources.iconImageUrl");
            arrayList.add(obj2);
        }
        for (String str2 : arrayList) {
            Uri a2 = fcx.a(str2);
            gfu gfu = (gfu) this.x.get();
            akcr.a((Object) a2, MessageMediaRefModel.URI);
            ajej a3 = gfu.a(a2, eym.b, true, new gdy[0]).b((ajdw) this.r.g()).a((ajdw) this.r.b()).a((ajfb) a.a, (ajfb) new b(str2));
            akcr.a((Object) a3, "contentResolver.get().re…                       })");
            ajvv.a(a3, this.s);
        }
        return this.s;
    }

    /* JADX WARNING: Missing block: B:8:0x001f, code skipped:
            if (r7 == null) goto L_0x0021;
     */
    /* JADX WARNING: Missing block: B:9:0x0021, code skipped:
            defpackage.akcr.a(r1);
     */
    /* JADX WARNING: Missing block: B:11:0x002a, code skipped:
            return r7.b();
     */
    /* JADX WARNING: Missing block: B:22:0x0069, code skipped:
            if (r7 == null) goto L_0x0021;
     */
    public final android.view.View a(android.view.ViewGroup r7) {
        /*
        r6 = this;
        r0 = "container";
        defpackage.akcr.b(r7, r0);
        r0 = r6;
        r0 = (defpackage.fbo) r0;
        r0 = r0.e;
        r1 = "target";
        r2 = "containerView";
        if (r0 == 0) goto L_0x002b;
    L_0x0010:
        r0 = r6.e;
        if (r0 != 0) goto L_0x0017;
    L_0x0014:
        defpackage.akcr.a(r2);
    L_0x0017:
        r0 = defpackage.akcr.a(r7, r0);
        if (r0 == 0) goto L_0x002b;
    L_0x001d:
        r7 = r6.h;
        if (r7 != 0) goto L_0x0024;
    L_0x0021:
        defpackage.akcr.a(r1);
    L_0x0024:
        r7 = r7.b();
        r7 = (android.view.View) r7;
        return r7;
    L_0x002b:
        r6.e = r7;
        r7 = new fbq;
        r0 = r6.e;
        if (r0 != 0) goto L_0x0036;
    L_0x0033:
        defpackage.akcr.a(r2);
    L_0x0036:
        r3 = r6.w;
        r4 = r6.q;
        r5 = r6.p;
        r7.<init>(r0, r3, r4, r5);
        r6.h = r7;
        r7 = r6.h;
        if (r7 != 0) goto L_0x0048;
    L_0x0045:
        defpackage.akcr.a(r1);
    L_0x0048:
        r0 = "presenter";
        defpackage.akcr.b(r6, r0);
        r7.a = r6;
        r7 = r6.e;
        if (r7 != 0) goto L_0x0056;
    L_0x0053:
        defpackage.akcr.a(r2);
    L_0x0056:
        r7 = r7.getResources();
        r0 = "containerView.resources";
        defpackage.akcr.a(r7, r0);
        r7 = r7.getDisplayMetrics();
        r7 = r7.widthPixels;
        r6.n = r7;
        r7 = r6.h;
        if (r7 != 0) goto L_0x0024;
    L_0x006b:
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbo.a(android.view.ViewGroup):android.view.View");
    }

    public final void a(int i) {
        this.m = i;
    }

    public final void a(abit abit) {
        akcr.b(abit, "talkSession");
        this.l = new WeakReference(abit);
    }

    /* Access modifiers changed, original: final */
    public final void a(fch fch, fbd fbd) {
        String str = this.i;
        if (str == null) {
            akcr.a();
        }
        fcp fcp = this.u;
        Object obj = this.A.get();
        akcr.a(obj, "tweakService.get()");
        zms zms = new zms((zlx) new fat(fch, str, fcp, ((ezd) obj).v()), fbt.class);
        fdd fdd = this.o;
        fcp fcp2 = this.u;
        String str2 = this.i;
        if (str2 == null) {
            akcr.a();
        }
        fbf fbf = new fbf(fdd, fcp2, str2, this.c, this.y.b(), this.z, fbd);
        zkf zkf = this.d;
        if (zkf == null) {
            akcr.a("bus");
        }
        zke a = zkf.a();
        akcr.a((Object) a, "bus.eventDispatcher");
        this.f = new zmh(zms, a, null, null, ajyl.a(fbf), 44);
        fbq fbq = this.h;
        if (fbq == null) {
            akcr.a("target");
        }
        RecyclerView b = fbq.b();
        zmh zmh = this.f;
        String str3 = "adapter";
        if (zmh == null) {
            akcr.a(str3);
        }
        b.setAdapter(zmh);
        zmh zmh2 = this.f;
        if (zmh2 == null) {
            akcr.a(str3);
        }
        ajvv.a(zmh2.e(), this.b);
    }

    public final void a(String str) {
        akcr.b(str, "conversationId");
        fap fap = (fap) this.q.get();
        aaev aaev = new aaev();
        aaev.a(fap.d);
        aaev.a(Long.valueOf(fap.a));
        fap.e.a(aaev);
        boolean z = true;
        if ((akcr.a(this.i, (Object) str) ^ 1) != 0) {
            this.i = str;
        }
        String str2 = "containerView";
        String str3 = "containerView.context";
        String str4 = "target";
        String str5 = "adapter";
        Object context;
        fbq fbq;
        if (this.o.f()) {
            List c = this.o.c();
            fch a = a.a(this.n, this.m, c.size(), false);
            ViewGroup viewGroup = this.e;
            if (viewGroup == null) {
                akcr.a(str2);
            }
            context = viewGroup.getContext();
            akcr.a(context, str3);
            fbd fbd = new fbd(context, a, this.n, this.m);
            str3 = this.i;
            if (str3 == null) {
                akcr.a();
            }
            Object obj = this.p.get();
            akcr.a(obj, "fragmentService.get()");
            zms zms = new zms((zlx) new fbx(a, str3, (eyo) obj), fbt.class);
            fcd fcd = new fcd(this.o, this.c);
            zkf zkf = this.d;
            if (zkf == null) {
                akcr.a("bus");
            }
            zke a2 = zkf.a();
            akcr.a((Object) a2, "bus.eventDispatcher");
            this.f = new zmh(zms, a2, null, null, ajyl.a(fcd), 44);
            fbq = this.h;
            if (fbq == null) {
                akcr.a(str4);
            }
            RecyclerView b = fbq.b();
            zmh zmh = this.f;
            if (zmh == null) {
                akcr.a(str5);
            }
            b.setAdapter(zmh);
            zmh zmh2 = this.f;
            if (zmh2 == null) {
                akcr.a(str5);
            }
            ajvv.a(zmh2.e(), this.b);
            fbq = this.h;
            if (fbq == null) {
                akcr.a(str4);
            }
            int size = c.size();
            zmh = this.f;
            if (zmh == null) {
                akcr.a(str5);
            }
            fbq.a(a, size, fbd, zmh);
            return;
        }
        Object b2 = this.o.b();
        akcr.a(b2, "items");
        Collection arrayList = new ArrayList();
        for (Object next : (Iterable) b2) {
            Object obj2 = (fgm) next;
            akcr.a(obj2, "it");
            if (obj2.l()) {
                arrayList.add(next);
            }
        }
        List list = (List) arrayList;
        int i = this.n;
        int i2 = this.m;
        int size2 = list.size();
        if (b2.size() == list.size()) {
            z = false;
        }
        fch a3 = a.a(i, i2, size2, z);
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 == null) {
            akcr.a(str2);
        }
        context = viewGroup2.getContext();
        akcr.a(context, str3);
        fbd fbd2 = new fbd(context, a3, this.n, this.m);
        a(a3, fbd2);
        fbq = this.h;
        if (fbq == null) {
            akcr.a(str4);
        }
        int size3 = list.size();
        zmh zmh3 = this.f;
        if (zmh3 == null) {
            akcr.a(str5);
        }
        fbq.a(a3, size3, fbd2, zmh3);
        ajej f = this.o.a().a((ajdw) this.r.l()).f((ajfb) new k(this, a3));
        akcr.a((Object) f, "cognacLauncherItemManage…er)\n                    }");
        ajvv.a(f, this.b);
    }

    /* Access modifiers changed, original: final */
    public final void a(String str, String str2) {
        if (this.j && !TextUtils.isEmpty(this.i)) {
            this.j = false;
            boolean a = this.u.a(this.i);
            fcj fcj = this.v;
            String str3 = this.i;
            if (str3 == null) {
                akcr.a();
            }
            ajdj a2 = fcj.a(str3, str, true).a((ajdw) this.r.l()).a((ajev) new c(this));
            akcr.a((Object) a2, "actionHandler.launchAppI…ally { clickable = true }");
            ajvv.a(ajwe.a(a2, (akbl) new e(this, str2), ajwe.a, (akbl) new d(this, a)), this.b);
        }
    }

    public final void b() {
        fap fap = (fap) this.q.get();
        aaet aaet = new aaet();
        aaet.a(fap.d);
        aaet.a(Long.valueOf(fap.a));
        fap.e.a(aaet);
        this.b.a();
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacChatDrawerIncompatibleItemClickEvent(fay fay) {
        akcr.b(fay, "event");
        fbq fbq = this.h;
        if (fbq == null) {
            akcr.a("target");
        }
        akcr.b(fay.a, ConnectedAppsModel.APPNAME);
        ((fap) fbq.h.get()).a(aaep.BLACKLISTED_CANNOT_PLAY);
        fbq.g.a(fbq.b, fbq.c.getString(R.string.cognac_incompatible_message, new Object[]{r12}), fbq.c.getString(R.string.cognac_learn_more), fbq.c.getString(R.string.okay), new f(fbq), g.a, eym.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacChatDrawerItemClickEvent(fbb fbb) {
        akcr.b(fbb, "event");
        abit abit = (abit) this.l.get();
        if (abit == null || !abit.k()) {
            a(fbb.a, fbb.b);
            return;
        }
        fbq fbq = this.h;
        if (fbq == null) {
            akcr.a("target");
        }
        akbk fVar = new f(this, fbb);
        akcr.b(fbb.b, ConnectedAppsModel.APPNAME);
        akcr.b(fVar, "yesAction");
        fbq.g.a(fbq.b, fbq.c.getString(R.string.cognac_launch_app_end_call_alert_description, new Object[]{r2}), fbq.c.getString(R.string.cognac_launch_app_end_call_alert_yes), fbq.c.getString(R.string.cancel), (b) new e(fVar), eym.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacChatDrawerLaunchedItemClickEvent(fbj fbj) {
        akcr.b(fbj, "event");
        if (this.k && !TextUtils.isEmpty(this.i)) {
            this.k = false;
            fcp fcp = this.u;
            String str = this.i;
            if (str == null) {
                akcr.a();
            }
            fgk a = fcp.a(str, fbj.a);
            if (a != null) {
                ajcx f = this.v.a(a).a((ajdw) this.r.l()).f(new g(this, fbj));
                akcr.a((Object) f, "actionHandler.terminateA…rue\n                    }");
                ajvv.a(ajwe.a(f, (akbl) new i(this, fbj), (akbk) new h(this, fbj)), this.b);
            }
        }
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacChatDrawerLongClickEvent(fbe fbe) {
        akcr.b(fbe, "event");
        ((eyo) this.p.get()).a(fbe.a);
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onCognacUnsupportedSectionHeaderClickEvent(fbu fbu) {
        akcr.b(fbu, "event");
        ((eyo) this.p.get()).a("https://support.snapchat.com/article/games");
    }

    @akqq(a = ThreadMode.MAIN)
    public final void onPuppyProjectItemClickEvent(fce fce) {
        akcr.b(fce, "event");
        ajej e = this.o.a(fce.a).a((ajdw) this.r.l()).e((ajfb) new j(this, fce));
        akcr.a((Object) e, "cognacLauncherItemManage…(items, event.projectId)}");
        ajvv.a(e, this.b);
    }
}
