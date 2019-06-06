package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.text.TextUtils;
import defpackage.acmj.a;
import defpackage.adas.b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: adbu */
public final class adbu {
    private static final alkj[] a = new alkj[0];
    private static final Pattern b = Pattern.compile(ppy.d);

    static {
        new String[]{"https://mapbox.com/about/maps/s", "http://www.openstreetmap.org/copyright", "https://www.mapbox.com/about/maps/s/?referrer=snapchat"};
    }

    public static double a(double d) {
        return (500.0d / (Math.cos((d * 3.141592653589793d) / 180.0d) * 6378137.0d)) * 57.29577951308232d;
    }

    public static double a(double d, double d2, double d3, double d4) {
        double d5 = ((d3 - d) * 0.017453292519943295d) / 2.0d;
        d4 = ((d4 - d2) * 0.017453292519943295d) / 2.0d;
        double sin = (Math.sin(d5) * Math.sin(d5)) + (((Math.cos(d * 0.017453292519943295d) * Math.cos(d3 * 0.017453292519943295d)) * Math.sin(d4)) * Math.sin(d4));
        return (Math.atan2(Math.sqrt(sin), Math.sqrt(1.0d - sin)) * 2.0d) * 6378.0d;
    }

    public static double a(float f, cgi cgi, acmj acmj) {
        PointF b = acmj.b(cgi);
        if (b == null) {
            return 0.0d;
        }
        b.set(b.x, b.y - f);
        cgi a = acmj.a(b);
        return a == null ? 0.0d : Math.abs(adbu.b(a, cgi));
    }

    public static double a(acmj acmj) {
        return acmj != null ? acmj.i() : -1.0d;
    }

    private static int a(double d, int i) {
        double pow = Math.pow(2.0d, (double) Math.min(i, 15));
        return (int) Math.max(0.0d, Math.min((double) ((int) Math.floor(((d + 180.0d) / 360.0d) * pow)), pow - 1.0d));
    }

    public static int a(float f, float f2) {
        return (int) (((f + 1.0f) * f2) / 2.0f);
    }

    public static int a(adbv adbv, acmg acmg, acmg acmg2) {
        cgi cgi = acmg.a;
        double d = acmg.d;
        cgi cgi2 = acmg2.a;
        double pow = (double) ((int) (Math.pow(adbu.b(cgi, cgi2) / ((adbv.a(cgi2.getLatitude()) + adbv.a(cgi.getLatitude())) / 2.0d), 0.5d) * 10.0d));
        double abs = Math.abs(d - acmg2.d) * 30.0d;
        Double.isNaN(pow);
        return (int) Math.min(pow + abs, 1500.0d);
    }

    private static int a(alkj[] alkjArr, int i, int i2, int i3, int i4, int i5, int i6) {
        while (i2 <= i3) {
            int i7 = i6;
            i6 = i4;
            while (i6 <= i5) {
                int i8 = i7 + 1;
                alkjArr[i7] = new alkj().c(i).a(i6).b(i2);
                i6++;
                i7 = i8;
            }
            i2++;
            i6 = i7;
        }
        return i6;
    }

    public static alhz a(cgi cgi) {
        alhz alhz = new alhz();
        alhz.a(cgi.getLatitude());
        alhz.b(cgi.getLongitude());
        return alhz;
    }

    public static alkj a(double d, double d2, int i) {
        i = Math.min(i, 15);
        double pow = Math.pow(2.0d, (double) i);
        int floor = (int) Math.floor(((d2 + 180.0d) / 360.0d) * pow);
        d = (d * 3.141592653589793d) / 180.0d;
        int floor2 = (int) Math.floor(((1.0d - (Math.log(Math.tan(d) + (1.0d / Math.cos(d))) / 3.141592653589793d)) / 2.0d) * pow);
        pow -= 1.0d;
        int max = (int) Math.max(0.0d, Math.min((double) floor, pow));
        floor2 = (int) Math.max(0.0d, Math.min((double) floor2, pow));
        alkj alkj = new alkj();
        alkj.c(i).a(max).b(floor2);
        return alkj;
    }

    public static PointF a(cgi cgi, acmj acmj) {
        return acmj.b(cgi);
    }

    public static cgi a(nce nce, alhq alhq) {
        cgi a;
        if (alhq != null) {
            a = cgo.a((double) alhq.b, (double) alhq.c);
        } else {
            float n = nce.n();
            float o = nce.o();
            a = (n == nce.K() || o == nce.L()) ? null : cgo.a((double) n, (double) o);
        }
        return a != null ? a : null;
    }

    public static cgj a(List<alhq> list) {
        double d;
        List<alhq> list2 = list;
        double d2 = (double) ((alhq) list2.get(0)).b;
        double d3 = (double) ((alhq) list2.get(0)).b;
        double d4 = (double) ((alhq) list2.get(0)).c;
        double d5 = (double) ((alhq) list2.get(0)).c;
        for (alhq alhq : list) {
            d = (double) alhq.b;
            if (d > d2) {
                d2 = d;
            }
            if (d < d3) {
                d3 = d;
            }
            d = (double) alhq.c;
            if (d > d4) {
                d4 = d;
            }
            if (d < d5) {
                d5 = d;
            }
        }
        if (d2 - d3 < 0.001d) {
            d2 *= 1.001d;
            d3 *= 0.999d;
        }
        double min = Math.min(d2, 90.0d);
        d2 = Math.max(d3, -90.0d);
        if (d4 - d5 < 0.001d) {
            d4 *= 1.001d;
            d5 *= 0.999d;
        }
        d3 = Math.min(d4, 180.0d);
        d4 = Math.max(d5, -180.0d);
        d5 = adbu.a(min, d3, d2, d4);
        if (d5 < 3.0d && d5 > 0.0d) {
            d = 3.0d / d5;
            d5 = (min + d2) / 2.0d;
            double d6 = (d3 + d4) / 2.0d;
            min = ((min - d5) * d) + d5;
            d2 = d5 - ((d5 - d2) * d);
            d3 = ((d3 - d6) * d) + d6;
            d4 = d6 - ((d6 - d4) * d);
        }
        cgi a = cgo.a(min, d3);
        return new cgl().include(a).include(cgo.a(d2, d4)).build();
    }

    public static String a(String str, String str2) {
        if (str2 == null) {
            return null;
        }
        String[] split = b.split(str2);
        if (split.length < 3) {
            return str2;
        }
        StringBuilder stringBuilder;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str3 = ppy.d;
        if (isEmpty) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(split[0]);
            stringBuilder.append(str3);
            str2 = split[1];
        } else {
            String[] split2 = b.split(str);
            if (split2.length < 3) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(split[0]);
                stringBuilder.append(str3);
                str2 = split[1];
            } else if (TextUtils.equals(split2[2], split[2])) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(split[0]);
                stringBuilder.append(str3);
                str2 = split[1];
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(split[1]);
                stringBuilder.append(str3);
                str2 = split[2];
            }
        }
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public static void a(adbv adbv, cgi cgi, float f, a aVar) {
        acmj j = adbv.j();
        if (j != null) {
            acmg b = j.b();
            double d = (double) f;
            acmg b2 = j.b(cgi, d);
            if (b2 != null) {
                j.a(cgi, d, adbu.a(adbv, b, b2), aVar);
            }
        }
    }

    public static void a(cgj cgj, Rect rect, adbv adbv, a aVar) {
        acmj j = adbv.j();
        if (j != null) {
            acmg b = j.b();
            acmg b2 = j.b(cgj, rect);
            if (b2 != null) {
                acmj j2 = adbv.j();
                if (j2 != null) {
                    j2.a(cgj, rect, adbu.a(adbv, b, b2), aVar);
                }
            }
        }
    }

    private static boolean a(int i, cgi cgi, cgi cgi2) {
        if (i <= 64 && i > 0) {
            return true;
        }
        adcb.a("Invalid tile count requested for {}, {} = ".concat(String.valueOf(i)), (Object) cgi, (Object) cgi2);
        return false;
    }

    public static boolean a(cgi cgi, cgi cgi2) {
        return Math.abs(cgi.getLatitude() - cgi2.getLatitude()) < 0.01d && Math.abs(cgi.getLongitude() - cgi2.getLongitude()) < 0.01d;
    }

    public static boolean a(Throwable th) {
        boolean b = adbu.b(th);
        if (b) {
            b bVar = new b(th);
        }
        abss.a();
        return b;
    }

    public static alkj[] a(cgi cgi, cgi cgi2, double d, double d2) {
        Object obj;
        int min = Math.min(15, (int) d);
        alkj a = adbu.a(cgi.getLatitude(), cgi.getLongitude(), min);
        alkj a2 = adbu.a(cgi2.getLatitude(), cgi2.getLongitude(), min);
        int a3 = adbu.a(d2, min);
        if (a3 < a.a || a3 > a2.a) {
            a3 = a.a;
            a.a(a2.a);
            a2.a(a3);
            obj = 1;
        } else {
            obj = null;
        }
        int i = a2.b;
        int i2 = a.b;
        int i3;
        int a4;
        int a5;
        if (obj != null) {
            i3 = a.a;
            a4 = adbu.a(180.0d, min);
            a5 = adbu.a(-180.0d, min);
            a3 = a2.a;
            int i4 = (i2 - i) + 1;
            int i5 = (((a4 - i3) + 1) * i4) + (i4 * ((a3 - a5) + 1));
            if (!adbu.a(i5, cgi2, cgi)) {
                return a;
            }
            HashSet hashSet = new HashSet(i5);
            ArrayList arrayList = new ArrayList(i5);
            alkj[] alkjArr = new alkj[i5];
            alkj[] alkjArr2 = alkjArr;
            int i6 = min;
            i5 = i;
            int i7 = i2;
            adbu.a(alkjArr2, i6, i5, i7, a5, a3, adbu.a(alkjArr2, i6, i5, i7, i3, a4, 0));
            for (alkj a6 : alkjArr) {
                adcp adcp = new adcp(a6);
                if (!hashSet.contains(adcp)) {
                    hashSet.add(adcp);
                    arrayList.add(a6);
                }
            }
            return (alkj[]) arrayList.toArray(a);
        }
        i3 = a6.a;
        a4 = a2.a;
        a5 = ((i2 - i) + 1) * ((a4 - i3) + 1);
        if (!adbu.a(a5, cgi2, cgi)) {
            return a;
        }
        alkj[] alkjArr3 = new alkj[a5];
        adbu.a(alkjArr3, min, i, i2, i3, a4, 0);
        return alkjArr3;
    }

    private static double b(cgi cgi, cgi cgi2) {
        double latitude = cgi.getLatitude();
        double longitude = cgi.getLongitude();
        if (Double.compare(latitude, cgi2.getLatitude()) == 0 && Double.compare(longitude, cgi2.getLongitude()) == 0) {
            return 0.0d;
        }
        latitude = Math.toRadians(latitude);
        longitude = Math.toRadians(longitude);
        double toRadians = Math.toRadians(cgi2.getLatitude());
        double toRadians2 = Math.toRadians(cgi2.getLongitude());
        double cos = Math.cos(latitude);
        double cos2 = Math.cos(toRadians);
        return Math.acos(((((Math.cos(longitude) * cos) * cos2) * Math.cos(toRadians2)) + (((cos * Math.sin(longitude)) * cos2) * Math.sin(toRadians2))) + (Math.sin(latitude) * Math.sin(toRadians))) * 6378140.0d;
    }

    public static int b(float f, float f2) {
        return (int) (((1.0f - f) * f2) / 2.0f);
    }

    public static cgj b(List<je<Float, Float>> list) {
        cgl cgl = new cgl();
        for (je jeVar : list) {
            cgl.include(cgo.a((double) ((Float) jeVar.a).floatValue(), (double) ((Float) jeVar.b).floatValue()));
        }
        return list.size() < 2 ? null : cgl.build();
    }

    private static boolean b(Throwable th) {
        HashSet hashSet = new HashSet();
        Object th2;
        while (th2 != null && !hashSet.contains(th2)) {
            hashSet.add(th2);
            if ((th2 instanceof OutOfMemoryError) || (th2.getMessage() != null && th2.getMessage().contains("GL_OUT_OF_MEMORY"))) {
                return true;
            }
            th2 = th2.getCause();
        }
        return false;
    }
}
