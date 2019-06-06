package defpackage;

import com.google.common.base.Preconditions;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: aiyx */
public final class aiyx {
    static final /* synthetic */ boolean a = (aiyx.class.desiredAssertionStatus() ^ 1);
    private static final long b = TimeUnit.SECONDS.toNanos(1);

    private aiyx() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ee A:{Catch:{ IllegalArgumentException -> 0x0109 }} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c7 A:{Catch:{ IllegalArgumentException -> 0x0109 }} */
    private static long a(java.lang.String r13) {
        /*
        r0 = r13.isEmpty();
        r1 = "Invalid duration string: ";
        r2 = 0;
        if (r0 != 0) goto L_0x011f;
    L_0x0009:
        r0 = r13.length();
        r3 = 1;
        r0 = r0 - r3;
        r0 = r13.charAt(r0);
        r4 = 115; // 0x73 float:1.61E-43 double:5.7E-322;
        if (r0 != r4) goto L_0x011f;
    L_0x0017:
        r0 = r13.charAt(r2);
        r4 = 45;
        if (r0 != r4) goto L_0x0025;
    L_0x001f:
        r13 = r13.substring(r3);
        r0 = 1;
        goto L_0x0026;
    L_0x0025:
        r0 = 0;
    L_0x0026:
        r4 = r13.length();
        r4 = r4 - r3;
        r4 = r13.substring(r2, r4);
        r5 = 46;
        r5 = r4.indexOf(r5);
        r6 = -1;
        if (r5 == r6) goto L_0x0043;
    L_0x0038:
        r6 = r5 + 1;
        r6 = r4.substring(r6);
        r4 = r4.substring(r2, r5);
        goto L_0x0045;
    L_0x0043:
        r6 = "";
    L_0x0045:
        r4 = java.lang.Long.parseLong(r4);
        r7 = r6.isEmpty();
        if (r7 == 0) goto L_0x0051;
    L_0x004f:
        r6 = 0;
        goto L_0x0055;
    L_0x0051:
        r6 = defpackage.aiyx.b(r6);
    L_0x0055:
        r7 = 0;
        r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r9 < 0) goto L_0x0111;
    L_0x005b:
        if (r0 == 0) goto L_0x005f;
    L_0x005d:
        r4 = -r4;
        r6 = -r6;
    L_0x005f:
        r0 = (long) r6;
        r9 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = -r9;
        r13 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r13 <= 0) goto L_0x006d;
    L_0x0067:
        r9 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r13 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1));
        if (r13 < 0) goto L_0x0079;
    L_0x006d:
        r9 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = r0 / r9;
        r4 = com.google.common.math.LongMath.checkedAdd(r4, r9);	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r0 = r0 % r9;
        r6 = (int) r0;	 Catch:{ IllegalArgumentException -> 0x0109 }
    L_0x0079:
        r0 = 1;
        r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r13 <= 0) goto L_0x0087;
    L_0x007f:
        if (r6 >= 0) goto L_0x0087;
    L_0x0081:
        r9 = (long) r6;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r11 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = r9 + r11;
        r6 = (int) r9;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r4 = r4 - r0;
    L_0x0087:
        r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r13 >= 0) goto L_0x0093;
    L_0x008b:
        if (r6 <= 0) goto L_0x0093;
    L_0x008d:
        r9 = (long) r6;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r11 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = r9 - r11;
        r6 = (int) r9;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r4 = r4 + r0;
    L_0x0093:
        r9 = -315576000000; // 0xffffffb686346200 float:-3.3926236E-35 double:NaN;
        r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r13 < 0) goto L_0x00c4;
    L_0x009c:
        r9 = 315576000000; // 0x4979cb9e00 float:1.3215511E35 double:1.55915260252E-312;
        r13 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1));
        if (r13 <= 0) goto L_0x00a6;
    L_0x00a5:
        goto L_0x00c4;
    L_0x00a6:
        r9 = (long) r6;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r11 = -999999999; // 0xffffffffc4653601 float:-916.8438 double:NaN;
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 < 0) goto L_0x00c4;
    L_0x00ae:
        r11 = b;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1));
        if (r13 < 0) goto L_0x00b5;
    L_0x00b4:
        goto L_0x00c4;
    L_0x00b5:
        r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r13 < 0) goto L_0x00bb;
    L_0x00b9:
        if (r6 >= 0) goto L_0x00c2;
    L_0x00bb:
        r13 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r13 > 0) goto L_0x00c4;
    L_0x00bf:
        if (r6 <= 0) goto L_0x00c2;
    L_0x00c1:
        goto L_0x00c4;
    L_0x00c2:
        r13 = 1;
        goto L_0x00c5;
    L_0x00c4:
        r13 = 0;
    L_0x00c5:
        if (r13 == 0) goto L_0x00ee;
    L_0x00c7:
        r13 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r4 = r13.toNanos(r4);	 Catch:{ IllegalArgumentException -> 0x0109 }
        r9 = (long) r6;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r11 = r4 + r9;
        r9 = r9 ^ r4;
        r13 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r13 >= 0) goto L_0x00d7;
    L_0x00d5:
        r13 = 1;
        goto L_0x00d8;
    L_0x00d7:
        r13 = 0;
    L_0x00d8:
        r4 = r4 ^ r11;
        r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r6 < 0) goto L_0x00de;
    L_0x00dd:
        r2 = 1;
    L_0x00de:
        r13 = r13 | r2;
        if (r13 == 0) goto L_0x00e2;
    L_0x00e1:
        return r11;
    L_0x00e2:
        r2 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r13 = 63;
        r4 = r11 >>> r13;
        r0 = r0 ^ r4;
        r0 = r0 + r2;
        return r0;
    L_0x00ee:
        r13 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r0 = "Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds";
        r1 = 2;
        r1 = new java.lang.Object[r1];	 Catch:{ IllegalArgumentException -> 0x0109 }
        r4 = java.lang.Long.valueOf(r4);	 Catch:{ IllegalArgumentException -> 0x0109 }
        r1[r2] = r4;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r4 = java.lang.Integer.valueOf(r6);	 Catch:{ IllegalArgumentException -> 0x0109 }
        r1[r3] = r4;	 Catch:{ IllegalArgumentException -> 0x0109 }
        r0 = java.lang.String.format(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0109 }
        r13.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x0109 }
        throw r13;	 Catch:{ IllegalArgumentException -> 0x0109 }
    L_0x0109:
        r13 = new java.text.ParseException;
        r0 = "Duration value is out of range.";
        r13.<init>(r0, r2);
        throw r13;
    L_0x0111:
        r0 = new java.text.ParseException;
        r13 = java.lang.String.valueOf(r13);
        r13 = r1.concat(r13);
        r0.<init>(r13, r2);
        throw r0;
    L_0x011f:
        r0 = new java.text.ParseException;
        r13 = java.lang.String.valueOf(r13);
        r13 = r1.concat(r13);
        r0.<init>(r13, r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiyx.a(java.lang.String):long");
    }

    static Long a(Map<String, Object> map) {
        String str = "initialBackoff";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(aiyx.a(aiyx.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static List<Map<String, Object>> a(List<Object> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof Map) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not object", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    static List<Object> a(Map<String, Object> map, String str) {
        if (a || map.containsKey(str)) {
            Object checkNotNull = Preconditions.checkNotNull(map.get(str), "no such key %s", (Object) str);
            if (checkNotNull instanceof List) {
                return (List) checkNotNull;
            }
            throw new ClassCastException(String.format("value %s for key %s in %s is not List", new Object[]{checkNotNull, str, map}));
        }
        throw new AssertionError();
    }

    private static int b(String str) {
        int i = 0;
        int i2 = 0;
        while (i < 9) {
            i2 *= 10;
            if (i < str.length()) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    throw new ParseException("Invalid nanoseconds.", 0);
                }
                i2 += str.charAt(i) - 48;
            }
            i++;
        }
        return i2;
    }

    static Long b(Map<String, Object> map) {
        String str = "maxBackoff";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(aiyx.a(aiyx.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static List<String> b(List<Object> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) instanceof String) {
                i++;
            } else {
                throw new ClassCastException(String.format("value %s for idx %d in %s is not string", new Object[]{list.get(i), Integer.valueOf(i), list}));
            }
        }
        return list;
    }

    static Map<String, Object> b(Map<String, Object> map, String str) {
        if (a || map.containsKey(str)) {
            Object checkNotNull = Preconditions.checkNotNull(map.get(str), "no such key %s", (Object) str);
            if (checkNotNull instanceof Map) {
                return (Map) checkNotNull;
            }
            throw new ClassCastException(String.format("value %s for key %s in %s is not object", new Object[]{checkNotNull, str, map}));
        }
        throw new AssertionError();
    }

    static Double c(Map<String, Object> map, String str) {
        if (a || map.containsKey(str)) {
            Object checkNotNull = Preconditions.checkNotNull(map.get(str), "no such key %s", (Object) str);
            if (checkNotNull instanceof Double) {
                return (Double) checkNotNull;
            }
            throw new ClassCastException(String.format("value %s for key %s in %s is not Double", new Object[]{checkNotNull, str, map}));
        }
        throw new AssertionError();
    }

    static Long c(Map<String, Object> map) {
        String str = "hedgingDelay";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(aiyx.a(aiyx.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    static Long d(Map<String, Object> map) {
        String str = "timeout";
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Long.valueOf(aiyx.a(aiyx.d(map, str)));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static String d(Map<String, Object> map, String str) {
        if (a || map.containsKey(str)) {
            Object checkNotNull = Preconditions.checkNotNull(map.get(str), "no such key %s", (Object) str);
            if (checkNotNull instanceof String) {
                return (String) checkNotNull;
            }
            throw new ClassCastException(String.format("value %s for key %s in %s is not String", new Object[]{checkNotNull, str, map}));
        }
        throw new AssertionError();
    }
}
