package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* renamed from: bny */
final class bny extends bnz {
    long a = -9223372036854775807L;

    public bny() {
        super(null);
    }

    private static Object a(bzc bzc, int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 8 ? i != 10 ? i != 11 ? null : bny.h(bzc) : bny.e(bzc) : bny.g(bzc) : bny.f(bzc) : bny.d(bzc) : bny.b(bzc) : bny.c(bzc);
    }

    private static Boolean b(bzc bzc) {
        boolean z = true;
        if (bzc.d() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    private static Double c(bzc bzc) {
        return Double.valueOf(Double.longBitsToDouble(bzc.l()));
    }

    private static String d(bzc bzc) {
        int e = bzc.e();
        int i = bzc.b;
        bzc.d(e);
        return new String(bzc.a, i, e);
    }

    private static ArrayList<Object> e(bzc bzc) {
        int o = bzc.o();
        ArrayList arrayList = new ArrayList(o);
        for (int i = 0; i < o; i++) {
            arrayList.add(bny.a(bzc, bzc.d()));
        }
        return arrayList;
    }

    private static HashMap<String, Object> f(bzc bzc) {
        HashMap hashMap = new HashMap();
        while (true) {
            String d = bny.d(bzc);
            int d2 = bzc.d();
            if (d2 == 9) {
                return hashMap;
            }
            hashMap.put(d, bny.a(bzc, d2));
        }
    }

    private static HashMap<String, Object> g(bzc bzc) {
        int o = bzc.o();
        HashMap hashMap = new HashMap(o);
        for (int i = 0; i < o; i++) {
            hashMap.put(bny.d(bzc), bny.a(bzc, bzc.d()));
        }
        return hashMap;
    }

    private static Date h(bzc bzc) {
        Date date = new Date((long) bny.c(bzc).doubleValue());
        bzc.d(2);
        return date;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(bzc bzc, long j) {
        if (bzc.d() == 2) {
            if ("onMetaData".equals(bny.d(bzc)) && bzc.d() == 8) {
                HashMap g = bny.g(bzc);
                String str = "duration";
                if (g.containsKey(str)) {
                    double doubleValue = ((Double) g.get(str)).doubleValue();
                    if (doubleValue > 0.0d) {
                        this.a = (long) (doubleValue * 1000000.0d);
                    }
                }
                return;
            }
            return;
        }
        throw new bln();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(bzc bzc) {
        return true;
    }
}
