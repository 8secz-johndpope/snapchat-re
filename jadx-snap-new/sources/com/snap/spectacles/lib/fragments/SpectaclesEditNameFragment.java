package com.snap.spectacles.lib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.snap.spectacles.api.SpectaclesFragment;
import com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter;
import com.snapchat.android.R;
import defpackage.acgu;
import defpackage.achb;
import defpackage.achd;
import defpackage.achg;
import defpackage.achi;
import defpackage.acis;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajej;
import defpackage.ajvv;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbk;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.xai;
import defpackage.xbb;
import defpackage.xdb;
import defpackage.xme;
import defpackage.zgy;
import defpackage.zjk;
import defpackage.zjm;
import java.util.concurrent.Callable;

public final class SpectaclesEditNameFragment extends SpectaclesFragment implements xme {
    static final zjm e = new zjm(xai.f, "SpectaclesEditNameFragment", false, false, false, false, null, false, false, false, false, null, 4092);
    public static final acgu<zjm> f;
    public static final acgu<zjm> g;
    public achb<zjm, zjk> a;
    public SpectaclesEditNamePresenter b;
    private EditText h;
    private TextView i;
    private View j;
    private final ajxe k = ajxh.a(new e(this));

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ SpectaclesEditNameFragment a;

        b(SpectaclesEditNameFragment spectaclesEditNameFragment) {
            this.a = spectaclesEditNameFragment;
        }

        public final void onClick(View view) {
            CharSequence obj = SpectaclesEditNameFragment.a(this.a).getText().toString();
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
            String obj4 = obj.subSequence(i, length + 1).toString();
            SpectaclesEditNamePresenter h = this.a.h();
            akcr.b(obj4, "nameCandidate");
            xbb j = h.b().j();
            String str = h.a;
            if (str == null) {
                akcr.a("serialNumber");
            }
            xdb b = j.b(str);
            if (b != null) {
                ajej e = ajcx.b((Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.b(b, h, obj4)).b((ajdw) h.c().f()).e();
                akcr.a((Object) e, "Completable.fromCallable…             .subscribe()");
                ajvv.a(e, h.e);
            }
        }
    }

    public static final class c implements TextWatcher {
        private /* synthetic */ SpectaclesEditNameFragment a;

        c(SpectaclesEditNameFragment spectaclesEditNameFragment) {
            this.a = spectaclesEditNameFragment;
        }

        /* JADX WARNING: Removed duplicated region for block: B:27:? A:{SYNTHETIC, RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
        /* JADX WARNING: Missing block: B:14:0x005b, code skipped:
            if (r6 != null) goto L_0x005d;
     */
        /* JADX WARNING: Missing block: B:22:0x008d, code skipped:
            if (r6 != null) goto L_0x005d;
     */
        public final void afterTextChanged(android.text.Editable r6) {
            /*
            r5 = this;
            r0 = "editable";
            defpackage.akcr.b(r6, r0);
            r1 = r5.a;
            r1 = r1.h();
            defpackage.akcr.b(r6, r0);
            r0 = r1.c;
            if (r0 != 0) goto L_0x0017;
        L_0x0012:
            r2 = "deviceEmoji";
            defpackage.akcr.a(r2);
        L_0x0017:
            r6 = r6.toString();
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r0);
            r0 = 32;
            r2.append(r0);
            r0 = r2.toString();
            r2 = r6;
            r2 = (java.lang.CharSequence) r2;
            r3 = android.text.TextUtils.isEmpty(r2);
            r4 = 0;
            if (r3 != 0) goto L_0x003d;
        L_0x0036:
            r6 = defpackage.akgb.b(r6, r0, r4);
            if (r6 == 0) goto L_0x003d;
        L_0x003c:
            r4 = 1;
        L_0x003d:
            r6 = new akfr;
            r6.<init>(r0);
            r3 = "";
            r6 = r6.b(r2, r3);
            if (r4 != 0) goto L_0x0061;
        L_0x004a:
            r6 = r1.getTarget();
            r6 = (defpackage.xme) r6;
            if (r6 == 0) goto L_0x0055;
        L_0x0052:
            r6.a(r0);
        L_0x0055:
            r6 = r1.getTarget();
            r6 = (defpackage.xme) r6;
            if (r6 == 0) goto L_0x0090;
        L_0x005d:
            r6.l();
            goto L_0x0090;
        L_0x0061:
            r2 = defpackage.xpw.a(r6);
            if (r2 == 0) goto L_0x0090;
        L_0x0067:
            r2 = new java.lang.StringBuilder;
            r2.<init>();
            r2.append(r0);
            r0 = 25;
            r6 = defpackage.xpw.a(r6, r0);
            r2.append(r6);
            r6 = r2.toString();
            r0 = r1.getTarget();
            r0 = (defpackage.xme) r0;
            if (r0 == 0) goto L_0x0087;
        L_0x0084:
            r0.a(r6);
        L_0x0087:
            r6 = r1.getTarget();
            r6 = (defpackage.xme) r6;
            if (r6 == 0) goto L_0x0090;
        L_0x008f:
            goto L_0x005d;
        L_0x0090:
            r6 = r1.getTarget();
            r6 = (defpackage.xme) r6;
            if (r6 == 0) goto L_0x009b;
        L_0x0098:
            r6.k();
        L_0x009b:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesEditNameFragment$c.afterTextChanged(android.text.Editable):void");
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            akcr.b(charSequence, "charSequence");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            akcr.b(charSequence, "charSequence");
        }
    }

    static final class d implements OnFocusChangeListener {
        private /* synthetic */ SpectaclesEditNameFragment a;

        d(SpectaclesEditNameFragment spectaclesEditNameFragment) {
            this.a = spectaclesEditNameFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.a.i().toggleSoftInputFromWindow(SpectaclesEditNameFragment.a(this.a).getWindowToken(), 0, 0);
            }
        }
    }

    static final class e extends akcs implements akbk<InputMethodManager> {
        private /* synthetic */ SpectaclesEditNameFragment a;

        e(SpectaclesEditNameFragment spectaclesEditNameFragment) {
            this.a = spectaclesEditNameFragment;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object systemService = this.a.getContext().getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new ajxt("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    static final class f extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesEditNameFragment a;
        private /* synthetic */ String b;

        f(SpectaclesEditNameFragment spectaclesEditNameFragment, String str) {
            this.a = spectaclesEditNameFragment;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesEditNameFragment.a(this.a).setText(this.b);
            Selection.setSelection(SpectaclesEditNameFragment.a(this.a).getText(), SpectaclesEditNameFragment.a(this.a).getText().length());
            return ajxw.a;
        }
    }

    static final class g extends akcs implements akbl<View, ajxw> {
        private /* synthetic */ SpectaclesEditNameFragment a;
        private /* synthetic */ String b;

        g(SpectaclesEditNameFragment spectaclesEditNameFragment, String str) {
            this.a = spectaclesEditNameFragment;
            this.b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akcr.b((View) obj, "it");
            SpectaclesEditNameFragment.a(this.a).setText(this.b);
            Selection.setSelection(SpectaclesEditNameFragment.a(this.a).getText(), SpectaclesEditNameFragment.a(this.a).getText().length());
            return ajxw.a;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesEditNameFragment.class), "keyboardManager", "getKeyboardManager()Landroid/view/inputmethod/InputMethodManager;");
        a aVar = new a();
        acgu a = acgu.a(acis.b, (achg) e, true);
        f = a;
        g = a.j();
    }

    public final void a(String str) {
        akcr.b(str, "name");
        EditText editText = this.h;
        if (editText == null) {
            akcr.a("nameEditText");
        }
        editText.setText(str);
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        SpectaclesEditNamePresenter spectaclesEditNamePresenter = this.b;
        if (spectaclesEditNamePresenter == null) {
            akcr.a("editNamePresenter");
        }
        spectaclesEditNamePresenter.e.a(ajcx.b((Callable) new com.snap.spectacles.lib.fragments.presenters.SpectaclesEditNamePresenter.c(spectaclesEditNamePresenter)).b((ajdw) spectaclesEditNamePresenter.c().f()).e());
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        SpectaclesEditNamePresenter spectaclesEditNamePresenter = this.b;
        if (spectaclesEditNamePresenter == null) {
            akcr.a("editNamePresenter");
        }
        spectaclesEditNamePresenter.e.a();
    }

    public final void b(String str) {
        String str2 = str;
        akcr.b(str2, "name");
        zjm zjm = new zjm(xai.f, "spectacles_naming_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str3 = "navigationHost";
        if (achb == null) {
            akcr.a(str3);
        }
        defpackage.zgy.a a = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.choose_another_name);
        String string = getString(R.string.laguna_confusing_name, str2);
        akcr.a((Object) string, "getString(com.snap.spect…una_confusing_name, name)");
        zgy a2 = a.b(string).a((int) R.string.okay, (akbl) new f(this, str2), true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str3);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    public final SpectaclesEditNamePresenter h() {
        SpectaclesEditNamePresenter spectaclesEditNamePresenter = this.b;
        if (spectaclesEditNamePresenter == null) {
            akcr.a("editNamePresenter");
        }
        return spectaclesEditNamePresenter;
    }

    /* Access modifiers changed, original: final */
    public final InputMethodManager i() {
        return (InputMethodManager) this.k.b();
    }

    public final void j() {
        TextView textView = this.i;
        if (textView == null) {
            akcr.a("saveTextView");
        }
        textView.setOnClickListener(new b(this));
        EditText editText = this.h;
        String str = "nameEditText";
        if (editText == null) {
            akcr.a(str);
        }
        editText.addTextChangedListener(new c(this));
        editText = this.h;
        if (editText == null) {
            akcr.a(str);
        }
        editText.setOnFocusChangeListener(new d(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARNING: Missing block: B:17:0x0049, code skipped:
            if (r0 == null) goto L_0x0074;
     */
    /* JADX WARNING: Missing block: B:29:0x0072, code skipped:
            if (r0 == null) goto L_0x0074;
     */
    public final void k() {
        /*
        r5 = this;
        r0 = r5.b;
        if (r0 != 0) goto L_0x0009;
    L_0x0004:
        r1 = "editNamePresenter";
        defpackage.akcr.a(r1);
    L_0x0009:
        r0 = r0.a();
        r1 = r5.j;
        if (r1 != 0) goto L_0x0016;
    L_0x0011:
        r2 = "saveSpinner";
        defpackage.akcr.a(r2);
    L_0x0016:
        r2 = 8;
        r1.setVisibility(r2);
        r1 = r5.h;
        r3 = "nameEditText";
        if (r1 != 0) goto L_0x0024;
    L_0x0021:
        defpackage.akcr.a(r3);
    L_0x0024:
        r1 = r1.getText();
        r1 = (java.lang.CharSequence) r1;
        r1 = android.text.TextUtils.isEmpty(r1);
        r4 = "saveTextView";
        if (r1 != 0) goto L_0x0070;
    L_0x0032:
        r0 = (java.lang.CharSequence) r0;
        r1 = r5.h;
        if (r1 != 0) goto L_0x003b;
    L_0x0038:
        defpackage.akcr.a(r3);
    L_0x003b:
        r1 = r1.getText();
        r1 = (java.lang.CharSequence) r1;
        r0 = android.text.TextUtils.equals(r0, r1);
        if (r0 == 0) goto L_0x004c;
    L_0x0047:
        r0 = r5.i;
        if (r0 != 0) goto L_0x0077;
    L_0x004b:
        goto L_0x0074;
    L_0x004c:
        r0 = r5.i;
        if (r0 != 0) goto L_0x0053;
    L_0x0050:
        defpackage.akcr.a(r4);
    L_0x0053:
        r1 = 0;
        r0.setVisibility(r1);
        r0 = r5.i;
        if (r0 != 0) goto L_0x005e;
    L_0x005b:
        defpackage.akcr.a(r4);
    L_0x005e:
        r1 = 2131889609; // 0x7f120dc9 float:1.9413886E38 double:1.0532934165E-314;
        r0.setText(r1);
        r0 = r5.i;
        if (r0 != 0) goto L_0x006b;
    L_0x0068:
        defpackage.akcr.a(r4);
    L_0x006b:
        r1 = 1;
        r0.setClickable(r1);
        goto L_0x007a;
    L_0x0070:
        r0 = r5.i;
        if (r0 != 0) goto L_0x0077;
    L_0x0074:
        defpackage.akcr.a(r4);
    L_0x0077:
        r0.setVisibility(r2);
    L_0x007a:
        r0 = r5.h;
        if (r0 != 0) goto L_0x0081;
    L_0x007e:
        defpackage.akcr.a(r3);
    L_0x0081:
        r0.requestFocus();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesEditNameFragment.k():void");
    }

    public final void l() {
        EditText editText = this.h;
        String str = "nameEditText";
        if (editText == null) {
            akcr.a(str);
        }
        Spannable text = editText.getText();
        EditText editText2 = this.h;
        if (editText2 == null) {
            akcr.a(str);
        }
        Selection.setSelection(text, editText2.getText().length());
    }

    public final void m() {
        View view = this.j;
        if (view == null) {
            akcr.a("saveSpinner");
        }
        view.setVisibility(8);
        TextView textView = this.i;
        if (textView == null) {
            akcr.a("saveTextView");
        }
        textView.setVisibility(8);
        InputMethodManager i = i();
        EditText editText = this.h;
        if (editText == null) {
            akcr.a("nameEditText");
        }
        i.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public final void n() {
        TextView textView = this.i;
        String str = "saveTextView";
        if (textView == null) {
            akcr.a(str);
        }
        textView.setText("");
        textView = this.i;
        if (textView == null) {
            akcr.a(str);
        }
        textView.setClickable(false);
        View view = this.j;
        if (view == null) {
            akcr.a("saveSpinner");
        }
        view.setVisibility(0);
    }

    public final void o() {
        SpectaclesEditNamePresenter spectaclesEditNamePresenter = this.b;
        if (spectaclesEditNamePresenter == null) {
            akcr.a("editNamePresenter");
        }
        String a = spectaclesEditNamePresenter.a();
        zjm zjm = new zjm(xai.f, "spectacles_naming_error", false, false, true, false, null, false, false, false, false, null, 4076);
        Context context = getContext();
        achb achb = this.a;
        String str = "navigationHost";
        if (achb == null) {
            akcr.a(str);
        }
        zgy a2 = new defpackage.zgy.a(context, achb, zjm, false, null, 24).a((int) R.string.choose_another_name).b((int) R.string.laguna_name_too_short).a((int) R.string.okay, (akbl) new g(this, a), true).a();
        achb achb2 = this.a;
        if (achb2 == null) {
            akcr.a(str);
        }
        achb2.a((achd) a2, a2.a, null);
    }

    /* JADX WARNING: Missing block: B:6:0x001d, code skipped:
            if (r1 == null) goto L_0x001f;
     */
    public final void onAttach(android.content.Context r4) {
        /*
        r3 = this;
        r0 = "context";
        defpackage.akcr.b(r4, r0);
        super.onAttach(r4);
        r4 = r3.b;
        r0 = "editNamePresenter";
        if (r4 != 0) goto L_0x0011;
    L_0x000e:
        defpackage.akcr.a(r0);
    L_0x0011:
        r1 = r3.getArguments();
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r2 = "ARG_KEY_DEVICE_SERIAL_NUMBER";
        r1 = r1.getString(r2);
        if (r1 != 0) goto L_0x0021;
    L_0x001f:
        r1 = "";
    L_0x0021:
        r2 = "<set-?>";
        defpackage.akcr.b(r1, r2);
        r4.a = r1;
        r4 = r3.b;
        if (r4 != 0) goto L_0x002f;
    L_0x002c:
        defpackage.akcr.a(r0);
    L_0x002f:
        r0 = r3;
        r0 = (defpackage.xme) r0;
        r4.takeTarget(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.spectacles.lib.fragments.SpectaclesEditNameFragment.onAttach(android.content.Context):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(16);
            }
        }
        View inflate = layoutInflater.inflate(R.layout.spectacles_edit_name_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.display_name_settings_save_button);
        if (findViewById != null) {
            this.i = (TextView) findViewById;
            Object findViewById2 = inflate.findViewById(R.id.display_settings_save_progressbar);
            akcr.a(findViewById2, "view.findViewById(R.id.d…ettings_save_progressbar)");
            this.j = findViewById2;
            findViewById = inflate.findViewById(R.id.display_name_settings_field);
            if (findViewById != null) {
                this.h = (EditText) findViewById;
                return inflate;
            }
            throw new ajxt("null cannot be cast to non-null type android.widget.EditText");
        }
        throw new ajxt("null cannot be cast to non-null type android.widget.TextView");
    }

    public final void onDetach() {
        super.onDetach();
        SpectaclesEditNamePresenter spectaclesEditNamePresenter = this.b;
        if (spectaclesEditNamePresenter == null) {
            akcr.a("editNamePresenter");
        }
        spectaclesEditNamePresenter.dropTarget();
    }

    public final void onPause() {
        super.onPause();
        InputMethodManager i = i();
        EditText editText = this.h;
        if (editText == null) {
            akcr.a("nameEditText");
        }
        i.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public final void p() {
        View view = this.j;
        if (view == null) {
            akcr.a("saveSpinner");
        }
        view.setVisibility(8);
        TextView textView = this.i;
        if (textView == null) {
            akcr.a("saveTextView");
        }
        textView.setVisibility(8);
        InputMethodManager i = i();
        EditText editText = this.h;
        if (editText == null) {
            akcr.a("nameEditText");
        }
        i.hideSoftInputFromWindow(editText.getWindowToken(), 0);
        achb achb = this.a;
        if (achb == null) {
            akcr.a("navigationHost");
        }
        achb.a((achg) SpectaclesManageFragment.g, false, false, null);
    }
}
