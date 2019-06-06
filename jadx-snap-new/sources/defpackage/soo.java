package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.snap.core.db.record.MessageMediaRefModel;
import com.snapchat.android.R;
import defpackage.cc.a;

/* renamed from: soo */
public final class soo extends slm {
    final soq a = new soq(this.d);
    Uri b;
    boolean c;
    final Context d;
    private final ajxe e = ajxh.a(new b(this));
    private final sop f = new 1(this);

    /* renamed from: soo$1 */
    public static final class 1 extends sop {
        private /* synthetic */ soo a;

        1(soo soo) {
            this.a = soo;
        }

        public final void a() {
            if (!this.a.c) {
                soq soq = this.a.a;
                Uri uri = this.a.b;
                if (uri == null) {
                    akcr.a();
                }
                akcr.b(uri, MessageMediaRefModel.URI);
                if (soq.b != null) {
                    ce ceVar = soq.c;
                    if (ceVar != null) {
                        ceVar.a(uri);
                    }
                }
            }
        }

        public final void a(int i, Bundle bundle) {
            if (i == 6) {
                soo soo = this.a;
                soo.c = false;
                soo.z().c(srb.SWIPE_BACK);
            }
        }
    }

    /* renamed from: soo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: soo$b */
    static final class b extends akcs implements akbk<View> {
        private /* synthetic */ soo a;

        b(soo soo) {
            this.a = soo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return View.inflate(this.a.d, R.layout.chrome_custom_tabs_placeholder_view, null);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(soo.class), "placeholderView", "getPlaceholderView()Landroid/view/View;");
        a aVar = new a();
    }

    public soo(Context context) {
        akcr.b(context, "context");
        this.d = context;
    }

    public final void a(szw szw) {
        super.a(szw);
        if (!this.c && this.b != null) {
            a aVar = new a(this.a.c);
            aVar.a();
            aVar.a(this.d);
            aVar.b(this.d);
            Object b = aVar.b();
            akcr.a(b, "intentBuilder.build()");
            soq soq = this.a;
            Uri uri = this.b;
            if (uri == null) {
                akcr.a();
            }
            akcr.b(uri, MessageMediaRefModel.URI);
            akcr.b(b, "customTabsIntent");
            b.a.setPackage("com.android.chrome");
            b.a(soq.e, uri);
            this.c = true;
        }
    }

    public final void ae_() {
        super.ae_();
        Object a = w().a(sqh.aL);
        akcr.a(a, "getPage().get(OperaPageM…OME_CUSTOM_TABS_PAGE_URL)");
        this.b = Uri.parse(((sqf) a).b());
        soq soq = this.a;
        sop sop = this.f;
        akcr.b(sop, "customTabsListener");
        if (soq.b == null) {
            soq.a = new sor(soq);
            soq.d = sop;
            cb.a(soq.e, "com.android.chrome", soq.a);
        }
    }

    public final void b() {
        super.b();
        soq soq = this.a;
        if (soq.a != null) {
            soq.e.unbindService(soq.a);
            soq.a = null;
            soq.b = null;
            soq.c = null;
        }
    }

    public final View e() {
        Object obj = (View) this.e.b();
        akcr.a(obj, "placeholderView");
        return obj;
    }

    public final String f() {
        return "CHROME_CUSTOM_TABS";
    }
}
