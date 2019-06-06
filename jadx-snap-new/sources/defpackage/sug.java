package defpackage;

import java.util.Map;

/* renamed from: sug */
public final class sug {
    private final Map<String, ajwy<ssv>> a;

    public sug(Map<String, ajwy<ssv>> map) {
        akcr.b(map, "operaFeatureSpecs");
        this.a = map;
    }

    public final ssv a(String str) {
        akcr.b(str, "key");
        ajwy ajwy = (ajwy) this.a.get(str);
        return ajwy != null ? (ssv) ajwy.get() : null;
    }
}
