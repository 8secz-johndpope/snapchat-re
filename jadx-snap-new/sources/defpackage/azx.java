package defpackage;

import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Choreographer;
import defpackage.azq.a;
import defpackage.azq.b;

/* renamed from: azx */
public final class azx extends azr {
    private azx(azw azw) {
        super(azw);
    }

    public static azx b() {
        return new azx(VERSION.SDK_INT >= 16 ? new a(Choreographer.getInstance()) : new b(new Handler()));
    }
}
