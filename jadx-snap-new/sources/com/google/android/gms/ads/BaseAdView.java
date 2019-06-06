package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.internal.zzaky;
import com.google.android.gms.internal.zzkf;
import com.google.android.gms.internal.zzmw;

class BaseAdView extends ViewGroup {
    protected final zzmw zzalw;

    public BaseAdView(Context context, int i) {
        super(context);
        this.zzalw = new zzmw(this, i);
    }

    public void destroy() {
        this.zzalw.destroy();
    }

    public AdSize getAdSize() {
        return this.zzalw.getAdSize();
    }

    public void loadAd(AdRequest adRequest) {
        this.zzalw.zza(adRequest.zzbe());
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            i3 = ((i3 - i) - measuredWidth) / 2;
            i4 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i3, i4, measuredWidth + i3, measuredHeight + i4);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int heightInPixels;
        int i3 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            AdSize adSize = null;
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzaky.zzb("Unable to retrieve ad size.", e);
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                i3 = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i3 = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i3, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        this.zzalw.pause();
    }

    public void resume() {
        this.zzalw.resume();
    }

    public void setAdListener(AdListener adListener) {
        this.zzalw.setAdListener(adListener);
        if (adListener == null) {
            this.zzalw.zza(null);
            this.zzalw.setAppEventListener(null);
            return;
        }
        if (adListener instanceof zzkf) {
            this.zzalw.zza((zzkf) adListener);
        }
        if (adListener instanceof AppEventListener) {
            this.zzalw.setAppEventListener((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zzalw.setAdSizes(adSize);
    }

    public void setAdUnitId(String str) {
        this.zzalw.setAdUnitId(str);
    }
}
