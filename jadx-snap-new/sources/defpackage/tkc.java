package defpackage;

import android.content.Context;
import android.view.View;
import com.brightcove.player.media.ErrorFields;
import com.snapchat.android.R;
import defpackage.tgw.a;
import defpackage.tgw.b;
import defpackage.tgw.c;

/* renamed from: tkc */
public final class tkc implements tgw {
    private final ajwy<achb<zjm, zjk>> a;

    /* renamed from: tkc$a */
    static final class a extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ b a;
        private /* synthetic */ Context b;

        a(b bVar, Context context) {
            this.a = bVar;
            this.b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(this.b);
            return ajxw.a;
        }
    }

    /* renamed from: tkc$b */
    static final class b extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ defpackage.tgw.b a;

        b(defpackage.tgw.b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(true);
            return ajxw.a;
        }
    }

    /* renamed from: tkc$c */
    static final class c extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ b a;

        c(b bVar) {
            this.a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a(false);
            return ajxw.a;
        }
    }

    /* renamed from: tkc$d */
    static final class d extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ a a;

        d(a aVar) {
            this.a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.onDismiss();
            return ajxw.a;
        }
    }

    /* renamed from: tkc$e */
    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ c a;

        e(c cVar) {
            this.a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            this.a.a();
            return ajxw.a;
        }
    }

    /* renamed from: tkc$f */
    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ c a;

        f(c cVar) {
            this.a = cVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            return ajxw.a;
        }
    }

    public tkc(ajwy<achb<zjm, zjk>> ajwy) {
        akcr.b(ajwy, "navigationHost");
        this.a = ajwy;
    }

    public final void a(Context context, int i, boolean z) {
        akcr.b(context, "context");
        String string = context.getString(i);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(z ? "[ChaosMonkey] " : "");
        stringBuilder.append(string);
        string = stringBuilder.toString();
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy a = new zgy.a(context, achb, tfv.i, false, null, 24).b(string).a();
        achb.a((achd) a, a.a, null);
    }

    public final /* synthetic */ void a(Context context, Integer num, Integer num2, Integer num3, Integer num4, c cVar) {
        zgy.a a;
        int intValue = num2.intValue();
        int intValue2 = num3.intValue();
        int intValue3 = num4.intValue();
        akcr.b(context, "context");
        akcr.b(cVar, "callbackHandler");
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy.a aVar = new zgy.a(context, achb, tfv.j, false, null, 24);
        if (num != null) {
            num.intValue();
            a = aVar.a(num.intValue());
        }
        zgy a2 = zgy.a.a(a.b(intValue).a(intValue2, (akbl) new e(cVar), true), (akbl) new f(cVar), false, Integer.valueOf(intValue3), null, null, 26).a();
        achb.a((achd) a2, a2.a, null);
    }

    public final void a(Context context, String str) {
        akcr.b(context, "context");
        akcr.b(str, ErrorFields.MESSAGE);
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy a = new zgy.a(context, achb, tfv.i, false, null, 24).b(str).a();
        achb.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, String str2, a aVar) {
        akcr.b(context, "context");
        akcr.b(str, "title");
        akcr.b(str2, ErrorFields.MESSAGE);
        akcr.b(aVar, "callbackHandler");
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy a = new zgy.a(context, achb, tfv.k, false, null, 24).a(str).b(str2).a((int) R.string.marco_polo_dialog_button_ok, (akbl) new d(aVar), true).a();
        achb.a((achd) a, a.a, null);
    }

    public final void a(Context context, String str, the the, b bVar) {
        zgy.a a;
        akcr.b(context, "context");
        akcr.b(str, "tag");
        akcr.b(the, "error");
        akcr.b(bVar, "errorHandlerCallback");
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy.a aVar = new zgy.a(context, achb, tfv.i, false, null, 16);
        if (the.a()) {
            String a2 = tlm.a(context, the.e());
            akcr.a((Object) a2, "ErrorResponseUtils.getRe…ext, error.isFakeError())");
            a = zgy.a.a(aVar.b(a2).a((int) R.string.error_retry, (akbl) new a(bVar, context), true), (akbl) new b(bVar), false, Integer.valueOf(R.string.marco_polo_dialog_button_cancel), null, null, 26);
        } else {
            String a3 = tlm.a(the, context.getResources());
            akcr.a((Object) a3, "ErrorResponseUtils.getLo…, context.getResources())");
            a = aVar.b(a3).a((int) R.string.marco_polo_dialog_button_ok, (akbl) new c(bVar), true);
        }
        zgy a4 = a.a();
        achb.a((achd) a4, a4.a, null);
    }

    public final void a(Context context, the the) {
        akcr.b(context, "context");
        akcr.b(the, "error");
        achb achb = (achb) this.a.get();
        akcr.a((Object) achb, "host");
        zgy.a aVar = new zgy.a(context, achb, tfv.i, false, null, 24);
        String a = tlm.a(the, context.getResources());
        akcr.a((Object) a, "ErrorResponseUtils.getLo…error, context.resources)");
        zgy a2 = aVar.b(a).a();
        achb.a((achd) a2, a2.a, null);
    }
}
