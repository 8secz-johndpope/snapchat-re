package defpackage;

import android.content.Context;

/* renamed from: aclj */
public final class aclj {
    final boolean a;
    private String b;
    private boolean c;
    private boolean d;

    public aclj(Context context) {
        akcr.b(context, "context");
    }

    public final synchronized String a() {
        return this.b;
    }

    public final synchronized void a(String str) {
        this.b = str;
    }

    public final synchronized void a(boolean z) {
        this.c = z;
    }

    public final synchronized void b(boolean z) {
        this.d = z;
    }

    public final synchronized boolean b() {
        return this.c;
    }

    public final synchronized boolean c() {
        return this.d;
    }
}
