package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import defpackage.adib.a;
import java.nio.ByteBuffer;

/* renamed from: adho */
public final class adho {
    private final Bitmap a;
    private final adie b;
    private final adie c;
    private final adiv d;
    private final int e;
    private final int f;
    private final adhl g;
    private final adhk h;
    private final adhi i;
    private final a j;
    private final a k;
    private final adhz l;
    private int m;
    private adib n;
    private adhv o;
    private ByteBuffer p;

    /* renamed from: adho$a */
    public static class a {
        protected a() {
        }
    }

    public adho(Bitmap bitmap, adie adie, adiv adiv, int i, int i2, adhl adhl, adhi adhi, adnj adnj) {
        this(bitmap, adie, adiv, i, i2, adhl, adhk.a, adhi, new a(), new a(), new adhz(adnj));
    }

    private adho(Bitmap bitmap, adie adie, adiv adiv, int i, int i2, adhl adhl, adhk adhk, adhi adhi, a aVar, a aVar2, adhz adhz) {
        boolean z = true;
        this.m = 1;
        Preconditions.checkArgument(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.d = (adiv) Preconditions.checkNotNull(adiv);
        this.e = i;
        this.f = i2;
        this.g = (adhl) Preconditions.checkNotNull(adhl);
        this.h = adhk;
        this.i = adhi;
        this.j = aVar;
        this.k = aVar2;
        this.l = adhz;
        this.b = (adie) Preconditions.checkNotNull(adie);
        this.c = new adie().c();
    }

    public final void a() {
        Preconditions.checkState(this.m == 1, "Cannot setup. Already setup");
        this.o = new adhv(this.e, this.f, this.g, this.i);
        this.n = new adib().a(this.a, true);
        this.d.a(this.b, this.c, this.a.getWidth(), this.a.getHeight(), adic.TEXTURE_2D, null, this.l);
        this.p = ByteBuffer.allocateDirect((this.e * this.f) << 2);
        this.m = 2;
    }

    public final void a(Bitmap bitmap, long j) {
        Preconditions.checkState(this.m == 2, "Cannot render to bitmap. Not set up.");
        Preconditions.checkArgument(bitmap.getWidth() == this.e, "Unexpected bitmap width");
        Preconditions.checkArgument(bitmap.getHeight() == this.f, "Unexpected bitmap height");
        this.d.a(this.n.a, j, new adie(), this.o.a);
        this.p.position(0);
        GLES20.glPixelStorei(3333, 1);
        GLES20.glPixelStorei(3317, 1);
        adhk.b(this.e, this.f, 6408, this.p);
        this.p.rewind();
        bitmap.copyPixelsFromBuffer(this.p);
    }

    public final void b() {
        if (this.m == 2) {
            this.p = null;
            this.d.e();
            this.n.c();
            this.l.a();
            this.o.a();
            this.m = 3;
        }
    }
}
