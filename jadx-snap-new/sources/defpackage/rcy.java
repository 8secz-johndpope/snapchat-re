package defpackage;

import android.content.Context;
import android.view.View;
import com.mapbox.services.android.telemetry.MapboxEvent;

/* renamed from: rcy */
public final class rcy implements zma {
    private static /* synthetic */ aken[] a = new aken[]{new akdc(akde.a(rcy.class), "contextRef", "getContextRef()Landroid/content/Context;")};
    private final iim b;
    private volatile boolean c;
    private final ajcx d;
    private final ajdp<Long> e;
    private final rbp f;
    private final ajdp<Boolean> g;
    private final ajdp<Boolean> h;

    /* renamed from: rcy$a */
    public static final class a<T1, T2, T3, T4, T5, R> implements ajff<T1, T2, T3, T4, T5, R> {
        private /* synthetic */ rcy a;

        public a(rcy rcy) {
            this.a = rcy;
        }

        public final R a(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            boolean booleanValue = ((Boolean) t5).booleanValue();
            return (((Number) t1).longValue() >= 21 || (!((Boolean) t3).booleanValue() && ((qzi) t2).a == qzf.PHONE_NUMBER_VERIFICATION)) ? znk.a : (((Boolean) t4).booleanValue() && booleanValue) ? znk.a(new rdy(((Context) this.a.b.a(rcy.a[0])), rbl.ADD_FRIENDS)) : znk.a(new rdy(((Context) this.a.b.a(rcy.a[0])), rbl.FIND_FRIENDS));
        }
    }

    public rcy(Context context, ajcx ajcx, ajdp<Long> ajdp, rbp rbp, ajdp<Boolean> ajdp2, ajdp<Boolean> ajdp3) {
        akcr.b(context, "context");
        akcr.b(ajcx, "initialLoadCompletable");
        akcr.b(ajdp, "mutualFriendsCount");
        akcr.b(rbp, "topPromptDataSource");
        akcr.b(ajdp2, "hasPhoneNumberVerified");
        akcr.b(ajdp3, "hasGivenAccessToContacts");
        this.d = ajcx;
        this.e = ajdp;
        this.f = rbp;
        this.g = ajdp2;
        this.h = ajdp3;
        this.b = new iim(context);
    }

    public final void a(View view, zmy zmy) {
        akcr.b(view, "itemView");
        akcr.b(zmy, "viewModel");
    }

    public final void b(View view, zmy zmy) {
        akcr.b(view, "itemView");
        akcr.b(zmy, MapboxEvent.KEY_MODEL);
    }

    public final ajdp<znh<zmy>> c() {
        ajcx ajcx = this.d;
        ajdp a = ajdp.a(this.e, this.f.i, this.f.a, this.g, this.h, new a(this));
        if (a == null) {
            akcr.a();
        }
        Object a2 = ajcx.a((ajdt) a);
        akcr.a(a2, "initialLoadCompletable.andThen(toViewModels())");
        return a2;
    }

    public final void dispose() {
        this.c = true;
    }

    public final boolean isDisposed() {
        return this.c;
    }
}
