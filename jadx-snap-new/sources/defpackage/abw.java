package defpackage;

import android.annotation.SuppressLint;
import defpackage.abx.a;

/* renamed from: abw */
public final class abw extends ahi<zd, aax<?>> implements abx {
    private a a;

    public abw(long j) {
        super(j);
    }

    @SuppressLint({"InlinedApi"})
    public final void a(int i) {
        if (i >= 40) {
            a();
            return;
        }
        if (i >= 20 || i == 15) {
            a(b() / 2);
        }
    }

    public final void a(a aVar) {
        this.a = aVar;
    }
}
