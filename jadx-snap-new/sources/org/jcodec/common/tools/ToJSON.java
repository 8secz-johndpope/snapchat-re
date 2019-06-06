package org.jcodec.common.tools;

import defpackage.ppy;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.io.NIOUtils;
import org.jcodec.platform.Platform;

public class ToJSON {
    static Set<String> omitMethods = new HashSet();
    static Set<Class> primitive = new HashSet();

    static {
        primitive.add(Boolean.class);
        primitive.add(Byte.class);
        primitive.add(Short.class);
        primitive.add(Integer.class);
        primitive.add(Long.class);
        primitive.add(Float.class);
        primitive.add(Double.class);
        primitive.add(Character.class);
        omitMethods.add("getClass");
        omitMethods.add("get");
    }

    private static void escape(String str, StringBuilder stringBuilder) {
        for (char c : str.toCharArray()) {
            if (c < ' ') {
                stringBuilder.append(String.format("\\%02x", new Object[]{Integer.valueOf(c)}));
            } else {
                stringBuilder.append(c);
            }
        }
    }

    public static void fieldsToJSON(Object obj, StringBuilder stringBuilder, String[] strArr) {
        Method[] methods = Platform.getMethods(obj.getClass());
        for (String str : strArr) {
            Method findGetter = findGetter(methods, str);
            if (findGetter != null) {
                invoke(obj, IntArrayList.createIntArrayList(), stringBuilder, findGetter, str);
            }
        }
    }

    private static Method findGetter(Method[] methodArr, String str) {
        String str2 = getterName("is", str);
        str = getterName("get", str);
        for (Method method : methodArr) {
            if ((str2.equals(method.getName()) || str.equals(method.getName())) && isGetter(method)) {
                return method;
            }
        }
        return null;
    }

    private static String getterName(String str, String str2) {
        if (str2 != null) {
            char[] toCharArray = str2.toCharArray();
            if (toCharArray.length == 0) {
                return str;
            }
            if (toCharArray.length <= 1 || !Character.isUpperCase(toCharArray[1])) {
                toCharArray[0] = Character.toUpperCase(toCharArray[0]);
            } else {
                toCharArray[0] = Character.toLowerCase(toCharArray[0]);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(new String(toCharArray));
            return stringBuilder.toString();
        }
        throw new NullPointerException("Passed null string as field name");
    }

    private static void invoke(Object obj, IntArrayList intArrayList, StringBuilder stringBuilder, Method method, String str) {
        try {
            obj = method.invoke(obj, new Object[0]);
            stringBuilder.append('\"');
            stringBuilder.append(str);
            stringBuilder.append("\":");
            if (obj == null || !primitive.contains(obj.getClass())) {
                toJSONSub(obj, intArrayList, stringBuilder);
            } else {
                stringBuilder.append(obj);
            }
            stringBuilder.append(ppy.b);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Missing block: B:9:0x002c, code skipped:
            return false;
     */
    public static boolean isGetter(java.lang.reflect.Method r3) {
        /*
        r0 = r3.getModifiers();
        r0 = java.lang.reflect.Modifier.isPublic(r0);
        r1 = 0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r0 = r3.getName();
        r2 = "get";
        r0 = r0.startsWith(r2);
        if (r0 != 0) goto L_0x002d;
    L_0x0018:
        r0 = r3.getName();
        r2 = "is";
        r0 = r0.startsWith(r2);
        if (r0 == 0) goto L_0x002c;
    L_0x0024:
        r0 = r3.getReturnType();
        r2 = java.lang.Boolean.TYPE;
        if (r0 == r2) goto L_0x002d;
    L_0x002c:
        return r1;
    L_0x002d:
        r3 = r3.getParameterTypes();
        r3 = r3.length;
        if (r3 == 0) goto L_0x0035;
    L_0x0034:
        return r1;
    L_0x0035:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.common.tools.ToJSON.isGetter(java.lang.reflect.Method):boolean");
    }

    private static void toJSONSub(Object obj, IntArrayList intArrayList, StringBuilder stringBuilder) {
        String str = "null";
        if (obj == null) {
            stringBuilder.append(str);
            return;
        }
        String name = obj.getClass().getName();
        if (!name.startsWith("java.lang") || name.equals("java.lang.String")) {
            int identityHashCode = System.identityHashCode(obj);
            if (intArrayList.contains(identityHashCode)) {
                stringBuilder.append(str);
                return;
            }
            intArrayList.push(identityHashCode);
            if (obj instanceof ByteBuffer) {
                obj = NIOUtils.toArray((ByteBuffer) obj);
            }
            if (obj == null) {
                stringBuilder.append(str);
            } else {
                name = "\"";
                if (obj instanceof String) {
                    stringBuilder.append(name);
                    escape((String) obj, stringBuilder);
                } else {
                    boolean z = obj instanceof Map;
                    String str2 = "}";
                    String str3 = "{";
                    String str4 = ppy.b;
                    Iterator it;
                    if (z) {
                        it = ((Map) obj).entrySet().iterator();
                        stringBuilder.append(str3);
                        while (it.hasNext()) {
                            Entry entry = (Entry) it.next();
                            stringBuilder.append(name);
                            stringBuilder.append(entry.getKey());
                            stringBuilder.append("\":");
                            toJSONSub(entry.getValue(), intArrayList, stringBuilder);
                            if (it.hasNext()) {
                                stringBuilder.append(str4);
                            }
                        }
                    } else {
                        name = "]";
                        String str5 = "[";
                        if (obj instanceof Iterable) {
                            it = ((Iterable) obj).iterator();
                            stringBuilder.append(str5);
                            while (it.hasNext()) {
                                toJSONSub(it.next(), intArrayList, stringBuilder);
                                if (it.hasNext()) {
                                    stringBuilder.append(str4);
                                }
                            }
                        } else {
                            int i = 0;
                            int length;
                            if (obj instanceof Object[]) {
                                stringBuilder.append(str5);
                                length = Array.getLength(obj);
                                while (i < length) {
                                    toJSONSub(Array.get(obj, i), intArrayList, stringBuilder);
                                    if (i < length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                    i++;
                                }
                            } else if (obj instanceof long[]) {
                                long[] jArr = (long[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < jArr.length; length++) {
                                    stringBuilder.append(String.format("0x%016x", new Object[]{Long.valueOf(jArr[length])}));
                                    if (length < jArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof int[]) {
                                int[] iArr = (int[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < iArr.length; length++) {
                                    stringBuilder.append(String.format("0x%08x", new Object[]{Integer.valueOf(iArr[length])}));
                                    if (length < iArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof float[]) {
                                float[] fArr = (float[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < fArr.length; length++) {
                                    stringBuilder.append(String.format("%.3f", new Object[]{Float.valueOf(fArr[length])}));
                                    if (length < fArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof double[]) {
                                double[] dArr = (double[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < dArr.length; length++) {
                                    stringBuilder.append(String.format("%.6f", new Object[]{Double.valueOf(dArr[length])}));
                                    if (length < dArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof short[]) {
                                short[] sArr = (short[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < sArr.length; length++) {
                                    stringBuilder.append(String.format("0x%04x", new Object[]{Short.valueOf(sArr[length])}));
                                    if (length < sArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof byte[]) {
                                byte[] bArr = (byte[]) obj;
                                stringBuilder.append(str5);
                                for (length = 0; length < bArr.length; length++) {
                                    stringBuilder.append(String.format("0x%02x", new Object[]{Byte.valueOf(bArr[length])}));
                                    if (length < bArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                }
                            } else if (obj instanceof boolean[]) {
                                boolean[] zArr = (boolean[]) obj;
                                stringBuilder.append(str5);
                                while (i < zArr.length) {
                                    stringBuilder.append(zArr[i]);
                                    if (i < zArr.length - 1) {
                                        stringBuilder.append(str4);
                                    }
                                    i++;
                                }
                            } else if (obj.getClass().isEnum()) {
                                stringBuilder.append(String.valueOf(obj));
                            } else {
                                stringBuilder.append(str3);
                                Method[] methods = Platform.getMethods(obj.getClass());
                                identityHashCode = methods.length;
                                while (i < identityHashCode) {
                                    Method method = methods[i];
                                    if (!omitMethods.contains(method.getName()) && isGetter(method)) {
                                        invoke(obj, intArrayList, stringBuilder, method, toName(method));
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    stringBuilder.append(str2);
                }
                stringBuilder.append(name);
            }
            intArrayList.pop();
            return;
        }
        stringBuilder.append(str);
    }

    private static String toName(Method method) {
        if (isGetter(method)) {
            char[] toCharArray = method.getName().toCharArray();
            int i = toCharArray[0] == 'g' ? 3 : 2;
            toCharArray[i] = Character.toLowerCase(toCharArray[i]);
            return new String(toCharArray, i, toCharArray.length - i);
        }
        throw new IllegalArgumentException("Not a getter");
    }
}
