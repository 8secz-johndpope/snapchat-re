package com.snap.discover.playback.ui.views;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.hbh;
import defpackage.zit;

public class SubscribedAnimationView extends ViewGroup {
    final zit a;
    private final hbh b;

    public SubscribedAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = new hbh(context);
        addView(this.b);
        this.a = new zit(context);
        addView(this.a);
    }

    public final void a() {
        hbh hbh = this.b;
        hbh.b = SystemClock.elapsedRealtime();
        hbh.invalidate();
        hbh.c = null;
        postDelayed(new Runnable() {
            public final void run() {
                SubscribedAnimationView.this.a.a();
            }
        }, 300);
    }

    public final void a(int i) {
        this.b.a.setColor(i);
        this.a.a.setColor(i);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        i3 -= i;
        i4 -= i2;
        this.a.layout(0, 0, i3, i4);
        int i5 = (int) ((((float) i3) * 0.5454545f) / 2.0f);
        i = (int) ((((float) i4) * 0.5454545f) / 2.0f);
        this.b.layout(i5, i, i3 - i5, i4 - i);
    }
}
