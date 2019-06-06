package defpackage;

import android.content.Context;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: akpx */
public class akpx extends akpr {
    public akpx(Context context) {
        super(context);
    }

    public final akoy b() {
        if (this.e == null) {
            this.e = akqg.a(this.a);
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.n = 0;
        return cronetUrlRequestContext;
    }
}
