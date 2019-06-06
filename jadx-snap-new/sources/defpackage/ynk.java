package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.TypedValue;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.jxa.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@ftr(a = "stories_notification_icon")
/* renamed from: ynk */
public final class ynk extends ggm {
    final ajxe a;
    final ajxe b;
    final Context c;
    private final ajxe d;
    private final ajxe e;
    private final ajxe f = ajxh.a(new k(this));
    private final int g = this.c.getResources().getColor(R.color.story_white);
    private final int h = this.c.getResources().getColor(R.color.story_friend_story_notification_thumbnail_background);
    private final int i = this.c.getResources().getDimensionPixelOffset(R.dimen.story_friend_story_notification_thumbnail_border_width);
    private final int j = this.c.getResources().getDimensionPixelOffset(R.dimen.story_friend_story_notification_stacked_thumbnail_shift_x);
    private final ynh k;

    /* renamed from: ynk$c */
    static final class c<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ ynk a;
        private /* synthetic */ jxa b;

        c(ynk ynk, jxa jxa) {
            this.a = ynk;
            this.b = jxa;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Uri uri = (Uri) obj;
            akcr.b(uri, "it");
            return ((jwc) this.a.a.b()).a(uri, (idl) yhy.j.getPage(), this.b).i();
        }
    }

    /* renamed from: ynk$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ ynk a;

        d(ynk ynk) {
            this.a = ynk;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final List list = (List) obj;
            akcr.b(list, "bitmapDisposables");
            ynk ynk = this.a;
            Iterable<kaz> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (kaz a : iterable) {
                arrayList.add(jwz.a(a));
            }
            return ynk.a((List) arrayList).b((ajev) new ajev() {
                public final void run() {
                    Object obj = list;
                    akcr.a(obj, "bitmapDisposables");
                    Iterable<kaz> iterable = (Iterable) obj;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (kaz dispose : iterable) {
                        dispose.dispose();
                        arrayList.add(ajxw.a);
                    }
                }
            });
        }
    }

    /* renamed from: ynk$g */
    static final class g<T> implements ajfb<ajej> {
        private /* synthetic */ ynk a;
        private /* synthetic */ long b;

        g(ynk ynk, long j) {
            this.a = ynk;
            this.b = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            ((ynd) this.a.b.b()).a().c((ily) ine.FRIEND_STORY_PUSH_ERROR_TIMEOUT, 1);
        }
    }

    /* renamed from: ynk$h */
    static final class h<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ ynk a;
        private /* synthetic */ List b;

        h(ynk ynk, List list) {
            this.a = ynk;
            this.b = list;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ynk$i */
    static final class i implements ajev {
        private /* synthetic */ List a;

        i(List list) {
            this.a = list;
        }

        public final void run() {
            Iterable<kaz> iterable = this.a;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (kaz dispose : iterable) {
                dispose.dispose();
                arrayList.add(ajxw.a);
            }
        }
    }

    /* renamed from: ynk$j */
    static final class j<T> implements ajfb<Throwable> {
        public static final j a = new j();

        j() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: ynk$b */
    static final class b extends akcs implements akbk<yng> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new yng(((jwb) this.a.get()).a(yhy.j));
        }
    }

    /* renamed from: ynk$k */
    static final class k extends akcs implements akbk<Integer> {
        private /* synthetic */ ynk a;

        k(ynk ynk) {
            this.a = ynk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            ynk ynk = this.a;
            TypedValue typedValue = new TypedValue();
            ynk.c.getResources().getValue(R.dimen.story_friend_story_notification_thumbnail_dimen_scale_percentage, typedValue, true);
            return Integer.valueOf((int) (((float) ynk.c.getResources().getDimensionPixelOffset(17104902)) * typedValue.getFloat()));
        }
    }

    /* renamed from: ynk$a */
    static final class a extends akcq implements akbk<jwc> {
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
            return (jwc) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ynk$e */
    static final class e extends akcq implements akbk<gee> {
        e(ajwy ajwy) {
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
            return (gee) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: ynk$f */
    static final class f extends akcq implements akbk<ynd> {
        f(ajwy ajwy) {
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
            return (ynd) ((ajwy) this.receiver).get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(ynk.class), "bitmapTransformer", "getBitmapTransformer()Lcom/snap/stories/notification/ui/BitmapTransformer;"), new akdc(akde.a(ynk.class), "contentManager", "getContentManager()Lcom/snap/core/net/content/api/ContentManager;"), new akdc(akde.a(ynk.class), "bitmapLoader", "getBitmapLoader()Lcom/snap/imageloading/api/BitmapLoader;"), new akdc(akde.a(ynk.class), "logger", "getLogger()Lcom/snap/stories/notification/analytics/FriendStoriesNotificationFunnelLogger;"), new akdc(akde.a(ynk.class), "thumbnailDimension", "getThumbnailDimension()I")};
    }

    public ynk(Context context, ynh ynh, ajwy<gee> ajwy, ajwy<jwb> ajwy2, ajwy<jwc> ajwy3, ajwy<ynd> ajwy4) {
        akcr.b(context, "context");
        akcr.b(ynh, "contentType");
        akcr.b(ajwy, "contentManagerProvider");
        akcr.b(ajwy2, "bitmapFactoryProvider");
        akcr.b(ajwy3, "bitmapLoaderProvider");
        akcr.b(ajwy4, "loggerProvider");
        this.c = context;
        this.k = ynh;
        this.d = ajxh.a(new b(ajwy2));
        this.e = ajxh.a(new e(ajwy));
        this.a = ajxh.a(new a(ajwy3));
        this.b = ajxh.a(new f(ajwy4));
    }

    private static List<Uri> a(Uri uri) {
        String queryParameter = uri.getQueryParameter("icon_uris");
        if (queryParameter != null) {
            List a = akgc.a((CharSequence) queryParameter, new String[]{ppy.b}, 0, 6);
            if (a != null) {
                a = ajyu.k(a);
                if (a != null) {
                    Iterable<String> iterable = a;
                    Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
                    for (String parse : iterable) {
                        arrayList.add(Uri.parse(parse));
                    }
                    return (List) arrayList;
                }
            }
        }
        return ajyw.a;
    }

    private final yng a() {
        return (yng) this.d.b();
    }

    private final int b() {
        return ((Number) this.f.b()).intValue();
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        Uri uri2 = uri;
        akcr.b(uri2, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        gee gee = (gee) this.e.b();
        Object queryParameter = uri2.getQueryParameter("icon_cache_key");
        akcr.a(queryParameter, "uri.getQueryParameter(PA…IFICATION_ICON_CACHE_KEY)");
        List a = ynk.a(uri);
        String queryParameter2 = uri2.getQueryParameter("icon_download_timeout_millis");
        long parseLong = queryParameter2 != null ? Long.parseLong(queryParameter2) : -1;
        Object b = new a().a(b(), b()).b();
        akcr.a(b, "RequestOptions.Builder()…\n                .build()");
        ajdx a2 = ajdp.b((Iterable) a).a((ajfc) new c(this, b)).a(a.size());
        akcr.a((Object) a2, "Observable\n             …  .toList(imageUris.size)");
        if (parseLong > 0) {
            b = ajdx.b((Object) ajyw.a).b((ajfb) new g(this, parseLong));
            akcr.a(b, "Single\n                 …                        }");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            ajeb ajeb = (ajeb) b;
            ajfv.a((Object) ajeb, "other is null");
            a2 = a2.a(parseLong, timeUnit, ajwh.b, ajeb);
            akcr.a((Object) a2, "this.timeout(timeoutMill…LISECONDS, timeoutSingle)");
        }
        ajdx a3 = a2.a((ajfc) new d(this));
        akcr.a((Object) a3, "Observable\n             …e() } }\n                }");
        b = gee.a(new gew(queryParameter, null, gem.b(a3, ynl.a), null, this.k, set, set2, 276)).a(false);
        akcr.a(b, "contentManager.submit(De…        .getResult(false)");
        return b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0168 in {7, 12, 13, 15, 17, 18, 19, 23, 25, 27} preds:[]
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
    final defpackage.ajdx<defpackage.kaz<defpackage.jwj>> a(java.util.List<android.graphics.Bitmap> r19) {
        /*
        r18 = this;
        r1 = r18;
        r0 = r19;
        r2 = r0;	 Catch:{ all -> 0x0166 }
        r2 = (java.lang.Iterable) r2;	 Catch:{ all -> 0x0166 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0166 }
        r4 = 10;	 Catch:{ all -> 0x0166 }
        r5 = defpackage.ajyn.a(r2, r4);	 Catch:{ all -> 0x0166 }
        r3.<init>(r5);	 Catch:{ all -> 0x0166 }
        r3 = (java.util.Collection) r3;	 Catch:{ all -> 0x0166 }
        r2 = r2.iterator();	 Catch:{ all -> 0x0166 }
        r5 = r2.hasNext();	 Catch:{ all -> 0x0166 }
        if (r5 == 0) goto L_0x0108;	 Catch:{ all -> 0x0166 }
        r5 = r2.next();	 Catch:{ all -> 0x0166 }
        r5 = (android.graphics.Bitmap) r5;	 Catch:{ all -> 0x0166 }
        r6 = r18.a();	 Catch:{ all -> 0x0166 }
        r7 = r1.i;	 Catch:{ all -> 0x0166 }
        r7 = (float) r7;	 Catch:{ all -> 0x0166 }
        r8 = r1.g;	 Catch:{ all -> 0x0166 }
        r9 = r1.h;	 Catch:{ all -> 0x0166 }
        r9 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x0166 }
        r10 = r18.b();	 Catch:{ all -> 0x0166 }
        r10 = java.lang.Integer.valueOf(r10);	 Catch:{ all -> 0x0166 }
        r11 = "srcBitmap";	 Catch:{ all -> 0x0166 }
        defpackage.akcr.b(r5, r11);	 Catch:{ all -> 0x0166 }
        r11 = defpackage.yng.a(r5);	 Catch:{ all -> 0x0166 }
        r11 = (float) r11;	 Catch:{ all -> 0x0166 }
        r12 = r11 + r7;	 Catch:{ all -> 0x0166 }
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0166 }
        r12 = r12 * r13;	 Catch:{ all -> 0x0166 }
        r14 = r6.a;	 Catch:{ all -> 0x0166 }
        r15 = (int) r12;	 Catch:{ all -> 0x0166 }
        r4 = "BitmapTransformer";	 Catch:{ all -> 0x0166 }
        r4 = r14.a(r15, r15, r4);	 Catch:{ all -> 0x0166 }
        r14 = "bitmapFactory.createBitm…oInt(), dim.toInt(), TAG)";	 Catch:{ all -> 0x0166 }
        defpackage.akcr.a(r4, r14);	 Catch:{ all -> 0x0166 }
        r14 = new android.graphics.Paint;	 Catch:{ all -> 0x0166 }
        r14.<init>();	 Catch:{ all -> 0x0166 }
        r15 = 1;	 Catch:{ all -> 0x0166 }
        r14.setAntiAlias(r15);	 Catch:{ all -> 0x0166 }
        r15 = new android.graphics.Canvas;	 Catch:{ all -> 0x0166 }
        r13 = defpackage.jwz.a(r4);	 Catch:{ all -> 0x0166 }
        r15.<init>(r13);	 Catch:{ all -> 0x0166 }
        r13 = 0;	 Catch:{ all -> 0x0166 }
        r15.drawARGB(r13, r13, r13, r13);	 Catch:{ all -> 0x0166 }
        r13 = android.graphics.Paint.Style.FILL;	 Catch:{ all -> 0x0166 }
        r14.setStyle(r13);	 Catch:{ all -> 0x0166 }
        r13 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;	 Catch:{ all -> 0x0166 }
        r12 = r12 / r13;	 Catch:{ all -> 0x0166 }
        r15.drawCircle(r12, r12, r11, r14);	 Catch:{ all -> 0x0166 }
        r13 = new android.graphics.PorterDuffXfermode;	 Catch:{ all -> 0x0166 }
        r17 = r2;	 Catch:{ all -> 0x0166 }
        r2 = android.graphics.PorterDuff.Mode.SRC_IN;	 Catch:{ all -> 0x0166 }
        r13.<init>(r2);	 Catch:{ all -> 0x0166 }
        r13 = (android.graphics.Xfermode) r13;	 Catch:{ all -> 0x0166 }
        r14.setXfermode(r13);	 Catch:{ all -> 0x0166 }
        r15.drawBitmap(r5, r7, r7, r14);	 Catch:{ all -> 0x0166 }
        if (r9 == 0) goto L_0x00a9;	 Catch:{ all -> 0x0166 }
        r9 = (java.lang.Number) r9;	 Catch:{ all -> 0x0166 }
        r2 = r9.intValue();	 Catch:{ all -> 0x0166 }
        r5 = new android.graphics.PorterDuffXfermode;	 Catch:{ all -> 0x0166 }
        r9 = android.graphics.PorterDuff.Mode.DST_OVER;	 Catch:{ all -> 0x0166 }
        r5.<init>(r9);	 Catch:{ all -> 0x0166 }
        r5 = (android.graphics.Xfermode) r5;	 Catch:{ all -> 0x0166 }
        r14.setXfermode(r5);	 Catch:{ all -> 0x0166 }
        r5 = android.graphics.Paint.Style.FILL;	 Catch:{ all -> 0x0166 }
        r14.setStyle(r5);	 Catch:{ all -> 0x0166 }
        r14.setColor(r2);	 Catch:{ all -> 0x0166 }
        r15.drawCircle(r12, r12, r11, r14);	 Catch:{ all -> 0x0166 }
        r2 = 0;	 Catch:{ all -> 0x0166 }
        r14.setXfermode(r2);	 Catch:{ all -> 0x0166 }
        r5 = android.graphics.Paint.Style.STROKE;	 Catch:{ all -> 0x0166 }
        r14.setStyle(r5);	 Catch:{ all -> 0x0166 }
        r14.setColor(r8);	 Catch:{ all -> 0x0166 }
        r14.setStrokeWidth(r7);	 Catch:{ all -> 0x0166 }
        r15.drawCircle(r12, r12, r11, r14);	 Catch:{ all -> 0x0166 }
        if (r10 == 0) goto L_0x00fe;	 Catch:{ all -> 0x0166 }
        r5 = r10;	 Catch:{ all -> 0x0166 }
        r5 = (java.lang.Number) r5;	 Catch:{ all -> 0x0166 }
        r5.intValue();	 Catch:{ all -> 0x0166 }
        r5 = r10.intValue();	 Catch:{ all -> 0x0166 }
        r7 = defpackage.jwz.a(r4);	 Catch:{ all -> 0x0166 }
        r7 = r7.getWidth();	 Catch:{ all -> 0x0166 }
        r5 = r5 - r7;	 Catch:{ all -> 0x0166 }
        r5 = java.lang.Math.abs(r5);	 Catch:{ all -> 0x0166 }
        r7 = 5;	 Catch:{ all -> 0x0166 }
        if (r5 <= r7) goto L_0x00da;	 Catch:{ all -> 0x0166 }
        r16 = 1;	 Catch:{ all -> 0x0166 }
        goto L_0x00dc;	 Catch:{ all -> 0x0166 }
        r16 = 0;	 Catch:{ all -> 0x0166 }
        if (r16 == 0) goto L_0x00df;	 Catch:{ all -> 0x0166 }
        r2 = r10;	 Catch:{ all -> 0x0166 }
        if (r2 == 0) goto L_0x00fe;	 Catch:{ all -> 0x0166 }
        r2 = (java.lang.Number) r2;	 Catch:{ all -> 0x0166 }
        r10 = r2.intValue();	 Catch:{ all -> 0x0166 }
        r7 = r6.a;	 Catch:{ all -> 0x0166 }
        r8 = defpackage.jwz.a(r4);	 Catch:{ all -> 0x0166 }
        r11 = 1;	 Catch:{ all -> 0x0166 }
        r12 = "BitmapTransformer";	 Catch:{ all -> 0x0166 }
        r9 = r10;	 Catch:{ all -> 0x0166 }
        r2 = r7.a(r8, r9, r10, r11, r12);	 Catch:{ all -> 0x0166 }
        r5 = "bitmapFactory.createScal…\n                    TAG)";	 Catch:{ all -> 0x0166 }
        defpackage.akcr.a(r2, r5);	 Catch:{ all -> 0x0166 }
        r4.dispose();	 Catch:{ all -> 0x0166 }
        goto L_0x00ff;	 Catch:{ all -> 0x0166 }
        r2 = r4;	 Catch:{ all -> 0x0166 }
        r3.add(r2);	 Catch:{ all -> 0x0166 }
        r2 = r17;	 Catch:{ all -> 0x0166 }
        r4 = 10;	 Catch:{ all -> 0x0166 }
        goto L_0x0018;	 Catch:{ all -> 0x0166 }
        r3 = (java.util.List) r3;	 Catch:{ all -> 0x0166 }
        r2 = r18.a();	 Catch:{ all -> 0x0166 }
        r4 = r3;	 Catch:{ all -> 0x0166 }
        r4 = (java.lang.Iterable) r4;	 Catch:{ all -> 0x0166 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x0166 }
        r6 = 10;	 Catch:{ all -> 0x0166 }
        r6 = defpackage.ajyn.a(r4, r6);	 Catch:{ all -> 0x0166 }
        r5.<init>(r6);	 Catch:{ all -> 0x0166 }
        r5 = (java.util.Collection) r5;	 Catch:{ all -> 0x0166 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0166 }
        r6 = r4.hasNext();	 Catch:{ all -> 0x0166 }
        if (r6 == 0) goto L_0x0136;	 Catch:{ all -> 0x0166 }
        r6 = r4.next();	 Catch:{ all -> 0x0166 }
        r6 = (defpackage.kaz) r6;	 Catch:{ all -> 0x0166 }
        r6 = defpackage.jwz.a(r6);	 Catch:{ all -> 0x0166 }
        r5.add(r6);	 Catch:{ all -> 0x0166 }
        goto L_0x0122;	 Catch:{ all -> 0x0166 }
        r5 = (java.util.List) r5;	 Catch:{ all -> 0x0166 }
        r4 = r1.j;	 Catch:{ all -> 0x0166 }
        r2 = defpackage.yng.a(r2, r5, r4);	 Catch:{ all -> 0x0166 }
        r2 = defpackage.ajdx.b(r2);	 Catch:{ all -> 0x0166 }
        r4 = new ynk$h;	 Catch:{ all -> 0x0166 }
        r4.<init>(r1, r0);	 Catch:{ all -> 0x0166 }
        r4 = (defpackage.ajfb) r4;	 Catch:{ all -> 0x0166 }
        r0 = r2.c(r4);	 Catch:{ all -> 0x0166 }
        r2 = new ynk$i;	 Catch:{ all -> 0x0166 }
        r2.<init>(r3);	 Catch:{ all -> 0x0166 }
        r2 = (defpackage.ajev) r2;	 Catch:{ all -> 0x0166 }
        r0 = r0.b(r2);	 Catch:{ all -> 0x0166 }
        r2 = defpackage.ynk.j.a;	 Catch:{ all -> 0x0166 }
        r2 = (defpackage.ajfb) r2;	 Catch:{ all -> 0x0166 }
        r0 = r0.d(r2);	 Catch:{ all -> 0x0166 }
        r2 = "Single.just(stacked).doO…tion icon\")\n            }";	 Catch:{ all -> 0x0166 }
        defpackage.akcr.a(r0, r2);	 Catch:{ all -> 0x0166 }
        return r0;
        r0 = move-exception;
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynk.a(java.util.List):ajdx");
    }
}
