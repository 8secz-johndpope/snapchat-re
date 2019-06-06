package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: bzx */
public interface bzx {

    /* renamed from: bzx$a */
    public static final class a {
        final Handler a;
        final bzx b;

        /* renamed from: bzx$a$1 */
        class 1 implements Runnable {
            private /* synthetic */ bmx a;

            1(bmx bmx) {
                this.a = bmx;
            }

            public final void run() {
                a.this.b.a(this.a);
            }
        }

        /* renamed from: bzx$a$2 */
        class 2 implements Runnable {
            private /* synthetic */ String a;
            private /* synthetic */ long b;
            private /* synthetic */ long c;

            2(String str, long j, long j2) {
                this.a = str;
                this.b = j;
                this.c = j2;
            }

            public final void run() {
                a.this.b.a(this.a, this.b, this.c);
            }
        }

        /* renamed from: bzx$a$3 */
        class 3 implements Runnable {
            private /* synthetic */ blg a;

            3(blg blg) {
                this.a = blg;
            }

            public final void run() {
                a.this.b.a(this.a);
            }
        }

        public a(Handler handler, bzx bzx) {
            this.a = bzx != null ? (Handler) byo.a((Object) handler) : null;
            this.b = bzx;
        }

        public final void a(int i, int i2, int i3, float f) {
            if (this.b != null) {
                final int i4 = i;
                final int i5 = i2;
                final int i6 = i3;
                final float f2 = f;
                this.a.post(new Runnable() {
                    public final void run() {
                        a.this.b.a(i4, i5, i6, f2);
                    }
                });
            }
        }

        public final void a(final int i, final long j) {
            if (this.b != null) {
                this.a.post(new Runnable() {
                    public final void run() {
                        a.this.b.a(i, j);
                    }
                });
            }
        }

        public final void a(final Surface surface) {
            if (this.b != null) {
                this.a.post(new Runnable() {
                    public final void run() {
                        a.this.b.a(surface);
                    }
                });
            }
        }

        public final void a(final bmx bmx) {
            if (this.b != null) {
                this.a.post(new Runnable() {
                    public final void run() {
                        a.this.b.b(bmx);
                    }
                });
            }
        }
    }

    void a(int i, int i2, int i3, float f);

    void a(int i, long j);

    void a(Surface surface);

    void a(blg blg);

    void a(bmx bmx);

    void a(String str, long j, long j2);

    void b(bmx bmx);
}
