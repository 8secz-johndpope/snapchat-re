package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.TakeSnapButton;
import com.snapchat.android.R;
import defpackage.tas.a;

/* renamed from: soi */
public class soi extends slm {
    private final tba a;

    soi(Context context) {
        this(new tba(context));
    }

    private soi(tba tba) {
        this.a = tba;
    }

    /* renamed from: A_ */
    public final a j() {
        return new a(-2, -2);
    }

    public final void a(float f) {
        sln.b(this.a, f);
    }

    public final void a(szw szw) {
        tba tba = this.a;
        if (tba.b >= 0) {
            tba.a(tba.b, TakeSnapButton.LONG_PRESS_TIME);
        }
    }

    public final void a_(szw szw) {
        super.a_(szw);
        if (szw.c(skb.l)) {
            if (szw.a(skb.l, false)) {
                this.a.a(50, 0);
                return;
            }
            this.a.a();
        }
    }

    public final void ae_() {
        this.a.o = D();
        srl srl = (srl) this.I.a(sqh.bD);
        if (srl != null) {
            tba tba = this.a;
            tba.i = 12.0f;
            tba.g = -1;
            tba.h = -1;
            tba.n = srl.e.a;
            Context context = tba.getContext();
            tba.j = abso.a(false, MapboxConstants.MINIMUM_ZOOM, context);
            tba.k = abso.a(true, MapboxConstants.MINIMUM_ZOOM, context);
            tba.c = srl.a.c();
            tba.d = srl.a.b();
            tba.e = (int) abso.a(false, srl.b, context);
            tba.f = (int) abso.a(true, srl.c, context);
            tba.l = srl.d;
            tba.b = -1;
            tba.m = true;
            tba.setText(tba.l);
            tba.setTextSize(tba.i);
            tba.setTextColor(tba.g);
            tba.setShadowLayer(1.0f, tba.j, tba.k, tba.h);
            tba.setTypeface(abrz.a(tba.getContext(), tba.n));
            int i = tba.c | tba.d;
            LayoutParams layoutParams = tba.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = i;
                if (tba.c == 3 || tba.c == 5) {
                    layoutParams2.leftMargin = tba.e;
                    layoutParams2.rightMargin = tba.e;
                }
                if (tba.d == 48) {
                    layoutParams2.topMargin = tba.f;
                }
                if (tba.d == 80) {
                    layoutParams2.bottomMargin = tba.f;
                }
            } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
                int i2;
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
                int i3 = 9;
                int i4 = 9;
                while (true) {
                    i2 = 15;
                    if (i4 > 15) {
                        break;
                    }
                    layoutParams3.addRule(i4, 0);
                    i4++;
                }
                if ((i & 3) != 3) {
                    i3 = (i & 5) == 5 ? 11 : 14;
                }
                if ((i & 48) == 48) {
                    i2 = 10;
                } else if ((i & 80) == 80) {
                    i2 = 12;
                }
                layoutParams3.addRule(i3);
                layoutParams3.addRule(i2);
                layoutParams3.leftMargin = tba.e;
                layoutParams3.rightMargin = tba.e;
                layoutParams3.topMargin = tba.f;
                layoutParams3.bottomMargin = tba.f;
            }
            tba.setLayoutParams(layoutParams);
            if (tba.m) {
                if (tba.o != null) {
                    tba.o.a(R.drawable.text_view_background, tba);
                    return;
                }
                tba.setBackgroundResource(R.drawable.text_view_background);
            }
        }
    }

    public final void b() {
        super.b();
        tba tba = this.a;
        if (tba.o != null) {
            tba.o = null;
        } else {
            tba.setBackground(null);
        }
    }

    public final void b(float f) {
        sln.b(this.a, f);
    }

    public final void b(szw szw) {
        this.a.a();
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "TEXT";
    }

    public final boolean h() {
        return true;
    }
}
