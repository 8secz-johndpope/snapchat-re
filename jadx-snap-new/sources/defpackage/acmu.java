package defpackage;

import android.view.ViewGroup;

/* renamed from: acmu */
public interface acmu {

    /* renamed from: acmu$a */
    public static class a extends RuntimeException {
        private int a;

        public a(Error error, int i) {
            super("EGLError was detected: ".concat(String.valueOf(i)), error);
            this.a = i;
        }
    }

    /* renamed from: acmu$b */
    public static class b extends RuntimeException {
        public b(Error error) {
            super("Native rendering reported an error.", error);
        }
    }

    /* renamed from: acmu$c */
    public static class c {
        private Throwable a;
        private boolean b;

        public c(Throwable th, boolean z) {
            this.a = th;
            this.b = z;
        }
    }

    ViewGroup a();

    void a(int i);

    void a(cgi cgi, double d);

    void a(String str, Throwable th);

    void b();

    void b(int i);

    ajdp<c> c();

    void c(int i);
}
