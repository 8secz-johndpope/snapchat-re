package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: bmf */
public interface bmf {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: bmf$a */
    public static final class a extends Exception {
        public a(int i, int i2, int i3) {
            StringBuilder stringBuilder = new StringBuilder("Unhandled format: ");
            stringBuilder.append(i);
            stringBuilder.append(" Hz, ");
            stringBuilder.append(i2);
            stringBuilder.append(" channels in encoding ");
            stringBuilder.append(i3);
            super(stringBuilder.toString());
        }
    }

    void a(ByteBuffer byteBuffer);

    boolean a();

    boolean a(int i, int i2, int i3);

    int b();

    int c();

    int d();

    void e();

    ByteBuffer f();

    boolean g();

    void h();

    void i();
}
