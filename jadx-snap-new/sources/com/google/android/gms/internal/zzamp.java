package com.google.android.gms.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.os.Build.VERSION;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import com.google.android.gms.ads.internal.zzbt;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@zzabh
@TargetApi(14)
public final class zzamp extends zzamz implements OnBufferingUpdateListener, OnCompletionListener, OnErrorListener, OnInfoListener, OnPreparedListener, OnVideoSizeChangedListener, SurfaceTextureListener {
    private static final Map<Integer, String> zzdkj = new HashMap();
    private final zzano zzdkk;
    private final boolean zzdkl;
    private int zzdkm = 0;
    private int zzdkn = 0;
    private MediaPlayer zzdko;
    private Uri zzdkp;
    private int zzdkq;
    private int zzdkr;
    private int zzdks;
    private int zzdkt;
    private int zzdku;
    private zzanl zzdkv;
    private boolean zzdkw;
    private int zzdkx;
    private zzamy zzdky;

    static {
        if (VERSION.SDK_INT >= 17) {
            zzdkj.put(Integer.valueOf(-1004), "MEDIA_ERROR_IO");
            zzdkj.put(Integer.valueOf(-1007), "MEDIA_ERROR_MALFORMED");
            zzdkj.put(Integer.valueOf(-1010), "MEDIA_ERROR_UNSUPPORTED");
            zzdkj.put(Integer.valueOf(-110), "MEDIA_ERROR_TIMED_OUT");
            zzdkj.put(Integer.valueOf(3), "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        zzdkj.put(Integer.valueOf(100), "MEDIA_ERROR_SERVER_DIED");
        zzdkj.put(Integer.valueOf(1), "MEDIA_ERROR_UNKNOWN");
        zzdkj.put(Integer.valueOf(1), "MEDIA_INFO_UNKNOWN");
        zzdkj.put(Integer.valueOf(700), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        zzdkj.put(Integer.valueOf(701), "MEDIA_INFO_BUFFERING_START");
        zzdkj.put(Integer.valueOf(702), "MEDIA_INFO_BUFFERING_END");
        zzdkj.put(Integer.valueOf(800), "MEDIA_INFO_BAD_INTERLEAVING");
        zzdkj.put(Integer.valueOf(801), "MEDIA_INFO_NOT_SEEKABLE");
        zzdkj.put(Integer.valueOf(802), "MEDIA_INFO_METADATA_UPDATE");
        if (VERSION.SDK_INT >= 19) {
            zzdkj.put(Integer.valueOf(901), "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            zzdkj.put(Integer.valueOf(902), "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzamp(Context context, boolean z, boolean z2, zzanm zzanm, zzano zzano) {
        super(context);
        setSurfaceTextureListener(this);
        this.zzdkk = zzano;
        this.zzdkw = z;
        this.zzdkl = z2;
        this.zzdkk.zza(this);
    }

    private final void zza(float f) {
        MediaPlayer mediaPlayer = this.zzdko;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzaky.zzcz("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void zzaf(int i) {
        if (i == 3) {
            this.zzdkk.zzto();
            this.zzdlf.zzto();
        } else if (this.zzdkm == 3) {
            this.zzdkk.zztp();
            this.zzdlf.zztp();
        }
        this.zzdkm = i;
    }

    private final void zzaf(boolean z) {
        zzahw.v("AdMediaPlayerView release");
        zzanl zzanl = this.zzdkv;
        if (zzanl != null) {
            zzanl.zztc();
            this.zzdkv = null;
        }
        MediaPlayer mediaPlayer = this.zzdko;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.zzdko.release();
            this.zzdko = null;
            zzaf(0);
            if (z) {
                this.zzdkn = 0;
                this.zzdkn = 0;
            }
        }
    }

    private final void zzsk() {
        zzahw.v("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (!(this.zzdkp == null || surfaceTexture == null)) {
            zzaf(false);
            try {
                zzbt.zzfb();
                this.zzdko = new MediaPlayer();
                this.zzdko.setOnBufferingUpdateListener(this);
                this.zzdko.setOnCompletionListener(this);
                this.zzdko.setOnErrorListener(this);
                this.zzdko.setOnInfoListener(this);
                this.zzdko.setOnPreparedListener(this);
                this.zzdko.setOnVideoSizeChangedListener(this);
                this.zzdks = 0;
                if (this.zzdkw) {
                    this.zzdkv = new zzanl(getContext());
                    this.zzdkv.zza(surfaceTexture, getWidth(), getHeight());
                    this.zzdkv.start();
                    SurfaceTexture zztd = this.zzdkv.zztd();
                    if (zztd != null) {
                        surfaceTexture = zztd;
                    } else {
                        this.zzdkv.zztc();
                        this.zzdkv = null;
                    }
                }
                this.zzdko.setDataSource(getContext(), this.zzdkp);
                zzbt.zzfc();
                this.zzdko.setSurface(new Surface(surfaceTexture));
                this.zzdko.setAudioStreamType(3);
                this.zzdko.setScreenOnWhilePlaying(true);
                this.zzdko.prepareAsync();
                zzaf(1);
            } catch (IOException | IllegalArgumentException | IllegalStateException e) {
                String valueOf = String.valueOf(this.zzdkp);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Failed to initialize MediaPlayer at ");
                stringBuilder.append(valueOf);
                zzaky.zzc(stringBuilder.toString(), e);
                onError(this.zzdko, 1, 0);
            }
        }
    }

    private final void zzsl() {
        if (this.zzdkl && zzsm() && this.zzdko.getCurrentPosition() > 0 && this.zzdkn != 3) {
            zzahw.v("AdMediaPlayerView nudging MediaPlayer");
            zza((float) MapboxConstants.MINIMUM_ZOOM);
            this.zzdko.start();
            int currentPosition = this.zzdko.getCurrentPosition();
            long currentTimeMillis = zzbt.zzes().currentTimeMillis();
            while (zzsm() && this.zzdko.getCurrentPosition() == currentPosition) {
                if (zzbt.zzes().currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.zzdko.pause();
            zzsn();
        }
    }

    private final boolean zzsm() {
        if (this.zzdko != null) {
            int i = this.zzdkm;
            if (!(i == -1 || i == 0 || i == 1)) {
                return true;
            }
        }
        return false;
    }

    public final int getCurrentPosition() {
        return zzsm() ? this.zzdko.getCurrentPosition() : 0;
    }

    public final int getDuration() {
        return zzsm() ? this.zzdko.getDuration() : -1;
    }

    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.zzdko;
        return mediaPlayer != null ? mediaPlayer.getVideoHeight() : 0;
    }

    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.zzdko;
        return mediaPlayer != null ? mediaPlayer.getVideoWidth() : 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.zzdks = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzahw.v("AdMediaPlayerView completion");
        zzaf(5);
        this.zzdkn = 5;
        zzaij.zzdfn.post(new zzamr(this));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzdkj.get(Integer.valueOf(i));
        String str2 = (String) zzdkj.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 38) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer error: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzaky.zzcz(stringBuilder.toString());
        zzaf(-1);
        this.zzdkn = -1;
        zzaij.zzdfn.post(new zzams(this, str, str2));
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        String str = (String) zzdkj.get(Integer.valueOf(i));
        String str2 = (String) zzdkj.get(Integer.valueOf(i2));
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 37) + String.valueOf(str2).length());
        stringBuilder.append("AdMediaPlayerView MediaPlayer info: ");
        stringBuilder.append(str);
        stringBuilder.append(":");
        stringBuilder.append(str2);
        zzahw.v(stringBuilder.toString());
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Missing block: B:47:0x009d, code skipped:
            if (r7 != r1) goto L_0x009f;
     */
    public final void onMeasure(int r6, int r7) {
        /*
        r5 = this;
        r0 = r5.zzdkq;
        r0 = getDefaultSize(r0, r6);
        r1 = r5.zzdkr;
        r1 = getDefaultSize(r1, r7);
        r2 = r5.zzdkq;
        if (r2 <= 0) goto L_0x0082;
    L_0x0010:
        r2 = r5.zzdkr;
        if (r2 <= 0) goto L_0x0082;
    L_0x0014:
        r2 = r5.zzdkv;
        if (r2 != 0) goto L_0x0082;
    L_0x0018:
        r0 = android.view.View.MeasureSpec.getMode(r6);
        r6 = android.view.View.MeasureSpec.getSize(r6);
        r1 = android.view.View.MeasureSpec.getMode(r7);
        r7 = android.view.View.MeasureSpec.getSize(r7);
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r2) goto L_0x0046;
    L_0x002c:
        if (r1 != r2) goto L_0x0046;
    L_0x002e:
        r0 = r5.zzdkq;
        r1 = r0 * r7;
        r2 = r5.zzdkr;
        r3 = r6 * r2;
        if (r1 >= r3) goto L_0x003c;
    L_0x0038:
        r0 = r0 * r7;
        r0 = r0 / r2;
        r1 = r7;
        goto L_0x0082;
    L_0x003c:
        r1 = r0 * r7;
        r3 = r6 * r2;
        if (r1 <= r3) goto L_0x0065;
    L_0x0042:
        r2 = r2 * r6;
        r1 = r2 / r0;
        goto L_0x0083;
    L_0x0046:
        r3 = -2147483648; // 0xffffffff80000000 float:-0.0 double:NaN;
        if (r0 != r2) goto L_0x0057;
    L_0x004a:
        r0 = r5.zzdkr;
        r0 = r0 * r6;
        r2 = r5.zzdkq;
        r0 = r0 / r2;
        if (r1 != r3) goto L_0x0055;
    L_0x0052:
        if (r0 <= r7) goto L_0x0055;
    L_0x0054:
        goto L_0x0063;
    L_0x0055:
        r1 = r0;
        goto L_0x0083;
    L_0x0057:
        if (r1 != r2) goto L_0x0067;
    L_0x0059:
        r1 = r5.zzdkq;
        r1 = r1 * r7;
        r2 = r5.zzdkr;
        r1 = r1 / r2;
        if (r0 != r3) goto L_0x0064;
    L_0x0061:
        if (r1 <= r6) goto L_0x0064;
    L_0x0063:
        goto L_0x0065;
    L_0x0064:
        r6 = r1;
    L_0x0065:
        r1 = r7;
        goto L_0x0083;
    L_0x0067:
        r2 = r5.zzdkq;
        r4 = r5.zzdkr;
        if (r1 != r3) goto L_0x0073;
    L_0x006d:
        if (r4 <= r7) goto L_0x0073;
    L_0x006f:
        r2 = r2 * r7;
        r2 = r2 / r4;
        r1 = r7;
        goto L_0x0074;
    L_0x0073:
        r1 = r4;
    L_0x0074:
        if (r0 != r3) goto L_0x0080;
    L_0x0076:
        if (r2 <= r6) goto L_0x0080;
    L_0x0078:
        r7 = r5.zzdkr;
        r7 = r7 * r6;
        r0 = r5.zzdkq;
        r1 = r7 / r0;
        goto L_0x0083;
    L_0x0080:
        r6 = r2;
        goto L_0x0083;
    L_0x0082:
        r6 = r0;
    L_0x0083:
        r5.setMeasuredDimension(r6, r1);
        r7 = r5.zzdkv;
        if (r7 == 0) goto L_0x008d;
    L_0x008a:
        r7.zzh(r6, r1);
    L_0x008d:
        r7 = android.os.Build.VERSION.SDK_INT;
        r0 = 16;
        if (r7 != r0) goto L_0x00a6;
    L_0x0093:
        r7 = r5.zzdkt;
        if (r7 <= 0) goto L_0x0099;
    L_0x0097:
        if (r7 != r6) goto L_0x009f;
    L_0x0099:
        r7 = r5.zzdku;
        if (r7 <= 0) goto L_0x00a2;
    L_0x009d:
        if (r7 == r1) goto L_0x00a2;
    L_0x009f:
        r5.zzsl();
    L_0x00a2:
        r5.zzdkt = r6;
        r5.zzdku = r1;
    L_0x00a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzamp.onMeasure(int, int):void");
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzahw.v("AdMediaPlayerView prepared");
        zzaf(2);
        this.zzdkk.zzsp();
        zzaij.zzdfn.post(new zzamq(this));
        this.zzdkq = mediaPlayer.getVideoWidth();
        this.zzdkr = mediaPlayer.getVideoHeight();
        int i = this.zzdkx;
        if (i != 0) {
            seekTo(i);
        }
        zzsl();
        i = this.zzdkq;
        int i2 = this.zzdkr;
        StringBuilder stringBuilder = new StringBuilder(62);
        stringBuilder.append("AdMediaPlayerView stream dimensions: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        zzaky.zzcy(stringBuilder.toString());
        if (this.zzdkn == 3) {
            play();
        }
        zzsn();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzahw.v("AdMediaPlayerView surface created");
        zzsk();
        zzaij.zzdfn.post(new zzamt(this));
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzahw.v("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.zzdko;
        if (mediaPlayer != null && this.zzdkx == 0) {
            this.zzdkx = mediaPlayer.getCurrentPosition();
        }
        zzanl zzanl = this.zzdkv;
        if (zzanl != null) {
            zzanl.zztc();
        }
        zzaij.zzdfn.post(new zzamv(this));
        zzaf(true);
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzahw.v("AdMediaPlayerView surface changed");
        Object obj = 1;
        Object obj2 = this.zzdkn == 3 ? 1 : null;
        if (!(this.zzdkq == i && this.zzdkr == i2)) {
            obj = null;
        }
        if (!(this.zzdko == null || obj2 == null || obj == null)) {
            int i3 = this.zzdkx;
            if (i3 != 0) {
                seekTo(i3);
            }
            play();
        }
        zzanl zzanl = this.zzdkv;
        if (zzanl != null) {
            zzanl.zzh(i, i2);
        }
        zzaij.zzdfn.post(new zzamu(this, i, i2));
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzdkk.zzb(this);
        this.zzdle.zza(surfaceTexture, this.zzdky);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder(57);
        stringBuilder.append("AdMediaPlayerView size changed: ");
        stringBuilder.append(i);
        stringBuilder.append(" x ");
        stringBuilder.append(i2);
        zzahw.v(stringBuilder.toString());
        this.zzdkq = mediaPlayer.getVideoWidth();
        this.zzdkr = mediaPlayer.getVideoHeight();
        if (this.zzdkq != 0 && this.zzdkr != 0) {
            requestLayout();
        }
    }

    public final void pause() {
        zzahw.v("AdMediaPlayerView pause");
        if (zzsm() && this.zzdko.isPlaying()) {
            this.zzdko.pause();
            zzaf(4);
            zzaij.zzdfn.post(new zzamx(this));
        }
        this.zzdkn = 4;
    }

    public final void play() {
        zzahw.v("AdMediaPlayerView play");
        if (zzsm()) {
            this.zzdko.start();
            zzaf(3);
            this.zzdle.zzsq();
            zzaij.zzdfn.post(new zzamw(this));
        }
        this.zzdkn = 3;
    }

    public final void seekTo(int i) {
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("AdMediaPlayerView seek ");
        stringBuilder.append(i);
        zzahw.v(stringBuilder.toString());
        if (zzsm()) {
            this.zzdko.seekTo(i);
            this.zzdkx = 0;
            return;
        }
        this.zzdkx = i;
    }

    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzin zzd = zzin.zzd(parse);
        if (zzd != null) {
            parse = Uri.parse(zzd.url);
        }
        this.zzdkp = parse;
        this.zzdkx = 0;
        zzsk();
        requestLayout();
        invalidate();
    }

    public final void stop() {
        zzahw.v("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.zzdko;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.zzdko.release();
            this.zzdko = null;
            zzaf(0);
            this.zzdkn = 0;
        }
        this.zzdkk.onStop();
    }

    public final String toString() {
        String name = getClass().getName();
        String toHexString = Integer.toHexString(hashCode());
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 1) + String.valueOf(toHexString).length());
        stringBuilder.append(name);
        stringBuilder.append("@");
        stringBuilder.append(toHexString);
        return stringBuilder.toString();
    }

    public final void zza(float f, float f2) {
        zzanl zzanl = this.zzdkv;
        if (zzanl != null) {
            zzanl.zzb(f, f2);
        }
    }

    public final void zza(zzamy zzamy) {
        this.zzdky = zzamy;
    }

    public final String zzsj() {
        String str = this.zzdkw ? " spherical" : "";
        String str2 = "MediaPlayer";
        return str.length() != 0 ? str2.concat(str) : new String(str2);
    }

    public final void zzsn() {
        zza(this.zzdlf.getVolume());
    }
}
