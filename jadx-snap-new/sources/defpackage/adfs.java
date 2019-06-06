package defpackage;

import com.google.common.base.Preconditions;

/* renamed from: adfs */
public interface adfs {

    /* renamed from: adfs$a */
    public static class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            Preconditions.checkArgument(i <= i2);
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    a a(int i);

    boolean a();

    void b();

    void b(int i);

    int c();

    void c(int i);

    int d();

    int e();
}
