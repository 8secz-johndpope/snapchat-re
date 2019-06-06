package defpackage;

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: aksy */
final class aksy {
    private static ConcurrentMap<Locale, aksy> n = new ConcurrentHashMap();
    final String[] a;
    final String[] b;
    final String[] c;
    final String[] d;
    final String[] e;
    final String[] f;
    final TreeMap<String, Integer> g;
    final TreeMap<String, Integer> h;
    final TreeMap<String, Integer> i;
    final int j;
    final int k;
    final int l;
    final int m;
    private final int o;
    private final int p;

    private aksy(Locale locale) {
        DateFormatSymbols a = akrb.a(locale);
        this.a = a.getEras();
        this.b = aksy.b(a.getWeekdays());
        this.c = aksy.b(a.getShortWeekdays());
        this.d = aksy.a(a.getMonths());
        this.e = aksy.a(a.getShortMonths());
        this.f = a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        this.g = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        aksy.a(this.g, this.a, numArr);
        if ("en".equals(locale.getLanguage())) {
            this.g.put("BCE", numArr[0]);
            this.g.put("CE", numArr[1]);
        }
        this.h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        aksy.a(this.h, this.b, numArr);
        aksy.a(this.h, this.c, numArr);
        aksy.a(this.h, 7, numArr);
        this.i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        aksy.a(this.i, this.d, numArr);
        aksy.a(this.i, this.e, numArr);
        aksy.a(this.i, 12, numArr);
        this.j = aksy.c(this.a);
        this.k = aksy.c(this.b);
        this.o = aksy.c(this.c);
        this.l = aksy.c(this.d);
        this.p = aksy.c(this.e);
        this.m = aksy.c(this.f);
    }

    static aksy a(Locale locale) {
        Object locale2;
        if (locale2 == null) {
            locale2 = Locale.getDefault();
        }
        aksy aksy = (aksy) n.get(locale2);
        if (aksy != null) {
            return aksy;
        }
        aksy = new aksy(locale2);
        aksy aksy2 = (aksy) n.putIfAbsent(locale2, aksy);
        return aksy2 != null ? aksy2 : aksy;
    }

    private static void a(TreeMap<String, Integer> treeMap, int i, Integer[] numArr) {
        for (int i2 = 1; i2 <= i; i2++) {
            treeMap.put(String.valueOf(i2).intern(), numArr[i2]);
        }
    }

    private static void a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                Object obj = strArr[length];
                if (obj != null) {
                    treeMap.put(obj, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    private static String[] a(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    private static String[] b(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    private static int c(String[] strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            String str = strArr[length];
            if (str != null) {
                int length2 = str.length();
                if (length2 > i) {
                    i = length2;
                }
            }
        }
    }
}
