package com.snap.shake2report.ui.featureselector;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import defpackage.abkq;
import defpackage.ajdj;
import defpackage.ajdp;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.akcr;
import defpackage.akgb;
import defpackage.gpb;
import defpackage.wwh;
import defpackage.zfw;
import java.util.concurrent.atomic.AtomicBoolean;

public final class InternalAdditionalInfoCollector extends wwh {
    static final ImmutableList<String> h = ImmutableList.of("@snapchat.com", "@snap.com", "@snap-cn.com", "@c.snap.com");
    gpb a;
    ajei b;
    TextView c;
    TextView d;
    S2RFeatureSelectorView e;
    zfw f;
    final AtomicBoolean g;
    private EditText i;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static boolean a(String str) {
            akcr.b(str, "email");
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            UnmodifiableIterator it = InternalAdditionalInfoCollector.h.iterator();
            while (it.hasNext()) {
                Object obj = (String) it.next();
                if (str.length() > obj.length()) {
                    akcr.a(obj, "suffix");
                    if (akgb.c(str, obj)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    static final class b<T> implements ajfb<Object> {
        private /* synthetic */ InternalAdditionalInfoCollector a;

        b(InternalAdditionalInfoCollector internalAdditionalInfoCollector) {
            this.a = internalAdditionalInfoCollector;
        }

        public final void accept(Object obj) {
            if (this.a.g.get()) {
                InternalAdditionalInfoCollector internalAdditionalInfoCollector = this.a;
                internalAdditionalInfoCollector.g.set(false);
                TextView textView = internalAdditionalInfoCollector.c;
                if (textView == null) {
                    akcr.a("switcherText");
                }
                if (textView == null) {
                    akcr.a();
                }
                textView.setText("Choose Feature");
                textView = internalAdditionalInfoCollector.d;
                if (textView == null) {
                    akcr.a("headerText");
                }
                if (textView == null) {
                    akcr.a();
                }
                textView.setText("Send to Email");
                S2RFeatureSelectorView s2RFeatureSelectorView = internalAdditionalInfoCollector.e;
                if (s2RFeatureSelectorView == null) {
                    akcr.a("s2RFeatureSelectorView");
                }
                if (s2RFeatureSelectorView == null) {
                    akcr.a();
                }
                s2RFeatureSelectorView.setVisibility(8);
                gpb gpb = internalAdditionalInfoCollector.a;
                if (gpb == null) {
                    akcr.a("userAuthStore");
                }
                ajdp c = gpb.c();
                zfw zfw = internalAdditionalInfoCollector.f;
                String str = "schedulers";
                if (zfw == null) {
                    akcr.a(str);
                }
                ajdj d = c.b((ajdw) zfw.h()).d();
                zfw = internalAdditionalInfoCollector.f;
                if (zfw == null) {
                    akcr.a(str);
                }
                ajej d2 = d.a((ajdw) zfw.l()).d((ajfb) new c(internalAdditionalInfoCollector));
                akcr.a((Object) d2, "userAuthStore.observeUse…tion(0)\n                }");
                ajvv.a(d2, internalAdditionalInfoCollector.b);
                return;
            }
            this.a.g();
        }
    }

    static final class c<T> implements ajfb<abkq> {
        private /* synthetic */ InternalAdditionalInfoCollector a;

        c(InternalAdditionalInfoCollector internalAdditionalInfoCollector) {
            this.a = internalAdditionalInfoCollector;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (abkq) obj;
            EditText a = InternalAdditionalInfoCollector.a(this.a);
            if (a == null) {
                akcr.a();
            }
            a.setVisibility(0);
            a = InternalAdditionalInfoCollector.a(this.a);
            if (a == null) {
                akcr.a();
            }
            akcr.a(obj, "it");
            String str = obj.d;
            if (str == null || !a.a(str)) {
                str = "@snapchat.com";
            }
            a.setText(str);
            EditText a2 = InternalAdditionalInfoCollector.a(this.a);
            if (a2 == null) {
                akcr.a();
            }
            a2.setSelection(0);
        }
    }

    static {
        a aVar = new a();
    }

    public InternalAdditionalInfoCollector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private InternalAdditionalInfoCollector(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = new ajei();
        this.g = new AtomicBoolean(true);
    }

    public static final /* synthetic */ EditText a(InternalAdditionalInfoCollector internalAdditionalInfoCollector) {
        EditText editText = internalAdditionalInfoCollector.i;
        if (editText == null) {
            akcr.a("emailEditText");
        }
        return editText;
    }

    /* JADX WARNING: Missing block: B:26:0x014a, code skipped:
            if (r4 == null) goto L_0x0151;
     */
    /* JADX WARNING: Missing block: B:28:0x014f, code skipped:
            if (r4 == null) goto L_0x0151;
     */
    public final void a(android.view.View r8, defpackage.gpb r9, defpackage.zgb r10, defpackage.wvl r11) {
        /*
        r7 = this;
        r0 = "rootView";
        defpackage.akcr.b(r8, r0);
        r0 = "userAuthStore";
        defpackage.akcr.b(r9, r0);
        r0 = "schedulersProvider";
        defpackage.akcr.b(r10, r0);
        r10 = "reportConfigProvider";
        defpackage.akcr.b(r11, r10);
        r7.a = r9;
        r9 = 0;
        r7.setVisibility(r9);
        r10 = 2131429830; // 0x7f0b09c6 float:1.8481344E38 double:1.0530662555E-314;
        r10 = r8.findViewById(r10);
        r0 = "rootView.findViewById(R.…ature_switcher_text_view)";
        defpackage.akcr.a(r10, r0);
        r10 = (android.widget.TextView) r10;
        r7.c = r10;
        r10 = 2131429829; // 0x7f0b09c5 float:1.8481342E38 double:1.053066255E-314;
        r10 = r8.findViewById(r10);
        r0 = "rootView.findViewById(R.…feature_header_text_view)";
        defpackage.akcr.a(r10, r0);
        r10 = (android.widget.TextView) r10;
        r7.d = r10;
        r10 = 2131429832; // 0x7f0b09c8 float:1.8481348E38 double:1.0530662565E-314;
        r10 = r8.findViewById(r10);
        r0 = "rootView.findViewById(R.…nt_enter_email_edit_text)";
        defpackage.akcr.a(r10, r0);
        r10 = (android.widget.EditText) r10;
        r7.i = r10;
        r10 = 2131429826; // 0x7f0b09c2 float:1.8481336E38 double:1.0530662535E-314;
        r10 = r8.findViewById(r10);
        r0 = "rootView.findViewById(R.…s2r_feature_frame_layout)";
        defpackage.akcr.a(r10, r0);
        r10 = (com.snap.shake2report.ui.featureselector.S2RFeatureSelectorView) r10;
        r7.e = r10;
        r10 = defpackage.wqv.g;
        r10 = (defpackage.ide) r10;
        r0 = "InternalAdditionalInfoCollector";
        r10 = defpackage.zgb.a(r10, r0);
        r7.f = r10;
        r10 = r7.e;
        if (r10 != 0) goto L_0x006f;
    L_0x006a:
        r0 = "s2RFeatureSelectorView";
        defpackage.akcr.a(r0);
    L_0x006f:
        if (r10 != 0) goto L_0x0074;
    L_0x0071:
        defpackage.akcr.a();
    L_0x0074:
        r0 = r7.f;
        r1 = "schedulers";
        if (r0 != 0) goto L_0x007d;
    L_0x007a:
        defpackage.akcr.a(r1);
    L_0x007d:
        r11 = r11.j;
        r2 = "fragmentView";
        defpackage.akcr.b(r8, r2);
        r2 = "scheduler";
        defpackage.akcr.b(r0, r2);
        r2 = 2131429840; // 0x7f0b09d0 float:1.8481364E38 double:1.0530662605E-314;
        r2 = r8.findViewById(r2);
        r10.b = r2;
        r2 = 2131429838; // 0x7f0b09ce float:1.848136E38 double:1.0530662595E-314;
        r2 = r8.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r10.c = r2;
        r2 = 2131429839; // 0x7f0b09cf float:1.8481362E38 double:1.05306626E-314;
        r2 = r8.findViewById(r2);
        r2 = (android.widget.LinearLayout) r2;
        r10.d = r2;
        r2 = 2131429883; // 0x7f0b09fb float:1.8481451E38 double:1.0530662817E-314;
        r2 = r8.findViewById(r2);
        r10.e = r2;
        r2 = 2131429864; // 0x7f0b09e8 float:1.8481413E38 double:1.0530662723E-314;
        r8 = r8.findViewById(r2);
        r8 = (android.widget.TextView) r8;
        r10.f = r8;
        r8 = defpackage.absx.a.a();
        r8 = r8.iterator();
    L_0x00c4:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x018c;
    L_0x00ca:
        r2 = r8.next();
        r2 = (java.lang.String) r2;
        r3 = "feature";
        defpackage.akcr.a(r2, r3);
        r3 = new com.snap.ui.view.button.SnapFontButton;
        r4 = r10.getContext();
        r5 = "context";
        defpackage.akcr.a(r4, r5);
        r3.<init>(r4);
        r4 = r2;
        r4 = (java.lang.CharSequence) r4;
        r3.setText(r4);
        r4 = new android.view.ViewGroup$LayoutParams;
        r5 = -2;
        r4.<init>(r5, r5);
        r3.setLayoutParams(r4);
        r4 = r10.getContext();
        r5 = 2131232182; // 0x7f0805b6 float:1.8080466E38 double:1.0529686044E-314;
        r4 = android.support.v4.content.ContextCompat.getDrawable(r4, r5);
        r3.setBackground(r4);
        r4 = r10.getContext();
        r5 = 2131100112; // 0x7f0601d0 float:1.7812596E38 double:1.052903353E-314;
        r4 = defpackage.abtp.a(r4, r5);
        r3.setTextColor(r4);
        r4 = 1082130432; // 0x40800000 float:4.0 double:5.34643471E-315;
        r5 = r10.getContext();
        r4 = defpackage.abtp.b(r4, r5);
        r4 = (float) r4;
        r3.setTextSize(r4);
        r4 = r10.c;
        if (r4 != 0) goto L_0x0123;
    L_0x0120:
        defpackage.akcr.a();
    L_0x0123:
        r4.measure(r9, r9);
        r4 = r10.d;
        if (r4 != 0) goto L_0x012d;
    L_0x012a:
        defpackage.akcr.a();
    L_0x012d:
        r4.measure(r9, r9);
        r4 = r10.c;
        if (r4 != 0) goto L_0x0137;
    L_0x0134:
        defpackage.akcr.a();
    L_0x0137:
        r4 = r4.getMeasuredWidth();
        r5 = r10.d;
        if (r5 != 0) goto L_0x0142;
    L_0x013f:
        defpackage.akcr.a();
    L_0x0142:
        r5 = r5.getMeasuredWidth();
        if (r4 > r5) goto L_0x014d;
    L_0x0148:
        r4 = r10.c;
        if (r4 != 0) goto L_0x0154;
    L_0x014c:
        goto L_0x0151;
    L_0x014d:
        r4 = r10.d;
        if (r4 != 0) goto L_0x0154;
    L_0x0151:
        defpackage.akcr.a();
    L_0x0154:
        r5 = r3;
        r5 = (android.view.View) r5;
        r4.addView(r5);
        r4 = r10.a;
        r5 = r3;
        r5 = (android.view.View) r5;
        r5 = defpackage.cfl.c(r5);
        r6 = r0.l();
        r6 = (defpackage.zfr) r6;
        r6 = (defpackage.ajdw) r6;
        r5 = r5.a(r6);
        r6 = new com.snap.shake2report.ui.featureselector.S2RFeatureSelectorView$a;
        r6.<init>(r10, r3, r0);
        r6 = (defpackage.ajfb) r6;
        r5 = r5.f(r6);
        r4.a(r5);
        r2 = r2.equals(r11);
        if (r2 == 0) goto L_0x00c4;
    L_0x0183:
        r3 = (android.widget.Button) r3;
        r10.h = r3;
        r10.a(r3);
        goto L_0x00c4;
    L_0x018c:
        if (r11 == 0) goto L_0x0192;
    L_0x018e:
        r10.a(r11, r0);
        goto L_0x0195;
    L_0x0192:
        r10.a();
    L_0x0195:
        r7.g();
        r8 = r7.b;
        r9 = r7.c;
        if (r9 != 0) goto L_0x01a3;
    L_0x019e:
        r10 = "switcherText";
        defpackage.akcr.a(r10);
    L_0x01a3:
        if (r9 != 0) goto L_0x01a8;
    L_0x01a5:
        defpackage.akcr.a();
    L_0x01a8:
        r9 = (android.view.View) r9;
        r9 = defpackage.cfl.c(r9);
        r10 = r7.f;
        if (r10 != 0) goto L_0x01b5;
    L_0x01b2:
        defpackage.akcr.a(r1);
    L_0x01b5:
        r10 = r10.l();
        r10 = (defpackage.zfr) r10;
        r10 = (defpackage.ajdw) r10;
        r9 = r9.a(r10);
        r10 = new com.snap.shake2report.ui.featureselector.InternalAdditionalInfoCollector$b;
        r10.<init>(r7);
        r10 = (defpackage.ajfb) r10;
        r9 = r9.f(r10);
        r8.a(r9);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.shake2report.ui.featureselector.InternalAdditionalInfoCollector.a(android.view.View, gpb, zgb, wvl):void");
    }

    public final boolean a() {
        if (!d()) {
            S2RFeatureSelectorView s2RFeatureSelectorView = this.e;
            String str = "s2RFeatureSelectorView";
            if (s2RFeatureSelectorView == null) {
                akcr.a(str);
            }
            if (s2RFeatureSelectorView != null) {
                s2RFeatureSelectorView = this.e;
                if (s2RFeatureSelectorView == null) {
                    akcr.a(str);
                }
                if (s2RFeatureSelectorView == null) {
                    akcr.a();
                }
                if (!TextUtils.isEmpty(s2RFeatureSelectorView.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String b() {
        if (!a()) {
            return null;
        }
        S2RFeatureSelectorView s2RFeatureSelectorView = this.e;
        if (s2RFeatureSelectorView == null) {
            akcr.a("s2RFeatureSelectorView");
        }
        if (s2RFeatureSelectorView == null) {
            akcr.a();
        }
        return s2RFeatureSelectorView.g;
    }

    public final void c() {
        this.b.a();
        S2RFeatureSelectorView s2RFeatureSelectorView = this.e;
        if (s2RFeatureSelectorView == null) {
            akcr.a("s2RFeatureSelectorView");
        }
        if (s2RFeatureSelectorView == null) {
            akcr.a();
        }
        s2RFeatureSelectorView.a.a();
    }

    public final boolean d() {
        EditText editText = this.i;
        String str = "emailEditText";
        if (editText == null) {
            akcr.a(str);
        }
        if (editText == null) {
            return false;
        }
        editText = this.i;
        if (editText == null) {
            akcr.a(str);
        }
        if (editText == null) {
            akcr.a();
        }
        CharSequence obj = editText.getText().toString();
        int length = obj.length() - 1;
        int i = 0;
        Object obj2 = null;
        while (i <= length) {
            Object obj3 = obj.charAt(obj2 == null ? i : length) <= ' ' ? 1 : null;
            if (obj2 != null) {
                if (obj3 == null) {
                    break;
                }
                length--;
            } else if (obj3 == null) {
                obj2 = 1;
            } else {
                i++;
            }
        }
        return a.a(obj.subSequence(i, length + 1).toString());
    }

    public final String e() {
        if (!d()) {
            return null;
        }
        EditText editText = this.i;
        if (editText == null) {
            akcr.a("emailEditText");
        }
        if (editText == null) {
            akcr.a();
        }
        return editText.getText().toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029 A:{RETURN} */
    public final java.lang.String f() {
        /*
        r3 = this;
        r0 = r3.d();
        r1 = 0;
        r2 = "s2RFeatureSelectorView";
        if (r0 != 0) goto L_0x0026;
    L_0x0009:
        r0 = r3.e;
        if (r0 != 0) goto L_0x0010;
    L_0x000d:
        defpackage.akcr.a(r2);
    L_0x0010:
        if (r0 == 0) goto L_0x0026;
    L_0x0012:
        r0 = r3.e;
        if (r0 != 0) goto L_0x0019;
    L_0x0016:
        defpackage.akcr.a(r2);
    L_0x0019:
        if (r0 != 0) goto L_0x001e;
    L_0x001b:
        defpackage.akcr.a();
    L_0x001e:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x0026;
    L_0x0024:
        r0 = 1;
        goto L_0x0027;
    L_0x0026:
        r0 = 0;
    L_0x0027:
        if (r0 != 0) goto L_0x002a;
    L_0x0029:
        return r1;
    L_0x002a:
        r0 = r3.e;
        if (r0 != 0) goto L_0x0031;
    L_0x002e:
        defpackage.akcr.a(r2);
    L_0x0031:
        if (r0 != 0) goto L_0x0036;
    L_0x0033:
        defpackage.akcr.a();
    L_0x0036:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.shake2report.ui.featureselector.InternalAdditionalInfoCollector.f():java.lang.String");
    }

    /* Access modifiers changed, original: final */
    public final void g() {
        this.g.set(true);
        TextView textView = this.c;
        if (textView == null) {
            akcr.a("switcherText");
        }
        if (textView == null) {
            akcr.a();
        }
        textView.setText("Send to Email");
        textView = this.d;
        if (textView == null) {
            akcr.a("headerText");
        }
        if (textView == null) {
            akcr.a();
        }
        textView.setText("Choose Feature");
        EditText editText = this.i;
        String str = "emailEditText";
        if (editText == null) {
            akcr.a(str);
        }
        if (editText == null) {
            akcr.a();
        }
        editText.getText().clear();
        editText = this.i;
        if (editText == null) {
            akcr.a(str);
        }
        if (editText == null) {
            akcr.a();
        }
        editText.setVisibility(8);
        S2RFeatureSelectorView s2RFeatureSelectorView = this.e;
        if (s2RFeatureSelectorView == null) {
            akcr.a("s2RFeatureSelectorView");
        }
        if (s2RFeatureSelectorView == null) {
            akcr.a();
        }
        s2RFeatureSelectorView.setVisibility(0);
    }
}
