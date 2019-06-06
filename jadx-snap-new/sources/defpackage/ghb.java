package defpackage;

import com.google.common.base.Optional;
import java.util.HashMap;
import java.util.Set;

/* renamed from: ghb */
public final class ghb implements gja {
    public final HashMap<String, ygh> a = new HashMap();
    private final HashMap<String, gea> b = new HashMap();
    private final ajwy<ilv> c;

    /* renamed from: ghb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public ghb(Set<? extends gfp> set, Optional<gfq> optional, ajwy<ilv> ajwy) {
        akcr.b(set, "contentTypes");
        akcr.b(optional, "contentTypeTransformer");
        akcr.b(ajwy, "graphene");
        this.c = ajwy;
        for (gfp gfp : set) {
            gfp gfp2;
            if (optional.isPresent()) {
                gfp2 = ((gfq) optional.get()).a(gfp2);
            }
            Object obj = (ygh) this.a.get(gfp2.d);
            if (obj == null) {
                obj = new gec(gfp2.d, gfp2.l, gfp2.l << 1, gfp2.g, gfp2.m);
            }
            akcr.a(obj, "fileGroups[contentType.n…ntType.attributedFeature)");
            this.a.put(gfp2.d, obj);
            obj.f().add(gfp2.b);
            String a = gfp2.a();
            Object ggj = new ggj(obj, gfp2.b, gfp2.c, gfp2.o);
            Object obj2 = (gea) this.b.put(a, ggj);
            if (obj2 != null) {
                akcr.a(obj2, "cachePolices.put(key, cachePolicy) ?: return");
                if (!akcr.a(obj2, ggj)) {
                    StringBuilder stringBuilder = new StringBuilder("New cache policy ");
                    stringBuilder.append(a);
                    stringBuilder.append(" '");
                    stringBuilder.append(ggj);
                    stringBuilder.append("' conflicts with '");
                    stringBuilder.append(obj2);
                    stringBuilder.append('\'');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        }
        a();
    }

    private final void a() {
        Object values = this.b.values();
        akcr.a(values, "cachePolices.values");
        for (Object obj : (Iterable) values) {
            ilv ilv = (ilv) this.c.get();
            inu inu = inu.CACHE_MAX_TTL;
            akcr.a(obj, "cachePolicy");
            Object a = obj.a();
            String str = "cachePolicy.fileGroup";
            akcr.a(a, str);
            String e = a.e();
            String str2 = "cachePolicy.fileGroup.groupKey";
            akcr.a((Object) e, str2);
            String str3 = "key";
            ilv.b(inu.a(str3, e), obj.e());
            ilv = (ilv) this.c.get();
            inu = inu.CACHE_MAX_SIZE;
            a = obj.a();
            akcr.a(a, str);
            e = a.e();
            akcr.a((Object) e, str2);
            ilz a2 = inu.a(str3, e);
            a = obj.a();
            akcr.a(a, str);
            ilv.b(a2, a.c());
            ilv = (ilv) this.c.get();
            inu = inu.CACHE_REFRESH_TTL;
            a = obj.a();
            akcr.a(a, str);
            e = a.e();
            akcr.a((Object) e, str2);
            ilv.b(inu.a(str3, e), obj.f());
        }
    }

    public final gea a(geo geo) {
        akcr.b(geo, "type");
        Object obj = (gea) this.b.get(geo.a());
        if (obj != null) {
            akcr.a(obj, "it");
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder("Unexpected content type ");
        stringBuilder.append(geo.a());
        stringBuilder.append(", please ensure it is provided as a RegistrableContentType in the dagger module");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
