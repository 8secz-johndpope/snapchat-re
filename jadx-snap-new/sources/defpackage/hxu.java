package defpackage;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: hxu */
public final class hxu {
    private final Map<Class<?>, hxn> a;
    private final BiMap<String, fth> b = HashBiMap.create();
    private final BiMap<fth, String> c;
    private final BiMap<String, fth> d = HashBiMap.create();
    private final BiMap<fth, String> e;
    private final BiMap<String, fth> f = HashBiMap.create();
    private final BiMap<fth, String> g;
    private final Map<fth, hxr> h = Maps.newHashMap();

    /* renamed from: hxu$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[hxr.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.hxr.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.hxr.FEATURE_SETTING;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.hxr.CLIENT_PROPERTY;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.hxr.TOOLTIP;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hxu$1.<clinit>():void");
        }
    }

    public hxu(Map<Class<?>, hxn> map) {
        this.a = map;
        a(this.a);
        this.c = this.b.inverse();
        this.e = this.d.inverse();
        this.g = this.f.inverse();
    }

    private static void a(BiMap<String, fth> biMap, hxo hxo, fth fth) {
        if (biMap.containsKey(hxo.a)) {
            StringBuilder stringBuilder = new StringBuilder("Multiple mappings exist for feature_config key ");
            stringBuilder.append(hxo.a);
            stringBuilder.append(": ");
            stringBuilder.append(fth);
            stringBuilder.append(" and ");
            stringBuilder.append(biMap.get(hxo.a));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        biMap.put(hxo.a, fth);
    }

    private void a(Map<Class<?>, hxn> map) {
        for (Entry value : map.entrySet()) {
            for (Entry entry : ((hxn) value.getValue()).a().entrySet()) {
                BiMap biMap;
                int i = 1.a[((hxo) entry.getValue()).b.ordinal()];
                if (i == 1) {
                    biMap = this.b;
                } else if (i == 2) {
                    biMap = this.d;
                } else if (i == 3) {
                    biMap = this.f;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unknown feature config type not handled: ");
                    stringBuilder.append(((hxo) entry.getValue()).b);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                hxu.a(biMap, (hxo) entry.getValue(), (fth) entry.getKey());
            }
        }
        for (fth put : this.b.values()) {
            this.h.put(put, hxr.FEATURE_SETTING);
        }
        for (fth put2 : this.d.values()) {
            this.h.put(put2, hxr.CLIENT_PROPERTY);
        }
        for (fth put22 : this.f.values()) {
            if (put22.a().b == fti.BOOLEAN) {
                this.h.put(put22, hxr.TOOLTIP);
            } else {
                throw new IllegalArgumentException("Tooltip key needs to be BOOLEAN key: ".concat(String.valueOf(put22)));
            }
        }
    }

    public final fth a(String str) {
        return (fth) this.b.get(str);
    }

    public final String a(fth fth) {
        return (String) this.c.get(fth);
    }

    public final Set<fth> a() {
        return this.e.keySet();
    }

    public final fth b(String str) {
        return (fth) this.f.get(str);
    }

    public final String b(fth fth) {
        return (String) this.e.get(fth);
    }

    public final String c(fth fth) {
        return (String) this.g.get(fth);
    }

    public final boolean d(fth fth) {
        return this.h.containsKey(fth);
    }

    public final hxr e(fth fth) {
        return (hxr) this.h.get(fth);
    }
}
