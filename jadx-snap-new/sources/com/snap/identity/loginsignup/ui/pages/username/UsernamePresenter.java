package com.snap.identity.loginsignup.ui.pages.username;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.aaoo;
import defpackage.aaop;
import defpackage.aheb;
import defpackage.aipn;
import defpackage.ajdw;
import defpackage.ajfb;
import defpackage.ajwl;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcq;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akde;
import defpackage.akej;
import defpackage.akgb;
import defpackage.akgc;
import defpackage.ieg;
import defpackage.ira;
import defpackage.isf;
import defpackage.ish;
import defpackage.izu;
import defpackage.jbf;
import defpackage.jbk;
import defpackage.jbv;
import defpackage.jbw;
import defpackage.jeb;
import defpackage.jgw;
import defpackage.jgx;
import defpackage.jgy;
import defpackage.jrl;
import defpackage.zfw;
import defpackage.zgb;
import defpackage.zke;
import defpackage.zll;
import defpackage.zln;
import java.util.LinkedList;

public final class UsernamePresenter extends zll<jgy> implements defpackage.k {
    final ajwl<String> a;
    String b;
    int c = 1;
    boolean d;
    LinkedList<String> e = new LinkedList();
    boolean f;
    final akbl<Integer, ajxw> g = new i(this);
    final aipn<zke> h;
    final aipn<jbw> i;
    final aipn<isf> j;
    final aipn<jbk> k;
    private String l;
    private boolean m = true;
    private final zfw n = zgb.a(jbv.y.callsite("LoginSignup.SignupUsernamePresenter"));
    private final ab o = new ab(this);
    private final akbl<View, ajxw> p = new e(this);
    private final akbl<View, ajxw> q = new h(this);
    private final aipn<Context> r;
    private final aipn<ira> s;

    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;
        public static final int d = 0;
        public static final int e = 0;

        static {
            int[] iArr = new int[]{1, 2, 3, 4, 5};
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = iArr;
        }

        public static int[] a() {
            return (int[]) f.clone();
        }
    }

    public static final class ab implements TextWatcher {
        private /* synthetic */ UsernamePresenter a;

        ab(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final void afterTextChanged(Editable editable) {
            UsernamePresenter usernamePresenter = this.a;
            Object valueOf = String.valueOf(editable);
            usernamePresenter.d = true;
            usernamePresenter.a();
            CharSequence charSequence = (CharSequence) valueOf;
            if ((charSequence.length() == 0 ? 1 : null) != null) {
                usernamePresenter.a("");
                usernamePresenter.a(1);
            } else {
                Object obj = usernamePresenter.b;
                if (valueOf == null) {
                    throw new ajxt("null cannot be cast to non-null type kotlin.CharSequence");
                } else if ((1 ^ akcr.a(obj, akgc.b(charSequence).toString())) != 0) {
                    usernamePresenter.a(3);
                    usernamePresenter.a((String) valueOf);
                    usernamePresenter.a.a(valueOf);
                }
            }
            usernamePresenter.b();
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ UsernamePresenter a;

        b(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final void onClick(View view) {
            this.a.g.invoke(Integer.valueOf(0));
        }
    }

    static final class c implements OnClickListener {
        private /* synthetic */ UsernamePresenter a;

        c(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final void onClick(View view) {
            this.a.g.invoke(Integer.valueOf(1));
        }
    }

    static final class d implements OnClickListener {
        private /* synthetic */ UsernamePresenter a;

        d(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final void onClick(View view) {
            this.a.g.invoke(Integer.valueOf(2));
        }
    }

    static final class aa<T> implements ajfb<Throwable> {
        private /* synthetic */ UsernamePresenter a;

        aa(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            akcr.b(th, "thrown");
            ieg.a(th.getMessage(), true, 0);
            UsernamePresenter usernamePresenter = this.a;
            usernamePresenter.a(usernamePresenter.b);
            this.a.a(5);
            ((jbk) this.a.k.get()).a(-1, false, false, false);
            this.a.b();
        }
    }

    static final class f<T> implements ajfb<jeb> {
        private /* synthetic */ UsernamePresenter a;

        f(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (jeb) obj;
            UsernamePresenter usernamePresenter = this.a;
            akcr.a(obj, "session");
            usernamePresenter.b(obj.A);
            usernamePresenter.b();
        }
    }

    static final class g<T> implements ajfb<String> {
        private /* synthetic */ UsernamePresenter a;

        g(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        public final /* synthetic */ void accept(Object obj) {
            UsernamePresenter usernamePresenter = this.a;
            usernamePresenter.c(usernamePresenter.b);
        }
    }

    static final class z<T> implements ajfb<defpackage.ira.b<aheb>> {
        private /* synthetic */ UsernamePresenter a;

        z(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:81:0x0181  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0170  */
        public final /* synthetic */ void accept(java.lang.Object r11) {
            /*
            r10 = this;
            r11 = (defpackage.ira.b) r11;
            r11.a();
            r0 = r11.b;
            r0 = (defpackage.aheb) r0;
            r1 = r0.b;
            r2 = 1;
            r3 = 0;
            if (r1 == 0) goto L_0x0019;
        L_0x000f:
            r1 = (java.lang.CharSequence) r1;
            r1 = defpackage.akgb.a(r1);
            if (r1 != 0) goto L_0x0019;
        L_0x0017:
            r1 = 1;
            goto L_0x001a;
        L_0x0019:
            r1 = 0;
        L_0x001a:
            if (r1 == 0) goto L_0x002c;
        L_0x001c:
            r1 = r0.d;
            r4 = defpackage.aheb.a.OK;
            r4 = r4.name();
            r1 = defpackage.akcr.a(r1, r4);
            if (r1 == 0) goto L_0x002c;
        L_0x002a:
            r8 = 1;
            goto L_0x002d;
        L_0x002c:
            r8 = 0;
        L_0x002d:
            r1 = r0.c;
            if (r1 == 0) goto L_0x003b;
        L_0x0031:
            r1 = (java.util.Collection) r1;
            r1 = r1.isEmpty();
            if (r1 != 0) goto L_0x003b;
        L_0x0039:
            r9 = 1;
            goto L_0x003c;
        L_0x003b:
            r9 = 0;
        L_0x003c:
            r1 = r10.a;
            r1 = r1.k;
            r1 = r1.get();
            r4 = r1;
            r4 = (defpackage.jbk) r4;
            r5 = r11.a();
            r1 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
            r7 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
            r11 = r11.a;
            if (r7 <= r11) goto L_0x0054;
        L_0x0053:
            goto L_0x0058;
        L_0x0054:
            if (r1 < r11) goto L_0x0058;
        L_0x0056:
            r7 = 1;
            goto L_0x0059;
        L_0x0058:
            r7 = 0;
        L_0x0059:
            r4.a(r5, r7, r8, r9);
            r11 = r10.a;
            r11 = r11.d;
            r1 = 2;
            r4 = "resp.requestedUsername";
            r5 = "resp";
            if (r11 == 0) goto L_0x00fb;
        L_0x0067:
            r11 = r10.a;
            defpackage.akcr.b(r0, r5);
            r5 = r0.b;
            r5 = (java.lang.CharSequence) r5;
            if (r5 == 0) goto L_0x007b;
        L_0x0072:
            r5 = defpackage.akgb.a(r5);
            if (r5 == 0) goto L_0x0079;
        L_0x0078:
            goto L_0x007b;
        L_0x0079:
            r5 = 0;
            goto L_0x007c;
        L_0x007b:
            r5 = 1;
        L_0x007c:
            if (r5 != 0) goto L_0x00fa;
        L_0x007e:
            r5 = r0.b;
            r6 = r11.b;
            r5 = r5.equals(r6);
            if (r5 != 0) goto L_0x0089;
        L_0x0088:
            goto L_0x00fa;
        L_0x0089:
            r5 = r0.c;
            r5 = (java.util.Collection) r5;
            if (r5 == 0) goto L_0x0098;
        L_0x008f:
            r5 = r5.isEmpty();
            if (r5 == 0) goto L_0x0096;
        L_0x0095:
            goto L_0x0098;
        L_0x0096:
            r5 = 0;
            goto L_0x0099;
        L_0x0098:
            r5 = 1;
        L_0x0099:
            if (r5 != 0) goto L_0x00a6;
        L_0x009b:
            r5 = new java.util.LinkedList;
            r6 = r0.c;
            r6 = (java.util.Collection) r6;
            r5.<init>(r6);
            r11.e = r5;
        L_0x00a6:
            r5 = r0.a;
            r5 = (java.lang.CharSequence) r5;
            if (r5 == 0) goto L_0x00b4;
        L_0x00ac:
            r5 = defpackage.akgb.a(r5);
            if (r5 == 0) goto L_0x00b3;
        L_0x00b2:
            goto L_0x00b4;
        L_0x00b3:
            r2 = 0;
        L_0x00b4:
            if (r2 != 0) goto L_0x00db;
        L_0x00b6:
            r1 = r11.b;
            r11.a(r1);
            r1 = r0.a;
            r2 = "resp.errorMessage";
            defpackage.akcr.a(r1, r2);
            r11.b(r1);
            r1 = r11.h;
            r1 = r1.get();
            r1 = (defpackage.zke) r1;
            r3 = new jbb;
            r0 = r0.a;
            defpackage.akcr.a(r0, r2);
            r3.<init>(r0);
            r1.a(r3);
            goto L_0x00f7;
        L_0x00db:
            r2 = r11.j;
            r2 = r2.get();
            r2 = (defpackage.isf) r2;
            r3 = defpackage.aaoo.SIGNUP_USERNAME_SUCCEED;
            r5 = defpackage.aaop.INTERNAL_PROCESS;
            r6 = defpackage.ish.SIGNUP;
            r2.a(r3, r5, r6);
            r11.a(r1);
            r0 = r0.b;
            defpackage.akcr.a(r0, r4);
            r11.a(r0);
        L_0x00f7:
            r11.b();
        L_0x00fa:
            return;
        L_0x00fb:
            r11 = r10.a;
            defpackage.akcr.b(r0, r5);
            r11.d = r2;
            r5 = r0.c;
            r5 = (java.util.Collection) r5;
            if (r5 == 0) goto L_0x0111;
        L_0x0108:
            r5 = r5.isEmpty();
            if (r5 == 0) goto L_0x010f;
        L_0x010e:
            goto L_0x0111;
        L_0x010f:
            r5 = 0;
            goto L_0x0112;
        L_0x0111:
            r5 = 1;
        L_0x0112:
            if (r5 != 0) goto L_0x011f;
        L_0x0114:
            r5 = new java.util.LinkedList;
            r6 = r0.c;
            r6 = (java.util.Collection) r6;
            r5.<init>(r6);
            r11.e = r5;
        L_0x011f:
            r5 = r0.a;
            r5 = (java.lang.CharSequence) r5;
            if (r5 == 0) goto L_0x012e;
        L_0x0125:
            r5 = defpackage.akgb.a(r5);
            if (r5 == 0) goto L_0x012c;
        L_0x012b:
            goto L_0x012e;
        L_0x012c:
            r5 = 0;
            goto L_0x012f;
        L_0x012e:
            r5 = 1;
        L_0x012f:
            if (r5 == 0) goto L_0x0149;
        L_0x0131:
            r5 = r0.b;
            r5 = (java.lang.CharSequence) r5;
            if (r5 == 0) goto L_0x0140;
        L_0x0137:
            r5 = defpackage.akgb.a(r5);
            if (r5 == 0) goto L_0x013e;
        L_0x013d:
            goto L_0x0140;
        L_0x013e:
            r5 = 0;
            goto L_0x0141;
        L_0x0140:
            r5 = 1;
        L_0x0141:
            if (r5 != 0) goto L_0x0149;
        L_0x0143:
            r0 = r0.b;
            defpackage.akcr.a(r0, r4);
            goto L_0x0166;
        L_0x0149:
            r0 = r11.e;
            r0 = r0.size();
            if (r0 <= 0) goto L_0x0164;
        L_0x0151:
            r0 = r11.e;
            r0 = r0.get(r3);
            r4 = "suggestionsList[0]";
            defpackage.akcr.a(r0, r4);
            r0 = (java.lang.String) r0;
            r4 = r11.e;
            r4.remove(r3);
            goto L_0x0166;
        L_0x0164:
            r0 = "";
        L_0x0166:
            r3 = r0;
            r3 = (java.lang.CharSequence) r3;
            r3 = defpackage.akgb.a(r3);
            r3 = r3 ^ r2;
            if (r3 == 0) goto L_0x0181;
        L_0x0170:
            r11.a(r1);
            r1 = r11.k;
            r1 = r1.get();
            r1 = (defpackage.jbk) r1;
            r2 = defpackage.aavk.USERNAME;
            r1.a(r2);
            goto L_0x0184;
        L_0x0181:
            r11.a(r2);
        L_0x0184:
            r11.a(r0);
            r11.b();
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.username.UsernamePresenter$z.accept(java.lang.Object):void");
        }
    }

    static final class e extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ UsernamePresenter a;

        e(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            UsernamePresenter usernamePresenter = this.a;
            ((zke) usernamePresenter.h.get()).a(new jbf(usernamePresenter.b));
            return ajxw.a;
        }
    }

    static final class h extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ UsernamePresenter a;

        h(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "<anonymous parameter 0>");
            this.a.g.invoke(Integer.valueOf(0));
            return ajxw.a;
        }
    }

    static final class i extends akcs implements akbl<Integer, ajxw> {
        private /* synthetic */ UsernamePresenter a;

        i(UsernamePresenter usernamePresenter) {
            this.a = usernamePresenter;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue < this.a.e.size()) {
                if (this.a.c == 2) {
                    this.a.e.addLast(this.a.b);
                }
                this.a.a(2);
                Object obj2 = this.a.e.get(intValue);
                akcr.a(obj2, "suggestionsList[index]");
                this.a.a((String) obj2);
                this.a.e.remove(intValue);
                this.a.b();
            }
            return ajxw.a;
        }
    }

    static final class j extends akcq implements akbk<Integer> {
        j(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class k extends akcq implements akbl<Integer, ajxw> {
        k(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class l extends akcq implements akbk<String> {
        l(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class m extends akcq implements akbl<CharSequence, ajxw> {
        m(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class n extends akcq implements akbk<Integer> {
        n(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    static final class o extends akcq implements akbl<Integer, ajxw> {
        o(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class p extends akcq implements akbk<String> {
        p(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class q extends akcq implements akbl<CharSequence, ajxw> {
        q(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class r extends akcq implements akbl<Integer, ajxw> {
        r(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class s extends akcq implements akbk<Integer> {
        s(View view) {
            super(0, view);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((View) this.receiver).getVisibility());
        }
    }

    static final class t extends akcq implements akbl<Integer, ajxw> {
        t(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class u extends akcq implements akbk<Integer> {
        u(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    static final class v extends akcq implements akbl<Integer, ajxw> {
        v(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return ajxw.a;
        }
    }

    static final class w extends akcq implements akbk<String> {
        w(CharSequence charSequence) {
            super(0, charSequence);
        }

        public final String getName() {
            return "toString";
        }

        public final akej getOwner() {
            return akde.a(CharSequence.class);
        }

        public final String getSignature() {
            return "toString()Ljava/lang/String;";
        }

        public final /* synthetic */ Object invoke() {
            return ((CharSequence) this.receiver).toString();
        }
    }

    static final class x extends akcq implements akbl<CharSequence, ajxw> {
        x(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setText";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "setText(Ljava/lang/CharSequence;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setText((CharSequence) obj);
            return ajxw.a;
        }
    }

    static final class y extends akcq implements akbk<Integer> {
        y(TextView textView) {
            super(0, textView);
        }

        public final String getName() {
            return "getVisibility";
        }

        public final akej getOwner() {
            return akde.a(TextView.class);
        }

        public final String getSignature() {
            return "getVisibility()I";
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(((TextView) this.receiver).getVisibility());
        }
    }

    public UsernamePresenter(aipn<zke> aipn, aipn<Context> aipn2, aipn<jbw> aipn3, aipn<ira> aipn4, aipn<isf> aipn5, aipn<jbk> aipn6, zgb zgb) {
        akcr.b(aipn, "eventDispatcher");
        akcr.b(aipn2, "context");
        akcr.b(aipn3, "store");
        akcr.b(aipn4, "identityApi");
        akcr.b(aipn5, "stateTransitionService");
        akcr.b(aipn6, LocalMessageActionModel.ANALYTICS);
        akcr.b(zgb, "schedulersProvider");
        this.h = aipn;
        this.r = aipn2;
        this.i = aipn3;
        this.s = aipn4;
        this.j = aipn5;
        this.k = aipn6;
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create()");
        this.a = ajwl;
        String str = "";
        this.b = str;
        this.l = str;
    }

    private final boolean c() {
        Object obj = ((akgb.a((CharSequence) this.b) ^ 1) == 0 || !akgb.a(this.l)) ? null : 1;
        return this.f && obj == null;
    }

    private final void d() {
        jgy jgy = (jgy) getTarget();
        if (jgy != null) {
            jgy.a().addTextChangedListener(this.o);
            jgy.d().setOnClickListener(new jgx(this.p));
            jgy.g().setOnClickListener(new jgx(this.q));
            jgy.l().setOnClickListener(new b(this));
            jgy.m().setOnClickListener(new c(this));
            jgy.n().setOnClickListener(new d(this));
        }
    }

    private final void e() {
        jgy jgy = (jgy) getTarget();
        if (jgy != null) {
            jgy.a().removeTextChangedListener(this.o);
            jgy.d().setOnClickListener(null);
            jgy.g().setOnClickListener(null);
            jgy.l().setOnClickListener(null);
            jgy.m().setOnClickListener(null);
            jgy.n().setOnClickListener(null);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if ((((CharSequence) this.l).length() > 0 ? 1 : null) != null) {
            ((zke) this.h.get()).a(new izu());
        }
        this.l = "";
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        int i2 = 1;
        i = jgw.a[i - 1];
        if (i != 1) {
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            this.c = 5;
                            a();
                        }
                        return;
                    }
                    this.c = 2;
                    a();
                    return;
                }
            }
            this.c = i2;
            a();
            return;
        }
        this.c = 4;
    }

    public final void a(String str) {
        akcr.b(str, "username");
        this.b = akgc.b(str).toString();
    }

    /* renamed from: a */
    public final void takeTarget(jgy jgy) {
        akcr.b(jgy, "target");
        super.takeTarget(jgy);
        jgy.getLifecycle().a(this);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        if (!this.m) {
            Object obj = (jgy) getTarget();
            if (obj != null) {
                akcr.a(obj, "target ?: return");
                e();
                if (c()) {
                    Object obj2 = this.r.get();
                    akcr.a(obj2, "context.get()");
                    jrl.a((Context) obj2, obj.a());
                }
                if ((akcr.a(obj.a().getText().toString(), this.b) ^ 1) != 0) {
                    obj.a().setText(this.b);
                    obj.a().setSelection(this.b.length());
                }
                if ((akcr.a(obj.b().getText().toString(), this.l) ^ 1) != 0) {
                    obj.b().setText(this.l);
                }
                int i = this.e.size() > 0 ? 0 : 8;
                jrl.a(Integer.valueOf(i), new j(obj.g()), new r(obj.g()));
                jrl.a(Integer.valueOf(i), new s(obj.k()), new t(obj.k()));
                i = this.e.size();
                jrl.a(Integer.valueOf(i > 0 ? 0 : 8), new u(obj.l()), new v(obj.l()));
                if (i > 0) {
                    jrl.a(this.e.get(0), new w(obj.l().getText()), new x(obj.l()));
                }
                jrl.a(Integer.valueOf(i >= 2 ? 0 : 8), new y(obj.m()), new k(obj.m()));
                if (i >= 2) {
                    jrl.a(this.e.get(1), new l(obj.m().getText()), new m(obj.m()));
                }
                jrl.a(Integer.valueOf(i >= 3 ? 0 : 8), new n(obj.n()), new o(obj.n()));
                if (i >= 3) {
                    jrl.a(this.e.get(2), new p(obj.n().getText()), new q(obj.n()));
                }
                i = jgw.b[this.c - 1];
                if (i == 1) {
                    obj.h().setVisibility(8);
                } else if (i != 2) {
                    if (i == 3) {
                        obj.h().setVisibility(8);
                        obj.c().setVisibility(0);
                    } else if (i != 4) {
                        if (i == 5) {
                            obj.h().setVisibility(8);
                            obj.c().setVisibility(8);
                        }
                        d();
                    } else {
                        obj.h().setVisibility(8);
                        obj.c().setVisibility(8);
                        obj.b().setVisibility(0);
                        obj.d().setState(0);
                        d();
                    }
                    obj.b().setVisibility(8);
                    obj.d().setState(1);
                    d();
                } else {
                    obj.h().setVisibility(0);
                }
                obj.c().setVisibility(8);
                obj.b().setVisibility(8);
                obj.d().setState(0);
                d();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void b(String str) {
        this.l = str;
        if ((((CharSequence) this.l).length() > 0 ? 1 : null) != null) {
            a(4);
        }
    }

    /* Access modifiers changed, original: final */
    public final void c(String str) {
        if ((akgb.a(str) ^ 1) != 0) {
            ((isf) this.j.get()).a(aaoo.SIGNUP_USERNAME_SUBMIT, this.d ? aaop.USER_TYPING : aaop.INTERNAL_PROCESS, ish.SIGNUP);
            zln.bindTo$default(this, ((ira) this.s.get()).d(str).a((ajdw) this.n.l()).a((ajfb) new z(this), (ajfb) new aa(this)), this, null, null, 6, null);
        }
    }

    public final void dropTarget() {
        Object obj = (jgy) getTarget();
        if (obj == null) {
            akcr.a();
        }
        akcr.a(obj, "target!!");
        obj.getLifecycle().b(this);
        super.dropTarget();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x011c  */
    /* JADX WARNING: Missing block: B:20:0x00af, code skipped:
            if ((((java.lang.CharSequence) r0.p).length() > 0 ? 1 : null) != null) goto L_0x00b1;
     */
    @defpackage.s(a = defpackage.j.a.ON_CREATE)
    public final void onBegin() {
        /*
        r11 = this;
        r0 = r11.i;
        r0 = r0.get();
        r0 = (defpackage.jbw) r0;
        r0 = r0.a();
        r1 = r11.n;
        r1 = r1.l();
        r1 = (defpackage.zfr) r1;
        r1 = (defpackage.ajdw) r1;
        r0 = r0.a(r1);
        r1 = new com.snap.identity.loginsignup.ui.pages.username.UsernamePresenter$f;
        r1.<init>(r11);
        r1 = (defpackage.ajfb) r1;
        r3 = r0.f(r1);
        r0 = r11;
        r0 = (defpackage.zln) r0;
        r5 = 0;
        r6 = 0;
        r7 = 6;
        r8 = 0;
        r2 = r11;
        r4 = r0;
        defpackage.zln.bindTo$default(r2, r3, r4, r5, r6, r7, r8);
        r1 = r11.a;
        r2 = r11.n;
        r2 = r2.l();
        r2 = (defpackage.zfr) r2;
        r2 = (defpackage.ajdw) r2;
        r1 = r1.a(r2);
        r2 = java.util.concurrent.TimeUnit.MILLISECONDS;
        r3 = r11.n;
        r3 = r3.b();
        r3 = (defpackage.ajdw) r3;
        r4 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1 = r1.b(r4, r2, r3);
        r2 = new com.snap.identity.loginsignup.ui.pages.username.UsernamePresenter$g;
        r2.<init>(r11);
        r2 = (defpackage.ajfb) r2;
        r5 = r1.f(r2);
        r7 = 0;
        r9 = 6;
        r10 = 0;
        r4 = r11;
        r6 = r0;
        defpackage.zln.bindTo$default(r4, r5, r6, r7, r8, r9, r10);
        r0 = r11.i;
        r0 = r0.get();
        r0 = (defpackage.jbw) r0;
        r0 = r0.c();
        r1 = r0.r;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        r2 = 1;
        r3 = 0;
        if (r1 <= 0) goto L_0x007e;
    L_0x007c:
        r1 = 1;
        goto L_0x007f;
    L_0x007e:
        r1 = 0;
    L_0x007f:
        r4 = "";
        if (r1 != 0) goto L_0x00f5;
    L_0x0083:
        r1 = r0.s;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x008f;
    L_0x008d:
        r1 = 1;
        goto L_0x0090;
    L_0x008f:
        r1 = 0;
    L_0x0090:
        if (r1 == 0) goto L_0x0093;
    L_0x0092:
        goto L_0x00f5;
    L_0x0093:
        r1 = r0.o;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x009f;
    L_0x009d:
        r1 = 1;
        goto L_0x00a0;
    L_0x009f:
        r1 = 0;
    L_0x00a0:
        if (r1 != 0) goto L_0x00b1;
    L_0x00a2:
        r1 = r0.p;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x00ae;
    L_0x00ac:
        r1 = 1;
        goto L_0x00af;
    L_0x00ae:
        r1 = 0;
    L_0x00af:
        if (r1 == 0) goto L_0x010f;
    L_0x00b1:
        r1 = r0.o;
        r0 = r0.p;
        r5 = r1;
        r5 = (java.lang.CharSequence) r5;
        r5 = r5.length();
        if (r5 <= 0) goto L_0x00c0;
    L_0x00be:
        r5 = 1;
        goto L_0x00c1;
    L_0x00c0:
        r5 = 0;
    L_0x00c1:
        if (r5 == 0) goto L_0x00d6;
    L_0x00c3:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r5.append(r4);
        r1 = r1.charAt(r3);
        r5.append(r1);
        r4 = r5.toString();
    L_0x00d6:
        r1 = r0;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x00e1;
    L_0x00df:
        r1 = 1;
        goto L_0x00e2;
    L_0x00e1:
        r1 = 0;
    L_0x00e2:
        if (r1 == 0) goto L_0x010f;
    L_0x00e4:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r4);
        r1.append(r0);
        r0 = r1.toString();
        r4 = r0;
        goto L_0x010f;
    L_0x00f5:
        r1 = r0.r;
        r1 = (java.lang.CharSequence) r1;
        r1 = r1.length();
        if (r1 <= 0) goto L_0x0101;
    L_0x00ff:
        r1 = 1;
        goto L_0x0102;
    L_0x0101:
        r1 = 0;
    L_0x0102:
        if (r1 == 0) goto L_0x0107;
    L_0x0104:
        r0 = r0.r;
        goto L_0x0109;
    L_0x0107:
        r0 = r0.s;
    L_0x0109:
        r11.b = r0;
        r4 = r11.b;
        r11.d = r2;
    L_0x010f:
        r0 = r4;
        r0 = (java.lang.CharSequence) r0;
        r0 = r0.length();
        if (r0 <= 0) goto L_0x0119;
    L_0x0118:
        goto L_0x011a;
    L_0x0119:
        r2 = 0;
    L_0x011a:
        if (r2 == 0) goto L_0x0122;
    L_0x011c:
        r11.a();
        r11.c(r4);
    L_0x0122:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.identity.loginsignup.ui.pages.username.UsernamePresenter.onBegin():void");
    }

    @defpackage.s(a = defpackage.j.a.ON_PAUSE)
    public final void onTargetPause() {
        e();
        this.m = true;
    }

    @defpackage.s(a = defpackage.j.a.ON_RESUME)
    public final void onTargetResume() {
        d();
        this.m = false;
    }
}
