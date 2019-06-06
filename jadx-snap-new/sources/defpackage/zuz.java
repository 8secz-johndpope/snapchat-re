package defpackage;

import com.google.common.base.Optional;
import defpackage.zuk.a;
import java.util.concurrent.Callable;

/* renamed from: zuz */
public final class zuz implements zud {
    final a a = a.COMPRESS;
    final ajwy<odu> b;
    final ajwy<gqr> c;
    private final ajxe d = ajxh.a(b.a);

    /* renamed from: zuz$b */
    static final class b extends akcs implements akbk<idd> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zui.a.callsite("UploadMediaManager:ZipMediaPlugin");
        }
    }

    /* renamed from: zuz$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zuz$c */
    static final class c<V> implements Callable<T> {
        private /* synthetic */ abyi a;

        c(abyi abyi) {
            this.a = abyi;
        }

        public final /* bridge */ /* synthetic */ Object call() {
            return this.a;
        }
    }

    /* renamed from: zuz$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zuz a;
        private /* synthetic */ idd b;

        d(zuz zuz, idd idd) {
            this.a = zuz;
            this.b = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abyi abyi = (abyi) obj;
            akcr.b(abyi, "it");
            return ((odu) this.a.b.get()).c(this.b, abyi);
        }
    }

    /* renamed from: zuz$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ zuz a;
        final /* synthetic */ abyi b;
        final /* synthetic */ idd c;

        e(zuz zuz, abyi abyi, idd idd) {
            this.a = zuz;
            this.b = abyi;
            this.c = idd;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odx odx = (odx) obj;
            akcr.b(odx, "reader");
            Object a = ajdx.c((Callable) new Callable<T>() {
                public final /* synthetic */ Object call() {
                    return odx.a();
                }
            }).a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ e a;

                public final /* synthetic */ Object apply(Object obj) {
                    akcr.b((odx) obj, "it");
                    obj = this.a.b.e.a;
                    String str = "this.mediaType";
                    akcr.a(obj, str);
                    String str2 = "Single.just(mediaPackage)";
                    boolean z = false;
                    String str3 = "reader";
                    if (abyp.i(obj.intValue())) {
                        aeew aeew = this.a.b.e;
                        Object obj2 = odx;
                        akcr.a(obj2, str3);
                        Object obj3 = aeew.a;
                        akcr.a(obj3, str);
                        if (abyp.i(obj3.intValue())) {
                            obj = aeew.a;
                            akcr.a(obj, str);
                            if (!abyp.c(obj.intValue()) && obj2.j()) {
                                z = true;
                            }
                        }
                        if (!z) {
                            obj = ajdx.b(this.a.b);
                            akcr.a(obj, str2);
                            return obj;
                        }
                    }
                    abyy c = odx.c();
                    if (c != null) {
                        z = c.C();
                    }
                    obj = this.a.b.e.a;
                    akcr.a(obj, str);
                    if ((abyp.c(obj.intValue()) && !z) || !odx.j()) {
                        obj = ajdx.b(this.a.b);
                        akcr.a(obj, str2);
                        return obj;
                    }
                    zuz zuz = this.a.a;
                    idd idd = this.a.c;
                    Object obj4 = odx;
                    akcr.a(obj4, str3);
                    if (obj4.b().g == abyl.ZIPPED) {
                        obj = ajdx.b(obj4.b());
                        akcr.a(obj, "Single.just(input.mediaPackage)");
                        return obj;
                    }
                    obj = ((odu) zuz.b.get()).a(idd, obj4.b()).a((ajfc) new g(zuz, obj4));
                    akcr.a(obj, "mediaPackageManager.get(…      }\n                }");
                    return obj;
                }
            });
            akcr.a(a, "Single.fromCallable { re…                        }");
            Object obj2 = this.a.c.get();
            akcr.a(obj2, "exceptionTracker.get()");
            return ody.a(a, odx, (gqr) obj2, this.a.b().a("transform"));
        }
    }

    /* renamed from: zuz$g */
    static final class g<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ odx a;
        private /* synthetic */ zuz b;

        g(zuz zuz, odx odx) {
            this.b = zuz;
            this.a = odx;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final odt odt = (odt) obj;
            akcr.b(odt, "output");
            return this.a.k().f(new ajfc<T, R>(this) {
                private /* synthetic */ g a;

                /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x0098=Splitter:B:24:0x0098, B:11:0x0079=Splitter:B:11:0x0079} */
                private defpackage.abyi a(com.google.common.base.Optional<defpackage.ohz> r11) {
                    /*
                    r10 = this;
                    r0 = "blob";
                    defpackage.akcr.b(r11, r0);
                    r0 = r3;
                    r0 = r0.a();
                    r0 = (java.io.Closeable) r0;
                    r1 = 0;
                    r2 = r3;	 Catch:{ Throwable -> 0x00ab }
                    r2 = r2.c();	 Catch:{ Throwable -> 0x00ab }
                    r2 = (java.io.Closeable) r2;	 Catch:{ Throwable -> 0x00ab }
                    r3 = r2;
                    r3 = (java.io.OutputStream) r3;	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    r4 = new abri;	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    r4.<init>(r3);	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    r4 = (java.io.Closeable) r4;	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    r3 = r4;
                    r3 = (defpackage.abri) r3;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = r10.a;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = r5.a;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = r5.f();	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = (java.io.InputStream) r5;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = defpackage.aklc.a(r5);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r6 = "Snapchat-";
                    r7 = ".zip.nomedia";
                    r6 = defpackage.abrg.a(r6, r7);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r7 = "media~";
                    r8 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r7 = r7.concat(r8);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r3.a(r7, r5);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r11 = r11.orNull();	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r11 = (defpackage.ohz) r11;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    if (r11 == 0) goto L_0x0079;
                L_0x004e:
                    r11 = r11.c();	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    if (r11 == 0) goto L_0x0079;
                L_0x0054:
                    r5 = "overlay~";
                    r6 = java.lang.String.valueOf(r6);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r5 = r5.concat(r6);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r6 = new aklo;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r7 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
                    r6.<init>(r7);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r7 = r6;
                    r7 = (java.io.OutputStream) r7;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r8 = android.graphics.Bitmap.CompressFormat.PNG;	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r11.a(r7, r8);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r11 = r6.a();	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r6 = "stream.toByteArray()";
                    defpackage.akcr.a(r11, r6);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                    r3.a(r5, r11);	 Catch:{ Throwable -> 0x0092, all -> 0x008f }
                L_0x0079:
                    defpackage.akax.a(r4, r1);	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    defpackage.akax.a(r2, r1);	 Catch:{ Throwable -> 0x00ab }
                    r11 = r3;	 Catch:{ Throwable -> 0x00ab }
                    r2 = defpackage.abyl.ZIPPED;	 Catch:{ Throwable -> 0x00ab }
                    r11 = r11.a(r2);	 Catch:{ Throwable -> 0x00ab }
                    r11 = r11.e();	 Catch:{ Throwable -> 0x00ab }
                    defpackage.akax.a(r0, r1);
                    return r11;
                L_0x008f:
                    r11 = move-exception;
                    r3 = r1;
                    goto L_0x0098;
                L_0x0092:
                    r11 = move-exception;
                    throw r11;	 Catch:{ all -> 0x0094 }
                L_0x0094:
                    r3 = move-exception;
                    r9 = r3;
                    r3 = r11;
                    r11 = r9;
                L_0x0098:
                    defpackage.akax.a(r4, r3);	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                    throw r11;	 Catch:{ Throwable -> 0x009f, all -> 0x009c }
                L_0x009c:
                    r11 = move-exception;
                    r3 = r1;
                    goto L_0x00a5;
                L_0x009f:
                    r11 = move-exception;
                    throw r11;	 Catch:{ all -> 0x00a1 }
                L_0x00a1:
                    r3 = move-exception;
                    r9 = r3;
                    r3 = r11;
                    r11 = r9;
                L_0x00a5:
                    defpackage.akax.a(r2, r3);	 Catch:{ Throwable -> 0x00ab }
                    throw r11;	 Catch:{ Throwable -> 0x00ab }
                L_0x00a9:
                    r11 = move-exception;
                    goto L_0x00ae;
                L_0x00ab:
                    r11 = move-exception;
                    r1 = r11;
                    throw r1;	 Catch:{ all -> 0x00a9 }
                L_0x00ae:
                    defpackage.akax.a(r0, r1);
                    throw r11;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.zuz$g$1.a(com.google.common.base.Optional):abyi");
                }

                public final /* synthetic */ Object apply(Object obj) {
                    return a((Optional) obj);
                }
            });
        }
    }

    /* renamed from: zuz$f */
    static final class f extends akcq implements akbl<Throwable, ajdx<abyi>> {
        f(zuz zuz) {
            super(1, zuz);
        }

        public final String getName() {
            return "handleException";
        }

        public final akej getOwner() {
            return akde.a(zuz.class);
        }

        public final String getSignature() {
            return "handleException(Ljava/lang/Throwable;)Lio/reactivex/Single;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "p1");
            obj = ajdx.b((Throwable) new zuf(((zuz) this.receiver).a, th.getMessage(), th, false));
            akcr.a(obj, "Single.error(UploadExcep…ssage, throwable, false))");
            return obj;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zuz.class), "attribution", "getAttribution()Lcom/snap/framework/attribution/AttributedCallsite;");
        a aVar = new a();
    }

    public zuz(ajwy<odu> ajwy, ajwy<gqr> ajwy2) {
        akcr.b(ajwy, "mediaPackageManager");
        akcr.b(ajwy2, "exceptionTracker");
        this.b = ajwy;
        this.c = ajwy2;
    }

    public final ajdx<abyi> a(abyi abyi, ajwy<vjo> ajwy, idd idd, String str) {
        akcr.b(abyi, "mediaPackage");
        akcr.b(ajwy, "mediaRenderingSizeHint");
        idd a = idd != null ? idd.a("UploadMediaManager:ZipMediaPlugin") : b();
        Object h = ajdx.c((Callable) new c(abyi)).a((ajfc) new d(this, a)).a((ajfc) new e(this, abyi, a)).h(new zva(new f(this)));
        akcr.a(h, "Single.fromCallable {\n  …xt(this::handleException)");
        return h;
    }

    public final a a() {
        return this.a;
    }

    /* Access modifiers changed, original: final */
    public final idd b() {
        return (idd) this.d.b();
    }
}
