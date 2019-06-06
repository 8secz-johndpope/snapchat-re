package defpackage;

import defpackage.akdw.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: akgc */
public class akgc extends akgb {

    /* renamed from: akgc$b */
    static final class b extends akcs implements akbw<CharSequence, Integer, ajxm<? extends Integer, ? extends Integer>> {
        private /* synthetic */ List a;
        private /* synthetic */ boolean b;

        b(List list, boolean z) {
            this.a = list;
            this.b = z;
            super(2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:63:0x0149 A:{RETURN} */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0136  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x0149 A:{RETURN} */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r18, java.lang.Object r19) {
            /*
            r17 = this;
            r0 = r17;
            r7 = r18;
            r7 = (java.lang.CharSequence) r7;
            r1 = r19;
            r1 = (java.lang.Number) r1;
            r1 = r1.intValue();
            r2 = "receiver$0";
            defpackage.akcr.b(r7, r2);
            r3 = r0.a;
            r8 = r3;
            r8 = (java.util.Collection) r8;
            r15 = r0.b;
            r3 = 0;
            r16 = 0;
            if (r15 != 0) goto L_0x0091;
        L_0x001f:
            r4 = r8.size();
            r5 = 1;
            if (r4 != r5) goto L_0x0091;
        L_0x0026:
            r8 = (java.lang.Iterable) r8;
            defpackage.akcr.b(r8, r2);
            r4 = r8 instanceof java.util.List;
            if (r4 == 0) goto L_0x0055;
        L_0x002f:
            r8 = (java.util.List) r8;
            defpackage.akcr.b(r8, r2);
            r2 = r8.size();
            if (r2 == 0) goto L_0x004b;
        L_0x003a:
            if (r2 != r5) goto L_0x0041;
        L_0x003c:
            r2 = r8.get(r3);
            goto L_0x006a;
        L_0x0041:
            r1 = new java.lang.IllegalArgumentException;
            r2 = "List has more than one element.";
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x004b:
            r1 = new java.util.NoSuchElementException;
            r2 = "List is empty.";
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x0055:
            r2 = r8.iterator();
            r4 = r2.hasNext();
            if (r4 == 0) goto L_0x0087;
        L_0x005f:
            r4 = r2.next();
            r2 = r2.hasNext();
            if (r2 != 0) goto L_0x007d;
        L_0x0069:
            r2 = r4;
        L_0x006a:
            r2 = (java.lang.String) r2;
            r4 = 4;
            r1 = defpackage.akgc.a(r7, r2, r1, r3, r4);
            if (r1 < 0) goto L_0x0132;
        L_0x0073:
            r1 = java.lang.Integer.valueOf(r1);
            r1 = defpackage.ajxs.a(r1, r2);
            goto L_0x0134;
        L_0x007d:
            r1 = new java.lang.IllegalArgumentException;
            r2 = "Collection has more than one element.";
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x0087:
            r1 = new java.util.NoSuchElementException;
            r2 = "Collection is empty.";
            r1.<init>(r2);
            r1 = (java.lang.Throwable) r1;
            throw r1;
        L_0x0091:
            r1 = defpackage.akef.b(r1, r3);
            r2 = new akdy;
            r3 = r7.length();
            r2.<init>(r1, r3);
            r2 = (defpackage.akdw) r2;
            r1 = r7 instanceof java.lang.String;
            if (r1 == 0) goto L_0x00e9;
        L_0x00a4:
            r1 = r2.a;
            r3 = r2.b;
            r2 = r2.c;
            if (r2 <= 0) goto L_0x00af;
        L_0x00ac:
            if (r1 > r3) goto L_0x0132;
        L_0x00ae:
            goto L_0x00b1;
        L_0x00af:
            if (r1 < r3) goto L_0x0132;
        L_0x00b1:
            r4 = r8;
            r4 = (java.lang.Iterable) r4;
            r4 = r4.iterator();
        L_0x00b8:
            r5 = r4.hasNext();
            if (r5 == 0) goto L_0x00d6;
        L_0x00be:
            r5 = r4.next();
            r9 = r5;
            r9 = (java.lang.String) r9;
            r10 = 0;
            r11 = r7;
            r11 = (java.lang.String) r11;
            r13 = r9.length();
            r12 = r1;
            r14 = r15;
            r6 = defpackage.akgb.a(r9, r10, r11, r12, r13, r14);
            if (r6 == 0) goto L_0x00b8;
        L_0x00d5:
            goto L_0x00d8;
        L_0x00d6:
            r5 = r16;
        L_0x00d8:
            r5 = (java.lang.String) r5;
            if (r5 == 0) goto L_0x00e5;
        L_0x00dc:
            r1 = java.lang.Integer.valueOf(r1);
            r1 = defpackage.ajxs.a(r1, r5);
            goto L_0x0134;
        L_0x00e5:
            if (r1 == r3) goto L_0x0132;
        L_0x00e7:
            r1 = r1 + r2;
            goto L_0x00b1;
        L_0x00e9:
            r1 = r2.a;
            r9 = r2.b;
            r10 = r2.c;
            if (r10 <= 0) goto L_0x00f4;
        L_0x00f1:
            if (r1 > r9) goto L_0x0132;
        L_0x00f3:
            goto L_0x00f6;
        L_0x00f4:
            if (r1 < r9) goto L_0x0132;
        L_0x00f6:
            r11 = r1;
        L_0x00f7:
            r1 = r8;
            r1 = (java.lang.Iterable) r1;
            r12 = r1.iterator();
        L_0x00fe:
            r1 = r12.hasNext();
            if (r1 == 0) goto L_0x011f;
        L_0x0104:
            r13 = r12.next();
            r1 = r13;
            r1 = (java.lang.String) r1;
            r2 = r1;
            r2 = (java.lang.CharSequence) r2;
            r3 = 0;
            r5 = r1.length();
            r1 = r2;
            r2 = r3;
            r3 = r7;
            r4 = r11;
            r6 = r15;
            r1 = defpackage.akgc.a(r1, r2, r3, r4, r5, r6);
            if (r1 == 0) goto L_0x00fe;
        L_0x011e:
            goto L_0x0121;
        L_0x011f:
            r13 = r16;
        L_0x0121:
            r13 = (java.lang.String) r13;
            if (r13 == 0) goto L_0x012e;
        L_0x0125:
            r1 = java.lang.Integer.valueOf(r11);
            r1 = defpackage.ajxs.a(r1, r13);
            goto L_0x0134;
        L_0x012e:
            if (r11 == r9) goto L_0x0132;
        L_0x0130:
            r11 = r11 + r10;
            goto L_0x00f7;
        L_0x0132:
            r1 = r16;
        L_0x0134:
            if (r1 == 0) goto L_0x0149;
        L_0x0136:
            r2 = r1.a;
            r1 = r1.b;
            r1 = (java.lang.String) r1;
            r1 = r1.length();
            r1 = java.lang.Integer.valueOf(r1);
            r1 = defpackage.ajxs.a(r2, r1);
            return r1;
        L_0x0149:
            return r16;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akgc$b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: akgc$c */
    static final class c extends akcs implements akbl<akdy, String> {
        private /* synthetic */ CharSequence a;

        c(CharSequence charSequence) {
            this.a = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akdy akdy = (akdy) obj;
            akcr.b(akdy, "it");
            return akgc.a(this.a, akdy);
        }
    }

    /* renamed from: akgc$a */
    static final class a extends akcs implements akbw<CharSequence, Integer, ajxm<? extends Integer, ? extends Integer>> {
        private /* synthetic */ char[] a;
        private /* synthetic */ boolean b;

        a(char[] cArr, boolean z) {
            this.a = cArr;
            this.b = z;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            CharSequence charSequence = (CharSequence) obj;
            int intValue = ((Number) obj2).intValue();
            akcr.b(charSequence, "receiver$0");
            int a = akgc.a(charSequence, this.a, intValue, this.b);
            return a < 0 ? null : ajxs.a(Integer.valueOf(a), Integer.valueOf(1));
        }
    }

    /* renamed from: akgc$d */
    public static final class d extends akcs implements akbl<akdy, String> {
        private /* synthetic */ CharSequence a;

        public d(CharSequence charSequence) {
            this.a = charSequence;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akdy akdy = (akdy) obj;
            akcr.b(akdy, "it");
            return akgc.a(this.a, akdy);
        }
    }

    public static final int a(CharSequence charSequence, char c, int i) {
        int c2;
        String str = "receiver$0";
        akcr.b(charSequence, str);
        boolean z = charSequence instanceof String;
        if (!z) {
            char[] cArr = new char[]{c2};
            akcr.b(charSequence, str);
            akcr.b(cArr, "chars");
            if (z) {
                c2 = ajyi.a(cArr);
            } else {
                for (c2 = akef.c(i, akgc.d(charSequence)); c2 >= 0; c2--) {
                    Object obj;
                    char charAt = charSequence.charAt(c2);
                    for (int i2 = 0; i2 <= 0; i2++) {
                        if (akfo.a(cArr[i2], charAt, false)) {
                            obj = 1;
                            break;
                        }
                    }
                    obj = null;
                    if (obj != null) {
                        return c2;
                    }
                }
                return -1;
            }
        }
        return ((String) charSequence).lastIndexOf(c2, i);
    }

    public static final int a(CharSequence charSequence, char c, int i, boolean z) {
        akcr.b(charSequence, "receiver$0");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return akgc.a(charSequence, new char[]{c}, i, z);
    }

    private static final int a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        akdw akdy = !z2 ? new akdy(akef.b(i, 0), akef.c(i2, charSequence.length())) : a.a(akef.c(i, akgc.d(charSequence)), akef.b(i2, 0), -1);
        int i3;
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            i = akdy.a;
            i2 = akdy.b;
            i3 = akdy.c;
            if (i3 <= 0 ? i < i2 : i > i2) {
                while (true) {
                    if (!akgb.a((String) charSequence2, 0, (String) charSequence, i, charSequence2.length(), z)) {
                        if (i == i2) {
                            break;
                        }
                        i += i3;
                    } else {
                        return i;
                    }
                }
            }
        } else {
            i = akdy.a;
            i2 = akdy.b;
            i3 = akdy.c;
            if (i3 <= 0 ? i < i2 : i > i2) {
                while (true) {
                    if (!akgc.a(charSequence2, 0, charSequence, i, charSequence2.length(), z)) {
                        if (i == i2) {
                            break;
                        }
                        i += i3;
                    } else {
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    public static final int a(CharSequence charSequence, String str, int i) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(str, "string");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(str, i);
        }
        return akgc.a(charSequence, (CharSequence) str, i, 0, false, true);
    }

    public static final int a(CharSequence charSequence, String str, int i, boolean z) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(str, "string");
        return (z || !(charSequence instanceof String)) ? akgc.a(charSequence, (CharSequence) str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ajyi.a(cArr), i);
        }
        i = akef.b(i, 0);
        int d = akgc.d(charSequence);
        if (i <= d) {
            while (true) {
                Object obj;
                char charAt = charSequence.charAt(i);
                for (char a : cArr) {
                    if (akfo.a(a, charAt, z)) {
                        obj = 1;
                        break;
                    }
                }
                obj = null;
                if (obj == null) {
                    if (i == d) {
                        break;
                    }
                    i++;
                } else {
                    return i;
                }
            }
        }
        return -1;
    }

    public static final akez<String> a(CharSequence charSequence, String[] strArr, boolean z) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(strArr, "delimiters");
        return akfh.c(akgc.b(charSequence, strArr, z, 0), new c(charSequence));
    }

    public static final CharSequence a(CharSequence charSequence, char... cArr) {
        String str = "receiver$0";
        akcr.b(charSequence, str);
        akcr.b(cArr, "chars");
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            char charAt = charSequence.charAt(length);
            akcr.b(cArr, str);
            akcr.b(cArr, str);
            int i = 0;
            while (i <= 0) {
                if (charAt == cArr[i]) {
                    break;
                }
                i++;
            }
            i = -1;
            if ((i >= 0 ? 1 : null) == null) {
                return charSequence.subSequence(0, length + 1);
            }
        }
        return "";
    }

    public static final String a(CharSequence charSequence, akdy akdy) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(akdy, "range");
        return charSequence.subSequence(akdy.a, akdy.b + 1).toString();
    }

    public static final String a(String str, char c, String str2) {
        akcr.b(str, "receiver$0");
        akcr.b(str2, "missingDelimiterValue");
        int a = akgc.a((CharSequence) str, c, 0, false, 6);
        if (a == -1) {
            return str2;
        }
        Object substring = str.substring(0, a);
        akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String a(String str, CharSequence charSequence) {
        akcr.b(str, "receiver$0");
        akcr.b(charSequence, "prefix");
        if (!akgc.a((CharSequence) str, charSequence)) {
            return str;
        }
        Object substring = str.substring(charSequence.length());
        akcr.a(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x0081 in {2, 3, 8, 10, 11, 14, 19, 21, 23, 25, 27} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static final java.util.List<java.lang.String> a(java.lang.CharSequence r7, java.lang.String r8, boolean r9, int r10) {
        /*
        r9 = 1;
        r0 = 0;
        if (r10 < 0) goto L_0x0006;
        r1 = 1;
        goto L_0x0007;
        r1 = 0;
        if (r1 == 0) goto L_0x0062;
        r1 = defpackage.akgc.a(r7, r8, r0, r0);
        r2 = -1;
        if (r1 == r2) goto L_0x0059;
        if (r10 != r9) goto L_0x0013;
        goto L_0x0059;
        if (r10 <= 0) goto L_0x0017;
        r3 = 1;
        goto L_0x0018;
        r3 = 0;
        r4 = new java.util.ArrayList;
        r5 = 10;
        if (r3 == 0) goto L_0x0022;
        r5 = defpackage.akef.c(r10, r5);
        r4.<init>(r5);
        r5 = r1;
        r1 = 0;
        r1 = r7.subSequence(r1, r5);
        r1 = r1.toString();
        r4.add(r1);
        r1 = r8.length();
        r1 = r1 + r5;
        if (r3 == 0) goto L_0x0041;
        r5 = r4.size();
        r6 = r10 + -1;
        if (r5 == r6) goto L_0x0047;
        r5 = defpackage.akgc.a(r7, r8, r1, r0);
        if (r5 != r2) goto L_0x0027;
        r8 = r7.length();
        r7 = r7.subSequence(r1, r8);
        r7 = r7.toString();
        r4.add(r7);
        r4 = (java.util.List) r4;
        return r4;
        r7 = r7.toString();
        r7 = defpackage.ajyl.a(r7);
        return r7;
        r7 = new java.lang.StringBuilder;
        r8 = "Limit must be non-negative, but was ";
        r7.<init>(r8);
        r7.append(r10);
        r8 = 46;
        r7.append(r8);
        r7 = r7.toString();
        r8 = new java.lang.IllegalArgumentException;
        r7 = r7.toString();
        r8.<init>(r7);
        r8 = (java.lang.Throwable) r8;
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgc.a(java.lang.CharSequence, java.lang.String, boolean, int):java.util.List");
    }

    public static final List<String> a(CharSequence charSequence, String[] strArr, int i) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(strArr, "delimiters");
        Object obj = 1;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                obj = null;
            }
            if (obj == null) {
                return akgc.a(charSequence, str, false, i);
            }
        }
        Iterable<akdy> j = akfh.j(akgc.b(charSequence, strArr, false, i));
        Collection arrayList = new ArrayList(ajyn.a((Iterable) j, 10));
        for (akdy a : j) {
            arrayList.add(akgc.a(charSequence, a));
        }
        return (List) arrayList;
    }

    public static final boolean a(CharSequence charSequence, char c) {
        akcr.b(charSequence, "receiver$0");
        return charSequence.length() > 0 && akfo.a(charSequence.charAt(0), c, false);
    }

    public static final boolean a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!akfo.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean a(CharSequence charSequence, CharSequence charSequence2) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(charSequence2, "prefix");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return akgb.b((String) charSequence, (String) charSequence2, false);
        }
        return akgc.a(charSequence, 0, charSequence2, 0, charSequence2.length(), false);
    }

    public static final boolean a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(charSequence2, "other");
        return charSequence2 instanceof String ? akgc.a(charSequence, (String) charSequence2, 0, z, 2) >= 0 : akgc.a(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0;
    }

    private static /* synthetic */ akez b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        if ((i >= 0 ? 1 : null) != null) {
            return new akfq(charSequence, i, new b(ajyh.a((Object[]) strArr), z));
        }
        StringBuilder stringBuilder = new StringBuilder("Limit must be non-negative, but was ");
        stringBuilder.append(i);
        stringBuilder.append('.');
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final CharSequence b(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        int length = charSequence.length() - 1;
        int i = 0;
        Object obj = null;
        while (i <= length) {
            boolean a = akfn.a(charSequence.charAt(obj == null ? i : length));
            if (obj != null) {
                if (!a) {
                    break;
                }
                length--;
            } else if (a) {
                i++;
            } else {
                obj = 1;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static final String b(String str, CharSequence charSequence) {
        akcr.b(str, "receiver$0");
        akcr.b(charSequence, "suffix");
        if (!akgc.b((CharSequence) str, charSequence)) {
            return str;
        }
        Object substring = str.substring(0, str.length() - charSequence.length());
        akcr.a(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final List<String> b(CharSequence charSequence, char[] cArr) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(cArr, "delimiters");
        if (cArr.length == 1) {
            return akgc.a(charSequence, String.valueOf(cArr[0]), false, 0);
        }
        Iterable<akdy> j = akfh.j(new akfq(charSequence, 0, new a(cArr, false)));
        Collection arrayList = new ArrayList(ajyn.a((Iterable) j, 10));
        for (akdy a : j) {
            arrayList.add(akgc.a(charSequence, a));
        }
        return (List) arrayList;
    }

    public static final boolean b(CharSequence charSequence, char c) {
        akcr.b(charSequence, "receiver$0");
        return charSequence.length() > 0 && akfo.a(charSequence.charAt(akgc.d(charSequence)), c, false);
    }

    public static final boolean b(CharSequence charSequence, CharSequence charSequence2) {
        akcr.b(charSequence, "receiver$0");
        akcr.b(charSequence2, "suffix");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return akgb.c((String) charSequence, (String) charSequence2);
        }
        return akgc.a(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), false);
    }

    public static final akdy c(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        return new akdy(0, charSequence.length() - 1);
    }

    public static final int d(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        return charSequence.length() - 1;
    }

    public static final boolean e(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        return akgc.a(charSequence, ' ', 0, false, 2) >= 0;
    }

    public static final akez<String> f(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        return akgc.a(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 6);
    }

    public static final List<String> g(CharSequence charSequence) {
        akcr.b(charSequence, "receiver$0");
        return akfh.d(akgc.f(charSequence));
    }
}
