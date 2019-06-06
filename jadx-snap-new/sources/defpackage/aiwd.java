package defpackage;

/* renamed from: aiwd */
public abstract class aiwd implements aiyo {
    public final int a() {
        a(4);
        return (((c() << 24) | (c() << 16)) | (c() << 8)) | c();
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        if (b() < i) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void close() {
    }
}
