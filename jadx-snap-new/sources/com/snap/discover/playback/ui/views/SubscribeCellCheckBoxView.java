package com.snap.discover.playback.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.R;
import com.snapchat.android.framework.misc.AppContext;
import com.snapchat.android.framework.ui.views.LoadingSpinnerView;

public class SubscribeCellCheckBoxView extends FrameLayout {
    static final int a = AppContext.get().getResources().getDimensionPixelSize(R.dimen.stories_subscribe_control_button_height);
    private View b;
    private LoadingSpinnerView c;
    private ImageView d;
    private ImageView e;
    private TextView f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private a r;

    /* renamed from: com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a.CHECKED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a.UNCHECKING;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a.UNCHECKED;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a.CHECKING;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView$AnonymousClass2.<clinit>():void");
        }
    }

    public enum a {
        CHECKED,
        UNCHECKING,
        UNCHECKED,
        CHECKING
    }

    public SubscribeCellCheckBoxView(Context context, AttributeSet attributeSet) {
        System.currentTimeMillis();
        this(context, attributeSet, (byte) 0);
    }

    private SubscribeCellCheckBoxView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet);
        this.k = R.drawable.stories_subscribe_flag;
        this.l = R.drawable.stories_subscribe_flag;
        this.m = R.drawable.subscribe_cell_checkbox_selector;
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.subscribe_cell_checkbox_layout, this);
        this.b = findViewById(R.id.subscribe_checkbox_inner_container);
        this.b.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                i5 = ((SubscribeCellCheckBoxView.a - i4) + i2) / 2;
                if (i5 >= 0) {
                    ((View) view.getParent()).setTouchDelegate(new TouchDelegate(new Rect(i, i2 - i5, i3, i4 + i5), view));
                }
            }
        });
        this.c = (LoadingSpinnerView) findViewById(R.id.subscribe_action_loading_progress_bar);
        this.d = (ImageView) findViewById(R.id.subscribe_checkbox_checked_icon);
        this.e = (ImageView) findViewById(R.id.subscribe_checkbox_unchecked_icon);
        this.f = (TextView) findViewById(R.id.subscribe_checkbox_button);
        this.i = ContextCompat.getColor(getContext(), R.color.white);
        this.j = ContextCompat.getColor(getContext(), R.color.regular_purple);
        this.q = ContextCompat.getColor(getContext(), R.color.regular_purple_thirty_opacity);
        this.r = a.UNCHECKED;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.gvy.a.b);
        try {
            this.g = obtainStyledAttributes.getString(8);
            this.h = obtainStyledAttributes.getString(5);
            this.k = obtainStyledAttributes.getResourceId(4, this.k);
            this.d.setImageResource(this.k);
            this.l = obtainStyledAttributes.getResourceId(7, this.l);
            this.e.setImageResource(this.l);
            this.m = obtainStyledAttributes.getResourceId(0, this.m);
            this.b.setBackgroundResource(this.m);
            this.i = obtainStyledAttributes.getColor(3, this.i);
            this.j = obtainStyledAttributes.getColor(6, this.j);
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            this.n = (int) TypedValue.applyDimension(2, 14.0f, displayMetrics);
            this.n = obtainStyledAttributes.getDimensionPixelSize(2, this.n);
            this.f.setTextSize(0, (float) this.n);
            this.o = (int) TypedValue.applyDimension(1, 12.0f, displayMetrics);
            this.o = obtainStyledAttributes.getDimensionPixelSize(1, this.o);
            this.d.setLayoutParams(new LayoutParams(this.o, this.o));
            this.e.setLayoutParams(new LayoutParams(this.o, this.o));
            this.c.setLayoutParams(new LayoutParams(this.o, this.o));
            this.p = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final a a() {
        return this.r;
    }

    public final void a(int i, int i2, int i3) {
        this.i = i;
        this.j = i2;
        this.q = i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00af  */
    public final void a(com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a r9) {
        /*
        r8 = this;
        r8.r = r9;
        r0 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.AnonymousClass2.a;
        r1 = r9.ordinal();
        r0 = r0[r1];
        r1 = 4;
        r2 = 3;
        r3 = 2;
        r4 = 1;
        r5 = 8;
        r6 = 0;
        if (r0 == r4) goto L_0x007b;
    L_0x0013:
        if (r0 == r3) goto L_0x0064;
    L_0x0015:
        if (r0 == r2) goto L_0x0037;
    L_0x0017:
        if (r0 == r1) goto L_0x001b;
    L_0x0019:
        goto L_0x00a7;
    L_0x001b:
        r0 = r8.b;
        r0.setVisibility(r6);
        r0 = r8.c;
        r7 = r8.j;
        r0.a(r7);
        r0 = r8.c;
        r0.setVisibility(r6);
        r0 = r8.d;
        r0.setVisibility(r5);
        r0 = r8.e;
        r0.setVisibility(r5);
        goto L_0x0052;
    L_0x0037:
        r0 = r8.b;
        r0.setVisibility(r6);
        r0 = r8.c;
        r0.setVisibility(r5);
        r0 = r8.d;
        r0.setVisibility(r5);
        r0 = r8.e;
        r0.setVisibility(r6);
        r0 = r8.e;
        r5 = r8.j;
        r0.setColorFilter(r5);
    L_0x0052:
        r0 = r8.f;
        r5 = r8.g;
        r0.setText(r5);
        r0 = r8.f;
        r5 = r8.j;
        r0.setTextColor(r5);
        r8.setSelected(r6);
        goto L_0x00a7;
    L_0x0064:
        r0 = r8.b;
        r0.setVisibility(r6);
        r0 = r8.c;
        r7 = r8.i;
        r0.a(r7);
        r0 = r8.c;
        r0.setVisibility(r6);
        r0 = r8.d;
        r0.setVisibility(r5);
        goto L_0x0091;
    L_0x007b:
        r0 = r8.b;
        r0.setVisibility(r6);
        r0 = r8.c;
        r0.setVisibility(r5);
        r0 = r8.d;
        r0.setVisibility(r6);
        r0 = r8.d;
        r7 = r8.i;
        r0.setColorFilter(r7);
    L_0x0091:
        r0 = r8.e;
        r0.setVisibility(r5);
        r0 = r8.f;
        r5 = r8.h;
        r0.setText(r5);
        r0 = r8.f;
        r5 = r8.i;
        r0.setTextColor(r5);
        r8.setSelected(r4);
    L_0x00a7:
        r0 = r8.b;
        r0 = r0.getBackground();
        if (r0 == 0) goto L_0x00e2;
    L_0x00af:
        r0 = r8.b;
        r0 = r0.getBackground();
        r0 = r0.getCurrent();
        r5 = r0 instanceof android.graphics.drawable.GradientDrawable;
        if (r5 == 0) goto L_0x00e2;
    L_0x00bd:
        r0 = (android.graphics.drawable.GradientDrawable) r0;
        r5 = com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.AnonymousClass2.a;
        r9 = r9.ordinal();
        r9 = r5[r9];
        if (r9 == r4) goto L_0x00dd;
    L_0x00c9:
        if (r9 == r3) goto L_0x00dd;
    L_0x00cb:
        if (r9 == r2) goto L_0x00d0;
    L_0x00cd:
        if (r9 == r1) goto L_0x00d0;
    L_0x00cf:
        goto L_0x00e2;
    L_0x00d0:
        r9 = r8.i;
        r0.setColor(r9);
        r9 = r8.p;
        r1 = r8.q;
        r0.setStroke(r9, r1);
        goto L_0x00e2;
    L_0x00dd:
        r9 = r8.j;
        r0.setColor(r9);
    L_0x00e2:
        r8.setVisibility(r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView.a(com.snap.discover.playback.ui.views.SubscribeCellCheckBoxView$a):void");
    }
}
