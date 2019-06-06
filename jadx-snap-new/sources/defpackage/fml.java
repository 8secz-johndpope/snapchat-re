package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.brightcove.player.event.Event;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import java.util.List;

/* renamed from: fml */
public final class fml implements czl, gvn {
    static final String[] d;
    static final String[] e;
    private static final String[] l;
    private static final String[] m;
    final Activity a;
    final ajwy<fnl> b;
    final tgw c;
    private final ajxe f = ajxh.a(new f(this));
    private final List<String> g = ajym.b((Object[]) new String[]{"https://www.snapchat.com/commerce/..*", "http://www.snapchat.com/commerce/..*", "snapchat://commerce/products/..*", "snapchat://commerce/stores/..*"});
    private final ajwy<fnp> h;
    private final fiw i;
    private final zgb j;
    private final fmn k;

    /* renamed from: fml$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: fml$f */
    static final class f extends akcs implements akbk<zfw> {
        private /* synthetic */ fml a;

        f(fml fml) {
            this.a = fml;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(fiq.o.callsite("CommerceDeepLinkHandler"));
        }
    }

    /* renamed from: fml$b */
    static final class b implements Runnable {
        private /* synthetic */ fml a;
        private /* synthetic */ Uri b;

        b(fml fml, Uri uri) {
            this.a = fml;
            this.b = uri;
        }

        public final void run() {
            this.a.c.a(this.a.a, R.string.commerce_error_oops_something_is_wrong, false);
        }
    }

    /* renamed from: fml$c */
    static final class c implements Runnable {
        private /* synthetic */ fml a;

        c(fml fml) {
            this.a = fml;
        }

        public final /* synthetic */ void run() {
            this.a.c.a(this.a.a, R.string.commerce_error_oops_something_is_wrong, false);
        }
    }

    /* renamed from: fml$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ fml a;
        private /* synthetic */ String b;

        d(fml fml, String str) {
            this.a = fml;
            this.b = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            fml fml = this.a;
            akcr.a(obj, "throwable");
            if (obj instanceof thg) {
                thg thg = (thg) obj;
                Object obj2 = thg.a;
                String str = "throwable.mErrorResponse";
                akcr.a(obj2, str);
                if (obj2.c() == agia.CUSTOM_ERROR_MESSAGE) {
                    tgw tgw = fml.c;
                    Context context = fml.a;
                    obj = thg.a;
                    akcr.a(obj, str);
                    tgw.a(context, obj.d());
                    return;
                }
            }
            fml.c.a(fml.a, R.string.commerce_error_oops_something_is_wrong, false);
        }
    }

    /* renamed from: fml$e */
    static final class e<T, R> implements ajfc<agjb, ajdb> {
        private /* synthetic */ fml a;
        private /* synthetic */ tfy b;

        e(fml fml, tfy tfy) {
            this.a = fml;
            this.b = tfy;
        }

        public final /* synthetic */ Object apply(Object obj) {
            agjb agjb = (agjb) obj;
            akcr.b(agjb, "productInfo");
            return ((fnl) this.a.b.get()).a((Context) this.a.a, agjb, this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(fml.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
        a aVar = new a();
        String str = "products";
        String str2 = "commerce";
        l = new String[]{str2, str};
        m = new String[]{str};
        str = "stores";
        d = new String[]{str2, str};
        e = new String[]{str};
    }

    public fml(Activity activity, ajwy<fnl> ajwy, ajwy<fnp> ajwy2, fiw fiw, zgb zgb, tgw tgw, fmn fmn) {
        akcr.b(activity, Event.ACTIVITY);
        akcr.b(ajwy, "productPageLauncher");
        akcr.b(ajwy2, "storePageLauncher");
        akcr.b(fiw, "commerceApis");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(tgw, "alertDialogController");
        akcr.b(fmn, "commerceDeepLinkUtils");
        this.a = activity;
        this.b = ajwy;
        this.h = ajwy2;
        this.i = fiw;
        this.j = zgb;
        this.c = tgw;
        this.k = fmn;
    }

    private final zfw b() {
        return (zfw) this.f.b();
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.COMMERCE;
    }

    public final List<String> a() {
        return this.g;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:122:0x0269 in {12, 14, 16, 21, 22, 23, 25, 26, 29, 30, 33, 40, 42, 44, 47, 50, 53, 56, 57, 60, 65, 66, 69, 70, 72, 73, 75, 76, 78, 79, 82, 83, 85, 86, 87, 94, 103, 104, 107, 109, 110, 111, 115, 117, 119, 121} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final defpackage.ajcx c(android.net.Uri r22) {
        /*
        r21 = this;
        r0 = r21;
        r1 = r22;
        r2 = "uri";
        defpackage.akcr.b(r1, r2);
        r2 = "product_id";
        r3 = r1.getQueryParameter(r2);
        r4 = m;
        r5 = r22.getPathSegments();
        r6 = "uri.pathSegments";
        defpackage.akcr.a(r5, r6);
        r5 = (java.util.Collection) r5;
        r7 = "null cannot be cast to non-null type java.util.Collection<T>";
        if (r5 == 0) goto L_0x0263;
        r8 = 0;
        r9 = new java.lang.String[r8];
        r5 = r5.toArray(r9);
        r9 = "null cannot be cast to non-null type kotlin.Array<T>";
        if (r5 == 0) goto L_0x025d;
        r4 = java.util.Arrays.equals(r4, r5);
        r5 = 1;
        if (r4 != 0) goto L_0x005a;
        r4 = l;
        r10 = r22.getPathSegments();
        defpackage.akcr.a(r10, r6);
        r10 = (java.util.Collection) r10;
        if (r10 == 0) goto L_0x0054;
        r6 = new java.lang.String[r8];
        r6 = r10.toArray(r6);
        if (r6 == 0) goto L_0x004e;
        r4 = java.util.Arrays.equals(r4, r6);
        if (r4 == 0) goto L_0x006c;
        goto L_0x005a;
        r1 = new ajxt;
        r1.<init>(r9);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r7);
        throw r1;
        r3 = (java.lang.CharSequence) r3;
        if (r3 == 0) goto L_0x0067;
        r3 = r3.length();
        if (r3 != 0) goto L_0x0065;
        goto L_0x0067;
        r3 = 0;
        goto L_0x0068;
        r3 = 1;
        if (r3 != 0) goto L_0x006c;
        r3 = 1;
        goto L_0x006d;
        r3 = 0;
        if (r3 != 0) goto L_0x0077;
        r3 = r0.k;
        r3 = r3.a(r1);
        if (r3 == 0) goto L_0x0078;
        r8 = 1;
        if (r8 != 0) goto L_0x008b;
        r2 = new fml$b;
        r2.<init>(r0, r1);
        r2 = (java.lang.Runnable) r2;
        r1 = defpackage.ajcx.a(r2);
        r2 = "Completable.fromRunnable…     false)\n            }";
        defpackage.akcr.a(r1, r2);
        return r1;
        r3 = r0.k;
        r3 = r3.a(r1);
        if (r3 == 0) goto L_0x00d8;
        r2 = "store_id";
        r2 = r1.getQueryParameter(r2);
        if (r2 == 0) goto L_0x00c7;
        r3 = defpackage.tge.d;
        r3 = r3.a;
        r1 = r1.getQueryParameter(r3);
        if (r1 != 0) goto L_0x00ab;
        r1 = defpackage.aage.EXTERNAL_DEEPLINK;
        r1 = r1.name();
        r3 = new tgl;
        r1 = defpackage.aage.valueOf(r1);
        r3.<init>(r1, r2);
        r3 = (defpackage.tfy) r3;
        r1 = r0.h;
        r1 = r1.get();
        r1 = (defpackage.fnp) r1;
        r4 = r0.a;
        r4 = (android.content.Context) r4;
        r1 = r1.a(r4, r2, r3);
        return r1;
        r1 = new fml$c;
        r1.<init>(r0);
        r1 = (java.lang.Runnable) r1;
        r1 = defpackage.ajcx.a(r1);
        r2 = "Completable.fromRunnable…  false)\n            } ))";
        defpackage.akcr.a(r1, r2);
        return r1;
        r3 = defpackage.tge.b;
        r3 = r3.a;
        r3 = r1.getQueryParameter(r3);
        if (r3 != 0) goto L_0x00e8;
        r3 = defpackage.aagm.COMMERCE_DEEPLINK;
        r3 = r3.name();
        r4 = defpackage.tge.d;
        r4 = r4.a;
        r4 = r1.getQueryParameter(r4);
        if (r4 != 0) goto L_0x00f8;
        r4 = defpackage.aage.EXTERNAL_DEEPLINK;
        r4 = r4.name();
        r6 = r1.getQueryParameter(r2);
        r7 = "";
        if (r6 != 0) goto L_0x0101;
        r6 = r7;
        r8 = defpackage.aagm.SPECTACLES_BUY;
        r8 = r8.name();
        r8 = defpackage.akcr.a(r3, r8);
        if (r8 == 0) goto L_0x011a;
        r3 = new tgk;
        r4 = defpackage.aage.valueOf(r4);
        r3.<init>(r4, r6);
        r3 = (defpackage.tfy) r3;
        goto L_0x0205;
        r8 = defpackage.aagm.COMMERCE_DEEPLINK;
        r8 = r8.name();
        r8 = defpackage.akcr.a(r3, r8);
        if (r8 == 0) goto L_0x0130;
        r3 = new tgc;
        r4 = defpackage.aage.valueOf(r4);
        r3.<init>(r4, r6);
        goto L_0x0116;
        r8 = defpackage.aagm.LENS_CTA;
        r8 = r8.name();
        r8 = defpackage.akcr.a(r3, r8);
        if (r8 == 0) goto L_0x01a8;
        r3 = defpackage.tge.u;
        r3 = r3.a;
        r3 = r1.getQueryParameter(r3);
        r5 = defpackage.tge.o;
        r5 = r5.a;
        r5 = r1.getQueryParameter(r5);
        if (r5 == 0) goto L_0x0157;
        r8 = java.lang.Long.parseLong(r5);
        r5 = java.lang.Long.valueOf(r8);
        goto L_0x0158;
        r5 = 0;
        r8 = defpackage.tge.l;
        r8 = r8.a;
        r8 = r1.getQueryParameter(r8);
        r9 = defpackage.tge.p;
        r9 = r9.a;
        r9 = r1.getQueryParameter(r9);
        r10 = defpackage.tge.n;
        r10 = r10.a;
        r10 = r1.getQueryParameter(r10);
        r20 = new tgd;
        r12 = defpackage.aage.valueOf(r4);
        if (r6 != 0) goto L_0x017a;
        r13 = r7;
        goto L_0x017b;
        r13 = r6;
        if (r8 != 0) goto L_0x017f;
        r14 = r7;
        goto L_0x0180;
        r14 = r8;
        if (r3 != 0) goto L_0x0184;
        r15 = r7;
        goto L_0x0185;
        r15 = r3;
        if (r5 == 0) goto L_0x018c;
        r3 = r5.longValue();
        goto L_0x018e;
        r3 = 0;
        r16 = r3;
        if (r9 != 0) goto L_0x0195;
        r18 = r7;
        goto L_0x0197;
        r18 = r9;
        if (r10 != 0) goto L_0x019c;
        r19 = r7;
        goto L_0x019e;
        r19 = r10;
        r11 = r20;
        r11.<init>(r12, r13, r14, r15, r16, r18, r19);
        r3 = r20;
        r3 = (defpackage.tfy) r3;
        goto L_0x0205;
        r8 = defpackage.aagm.CONTEXT_CARDS;
        r8 = r8.name();
        r3 = defpackage.akcr.a(r3, r8);
        if (r3 == 0) goto L_0x01fc;
        r3 = defpackage.tge.g;
        r3 = r3.a;
        r3 = r1.getQueryParameter(r3);
        r8 = defpackage.tge.f;
        r8 = r8.a;
        r8 = r1.getQueryParameter(r8);
        r9 = "IMAGE";
        if (r8 == 0) goto L_0x01e9;
        r8 = defpackage.gcp.valueOf(r8);
        r8 = defpackage.gcr.a(r8);
        if (r8 != 0) goto L_0x01d3;
        goto L_0x01e9;
        r10 = defpackage.fmm.a;
        r8 = r8.ordinal();
        r8 = r10[r8];
        if (r8 == r5) goto L_0x01e9;
        r5 = 2;
        if (r8 == r5) goto L_0x01e9;
        r5 = 3;
        if (r8 == r5) goto L_0x01e7;
        r5 = 4;
        if (r8 == r5) goto L_0x01e7;
        goto L_0x01e9;
        r9 = "VIDEO";
        r5 = new tgb;
        r4 = defpackage.aage.valueOf(r4);
        if (r6 != 0) goto L_0x01f2;
        r6 = r7;
        if (r3 != 0) goto L_0x01f5;
        r3 = r7;
        r5.<init>(r4, r6, r3, r9);
        r3 = r5;
        r3 = (defpackage.tfy) r3;
        goto L_0x0205;
        r3 = new tgc;
        r4 = defpackage.aage.UNKNOWN;
        r3.<init>(r4, r6);
        goto L_0x0116;
        r1 = r1.getQueryParameter(r2);
        if (r1 != 0) goto L_0x0217;
        r1 = defpackage.ajhn.a;
        r1 = defpackage.ajvo.a(r1);
        r2 = "Completable.complete()";
        defpackage.akcr.a(r1, r2);
        return r1;
        r2 = r0.i;
        r2 = r2.a(r1);
        r4 = r21.b();
        r4 = r4.l();
        r4 = (defpackage.zfr) r4;
        r4 = (defpackage.ajdw) r4;
        r2 = r2.a(r4);
        r4 = new fml$d;
        r4.<init>(r0, r1);
        r4 = (defpackage.ajfb) r4;
        r1 = r2.d(r4);
        r2 = r21.b();
        r2 = r2.g();
        r2 = (defpackage.ajdw) r2;
        r1 = r1.b(r2);
        r2 = new fml$e;
        r2.<init>(r0, r3);
        r2 = (defpackage.ajfc) r2;
        r1 = r1.e(r2);
        r2 = defpackage.ajfu.g;
        r1 = r1.a(r2);
        r2 = "commerceApis.getProductI…       .onErrorComplete()";
        defpackage.akcr.a(r1, r2);
        return r1;
        r1 = new ajxt;
        r1.<init>(r9);
        throw r1;
        r1 = new ajxt;
        r1.<init>(r7);
        throw r1;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fml.c(android.net.Uri):ajcx");
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
