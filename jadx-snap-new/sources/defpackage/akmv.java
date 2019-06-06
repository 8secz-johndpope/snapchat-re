package defpackage;

/* renamed from: akmv */
public final class akmv {
    public static final Object a = "y";
    public static final Object b = "M";
    public static final Object c = "d";
    public static final Object d = "H";
    public static final Object e = "m";
    public static final Object f = "s";
    public static final Object g = "S";

    /* renamed from: akmv$a */
    public static class a {
        public final Object a;
        public int b = 1;

        public a(Object obj) {
            this.a = obj;
        }

        public static boolean a(a[] aVarArr, Object obj) {
            for (a aVar : aVarArr) {
                if (aVar.a == obj) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.a.getClass() != aVar.a.getClass() || this.b != aVar.b) {
                    return false;
                }
                Object obj2 = this.a;
                if (obj2 instanceof StringBuilder) {
                    return obj2.toString().equals(aVar.a.toString());
                }
                if (obj2 instanceof Number) {
                    return obj2.equals(aVar.a);
                }
                if (obj2 == aVar.a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            String obj = this.a.toString();
            int i = this.b;
            if (obj == null) {
                return null;
            }
            if (i <= 0) {
                return "";
            }
            int length = obj.length();
            if (!(i == 1 || length == 0)) {
                int i2 = 0;
                if (length == 1 && i <= 8192) {
                    return akly.a(obj.charAt(0), i);
                }
                int i3 = length * i;
                if (length == 1) {
                    obj = akly.a(obj.charAt(0), i);
                } else if (length != 2) {
                    StringBuilder stringBuilder = new StringBuilder(i3);
                    while (i2 < i) {
                        stringBuilder.append(obj);
                        i2++;
                    }
                    return stringBuilder.toString();
                } else {
                    char charAt = obj.charAt(0);
                    char charAt2 = obj.charAt(1);
                    char[] cArr = new char[i3];
                    for (i = (i << 1) - 2; i >= 0; i = (i - 1) - 1) {
                        cArr[i] = charAt;
                        cArr[i + 1] = charAt2;
                    }
                    return new String(cArr);
                }
            }
            return obj;
        }
    }

    private static String a(long j, boolean z, int i) {
        return akly.a(Long.toString(j), i, '0');
    }

    public static String a(a[] aVarArr, long j, long j2, long j3, long j4, long j5) {
        a[] aVarArr2 = aVarArr;
        long j6 = j5;
        StringBuilder stringBuilder = new StringBuilder();
        int length = aVarArr2.length;
        int i = 0;
        Object obj = null;
        while (i < length) {
            int i2;
            int i3;
            a aVar = aVarArr2[i];
            Object obj2 = aVar.a;
            int i4 = aVar.b;
            long j7;
            long j8;
            long j9;
            if (obj2 instanceof StringBuilder) {
                stringBuilder.append(obj2.toString());
                j7 = j;
                j8 = j2;
                i2 = length;
                i3 = i;
                j9 = j4;
            } else {
                if (obj2 == a || obj2 == b) {
                    stringBuilder.append(akmv.a(0, true, i4));
                    j7 = j;
                } else if (obj2 == c) {
                    stringBuilder.append(akmv.a(j, true, i4));
                } else {
                    j7 = j;
                    if (obj2 == d) {
                        stringBuilder.append(akmv.a(j2, true, i4));
                        i2 = length;
                        i3 = i;
                        j9 = j4;
                        obj = null;
                    } else {
                        j8 = j2;
                        if (obj2 == e) {
                            i3 = i;
                            stringBuilder.append(akmv.a(j3, true, i4));
                            i2 = length;
                            j9 = j4;
                            obj = null;
                        } else {
                            i3 = i;
                            long j10 = j3;
                            if (obj2 == f) {
                                i2 = length;
                                stringBuilder.append(akmv.a(j4, true, i4));
                                obj = 1;
                            } else {
                                i2 = length;
                                j9 = j4;
                                if (obj2 == g) {
                                    stringBuilder.append(obj != null ? akmv.a(j6, true, Math.max(3, i4)) : akmv.a(j6, true, i4));
                                    obj = null;
                                }
                            }
                        }
                    }
                }
                j8 = j2;
                i2 = length;
                i3 = i;
                j9 = j4;
                obj = null;
            }
            i = i3 + 1;
            length = i2;
        }
        return stringBuilder.toString();
    }
}
