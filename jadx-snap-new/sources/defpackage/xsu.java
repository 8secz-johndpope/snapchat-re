package defpackage;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.net.Uri;
import android.view.View;
import android.view.View.MeasureSpec;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.stickers.ui.views.infosticker.InfoStickerView;
import defpackage.rzg.a;
import defpackage.yci.d;
import defpackage.yci.e;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.Set;

@ftr(a = "info_sticker")
/* renamed from: xsu */
public final class xsu extends ggm {
    final ajxe a;
    final ajxe b;
    final xst c;
    final gee d;
    final ajwy<ajdx<iha>> e;
    final ajwy<zgb> f;
    private final idj g = xsd.a.getPage();
    private final ajxe h;

    /* renamed from: xsu$a */
    static final class a implements ajev {
        private /* synthetic */ xsu a;
        private /* synthetic */ ajxm b;
        private /* synthetic */ boolean c;

        a(xsu xsu, ajxm ajxm, boolean z) {
            this.a = xsu;
            this.b = ajxm;
            this.c = z;
        }

        public final void run() {
            ((kaz) this.b.a).dispose();
        }
    }

    /* renamed from: xsu$b */
    static final class b<T> implements ajfb<Throwable> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: xsu$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ xsu a;
        private /* synthetic */ Uri b;
        private /* synthetic */ View c;

        c(xsu xsu, Uri uri, View view) {
            this.a = xsu;
            this.b = uri;
            this.c = view;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "json");
            xsu xsu = this.a;
            Uri uri = this.b;
            View view = this.c;
            view.measure(MeasureSpec.makeMeasureSpec(xsv.a(uri), 0), MeasureSpec.makeMeasureSpec(xsv.b(uri), 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            Object a = ((jwa) xsu.b.b()).a(view.getMeasuredWidth(), view.getMeasuredHeight(), "InfoStickerUriHandler");
            akcr.a(a, "factory.createBitmap(inf…View.measuredHeight, TAG)");
            view.draw(new Canvas(jwz.a(a)));
            return ajxs.a(a, str);
        }
    }

    /* renamed from: xsu$d */
    static final class d<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xsu a;
        private /* synthetic */ boolean b;

        d(xsu xsu, boolean z) {
            this.a = xsu;
            this.b = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "res");
            return this.a.a(ajxm, this.b);
        }
    }

    /* renamed from: xsu$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ xsu a;

        g(xsu xsu) {
            this.a = xsu;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ybi ybi = (ybi) obj;
            akcr.b(ybi, "presenter");
            Context context = (Context) this.a.a.b();
            akcr.a((Object) context, "context");
            InfoStickerView infoStickerView = new InfoStickerView(context, null, 6);
            ybi.takeTarget(infoStickerView);
            return infoStickerView;
        }
    }

    /* renamed from: xsu$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xsu a;
        private /* synthetic */ Uri b;
        private /* synthetic */ boolean c;

        h(xsu xsu, Uri uri, boolean z) {
            this.a = xsu;
            this.b = uri;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            InfoStickerView infoStickerView = (InfoStickerView) obj;
            akcr.b(infoStickerView, "it");
            return this.a.a(this.b, infoStickerView, this.c);
        }
    }

    /* renamed from: xsu$i */
    static final class i<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xsu a;
        private /* synthetic */ Uri b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;

        i(xsu xsu, Uri uri, Set set, boolean z) {
            this.a = xsu;
            this.b = uri;
            this.c = set;
            this.d = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            xsu xsu = this.a;
            Uri uri = this.b;
            Set set = this.c;
            boolean z = this.d;
            String valueOf = String.valueOf(str.hashCode());
            akcr.b(valueOf, "id");
            akcr.b(set, "schedulingContexts");
            obj = xsu.d.a(new gew(valueOf, null, null, null, xsu.c, set, ajzs.a(gdy.READ_CACHE_ONLY), 284)).a(z);
            akcr.a(obj, "contentManager.submit(\n …tResult(closeOnTerminate)");
            obj = obj.a((ajfc) new j(xsu, uri, z));
            akcr.a(obj, "requestIndividualResourc…      }\n                }");
            return obj;
        }
    }

    /* renamed from: xsu$j */
    static final class j<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ xsu a;
        private /* synthetic */ Uri b;
        private /* synthetic */ boolean c;

        j(xsu xsu, Uri uri, boolean z) {
            this.a = xsu;
            this.b = uri;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str;
            obj = (gej) obj;
            akcr.b(obj, "it");
            if (obj.a()) {
                obj = ajdx.b(obj);
                str = "Single.just(it)";
            } else {
                String str2;
                xsu xsu = this.a;
                Uri uri = this.b;
                boolean z = this.c;
                Object obj2 = xsu.e.get();
                akcr.a(obj2, "serializationHelper.get()");
                ajdx ajdx = (ajdx) obj2;
                zfw a = xsu.a();
                akcr.b(uri, MessageMediaRefModel.URI);
                String str3 = "serializationHelper";
                akcr.b(ajdx, str3);
                String str4 = "schedulers";
                akcr.b(a, str4);
                ajdx c = xsv.c(uri);
                ajxm a2 = xsv.a(uri, a);
                if (a2 != null) {
                    Class cls = (Class) a2.a;
                    akbl akbl = (akbl) a2.b;
                    akcr.b(c, "json");
                    akcr.b(ajdx, str3);
                    akcr.b(cls, "dataProvider");
                    akcr.b(a, str4);
                    akcr.b(akbl, "mapper");
                    obj2 = ajdx.a((ajfc) new d(c, cls, a)).f(new e(akbl));
                    str2 = "serializationHelper\n    …map { mapper.invoke(it) }";
                } else {
                    obj2 = ajdx.b((Throwable) new IllegalStateException("Couldn't resolve mapping for info sticker"));
                    str2 = "Single.error(IllegalStat…pping for info sticker\"))";
                }
                akcr.a(obj2, str2);
                obj = obj2.a((ajdw) xsu.a().l()).f(new g(xsu)).a((ajdw) xsu.a().f()).a((ajfc) new h(xsu, uri, z));
                str = "InfoStickerUriHelper.bui…minate)\n                }";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    /* renamed from: xsu$e */
    static final class e extends akcs implements akbk<Context> {
        private /* synthetic */ ajwy a;

        e(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Context) this.a.get();
        }
    }

    /* renamed from: xsu$f */
    static final class f extends akcs implements akbk<jwa> {
        private /* synthetic */ ajwy a;

        f(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jwb) this.a.get()).a(xsd.a);
        }
    }

    /* renamed from: xsu$k */
    static final class k extends akcs implements akbk<zfw> {
        private /* synthetic */ xsu a;

        k(xsu xsu) {
            this.a = xsu;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.a.f.get();
            return zgb.a(xsd.a.callsite("InfoStickerUriHandler"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(xsu.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(xsu.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;"), new akdc(akde.a(xsu.class), "factory", "getFactory()Lcom/snap/imageloading/api/BitmapFactory;")};
    }

    public xsu(xst xst, gee gee, ajwy<ajdx<iha>> ajwy, ajwy<zgb> ajwy2, ajwy<Context> ajwy3, ajwy<jwb> ajwy4) {
        akcr.b(xst, "infoStickerContentType");
        akcr.b(gee, "contentManager");
        akcr.b(ajwy, "serializationHelper");
        akcr.b(ajwy2, "schedulersProvider");
        akcr.b(ajwy3, "applicationContext");
        akcr.b(ajwy4, "bitmapFactory");
        this.c = xst;
        this.d = gee;
        this.e = ajwy;
        this.f = ajwy2;
        this.a = ajxh.a(new e(ajwy3));
        this.h = ajxh.a(new k(this));
        this.b = ajxh.a(new f(ajwy4));
    }

    /* Access modifiers changed, original: final */
    public final ajdx<gej> a(ajxm<? extends kaz<jwj>, String> ajxm, boolean z) {
        ajxm<? extends kaz<jwj>, String> ajxm2 = ajxm;
        boolean z2 = z;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        jwz.a((kaz) ajxm2.a).compress(CompressFormat.WEBP, 100, byteArrayOutputStream);
        Closeable closeable = byteArrayOutputStream;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) closeable;
            Object obj = ajxm2.b;
            Object d = this.d.a(new gew(String.valueOf(obj != null ? obj.hashCode() : 0), null, gem.a((InputStream) new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()), "media"), null, this.c, a.a((idl) this.g), ajyy.a, 276)).a(z2).b((ajev) new a(this, ajxm2, z2)).d((ajfb) b.a);
            akcr.a(d, "contentManager.submit(De…d\")\n                    }");
            akax.a(closeable, null);
            akcr.a(d, "outputStream.use {\n     …              }\n        }");
            return d;
        } catch (Throwable th) {
            akax.a(closeable, th);
        }
    }

    public final ajdx<gej> a(Uri uri, View view, boolean z) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(view, "infoStickerView");
        Object a = xsv.c(uri).f(new c(this, uri, view)).a((ajdw) a().f()).a((ajfc) new d(this, z));
        akcr.a(a, "InfoStickerUriHelper.get…oseOnTerminate)\n        }");
        return a;
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = xsv.c(uri).a((ajfc) new i(this, uri, set, z));
        akcr.a(a, "InfoStickerUriHelper.get…exts, closeOnTerminate) }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.h.b();
    }
}
