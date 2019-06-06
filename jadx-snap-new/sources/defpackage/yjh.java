package defpackage;

import android.os.ParcelFileDescriptor;
import defpackage.admm.a;
import defpackage.oeq.b;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.util.Set;
import java.util.concurrent.Callable;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: yjh */
public final class yjh implements yjn {
    final String a = "DefaultStorySnapAdditionalImageResolver";
    final oer b;
    private final yjk c;
    private final yjk d;
    private final ajxe e;

    /* renamed from: yjh$a */
    static final class a extends akcs implements akbk<jwa> {
        private /* synthetic */ jwb a;

        a(jwb jwb) {
            this.a = jwb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a(yhy.j);
        }
    }

    /* renamed from: yjh$b */
    static final class b<V> implements Callable<T> {
        private /* synthetic */ gdt a;

        b(gdt gdt) {
            this.a = gdt;
        }

        public final /* synthetic */ Object call() {
            return ParcelFileDescriptor.open(this.a.c(), SQLiteDatabase.CREATE_IF_NECESSARY);
        }
    }

    /* renamed from: yjh$c */
    static final class c<T> implements ajfb<ParcelFileDescriptor> {
        private /* synthetic */ ajei a;

        c(ajei ajei) {
            this.a = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            final ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            akcr.b(parcelFileDescriptor, "assetFileDescriptor");
            this.a.a(ajek.a((Runnable) new Runnable() {
                public final void run() {
                    aklc.a((Closeable) parcelFileDescriptor);
                }
            }));
        }
    }

    /* renamed from: yjh$d */
    static final class d<T, R> implements ajfc<T, R> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
            akcr.b(parcelFileDescriptor, "it");
            return parcelFileDescriptor.getFileDescriptor();
        }
    }

    /* renamed from: yjh$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ yjh a;
        private /* synthetic */ String b;
        private /* synthetic */ boolean c;

        h(yjh yjh, String str, boolean z) {
            this.a = yjh;
            this.b = str;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            FileDescriptor fileDescriptor = (FileDescriptor) obj;
            akcr.b(fileDescriptor, "it");
            oer oer = this.a.b;
            String str = this.b;
            boolean z = this.c;
            ide ide = yhy.j;
            idd callsite = yhy.j.callsite(this.a.a);
            String str2 = "name";
            akcr.b(str, str2);
            String str3 = "fd";
            akcr.b(fileDescriptor, str3);
            String str4 = "feature";
            akcr.b(ide, str4);
            String str5 = "caller";
            akcr.b(callsite, str5);
            oeo oeo = oer.a;
            akcr.b(str, str2);
            akcr.b(fileDescriptor, str3);
            akcr.b(ide, str4);
            akcr.b(callsite, str5);
            oeq oeq = oeo.c;
            akcr.b(str, str2);
            akcr.b(fileDescriptor, str3);
            akcr.b(ide, str4);
            akcr.b(callsite, str5);
            if (z) {
                obj = oeq.b.a(ide, callsite, fileDescriptor, ajyl.a(Long.valueOf(0)), null, a.SOFTWARE_FIRST).e().f(b.a);
                str = "videoFrameRetriever.fetc…Error().map { it.bitmap }";
            } else {
                obj = ((jwc) oeq.a.b()).a(new jwf(str, new BufferedInputStream(new FileInputStream(fileDescriptor))), callsite);
                str = "bitmapLoader.loadBitmap(…nputStream(fd))), caller)";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: yjh$i */
    static final class i<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ ajei a;

        i(ajei ajei) {
            this.a = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "frameBitmap");
            this.a.a((ajej) kaz);
        }
    }

    /* renamed from: yjh$j */
    static final class j<T> implements ajfb<kaz<jwj>> {
        private /* synthetic */ ajei a;

        j(ajei ajei) {
            this.a = ajei;
        }

        public final /* synthetic */ void accept(Object obj) {
            kaz kaz = (kaz) obj;
            akcr.b(kaz, "frameBitmap");
            this.a.a((ajej) kaz);
        }
    }

    /* renamed from: yjh$e */
    static final class e<T1, T2, R> implements ajex<gej, gej, gej> {
        private /* synthetic */ gej a;

        e(gej gej) {
            this.a = gej;
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            gej gej = (gej) obj2;
            akcr.b((gej) obj, "loadingFrameAsset");
            akcr.b(gej, "firstFrameAsset");
            return gem.a(r3, gej, this.a);
        }
    }

    /* renamed from: yjh$g */
    static final class g implements ajev {
        private /* synthetic */ ajei a;

        g(ajei ajei) {
            this.a = ajei;
        }

        public final void run() {
            this.a.dispose();
        }
    }

    /* renamed from: yjh$f */
    static final class f<T, R> implements ajfc<T, R> {
        private /* synthetic */ gej a;

        f(gej gej) {
            this.a = gej;
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((gej) obj, "loadingFrameAsset");
            return gem.a(r3, this.a);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(yjh.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;");
    }

    public yjh(gee gee, jwb jwb, yjr yjr, yjq yjq, oer oer) {
        akcr.b(gee, "contentManager");
        akcr.b(jwb, "bitmapFactoryProvider");
        akcr.b(yjr, "loadingFrameContentType");
        akcr.b(yjq, "firstFrameContentType");
        akcr.b(oer, "firstFrameExtractor");
        this.b = oer;
        this.c = new yjk(gee, "loading_frame", yjr);
        this.d = new yjk(gee, "video_first_frame", yjq);
        this.e = ajxh.a(new a(jwb));
    }

    public final ajdx<gej> a(String str, gej gej, boolean z, Set<rzg> set, Set<? extends gdy> set2) {
        Object b;
        String str2;
        akcr.b(str, "mediaId");
        akcr.b(gej, "story");
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        rzh.a((Set) set);
        idl b2 = rzh.b((Set) set);
        ajei ajei = new ajei();
        gdt a = gem.a(gej, "media");
        if (a == null) {
            b = ajdx.b((Object) gej);
            str2 = "Single.just(story)";
        } else {
            akcr.b(a, "assetDescriptor");
            akcr.b(ajei, "disposables");
            Object f = ajdx.c((Callable) new b(a)).c((ajfb) new c(ajei)).f(d.a);
            akcr.a(f, "Single.fromCallable { Pa…map { it.fileDescriptor }");
            f = f.a((ajfc) new h(this, str, z)).c((ajfb) new i(ajei)).a();
            oer oer = this.b;
            jwa jwa = (jwa) this.e.b();
            akcr.a(f, "firstFrame");
            String str3 = "bitmapFactory";
            akcr.b(jwa, str3);
            String str4 = "source";
            akcr.b(f, str4);
            String str5 = "page";
            akcr.b(b2, str5);
            oeo oeo = oer.a;
            akcr.b(jwa, str3);
            akcr.b(f, str4);
            akcr.b(b2, str5);
            Object f2 = f.f(new oeo.b(oeo, jwa));
            akcr.a(f2, "source.map {\n           …p().height)\n            }");
            f2 = f2.c((ajfb) new j(ajei));
            akcr.a(f2, "firstFrameExtractor.tran…sables.add(frameBitmap) }");
            ajdx a2 = this.c.a(str, f2, set, set2);
            b = (z ? ajdx.a((ajeb) a2, (ajeb) this.d.a(str, f, set, set2), (ajex) new e(gej)) : a2.f(new f(gej))).b((ajev) new g(ajei));
            str2 = "if (isVideo) {\n         …{ disposables.dispose() }";
        }
        akcr.a(b, str2);
        return b;
    }
}
