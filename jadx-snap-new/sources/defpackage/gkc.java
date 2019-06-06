package defpackage;

import com.google.protobuf.nano.MessageNano;

/* renamed from: gkc */
public final class gkc<T extends MessageNano> implements akwk<akhw, T> {
    private final Class<T> a;

    public gkc(Class<T> cls) {
        akcr.b(cls, "clazz");
        this.a = cls;
    }

    private T a(akhw akhw) {
        akcr.b(akhw, "value");
        Object obj = (MessageNano) this.a.newInstance();
        byte[] e = akhw.e();
        MessageNano.mergeFrom(obj, e, 0, e.length);
        akcr.a(obj, "instance");
        return obj;
    }
}
