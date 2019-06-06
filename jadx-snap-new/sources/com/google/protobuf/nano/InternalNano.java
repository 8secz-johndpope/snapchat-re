package com.google.protobuf.nano;

import com.google.protobuf.nano.MapFactories.MapFactory;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

public final class InternalNano {
    protected static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Object LAZY_INIT_LOCK = new Object();
    public static final int TYPE_BOOL = 8;
    public static final int TYPE_BYTES = 12;
    public static final int TYPE_DOUBLE = 1;
    public static final int TYPE_ENUM = 14;
    public static final int TYPE_FIXED32 = 7;
    public static final int TYPE_FIXED64 = 6;
    public static final int TYPE_FLOAT = 2;
    public static final int TYPE_GROUP = 10;
    public static final int TYPE_INT32 = 5;
    public static final int TYPE_INT64 = 3;
    public static final int TYPE_MESSAGE = 11;
    public static final int TYPE_SFIXED32 = 15;
    public static final int TYPE_SFIXED64 = 16;
    public static final int TYPE_SINT32 = 17;
    public static final int TYPE_SINT64 = 18;
    public static final int TYPE_STRING = 9;
    public static final int TYPE_UINT32 = 13;
    public static final int TYPE_UINT64 = 4;
    protected static final Charset UTF_8 = Charset.forName("UTF-8");

    private InternalNano() {
    }

    public static byte[] bytesDefaultValue(String str) {
        return str.getBytes(ISO_8859_1);
    }

    public static void cloneUnknownFieldData(ExtendableMessageNano extendableMessageNano, ExtendableMessageNano extendableMessageNano2) {
        if (extendableMessageNano.unknownFieldData != null) {
            extendableMessageNano2.unknownFieldData = extendableMessageNano.unknownFieldData.clone();
        }
    }

    public static <K, V> int computeMapFieldSize(Map<K, V> map, int i, int i2, int i3) {
        i = CodedOutputByteBufferNano.computeTagSize(i);
        int i4 = 0;
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(1, i2, key) + CodedOutputByteBufferNano.computeFieldSize(2, i3, value);
            i4 += (i + computeFieldSize) + CodedOutputByteBufferNano.computeRawVarint32Size(computeFieldSize);
        }
        return i4;
    }

    public static byte[] copyFromUtf8(String str) {
        return str.getBytes(UTF_8);
    }

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map == null) {
            return map2.size() == 0;
        } else {
            if (map2 == null) {
                return map.size() == 0;
            } else {
                if (map.size() != map2.size()) {
                    return false;
                }
                for (Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey())) {
                        return false;
                    }
                    if (!equalsMapValue(entry.getValue(), map2.get(entry.getKey()))) {
                        return false;
                    }
                }
                return true;
            }
        }
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return (dArr == null || dArr.length == 0) ? dArr2 == null || dArr2.length == 0 : Arrays.equals(dArr, dArr2);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return (fArr == null || fArr.length == 0) ? fArr2 == null || fArr2.length == 0 : Arrays.equals(fArr, fArr2);
    }

    public static boolean equals(int[] iArr, int[] iArr2) {
        return (iArr == null || iArr.length == 0) ? iArr2 == null || iArr2.length == 0 : Arrays.equals(iArr, iArr2);
    }

    public static boolean equals(long[] jArr, long[] jArr2) {
        return (jArr == null || jArr.length == 0) ? jArr2 == null || jArr2.length == 0 : Arrays.equals(jArr, jArr2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        int length = objArr == null ? 0 : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || objArr[i] != null) {
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                Object obj = i >= length ? 1 : null;
                Object obj2 = i2 >= length2 ? 1 : null;
                if (obj != null && obj2 != null) {
                    return true;
                }
                if (obj != obj2 || !objArr[i].equals(objArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return (zArr == null || zArr.length == 0) ? zArr2 == null || zArr2.length == 0 : Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        int length = bArr == null ? 0 : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length || bArr[i] != null) {
                while (i2 < length2 && bArr2[i2] == null) {
                    i2++;
                }
                Object obj = i >= length ? 1 : null;
                Object obj2 = i2 >= length2 ? 1 : null;
                if (obj != null && obj2 != null) {
                    return true;
                }
                if (obj != obj2 || !Arrays.equals(bArr[i], bArr2[i2])) {
                    return false;
                }
                i++;
                i2++;
            } else {
                i++;
            }
        }
    }

    private static boolean equalsMapValue(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
        } else {
            throw new IllegalStateException("keys and values in maps cannot be null");
        }
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        int i = 0;
        if (map == null) {
            return 0;
        }
        for (Entry entry : map.entrySet()) {
            i += hashCodeForMap(entry.getValue()) ^ hashCodeForMap(entry.getKey());
        }
        return i;
    }

    public static int hashCode(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? 0 : Arrays.hashCode(dArr);
    }

    public static int hashCode(float[] fArr) {
        return (fArr == null || fArr.length == 0) ? 0 : Arrays.hashCode(fArr);
    }

    public static int hashCode(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    public static int hashCode(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr);
    }

    public static int hashCode(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static int hashCode(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? 0 : Arrays.hashCode(zArr);
    }

    public static int hashCode(byte[][] bArr) {
        int length = bArr == null ? 0 : bArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    private static int hashCodeForMap(Object obj) {
        return obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode();
    }

    public static final <K, V> Map<K, V> mergeMapEntry(CodedInputByteBufferNano codedInputByteBufferNano, Map<K, V> map, MapFactory mapFactory, int i, int i2, V v, int i3, int i4) {
        Object v2;
        Map forMap = mapFactory.forMap(map);
        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
        Object obj = null;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag == i3) {
                obj = codedInputByteBufferNano.readPrimitiveField(i);
            } else if (readTag == i4) {
                if (i2 == 11) {
                    codedInputByteBufferNano.readMessage((MessageNano) v2);
                } else {
                    v2 = codedInputByteBufferNano.readPrimitiveField(i2);
                }
            } else if (!codedInputByteBufferNano.skipField(readTag)) {
                break;
            }
        }
        codedInputByteBufferNano.checkLastTagWas(0);
        codedInputByteBufferNano.popLimit(pushLimit);
        if (obj == null) {
            obj = primitiveDefaultValue(i);
        }
        if (v2 == null) {
            v2 = primitiveDefaultValue(i2);
        }
        forMap.put(obj, v2);
        return forMap;
    }

    private static Object primitiveDefaultValue(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(0.0d);
            case 2:
                return Float.valueOf(MapboxConstants.MINIMUM_ZOOM);
            case 3:
            case 4:
            case 6:
            case 16:
            case 18:
                return Long.valueOf(0);
            case 5:
            case 7:
            case 13:
            case 14:
            case 15:
            case 17:
                return Integer.valueOf(0);
            case 8:
                return Boolean.FALSE;
            case 9:
                return "";
            case 12:
                return WireFormatNano.EMPTY_BYTES;
            default:
                StringBuilder stringBuilder = new StringBuilder("Type: ");
                stringBuilder.append(i);
                stringBuilder.append(" is not a primitive type.");
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static <K, V> void serializeMapField(CodedOutputByteBufferNano codedOutputByteBufferNano, Map<K, V> map, int i, int i2, int i3) {
        for (Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null || value == null) {
                throw new IllegalStateException("keys and values in maps cannot be null");
            }
            int computeFieldSize = CodedOutputByteBufferNano.computeFieldSize(1, i2, key) + CodedOutputByteBufferNano.computeFieldSize(2, i3, value);
            codedOutputByteBufferNano.writeTag(i, 2);
            codedOutputByteBufferNano.writeRawVarint32(computeFieldSize);
            codedOutputByteBufferNano.writeField(1, i2, key);
            codedOutputByteBufferNano.writeField(2, i3, value);
        }
    }

    public static String stringDefaultValue(String str) {
        return new String(str.getBytes(ISO_8859_1), UTF_8);
    }
}
