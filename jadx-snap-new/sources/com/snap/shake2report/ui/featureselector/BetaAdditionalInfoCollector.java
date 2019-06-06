package com.snap.shake2report.ui.featureselector;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import com.snapchat.android.R;
import defpackage.aily;
import defpackage.ajxt;
import defpackage.ajyi;
import defpackage.akcr;
import defpackage.gpb;
import defpackage.wvj;
import defpackage.wvl;
import defpackage.wwg;
import defpackage.wwh;
import defpackage.zgb;
import java.util.Collection;
import java.util.List;

public final class BetaAdditionalInfoCollector extends wwh {
    private Spinner a;
    private TextView b;
    private List<String> c;
    private wvl d;

    public BetaAdditionalInfoCollector(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private BetaAdditionalInfoCollector(Context context, AttributeSet attributeSet, char c) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
    }

    public final void a(View view, gpb gpb, zgb zgb, wvl wvl) {
        akcr.b(view, "rootView");
        akcr.b(gpb, "userAuthStore");
        akcr.b(zgb, "schedulersProvider");
        String str = "reportConfigProvider";
        akcr.b(wvl, str);
        setVisibility(0);
        this.d = wvl;
        wvl wvl2 = this.d;
        if (wvl2 == null) {
            akcr.a(str);
        }
        if (wvl2.c == aily.IN_SETTING_REPORT) {
            Object findViewById = view.findViewById(R.id.s2r_beta_feature_header_text_view);
            akcr.a(findViewById, "rootView.findViewById(R.…feature_header_text_view)");
            this.b = (TextView) findViewById;
            TextView textView = this.b;
            if (textView == null) {
                akcr.a("headerTextView");
            }
            textView.setText(R.string.s2r_choose_area);
        }
        Object findViewById2 = view.findViewById(R.id.s2r_beta_feature_dropdown);
        akcr.a(findViewById2, "rootView.findViewById(R.…2r_beta_feature_dropdown)");
        this.a = (Spinner) findViewById2;
        str = "context";
        if (wvl.g != null) {
            findViewById2 = getContext();
            akcr.a(findViewById2, str);
            Resources resources = findViewById2.getResources();
            Integer num = wvl.g;
            if (num == null) {
                akcr.a();
            }
            findViewById2 = resources.getStringArray(num.intValue());
            akcr.a(findViewById2, "context.resources.getStr…vider.selectionOptions!!)");
            this.c = ajyi.j(findViewById2);
        }
        List list = this.c;
        String str2 = "featureOptions";
        if (list == null) {
            akcr.a(str2);
        }
        Object string = getResources().getString(R.string.s2r_feature_selector_hint);
        akcr.a(string, "this.resources.getString…2r_feature_selector_hint)");
        list.add(0, string);
        Spinner spinner = this.a;
        String str3 = "spinner";
        if (spinner == null) {
            akcr.a(str3);
        }
        if (spinner == null) {
            akcr.a();
        }
        Object context = getContext();
        akcr.a(context, str);
        List list2 = this.c;
        if (list2 == null) {
            akcr.a(str2);
        }
        Collection collection = list2;
        if (collection != null) {
            Object[] toArray = collection.toArray(new String[0]);
            if (toArray != null) {
                spinner.setAdapter(new wwg(context, (String[]) toArray));
                spinner = this.a;
                if (spinner == null) {
                    akcr.a(str3);
                }
                if (spinner == null) {
                    akcr.a();
                }
                spinner.setSelection(0);
                return;
            }
            throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
    }

    public final boolean a() {
        Spinner spinner = this.a;
        if (spinner == null) {
            akcr.a("spinner");
        }
        if (spinner == null) {
            akcr.a();
        }
        return spinner.getSelectedItemPosition() != 0;
    }

    public final String b() {
        Spinner spinner = this.a;
        if (spinner == null) {
            akcr.a("spinner");
        }
        if (spinner == null) {
            akcr.a();
        }
        int selectedItemPosition = spinner.getSelectedItemPosition();
        if (selectedItemPosition == 0) {
            return null;
        }
        Object obj;
        wvl wvl = this.d;
        String str = "reportConfigProvider";
        if (wvl == null) {
            akcr.a(str);
        }
        if (wvl.c != aily.IN_SETTING_REPORT) {
            wvl = this.d;
            if (wvl == null) {
                akcr.a(str);
            }
            if (wvl.c != aily.IN_GAME) {
                obj = wvj.a.get(selectedItemPosition - 1);
                return (String) obj;
            }
        }
        wvl = this.d;
        if (wvl == null) {
            akcr.a(str);
        }
        if (wvl != null) {
            List list = wvl.h;
            if (list != null) {
                obj = list.get(selectedItemPosition - 1);
                return (String) obj;
            }
        }
        return null;
    }

    public final void c() {
    }
}
