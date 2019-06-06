package com.snap.bitmoji.ui.avatar.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.snap.bitmoji.ui.avatar.presenter.GenderPickerPresenter;
import com.snap.taskexecution.scoping.recipes.ScopedFragment;
import com.snap.taskexecution.scoping.recipes.ScopedFragment.b;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.acih;
import defpackage.aipx;
import defpackage.ajfb;
import defpackage.akcr;
import defpackage.dgf;
import defpackage.dgg;
import defpackage.dgj;
import defpackage.zjq;
import defpackage.zkq;

public class GenderPickerFragment extends MainPageFragment implements dgj, zjq {
    public GenderPickerPresenter a;
    public zkq b;
    private View c;
    private View d;
    private View e;
    private View f;
    private View g;
    private View h;
    private View i;
    private dgf j;
    private final int k = R.layout.bitmoji_gender_picker;

    static final class a<T> implements ajfb<Rect> {
        private /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            View view = this.a;
            view.setPadding(view.getPaddingLeft(), rect.top, this.a.getPaddingRight(), this.a.getPaddingBottom());
        }
    }

    public final long S_() {
        return dgg.a;
    }

    public final View a() {
        View view = this.c;
        if (view == null) {
            akcr.a("femaleButton");
        }
        return view;
    }

    public final void a(acih acih) {
        super.a(acih);
        if (acih instanceof dgf) {
            dgf dgf = (dgf) acih;
            akcr.b(dgf, "<set-?>");
            this.j = dgf;
        }
    }

    public final View b() {
        View view = this.f;
        if (view == null) {
            akcr.a("maleButton");
        }
        return view;
    }

    public final View d() {
        View view = this.i;
        if (view == null) {
            akcr.a("exitButton");
        }
        return view;
    }

    public final dgf e() {
        dgf dgf = this.j;
        if (dgf == null) {
            akcr.a("genderPickerNavigablePayload");
        }
        return dgf;
    }

    public int f() {
        return R.layout.bitmoji_gender_picker;
    }

    public void onAttach(Context context) {
        akcr.b(context, "context");
        aipx.a(this);
        super.onAttach(context);
        GenderPickerPresenter genderPickerPresenter = this.a;
        if (genderPickerPresenter == null) {
            akcr.a("presenter");
        }
        genderPickerPresenter.takeTarget((dgj) this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        Object inflate = layoutInflater.inflate(f(), viewGroup, false);
        akcr.a(inflate, "inflater.inflate(rootLayout, container, false)");
        Object findViewById = inflate.findViewById(R.id.female_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.female_button)");
        String str = "<set-?>";
        akcr.b(findViewById, str);
        this.c = findViewById;
        findViewById = inflate.findViewById(R.id.female_image);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.female_image)");
        this.d = findViewById;
        findViewById = inflate.findViewById(R.id.female_background);
        akcr.a(findViewById, "fragmentLayout.findViewB…d(R.id.female_background)");
        this.e = findViewById;
        findViewById = inflate.findViewById(R.id.male_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.male_button)");
        akcr.b(findViewById, str);
        this.f = findViewById;
        findViewById = inflate.findViewById(R.id.male_image);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.male_image)");
        this.g = findViewById;
        findViewById = inflate.findViewById(R.id.male_background);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.male_background)");
        this.h = findViewById;
        findViewById = inflate.findViewById(R.id.exit_button);
        akcr.a(findViewById, "fragmentLayout.findViewById(R.id.exit_button)");
        akcr.b(findViewById, str);
        this.i = findViewById;
        return inflate;
    }

    public void onDetach() {
        super.onDetach();
        GenderPickerPresenter genderPickerPresenter = this.a;
        if (genderPickerPresenter == null) {
            akcr.a("presenter");
        }
        genderPickerPresenter.dropTarget();
    }

    public void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        zkq zkq = this.b;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        ScopedFragment.a((ScopedFragment) this, zkq.a().f((ajfb) new a(view)), (ScopedFragment) this, b.ON_DESTROY_VIEW);
    }
}
