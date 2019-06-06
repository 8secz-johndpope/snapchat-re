package defpackage;

import java.util.Set;

/* renamed from: yjk */
public final class yjk {
    private final gfl a;
    private final gee b;
    private final geo c;

    public yjk(gee gee, String str, geo geo) {
        akcr.b(gee, "contentManager");
        akcr.b(str, "assetName");
        akcr.b(geo, "contentType");
        this.b = gee;
        this.c = geo;
        this.a = gii.a(str);
    }

    public final ajdx<gej> a(String str, ajdx<kaz<jwj>> ajdx, Set<rzg> set, Set<? extends gdy> set2) {
        akcr.b(str, "id");
        akcr.b(ajdx, "bitmapProvider");
        akcr.b(set, "schedulingContexts");
        akcr.b(set2, "cacheAccessControls");
        String str2 = str;
        Object a = this.b.a(new gew(str2, null, gem.b((ajdx) ajdx, yjo.a), this.a, this.c, set, set2, 260)).a(false);
        akcr.a(a, "contentManager.submit(De…        .getResult(false)");
        return a;
    }
}
