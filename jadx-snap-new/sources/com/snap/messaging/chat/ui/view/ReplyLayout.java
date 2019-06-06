package com.snap.messaging.chat.ui.view;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.snap.ui.view.LoadingSpinnerView;
import com.snapchat.android.R;
import defpackage.ajxt;
import defpackage.ajxw;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.qho;
import defpackage.qhp;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ReplyLayout extends ViewGroup {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final int b = getResources().getDimensionPixelOffset(R.dimen.chat_story_reply_height);
    private final int c = getResources().getDimensionPixelOffset(R.dimen.default_gap_half);
    private final int d = getResources().getDimensionPixelOffset(R.dimen.chat_item_loading_spinner_size);
    private boolean e;
    private int f;
    private VideoCapableThumbnailView g;
    private View h;
    private LoadingSpinnerView i;
    private akbl<? super View, ajxw> j;
    private akbl<? super View, Boolean> k;

    public static final class a extends MarginLayoutParams {
        public a() {
            super(-2, -2);
        }

        public a(Context context, AttributeSet attributeSet) {
            akcr.b(context, "c");
            super(context, attributeSet);
        }

        public a(LayoutParams layoutParams) {
            akcr.b(layoutParams, "source");
            super(layoutParams);
        }
    }

    public ReplyLayout(Context context, AttributeSet attributeSet) {
        akcr.b(context, "context");
        super(context, attributeSet);
    }

    private final void c() {
        VideoCapableThumbnailView videoCapableThumbnailView = this.g;
        if (videoCapableThumbnailView == null) {
            akcr.a("mediaView");
        }
        akbl akbl = this.j;
        if (akbl != null) {
            akbl = new qho(akbl);
        }
        videoCapableThumbnailView.setOnClickListener((OnClickListener) akbl);
        akbl = this.k;
        if (akbl != null) {
            akbl = new qhp(akbl);
        }
        videoCapableThumbnailView.setOnLongClickListener((OnLongClickListener) akbl);
        View view = this.h;
        if (view == null) {
            akcr.a("replyBackgroundView");
        }
        view.setOnClickListener(null);
        akbl = this.k;
        if (akbl != null) {
            akbl = new qhp(akbl);
        }
        view.setOnLongClickListener((OnLongClickListener) akbl);
    }

    private final boolean d() {
        Object context = getContext();
        akcr.a(context, "context");
        context = context.getResources();
        akcr.a(context, "context.resources");
        Configuration configuration = context.getConfiguration();
        return configuration != null && configuration.getLayoutDirection() == 1;
    }

    public final VideoCapableThumbnailView a() {
        VideoCapableThumbnailView videoCapableThumbnailView = this.g;
        if (videoCapableThumbnailView == null) {
            akcr.a("mediaView");
        }
        return videoCapableThumbnailView;
    }

    public final void a(akbl<? super View, ajxw> akbl, akbl<? super View, Boolean> akbl2) {
        this.j = akbl;
        this.k = akbl2;
        if (this.a.get()) {
            c();
        }
    }

    public final void a(boolean z) {
        this.e = z;
        String str = "replyBackgroundView";
        String str2 = "mediaView";
        VideoCapableThumbnailView videoCapableThumbnailView;
        View view;
        if (z) {
            b();
            videoCapableThumbnailView = this.g;
            if (videoCapableThumbnailView == null) {
                akcr.a(str2);
            }
            videoCapableThumbnailView.setVisibility(0);
            videoCapableThumbnailView = this.g;
            if (videoCapableThumbnailView == null) {
                akcr.a(str2);
            }
            videoCapableThumbnailView.l = ScaleType.CENTER_CROP;
            view = this.h;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(0);
            return;
        }
        if (this.a.get()) {
            videoCapableThumbnailView = this.g;
            if (videoCapableThumbnailView == null) {
                akcr.a(str2);
            }
            videoCapableThumbnailView.setVisibility(8);
            view = this.h;
            if (view == null) {
                akcr.a(str);
            }
            view.setVisibility(8);
        }
    }

    public final void b() {
        if (this.a.compareAndSet(false, true)) {
            Context context = getContext();
            akcr.a((Object) context, "context");
            this.g = new VideoCapableThumbnailView(context, null, 6);
            VideoCapableThumbnailView videoCapableThumbnailView = this.g;
            String str = "mediaView";
            if (videoCapableThumbnailView == null) {
                akcr.a(str);
            }
            videoCapableThumbnailView.e = false;
            this.h = new View(getContext());
            this.i = new LoadingSpinnerView(getContext());
            LoadingSpinnerView loadingSpinnerView = this.i;
            String str2 = "loadingSpinnerView";
            if (loadingSpinnerView == null) {
                akcr.a(str2);
            }
            loadingSpinnerView.setVisibility(8);
            View view = this.h;
            String str3 = "replyBackgroundView";
            if (view == null) {
                akcr.a(str3);
            }
            view.setBackgroundColor(getResources().getColor(R.color.white_ninety_opacity));
            videoCapableThumbnailView = this.g;
            if (videoCapableThumbnailView == null) {
                akcr.a(str);
            }
            addView(videoCapableThumbnailView, 0);
            loadingSpinnerView = this.i;
            if (loadingSpinnerView == null) {
                akcr.a(str2);
            }
            addView(loadingSpinnerView, 1);
            view = this.h;
            if (view == null) {
                akcr.a(str3);
            }
            addView(view, 2);
            this.f = 3;
            c();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean checkLayoutParams(LayoutParams layoutParams) {
        akcr.b(layoutParams, Tags.CAPTION);
        return layoutParams instanceof a;
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        akcr.b(attributeSet, "attrs");
        Object context = getContext();
        akcr.a(context, "context");
        return new a(context, attributeSet);
    }

    /* Access modifiers changed, original: protected|final */
    public final LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        akcr.b(layoutParams, Tags.CAPTION);
        return new a(layoutParams);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:84:0x018c in {6, 9, 10, 13, 16, 17, 20, 23, 26, 29, 32, 35, 38, 41, 44, 45, 58, 61, 62, 64, 65, 74, 77, 78, 80, 81, 83} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    protected final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
        r7 = this;
        r8 = r7.e;
        r9 = 0;
        if (r8 == 0) goto L_0x00c8;
        r8 = r7.d();
        r10 = "replyBackgroundView";
        r0 = "mediaView";
        if (r8 == 0) goto L_0x002d;
        r8 = r7.g;
        if (r8 != 0) goto L_0x0016;
        defpackage.akcr.a(r0);
        r8 = r8.getMeasuredWidth();
        r8 = r11 - r8;
        r1 = r7.h;
        if (r1 != 0) goto L_0x0023;
        defpackage.akcr.a(r10);
        r1 = r1.getMeasuredWidth();
        r1 = r11 - r1;
        r2 = r11;
        r3 = r1;
        r1 = r2;
        goto L_0x0047;
        r8 = r7.g;
        if (r8 != 0) goto L_0x0034;
        defpackage.akcr.a(r0);
        r8 = r8.getMeasuredWidth();
        r1 = r7.h;
        if (r1 != 0) goto L_0x003f;
        defpackage.akcr.a(r10);
        r1 = r1.getMeasuredWidth();
        r2 = r1;
        r3 = 0;
        r1 = r8;
        r8 = 0;
        r4 = r7.g;
        if (r4 != 0) goto L_0x004e;
        defpackage.akcr.a(r0);
        r5 = r7.g;
        if (r5 != 0) goto L_0x0055;
        defpackage.akcr.a(r0);
        r5 = r5.getMeasuredHeight();
        r4.layout(r8, r9, r1, r5);
        r8 = r7.h;
        if (r8 != 0) goto L_0x0063;
        defpackage.akcr.a(r10);
        r1 = r7.b;
        r4 = r7.h;
        if (r4 != 0) goto L_0x006c;
        defpackage.akcr.a(r10);
        r10 = r4.getMeasuredHeight();
        r10 = r10 + r1;
        r8.layout(r3, r1, r2, r10);
        r8 = r7.i;
        if (r8 != 0) goto L_0x007d;
        r10 = "loadingSpinnerView";
        defpackage.akcr.a(r10);
        r10 = r7.g;
        if (r10 != 0) goto L_0x0084;
        defpackage.akcr.a(r0);
        r10 = r10.getMeasuredWidth();
        r10 = r10 / 2;
        r1 = r7.d;
        r1 = r1 / 2;
        r10 = r10 - r1;
        r1 = r7.g;
        if (r1 != 0) goto L_0x0096;
        defpackage.akcr.a(r0);
        r1 = r1.getMeasuredHeight();
        r1 = r1 / 2;
        r2 = r7.d;
        r2 = r2 / 2;
        r1 = r1 - r2;
        r2 = r7.g;
        if (r2 != 0) goto L_0x00a8;
        defpackage.akcr.a(r0);
        r2 = r2.getMeasuredWidth();
        r2 = r2 / 2;
        r3 = r7.d;
        r3 = r3 / 2;
        r2 = r2 + r3;
        r3 = r7.g;
        if (r3 != 0) goto L_0x00ba;
        defpackage.akcr.a(r0);
        r0 = r3.getMeasuredHeight();
        r0 = r0 / 2;
        r3 = r7.d;
        r3 = r3 / 2;
        r0 = r0 + r3;
        r8.layout(r10, r1, r2, r0);
        r8 = r7.getLayoutParams();
        r10 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams";
        if (r8 == 0) goto L_0x0186;
        r8 = (android.view.ViewGroup.MarginLayoutParams) r8;
        r8 = r8.bottomMargin;
        r12 = r12 - r8;
        r8 = r7.d();
        r0 = 3;
        r1 = "child";
        if (r8 == 0) goto L_0x0133;
        r8 = r7.f;
        r9 = r7.getChildCount();
        if (r8 >= r9) goto L_0x0132;
        r2 = r7.getChildAt(r8);
        defpackage.akcr.a(r2, r1);
        r3 = r2.getLayoutParams();
        if (r3 == 0) goto L_0x012c;
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        r4 = r3.rightMargin;
        r11 = r11 - r4;
        r4 = r2.getMeasuredWidth();
        r4 = r11 - r4;
        r5 = r3.leftMargin;
        r4 = r4 - r5;
        r5 = r3.bottomMargin;
        r5 = r12 - r5;
        r6 = r2.getMeasuredHeight();
        r6 = r5 - r6;
        r3 = r3.topMargin;
        r6 = r6 - r3;
        r3 = r7.e;
        if (r3 == 0) goto L_0x0124;
        r3 = r7.c;
        r5 = r5 - r3;
        r6 = r6 - r3;
        if (r8 != r0) goto L_0x0119;
        r11 = r11 - r3;
        r3 = r7.getChildCount();
        r3 = r3 + -1;
        if (r8 != r3) goto L_0x0124;
        r3 = r7.c;
        r4 = r4 - r3;
        r3 = r11;
        r11 = r4;
        r2.layout(r11, r6, r3, r5);
        r8 = r8 + 1;
        goto L_0x00e4;
        r8 = new ajxt;
        r8.<init>(r10);
        throw r8;
        return;
        r8 = r7.f;
        r11 = r7.getChildCount();
        if (r8 >= r11) goto L_0x0185;
        r2 = r7.getChildAt(r8);
        defpackage.akcr.a(r2, r1);
        r3 = r2.getLayoutParams();
        if (r3 == 0) goto L_0x017f;
        r3 = (android.view.ViewGroup.MarginLayoutParams) r3;
        r4 = r3.leftMargin;
        r9 = r9 + r4;
        r4 = r2.getMeasuredWidth();
        r4 = r4 + r9;
        r5 = r3.rightMargin;
        r4 = r4 + r5;
        r5 = r3.bottomMargin;
        r5 = r12 - r5;
        r6 = r2.getMeasuredHeight();
        r6 = r5 - r6;
        r3 = r3.topMargin;
        r6 = r6 - r3;
        r3 = r7.e;
        if (r3 == 0) goto L_0x0178;
        r3 = r7.c;
        r5 = r5 - r3;
        r6 = r6 - r3;
        if (r8 != r0) goto L_0x016d;
        r9 = r9 + r3;
        r3 = r7.getChildCount();
        r3 = r3 + -1;
        if (r8 != r3) goto L_0x0178;
        r3 = r7.c;
        r4 = r4 + r3;
        r2.layout(r9, r6, r4, r5);
        r8 = r8 + 1;
        r9 = r4;
        goto L_0x0139;
        r8 = new ajxt;
        r8.<init>(r10);
        throw r8;
        return;
        r8 = new ajxt;
        r8.<init>(r10);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.messaging.chat.ui.view.ReplyLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        int i3 = this.f;
        int childCount = getChildCount();
        int i4 = 0;
        while (i3 < childCount) {
            Object childAt = getChildAt(i3);
            akcr.a(childAt, "child");
            Object layoutParams = childAt.getLayoutParams();
            akcr.a(layoutParams, "child.layoutParams");
            int i5 = (layoutParams.width == -1 && this.e) ? i - (this.c << 1) : i;
            measureChild(childAt, i5, i2);
            LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                i4 = Math.max(i4, (childAt.getMeasuredHeight() + marginLayoutParams.bottomMargin) + marginLayoutParams.topMargin);
                i3++;
            } else {
                throw new ajxt("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        if (this.e) {
            i4 += this.b + (this.c << 1);
            VideoCapableThumbnailView videoCapableThumbnailView = this.g;
            if (videoCapableThumbnailView == null) {
                akcr.a("mediaView");
            }
            videoCapableThumbnailView.measure(i, MeasureSpec.makeMeasureSpec(i4, AudioPlayer.INFINITY_LOOP_COUNT));
            View view = this.h;
            if (view == null) {
                akcr.a("replyBackgroundView");
            }
            view.measure(i, MeasureSpec.makeMeasureSpec(i4 - this.b, AudioPlayer.INFINITY_LOOP_COUNT));
            LoadingSpinnerView loadingSpinnerView = this.i;
            if (loadingSpinnerView == null) {
                akcr.a("loadingSpinnerView");
            }
            loadingSpinnerView.measure(MeasureSpec.makeMeasureSpec(this.d, AudioPlayer.INFINITY_LOOP_COUNT), MeasureSpec.makeMeasureSpec(this.d, AudioPlayer.INFINITY_LOOP_COUNT));
        }
        setMeasuredDimension(MeasureSpec.getSize(i), i4);
    }
}
