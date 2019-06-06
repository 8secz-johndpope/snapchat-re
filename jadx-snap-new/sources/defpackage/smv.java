package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snapchat.android.R;
import defpackage.tck.a;

@Deprecated
/* renamed from: smv */
public class smv extends snl {
    private final ViewGroup a;
    private final View b;
    private final View c;
    private final View d;
    private final View e;
    private final View f;
    private final Drawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    private String k;
    private String l;
    private tcn m;
    private boolean n;

    /* renamed from: smv$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.tck.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.tck.a.SUBSCRIBED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.tck.a.SUBSCRIBING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.tck.a.UNSUBSCRIBING;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.tck.a.NOT_SUBSCRIBED;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.smv$1.<clinit>():void");
        }
    }

    smv(Context context) {
        this((ViewGroup) View.inflate(context, R.layout.action_menu_button_view_layout, null), (float) abtp.a(context));
    }

    private smv(ViewGroup viewGroup, float f) {
        super(f);
        this.a = viewGroup;
        this.b = viewGroup.findViewById(R.id.subscribe_clickable);
        this.c = viewGroup.findViewById(R.id.subscribe_button_icon_view);
        this.d = viewGroup.findViewById(R.id.frame);
        this.e = viewGroup.findViewById(R.id.subscribe_text);
        this.f = viewGroup.findViewById(R.id.action_menu_button_icon_view);
        Resources resources = viewGroup.getResources();
        this.g = resources.getDrawable(R.drawable.subscribe_empty_bookmark);
        this.h = resources.getDrawable(R.drawable.subscribe_filled_bookmark);
        this.i = resources.getDimensionPixelSize(R.dimen.action_menu_icon_size_small);
        this.j = resources.getDimensionPixelSize(R.dimen.action_menu_icon_size);
    }

    private /* synthetic */ void b(View view) {
        Object obj;
        String str;
        sqh sqh = this.H;
        int i = 1.a[((a) sqh.a(sqp.b, (Enum) a.NOT_SUBSCRIBED)).ordinal()];
        Object obj2 = null;
        if (i == 1 || i == 2) {
            obj2 = tco.UNSUBSCRIBE;
            this.c.setBackground(this.g);
            obj = a.NOT_SUBSCRIBED;
            str = "unsubscribe_button_clicked";
        } else if (i == 3 || i == 4) {
            obj2 = tco.SUBSCRIBE;
            this.c.setBackground(this.h);
            obj = a.SUBSCRIBED;
            str = "subscribe_button_clicked";
        } else {
            obj = null;
            str = obj;
        }
        sqh.b(sqp.b, obj);
        szw szw = new szw();
        szw.b(skj.ai, this.k);
        szw.b(skj.aj, this.l);
        szw.b(skj.al, this.m);
        szw.b(skj.ak, obj2);
        C().a(str, this.H, szw);
        ae_();
    }

    /* renamed from: A_ */
    public final tas.a j() {
        tas.a aVar = new tas.a(-2, (int) this.a.getContext().getResources().getDimension(R.dimen.action_menu_button_height));
        aVar.gravity = 8388661;
        return aVar;
    }

    public final void a(sqh sqh, szw szw) {
        super.a(sqh, szw);
        ahwz ahwz = (ahwz) sqh.a(sqp.a);
        if (ahwz == null) {
            ahwz = ahwz.UNRECOGNIZED_VALUE;
        }
        this.k = (String) sqh.a(sqh.ae);
        this.l = ahwz.a();
        this.m = (tcn) sqh.a(sqh.ag);
        boolean a = sqh.a(sqh.cD, false);
        this.n = sqh.a(sqh.cE, false);
        if (ahwz != ahwz.UNRECOGNIZED_VALUE || a) {
            int i;
            this.b.setVisibility(0);
            if (sqh.a(sqh.cF, true)) {
                this.d.setVisibility(8);
                this.e.setVisibility(8);
                i = this.j;
            } else {
                this.d.setVisibility(0);
                this.e.setVisibility(0);
                i = this.i;
            }
            this.c.getLayoutParams().height = i;
            this.c.getLayoutParams().width = i;
            this.c.requestLayout();
            a aVar = (a) sqh.a(sqp.b, (Enum) a.NOT_SUBSCRIBED);
            if (!this.n && (aVar == a.SUBSCRIBED || aVar == a.SUBSCRIBING)) {
                this.b.setVisibility(8);
            }
            int i2 = 1.a[aVar.ordinal()];
            Drawable drawable = (i2 == 1 || i2 == 2) ? this.h : (i2 == 3 || i2 == 4) ? this.g : null;
            this.c.setBackground(drawable);
            return;
        }
        this.b.setVisibility(8);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(boolean z) {
        View view;
        OnClickListener -__lambda_smv_cce3i7dw2amun1oz_ogzt_ihtb0;
        if (z) {
            this.b.setOnClickListener(new -$$Lambda$smv$R-2vTISCK4sjkMPJGYGPO87YCWE(this));
            view = this.f;
            -__lambda_smv_cce3i7dw2amun1oz_ogzt_ihtb0 = new -$$Lambda$smv$CcE3i7dw2aMUn1oz_Ogzt_iHtb0(this);
        } else {
            -__lambda_smv_cce3i7dw2amun1oz_ogzt_ihtb0 = null;
            this.b.setOnClickListener(null);
            view = this.f;
        }
        view.setOnClickListener(-__lambda_smv_cce3i7dw2amun1oz_ogzt_ihtb0);
    }

    public final void a_(szw szw) {
        super.a_(szw);
        if (szw.c(skb.n)) {
            this.a.animate().translationY(((Float) szw.c(skb.n, Float.valueOf(MapboxConstants.MINIMUM_ZOOM))).floatValue()).setDuration(300);
        }
    }

    public final View e() {
        return this.a;
    }

    public final String f() {
        return "ACTION_MENU_BUTTON";
    }
}
