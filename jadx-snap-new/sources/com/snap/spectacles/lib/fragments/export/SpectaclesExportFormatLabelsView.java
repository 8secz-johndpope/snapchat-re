package com.snap.spectacles.lib.fragments.export;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.ajwo;
import defpackage.ajxe;
import defpackage.ajxh;
import defpackage.ajyw;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdc;
import defpackage.akde;
import defpackage.aken;
import defpackage.iho;
import defpackage.xmc;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class SpectaclesExportFormatLabelsView extends LinearLayout {
    public final Map<Integer, SnapFontTextView> a = new LinkedHashMap();
    public final int b;
    public ajwo<Integer> c;
    public List<xmc> d;
    public int e;
    private final int f;
    private final ajxe g = ajxh.a(b.a);
    private float h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static final class c implements OnClickListener {
        private /* synthetic */ int a;
        private /* synthetic */ SpectaclesExportFormatLabelsView b;
        private /* synthetic */ LayoutInflater c;

        public c(int i, SpectaclesExportFormatLabelsView spectaclesExportFormatLabelsView, LayoutInflater layoutInflater) {
            this.a = i;
            this.b = spectaclesExportFormatLabelsView;
            this.c = layoutInflater;
        }

        public final void onClick(View view) {
            ajwo ajwo = this.b.c;
            if (ajwo != null) {
                ajwo.a(Integer.valueOf(this.a));
            }
        }
    }

    static final class b extends akcs implements akbk<DecelerateInterpolator> {
        public static final b a = new b();

        b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new DecelerateInterpolator();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(SpectaclesExportFormatLabelsView.class), "decelerateInterpolator", "getDecelerateInterpolator()Landroid/view/animation/DecelerateInterpolator;");
        a aVar = new a();
    }

    public SpectaclesExportFormatLabelsView(Context context, AttributeSet attributeSet) {
        String str = "context";
        akcr.b(context, str);
        akcr.b(attributeSet, "attrs");
        super(context, attributeSet, 0);
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.c = ajwo;
        this.d = ajyw.a;
        this.e = -1;
        setGravity(16);
        setPivotX(MapboxConstants.MINIMUM_ZOOM);
        setPivotY(MapboxConstants.MINIMUM_ZOOM);
        this.f = abtp.a(getContext()) >> 1;
        ajwo = getContext();
        akcr.a(ajwo, str);
        this.b = ajwo.getResources().getDimensionPixelSize(R.dimen.default_gap_2x);
    }

    private final DecelerateInterpolator a() {
        return (DecelerateInterpolator) this.g.b();
    }

    private final void a(View view, float f) {
        view.animate().alpha(f).setInterpolator(a()).setDuration(200).start();
    }

    public final void a(int i) {
        SnapFontTextView snapFontTextView = (SnapFontTextView) this.a.get(Integer.valueOf(this.e));
        if (snapFontTextView != null) {
            a(snapFontTextView, 0.35f);
        }
        this.e = i;
        SnapFontTextView snapFontTextView2 = (SnapFontTextView) this.a.get(Integer.valueOf(i));
        if (snapFontTextView2 != null) {
            Rect rect = new Rect();
            View view = snapFontTextView2;
            iho.a(view, rect);
            this.h = (float) (this.f - ((((rect.left - ((int) getTranslationX())) + ((rect.left + rect.width()) - ((int) getTranslationX()))) - this.b) >> 1));
            animate().translationX(this.h).setInterpolator(a()).setDuration(200).start();
            a(view, 1.0f);
        }
    }
}
