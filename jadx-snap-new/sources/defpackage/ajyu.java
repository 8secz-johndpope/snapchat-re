package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: ajyu */
public class ajyu extends ajyt {

    /* renamed from: ajyu$a */
    public static final class a implements akez<T> {
        private /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        public final Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* renamed from: ajyu$b */
    static final class b extends akcs implements akbk<Iterator<? extends T>> {
        private /* synthetic */ Iterable a;

        b(Iterable iterable) {
            this.a = iterable;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.iterator();
        }
    }

    public static final <T, A extends Appendable> A a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(a, "buffer");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            akfy.a(a, next, akbl);
        }
        if (i >= 0 && r5 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ Appendable a(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl akbl, int i2) {
        String str = "";
        return ajyu.a(iterable, appendable, (i2 & 2) != 0 ? ppy.d : charSequence, (i2 & 4) != 0 ? str : charSequence2, (i2 & 8) != 0 ? str : charSequence3, (i2 & 16) != 0 ? -1 : i, (i2 & 32) != 0 ? "..." : charSequence4, (i2 & 64) != 0 ? null : akbl);
    }

    public static final <T> T a(List<? extends T> list, int i) {
        akcr.b(list, "receiver$0");
        return (i < 0 || i > ajym.a((List) list)) ? null : list.get(i);
    }

    public static final <T> String a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        Object stringBuilder = ((StringBuilder) ajyu.a((Iterable) iterable, (Appendable) new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, (akbl) akbl)).toString();
        akcr.a(stringBuilder, "joinTo(StringBuilder(), …ed, transform).toString()");
        return stringBuilder;
    }

    public static final <C extends Collection<? super T>, T> C a(Iterable<? extends T> iterable, C c) {
        akcr.b(iterable, "receiver$0");
        akcr.b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    public static final <T, R> List<R> a(Iterable<? extends T> iterable, int i, int i2, akbl<? super List<? extends T>, ? extends R> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(akbl, "transform");
        ajzv.a(i, i2);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList(((size + i2) - 1) / i2);
            ajzo ajzo = new ajzo(list);
            int i3 = 0;
            while (i3 < size) {
                ajzo.a(i3, akef.c(i3 + i, size));
                arrayList.add(akbl.invoke(ajzo));
                i3 += i2;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator a = ajzv.a(iterable.iterator(), i, i2, true);
        while (a.hasNext()) {
            arrayList2.add(akbl.invoke((List) a.next()));
        }
        return arrayList2;
    }

    public static final <T, R> List<R> a(Iterable<? extends T> iterable, int i, akbl<? super List<? extends T>, ? extends R> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(akbl, "transform");
        return ajyu.a(iterable, i, i, akbl);
    }

    public static final <T> List<T> a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        akcr.b(iterable, "receiver$0");
        akcr.b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return ajyu.k(iterable);
            }
            Object[] toArray = collection.toArray(new Object[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (toArray == null) {
                throw new ajxt(str);
            } else if (toArray != null) {
                ajyh.a(toArray, (Comparator) comparator);
                return ajyh.a(toArray);
            } else {
                throw new ajxt(str);
            }
        }
        List l = ajyu.l(iterable);
        ajyq.a(l, comparator);
        return l;
    }

    public static final <T> List<T> a(Collection<? extends T> collection, T t) {
        akcr.b(collection, "receiver$0");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> a(List<? extends T> list, akdy akdy) {
        akcr.b(list, "receiver$0");
        akcr.b(akdy, "indices");
        return akdy.a() ? ajyw.a : ajyu.k(list.subList(akdy.a, akdy.b + 1));
    }

    public static final <T> boolean a(Iterable<? extends T> iterable, T t) {
        akcr.b(iterable, "receiver$0");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : ajyu.b((Iterable) iterable, (Object) t) >= 0;
    }

    public static final <T> int b(Iterable<? extends T> iterable, T t) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                ajym.a();
            }
            if (akcr.a((Object) t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final <T, C extends Collection<? super T>> C b(Iterable<? extends T> iterable, C c) {
        akcr.b(iterable, "receiver$0");
        akcr.b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:42:0x00ae in {2, 3, 7, 13, 16, 23, 27, 29, 30, 36, 37, 39, 41} preds:[]
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
    public static final <T> java.util.List<T> b(java.lang.Iterable<? extends T> r4, int r5) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r4, r0);
        r0 = 0;
        r1 = 1;
        if (r5 < 0) goto L_0x000b;
        r2 = 1;
        goto L_0x000c;
        r2 = 0;
        if (r2 == 0) goto L_0x008f;
        if (r5 != 0) goto L_0x0015;
        r4 = defpackage.ajyu.k(r4);
        return r4;
        r2 = r4 instanceof java.util.Collection;
        if (r2 == 0) goto L_0x006c;
        r2 = r4;
        r2 = (java.util.Collection) r2;
        r3 = r2.size();
        r3 = r3 - r5;
        if (r3 > 0) goto L_0x0028;
        r4 = defpackage.ajyw.a;
        r4 = (java.util.List) r4;
        return r4;
        if (r3 != r1) goto L_0x0033;
        r4 = defpackage.ajyu.f(r4);
        r4 = defpackage.ajyl.a(r4);
        return r4;
        r1 = new java.util.ArrayList;
        r1.<init>(r3);
        r3 = r4 instanceof java.util.List;
        if (r3 == 0) goto L_0x0071;
        r0 = r4 instanceof java.util.RandomAccess;
        if (r0 == 0) goto L_0x0053;
        r0 = r2.size();
        if (r5 >= r0) goto L_0x0069;
        r2 = r4;
        r2 = (java.util.List) r2;
        r2 = r2.get(r5);
        r1.add(r2);
        r5 = r5 + 1;
        goto L_0x0044;
        r4 = (java.util.List) r4;
        r4 = r4.listIterator(r5);
        r4 = (java.util.Iterator) r4;
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0069;
        r5 = r4.next();
        r1.add(r5);
        goto L_0x005b;
        r1 = (java.util.List) r1;
        return r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r4 = r4.iterator();
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x0088;
        r2 = r4.next();
        r3 = r0 + 1;
        if (r0 < r5) goto L_0x0086;
        r1.add(r2);
        r0 = r3;
        goto L_0x0075;
        r1 = (java.util.List) r1;
        r4 = defpackage.ajym.b(r1);
        return r4;
        r4 = new java.lang.StringBuilder;
        r0 = "Requested element count ";
        r4.<init>(r0);
        r4.append(r5);
        r5 = " is less than zero.";
        r4.append(r5);
        r4 = r4.toString();
        r5 = new java.lang.IllegalArgumentException;
        r4 = r4.toString();
        r5.<init>(r4);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyu.b(java.lang.Iterable, int):java.util.List");
    }

    public static final <T> List<T> b(List<? extends T> list, int i) {
        akcr.b(list, "receiver$0");
        if ((i >= 0 ? 1 : null) != null) {
            return ajyu.c((Iterable) list, akef.b(list.size() - i, 0));
        }
        StringBuilder stringBuilder = new StringBuilder("Requested element count ");
        stringBuilder.append(i);
        stringBuilder.append(" is less than zero.");
        throw new IllegalArgumentException(stringBuilder.toString().toString());
    }

    public static final <T, K> Map<K, T> b(Iterable<? extends T> iterable, akbl<? super T, ? extends K> akbl) {
        akcr.b(iterable, "receiver$0");
        akcr.b(akbl, "keySelector");
        Map linkedHashMap = new LinkedHashMap(akef.b(ajzm.a(ajyn.a((Iterable) iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(akbl.invoke(next), next);
        }
        return linkedHashMap;
    }

    public static final <T> Set<T> b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        akcr.b(iterable, "receiver$0");
        akcr.b(iterable2, "other");
        Set p = ajyu.p(iterable);
        ajyr.c(p, iterable2);
        return p;
    }

    public static final <T> T c(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof List) {
            return ajyu.a((List) iterable, 0);
        }
        Iterator it = iterable.iterator();
        return it.hasNext() ? it.next() : null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:27:0x0074 in {2, 3, 7, 13, 16, 22, 24, 26} preds:[]
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
    public static final <T> java.util.List<T> c(java.lang.Iterable<? extends T> r4, int r5) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r4, r0);
        r0 = 0;
        r1 = 1;
        if (r5 < 0) goto L_0x000b;
        r2 = 1;
        goto L_0x000c;
        r2 = 0;
        if (r2 == 0) goto L_0x0055;
        if (r5 != 0) goto L_0x0015;
        r4 = defpackage.ajyw.a;
        r4 = (java.util.List) r4;
        return r4;
        r2 = r4 instanceof java.util.Collection;
        if (r2 == 0) goto L_0x0032;
        r2 = r4;
        r2 = (java.util.Collection) r2;
        r2 = r2.size();
        if (r5 < r2) goto L_0x0027;
        r4 = defpackage.ajyu.k(r4);
        return r4;
        if (r5 != r1) goto L_0x0032;
        r4 = defpackage.ajyu.d(r4);
        r4 = defpackage.ajyl.a(r4);
        return r4;
        r1 = new java.util.ArrayList;
        r1.<init>(r5);
        r4 = r4.iterator();
        r2 = r4.hasNext();
        if (r2 == 0) goto L_0x004e;
        r2 = r4.next();
        r3 = r0 + 1;
        if (r0 == r5) goto L_0x004e;
        r1.add(r2);
        r0 = r3;
        goto L_0x003b;
        r1 = (java.util.List) r1;
        r4 = defpackage.ajym.b(r1);
        return r4;
        r4 = new java.lang.StringBuilder;
        r0 = "Requested element count ";
        r4.<init>(r0);
        r4.append(r5);
        r5 = " is less than zero.";
        r4.append(r5);
        r4 = r4.toString();
        r5 = new java.lang.IllegalArgumentException;
        r4 = r4.toString();
        r5.<init>(r4);
        r5 = (java.lang.Throwable) r5;
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyu.c(java.lang.Iterable, int):java.util.List");
    }

    public static final <T> List<T> c(Iterable<? extends T> iterable, T t) {
        akcr.b(iterable, "receiver$0");
        ArrayList arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
        Object obj = null;
        for (Object next : iterable) {
            Object obj2 = 1;
            if (obj == null && akcr.a(next, (Object) t)) {
                obj = 1;
                obj2 = null;
            }
            if (obj2 != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:28:0x007a in {2, 3, 7, 11, 14, 19, 23, 25, 27} preds:[]
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
    public static final <T> java.util.List<T> c(java.util.List<? extends T> r3, int r4) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r3, r0);
        r0 = 1;
        if (r4 < 0) goto L_0x000a;
        r1 = 1;
        goto L_0x000b;
        r1 = 0;
        if (r1 == 0) goto L_0x005b;
        if (r4 != 0) goto L_0x0014;
        r3 = defpackage.ajyw.a;
        r3 = (java.util.List) r3;
        return r3;
        r1 = r3.size();
        if (r4 < r1) goto L_0x0021;
        r3 = (java.lang.Iterable) r3;
        r3 = defpackage.ajyu.k(r3);
        return r3;
        if (r4 != r0) goto L_0x002c;
        r3 = defpackage.ajyu.h(r3);
        r3 = defpackage.ajyl.a(r3);
        return r3;
        r0 = new java.util.ArrayList;
        r0.<init>(r4);
        r2 = r3 instanceof java.util.RandomAccess;
        if (r2 == 0) goto L_0x0043;
        r4 = r1 - r4;
        if (r4 >= r1) goto L_0x0058;
        r2 = r3.get(r4);
        r0.add(r2);
        r4 = r4 + 1;
        goto L_0x0037;
        r1 = r1 - r4;
        r3 = r3.listIterator(r1);
        r3 = (java.util.Iterator) r3;
        r4 = r3.hasNext();
        if (r4 == 0) goto L_0x0058;
        r4 = r3.next();
        r0.add(r4);
        goto L_0x004a;
        r0 = (java.util.List) r0;
        return r0;
        r3 = new java.lang.StringBuilder;
        r0 = "Requested element count ";
        r3.<init>(r0);
        r3.append(r4);
        r4 = " is less than zero.";
        r3.append(r4);
        r3 = r3.toString();
        r4 = new java.lang.IllegalArgumentException;
        r3 = r3.toString();
        r4.<init>(r3);
        r4 = (java.lang.Throwable) r4;
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyu.c(java.util.List, int):java.util.List");
    }

    public static final <T> Set<T> c(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        akcr.b(iterable, "receiver$0");
        akcr.b(iterable2, "other");
        Set p = ajyu.p(iterable);
        ajyr.b((Collection) p, (Iterable) iterable2);
        return p;
    }

    public static final byte[] c(Collection<Byte> collection) {
        akcr.b(collection, "receiver$0");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Number byteValue : collection) {
            int i2 = i + 1;
            bArr[i] = byteValue.byteValue();
            i = i2;
        }
        return bArr;
    }

    public static final <T> T d(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof List) {
            return ajyu.f((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> List<T> d(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        ArrayList arrayList;
        akcr.b(collection, "receiver$0");
        akcr.b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
        } else {
            arrayList = new ArrayList(collection);
            ajyr.a((Collection) arrayList, (Iterable) iterable);
        }
        return arrayList;
    }

    public static final <T> Set<T> d(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        akcr.b(iterable, "receiver$0");
        akcr.b(iterable2, "other");
        Set p = ajyu.p(iterable);
        ajyr.a((Collection) p, (Iterable) iterable2);
        return p;
    }

    public static final double[] d(Collection<Double> collection) {
        akcr.b(collection, "receiver$0");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Number doubleValue : collection) {
            int i2 = i + 1;
            dArr[i] = doubleValue.doubleValue();
            i = i2;
        }
        return dArr;
    }

    public static final <T> T e(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.isEmpty() ? null : list.get(0);
        } else {
            Iterator it = iterable.iterator();
            return !it.hasNext() ? null : it.next();
        }
    }

    public static final <T> List<T> e(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        akcr.b(iterable, "receiver$0");
        akcr.b(iterable2, "elements");
        Collection a = ajyn.a((Iterable) iterable2, (Iterable) iterable);
        if (a.isEmpty()) {
            return ajyu.k(iterable);
        }
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!a.contains(next)) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    public static final float[] e(Collection<Float> collection) {
        akcr.b(collection, "receiver$0");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Number floatValue : collection) {
            int i2 = i + 1;
            fArr[i] = floatValue.floatValue();
            i = i2;
        }
        return fArr;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x002f in {3, 8, 10} preds:[]
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
    public static final <T> T f(java.lang.Iterable<? extends T> r2) {
        /*
        r0 = "receiver$0";
        defpackage.akcr.b(r2, r0);
        r0 = r2 instanceof java.util.List;
        if (r0 == 0) goto L_0x0010;
        r2 = (java.util.List) r2;
        r2 = defpackage.ajyu.h(r2);
        return r2;
        r2 = r2.iterator();
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0025;
        r0 = r2.next();
        r1 = r2.hasNext();
        if (r1 != 0) goto L_0x001a;
        return r0;
        r2 = new java.util.NoSuchElementException;
        r0 = "Collection is empty.";
        r2.<init>(r0);
        r2 = (java.lang.Throwable) r2;
        throw r2;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajyu.f(java.lang.Iterable):java.lang.Object");
    }

    public static final <T> T f(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final int[] f(Collection<Integer> collection) {
        akcr.b(collection, "receiver$0");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    public static final <T> T g(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        return list.isEmpty() ? null : list.get(0);
    }

    public static final <T> List<T> g(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return (List) ajyu.a((Iterable) iterable, (Collection) new ArrayList());
    }

    public static final long[] g(Collection<Long> collection) {
        akcr.b(collection, "receiver$0");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Number longValue : collection) {
            int i2 = i + 1;
            jArr[i] = longValue.longValue();
            i = i2;
        }
        return jArr;
    }

    public static final <T> T h(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        if (!list.isEmpty()) {
            return list.get(ajym.a((List) list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> h(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return ajyu.k(iterable);
        }
        List l = ajyu.l(iterable);
        ajyt.e(l);
        return l;
    }

    public static final <T> List<T> h(Collection<? extends T> collection) {
        akcr.b(collection, "receiver$0");
        return new ArrayList(collection);
    }

    public static final <T> T i(List<? extends T> list) {
        akcr.b(list, "receiver$0");
        return list.isEmpty() ? null : list.get(list.size() - 1);
    }

    public static final <T extends Comparable<? super T>> List<T> i(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return ajyu.k(iterable);
            }
            Object[] toArray = collection.toArray(new Comparable[0]);
            String str = "null cannot be cast to non-null type kotlin.Array<T>";
            if (toArray == null) {
                throw new ajxt(str);
            } else if (toArray != null) {
                Comparable[] comparableArr = (Comparable[]) toArray;
                if (comparableArr != null) {
                    toArray = (Object[]) comparableArr;
                    ajyh.b(toArray);
                    return ajyh.a(toArray);
                }
                throw new ajxt("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            } else {
                throw new ajxt(str);
            }
        }
        List l = ajyu.l(iterable);
        ajyq.c(l);
        return l;
    }

    public static final <T> HashSet<T> j(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return (HashSet) ajyu.b((Iterable) iterable, (Collection) new HashSet(ajzm.a(ajyn.a((Iterable) iterable, 12))));
    }

    public static final <T> List<T> k(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return ajym.b(ajyu.l(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ajyw.a;
        }
        if (size != 1) {
            return ajyu.h(collection);
        }
        return ajyl.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> l(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return iterable instanceof Collection ? ajyu.h((Collection) iterable) : (List) ajyu.b((Iterable) iterable, (Collection) new ArrayList());
    }

    public static final <T> Set<T> m(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (!(iterable instanceof Collection)) {
            return ajzt.a((Set) ajyu.b((Iterable) iterable, (Collection) new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return ajyy.a;
        }
        if (size != 1) {
            return (Set) ajyu.b((Iterable) iterable, (Collection) new LinkedHashSet(ajzm.a(collection.size())));
        }
        return ajzs.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> Iterable<ajzd<T>> n(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return new ajze(new b(iterable));
    }

    public static final <T> List<T> o(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return ajyu.k(ajyu.p(iterable));
    }

    public static final <T> Set<T> p(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) ajyu.b((Iterable) iterable, (Collection) new LinkedHashSet());
    }

    public static final <T> int q(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        int i = 0;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                ajym.b();
            }
        }
        return i;
    }

    public static final <T extends Comparable<? super T>> T r(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final <T extends Comparable<? super T>> T s(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static final <T> List<List<T>> t(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return ajyu.u(iterable);
    }

    public static final <T> List<List<T>> u(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        ajzv.a(900, 900);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            ArrayList arrayList = new ArrayList(((size + 900) - 1) / 900);
            for (int i = 0; i < size; i += 900) {
                int c = akef.c(900, size - i);
                ArrayList arrayList2 = new ArrayList(c);
                for (int i2 = 0; i2 < c; i2++) {
                    arrayList2.add(list.get(i2 + i));
                }
                arrayList.add(arrayList2);
            }
            return arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator a = ajzv.a(iterable.iterator(), 900, 900, false);
        while (a.hasNext()) {
            arrayList3.add((List) a.next());
        }
        return arrayList3;
    }

    public static final <T> akez<T> v(Iterable<? extends T> iterable) {
        akcr.b(iterable, "receiver$0");
        return new a(iterable);
    }

    public static final int w(Iterable<Integer> iterable) {
        akcr.b(iterable, "receiver$0");
        int i = 0;
        for (Number intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    public static final long x(Iterable<Long> iterable) {
        akcr.b(iterable, "receiver$0");
        long j = 0;
        for (Number longValue : iterable) {
            j += longValue.longValue();
        }
        return j;
    }

    public static final double y(Iterable<Double> iterable) {
        akcr.b(iterable, "receiver$0");
        double d = 0.0d;
        for (Number doubleValue : iterable) {
            d += doubleValue.doubleValue();
        }
        return d;
    }
}
