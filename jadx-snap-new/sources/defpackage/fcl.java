package defpackage;

import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.ezy.b;
import defpackage.ezy.c;
import defpackage.ezy.d;
import defpackage.ezy.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: fcl */
public final class fcl implements eya {
    final ajwy<fdd> a;
    final ajwy<fcj> b;
    final ajwy<ezy> c;
    final ajwy<iha> d;
    final ajwy<ezd> e;
    final ajwy<abss> f;
    private boolean g;
    private final zfw h = zgb.a(eym.f, "CognacAppListServiceImpl");
    private final ajxe i = ajxh.a(new b(this));
    private final ajwy<ftl> j;
    private final ajwy<fan> k;

    /* renamed from: fcl$b */
    static final class b extends akcs implements akbk<ajcx> {
        final /* synthetic */ fcl a;

        /* renamed from: fcl$b$1 */
        static final class 1<T, R> implements ajfc<Boolean, ajdb> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajcx e;
                Boolean bool = (Boolean) obj;
                akcr.b(bool, "it");
                if (bool.booleanValue()) {
                    fcl fcl = this.a.a;
                    ezy ezy = (ezy) fcl.c.get();
                    Object selectAllFromCognacAppList = fad.a.selectAllFromCognacAppList();
                    akcr.a(selectAllFromCognacAppList, "CognacAppListRecord.FACT…ectAllFromCognacAppList()");
                    Object p = ezy.a.queryAndMapToList(selectAllFromCognacAppList, new c(fad.b)).p(new d(ezy));
                    akcr.a(p, "dbClient.queryAndMapToLi… -> createApp(record) } }");
                    e = p.d((Object) ajyw.a).c((ajfb) new c(fcl)).d((ajfb) new d(fcl)).e();
                    akcr.a((Object) e, "appListRepository.get().…         .ignoreElement()");
                } else {
                    e = this.a.a.c();
                }
                return e;
            }
        }

        b(fcl fcl) {
            this.a = fcl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object obj;
            String str;
            fcl fcl = this.a;
            Object obj2 = fcl.f.get();
            akcr.a(obj2, "releaseManager.get()");
            if (((abss) obj2).k()) {
                obj2 = fcl.e.get();
                String str2 = "cognacTweakService.get()";
                akcr.a(obj2, str2);
                ajeb n = ((ezd) obj2).n();
                akcr.a((Object) n, "cognacTweakService.get()…ppListExpirationInSeconds");
                obj = fcl.e.get();
                akcr.a(obj, str2);
                obj = ((ezd) obj).o();
                akcr.a(obj, "cognacTweakService.get().lastLoadAppListTimestamp");
                obj = ajdx.a(n, (ajeb) obj, (ajex) new j());
                str = "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })";
            } else {
                obj = ajdx.b(Boolean.FALSE);
                str = "Single.just(false)";
            }
            akcr.a(obj, str);
            return obj.e((ajfc) new 1(this)).d();
        }
    }

    /* renamed from: fcl$a */
    static final class a<T, R> implements ajfc<List<String>, ajdb> {
        private /* synthetic */ fcl a;
        private /* synthetic */ ajdx b;

        a(fcl fcl, ajdx ajdx) {
            this.a = fcl;
            this.b = ajdx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "conversationIds");
            return ((fcj) this.a.b.get()).a(list);
        }
    }

    /* renamed from: fcl$c */
    static final class c<T> implements ajfb<List<? extends fgm>> {
        private /* synthetic */ fcl a;

        c(fcl fcl) {
            this.a = fcl;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((fdd) this.a.a.get()).a((Iterable) (List) obj);
        }
    }

    /* renamed from: fcl$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ fcl a;

        d(fcl fcl) {
            this.a = fcl;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((fdd) this.a.a.get()).e();
        }
    }

    /* renamed from: fcl$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ fcl a;

        h(fcl fcl) {
            this.a = fcl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            obj = (List) obj;
            akcr.b(obj, "it");
            ezy ezy = (ezy) this.a.c.get();
            return ezy.a.runInTransaction("Cognac:clearApps", new b(ezy)).b((ajeb) ajdx.b(obj));
        }
    }

    /* renamed from: fcl$i */
    static final class i<T, R> implements ajfc<List<? extends fgm>, ajdb> {
        private /* synthetic */ fcl a;

        i(fcl fcl) {
            this.a = fcl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            ezy ezy = (ezy) this.a.c.get();
            Collection collection = list;
            akcr.b(collection, "items");
            return ezy.a.runInTransaction("Cognac:insertApps", new f(ezy, collection));
        }
    }

    /* renamed from: fcl$j */
    public static final class j<T1, T2, R> implements ajex<Integer, Long, R> {
        public final R apply(Integer num, Long l) {
            Object obj = l;
            num = num;
            long currentTimeMillis = System.currentTimeMillis();
            akcr.a(obj, "lastLoadAppListTimestamp");
            currentTimeMillis -= obj.longValue();
            boolean z = currentTimeMillis > 0 && currentTimeMillis < ((long) (num.intValue() * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL));
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: fcl$e */
    static final class e extends akcq implements akbl<acdg, List<? extends fgm>> {
        e(fcl fcl) {
            super(1, fcl);
        }

        public final String getName() {
            return "getCognacLauncherItems";
        }

        public final akej getOwner() {
            return akde.a(fcl.class);
        }

        public final String getSignature() {
            return "getCognacLauncherItems(Lcom/snapchat/cognac/apps/proto/nano/ListAppsResponse;)Ljava/util/List;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            acdg acdg = (acdg) obj;
            akcr.b(acdg, "p1");
            fcl fcl = (fcl) this.receiver;
            acdb[] acdbArr = acdg.a;
            List arrayList = new ArrayList();
            for (acdb a : acdbArr) {
                Object a2 = fes.a((iha) fcl.d.get(), a, true);
                akcr.a(a2, "CognacUtils.createLaunch…nHelper.get(), app, true)");
                arrayList.add(a2);
            }
            return arrayList;
        }
    }

    /* renamed from: fcl$f */
    static final class f extends akcq implements akbl<List<? extends fgm>, ajxw> {
        f(fcl fcl) {
            super(1, fcl);
        }

        public final String getName() {
            return "onLoadAppListFromServerSuccess";
        }

        public final akej getOwner() {
            return akde.a(fcl.class);
        }

        public final String getSignature() {
            return "onLoadAppListFromServerSuccess(Ljava/util/List;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            List list = (List) obj;
            akcr.b(list, "p1");
            fcl fcl = (fcl) this.receiver;
            ((fdd) fcl.a.get()).a((Iterable) list);
            ((ezd) fcl.e.get()).a(System.currentTimeMillis());
            return ajxw.a;
        }
    }

    /* renamed from: fcl$g */
    static final class g extends akcq implements akbl<Throwable, ajxw> {
        g(fcl fcl) {
            super(1, fcl);
        }

        public final String getName() {
            return "onLoadAppListFromServerFailed";
        }

        public final akej getOwner() {
            return akde.a(fcl.class);
        }

        public final String getSignature() {
            return "onLoadAppListFromServerFailed(Ljava/lang/Throwable;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((Throwable) obj, "p1");
            ((fdd) ((fcl) this.receiver).a.get()).e();
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fcl.class), "loadAppListCompletable", "getLoadAppListCompletable()Lio/reactivex/Completable;");
    }

    public fcl(ajwy<fdd> ajwy, ajwy<fcj> ajwy2, ajwy<ftl> ajwy3, ajwy<ezy> ajwy4, zgb zgb, ajwy<fan> ajwy5, ajwy<iha> ajwy6, ajwy<ezd> ajwy7, ajwy<abss> ajwy8) {
        akcr.b(ajwy, "launcherItemManager");
        akcr.b(ajwy2, "actionHandler");
        akcr.b(ajwy3, "configProvider");
        akcr.b(ajwy4, "appListRepository");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ajwy5, "networkHandler");
        akcr.b(ajwy6, "serializationHelper");
        akcr.b(ajwy7, "cognacTweakService");
        akcr.b(ajwy8, "releaseManager");
        this.a = ajwy;
        this.b = ajwy2;
        this.j = ajwy3;
        this.c = ajwy4;
        this.k = ajwy5;
        this.d = ajwy6;
        this.e = ajwy7;
        this.f = ajwy8;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0033 in {2, 4, 8, 10} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajcx a(defpackage.ajdx<java.util.List<java.lang.String>> r3) {
        /*
        r2 = this;
        r0 = "latestConversationIds";
        defpackage.akcr.b(r3, r0);
        r0 = r2.g;
        if (r0 == 0) goto L_0x0015;
        r3 = defpackage.ajhn.a;
        r3 = defpackage.ajvo.a(r3);
        r0 = "Completable.complete()";
        defpackage.akcr.a(r3, r0);
        return r3;
        r0 = 1;
        r2.g = r0;
        r0 = 0;
        r0 = r2.a(r0);	 Catch:{ all -> 0x0031 }
        r1 = new fcl$a;	 Catch:{ all -> 0x0031 }
        r1.<init>(r2, r3);	 Catch:{ all -> 0x0031 }
        r1 = (defpackage.ajfc) r1;	 Catch:{ all -> 0x0031 }
        r3 = r3.e(r1);	 Catch:{ all -> 0x0031 }
        r3 = (defpackage.ajdb) r3;	 Catch:{ all -> 0x0031 }
        r3 = r0.b(r3);	 Catch:{ all -> 0x0031 }
        r0 = "trace(\"\") {\n            …         })\n            }";
        goto L_0x0011;
        r3 = move-exception;
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcl.a(ajdx):ajcx");
    }

    public final ajcx a(String str) {
        akcr.b(str, "conversationId");
        Object b = a(false).b((ajdb) ((fcj) this.b.get()).b(str));
        akcr.a(b, "loadAppList(false).andTh…ChatDock(conversationId))");
        return b;
    }

    public final ajcx a(String str, String str2) {
        Object d;
        akcr.b(str, "conversationId");
        akcr.b(str2, "appId");
        if (((fdd) this.a.get()).b(str2) != null) {
            d = ((fcj) this.b.get()).a(str, str2, true).d();
            str2 = "actionHandler.get().laun…Id, true).ignoreElement()";
        } else {
            d = ((fcj) this.b.get()).a(str2).a((ajdn) ((fcj) this.b.get()).a(str, str2, true)).d();
            str2 = "actionHandler.get().getA…        ).ignoreElement()";
        }
        akcr.a(d, str2);
        return d;
    }

    public final ajcx a(boolean z) {
        ajcx c = z ? c() : ((fdd) this.a.get()).d() ? ajvo.a(ajhn.a) : (ajcx) this.i.b();
        Object b = c.b((ajdw) this.h.g());
        akcr.a(b, "when {\n            force…eOn(schedulers.network())");
        return b;
    }

    public final ajdp<List<fgm>> a() {
        Object a = ((fdd) this.a.get()).a();
        akcr.a(a, "launcherItemManager.get(…tenToLauncherItemUpdate()");
        return a;
    }

    public final ajcx b() {
        Object a;
        String str;
        if (((fdd) this.a.get()).f()) {
            a = ajvo.a(ajhn.a);
            str = "Completable.complete()";
        } else {
            String str2 = (String) fer.l.get(((ezx) ((ftl) this.j.get()).l(ezu.CHOOSE_ORGANIZATION)).a());
            fcj fcj = (fcj) this.b.get();
            if (str2 == null) {
                akcr.a();
            }
            a = fcj.d(str2);
            str = "actionHandler.get().load…orOrganizationV2(orgId!!)";
        }
        akcr.a(a, str);
        return a;
    }

    public final ajcx c() {
        fcl fcl = this;
        Object e = ((fan) this.k.get()).a().f(new fcn(new e(fcl))).c((ajfb) new fcm(new f(fcl))).d((ajfb) new fcm(new g(fcl))).a(ajdx.b((Object) ajyw.a)).a((ajfc) new h(this)).e((ajfc) new i(this));
        akcr.a(e, "networkHandler.get().loa…ry.get().insertApps(it) }");
        return e;
    }
}
