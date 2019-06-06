package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzahw;
import com.google.android.gms.internal.zzajc;
import com.google.android.gms.internal.zzakn;
import com.google.android.gms.internal.zzaof;
import java.util.ArrayList;

public final class zzbv extends ViewSwitcher {
    private final zzajc zzavj;
    private final zzakn zzavk;
    private boolean zzavl = true;

    public zzbv(Context context, String str, String str2, OnGlobalLayoutListener onGlobalLayoutListener, OnScrollChangedListener onScrollChangedListener) {
        super(context);
        this.zzavj = new zzajc(context);
        this.zzavj.setAdUnitId(str);
        this.zzavj.zzcq(str2);
        if (context instanceof Activity) {
            this.zzavk = new zzakn((Activity) context, this, onGlobalLayoutListener, onScrollChangedListener);
        } else {
            this.zzavk = new zzakn(null, this, onGlobalLayoutListener, onScrollChangedListener);
        }
        this.zzavk.zzrv();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zzakn zzakn = this.zzavk;
        if (zzakn != null) {
            zzakn.onAttachedToWindow();
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zzakn zzakn = this.zzavk;
        if (zzakn != null) {
            zzakn.onDetachedFromWindow();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.zzavl) {
            this.zzavj.zze(motionEvent);
        }
        return false;
    }

    public final void removeAllViews() {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof zzaof)) {
                arrayList.add((zzaof) childAt);
            }
        }
        super.removeAllViews();
        arrayList = arrayList;
        i = arrayList.size();
        while (i2 < i) {
            Object obj = arrayList.get(i2);
            i2++;
            ((zzaof) obj).destroy();
        }
    }

    public final zzajc zzfr() {
        return this.zzavj;
    }

    public final void zzfs() {
        zzahw.v("Disable position monitoring on adFrame.");
        zzakn zzakn = this.zzavk;
        if (zzakn != null) {
            zzakn.zzrw();
        }
    }

    public final void zzft() {
        zzahw.v("Enable debug gesture detector on adFrame.");
        this.zzavl = true;
    }

    public final void zzfu() {
        zzahw.v("Disable debug gesture detector on adFrame.");
        this.zzavl = false;
    }
}
