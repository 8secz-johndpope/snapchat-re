package defpackage;

import android.annotation.SuppressLint;
import defpackage.akg.a;

/* renamed from: akf */
public class akf extends app<aio, ajn<?>> implements akg {
    private a b;

    public akf(int i) {
        super(i);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 60) {
            a();
            return;
        }
        if (i >= 40) {
            b(this.a / 2);
        }
    }

    public final void a(a aVar) {
        this.b = aVar;
    }
}
