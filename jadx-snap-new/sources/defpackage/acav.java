package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.FrameLayout;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.adkk.b;
import java.lang.ref.WeakReference;

/* renamed from: acav */
public final class acav extends FrameLayout implements SurfaceTextureListener {
    public abyc a = abyc.CENTER_INSIDE;
    public adiv b;
    private final Context c;
    private final abtl d;
    private final abtl e;
    private adhl f = adhl.GLES20;
    private WeakReference<b> g;
    private Surface h;
    private TextureView i;
    private Bitmap j;
    private adkk k;

    public acav(Context context) {
        super(context);
        this.c = context;
        this.e = new abtl(0, 0);
        this.d = new abtl(0, 0);
        this.b = new adii();
    }

    /* JADX WARNING: Missing block: B:8:0x0037, code skipped:
            r4.b(r3);
     */
    /* JADX WARNING: Missing block: B:14:0x0061, code skipped:
            r3 = new android.widget.FrameLayout.LayoutParams(r2.d.b(), r2.d.c());
            r3.gravity = 17;
            r2.i.setLayoutParams(r3);
     */
    private void a(int r3, int r4) {
        /*
        r2 = this;
        if (r3 == 0) goto L_0x007b;
    L_0x0002:
        if (r4 == 0) goto L_0x007b;
    L_0x0004:
        r0 = r2.i;
        if (r0 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x007b;
    L_0x0009:
        r0 = defpackage.acav.2.a;
        r1 = r2.a;
        r1 = r1.ordinal();
        r0 = r0[r1];
        switch(r0) {
            case 1: goto L_0x0057;
            case 2: goto L_0x003b;
            case 3: goto L_0x001f;
            case 4: goto L_0x001f;
            case 5: goto L_0x001f;
            case 6: goto L_0x0017;
            default: goto L_0x0016;
        };
    L_0x0016:
        goto L_0x0061;
    L_0x0017:
        r4 = r2.d;
        r4.a(r3);
        r4 = r2.d;
        goto L_0x0037;
    L_0x001f:
        r0 = new abtl;
        r0.<init>(r3, r4);
        r3 = defpackage.abya.a(r0);
        r4 = r2.d;
        r0 = r3.b();
        r4.a(r0);
        r4 = r2.d;
        r3 = r3.c();
    L_0x0037:
        r4.b(r3);
        goto L_0x0061;
    L_0x003b:
        r3 = r2.e();
        r0 = 0;
        r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1));
        if (r0 != 0) goto L_0x0045;
    L_0x0044:
        return;
    L_0x0045:
        r0 = r2.d;
        r0.b(r4);
        r4 = r2.d;
        r0 = r4.c();
        r0 = (float) r0;
        r0 = r0 * r3;
        r3 = (int) r0;
        r4.a(r3);
        goto L_0x0061;
    L_0x0057:
        r0 = r2.d;
        r0.a(r3);
        r3 = r2.d;
        r3.b(r4);
    L_0x0061:
        r3 = new android.widget.FrameLayout$LayoutParams;
        r4 = r2.d;
        r4 = r4.b();
        r0 = r2.d;
        r0 = r0.c();
        r3.<init>(r4, r0);
        r4 = 17;
        r3.gravity = r4;
        r4 = r2.i;
        r4.setLayoutParams(r3);
    L_0x007b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acav.a(int, int):void");
    }

    private void c() {
        ide 1 = new ide("Opera", idi.OPERA) {
        };
        -$$Lambda$acav$DkgUMFMLa6h8SqevIp0fHiNdNT8 -__lambda_acav_dkgumfmla6h8sqevip0fhindnt8 = -$$Lambda$acav$DkgUMFMLa6h8SqevIp0fHiNdNT8.INSTANCE;
        adhi adhi = new adhi(abss.a().c());
        -$$Lambda$acav$uL7ABKYoXl0e6zk424DO7NqNAXc -__lambda_acav_ul7abkyoxl0e6zk424do7nqnaxc = -$$Lambda$acav$uL7ABKYoXl0e6zk424DO7NqNAXc.INSTANCE;
        adkk adkl;
        if (adgi.a().f()) {
            adkl = new adkl((ajwy) -__lambda_acav_dkgumfmla6h8sqevip0fhindnt8, this.f, adhi, (ajwy) -__lambda_acav_ul7abkyoxl0e6zk424do7nqnaxc, 1);
        } else {
            adkl = new acau(1, -__lambda_acav_dkgumfmla6h8sqevip0fhindnt8, this.f, adhi, -__lambda_acav_ul7abkyoxl0e6zk424do7nqnaxc, null);
        }
        this.k = r7;
        this.k.a(true);
        Bitmap bitmap = this.j;
        if (bitmap != null) {
            this.k.a(bitmap);
        }
        this.k.a((b) this.g.get());
    }

    private void d() {
        if (this.j != null) {
            adkk adkk = this.k;
            if (adkk != null && this.h != null) {
                adkk.a(this.b);
                this.k.a(this.h);
                this.k.b();
                this.k.c();
            }
        }
    }

    private float e() {
        return (this.e.b() == 0 || this.e.c() == 0) ? MapboxConstants.MINIMUM_ZOOM : (float) this.e.f();
    }

    public final void a() {
        if (this.i == null) {
            this.i = new TextureView(this.c);
            addView(this.i);
            this.i.setSurfaceTextureListener(this);
            this.i.setVisibility(0);
        }
    }

    public final void a(b bVar) {
        this.g = new WeakReference(bVar);
    }

    public final void a(Bitmap bitmap) {
        this.j = bitmap;
        this.e.a(this.j.getWidth());
        this.e.b(this.j.getHeight());
        c();
        a(getWidth(), getHeight());
        d();
    }

    public final void b() {
        adkk adkk = this.k;
        if (adkk != null) {
            adkk.b(false);
            this.k.c(false);
        }
        if (this.h != null) {
            this.h = null;
        }
        TextureView textureView = this.i;
        if (textureView != null) {
            textureView.setVisibility(8);
            this.i = null;
            WeakReference weakReference = this.g;
            if (weakReference != null) {
                weakReference.clear();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        a(acav.getDefaultSize(0, i), acav.getDefaultSize(0, i2));
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.h = new Surface(surfaceTexture);
        d();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b();
        return false;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
