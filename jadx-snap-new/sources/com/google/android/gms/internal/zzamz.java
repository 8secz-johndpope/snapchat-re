package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@zzabh
@TargetApi(14)
public abstract class zzamz extends TextureView implements zzanr {
    protected final zzang zzdle = new zzang();
    protected final zzanq zzdlf;

    public zzamz(Context context) {
        super(context);
        this.zzdlf = new zzanq(context, this);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setVideoPath(String str);

    public abstract void stop();

    public abstract void zza(float f, float f2);

    public abstract void zza(zzamy zzamy);

    public abstract String zzsj();

    public abstract void zzsn();
}
