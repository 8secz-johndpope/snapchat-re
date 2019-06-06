package defpackage;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bzo */
public final class bzo {
    public static final int a;
    public static final String b = Build.DEVICE;
    public static final String c = Build.MANUFACTURER;
    public static final String d = Build.MODEL;
    public static final String e;
    public static final int[] f = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    private static final Pattern g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    private static final Pattern h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    private static final Pattern i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: bzo$1 */
    public static class 1 implements ThreadFactory {
        private /* synthetic */ String a;

        public 1(String str) {
            this.a = str;
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, this.a);
        }
    }

    static {
        int i = (VERSION.SDK_INT == 25 && VERSION.CODENAME.charAt(0) == 'O') ? 26 : VERSION.SDK_INT;
        a = i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(d);
        stringBuilder.append(str);
        stringBuilder.append(c);
        stringBuilder.append(str);
        stringBuilder.append(a);
        e = stringBuilder.toString();
    }

    public static float a(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    public static int a(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i != AudioPlayer.INFINITY_LOOP_COUNT) {
            if (i == 2) {
                return i2 << 1;
            }
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i2 << 2;
    }

    public static int a(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    public static int a(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = binarySearch + 1;
        }
        return z ? Math.max(0, i) : i;
    }

    public static int a(long[] jArr, long j, boolean z, boolean z2) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = binarySearch ^ -1;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j);
            i = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    public static long a(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    private static long a(long j, long j2) {
        long j3 = j + j2;
        return ((j ^ j3) & (j2 ^ j3)) < 0 ? Long.MAX_VALUE : j3;
    }

    public static long a(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    public static long a(long j, blw blw, long j2, long j3) {
        if (blw.a.equals(blw)) {
            return j;
        }
        long b = bzo.b(j, blw.c);
        long a = bzo.a(j, blw.d);
        Object obj = 1;
        Object obj2 = (b > j2 || j2 > a) ? null : 1;
        if (b > j3 || j3 > a) {
            obj = null;
        }
        return (obj2 == null || obj == null) ? obj2 != null ? j2 : obj != null ? j3 : b : Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        try {
            str = new Locale(str).getISO3Language();
            return str;
        } catch (MissingResourceException unused) {
            return bzo.c(str);
        }
    }

    public static String a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.trim().split("(\\s*,\\s*)", -1);
        StringBuilder stringBuilder = new StringBuilder();
        for (String str2 : split) {
            if (i == byz.i(str2)) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(ppy.b);
                }
                stringBuilder.append(str2);
            }
        }
        return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
    }

    public static String a(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, Charset.forName("UTF-8"));
    }

    public static String a(Object[] objArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            stringBuilder.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                stringBuilder.append(ppy.d);
            }
        }
        return stringBuilder.toString();
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z);
    }

    public static void a(bxe bxe) {
        if (bxe != null) {
            try {
                bxe.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static <T> void a(List<T> list, int i, int i2) {
        list.subList(i, i2).clear();
    }

    public static void a(long[] jArr, long j) {
        int i = 0;
        if (j >= 1000000 && j % 1000000 == 0) {
            j /= 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j;
                i++;
            }
        } else if (j >= 1000000 || 1000000 % j != 0) {
            double d = (double) j;
            Double.isNaN(d);
            double d2 = 1000000.0d / d;
            while (i < jArr.length) {
                d = (double) jArr[i];
                Double.isNaN(d);
                jArr[i] = (long) (d * d2);
                i++;
            }
        } else {
            long j2 = 1000000 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j2;
                i++;
            }
        }
    }

    public static boolean a(int i) {
        return i == 10 || i == 13;
    }

    public static boolean a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int[] a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public static <T> T[] a(T[] tArr, int i) {
        byo.a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    public static int b(int i) {
        return i != 8 ? i != 16 ? i != 24 ? i != 32 ? 0 : AudioPlayer.INFINITY_LOOP_COUNT : Integer.MIN_VALUE : 2 : 3;
    }

    public static long b(long j, float f) {
        if (f == 1.0f) {
            return j;
        }
        double d = (double) j;
        double d2 = (double) f;
        Double.isNaN(d);
        Double.isNaN(d2);
        return Math.round(d / d2);
    }

    private static long b(long j, long j2) {
        long j3 = j - j2;
        return ((j ^ j3) & (j2 ^ j)) < 0 ? Long.MIN_VALUE : j3;
    }

    public static long b(long j, long j2, long j3) {
        if (j3 >= j2 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (j3 < j2 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        double d = (double) j2;
        double d2 = (double) j3;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        double d3 = (double) j;
        Double.isNaN(d3);
        return (long) (d3 * d);
    }

    public static byte[] b(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    public static String c(String str) {
        return str == null ? null : str.toLowerCase(Locale.US);
    }

    public static boolean c(int i) {
        return i == 3 || i == 2 || i == Integer.MIN_VALUE || i == AudioPlayer.INFINITY_LOOP_COUNT || i == 4;
    }

    public static long d(String str) {
        Matcher matcher = h.matcher(str);
        if (!matcher.matches()) {
            return (long) ((Double.parseDouble(str) * 3600.0d) * 1000.0d);
        }
        int isEmpty = 1 ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        group = matcher.group(5);
        parseDouble += group != null ? Double.parseDouble(group) * 2629739.0d : 0.0d;
        group = matcher.group(7);
        parseDouble += group != null ? Double.parseDouble(group) * 86400.0d : 0.0d;
        group = matcher.group(10);
        parseDouble += group != null ? 3600.0d * Double.parseDouble(group) : 0.0d;
        group = matcher.group(12);
        parseDouble += group != null ? Double.parseDouble(group) * 60.0d : 0.0d;
        String group2 = matcher.group(14);
        if (group2 != null) {
            d = Double.parseDouble(group2);
        }
        long j = (long) ((parseDouble + d) * 1000.0d);
        if (isEmpty != 0) {
            j = -j;
        }
        return j;
    }

    public static boolean d(int i) {
        return i == Integer.MIN_VALUE || i == AudioPlayer.INFINITY_LOOP_COUNT;
    }

    public static long e(String str) {
        Matcher matcher = g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (!(matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z"))) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i = -i;
                }
            }
            Calendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                StringBuilder stringBuilder = new StringBuilder("0.");
                stringBuilder.append(matcher.group(8));
                gregorianCalendar.set(14, new BigDecimal(stringBuilder.toString()).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - ((long) (i * 60000)) : timeInMillis;
        } else {
            throw new bln("Invalid date/time format: ".concat(String.valueOf(str)));
        }
    }

    public static int f(String str) {
        int length = str.length();
        byo.a(length <= 4);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i << 8) | str.charAt(i2);
        }
        return i;
    }

    public static String g(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        for (i = 0; i < length; i++) {
            if (str.charAt(i) == '%') {
                i3++;
            }
        }
        if (i3 == 0) {
            return str;
        }
        i = length - (i3 << 1);
        StringBuilder stringBuilder = new StringBuilder(i);
        Matcher matcher = i.matcher(str);
        while (i3 > 0 && matcher.find()) {
            char parseInt = (char) Integer.parseInt(matcher.group(1), 16);
            stringBuilder.append(str, i2, matcher.start());
            stringBuilder.append(parseInt);
            i2 = matcher.end();
            i3--;
        }
        if (i2 < length) {
            stringBuilder.append(str, i2, length);
        }
        return stringBuilder.length() != i ? null : stringBuilder.toString();
    }
}
