package com.snap.opera.shared.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.VideoView;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import defpackage.aaun;
import defpackage.abnb;
import defpackage.abqy;
import defpackage.abvl;
import defpackage.abyh;
import defpackage.acaz;
import defpackage.acaz.b;
import defpackage.acaz.c;
import defpackage.acaz.d;
import defpackage.acaz.e;
import defpackage.acaz.f;
import defpackage.acaz.g;
import defpackage.acaz.h;
import defpackage.acaz.i;
import defpackage.koj;
import defpackage.kom;
import defpackage.kor;
import defpackage.kox;
import defpackage.kpc;
import defpackage.kpf;
import defpackage.sjd;
import defpackage.sra;
import defpackage.sxe;
import defpackage.sxf;
import defpackage.sxr;
import defpackage.syu;
import defpackage.szp;
import defpackage.taf;
import defpackage.tag;
import defpackage.tbo;
import java.io.IOException;
import java.util.Map;

public class TextureVideoView extends TextureView implements MediaPlayerControl, defpackage.tag.a, tbo {
    private MediaController A;
    private f B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private ViewGroup H;
    private int I;
    private abnb J;
    private final kpc K;
    private kom L;
    private boolean M;
    private syu N;
    private abqy O;
    private final abvl P;
    private i Q;
    private final b R;
    private final h S;
    private final e T;
    private final c U;
    private final defpackage.acaz.a V;
    private final g W;
    int a;
    private final d aa;
    private final SurfaceTextureListener ab;
    int b;
    acaz c;
    protected int d;
    protected int e;
    protected Surface f;
    b g;
    h h;
    defpackage.acaz.a i;
    public g j;
    i k;
    int l;
    c m;
    e n;
    public d o;
    int p;
    public boolean q;
    public final taf r;
    public String s;
    public sjd t;
    private Uri u;
    private Map<String, String> v;
    private final Runnable w;
    private int x;
    private int y;
    private a z;

    /* renamed from: com.snap.opera.shared.view.TextureVideoView$2 */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[defpackage.szu.a.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.szu.a.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.szu.a.EXOPLAYER;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.szu.a.EXOPLAYER_AND_STREAM_DECRYPTION;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.szu.a.MEDIA_PLAYER;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.opera.shared.view.TextureVideoView$AnonymousClass2.<clinit>():void");
        }
    }

    class a {
        final acaz a;
        final Surface b;

        a(acaz acaz, Surface surface) {
            this.a = acaz;
            this.b = surface;
        }

        /* Access modifiers changed, original: final */
        public final void a() {
            Surface surface = this.b;
            if (surface != null) {
                surface.release();
            }
        }
    }

    public TextureVideoView(Context context) {
        super(context);
        this.w = new -$$Lambda$TextureVideoView$AriCzjSyMnQQHydMhfULK7DnsCs(this);
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.y = 0;
        this.F = true;
        this.G = false;
        this.q = true;
        this.r = new taf();
        this.s = "";
        this.P = new abvl();
        this.Q = new i() {
            public final void b(acaz acaz, int i, int i2) {
                int i3 = TextureVideoView.this.d;
                int i4 = TextureVideoView.this.e;
                TextureVideoView.this.a(acaz);
                if (TextureVideoView.this.k != null) {
                    TextureVideoView.this.k.b(acaz, i, i2);
                }
                if (TextureVideoView.this.d != 0 && TextureVideoView.this.e != 0) {
                    SurfaceTexture surfaceTexture = TextureVideoView.this.getSurfaceTexture();
                    if (surfaceTexture != null) {
                        surfaceTexture.setDefaultBufferSize(TextureVideoView.this.d, TextureVideoView.this.e);
                    }
                    if (i4 != TextureVideoView.this.e && i3 != TextureVideoView.this.d) {
                        TextureVideoView.this.requestLayout();
                    }
                }
            }
        };
        this.R = new b() {
            public final void a(acaz acaz) {
                if (TextureVideoView.this.k()) {
                    TextureVideoView textureVideoView = TextureVideoView.this;
                    textureVideoView.a = 5;
                    textureVideoView.b = 5;
                    if (textureVideoView.g != null) {
                        TextureVideoView.this.g.a(TextureVideoView.this.c);
                    }
                }
            }
        };
        this.S = new h() {
            public final void b(acaz acaz) {
                if (TextureVideoView.this.h != null) {
                    TextureVideoView.this.h.b(acaz);
                }
            }
        };
        this.T = new e() {
            public final boolean a(acaz acaz, int i, int i2) {
                if (TextureVideoView.this.n != null) {
                    TextureVideoView.this.n.a(acaz, i, i2);
                }
                return true;
            }
        };
        this.U = new c() {
            public final boolean a(acaz acaz, abyh abyh) {
                if (TextureVideoView.this.c == null) {
                    return true;
                }
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.a = -1;
                textureVideoView.b = -1;
                if (textureVideoView.m != null) {
                    boolean a = TextureVideoView.this.m.a(TextureVideoView.this.c, abyh);
                }
                return true;
            }
        };
        this.V = new defpackage.acaz.a() {
            public final void a(acaz acaz, int i) {
                TextureVideoView textureVideoView = TextureVideoView.this;
                textureVideoView.l = i;
                if (textureVideoView.i != null) {
                    TextureVideoView.this.i.a(acaz, i);
                }
            }
        };
        this.W = new g() {
            public final void a(acaz acaz, boolean z) {
                if (TextureVideoView.this.j != null) {
                    TextureVideoView.this.j.a(acaz, z);
                }
            }
        };
        this.aa = new d() {
            public final void a(Exception exception, acaz acaz) {
                if (TextureVideoView.this.c != null) {
                    TextureVideoView textureVideoView = TextureVideoView.this;
                    textureVideoView.a = -1;
                    textureVideoView.b = -1;
                    if (textureVideoView.o != null) {
                        TextureVideoView.this.o.a(exception, TextureVideoView.this.c);
                    }
                }
            }
        };
        this.ab = new SurfaceTextureListener() {
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                if (TextureVideoView.this.c != null) {
                    Surface surface = new Surface(surfaceTexture);
                    TextureVideoView textureVideoView = TextureVideoView.this;
                    textureVideoView.a(new a(textureVideoView.c, surface));
                    return;
                }
                TextureVideoView.this.i();
            }

            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureVideoView.this.c(true);
                return true;
            }

            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                Object obj = 1;
                Object obj2 = TextureVideoView.this.b == 3 ? 1 : null;
                if (!(TextureVideoView.this.d == i && TextureVideoView.this.e == i2)) {
                    obj = null;
                }
                if (TextureVideoView.this.c != null && obj2 != null && obj != null) {
                    if (TextureVideoView.this.p != 0) {
                        TextureVideoView textureVideoView = TextureVideoView.this;
                        textureVideoView.seekTo(textureVideoView.p);
                    }
                    TextureVideoView.this.start();
                }
            }

            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                if (TextureVideoView.this.a == 3) {
                    taf taf = TextureVideoView.this.r;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (taf.f > -1) {
                        long j = elapsedRealtime - taf.f;
                        int i = 41;
                        if (taf.b != null) {
                            int i2 = (int) taf.b.a;
                            if (i2 > 0) {
                                i = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL / i2;
                            }
                        }
                        taf.g = (int) (((long) taf.g) + (j / ((long) (i + 5))));
                        taf.i += j;
                    }
                    taf.h++;
                    taf.f = elapsedRealtime;
                    return;
                }
                TextureVideoView.this.r.f = -1;
            }
        };
        l();
        this.K = kpf.a();
    }

    public TextureVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextureVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.w = new -$$Lambda$TextureVideoView$AriCzjSyMnQQHydMhfULK7DnsCs(this);
        this.a = 0;
        this.b = 0;
        this.c = null;
        this.y = 0;
        this.F = true;
        this.G = false;
        this.q = true;
        this.r = new taf();
        this.s = "";
        this.P = new abvl();
        this.Q = /* anonymous class already generated */;
        this.R = /* anonymous class already generated */;
        this.S = /* anonymous class already generated */;
        this.T = /* anonymous class already generated */;
        this.U = /* anonymous class already generated */;
        this.V = /* anonymous class already generated */;
        this.W = /* anonymous class already generated */;
        this.aa = /* anonymous class already generated */;
        this.ab = /* anonymous class already generated */;
        l();
        this.K = kpf.a();
    }

    private void a(acaz acaz) {
        try {
            this.d = acaz.g();
        } catch (IllegalStateException unused) {
            this.d = 0;
        }
        try {
            this.e = acaz.h();
        } catch (IllegalStateException unused2) {
            this.e = 0;
        }
    }

    private void a(Uri uri, Map<String, String> map) {
        this.u = uri;
        this.v = map;
        i();
        requestLayout();
        invalidate();
    }

    private void l() {
        this.d = 0;
        this.e = 0;
        setSurfaceTextureListener(this.ab);
        this.a = 0;
        this.b = 0;
        tag.b.a.a((defpackage.tag.a) this);
    }

    private acaz m() {
        StringBuilder stringBuilder;
        if (this.F) {
            stringBuilder = new StringBuilder("OPERA_ASYNC_MEDIA_TEXTURE-");
            stringBuilder.append(this.s);
            return new sxf(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("OPERA_ANDROID_MEDIA_TEXTURE-");
        stringBuilder.append(this.s);
        return new sxe(stringBuilder.toString());
    }

    private void n() {
        removeCallbacks(this.w);
        a aVar = this.z;
        if (aVar != null) {
            aVar.a();
        }
        this.z = null;
    }

    private /* synthetic */ void o() {
        a aVar = this.z;
        this.z = null;
        if (aVar != null) {
            if (aVar.a != this.c) {
                aVar.a();
                return;
            }
            Surface surface = aVar.b;
            this.c.a(surface);
            Surface surface2 = this.f;
            if (!(surface2 == null || surface2 == surface)) {
                surface2.release();
            }
            this.f = surface;
        }
    }

    public final void H_() {
        this.r.f = -1;
        if (this.c != null) {
            if (k()) {
                this.c.f();
            }
            this.c.d();
            this.c = null;
            this.a = 0;
            this.b = 0;
        }
        if (VERSION.SDK_INT <= 19 && getParent() != null) {
            this.H = (ViewGroup) getParent();
            this.I = this.H.indexOfChild(this);
            try {
                this.H.removeView(this);
            } catch (RuntimeException unused) {
            }
        }
        this.u = null;
    }

    /* Access modifiers changed, original: protected */
    public defpackage.szu.a a() {
        return f() ? (e() && h()) ? defpackage.szu.a.EXOPLAYER_AND_STREAM_DECRYPTION : defpackage.szu.a.EXOPLAYER : defpackage.szu.a.MEDIA_PLAYER;
    }

    public final void a(float f) {
        if (this.c != null) {
            if (f <= MapboxConstants.MINIMUM_ZOOM || !this.G) {
                try {
                    this.c.a(f, f);
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public final void a(abnb abnb) {
        this.J = abnb;
        taf taf = this.r;
        if (!a().a()) {
            abnb = null;
        }
        taf.j = abnb;
    }

    public final void a(abqy abqy) {
        this.O = abqy;
    }

    public final void a(defpackage.acaz.a aVar) {
        this.i = aVar;
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void a(c cVar) {
        this.m = cVar;
    }

    public final void a(d dVar) {
        this.o = dVar;
    }

    public final void a(e eVar) {
        this.n = eVar;
    }

    public final void a(f fVar) {
        this.B = fVar;
    }

    public final void a(g gVar) {
        this.j = gVar;
    }

    public final void a(h hVar) {
        this.h = hVar;
    }

    public final void a(i iVar) {
        this.k = iVar;
    }

    public final void a(Uri uri) {
        a(uri, null);
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        n();
        this.z = aVar;
        post(this.w);
    }

    public final void a(String str) {
        this.r.k = str;
    }

    public final void a(String str, Map<String, String> map) {
        if (str != null) {
            a(Uri.parse(str), (Map) map);
        }
    }

    public final void a(syu syu) {
        this.N = syu;
    }

    public final void a(boolean z) {
        this.G = z;
    }

    public final void b() {
        this.q = false;
    }

    public final void b(String str) {
        a(str, null);
    }

    public final void b(boolean z) {
        this.M = z;
    }

    public final sra c() {
        return this.r.a();
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        acaz acaz = this.c;
        if (acaz != null) {
            acaz.e();
            this.c.d();
            this.c = null;
            this.a = 0;
            if (z) {
                this.b = 0;
            }
        }
        this.K.a(this.L);
        this.L = null;
        Surface surface = this.f;
        if (surface != null) {
            surface.release();
            this.f = null;
        }
        n();
    }

    public boolean canPause() {
        return this.C;
    }

    public boolean canSeekBackward() {
        return false;
    }

    public boolean canSeekForward() {
        return false;
    }

    public final aaun d() {
        acaz acaz = this.c;
        return acaz == null ? null : acaz.p();
    }

    public final void d(boolean z) {
        acaz acaz = this.c;
        if (acaz != null) {
            acaz.a(z);
        }
    }

    public final boolean e() {
        return this.N != null && g();
    }

    public final boolean f() {
        return this.M || e();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean g() {
        return this.u != null;
    }

    public int getAudioSessionId() {
        if (this.x == 0) {
            kom a = this.K.a(new kor(koj.PLAYING, szp.a.callsite("TextureVideoView"), new kox(defpackage.kox.a.AUDIO_DECODER, (byte) 0)));
            sxe sxe = new sxe("OPERA_ANDROID_MEDIA_TEXTURE_AUDIO");
            this.x = sxe.l();
            sxe.d();
            this.K.a(a);
        }
        return this.x;
    }

    public int getBufferPercentage() {
        return this.c != null ? this.l : 0;
    }

    public int getCurrentPosition() {
        return k() ? this.c.k() : 0;
    }

    public int getDuration() {
        return k() ? this.c.j() : -1;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean h() {
        return this.J != null;
    }

    /* Access modifiers changed, original: protected|final */
    public final void i() {
        if (this.u != null) {
            Surface surface = null;
            if (this.q && !this.G) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.requestAudioFocus(null, 3, 1);
                }
            }
            c(false);
            try {
                acaz m;
                int i = AnonymousClass2.a[a().ordinal()];
                acaz sxr;
                if (i == 1) {
                    sxr = new sxr(this, null, this.r.k, this.N, this.t);
                } else if (i == 2 && this.J != null) {
                    sxr = new sxr(this, this.J, this.r.k, this.N, this.t);
                } else {
                    m = m();
                }
                this.c = m;
                if (this.G) {
                    a((float) MapboxConstants.MINIMUM_ZOOM);
                }
                this.r.a(this.u.toString(), this.N);
                if (this.x != 0) {
                    this.c.b(this.x);
                } else {
                    this.x = this.c.l();
                }
                this.c.a(new -$$Lambda$TextureVideoView$c7rcqTx3HFpsdmfdd45Ze1L0LhQ(this));
                this.c.a(this.Q);
                this.c.a(this.R);
                this.c.a(this.S);
                this.c.a(this.U);
                this.c.a(this.T);
                this.c.a(this.V);
                this.c.a(this.W);
                this.c.a(this.aa);
                this.l = 0;
                this.c.a(getContext(), this.u, this.v);
                SurfaceTexture surfaceTexture = getSurfaceTexture();
                if (surfaceTexture != null) {
                    surface = new Surface(surfaceTexture);
                }
                a(new a(this.c, surface));
                this.c.m();
                this.c.n();
                if (this.p > 0 && this.c.o()) {
                    this.c.a(this.p);
                    this.p = 0;
                }
                this.c.c();
                this.a = 1;
            } catch (IOException | IllegalArgumentException unused) {
                this.a = -1;
                this.b = -1;
                this.U.a(this.c, abyh.MEDIA_ERROR_PLAYBACK);
            }
        }
    }

    public boolean isPlaying() {
        return k() && this.c.i();
    }

    public final void j() {
        this.A = null;
    }

    /* Access modifiers changed, original: final */
    public final boolean k() {
        if (this.c != null) {
            int i = this.a;
            if (!(i == -1 || i == 0 || i == 1)) {
                return true;
            }
        }
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(VideoView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(VideoView.class.getName());
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        int defaultSize = getDefaultSize(this.d, i);
        int defaultSize2 = getDefaultSize(this.e, i2);
        if (this.d > 0 && this.e > 0) {
            defaultSize = MeasureSpec.getMode(i);
            i = MeasureSpec.getSize(i);
            defaultSize2 = MeasureSpec.getMode(i2);
            i2 = MeasureSpec.getSize(i2);
            int i3;
            if (defaultSize == AudioPlayer.INFINITY_LOOP_COUNT && defaultSize2 == AudioPlayer.INFINITY_LOOP_COUNT) {
                defaultSize = this.d;
                defaultSize2 = defaultSize * i2;
                i3 = this.e;
                if (defaultSize2 < i * i3) {
                    i = (defaultSize * i2) / i3;
                } else if (defaultSize * i2 > i * i3) {
                    defaultSize2 = (i3 * i) / defaultSize;
                    i2 = defaultSize2;
                }
                setMeasuredDimension(Math.max(1, i), Math.max(1, i2));
            }
            if (defaultSize == AudioPlayer.INFINITY_LOOP_COUNT) {
                defaultSize = (this.e * i) / this.d;
                if (defaultSize2 != Integer.MIN_VALUE || defaultSize <= i2) {
                    i2 = defaultSize;
                }
            } else if (defaultSize2 == AudioPlayer.INFINITY_LOOP_COUNT) {
                defaultSize2 = (this.d * i2) / this.e;
                if (defaultSize != Integer.MIN_VALUE || defaultSize2 <= i) {
                    i = defaultSize2;
                }
            } else {
                i3 = this.d;
                int i4 = this.e;
                if (defaultSize2 != Integer.MIN_VALUE || i4 <= i2) {
                    i2 = i4;
                } else {
                    i3 = (i3 * i2) / i4;
                }
                if (defaultSize != Integer.MIN_VALUE || i3 <= i) {
                    defaultSize2 = i2;
                    defaultSize = i3;
                } else {
                    defaultSize = i;
                    defaultSize2 = (this.e * i) / this.d;
                }
                Math.max(1, defaultSize2);
            }
            setMeasuredDimension(Math.max(1, i), Math.max(1, i2));
        }
        i = defaultSize;
        i2 = defaultSize2;
        setMeasuredDimension(Math.max(1, i), Math.max(1, i2));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        return false;
    }

    public void pause() {
        if (k() && this.c.i()) {
            this.c.b();
            this.a = 4;
        }
        this.r.f = -1;
        this.b = 4;
    }

    public void seekTo(int i) {
        if (k()) {
            this.c.a(i);
            this.p = 0;
            return;
        }
        this.p = i;
    }

    public void start() {
        if (VERSION.SDK_INT <= 19 && getParent() == null) {
            ViewGroup viewGroup = this.H;
            if (viewGroup != null) {
                viewGroup.addView(this, this.I);
            }
        }
        if (k()) {
            if (!this.c.i()) {
                this.c.a();
            }
            this.a = 3;
        }
        this.r.f = -1;
        this.b = 3;
    }
}
