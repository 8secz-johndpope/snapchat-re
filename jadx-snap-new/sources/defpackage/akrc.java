package defpackage;

import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.convert.FromString;

/* renamed from: akrc */
public abstract class akrc implements Serializable {
    public static final akrc a = aksa.c;
    private static final AtomicReference<akus> c = new AtomicReference();
    private static final AtomicReference<akur> d = new AtomicReference();
    private static final AtomicReference<akrc> e = new AtomicReference();
    public final String b;

    /* renamed from: akrc$a */
    static final class a {
        static final Map<String, String> a;
        static final akty b;

        /* renamed from: akrc$a$1 */
        static class 1 extends aksn {
            1() {
            }

            public final akqx a(akrc akrc) {
                return this;
            }

            public final akrc a() {
                return null;
            }

            public final akqx b() {
                return this;
            }

            public final String toString() {
                return getClass().getName();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            hashMap.put("GMT", "UTC");
            String str = "WET";
            hashMap.put(str, str);
            str = "CET";
            hashMap.put(str, str);
            hashMap.put("MET", str);
            hashMap.put("ECT", str);
            str = "EET";
            hashMap.put(str, str);
            hashMap.put("MIT", "Pacific/Apia");
            hashMap.put("HST", "Pacific/Honolulu");
            hashMap.put("AST", "America/Anchorage");
            hashMap.put("PST", "America/Los_Angeles");
            hashMap.put("MST", "America/Denver");
            hashMap.put("PNT", "America/Phoenix");
            hashMap.put("CST", "America/Chicago");
            hashMap.put("EST", "America/New_York");
            hashMap.put("IET", "America/Indiana/Indianapolis");
            hashMap.put("PRT", "America/Puerto_Rico");
            hashMap.put("CNT", "America/St_Johns");
            hashMap.put("AGT", "America/Argentina/Buenos_Aires");
            hashMap.put("BET", "America/Sao_Paulo");
            hashMap.put("ART", "Africa/Cairo");
            hashMap.put("CAT", "Africa/Harare");
            hashMap.put("EAT", "Africa/Addis_Ababa");
            hashMap.put("NET", "Asia/Yerevan");
            hashMap.put("PLT", "Asia/Karachi");
            hashMap.put("IST", "Asia/Kolkata");
            hashMap.put("BST", "Asia/Dhaka");
            hashMap.put("VST", "Asia/Ho_Chi_Minh");
            hashMap.put("CTT", "Asia/Shanghai");
            hashMap.put("JST", "Asia/Tokyo");
            hashMap.put("ACT", "Australia/Darwin");
            hashMap.put("AET", "Australia/Sydney");
            hashMap.put("SST", "Pacific/Guadalcanal");
            hashMap.put("NST", "Pacific/Auckland");
            a = Collections.unmodifiableMap(hashMap);
            akqx 1 = new 1();
            akty a = new aktz().a(null, true, 4).a();
            if (a.e != 1) {
                a = new akty(a.a, a.b, a.c, a.d, 1, a.f, a.g, a.h);
            }
            b = a;
        }
    }

    protected akrc(String str) {
        if (str != null) {
            this.b = str;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }

    public static akrc a() {
        Object obj = (akrc) e.get();
        if (obj != null) {
            return obj;
        }
        try {
            String property = System.getProperty("user.timezone");
            if (property != null) {
                obj = akrc.a(property);
            }
        } catch (RuntimeException unused) {
        }
        if (obj == null) {
            try {
                obj = akrc.a(TimeZone.getDefault());
            } catch (IllegalArgumentException unused2) {
            }
        }
        if (obj == null) {
            obj = a;
        }
        return !e.compareAndSet(null, obj) ? (akrc) e.get() : obj;
    }

    public static akrc a(int i) {
        if (i >= -86399999 && i <= 86399999) {
            return akrc.a(akrc.b(i), i);
        }
        throw new IllegalArgumentException("Millis out of range: ".concat(String.valueOf(i)));
    }

    @FromString
    public static akrc a(String str) {
        if (str == null) {
            return akrc.a();
        }
        if (str.equals("UTC")) {
            return a;
        }
        akrc zone = akrc.b().getZone(str);
        if (zone != null) {
            return zone;
        }
        if (str.startsWith("+") || str.startsWith("-")) {
            int d = akrc.d(str);
            return ((long) d) == 0 ? a : akrc.a(akrc.b(d), d);
        } else {
            StringBuilder stringBuilder = new StringBuilder("The datetime zone id '");
            stringBuilder.append(str);
            stringBuilder.append("' is not recognised");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static akrc a(String str, int i) {
        return i == 0 ? a : new akuq(str, null, i, i);
    }

    public static akrc a(TimeZone timeZone) {
        if (timeZone == null) {
            return akrc.a();
        }
        String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        } else if (id.equals("UTC")) {
            return a;
        } else {
            akrc akrc = null;
            String c = akrc.c(id);
            akus b = akrc.b();
            if (c != null) {
                akrc = b.getZone(c);
            }
            if (akrc == null) {
                akrc = b.getZone(id);
            }
            if (akrc != null) {
                return akrc;
            }
            if (c == null && (id.startsWith("GMT+") || id.startsWith("GMT-"))) {
                id = id.substring(3);
                if (id.length() > 2) {
                    char charAt = id.charAt(1);
                    if (charAt > '9' && Character.isDigit(charAt)) {
                        id = akrc.b(id);
                    }
                }
                int d = akrc.d(id);
                return ((long) d) == 0 ? a : akrc.a(akrc.b(d), d);
            } else {
                StringBuilder stringBuilder = new StringBuilder("The datetime zone id '");
                stringBuilder.append(id);
                stringBuilder.append("' is not recognised");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
    }

    private static akus a(akus akus) {
        Set availableIDs = akus.getAvailableIDs();
        if (availableIDs == null || availableIDs.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        String str = "UTC";
        if (!availableIDs.contains(str)) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        } else if (a.equals(akus.getZone(str))) {
            return akus;
        } else {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        }
    }

    public static akus b() {
        akus akus = (akus) c.get();
        if (akus != null) {
            return akus;
        }
        akus = akrc.e();
        return !c.compareAndSet(null, akus) ? (akus) c.get() : akus;
    }

    public static String b(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i2 = i / TelemetryConstants.ONE_HOUR_IN_MS;
        akud.a(stringBuffer, i2, 2);
        i -= i2 * TelemetryConstants.ONE_HOUR_IN_MS;
        i2 = i / 60000;
        stringBuffer.append(':');
        akud.a(stringBuffer, i2, 2);
        i -= i2 * 60000;
        if (i == 0) {
            return stringBuffer.toString();
        }
        int i3 = i / MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
        stringBuffer.append(':');
        akud.a(stringBuffer, i3, 2);
        i -= i3 * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
        if (i == 0) {
            return stringBuffer.toString();
        }
        stringBuffer.append('.');
        akud.a(stringBuffer, i, 3);
        return stringBuffer.toString();
    }

    private static String b(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < stringBuilder.length(); i++) {
            int digit = Character.digit(stringBuilder.charAt(i), 10);
            if (digit >= 0) {
                stringBuilder.setCharAt(i, (char) (digit + 48));
            }
        }
        return stringBuilder.toString();
    }

    public static akur c() {
        akur akur = (akur) d.get();
        if (akur != null) {
            return akur;
        }
        akur = akrc.f();
        return !d.compareAndSet(null, akur) ? (akur) d.get() : akur;
    }

    private static String c(String str) {
        return (String) a.a.get(str);
    }

    private static int d(String str) {
        return -((int) a.b.a(str));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003c */
    private static defpackage.akus e() {
        /*
        r0 = "org.joda.time.DateTimeZone.Provider";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x001e }
        if (r0 == 0) goto L_0x001e;
    L_0x0008:
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = r0.newInstance();	 Catch:{ Exception -> 0x0017 }
        r0 = (defpackage.akus) r0;	 Catch:{ Exception -> 0x0017 }
        r0 = defpackage.akrc.a(r0);	 Catch:{ Exception -> 0x0017 }
        return r0;
    L_0x0017:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x001e }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x001e }
        throw r1;	 Catch:{ SecurityException -> 0x001e }
    L_0x001e:
        r0 = "org.joda.time.DateTimeZone.Folder";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x003c }
        if (r0 == 0) goto L_0x003c;
    L_0x0026:
        r1 = new akuu;	 Catch:{ Exception -> 0x0035 }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x0035 }
        r2.<init>(r0);	 Catch:{ Exception -> 0x0035 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0035 }
        r0 = defpackage.akrc.a(r1);	 Catch:{ Exception -> 0x0035 }
        return r0;
    L_0x0035:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x003c }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x003c }
        throw r1;	 Catch:{ SecurityException -> 0x003c }
    L_0x003c:
        r0 = new akuu;	 Catch:{ Exception -> 0x0048 }
        r1 = "org/joda/time/tz/data";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0048 }
        r0 = defpackage.akrc.a(r0);	 Catch:{ Exception -> 0x0048 }
        return r0;
    L_0x0048:
        r0 = move-exception;
        r0.printStackTrace();
        r0 = new akut;
        r0.<init>();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akrc.e():akus");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    private static defpackage.akur f() {
        /*
        r0 = "org.joda.time.DateTimeZone.NameProvider";
        r0 = java.lang.System.getProperty(r0);	 Catch:{ SecurityException -> 0x001a }
        if (r0 == 0) goto L_0x001a;
    L_0x0008:
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0013 }
        r0 = r0.newInstance();	 Catch:{ Exception -> 0x0013 }
        r0 = (defpackage.akur) r0;	 Catch:{ Exception -> 0x0013 }
        goto L_0x001b;
    L_0x0013:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ SecurityException -> 0x001a }
        r1.<init>(r0);	 Catch:{ SecurityException -> 0x001a }
        throw r1;	 Catch:{ SecurityException -> 0x001a }
    L_0x001a:
        r0 = 0;
    L_0x001b:
        if (r0 != 0) goto L_0x0022;
    L_0x001d:
        r0 = new akup;
        r0.<init>();
    L_0x0022:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akrc.f():akur");
    }

    public final long a(long j, long j2) {
        int b = b(j2);
        long j3 = j - ((long) b);
        return b(j3) == b ? j3 : g(j);
    }

    public final long a(akrc akrc, long j) {
        if (akrc == null) {
            akrc = akrc.a();
        }
        return akrc == this ? j : akrc.a(f(j), j);
    }

    public abstract String a(long j);

    public abstract int b(long j);

    public abstract int c(long j);

    public abstract boolean d();

    public final boolean d(long j) {
        return b(j) == c(j);
    }

    public int e(long j) {
        int b = b(j);
        long j2 = j - ((long) b);
        int b2 = b(j2);
        if (b != b2) {
            if (b - b2 < 0) {
                long h = h(j2);
                if (h == j2) {
                    h = Long.MAX_VALUE;
                }
                j -= (long) b2;
                j2 = h(j);
                if (j2 == j) {
                    j2 = Long.MAX_VALUE;
                }
                if (h != j2) {
                    return b;
                }
            }
        } else if (b >= 0) {
            j = i(j2);
            if (j < j2) {
                int b3 = b(j);
                if (j2 - j <= ((long) (b3 - b))) {
                    return b3;
                }
            }
        }
        return b2;
    }

    public abstract boolean equals(Object obj);

    public final long f(long j) {
        long b = (long) b(j);
        long j2 = j + b;
        if ((j ^ j2) >= 0 || (j ^ b) < 0) {
            return j2;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    /* JADX WARNING: Missing block: B:10:0x002c, code skipped:
            if (r4 != r6) goto L_0x0030;
     */
    public final long g(long r12) {
        /*
        r11 = this;
        r0 = r11.b(r12);
        r1 = (long) r0;
        r1 = r12 - r1;
        r3 = r11.b(r1);
        if (r0 == r3) goto L_0x002f;
    L_0x000d:
        if (r0 >= 0) goto L_0x002f;
    L_0x000f:
        r4 = r11.h(r1);
        r6 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1));
        if (r8 != 0) goto L_0x001d;
    L_0x001c:
        r4 = r6;
    L_0x001d:
        r1 = (long) r3;
        r1 = r12 - r1;
        r8 = r11.h(r1);
        r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1));
        if (r10 != 0) goto L_0x0029;
    L_0x0028:
        goto L_0x002a;
    L_0x0029:
        r6 = r8;
    L_0x002a:
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r1 == 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0030;
    L_0x002f:
        r0 = r3;
    L_0x0030:
        r0 = (long) r0;
        r2 = r12 - r0;
        r4 = r12 ^ r2;
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 >= 0) goto L_0x0049;
    L_0x003b:
        r12 = r12 ^ r0;
        r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0049;
    L_0x0041:
        r12 = new java.lang.ArithmeticException;
        r13 = "Subtracting time zone offset caused overflow";
        r12.<init>(r13);
        throw r12;
    L_0x0049:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akrc.g(long):long");
    }

    public abstract long h(long j);

    public int hashCode() {
        return this.b.hashCode() + 57;
    }

    public abstract long i(long j);

    public String toString() {
        return this.b;
    }
}
