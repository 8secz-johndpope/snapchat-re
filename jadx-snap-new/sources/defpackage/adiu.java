package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import defpackage.adhe.a;
import java.nio.ByteBuffer;

/* renamed from: adiu */
public final class adiu extends adiv {
    private final adiv a;
    private final adiv b;
    private final b c;
    private final adhk d;
    private final int e;
    private final int f;
    private final a g;
    private adhe h;
    private adie i;

    /* renamed from: adiu$b */
    public interface b {
        ByteBuffer a(int i, int i2);

        void a(long j, a aVar);

        void a(adne adne);
    }

    /* renamed from: adiu$a */
    public static class a {
        public final int a;
        public final int b;
        public final ByteBuffer c;

        public a(int i, int i2, ByteBuffer byteBuffer) {
            this.a = i;
            this.b = i2;
            this.c = byteBuffer;
        }
    }

    public adiu(adiv adiv, adiv adiv2, b bVar) {
        this(adiv, adiv2, bVar, -1, -1);
    }

    public adiu(adiv adiv, adiv adiv2, b bVar, int i, int i2) {
        this(adiv, adiv2, bVar, i, i2, adhk.a, new a());
    }

    private adiu(adiv adiv, adiv adiv2, b bVar, int i, int i2, adhk adhk, a aVar) {
        this.a = (adiv) Preconditions.checkNotNull(adiv);
        this.b = (adiv) Preconditions.checkNotNull(adiv2);
        this.c = (b) Preconditions.checkNotNull(bVar);
        this.e = i;
        this.f = i2;
        this.g = aVar;
        this.d = adhk;
    }

    private void a(int i, long j, adie adie, adhu adhu, int i2, int i3) {
        int i4 = i2;
        int i5 = i3;
        ByteBuffer a = this.c.a(i4, i5);
        if (a != null) {
            Preconditions.checkState(a.remaining() >= ((i4 * i5) << 2), "Unexpected buffer size");
            this.a.a(i, j, this.i.clone().a(adie), adhu);
            adni.a("Reading frame at time: %d", Long.valueOf(j));
            a(j, i2, i3, a);
        }
    }

    private void a(long j, int i, int i2, ByteBuffer byteBuffer) {
        GLES20.glPixelStorei(3333, 1);
        GLES20.glPixelStorei(3317, 1);
        adhk.b(i, i2, 6408, byteBuffer);
        byteBuffer.rewind();
        this.c.a(j, new a(i, i2, byteBuffer));
    }

    private boolean a() {
        return (this.e == -1 || this.f == -1) ? false : true;
    }

    public final void a(int i, int i2, adic adic) {
        this.a.a(i, i2, adic);
        adiv adiv = this.b;
        if (adiv != this.a) {
            adiv.a(i, i2, adic);
        }
    }

    public final void a(int i, long j, adie adie, adhu adhu) {
        if (a()) {
            adhd b = this.h.b();
            b.a();
            a(i, j, adie, b.d, b.a, b.b);
            b.a(false);
            this.h.a(b);
            adhu.c();
        } else {
            a(i, j, adie, adhu, adhu.a, adhu.b);
        }
        this.b.a(i, j, adie, adhu);
    }

    public final void a(adie adie, adie adie2, int i, int i2, adic adic, adne adne, adhz adhz) {
        if (a()) {
            this.h = a.a(this.e, this.f, 1);
        }
        this.a.a(adie, adie2, i, i2, adic, adne, adhz);
        adiv adiv = this.b;
        if (adiv != this.a) {
            adiv.a(adie, adie2, i, i2, adic, adne, adhz);
        }
        this.c.a(adne);
        adie adie3 = adie2;
        adie a = adie.clone().a(adie2);
        adie3 = a.clone();
        adie3.a.a(adie3.b, adie3.b);
        this.i = new adie().a(-0.5f, -0.5f).a(a).c().a(adie3).a(0.5f, 0.5f);
    }

    public final void e() {
        this.a.e();
        adiv adiv = this.b;
        if (adiv != this.a) {
            adiv.e();
        }
        adhe adhe = this.h;
        if (adhe != null) {
            adhe.c();
        }
    }
}
