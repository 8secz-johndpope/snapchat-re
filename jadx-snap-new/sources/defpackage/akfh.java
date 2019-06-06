package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: akfh */
public class akfh extends akfg {

    /* renamed from: akfh$d */
    public static final class d implements akez<T> {
        private /* synthetic */ akez a;
        private /* synthetic */ Comparator b;

        d(akez<? extends T> akez, Comparator comparator) {
            this.a = akez;
            this.b = comparator;
        }

        public final Iterator<T> iterator() {
            List e = akfh.e(this.a);
            ajyq.a(e, this.b);
            return e.iterator();
        }
    }

    /* renamed from: akfh$c */
    public static final class c implements akez<T> {
        private /* synthetic */ akez a;
        private /* synthetic */ Iterable b;

        /* renamed from: akfh$c$a */
        static final class a extends akcs implements akbl<T, Boolean> {
            private /* synthetic */ Collection a;

            a(Collection collection) {
                this.a = collection;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return Boolean.valueOf(this.a.contains(obj));
            }
        }

        c(akez<? extends T> akez, Iterable iterable) {
            this.a = akez;
            this.b = iterable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
        public final java.util.Iterator<T> iterator() {
            /*
            r3 = this;
            r0 = r3.b;
            r1 = "receiver$0";
            defpackage.akcr.b(r0, r1);
            r1 = r0 instanceof java.util.Set;
            if (r1 == 0) goto L_0x000e;
        L_0x000b:
            r0 = (java.util.Collection) r0;
            goto L_0x0022;
        L_0x000e:
            r1 = r0 instanceof java.util.Collection;
            if (r1 == 0) goto L_0x001d;
        L_0x0012:
            r1 = r0;
            r1 = (java.util.Collection) r1;
            r2 = defpackage.ajyn.b(r1);
            if (r2 != 0) goto L_0x001d;
        L_0x001b:
            r0 = r1;
            goto L_0x0022;
        L_0x001d:
            r0 = defpackage.ajyu.j(r0);
            goto L_0x000b;
        L_0x0022:
            r1 = r0.isEmpty();
            if (r1 == 0) goto L_0x002f;
        L_0x0028:
            r0 = r3.a;
        L_0x002a:
            r0 = r0.iterator();
            return r0;
        L_0x002f:
            r1 = r3.a;
            r2 = new akfh$c$a;
            r2.<init>(r0);
            r2 = (defpackage.akbl) r2;
            r0 = defpackage.akfh.b(r1, r2);
            goto L_0x002a;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.akfh$c.iterator():java.util.Iterator");
        }
    }

    /* renamed from: akfh$a */
    public static final class a implements akdh, Iterable<T> {
        private /* synthetic */ akez a;

        public a(akez akez) {
            this.a = akez;
        }

        public final Iterator<T> iterator() {
            return this.a.iterator();
        }
    }

    /* renamed from: akfh$b */
    static final class b extends akcs implements akbl<T, Boolean> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(obj == null);
        }
    }

    public static final <T> akez<T> a(akez<? extends T> akez, int i) {
        akcr.b(akez, "receiver$0");
        if ((i >= 0 ? 1 : null) != null) {
            return i == 0 ? akez : akez instanceof akeu ? ((akeu) akez).a(i) : new aket(akez, i);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Requested element count ");
            stringBuilder.append(i);
            stringBuilder.append(" is less than zero.");
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public static final <T> akez<T> a(akez<? extends T> akez, akbl<? super T, Boolean> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(akbl, "predicate");
        return new akew(akez, true, akbl);
    }

    public static final <T, R> akez<R> a(akez<? extends T> akez, akbw<? super Integer, ? super T, ? extends R> akbw) {
        akcr.b(akez, "receiver$0");
        akcr.b(akbw, "transform");
        return new akfk(akez, akbw);
    }

    public static final <T> akez<T> a(akez<? extends T> akez, Iterable<? extends T> iterable) {
        akcr.b(akez, "receiver$0");
        akcr.b(iterable, "elements");
        return new c(akez, iterable);
    }

    public static final <T> akez<T> a(akez<? extends T> akez, Comparator<? super T> comparator) {
        akcr.b(akez, "receiver$0");
        akcr.b(comparator, "comparator");
        return new d(akez, comparator);
    }

    public static final <T, A extends Appendable> A a(akez<? extends T> akez, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(a, "buffer");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : akez) {
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

    public static final <T> String a(akez<? extends T> akez, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, akbl<? super T, ? extends CharSequence> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(charSequence, "separator");
        akcr.b(charSequence2, "prefix");
        akcr.b(charSequence3, "postfix");
        akcr.b(charSequence4, "truncated");
        Object stringBuilder = ((StringBuilder) akfh.a((akez) akez, (Appendable) new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, (akbl) akbl)).toString();
        akcr.a(stringBuilder, "joinTo(StringBuilder(), …ed, transform).toString()");
        return stringBuilder;
    }

    public static final <T, C extends Collection<? super T>> C a(akez<? extends T> akez, C c) {
        akcr.b(akez, "receiver$0");
        akcr.b(c, "destination");
        for (Object add : akez) {
            c.add(add);
        }
        return c;
    }

    public static final <T> akez<T> b(akez<? extends T> akez, int i) {
        akcr.b(akez, "receiver$0");
        if ((i >= 0 ? 1 : null) != null) {
            return i == 0 ? akev.a : akez instanceof akeu ? ((akeu) akez).b(i) : new akfj(akez, i);
        } else {
            StringBuilder stringBuilder = new StringBuilder("Requested element count ");
            stringBuilder.append(i);
            stringBuilder.append(" is less than zero.");
            throw new IllegalArgumentException(stringBuilder.toString().toString());
        }
    }

    public static final <T> akez<T> b(akez<? extends T> akez, akbl<? super T, Boolean> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(akbl, "predicate");
        return new akew(akez, false, akbl);
    }

    public static final <T> T b(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        Iterator it = akez.iterator();
        return !it.hasNext() ? null : it.next();
    }

    public static final <T> akez<T> c(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return akfh.b((akez) akez, (akbl) b.a);
    }

    public static final <T, R> akez<R> c(akez<? extends T> akez, akbl<? super T, ? extends R> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(akbl, "transform");
        return new akfl(akez, akbl);
    }

    public static final <T, R> akez<R> d(akez<? extends T> akez, akbl<? super T, ? extends R> akbl) {
        akcr.b(akez, "receiver$0");
        akcr.b(akbl, "transform");
        return akfh.c(new akfl(akez, akbl));
    }

    public static final <T> List<T> d(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return ajym.b(akfh.e(akez));
    }

    public static final <T> List<T> e(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return (List) akfh.a((akez) akez, (Collection) new ArrayList());
    }

    public static final <T> Set<T> f(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return ajzt.a((Set) akfh.a((akez) akez, (Collection) new LinkedHashSet()));
    }

    public static final Float g(akez<Float> akez) {
        akcr.b(akez, "receiver$0");
        Iterator it = akez.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        if (Float.isNaN(floatValue)) {
            return Float.valueOf(floatValue);
        }
        while (it.hasNext()) {
            float floatValue2 = ((Number) it.next()).floatValue();
            if (Float.isNaN(floatValue2)) {
                return Float.valueOf(floatValue2);
            }
            if (floatValue < floatValue2) {
                floatValue = floatValue2;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static final <T extends Comparable<? super T>> T h(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        Iterator it = akez.iterator();
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

    public static final Float i(akez<Float> akez) {
        akcr.b(akez, "receiver$0");
        Iterator it = akez.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        if (Float.isNaN(floatValue)) {
            return Float.valueOf(floatValue);
        }
        while (it.hasNext()) {
            float floatValue2 = ((Number) it.next()).floatValue();
            if (Float.isNaN(floatValue2)) {
                return Float.valueOf(floatValue2);
            }
            if (floatValue > floatValue2) {
                floatValue = floatValue2;
            }
        }
        return Float.valueOf(floatValue);
    }

    public static final <T> Iterable<T> j(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return new a(akez);
    }

    public static final long k(akez<Long> akez) {
        akcr.b(akez, "receiver$0");
        long j = 0;
        for (Number longValue : akez) {
            j += longValue.longValue();
        }
        return j;
    }
}
