package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import defpackage.abyb.a;
import defpackage.acaz.i;

/* renamed from: acbb */
public class acbb extends FrameLayout implements i, SurfaceTextureListener {
    protected TextureView a;
    public int b = 2;
    protected acba c;
    private abtl d;
    private int e = 17;

    /* renamed from: acbb$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[acbc.a().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0015 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|5|6|7|8|9|10|12) */
        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|5|6|7|8|9|10|12) */
        /* JADX WARNING: Missing block: B:13:?, code skipped:
            return;
     */
        static {
            /*
            r0 = defpackage.acbc.a();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = 1;
            r1 = a;	 Catch:{ NoSuchFieldError -> 0x000f }
            r2 = 0;
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x000f }
        L_0x000f:
            r1 = 2;
            r2 = 4;
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x0015 }
            r3[r2] = r1;	 Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            r3 = a;	 Catch:{ NoSuchFieldError -> 0x001a }
            r4 = 3;
            r3[r0] = r4;	 Catch:{ NoSuchFieldError -> 0x001a }
        L_0x001a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001e }
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.acbb$1.<clinit>():void");
        }
    }

    public acbb(Context context, ide ide) {
        super(context);
        this.c = new acba(ide, context, a.a.a, new zgb(), kpf.a(), adgi.a(), new adoe(null));
        this.c.b(false);
        this.c.a((i) this);
        this.d = new abtl(0, 0);
    }

    private void a(int i, int i2) {
        if (!(i == 0 || i2 == 0)) {
            abtl abtl;
            int i3 = 1.a[this.b - 1];
            if (i3 != 1) {
                abtl abtl2;
                float f;
                if (i3 == 2) {
                    i3 = this.c.c;
                    int i4 = this.c.d;
                    if (i3 != 0 && i4 != 0) {
                        float f2 = (float) i3;
                        float f3 = ((float) i) / f2;
                        f = (float) i4;
                        float f4 = ((float) i2) / f;
                        if (f3 > f4) {
                            this.d.a((int) (f2 * f3));
                            abtl2 = this.d;
                            i = (int) (f * f3);
                        } else {
                            this.d.a((int) (f2 * f4));
                            abtl = this.d;
                            i2 = (int) (f * f4);
                        }
                    } else {
                        return;
                    }
                } else if (i3 != 3) {
                    if (i3 == 4) {
                        this.d.a(i);
                        abtl2 = this.d;
                    }
                    this.a.setLayoutParams(new LayoutParams(this.d.b(), this.d.c()));
                } else {
                    i2 = this.c.c;
                    i3 = this.c.d;
                    if (i2 != 0 && i3 != 0) {
                        f = ((float) Math.min(i2, i3)) / ((float) Math.max(i2, i3));
                        this.d.a(i);
                        abtl = this.d;
                        i2 = (int) (((float) abtl.b()) / f);
                    } else {
                        return;
                    }
                }
                abtl2.b(i);
                this.a.setLayoutParams(new LayoutParams(this.d.b(), this.d.c()));
            } else {
                this.d.a(i);
                abtl = this.d;
            }
            abtl.b(i2);
            this.a.setLayoutParams(new LayoutParams(this.d.b(), this.d.c()));
        }
    }

    public final void b(acaz acaz, int i, int i2) {
        a(getWidth(), getHeight());
    }

    public final void e() {
        this.c.c();
        if (this.a == null) {
            this.a = new TextureView(getContext());
            this.a.setVisibility(8);
            addView(this.a);
            this.a.setSurfaceTextureListener(this);
        }
        a(getWidth(), getHeight());
        this.a.setVisibility(0);
    }

    /* Access modifiers changed, original: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextureView textureView = this.a;
        if (textureView != null) {
            i4 -= i2;
            i3 -= i;
            int measuredHeight = textureView.getMeasuredHeight();
            i = this.a.getMeasuredWidth();
            i3 = (i3 - i) / 2;
            i2 = this.e;
            i2 = i2 != 17 ? i2 != 80 ? 0 : i4 - measuredHeight : (i4 - measuredHeight) / 2;
            this.a.layout(i3, i2, i + i3, measuredHeight + i2);
        }
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        i = acbb.getDefaultSize(0, i);
        i2 = acbb.getDefaultSize(0, i2);
        if (this.a != null) {
            a(i, i2);
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c.a(new Surface(surfaceTexture));
        this.c.q();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.c.a(0, false);
        this.c.d();
        TextureView textureView = this.a;
        if (textureView != null) {
            textureView.setVisibility(8);
            this.a = null;
        }
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
