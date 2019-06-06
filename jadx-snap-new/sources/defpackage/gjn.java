package defpackage;

import defpackage.gjl.a;
import java.util.Map;

/* renamed from: gjn */
public final class gjn<T> extends gjl<T> {
    private final iha d;
    private final String e;

    public gjn(iha iha, gdd gdd, String str) {
        akcr.b(iha, "serializationHelper");
        akcr.b(gdd, "payloadSigner");
        akcr.b(str, "field");
        super(iha, gdd);
        this.d = iha;
        this.e = str;
    }

    /* renamed from: b */
    public final akhu a(T t) {
        aedh aedh = new aedh();
        this.c.a(aedh);
        Object a = this.b.a((Object) aedh);
        akcr.a(a, "formEncodedJsonFieldMapp…jectFieldMap(authPayload)");
        a.put(this.e, this.d.b(t));
        Map map = (Map) a;
        return new a(map, akhu.create(gjl.a, gjl.a(map)));
    }
}
