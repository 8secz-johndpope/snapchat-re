package defpackage;

import com.google.protobuf.nano.MessageNano;

/* renamed from: gkb */
public final class gkb<T extends MessageNano> implements akwk<T, akhu> {
    private final akho a = whm.a("application/x-protobuf", false);

    private akhu a(T t) {
        akcr.b(t, "value");
        Object create = akhu.create(this.a, MessageNano.toByteArray(t));
        akcr.a(create, "RequestBody.create(mediaType, bytes)");
        return create;
    }
}
