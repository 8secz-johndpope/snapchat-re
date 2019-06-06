package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: ppw */
public final class ppw implements ComponentCallbacks2 {
    final ajws<Integer> a;
    private final String b = "MemoryAppCallback";
    private int c = -1;
    private long d = abqo.a();
    private final abqo e;

    public ppw(abqo abqo) {
        akcr.b(abqo, "clock");
        this.e = abqo;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.a = (ajws) ajwo;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        int i2 = this.c;
        long a = abqo.a();
        long j = a - this.d;
        this.c = i;
        this.d = a;
        if (i2 != i || j >= 1500) {
            this.a.a((Object) Integer.valueOf(i));
        }
    }
}
