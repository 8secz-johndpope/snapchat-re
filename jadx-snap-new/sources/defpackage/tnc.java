package defpackage;

import com.google.common.collect.Maps;
import defpackage.ftj.a;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: tnc */
public final class tnc {
    private final Map<Class<?>, ftg> a;
    private final Map<String, ftg> b = Maps.newHashMap();
    private final EnumMap<ftg, a<fth>> c = Maps.newEnumMap(ftg.class);

    public tnc(Map<Class<?>, ftg> map) {
        this.a = map;
        a();
    }

    private void a() {
        int i;
        ftg ftg;
        Iterator it = this.a.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            ftg = (ftg) entry.getValue();
            this.b.put(ftg.name(), ftg);
            this.c.put(ftg, ftj.a((fth) ((Enum[]) ((Class) entry.getKey()).getEnumConstants())[0]));
        }
        ftg[] values = ftg.values();
        int length = values.length;
        while (i < length) {
            ftg = values[i];
            this.b.put(ftg.name(), ftg);
            i++;
        }
    }

    public final ftg a(String str) {
        return (ftg) this.b.get(str);
    }
}
