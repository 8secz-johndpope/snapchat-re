package defpackage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: gpz */
public final class gpz {
    public final ajxe a = ajxh.a(a.a);
    public ajwy<Set<gqd>> b;
    public ajwy<Set<gqd>> c;

    /* renamed from: gpz$a */
    static final class a extends akcs implements akbk<SimpleDateFormat> {
        public static final a a = new a();

        a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SimpleDateFormat("yyyy/MM/DD HH:mm:ss:SSS z", Locale.US);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(gpz.class), "dateFormat", "getDateFormat()Ljava/text/SimpleDateFormat;");
    }

    public final List<ailj> a() {
        Set<gqd> set;
        List a;
        List arrayList = new ArrayList();
        ajwy ajwy = this.b;
        if (ajwy != null) {
            set = (Set) ajwy.get();
            if (set != null) {
                for (gqd gqd : set) {
                    if (gqd.a() != null) {
                        a = gqd.a();
                        if (a == null) {
                            akcr.a();
                        }
                        arrayList.addAll(a);
                    }
                }
            }
        }
        ajwy = this.c;
        if (ajwy != null) {
            set = (Set) ajwy.get();
            if (set != null) {
                for (gqd gqd2 : set) {
                    if (gqd2.a() != null) {
                        a = gqd2.a();
                        if (a == null) {
                            akcr.a();
                        }
                        arrayList.addAll(a);
                    }
                }
            }
        }
        return arrayList;
    }
}
