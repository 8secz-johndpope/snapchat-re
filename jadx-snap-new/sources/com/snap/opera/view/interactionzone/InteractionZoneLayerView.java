package com.snap.opera.view.interactionzone;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ItemDecoration;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.State;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.snap.ui.view.SnapFontTextView;
import com.snapchat.android.R;
import defpackage.abtp;
import defpackage.ajxt;
import defpackage.akcr;
import defpackage.tbf;
import defpackage.tbg;
import defpackage.tbh;

public final class InteractionZoneLayerView extends LinearLayout {
    public float a;
    public int b;
    public defpackage.tbg.a c;
    public Integer d;
    public tbf e;
    public SnapFontTextView f;
    public SnapFontTextView g;
    public RecyclerView h;
    public ImageView i;
    public a j;
    public Drawable k;
    private LinearLayoutManager l;

    public static final class a extends ItemDecoration {
        public int a;

        private a() {
            this.a = 0;
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, State state) {
            akcr.b(rect, "outRect");
            akcr.b(view, "view");
            akcr.b(recyclerView, "parent");
            akcr.b(state, "state");
            super.getItemOffsets(rect, view, recyclerView, state);
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                akcr.a();
            }
            if (layoutManager.getPosition(view) == 0) {
                rect.left = this.a;
            }
            int i = this.a;
            rect.right = i;
            rect.bottom = i;
            rect.top = i;
        }
    }

    public static final class b extends OnScrollListener {
        private /* synthetic */ InteractionZoneLayerView a;
        private /* synthetic */ PagerSnapHelper b;

        b(InteractionZoneLayerView interactionZoneLayerView, PagerSnapHelper pagerSnapHelper) {
            this.a = interactionZoneLayerView;
            this.b = pagerSnapHelper;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            akcr.b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                PagerSnapHelper pagerSnapHelper = this.b;
                LayoutManager layoutManager = recyclerView.getLayoutManager();
                if (layoutManager == null) {
                    akcr.a();
                }
                Object findSnapView = pagerSnapHelper.findSnapView(layoutManager);
                if (findSnapView != null) {
                    akcr.a(findSnapView, "snapHelper.findSnapView(…ayoutManager!!) ?: return");
                    ViewHolder childViewHolder = recyclerView.getChildViewHolder(findSnapView);
                    if (childViewHolder != null) {
                        tbh tbh = ((tbg) childViewHolder).h;
                        if (tbh != null) {
                            Integer num = this.a.d;
                            int i2 = tbh.a;
                            if (num == null || num.intValue() != i2) {
                                this.a.d = Integer.valueOf(tbh.a);
                                defpackage.tbg.a aVar = this.a.c;
                                if (aVar != null) {
                                    aVar.a(tbh);
                                    return;
                                }
                            }
                        }
                        return;
                    }
                    throw new ajxt("null cannot be cast to non-null type com.snap.opera.view.interactionzone.InteractionZoneItemViewHolder");
                }
            }
        }
    }

    public InteractionZoneLayerView(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        this(context, attributeSet, (byte) 0);
    }

    private InteractionZoneLayerView(Context context, AttributeSet attributeSet, byte b) {
        akcr.b(context, "context");
        super(context, attributeSet, 0);
        this.b = abtp.a(context);
        int i = this.b;
        double d = (double) i;
        Double.isNaN(d);
        int i2 = (int) (d * 0.4d);
        setLayoutParams(new LayoutParams(i, i2));
        this.a = (float) i2;
    }

    public final void a() {
        Object translationY = animate().translationY(this.a);
        akcr.a(translationY, "animate().translationY(initialTranslationY)");
        translationY.setDuration(300);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onFinishInflate() {
        super.onFinishInflate();
        Object findViewById = findViewById(R.id.swipe_arrow_image_view);
        akcr.a(findViewById, "findViewById(R.id.swipe_arrow_image_view)");
        this.i = (ImageView) findViewById;
        Object from = LayoutInflater.from(getContext());
        akcr.a(from, "LayoutInflater.from(context)");
        this.e = new tbf(from);
        this.j = new a();
        this.l = new LinearLayoutManager(getContext(), 0, false);
        findViewById = findViewById(R.id.recycler_view);
        akcr.a(findViewById, "findViewById(R.id.recycler_view)");
        this.h = (RecyclerView) findViewById;
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        RecyclerView recyclerView = this.h;
        String str = "recyclerView";
        if (recyclerView == null) {
            akcr.a(str);
        }
        pagerSnapHelper.attachToRecyclerView(recyclerView);
        recyclerView = this.h;
        if (recyclerView == null) {
            akcr.a(str);
        }
        tbf tbf = this.e;
        if (tbf == null) {
            akcr.a("itemAdapter");
        }
        recyclerView.setAdapter(tbf);
        LinearLayoutManager linearLayoutManager = this.l;
        if (linearLayoutManager == null) {
            akcr.a("linearLayoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        a aVar = this.j;
        if (aVar == null) {
            akcr.a("itemDecoration");
        }
        recyclerView.addItemDecoration(aVar);
        recyclerView.addOnScrollListener(new b(this, pagerSnapHelper));
        findViewById = findViewById(R.id.headline);
        akcr.a(findViewById, "findViewById(R.id.headline)");
        this.f = (SnapFontTextView) findViewById;
        String str2 = "headlineTextView";
        if (this.f == null) {
            akcr.a(str2);
        }
        SnapFontTextView snapFontTextView = this.f;
        if (snapFontTextView == null) {
            akcr.a(str2);
        }
        double d = (double) this.b;
        Double.isNaN(d);
        snapFontTextView.setMaxWidth((int) (d * 0.7d));
        findViewById = findViewById(R.id.ad_slug);
        akcr.a(findViewById, "findViewById(R.id.ad_slug)");
        this.g = (SnapFontTextView) findViewById;
        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.interaction_zone_list_background);
        if (drawable == null) {
            akcr.a();
        }
        this.k = drawable;
    }
}
