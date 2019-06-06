package defpackage;

import com.google.common.collect.Maps;
import java.util.Map;

/* renamed from: hxk */
public final class hxk implements aiqc<Map<String, ftg>> {
    static {
        hxk hxk = new hxk();
    }

    public static Map<String, ftg> a() {
        Object newHashMap = Maps.newHashMap();
        akcr.a(newHashMap, "aMap");
        Map map = (Map) newHashMap;
        map.put("DUM_AND", ftg.AB_PLATFORM);
        map.put("Lens_Mushroom_", ftg.LENSES);
        return (Map) aiqf.a(map, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return hxk.a();
    }
}
