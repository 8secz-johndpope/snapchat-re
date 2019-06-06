package defpackage;

import android.os.Handler;

/* renamed from: bmg */
public interface bmg {

    /* renamed from: bmg$a */
    public static final class a {
        final Handler a;
        final bmg b;

        /* renamed from: bmg$a$1 */
        class 1 implements Runnable {
            private /* synthetic */ bmx a;

            1(bmx bmx) {
                this.a = bmx;
            }

            public final void run() {
                a.this.b.c(this.a);
            }
        }

        /* renamed from: bmg$a$2 */
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
                a.this.b.b(this.a, this.b, this.c);
            }
        }

        /* renamed from: bmg$a$3 */
        class 3 implements Runnable {
            private /* synthetic */ blg a;

            3(blg blg) {
                this.a = blg;
            }

            public final void run() {
                a.this.b.b(this.a);
            }
        }

        /* renamed from: bmg$a$4 */
        class 4 implements Runnable {
            private /* synthetic */ int a;
            private /* synthetic */ long b;
            private /* synthetic */ long c;

            4(int i, long j, long j2) {
                this.a = i;
                this.b = j;
                this.c = j2;
            }

            public final void run() {
                a.this.b.a(this.a, this.b, this.c);
            }
        }

        /* renamed from: bmg$a$6 */
        class 6 implements Runnable {
            private /* synthetic */ int a;

            6(int i) {
                this.a = i;
            }

            public final void run() {
                a.this.b.a(this.a);
            }
        }

        public a(Handler handler, bmg bmg) {
            this.a = bmg != null ? (Handler) byo.a((Object) handler) : null;
            this.b = bmg;
        }

        public final void a(final bmx bmx) {
            if (this.b != null) {
                this.a.post(new Runnable() {
                    public final void run() {
                        a.this.b.d(bmx);
                    }
                });
            }
        }
    }

    void a(int i);

    void a(int i, long j, long j2);

    void b(blg blg);

    void b(String str, long j, long j2);

    void c(bmx bmx);

    void d(bmx bmx);
}
