package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

@TargetApi(19)
public class zzaiy extends zzaiw {
    public final boolean isAttachedToWindow(View view) {
        return view.isAttachedToWindow();
    }

    public final LayoutParams zzrj() {
        return new LayoutParams(-1, -1);
    }
}
