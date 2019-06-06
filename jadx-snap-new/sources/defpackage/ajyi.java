package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: ajyi */
public class ajyi extends ajyh {

    /* renamed from: ajyi$a */
    public static final class a implements akez<T> {
        private /* synthetic */ Object[] a;

        public a(Object[] objArr) {
            this.a = objArr;
        }

        public final Iterator<T> iterator() {
            return akci.a(this.a);
        }
    }

    public static final char a(char[] cArr) {
        akcr.b(cArr, "receiver$0");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        } else if (length == 1) {
            return cArr[0];
        } else {
            throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    public static final <A extends Appendable> A a(int[] iArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, akbl<? super Integer, ? extends CharSequence> akbl) {
        akcr.b(iArr, "receiver$0");
        akcr.b(a, "buffer");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i = 0;
        for (int i2 : iArr) {
            i++;
            if (i > 1) {
                a.append(charSequence);
            }
            a.append((CharSequence) (akbl != null ? akbl.invoke(Integer.valueOf(i2)) : String.valueOf(i2)));
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T, A extends Appendable> A a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(tArr, "receiver$0");
        akcr.b(a, "buffer");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object obj : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            akfy.a(a, obj, akbl);
        }
        if (i >= 0 && r1 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static final <T> T a(T[] tArr, int i) {
        akcr.b(tArr, "receiver$0");
        return (i < 0 || i > ajyi.g(tArr)) ? null : tArr[i];
    }

    public static final <T> String a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(tArr, "receiver$0");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        Object stringBuilder = ((StringBuilder) ajyi.a((Object[]) tArr, (Appendable) new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, (akbl) akbl)).toString();
        akcr.a(stringBuilder, "joinTo(StringBuilder(), …ed, transform).toString()");
        return stringBuilder;
    }

    public static final <C extends Collection<? super Integer>> C a(int[] iArr, C c) {
        akcr.b(iArr, "receiver$0");
        akcr.b(c, "destination");
        for (int valueOf : iArr) {
            c.add(Integer.valueOf(valueOf));
        }
        return c;
    }

    public static final <C extends Collection<? super T>, T> C a(T[] tArr, C c) {
        akcr.b(tArr, "receiver$0");
        akcr.b(c, "destination");
        for (Object obj : tArr) {
            if (obj != null) {
                c.add(obj);
            }
        }
        return c;
    }

    public static final List<Byte> a(byte[] bArr) {
        akcr.b(bArr, "receiver$0");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte valueOf : bArr) {
            arrayList.add(Byte.valueOf(valueOf));
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x007e in {2, 3, 7, 14, 16, 18, 21, 26, 28, 30} preds:[]
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
    public static final java.util.List<java.lang.Byte> a(byte[] r6, int r7) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r6, r0);
        r1 = 1;
        r2 = 0;
        if (r7 < 0) goto L_0x000b;
        r3 = 1;
        goto L_0x000c;
        r3 = 0;
        if (r3 == 0) goto L_0x005f;
        if (r7 != 0) goto L_0x0015;
        r6 = defpackage.ajyw.a;
        r6 = (java.util.List) r6;
        return r6;
        r3 = r6.length;
        if (r7 < r3) goto L_0x0035;
        defpackage.akcr.b(r6, r0);
        r7 = r6.length;
        if (r7 == 0) goto L_0x0030;
        if (r7 == r1) goto L_0x0025;
        r6 = defpackage.ajyi.a(r6);
        return r6;
        r6 = r6[r2];
        r6 = java.lang.Byte.valueOf(r6);
        r6 = defpackage.ajyl.a(r6);
        return r6;
        r6 = defpackage.ajyw.a;
        r6 = (java.util.List) r6;
        return r6;
        if (r7 != r1) goto L_0x0042;
        r6 = r6[r2];
        r6 = java.lang.Byte.valueOf(r6);
        r6 = defpackage.ajyl.a(r6);
        return r6;
        r0 = new java.util.ArrayList;
        r0.<init>(r7);
        r1 = r6.length;
        r3 = 0;
        if (r2 >= r1) goto L_0x005c;
        r4 = r6[r2];
        r5 = r3 + 1;
        if (r3 == r7) goto L_0x005c;
        r3 = java.lang.Byte.valueOf(r4);
        r0.add(r3);
        r2 = r2 + 1;
        r3 = r5;
        goto L_0x0049;
        r0 = (java.util.List) r0;
        return r0;
        r6 = new java.lang.StringBuilder;
        r0 = "Requested element count ";
        r6.<init>(r0);
        r6.append(r7);
        r7 = " is less than zero.";
        r6.append(r7);
        r6 = r6.toString();
        r7 = new java.lang.IllegalArgumentException;
        r6 = r6.toString();
        r7.<init>(r6);
        r7 = (java.lang.Throwable) r7;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyi.a(byte[], int):java.util.List");
    }

    public static final boolean a(long[] jArr, long j) {
        akcr.b(jArr, "receiver$0");
        return ajyi.b(jArr, j) >= 0;
    }

    public static final <T> boolean a(T[] tArr, T t) {
        akcr.b(tArr, "receiver$0");
        return ajyi.b((Object[]) tArr, (Object) t) >= 0;
    }

    public static final byte[] a(byte[] bArr, akdy akdy) {
        akcr.b(bArr, "receiver$0");
        akcr.b(akdy, "indices");
        return akdy.a() ? new byte[0] : ajyh.a(bArr, akdy.a, akdy.b + 1);
    }

    public static final float[] a(Float[] fArr) {
        akcr.b(fArr, "receiver$0");
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            fArr2[i] = fArr[i].floatValue();
        }
        return fArr2;
    }

    public static final int b(long[] jArr, long j) {
        akcr.b(jArr, "receiver$0");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final <T> int b(T[] tArr, T t) {
        akcr.b(tArr, "receiver$0");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (akcr.a((Object) t, tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static final <T, C extends Collection<? super T>> C b(T[] tArr, C c) {
        akcr.b(tArr, "receiver$0");
        akcr.b(c, "destination");
        for (Object add : tArr) {
            c.add(add);
        }
        return c;
    }

    public static final List<Long> b(long[] jArr) {
        akcr.b(jArr, "receiver$0");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x005e in {2, 3, 7, 11, 14, 19, 21, 23} preds:[]
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
    public static final <T> java.util.List<T> b(T[] r6, int r7) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r6, r0);
        r0 = 1;
        r1 = 0;
        if (r7 < 0) goto L_0x000b;
        r2 = 1;
        goto L_0x000c;
        r2 = 0;
        if (r2 == 0) goto L_0x003f;
        if (r7 != 0) goto L_0x0015;
        r6 = defpackage.ajyw.a;
        r6 = (java.util.List) r6;
        return r6;
        r2 = r6.length;
        if (r7 < r2) goto L_0x001d;
        r6 = defpackage.ajyi.i(r6);
        return r6;
        if (r7 != r0) goto L_0x0026;
        r6 = r6[r1];
        r6 = defpackage.ajyl.a(r6);
        return r6;
        r0 = new java.util.ArrayList;
        r0.<init>(r7);
        r2 = r6.length;
        r3 = 0;
        if (r1 >= r2) goto L_0x003c;
        r4 = r6[r1];
        r5 = r3 + 1;
        if (r3 == r7) goto L_0x003c;
        r0.add(r4);
        r1 = r1 + 1;
        r3 = r5;
        goto L_0x002d;
        r0 = (java.util.List) r0;
        return r0;
        r6 = new java.lang.StringBuilder;
        r0 = "Requested element count ";
        r6.<init>(r0);
        r6.append(r7);
        r7 = " is less than zero.";
        r6.append(r7);
        r6 = r6.toString();
        r7 = new java.lang.IllegalArgumentException;
        r6 = r6.toString();
        r7.<init>(r6);
        r7 = (java.lang.Throwable) r7;
        throw r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyi.b(java.lang.Object[], int):java.util.List");
    }

    public static final <T> T[] b(T[] tArr, Comparator<? super T> comparator) {
        akcr.b(tArr, "receiver$0");
        akcr.b(comparator, "comparator");
        if ((tArr.length == 0 ? 1 : null) != null) {
            return tArr;
        }
        Object copyOf = Arrays.copyOf(tArr, tArr.length);
        akcr.a(copyOf, "java.util.Arrays.copyOf(this, size)");
        ajyh.a((Object[]) copyOf, (Comparator) comparator);
        return copyOf;
    }

    public static final <T> T c(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        if ((tArr.length == 0 ? 1 : null) == null) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> List<T> c(T[] tArr, Comparator<? super T> comparator) {
        akcr.b(tArr, "receiver$0");
        akcr.b(comparator, "comparator");
        return ajyh.a(ajyi.b((Object[]) tArr, (Comparator) comparator));
    }

    public static final <T> T d(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return (tArr.length == 0 ? 1 : null) != null ? null : tArr[0];
    }

    public static final <T> T e(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        if ((tArr.length == 0 ? 1 : null) == null) {
            return tArr[ajyi.g(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final <T> List<T> f(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return (List) ajyi.a((Object[]) tArr, (Collection) new ArrayList());
    }

    public static final <T> int g(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return tArr.length - 1;
    }

    public static final <T> HashSet<T> h(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return (HashSet) ajyi.b((Object[]) tArr, (Collection) new HashSet(ajzm.a(tArr.length)));
    }

    public static final <T> List<T> i(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        int length = tArr.length;
        return length != 0 ? length != 1 ? ajyi.j(tArr) : ajyl.a(tArr[0]) : ajyw.a;
    }

    public static final <T> List<T> j(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return new ArrayList(ajym.a((Object[]) tArr));
    }

    public static final <T> Set<T> k(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        int length = tArr.length;
        return length != 0 ? length != 1 ? (Set) ajyi.b((Object[]) tArr, (Collection) new LinkedHashSet(ajzm.a(tArr.length))) : ajzs.a(tArr[0]) : ajyy.a;
    }

    public static final <T> Set<T> l(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        LinkedHashSet linkedHashSet = new LinkedHashSet(ajzm.a(tArr.length));
        for (Object add : tArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    public static final <T> akez<T> m(T[] tArr) {
        akcr.b(tArr, "receiver$0");
        return (tArr.length == 0 ? 1 : null) != null ? akev.a : new a(tArr);
    }
}
