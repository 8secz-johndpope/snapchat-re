package defpackage;

/* renamed from: adfe */
public final class adfe {
    byte[] a = null;
    long b = -1;
    int c = -1;

    public final String toString() {
        byte[] bArr = this.a;
        int length = bArr != null ? bArr.length : -1;
        return String.format("AudioEncodeBufferPacket: length=%d, timestamp=%d, flag=%d", new Object[]{Integer.valueOf(length), Long.valueOf(this.b), Integer.valueOf(this.c)});
    }
}
