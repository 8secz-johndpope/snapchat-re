package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bmh */
public interface bmh {

    /* renamed from: bmh$c */
    public interface c {
        void a();

        void a(int i);

        void a(int i, long j, long j2);
    }

    /* renamed from: bmh$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* renamed from: bmh$b */
    public static final class b extends Exception {
        private int a;

        public b(int i, int i2, int i3, int i4) {
            StringBuilder stringBuilder = new StringBuilder("AudioTrack init failed: ");
            stringBuilder.append(i);
            stringBuilder.append(", Config(");
            stringBuilder.append(i2);
            String str = ppy.d;
            stringBuilder.append(str);
            stringBuilder.append(i3);
            stringBuilder.append(str);
            stringBuilder.append(i4);
            stringBuilder.append(")");
            super(stringBuilder.toString());
            this.a = i;
        }
    }

    /* renamed from: bmh$d */
    public static final class d extends Exception {
        private int a;

        public d(int i) {
            super("AudioTrack write failed: ".concat(String.valueOf(i)));
            this.a = i;
        }
    }

    long a(boolean z);

    blp a(blp blp);

    void a();

    void a(float f);

    void a(int i, int i2, int i3, int[] iArr, int i4, int i5);

    void a(bmd bmd);

    void a(c cVar);

    boolean a(int i);

    boolean a(ByteBuffer byteBuffer, long j);

    void b();

    void b(int i);

    void c();

    boolean d();

    boolean e();

    blp f();

    void g();

    void h();

    void i();

    void j();
}
