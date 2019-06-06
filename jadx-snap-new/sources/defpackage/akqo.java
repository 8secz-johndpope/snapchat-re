package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: akqo */
final class akqo {
    private static final List<akqo> d = new ArrayList();
    Object a;
    akqu b;
    akqo c;

    private akqo(Object obj, akqu akqu) {
        this.a = obj;
        this.b = akqu;
    }

    static akqo a(akqu akqu, Object obj) {
        synchronized (d) {
            int size = d.size();
            if (size > 0) {
                akqo akqo = (akqo) d.remove(size - 1);
                akqo.a = obj;
                akqo.b = akqu;
                akqo.c = null;
                return akqo;
            }
            return new akqo(obj, akqu);
        }
    }

    static void a(akqo akqo) {
        akqo.a = null;
        akqo.b = null;
        akqo.c = null;
        synchronized (d) {
            if (d.size() < 10000) {
                d.add(akqo);
            }
        }
    }
}
