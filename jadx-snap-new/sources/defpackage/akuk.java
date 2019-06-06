package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: akuk */
public final class akuk {
    private int a = 1;
    private int b = 2;
    private int c = 10;
    private boolean d = false;
    private f e = null;
    private List<Object> f;
    private boolean g;
    private boolean h;
    private c[] i;

    /* renamed from: akuk$f */
    interface f {
        int a(int i);

        void a(StringBuffer stringBuffer, int i);

        void a(Set<f> set);

        String[] a();
    }

    /* renamed from: akuk$a */
    static class a implements akul, akum {
        private final akum[] a;
        private final akul[] b;

        a(List<Object> list) {
            List arrayList = new ArrayList();
            List arrayList2 = new ArrayList();
            a.a((List) list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.a = null;
            } else {
                this.a = (akum[]) arrayList.toArray(new akum[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.b = null;
            } else {
                this.b = (akul[]) arrayList2.toArray(new akul[arrayList2.size()]);
            }
        }

        private static void a(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof akum) {
                    if (obj instanceof a) {
                        a.a((List) list2, ((a) obj).a);
                    } else {
                        list2.add(obj);
                    }
                }
                obj = list.get(i + 1);
                if (obj instanceof akul) {
                    if (obj instanceof a) {
                        a.a((List) list3, ((a) obj).b);
                    } else {
                        list3.add(obj);
                    }
                }
            }
        }

        private static void a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        public final int a(akry akry, int i, Locale locale) {
            akum[] akumArr = this.a;
            int length = akumArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += akumArr[length].a(akry, Integer.MAX_VALUE, locale);
            }
            return i2;
        }

        public final int a(akry akry, Locale locale) {
            akum[] akumArr = this.a;
            int length = akumArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                i += akumArr[length].a(akry, locale);
            }
        }

        public final void a(StringBuffer stringBuffer, akry akry, Locale locale) {
            for (akum a : this.a) {
                a.a(stringBuffer, akry, locale);
            }
        }
    }

    /* renamed from: akuk$c */
    static class c implements akul, akum {
        final int a;
        final f b;
        final f c;
        private final int d;
        private final int e;
        private final int f;
        private final boolean g;
        private final c[] h;

        c(int i, int i2, int i3, int i4, c[] cVarArr) {
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = false;
            this.a = i4;
            this.h = cVarArr;
            this.b = null;
            this.c = null;
        }

        c(c cVar, f fVar) {
            this.d = cVar.d;
            this.e = cVar.e;
            this.f = cVar.f;
            this.g = cVar.g;
            this.a = cVar.a;
            this.h = cVar.h;
            this.b = cVar.b;
            f fVar2 = cVar.c;
            if (fVar2 != null) {
                fVar = new b(fVar2, fVar);
            }
            this.c = fVar;
        }

        private long a(akry akry) {
            akrr b = this.e == 4 ? null : akry.b();
            if (b != null && !c.a(b, this.a)) {
                return Long.MAX_VALUE;
            }
            akrg akrg;
            long a;
            switch (this.a) {
                case 0:
                    akrg = akrg.d;
                    break;
                case 1:
                    akrg = akrg.e;
                    break;
                case 2:
                    akrg = akrg.f;
                    break;
                case 3:
                    akrg = akrg.g;
                    break;
                case 4:
                    akrg = akrg.i;
                    break;
                case 5:
                    akrg = akrg.j;
                    break;
                case 6:
                    akrg = akrg.k;
                    break;
                case 7:
                    akrg = akrg.l;
                    break;
                case 8:
                case 9:
                    a = (((long) akry.a(akrg.k)) * 1000) + ((long) akry.a(akrg.l));
                    break;
                default:
                    return Long.MAX_VALUE;
            }
            a = (long) akry.a(akrg);
            if (a == 0) {
                int i = this.e;
                c[] cVarArr;
                if (i == 1) {
                    if (c.b(akry)) {
                        cVarArr = this.h;
                        i = this.a;
                        if (cVarArr[i] == this) {
                            int min = Math.min(i, 8);
                            while (true) {
                                min--;
                                if (min >= 0 && min <= 9) {
                                    if (!c.a(b, min) || this.h[min] == null) {
                                    }
                                }
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                } else if (i != 2) {
                    return i != 5 ? a : Long.MAX_VALUE;
                } else {
                    if (c.b(akry)) {
                        cVarArr = this.h;
                        i = this.a;
                        if (cVarArr[i] == this) {
                            i++;
                            while (i <= 9) {
                                if (c.a(b, i) && this.h[i] != null) {
                                    return Long.MAX_VALUE;
                                }
                                i++;
                            }
                        }
                    }
                    return Long.MAX_VALUE;
                }
            }
        }

        private static boolean a(akrr akrr, int i) {
            akrg akrg;
            switch (i) {
                case 0:
                    akrg = akrg.d;
                    break;
                case 1:
                    akrg = akrg.e;
                    break;
                case 2:
                    akrg = akrg.f;
                    break;
                case 3:
                    akrg = akrg.g;
                    break;
                case 4:
                    akrg = akrg.i;
                    break;
                case 5:
                    akrg = akrg.j;
                    break;
                case 6:
                    akrg = akrg.k;
                    break;
                case 7:
                    akrg = akrg.l;
                    break;
                case 8:
                case 9:
                    return akrr.a(akrg.k) || akrr.a(akrg.l);
                default:
                    return false;
            }
            return akrr.a(akrg);
        }

        private static boolean b(akry akry) {
            int d = akry.d();
            for (int i = 0; i < d; i++) {
                if (akry.c(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        public final int a(akry akry, int i, Locale locale) {
            return i <= 0 ? 0 : (this.e == 4 || a(akry) != Long.MAX_VALUE) ? 1 : 0;
        }

        public final int a(akry akry, Locale locale) {
            long a = a(akry);
            if (a == Long.MAX_VALUE) {
                return 0;
            }
            int max = Math.max(akud.a(a), this.d);
            if (this.a >= 8) {
                max = Math.max(max, a < 0 ? 5 : 4) + 1;
                if (this.a == 9 && Math.abs(a) % 1000 == 0) {
                    max -= 4;
                }
                a /= 1000;
            }
            int i = (int) a;
            f fVar = this.b;
            if (fVar != null) {
                max += fVar.a(i);
            }
            fVar = this.c;
            if (fVar != null) {
                max += fVar.a(i);
            }
            return max;
        }

        public final void a(StringBuffer stringBuffer, akry akry, Locale locale) {
            long a = a(akry);
            if (a != Long.MAX_VALUE) {
                int i = (int) a;
                if (this.a >= 8) {
                    i = (int) (a / 1000);
                }
                f fVar = this.b;
                if (fVar != null) {
                    fVar.a(stringBuffer, i);
                }
                int length = stringBuffer.length();
                int i2 = this.d;
                if (i2 <= 1) {
                    try {
                        akud.a((Appendable) stringBuffer, i);
                    } catch (IOException unused) {
                    }
                } else {
                    akud.a(stringBuffer, i, i2);
                }
                if (this.a >= 8) {
                    int abs = (int) (Math.abs(a) % 1000);
                    if (this.a == 8 || abs > 0) {
                        if (a < 0 && a > -1000) {
                            stringBuffer.insert(length, '-');
                        }
                        stringBuffer.append('.');
                        akud.a(stringBuffer, abs, 3);
                    }
                }
                f fVar2 = this.c;
                if (fVar2 != null) {
                    fVar2.a(stringBuffer, i);
                }
            }
        }
    }

    /* renamed from: akuk$d */
    static abstract class d implements f {
        private volatile String[] a;

        d() {
        }

        public final void a(Set<f> set) {
            if (this.a == null) {
                String str = null;
                int i = Integer.MAX_VALUE;
                for (String str2 : a()) {
                    if (str2.length() < i) {
                        i = str2.length();
                        str = str2;
                    }
                }
                HashSet hashSet = new HashSet();
                for (f fVar : set) {
                    if (fVar != null) {
                        for (String str3 : fVar.a()) {
                            if (str3.length() > i || (str3.equalsIgnoreCase(str) && !str3.equals(str))) {
                                hashSet.add(str3);
                            }
                        }
                    }
                }
                this.a = (String[]) hashSet.toArray(new String[hashSet.size()]);
            }
        }
    }

    /* renamed from: akuk$e */
    static class e implements akul, akum {
        static final e a = new e("");
        private final String b;

        e(String str) {
            this.b = str;
        }

        public final int a(akry akry, int i, Locale locale) {
            return 0;
        }

        public final int a(akry akry, Locale locale) {
            return this.b.length();
        }

        public final void a(StringBuffer stringBuffer, akry akry, Locale locale) {
            stringBuffer.append(this.b);
        }
    }

    /* renamed from: akuk$g */
    static class g implements akul, akum {
        volatile akum a;
        volatile akul b;
        private final String c;
        private final String d;
        private final String[] e;
        private final boolean f;
        private final boolean g;
        private final akum h;
        private final akul i;

        g(String str, String str2, akum akum, akul akul) {
            this.c = str;
            this.d = str2;
            if (str2 == null || str.equals(str2)) {
                this.e = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.e = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.h = akum;
            this.i = akul;
            this.f = false;
            this.g = true;
        }

        public final int a(akry akry, int i, Locale locale) {
            int a = this.h.a(akry, i, locale);
            return a < i ? a + this.a.a(akry, i, locale) : a;
        }

        public final int a(akry akry, Locale locale) {
            akum akum = this.h;
            akum akum2 = this.a;
            int a = akum.a(akry, locale) + akum2.a(akry, locale);
            return akum2.a(akry, 1, locale) > 0 ? a + this.c.length() : a;
        }

        /* Access modifiers changed, original: final */
        public final g a(akum akum, akul akul) {
            this.a = akum;
            this.b = akul;
            return this;
        }

        public final void a(StringBuffer stringBuffer, akry akry, Locale locale) {
            akum akum = this.h;
            akum akum2 = this.a;
            akum.a(stringBuffer, akry, locale);
            if (akum2.a(akry, 1, locale) > 0) {
                stringBuffer.append(this.c);
            }
            akum2.a(stringBuffer, akry, locale);
        }
    }

    /* renamed from: akuk$b */
    static class b extends d {
        private final f a;
        private final f b;
        private final String[] c;

        b(f fVar, f fVar2) {
            this.a = fVar;
            this.b = fVar2;
            HashSet hashSet = new HashSet();
            for (String str : this.a.a()) {
                for (String str2 : this.b.a()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(str2);
                    hashSet.add(stringBuilder.toString());
                }
            }
            this.c = (String[]) hashSet.toArray(new String[hashSet.size()]);
        }

        public final int a(int i) {
            return this.a.a(i) + this.b.a(i);
        }

        public final void a(StringBuffer stringBuffer, int i) {
            this.a.a(stringBuffer, i);
            this.b.a(stringBuffer, i);
        }

        public final String[] a() {
            return (String[]) this.c.clone();
        }
    }

    /* renamed from: akuk$h */
    static class h extends d {
        private final String a;

        h(String str) {
            this.a = str;
        }

        public final int a(int i) {
            return this.a.length();
        }

        public final void a(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.a);
        }

        public final String[] a() {
            return new String[]{this.a};
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
    }

    public akuk() {
        List list = this.f;
        if (list == null) {
            this.f = new ArrayList();
        } else {
            list.clear();
        }
        this.g = false;
        this.h = false;
        this.i = new c[10];
    }

    private static akuj a(List<Object> list, boolean z, boolean z2) {
        if (z && z2) {
            throw new IllegalStateException("Builder has created neither a printer nor a parser");
        }
        int size = list.size();
        if (size >= 2 && (list.get(0) instanceof g)) {
            g gVar = (g) list.get(0);
            if (gVar.b == null && gVar.a == null) {
                akuj a = akuk.a(list.subList(2, size), z, z2);
                g a2 = gVar.a(a.a, a.b);
                return new akuj(a2, a2);
            }
        }
        Object[] a3 = akuk.a((List) list);
        return z ? new akuj(null, (akul) a3[1]) : z2 ? new akuj((akum) a3[0], null) : new akuj((akum) a3[0], (akul) a3[1]);
    }

    private akuk a(f fVar) {
        Object obj;
        Object obj2;
        if (this.f.size() > 0) {
            List list = this.f;
            obj = list.get(list.size() - 2);
            List list2 = this.f;
            obj2 = list2.get(list2.size() - 1);
        } else {
            obj = null;
            obj2 = obj;
        }
        if (obj == null || obj2 == null || obj != obj2 || !(obj instanceof c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        this.e = null;
        c cVar = new c((c) obj, fVar);
        List list3 = this.f;
        list3.set(list3.size() - 2, cVar);
        list3 = this.f;
        list3.set(list3.size() - 1, cVar);
        this.i[cVar.a] = cVar;
        return this;
    }

    private akuk a(akum akum, akul akul) {
        this.f.add(akum);
        this.f.add(akul);
        this.g = this.g;
        this.h = this.h;
        return this;
    }

    private void a(int i, int i2) {
        akum cVar = new c(i2, this.b, this.c, i, this.i);
        a(cVar, (akul) cVar);
        this.i[i] = cVar;
        this.e = null;
    }

    private static Object[] a(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            return new Object[]{e.a, e.a};
        } else if (size != 1) {
            a aVar = new a(list);
            return new Object[]{aVar, aVar};
        } else {
            return new Object[]{list.get(0), list.get(1)};
        }
    }

    public final akuj a() {
        akuj a = akuk.a(this.f, this.g, this.h);
        for (Object obj : this.i) {
            if (obj != null) {
                c[] cVarArr = this.i;
                Set hashSet = new HashSet();
                Set hashSet2 = new HashSet();
                for (Object obj2 : cVarArr) {
                    if (!(obj2 == null || obj.equals(obj2))) {
                        hashSet.add(obj2.b);
                        hashSet2.add(obj2.c);
                    }
                }
                if (obj.b != null) {
                    obj.b.a(hashSet);
                }
                if (obj.c != null) {
                    obj.c.a(hashSet2);
                }
            }
        }
        this.i = (c[]) this.i.clone();
        return a;
    }

    public final akuk a(String str) {
        this.e = null;
        akum eVar = new e(str);
        a(eVar, (akul) eVar);
        return this;
    }

    /* Access modifiers changed, original: final */
    public final akuk a(String str, String str2) {
        g gVar = null;
        this.e = null;
        List list = this.f;
        if (list.size() == 0) {
            e eVar = e.a;
            akum gVar2 = new g(str, str2, eVar, eVar);
            a(gVar2, (akul) gVar2);
            return this;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (list.get(size) instanceof g) {
                gVar = (g) list.get(size);
                list = list.subList(size + 1, list.size());
                break;
            } else {
                size--;
            }
        }
        if (gVar == null || list.size() != 0) {
            Object[] a = akuk.a(list);
            list.clear();
            g gVar3 = new g(str, str2, (akum) a[0], (akul) a[1]);
            list.add(gVar3);
            list.add(gVar3);
            return this;
        }
        throw new IllegalStateException("Cannot have two adjacent separators");
    }

    /* Access modifiers changed, original: final */
    public final void a(int i) {
        a(i, this.a);
    }

    public final akuk b(String str) {
        return a(new h(str));
    }
}
