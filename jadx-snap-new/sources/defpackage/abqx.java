package defpackage;

import com.google.protobuf.nano.MessageNano;

/* renamed from: abqx */
public final class abqx {

    /* renamed from: abqx$a */
    public static class a extends Exception {
        public a(Exception exception) {
            super(exception);
        }
    }

    public static <T extends MessageNano> T a(Class<T> cls, byte[] bArr) {
        try {
            MessageNano messageNano = (MessageNano) cls.newInstance();
            MessageNano.mergeFrom(messageNano, bArr);
            return messageNano;
        } catch (Exception e) {
            throw new a(e);
        }
    }
}
