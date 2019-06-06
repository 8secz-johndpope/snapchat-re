package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: adcb */
public final class adcb {
    public static final adax a(String str, Object obj, Object obj2) {
        return adcb.a(str, new Object[]{obj, obj2});
    }

    public static final adax a(String str, Object[] objArr) {
        Throwable a = adcb.a(objArr);
        if (str == null) {
            return new adax(null, objArr, a);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i = 0;
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = str.indexOf("{}", i2);
            if (indexOf != -1) {
                Object obj;
                Map hashMap;
                if (!adcb.a(str, indexOf)) {
                    stringBuffer.append(str.substring(i2, indexOf));
                    obj = objArr[i];
                    hashMap = new HashMap();
                } else if (adcb.b(str, indexOf)) {
                    stringBuffer.append(str.substring(i2, indexOf - 1));
                    obj = objArr[i];
                    hashMap = new HashMap();
                } else {
                    i--;
                    stringBuffer.append(str.substring(i2, indexOf - 1));
                    stringBuffer.append('{');
                    indexOf++;
                    i2 = indexOf;
                    i++;
                }
                adcb.a(stringBuffer, obj, hashMap);
                indexOf += 2;
                i2 = indexOf;
                i++;
            } else if (i2 == 0) {
                return new adax(str, objArr, a);
            } else {
                stringBuffer.append(str.substring(i2, str.length()));
                return new adax(stringBuffer.toString(), objArr, a);
            }
        }
        stringBuffer.append(str.substring(i2, str.length()));
        return i < objArr.length + -1 ? new adax(stringBuffer.toString(), objArr, a) : new adax(stringBuffer.toString(), objArr, null);
    }

    private static Throwable a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void a(StringBuffer stringBuffer, Object obj) {
        stringBuffer.append(obj.toString());
    }

    private static void a(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
        } else if (!obj.getClass().isArray()) {
            adcb.a(stringBuffer, obj);
        } else if (obj instanceof boolean[]) {
            adcb.a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            adcb.a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            adcb.a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            adcb.a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            adcb.a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            adcb.a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            adcb.a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            adcb.a(stringBuffer, (double[]) obj);
        } else {
            adcb.a(stringBuffer, (Object[]) obj, map);
        }
    }

    private static void a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (map.containsKey(objArr)) {
            stringBuffer.append("...");
        } else {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                adcb.a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(ppy.d);
                }
            }
            map.remove(objArr);
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static void a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(ppy.d);
            }
        }
        stringBuffer.append(']');
    }

    private static boolean a(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    private static boolean b(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }
}
