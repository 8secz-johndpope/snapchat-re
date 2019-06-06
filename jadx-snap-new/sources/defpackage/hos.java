package defpackage;

import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.hot.a;
import defpackage.hot.b;
import defpackage.hot.d;
import defpackage.hot.f;
import defpackage.hot.g;
import defpackage.hot.h;
import defpackage.hot.i;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: hos */
public final class hos implements hol {
    final ajxe a;
    private final ajxe b;

    /* renamed from: hos$a */
    static final class a extends akcq implements akbk<hot> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (hot) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: hos$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.get();
            return zgb.a(hbn.f.callsite("DeeplinkCompositeStoriesNavigableProvider"));
        }
    }

    /* renamed from: hos$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ hos a;
        private /* synthetic */ Uri b;

        b(hos hos, Uri uri) {
            this.a = hos;
            this.b = uri;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0093 in {7, 10, 11, 14, 16, 18} preds:[]
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
        public final /* synthetic */ java.lang.Object call() {
            /*
            r7 = this;
            r0 = r7.b;
            r1 = defpackage.hoc.g(r0);
            if (r1 == 0) goto L_0x0078;
            r1 = (java.lang.CharSequence) r1;
            r2 = ",";
            r2 = new java.lang.String[]{r2};
            r3 = 6;
            r4 = 0;
            r1 = defpackage.akgc.a(r1, r2, r4, r3);
            if (r1 == 0) goto L_0x0078;
            r1 = (java.lang.Iterable) r1;
            r2 = new java.util.ArrayList;
            r3 = 10;
            r3 = defpackage.ajyn.a(r1, r3);
            r2.<init>(r3);
            r2 = (java.util.Collection) r2;
            r1 = r1.iterator();
            r3 = r1.hasNext();
            if (r3 == 0) goto L_0x003f;
            r3 = r1.next();
            r3 = (java.lang.String) r3;
            r3 = defpackage.hiy.a(r3);
            r2.add(r3);
            goto L_0x002b;
            r2 = (java.util.List) r2;
            r1 = new hou;
            r3 = r2.get(r4);
            r5 = "it[0]";
            defpackage.akcr.a(r3, r5);
            r3 = (defpackage.vcy) r3;
            r3 = r3.a();
            r5 = "receiver$0";
            defpackage.akcr.b(r0, r5);
            r6 = "auto_play";
            r6 = r0.getQueryParameter(r6);
            if (r6 == 0) goto L_0x0064;
            r6 = java.lang.Boolean.parseBoolean(r6);
            goto L_0x0065;
            r6 = 0;
            defpackage.akcr.b(r0, r5);
            r5 = "from_notification";
            r0 = r0.getQueryParameter(r5);
            if (r0 == 0) goto L_0x0074;
            r4 = java.lang.Boolean.parseBoolean(r0);
            r1.<init>(r2, r3, r6, r4);
            return r1;
            r1 = new java.lang.IllegalArgumentException;
            r2 = new java.lang.StringBuilder;
            r3 = "Error on proceeding ";
            r2.<init>(r3);
            r2.append(r0);
            r0 = ": empty stories";
            r2.append(r0);
            r0 = r2.toString();
            r1.<init>(r0);
            r1 = (java.lang.Throwable) r1;
            throw r1;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hos$b.call():java.lang.Object");
        }
    }

    /* renamed from: hos$c */
    static final class c<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ hos a;
        private /* synthetic */ Uri b;

        c(hos hos, Uri uri) {
            this.a = hos;
            this.b = uri;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            hou hou = (hou) obj;
            akcr.b(hou, "it");
            if (hou.b != 26) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.b);
                stringBuilder.append(" not yet supported");
                obj = ajdx.b((Throwable) new ajxl(stringBuilder.toString()));
                str = "Single.error(NotImplemen…$uri not yet supported\"))";
            } else {
                hot hot = (hot) this.a.a.b();
                akcr.b(hou, "config");
                Object b = ((yid) hot.c.get()).d().c((ajfl) a.a).g().b((ajev) b.a);
                akcr.a(b, "friendStoriesRepo.get().… stories on DF synced\") }");
                b = b.b((ajeb) ajdx.a((Callable) new d(hot)));
                akcr.a(b, "friendStoriesSyncedOnDF(…              }\n        )");
                b = b.b((ajdw) ((zfw) hot.b.b()).i()).f(new f(hot, hou)).a((ajfl) g.a).a((ajeb) ajdx.b((Throwable) new IllegalStateException("No friend stories available"))).d((ajfb) h.a).c((ajfb) i.a);
                akcr.a(b, "latestFriendStories()\n  …() }}\")\n                }");
                obj = b.a((ajfc) new defpackage.hot.c(hot, hou));
                str = "preparePlaylist(config)\n…PlayFirstStory)\n        }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(hos.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(hos.class), "friendStoriesNavigator", "getFriendStoriesNavigator()Lcom/snap/discoverfeed/shared/deeplink/stories/DeeplinkFriendStoriesNavigator;")};
    }

    public hos(ajwy<zgb> ajwy, ajwy<hot> ajwy2) {
        akcr.b(ajwy, "schedulersProvider");
        akcr.b(ajwy2, "friendStoriesNavigatorProvider");
        this.b = ajxh.a(new d(ajwy));
        this.a = ajxh.a(new a(ajwy2));
    }

    public final int a() {
        return 2;
    }

    public final boolean a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object pathSegments = uri.getPathSegments();
        akcr.a(pathSegments, "uri.pathSegments");
        return akcr.a((String) ajyu.g((List) pathSegments), (Object) "stories") && hoc.g(uri) != null;
    }

    public final ajdx<acig<zjm, zjk>> b(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajdx.c((Callable) new b(this, uri)).a((ajdw) ((zfw) this.b.b()).f()).a((ajfc) new c(this, uri));
        akcr.a(a, "Single\n                .…      }\n                }");
        return a;
    }
}
