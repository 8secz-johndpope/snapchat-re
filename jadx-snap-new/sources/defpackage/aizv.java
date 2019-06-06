package defpackage;

import java.util.List;
import java.util.logging.Logger;

/* renamed from: aizv */
class aizv {
    static {
        Logger.getLogger(aizv.class.getName());
    }

    private aizv() {
    }

    static byte[][] a(List<ajai> list) {
        byte[][] bArr = new byte[(list.size() << 1)][];
        int i = 0;
        for (ajai ajai : list) {
            int i2 = i + 1;
            bArr[i] = ajai.f.h();
            i = i2 + 1;
            bArr[i2] = ajai.g.h();
        }
        return aize.a(bArr);
    }
}
