package defpackage;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.brightcove.player.event.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: sex */
public final class sex implements sen {
    final zfw a = zgb.a(sdv.a, "AppLauncherIconBadgeManagerImpl");
    final Context b;
    final ajei c;
    final sel d;
    private final sir e = new sir(new d(this));
    private final aipn<gpu> f;
    private final Set<sem> g;

    /* renamed from: sex$d */
    static final class d extends akcq implements akbk<ajxw> {
        d(sex sex) {
            super(0, sex);
        }

        public final String getName() {
            return "bindInner";
        }

        public final akej getOwner() {
            return akde.a(sex.class);
        }

        public final String getSignature() {
            return "bindInner()V";
        }

        public final /* synthetic */ Object invoke() {
            sex sex = (sex) this.receiver;
            ajej a = sex.a.h().a((Runnable) new b(sex));
            akcr.a((Object) a, "schedulers.userInteracti…)\n            }\n        }");
            ajvv.a(a, sex.c);
            return ajxw.a;
        }
    }

    /* renamed from: sex$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sex$b */
    static final class b implements Runnable {
        private /* synthetic */ sex a;

        b(sex sex) {
            this.a = sex;
        }

        public final void run() {
            if (VERSION.SDK_INT < 26) {
                sex.a(this.a);
                return;
            }
            sex sex = this.a;
            MemoryInfo memoryInfo = new MemoryInfo();
            Object systemService = sex.b.getSystemService(Event.ACTIVITY);
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                activityManager.getMemoryInfo(memoryInfo);
                systemService = (akcr.a(Build.MANUFACTURER, (Object) "samsung") && activityManager.isLowRamDevice() && VERSION.SDK_INT >= 26) ? 1 : null;
                if (systemService != null) {
                    sex.a(this.a);
                    return;
                }
                sex = this.a;
                ajej a = sex.a.h().a((Runnable) new c(sex));
                akcr.a((Object) a, "schedulers.userInteracti…ger.hideBadge()\n        }");
                ajvv.a(a, sex.c);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    /* renamed from: sex$e */
    static final class e<T, R> implements ajfc<Object[], R> {
        public static final e a = new e();

        e() {
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:25:0x0060 in {2, 3, 13, 15, 17, 20, 22, 24} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
            /*
            r5 = this;
            r6 = (java.lang.Object[]) r6;
            r0 = "objects";
            defpackage.akcr.b(r6, r0);
            r0 = r6.length;
            r1 = 0;
            r2 = 1;
            if (r0 != 0) goto L_0x000e;
            r0 = 1;
            goto L_0x000f;
            r0 = 0;
            if (r0 != 0) goto L_0x0056;
            r0 = r6[r1];
            r1 = defpackage.ajyi.g(r6);
            r3 = "null cannot be cast to non-null type kotlin.Int";
            if (r1 <= 0) goto L_0x0043;
            r4 = r6[r2];
            if (r0 == 0) goto L_0x003d;
            r0 = (java.lang.Integer) r0;
            r0 = r0.intValue();
            if (r4 == 0) goto L_0x0037;
            r4 = (java.lang.Integer) r4;
            r4 = r4.intValue();
            r0 = r0 + r4;
            r0 = java.lang.Integer.valueOf(r0);
            if (r2 == r1) goto L_0x0043;
            r2 = r2 + 1;
            goto L_0x001b;
            r6 = new ajxt;
            r6.<init>(r3);
            throw r6;
            r6 = new ajxt;
            r6.<init>(r3);
            throw r6;
            if (r0 == 0) goto L_0x0050;
            r0 = (java.lang.Integer) r0;
            r6 = r0.intValue();
            r6 = java.lang.Integer.valueOf(r6);
            return r6;
            r6 = new ajxt;
            r6.<init>(r3);
            throw r6;
            r6 = new java.lang.UnsupportedOperationException;
            r0 = "Empty array can't be reduced.";
            r6.<init>(r0);
            r6 = (java.lang.Throwable) r6;
            throw r6;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.sex$e.apply(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: sex$f */
    static final class f<T> implements ajfb<Integer> {
        private /* synthetic */ sex a;

        f(sex sex) {
            this.a = sex;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            sel sel = this.a.d;
            akcr.a(obj, "it");
            sel.a(obj.intValue());
        }
    }

    /* renamed from: sex$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sex$h */
    static final class h<T> implements ajfb<gpt> {
        private /* synthetic */ sex a;

        h(sex sex) {
            this.a = sex;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.d.a();
        }
    }

    /* renamed from: sex$c */
    static final class c implements Runnable {
        private /* synthetic */ sex a;

        c(sex sex) {
            this.a = sex;
        }

        public final void run() {
            this.a.d.a();
        }
    }

    static {
        a aVar = new a();
    }

    public sex(Context context, ajei ajei, aipn<gpu> aipn, Set<sem> set, sel sel, zgb zgb) {
        akcr.b(context, "context");
        akcr.b(ajei, "logoutDisposable");
        akcr.b(aipn, "userSession");
        akcr.b(set, "badgeDataProviders");
        akcr.b(sel, "appIconBadger");
        akcr.b(zgb, "schedulersProvider");
        this.b = context;
        this.c = ajei;
        this.f = aipn;
        this.g = set;
        this.d = sel;
    }

    public static final /* synthetic */ void a(sex sex) {
        ajei ajei = sex.c;
        List arrayList = new ArrayList();
        for (sem a : sex.g) {
            arrayList.add(a.a().h(Integer.valueOf(0)));
        }
        ajej a2 = ajdp.a((Iterable) arrayList, (ajfc) e.a).b((ajdw) sex.a.h()).a((ajfb) new f(sex), (ajfb) g.a);
        akcr.a((Object) a2, "Observable.combineLatest… observable\") }\n        )");
        ajei.a(a2);
        ajei = sex.c;
        ajej f = ((gpu) sex.f.get()).a().b((ajdw) sex.a.b()).a((ajdw) sex.a.h()).f((ajfb) new h(sex));
        akcr.a((Object) f, "userSession.get()\n      …pIconBadger.hideBadge() }");
        ajei.a(f);
    }

    public final void a() {
        this.e.a();
    }
}
