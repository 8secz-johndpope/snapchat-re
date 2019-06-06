package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import defpackage.dru.b.c;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dtf */
public final class dtf implements aiqc<ftl> {
    private final ajwy<Map<String, ? extends aipn<ftk>>> a;
    private final ajwy<ajdx<iha>> b;
    private final ajwy<zgb> c;

    public static ftl a(Map<String, ? extends aipn<ftk>> map, ajdx<iha> ajdx, zgb zgb) {
        akcr.b(map, "configProviders");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(zgb, "schedulersProvider");
        Builder builder = ImmutableList.builder();
        for (Entry entry : map.entrySet()) {
            Object obj = (String) entry.getKey();
            builder.add((aipn) entry.getValue());
            if (akcr.a(obj, (Object) "serverconfigs")) {
                builder.add(c.a);
            }
        }
        return (ftl) aiqf.a(new ftl(builder.build(), ajdx), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return dtf.a((Map) this.a.get(), (ajdx) this.b.get(), (zgb) this.c.get());
    }
}
