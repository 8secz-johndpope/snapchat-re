package defpackage;

import java.io.InputStream;

/* renamed from: zt */
public final class zt implements zn<InputStream> {
    private final adw a;

    /* renamed from: zt$a */
    public static final class a implements defpackage.zn.a<InputStream> {
        private final abd a;

        public a(abd abd) {
            this.a = abd;
        }

        public final Class<InputStream> a() {
            return InputStream.class;
        }

        public final /* synthetic */ zn a(Object obj) {
            return new zt((InputStream) obj, this.a);
        }
    }

    zt(InputStream inputStream, abd abd) {
        this.a = new adw(inputStream, abd);
        this.a.mark(5242880);
    }

    public final /* synthetic */ Object a() {
        this.a.reset();
        return this.a;
    }

    public final void b() {
        this.a.b();
    }
}
