package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.view.View;
import com.brightcove.player.media.ErrorFields;
import com.snapchat.android.R;
import defpackage.iii.a.a;
import defpackage.iii.b;
import defpackage.iii.c;
import defpackage.iii.d;

/* renamed from: fhq */
public final class fhq implements exz {
    private final akbl<Boolean, a> a = a.a;
    private final achb<zjm, zjk> b;

    /* renamed from: fhq$a */
    static final class a extends akcs implements akbl<Boolean, defpackage.iii.a.a> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            c cVar;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            if (booleanValue) {
                cVar = c.TRANSLUCENT;
            } else if (booleanValue) {
                throw new ajxk();
            } else {
                cVar = c.GONE;
            }
            return new defpackage.iii.a.a(cVar, d.GONE, b.FULLSCREEN);
        }
    }

    /* renamed from: fhq$b */
    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ defpackage.exz.b a;

        b(defpackage.exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(true);
            return ajxw.a;
        }
    }

    /* renamed from: fhq$c */
    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.b a;

        c(exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(false);
            return ajxw.a;
        }
    }

    /* renamed from: fhq$d */
    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.a a;

        d(exz.a aVar) {
            this.a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.onDismissedAlert();
            return ajxw.a;
        }
    }

    /* renamed from: fhq$e */
    static final class e extends akcs implements akbl<View, ajxw> {
        public static final e a = new e();

        e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    /* renamed from: fhq$f */
    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.b a;

        f(exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(true);
            return ajxw.a;
        }
    }

    /* renamed from: fhq$g */
    static final class g extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.b a;

        g(exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(false);
            return ajxw.a;
        }
    }

    /* renamed from: fhq$h */
    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.b a;

        h(exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(true);
            return ajxw.a;
        }
    }

    /* renamed from: fhq$i */
    static final class i extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ exz.b a;

        i(exz.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.didSelectYes(false);
            return ajxw.a;
        }
    }

    public fhq(achb<zjm, zjk> achb) {
        akcr.b(achb, "navigationHost");
        this.b = achb;
    }

    public final void a(Context context, CharSequence charSequence, String str, String str2, exz.b bVar, zjm zjm) {
        akcr.b(context, "context");
        akcr.b(charSequence, "description");
        akcr.b(str, "yesText");
        akcr.b(str2, "noText");
        akcr.b(bVar, "alertListener");
        akcr.b(zjm, "pageType");
        zgy a = new zgy.a(context, this.b, zjm, false, null).a(charSequence).a(str, (akbl) new b(bVar), false).b(str2, new c(bVar), false).a();
        this.b.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, String str2, exz.a aVar, zjm zjm) {
        akcr.b(context, "context");
        akcr.b(str2, "description");
        akcr.b(aVar, "listener");
        akcr.b(zjm, "pageType");
        zgy.a aVar2 = new zgy.a(context, this.b, zjm, false, null);
        zgy.a b = aVar2.b(str2);
        akbl akbl = this.a;
        akcr.b(akbl, "windowSpec");
        b.f = akbl;
        b = b.a((int) R.string.okay, (akbl) new d(aVar), false);
        if (str != null) {
            aVar2.a(str);
        }
        zgy a = b.a();
        this.b.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, String str2, String str3, exz.b bVar, OnDismissListener onDismissListener, zjm zjm) {
        akcr.b(context, "context");
        akcr.b(str, ErrorFields.MESSAGE);
        akcr.b(str2, "yesText");
        akcr.b(str3, "noText");
        akcr.b(bVar, "alertListener");
        akcr.b(onDismissListener, "dismissListener");
        akcr.b(zjm, "pageType");
        zgy a = new zgy.a(context, this.b, zjm, true, null).b(str).a(str2, (akbl) new f(bVar), false).b(str3, new g(bVar), true).a();
        this.b.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, String str2, String str3, exz.b bVar, zjm zjm) {
        akcr.b(context, "context");
        akcr.b(str, ErrorFields.MESSAGE);
        akcr.b(str2, "yesText");
        akcr.b(str3, "noText");
        akcr.b(bVar, "alertListener");
        akcr.b(zjm, "pageType");
        zgy a = new zgy.a(context, this.b, zjm, true, null).b(str).a(str2, (akbl) new h(bVar), true).a((int) R.string.cancel, (akbl) new i(bVar)).a();
        this.b.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, String str2, zjm zjm) {
        akcr.b(context, "context");
        akcr.b(str2, "description");
        akcr.b(zjm, "pageType");
        zgy.a aVar = new zgy.a(context, this.b, zjm, true, null);
        zgy.a a = aVar.b(str2).a((int) R.string.okay, (akbl) e.a, true);
        if (str != null) {
            aVar.a(str);
        }
        zgy a2 = a.a();
        this.b.a((achd) a2, a2.a, null);
    }
}
