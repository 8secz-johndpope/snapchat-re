package defpackage;

import android.content.Context;
import com.snapchat.android.R;

/* renamed from: tbj */
public final class tbj {
    public final int a;
    public final int b;
    private final int c;

    public tbj(Context context) {
        akcr.b(context, "context");
        this.a = abtp.a(context);
        this.b = context.getResources().getDimensionPixelOffset(R.dimen.interaction_zone_item_card_round_corner_radius);
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.interaction_zone_item_unrounded_card_padding);
    }

    public final int a(spw spw) {
        int i = tbk.d[spw.ordinal()];
        double d = 0.032d;
        if (i != 1) {
            if (i == 2) {
                d = 0.021d;
            } else if (i != 3) {
                if (i == 4) {
                    d = 0.026d;
                } else {
                    throw new ajxk();
                }
            }
        }
        double d2 = (double) this.a;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }

    public final int b(spw spw) {
        double d = tbk.e[spw.ordinal()] != 1 ? 0.0d : 0.04d;
        double d2 = (double) this.a;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }

    public final int c(spw spw) {
        int i = tbk.f[spw.ordinal()];
        double d = (i == 1 || i == 2) ? 0.026d : 0.0d;
        double d2 = (double) this.a;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }

    public final int d(spw spw) {
        int i = tbk.h[spw.ordinal()];
        if (i == 1) {
            return this.c;
        }
        if (i != 2) {
            return 0;
        }
        double d = (double) this.a;
        Double.isNaN(d);
        return (int) (d * 0.032d);
    }

    public final int e(spw spw) {
        int i = tbk.j[spw.ordinal()];
        double d = i != 1 ? i != 2 ? 0.253d : 0.28d : 0.274d;
        double d2 = (double) this.a;
        Double.isNaN(d2);
        return (int) (d2 * d);
    }
}
