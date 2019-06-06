package defpackage;

/* renamed from: rwp */
public final class rwp {
    public static final int a(achb<zjm, zjk> achb, zjm zjm, akbl<? super zjm, Integer> akbl) {
        akcr.b(achb, "receiver$0");
        akcr.b(zjm, "targetPageType");
        akcr.b(akbl, "predefinedSceneForPage");
        Object obj = null;
        for (Object obj2 : achb.g()) {
            String str = "page";
            if (obj != null) {
                akcr.a(obj2, str);
                Object e = obj2.e();
                akcr.a(e, "page.pageType");
                Integer num = (Integer) akbl.invoke(e);
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        return intValue;
                    }
                }
                if (!((zjm) obj2.e()).b) {
                    return -1;
                }
            } else {
                akcr.a(obj2, str);
                if (akcr.a((zjm) obj2.e(), (Object) zjm)) {
                    obj = 1;
                }
            }
        }
        return -1;
    }
}
