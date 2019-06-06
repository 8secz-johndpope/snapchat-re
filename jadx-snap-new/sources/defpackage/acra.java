package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: acra */
public final class acra {
    public final cgi a = new cgn();
    public final cgi b = new cgn();
    public final int c;
    public final int[] d = new int[1];
    public final ByteBuffer[] e = new ByteBuffer[1];
    public final int[] f = new int[1];
    public final ByteBuffer[] g = new ByteBuffer[1];
    public boolean h = false;
    private float[] i = new float[1];

    public acra(List<acxe> list, List<acxd> list2) {
        this.c = list.size();
        this.d[0] = list.size();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((list.size() * 6) << 2);
        this.e[0] = allocateDirect;
        this.i[0] = 1.0f;
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        for (acxe acxe : list) {
            acra.a(acxe.a, acxe.b, allocateDirect);
            allocateDirect.putFloat(acxe.d);
            allocateDirect.putFloat(22.0f);
        }
        this.f[0] = list2.size();
        this.g[0] = ByteBuffer.allocateDirect((list2.size() * 6) << 2);
        this.g[0].order(ByteOrder.LITTLE_ENDIAN);
        for (acxd acxd : list2) {
            allocateDirect = this.g[0];
            acra.a(acxd.a, acxd.b, allocateDirect);
            allocateDirect.putFloat(acxd.d);
            allocateDirect.putFloat(acxd.c);
        }
    }

    private static void a(float f, float f2, ByteBuffer byteBuffer) {
        byteBuffer.putFloat(f);
        byteBuffer.putFloat(f2);
        byteBuffer.putInt(0);
        byteBuffer.putInt(0);
    }
}
