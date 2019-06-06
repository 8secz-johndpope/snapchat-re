package defpackage;

import android.net.Uri;
import com.google.common.base.Supplier;
import com.looksery.sdk.domain.Size;
import com.looksery.sdk.media.VideoWriter;
import com.looksery.sdk.media.VideoWriterFactory;

/* renamed from: mna */
final class mna implements VideoWriterFactory {
    private final boolean a;
    private final boolean b;
    private final Supplier<kpc> c;
    private volatile boolean d;

    public mna(Supplier<kpc> supplier) {
        this(supplier, (byte) 0);
    }

    private mna(Supplier<kpc> supplier, byte b) {
        this.b = false;
        this.a = false;
        this.c = supplier;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.d = z;
    }

    public final VideoWriter createVideoWriter(String str, int i, int i2) {
        Supplier supplier = this.c;
        boolean z = this.d;
        String path = Uri.parse(str).getPath();
        Size adjustForVideoEncoding = new Size(i, i2).adjustForVideoEncoding();
        return new mmz(path, adjustForVideoEncoding.getWidth(), adjustForVideoEncoding.getHeight(), null, new mmc(), supplier, z);
    }
}
