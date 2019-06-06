package com.snap.opera.view.subscriptions;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;
import defpackage.tcn;
import defpackage.tcp;

public class SubscribeButtonView extends FrameLayout {
    public final FrameLayout a;
    public final ImageView b;
    public final LoadingSpinnerView c;
    public final Context d;
    OnClickListener e;
    public tcp f;
    public int g;
    public tcn h;
    public int i;
    public int j;
    public String k;
    public String l;
    private final ImageView m;
    private final TextView n;
    private final GradientDrawable o;
    private final Drawable p;
    private final Drawable q;
    private final OnClickListener r;

    /* renamed from: com.snap.opera.view.subscriptions.SubscribeButtonView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[b.a().length];
        static final /* synthetic */ int[] b = new int[tcn.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0047 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0043 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Missing block: B:27:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.tcn.values();
            r0 = r0.length;
            r0 = new int[r0];
            b = r0;
            r0 = 1;
            r1 = b;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = defpackage.tcn.LONGFORM_VIDEO_END;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = r2.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r1 = 2;
            r2 = b;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = defpackage.tcn.ARTICLE_END;	 Catch:{ NoSuchFieldError -> 0x001f }
            r3 = r3.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r2 = 3;
            r3 = b;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = defpackage.tcn.SEARCH_CARD;	 Catch:{ NoSuchFieldError -> 0x002a }
            r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r3 = 4;
            r4 = b;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = defpackage.tcn.MINI_PROFILE;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            r4 = com.snap.opera.view.subscriptions.SubscribeButtonView.b.a();
            r4 = r4.length;
            r4 = new int[r4];
            a = r4;
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0043 }
            r5 = 0;
            r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x0043 }
        L_0x0043:
            r4 = a;	 Catch:{ NoSuchFieldError -> 0x0047 }
            r4[r0] = r1;	 Catch:{ NoSuchFieldError -> 0x0047 }
        L_0x0047:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x004f }
            r0[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x004f }
        L_0x004f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.view.subscriptions.SubscribeButtonView$AnonymousClass2.<clinit>():void");
        }
    }

    public static class a {
        public int a;
        public int b;
        public tcn c;
        public int d;
        public tcp e = this;
        public String f;
        public String g;
    }

    public enum b {
        ;

        static {
            a = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    public SubscribeButtonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private SubscribeButtonView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        this.p = getResources().getDrawable(R.drawable.stories_subscribe_check);
        this.q = getResources().getDrawable(R.drawable.stories_subscribe_flag);
        this.g = 1;
        this.h = tcn.MINI_PROFILE;
        this.i = -1;
        this.j = -16777216;
        this.r = new OnClickListener() {
            public final void onClick(View view) {
                if (SubscribeButtonView.this.g == 1) {
                    SubscribeButtonView.this.b();
                    SubscribeButtonView.this.f.a();
                } else if (SubscribeButtonView.this.g == 2) {
                    SubscribeButtonView.this.c();
                    SubscribeButtonView.this.f.b();
                }
                if (SubscribeButtonView.this.e != null) {
                    SubscribeButtonView.this.e.onClick(view);
                }
            }
        };
        inflate(context, R.layout.subscribe_button, this);
        this.d = context;
        super.setOnClickListener(this.r);
        this.m = (ImageView) findViewById(R.id.subscribe_button_border_and_fill);
        this.o = (GradientDrawable) this.m.getBackground();
        this.a = (FrameLayout) findViewById(R.id.subscribe_button_icon_holder);
        this.b = (ImageView) findViewById(R.id.subscribe_button_icon);
        this.c = (LoadingSpinnerView) findViewById(R.id.subscribe_button_loading);
        this.n = (TextView) findViewById(R.id.subscribe_button_text);
    }

    private void e() {
        this.n.setText(this.k);
        this.b.setImageDrawable(this.q);
        h();
        int i = AnonymousClass2.b[this.h.ordinal()];
        if (i == 1) {
            a(-1, 1.0f);
            b(-1);
            c(-1);
            i = -16777216;
        } else if (i != 2) {
            if (i == 3) {
                a(this.i, 0.3f);
                b(this.i);
                c(this.i);
                a(-1);
            }
            invalidate();
            this.g = 1;
        } else {
            a(this.j, 1.0f);
            b(this.j);
            c(this.j);
            i = this.i;
        }
        a(i);
        invalidate();
        this.g = 1;
    }

    private void f() {
        this.n.setText(this.l);
        this.b.setImageDrawable(this.p);
        h();
        int i = AnonymousClass2.b[this.h.ordinal()];
        if (i == 1) {
            b(-16777216);
            c(-16777216);
            a(-1);
        } else if (i == 2) {
            b(this.i);
            c(this.i);
            a(this.j);
        } else if (i == 3) {
            b(-1);
            c(-1);
            a(this.i);
            a(this.i, 1.0f);
        }
        invalidate();
        this.g = 2;
    }

    private int g() {
        Resources resources;
        int i;
        if (this.h == tcn.SEARCH_CARD) {
            resources = this.d.getResources();
            i = R.dimen.subscribe_button_border_stroke_search_card;
        } else {
            resources = this.d.getResources();
            i = R.dimen.subscribe_button_border_stroke;
        }
        return (int) resources.getDimension(i);
    }

    private void h() {
        this.b.setVisibility(0);
        this.c.setVisibility(8);
    }

    private void i() {
        this.c.setVisibility(0);
        this.b.setVisibility(8);
    }

    public final void a() {
        int i = AnonymousClass2.a[this.g - 1];
        if (i == 1) {
            e();
        } else if (i == 2) {
            f();
        } else if (i != 3) {
            if (i == 4) {
                c();
            }
        } else {
            b();
        }
    }

    public final void a(float f) {
        this.o.setCornerRadius(f);
    }

    public final void a(int i) {
        this.o.setColor(i);
    }

    public final void a(int i, float f) {
        this.m.setAlpha(f);
        this.o.setStroke(g(), i);
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        LoadingSpinnerView loadingSpinnerView;
        int i;
        i();
        if (this.h == tcn.SEARCH_CARD) {
            loadingSpinnerView = this.c;
            i = this.i;
        } else if (this.h == tcn.MINI_PROFILE) {
            loadingSpinnerView = this.c;
            i = -1;
        } else {
            loadingSpinnerView = this.c;
            i = this.j;
        }
        loadingSpinnerView.a(i);
        this.n.setText(this.k);
        invalidate();
        this.g = 3;
    }

    public final void b(float f) {
        this.n.setTextSize(0, f);
    }

    public final void b(int i) {
        this.n.setTextColor(i);
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        LoadingSpinnerView loadingSpinnerView;
        int i;
        i();
        if (this.h == tcn.MINI_PROFILE || this.h == tcn.SEARCH_CARD) {
            loadingSpinnerView = this.c;
            i = -1;
        } else {
            loadingSpinnerView = this.c;
            i = this.i;
        }
        loadingSpinnerView.a(i);
        this.n.setText(this.l);
        invalidate();
        this.g = 4;
    }

    public final void c(int i) {
        this.b.clearColorFilter();
        this.b.setColorFilter(i, Mode.SRC_IN);
    }

    public final int d() {
        return ContextCompat.getColor(this.d, R.color.regular_purple);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        setAlpha(z ? 1.0f : 0.5f);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.e = onClickListener;
    }
}
