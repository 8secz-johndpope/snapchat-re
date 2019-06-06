package defpackage;

import defpackage.czp.a;
import java.io.Closeable;
import org.opencv.imgproc.Imgproc;

/* renamed from: drb */
public final class drb implements adfh, czq<byte[]> {
    private final zfw a;
    private final ajcx b = ajcx.a(new -$$Lambda$drb$OwWvR25v1THCDs0UafcgqLWJO7E(this));
    private czn<byte[]> c = null;
    private volatile czo<byte[]> d = a.a;

    public drb(zfw zfw) {
        this.a = zfw;
    }

    private static /* synthetic */ void b() {
    }

    private static /* synthetic */ void b(ajej ajej) {
    }

    public final Closeable a(czo<byte[]> czo) {
        this.d = czo;
        return new -$$Lambda$drb$vD5miAUk0ljrrdbtu76Va_GZLxw(this, this.b.a(-$$Lambda$drb$Vh2Sipi7rbM4uwsJYEkFYrm3fJ8.INSTANCE).c(-$$Lambda$drb$60_ZotvueUJuexegiaKJVIRzsvk.INSTANCE).c(-$$Lambda$drb$I2x_WoZXy6Fpi7pvy7c2t_1kUu8.INSTANCE).a(ajfu.g).b((ajdw) this.a.b()).e());
    }

    public final void a() {
        this.c = null;
        this.d = a.a;
    }

    public final void a(int i) {
        this.c = czn.a.a(i, Imgproc.INTER_TAB_SIZE2);
    }

    public final void a(byte[] bArr, int i) {
        if (this.c != null) {
            this.d.a(bArr, i, this.c);
        }
    }
}
