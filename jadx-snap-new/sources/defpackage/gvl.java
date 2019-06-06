package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.akdd.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: gvl */
public final class gvl {
    final ajwy<gvp> a;
    private final ArrayList<gvo> b = new ArrayList();
    private final ajxe c = ajxh.a(new j(this));
    private final Set<ajdx<gvk>> d;

    /* renamed from: gvl$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static boolean a(Intent intent) {
            akcr.b(intent, "intent");
            return (intent.getData() == null || intent.getBooleanExtra("com.snap.deeplink.is_deep_link_processed", false)) ? false : true;
        }

        public static boolean b(Intent intent) {
            akcr.b(intent, "intent");
            return (akcr.a(intent.getAction(), (Object) "android.intent.action.SEND") || akcr.a(intent.getAction(), (Object) "android.intent.action.SEND_MULTIPLE")) && !intent.getBooleanExtra("com.snap.deeplink.is_deep_link_processed", false);
        }

        public static boolean c(Intent intent) {
            akcr.b(intent, "intent");
            return a.a(intent) || a.b(intent);
        }

        public static void d(Intent intent) {
            akcr.b(intent, "intent");
            intent.putExtra("com.snap.deeplink.is_deep_link_processed", true);
        }
    }

    /* renamed from: gvl$j */
    static final class j extends akcs implements akbk<gvp> {
        private /* synthetic */ gvl a;

        j(gvl gvl) {
            this.a = gvl;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gvp) this.a.a.get();
        }
    }

    /* renamed from: gvl$b */
    static final class b implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ Uri b;

        b(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public final void run() {
        }
    }

    /* renamed from: gvl$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ String a;
        private /* synthetic */ Uri b;

        c(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gvl$d */
    static final class d implements ajev {
        private /* synthetic */ String a;
        private /* synthetic */ Uri b;

        d(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public final void run() {
        }
    }

    /* renamed from: gvl$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ String a;
        private /* synthetic */ Uri b;

        e(String str, Uri uri) {
            this.a = str;
            this.b = uri;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: gvl$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajdx ajdx = (ajdx) obj;
            akcr.b(ajdx, "it");
            return ajdx;
        }
    }

    /* renamed from: gvl$g */
    static final class g<T, R> implements ajfc<gvk, ajdb> {
        private /* synthetic */ Intent a;
        private /* synthetic */ a b;
        private /* synthetic */ List c;
        private /* synthetic */ String d;
        private /* synthetic */ String e;

        g(Intent intent, a aVar, List list, String str, String str2) {
            this.a = intent;
            this.b = aVar;
            this.c = list;
            this.d = str;
            this.e = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            gvk gvk = (gvk) obj;
            akcr.b(gvk, "handler");
            gvk.getClass().getName();
            if (gvk.a(this.a)) {
                this.b.a = true;
                a = gvk.a(this.c, this.d, this.e);
            } else {
                a = ajvo.a(ajhn.a);
            }
            return a;
        }
    }

    /* renamed from: gvl$h */
    static final class h implements ajev {
        public static final h a = new h();

        h() {
        }

        public final void run() {
        }
    }

    /* renamed from: gvl$i */
    static final class i<T> implements ajfb<Throwable> {
        public static final i a = new i();

        i() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gvl.class), "uriMatcher", "getUriMatcher()Lcom/snap/deeplink/DeepLinkUriMatcher;");
        a aVar = new a();
    }

    public gvl(Set<ajdx<gvk>> set, ajwy<gvp> ajwy) {
        akcr.b(set, "actionSendHandlers");
        akcr.b(ajwy, "uriMatcherProvider");
        this.d = set;
        this.a = ajwy;
    }

    private final gvm a(Uri uri) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            gvo gvo = (gvo) it.next();
            ajcx a = gvo.a();
            if (a != null) {
                String name = gvo.getClass().getName();
                Object a2 = a.a((ajev) new d(name, uri), (ajfb) new e(name, uri));
                akcr.a(a2, "completable.subscribe({\n…$uri\")\n                })");
                return new gvm(a2, true);
            }
        }
        return null;
    }

    private final gvp a() {
        return (gvp) this.c.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    private final defpackage.gvm b(android.net.Uri r4, boolean r5) {
        /*
        r3 = this;
        r0 = r3.a();
        r0 = r0.a(r4);
        r1 = 0;
        if (r0 == 0) goto L_0x0016;
    L_0x000b:
        r2 = r0.getClass();
        if (r2 == 0) goto L_0x0016;
    L_0x0011:
        r2 = r2.getName();
        goto L_0x0017;
    L_0x0016:
        r2 = r1;
    L_0x0017:
        if (r5 == 0) goto L_0x0020;
    L_0x0019:
        if (r0 == 0) goto L_0x0026;
    L_0x001b:
        r1 = r0.d(r4);
        goto L_0x0026;
    L_0x0020:
        if (r0 == 0) goto L_0x0026;
    L_0x0022:
        r1 = r0.c(r4);
    L_0x0026:
        if (r1 != 0) goto L_0x0036;
    L_0x0028:
        r4 = new gvm;
        r5 = defpackage.ajfq.INSTANCE;
        r0 = "Disposables.disposed()";
        defpackage.akcr.a(r5, r0);
        r0 = 0;
        r4.<init>(r5, r0);
        return r4;
    L_0x0036:
        r5 = new gvl$b;
        r5.<init>(r2, r4);
        r5 = (defpackage.ajev) r5;
        r0 = new gvl$c;
        r0.<init>(r2, r4);
        r0 = (defpackage.ajfb) r0;
        r4 = r1.a(r5, r0);
        r5 = "completable.subscribe({\n…URI=$uri\")\n            })";
        defpackage.akcr.a(r4, r5);
        r5 = new gvm;
        r0 = 1;
        r5.<init>(r4, r0);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gvl.b(android.net.Uri, boolean):gvm");
    }

    public final gvm a(Intent intent) {
        Uri uri;
        String str = "intent";
        akcr.b(intent, str);
        String str2 = "Disposables.disposed()";
        if (a.b(intent)) {
            gvm gvm;
            akcr.b(intent, str);
            String type = intent.getType();
            Object obj;
            if (type == null) {
                obj = ajfq.INSTANCE;
                akcr.a(obj, str2);
                gvm = new gvm(obj, false);
            } else {
                List arrayList = new ArrayList();
                String str3 = "android.intent.extra.STREAM";
                if (akcr.a(intent.getAction(), (Object) "android.intent.action.SEND")) {
                    uri = (Uri) intent.getParcelableExtra(str3);
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                if (akcr.a(intent.getAction(), (Object) "android.intent.action.SEND_MULTIPLE")) {
                    ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(str3);
                    if (parcelableArrayListExtra != null) {
                        arrayList.addAll(parcelableArrayListExtra);
                    }
                }
                String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                if (arrayList.isEmpty() && stringExtra == null) {
                    obj = ajfq.INSTANCE;
                    akcr.a(obj, str2);
                    gvm = new gvm(obj, false);
                } else {
                    a aVar = new a();
                    aVar.a = false;
                    obj = ajdp.b((Iterable) this.d).g((ajfc) f.a).d((ajfc) new g(intent, aVar, arrayList, type, stringExtra)).a((ajev) h.a, (ajfb) i.a);
                    akcr.a(obj, "Observable.fromIterable(…ROR!\")\n                })");
                    gvm = new gvm(obj, aVar.a);
                }
            }
            if (gvm.a) {
                return gvm;
            }
        }
        if (a.a(intent)) {
            uri = intent.getData();
            if (uri == null) {
                akcr.a();
            }
            return a(uri, intent.getBooleanExtra("com.snap.deeplink.after_login", false));
        }
        Object obj2 = ajfq.INSTANCE;
        akcr.a(obj2, str2);
        return new gvm(obj2, false);
    }

    public final gvm a(Uri uri, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        gvm a = a(uri);
        return a == null ? b(uri, z) : a;
    }
}
