package defpackage;

import android.content.Context;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.Editable;
import android.text.Spannable;
import android.view.ViewGroup.LayoutParams;
import com.brightcove.player.event.EventType;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snap.previewtools.caption.ui.CaptionEditTextView;
import defpackage.agnp.a;
import defpackage.ufm.d;
import defpackage.ufm.f;
import defpackage.ufm.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

@ftr(a = "caption_view_bitmap")
/* renamed from: uep */
public final class uep extends ggm {
    final ajxe a;
    final ajxe b;
    final ueo c;
    final gee d;
    final ajdx<iha> e;
    final ajwy<ufm> f;
    private final ajxe g = ajxh.a(new i(this));
    private final zgb h;

    /* renamed from: uep$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: uep$g */
    static final class g<V> implements Callable<T> {
        private /* synthetic */ Uri a;

        g(Uri uri) {
            this.a = uri;
        }

        public final /* synthetic */ Object call() {
            Uri uri = this.a;
            akcr.b(uri, MessageMediaRefModel.URI);
            return uri.getQueryParameter("caption_metadata_json");
        }
    }

    /* renamed from: uep$d */
    static final class d<T, R> implements ajfc<T, R> {
        private /* synthetic */ String a;

        d(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            return (abzg) iha.a(this.a, abzg.class);
        }
    }

    /* renamed from: uep$e */
    static final class e<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ uep a;

        e(uep uep) {
            this.a = uep;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abzg abzg = (abzg) obj;
            akcr.b(abzg, "it");
            ufm ufm = (ufm) this.a.f.get();
            Object obj2 = (Context) this.a.a.b();
            String str = "context";
            akcr.a(obj2, str);
            akcr.b(obj2, str);
            akcr.b(abzg, EventType.CAPTION);
            CaptionEditTextView captionEditTextView = new CaptionEditTextView(obj2);
            captionEditTextView.setLayoutParams(new LayoutParams(a.values()[abzg.a()] == a.REGULAR ? -1 : -2, -2));
            captionEditTextView.setText(abzg.b());
            Object resources = obj2.getResources();
            akcr.a(resources, "context.resources");
            captionEditTextView.setMaxWidth(resources.getDisplayMetrics().widthPixels);
            captionEditTextView.setGravity(ufz.a(abzg));
            Editable text = captionEditTextView.getText();
            if (text == null) {
                akcr.a();
            }
            captionEditTextView.a(abzg.n());
            ugc.a.a(text);
            Spannable spannable = text;
            List a = udl.a(abzg.c());
            akcr.a((Object) a, "CaptionColorRangeConvert…s(caption.textattributes)");
            ugc.a.a(spannable, a);
            udu udu = (udu) ufm.d.b();
            Map d = abzg.d();
            akcr.a((Object) d, "caption.spanListMap");
            ajcx e = udu.a(d, (akbk) new f(abzg)).f(new g(captionEditTextView)).e();
            Object obj3 = (ajdx) ufm.a.b();
            akcr.a(obj3, "isDynamicCaptionsEnabledSingle");
            Object obj4 = (ajdx) ufm.b.b();
            akcr.a(obj4, "isHardwareRenderingEnabledSingle");
            Object e2 = ajwd.a(obj3, (ajeb) obj4).e((ajfc) new defpackage.ufm.e(ufm, captionEditTextView, abzg));
            akcr.a(e2, "isDynamicCaptionsEnabled…plete()\n                }");
            obj = e.b((ajdb) e2).b((ajeb) ajdx.c((Callable) new d(abzg, obj2, captionEditTextView)));
            akcr.a(obj, "setTextSpanCompletable\n …              }\n        )");
            return obj;
        }
    }

    /* renamed from: uep$f */
    static final class f<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ uep a;
        private /* synthetic */ String b;
        private /* synthetic */ Set c;
        private /* synthetic */ boolean d;

        /* renamed from: uep$f$a */
        static final class a implements ajev {
            private /* synthetic */ f a;
            private /* synthetic */ kaz b;

            a(f fVar, kaz kaz) {
                this.a = fVar;
                this.b = kaz;
            }

            public final void run() {
                this.b.dispose();
            }
        }

        /* renamed from: uep$f$b */
        static final class b<T> implements ajfb<gej> {
            public static final b a = new b();

            b() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        /* renamed from: uep$f$c */
        static final class c<T> implements ajfb<Throwable> {
            public static final c a = new c();

            c() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        f(uep uep, String str, Set set, boolean z) {
            this.a = uep;
            this.b = str;
            this.c = set;
            this.d = z;
        }

        private ajdx<gej> a(CaptionEditTextView captionEditTextView) {
            akcr.b(captionEditTextView, "captionView");
            Object a = ((jwa) this.a.b.b()).a(captionEditTextView.getMeasuredWidth(), captionEditTextView.getMeasuredHeight(), "CaptionViewBitmapUriHandler");
            akcr.a(a, "bitmapFactory.createBitm…View.measuredHeight, TAG)");
            captionEditTextView.draw(new Canvas(jwz.a(a)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            jwz.a(a).compress(CompressFormat.PNG, 100, byteArrayOutputStream);
            Closeable closeable = byteArrayOutputStream;
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = (ByteArrayOutputStream) closeable;
                ajdx b = this.a.d.a(new gew(this.b, null, gem.a((InputStream) new ByteArrayInputStream(byteArrayOutputStream2.toByteArray()), "media"), null, this.a.c, this.c, ajyy.a, 276)).a(this.d).c((ajfb) b.a).d((ajfb) c.a).b((ajev) new a(this, a));
                akax.a(closeable, null);
                return b;
            } catch (Throwable th) {
                akax.a(closeable, th);
            }
        }

        public final /* synthetic */ Object apply(Object obj) {
            return a((CaptionEditTextView) obj);
        }
    }

    /* renamed from: uep$h */
    static final class h<T, R> implements ajfc<T, ajeb<? extends R>> {
        final /* synthetic */ uep a;
        final /* synthetic */ Set b;
        final /* synthetic */ boolean c;

        h(uep uep, Set set, boolean z) {
            this.a = uep;
            this.b = set;
            this.c = z;
        }

        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            akcr.b(str, "captionJson");
            uep uep = this.a;
            Set set = this.b;
            Object a = uep.d.a(new gew(str, null, null, null, uep.c, set, ajzs.a(gdy.READ_CACHE_ONLY), 284)).a(this.c);
            akcr.a(a, "contentManager.submit(\n …tResult(closeOnTerminate)");
            return a.a((ajfc) new ajfc<T, ajeb<? extends R>>(this) {
                private /* synthetic */ h a;

                public final /* synthetic */ Object apply(Object obj) {
                    String str;
                    obj = (gej) obj;
                    akcr.b(obj, "it");
                    if (obj.a()) {
                        obj = ajdx.b(obj);
                        str = "Single.just(it)";
                    } else {
                        uep uep = this.a.a;
                        Object obj2 = str;
                        akcr.a(obj2, "captionJson");
                        obj = uep.e.f(new d(obj2)).a((ajdw) uep.a().l()).a((ajfc) new e(uep)).a((ajdw) uep.a().f()).a((ajfc) new f(uep, obj2, this.a.b, this.a.c));
                        str = "serializationHelper.map …}\n            }\n        }";
                    }
                    akcr.a(obj, str);
                    return obj;
                }
            });
        }
    }

    /* renamed from: uep$b */
    static final class b extends akcs implements akbk<jwa> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ((jwb) this.a.get()).a(toc.d);
        }
    }

    /* renamed from: uep$c */
    static final class c extends akcs implements akbk<Context> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (Context) this.a.get();
        }
    }

    /* renamed from: uep$i */
    static final class i extends akcs implements akbk<zfw> {
        private /* synthetic */ uep a;

        i(uep uep) {
            this.a = uep;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(toc.d.callsite("CaptionViewBitmapUriHandler"));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(uep.class), "context", "getContext()Landroid/content/Context;"), new akdc(akde.a(uep.class), "bitmapFactory", "getBitmapFactory()Lcom/snap/imageloading/api/BitmapFactory;"), new akdc(akde.a(uep.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;")};
        a aVar = new a();
    }

    public uep(zgb zgb, ueo ueo, gee gee, ajdx<iha> ajdx, ajwy<Context> ajwy, ajwy<ufm> ajwy2, ajwy<jwb> ajwy3) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ueo, "captionViewBitmapContentType");
        akcr.b(gee, "contentManager");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ajwy, "applicationContext");
        akcr.b(ajwy2, "captionEditTextViewFactory");
        akcr.b(ajwy3, "bitmapFactoryProvider");
        this.h = zgb;
        this.c = ueo;
        this.d = gee;
        this.e = ajdx;
        this.f = ajwy2;
        this.a = ajxh.a(new c(ajwy));
        this.b = ajxh.a(new b(ajwy3));
    }

    public final ajdx<gej> a(Uri uri, Set<rzg> set, boolean z, Set<? extends gdy> set2) {
        akcr.b(uri, MessageMediaRefModel.URI);
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        Object a = ajdx.c((Callable) new g(uri)).a((ajfc) new h(this, set, z));
        akcr.a(a, "Single.fromCallable { Ca…}\n            }\n        }");
        return a;
    }

    /* Access modifiers changed, original: final */
    public final zfw a() {
        return (zfw) this.g.b();
    }
}
