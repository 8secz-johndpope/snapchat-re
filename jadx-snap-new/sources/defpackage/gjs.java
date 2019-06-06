package defpackage;

import defpackage.akhp.a;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: gjs */
public final class gjs<T> extends gjl<T> {
    private final iha d;

    public gjs(iha iha, gdd gdd) {
        akcr.b(iha, "serializationHelper");
        akcr.b(gdd, "payloadSigner");
        super(iha, gdd);
        this.d = iha;
    }

    /* renamed from: b */
    public final akhu a(T t) {
        akho akho;
        a aVar = new a();
        if (t instanceof aedh) {
            this.c.a((aedh) t);
            akho = gjt.a;
        } else {
            akho = gjt.b;
        }
        aVar.a(akho);
        gju gju = new gju(this.d);
        if (t == null) {
            akcr.a();
        }
        Object a = gju.a((Object) t);
        akcr.a(a, "MultipartEncodedFieldMap…etObjectFieldMap(value!!)");
        for (Entry entry : ((Map) a).entrySet()) {
            String str = (String) entry.getKey();
            Object obj = (gjr) entry.getValue();
            akhl a2 = obj.a(str);
            akcr.a(obj, "part");
            aVar.a(a2, obj.a());
        }
        a = aVar.a();
        akcr.a(a, "multipartBuilder.build()");
        return (akhu) a;
    }
}
