package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: dig */
public final class dig {
    final ajxe a = ajxh.a(new b(this));
    final dje b;
    final Map<String, dif> c;
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: dig$b */
    static final class b extends akcs implements akbk<EnumMap<aavd, List<? extends dif>>> {
        private /* synthetic */ dig a;

        b(dig dig) {
            this.a = dig;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            EnumMap enumMap = new EnumMap(aavd.class);
            Object b = this.a.b.b();
            akcr.a(b, "configProvider.config");
            b = b.a();
            akcr.a(b, "configProvider.config.qosToLogQueueNameMap");
            for (Entry entry : b.entrySet()) {
                aavd aavd = (aavd) entry.getKey();
                Object obj = (List) entry.getValue();
                Map map = enumMap;
                dig dig = this.a;
                akcr.a(obj, "value");
                map.put(aavd, dig.a(dig, (Iterable) obj));
            }
            return enumMap;
        }
    }

    /* renamed from: dig$a */
    static final class a extends akcs implements akbk<ImmutableList<dif>> {
        private /* synthetic */ dig a;

        a(dig dig) {
            this.a = dig;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.a.c.size());
            for (Object obj : aavd.values()) {
                Object b = this.a.b.b();
                akcr.a(b, "configProvider.config");
                Object obj2 = b.a().get(obj2);
                if (obj2 == null) {
                    akcr.a();
                }
                linkedHashSet.addAll((Collection) obj2);
            }
            return dig.a(this.a, linkedHashSet);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(dig.class), "qosToLogQueuesMap", "getQosToLogQueuesMap()Ljava/util/Map;"), new akdc(akde.a(dig.class), "logQueues", "getLogQueues()Ljava/util/List;")};
    }

    public dig(dje dje, Map<String, dif> map) {
        akcr.b(dje, "configProvider");
        akcr.b(map, "nameToLogQueueMap");
        this.b = dje;
        this.c = map;
    }

    public static final /* synthetic */ ImmutableList a(dig dig, Iterable iterable) {
        Builder builder = ImmutableList.builder();
        for (String str : iterable) {
            Object obj = dig.c.get(str);
            if (obj == null) {
                akcr.a();
            }
            builder.add(obj);
        }
        Object build = builder.build();
        akcr.a(build, "queuesBuilder.build()");
        return build;
    }

    public final List<dif> a() {
        return (List) this.d.b();
    }
}
