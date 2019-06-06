package defpackage;

import java.util.Iterator;

/* renamed from: akff */
public class akff extends akfe {

    /* renamed from: akff$a */
    public static final class a implements akez<T> {
        private /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        public final Iterator<T> iterator() {
            return this.a;
        }
    }

    /* renamed from: akff$d */
    static final class d extends akcs implements akbk<T> {
        private /* synthetic */ Object a;

        d(Object obj) {
            this.a = obj;
            super(0);
        }

        public final T invoke() {
            return this.a;
        }
    }

    /* renamed from: akff$b */
    public static final class b extends akcs implements akbl<akez<? extends T>, Iterator<? extends T>> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akez akez = (akez) obj;
            akcr.b(akez, "it");
            return akez.iterator();
        }
    }

    /* renamed from: akff$c */
    public static final class c extends akcs implements akbl<T, T> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final T invoke(T t) {
            return t;
        }
    }

    public static final <T> akez<T> a(akez<? extends T> akez) {
        akcr.b(akez, "receiver$0");
        return akez instanceof akes ? akez : new akes(akez);
    }

    public static final <T> akez<T> a(T t, akbl<? super T, ? extends T> akbl) {
        akcr.b(akbl, "nextFunction");
        return t == null ? akev.a : new akey(new d(t), akbl);
    }

    public static final <T> akez<T> a(Iterator<? extends T> it) {
        akcr.b(it, "receiver$0");
        return akff.a((akez) new a(it));
    }

    public static final <T> akez<T> a(T... tArr) {
        akcr.b(tArr, "elements");
        return (tArr.length == 0 ? 1 : null) != null ? akev.a : ajyi.m(tArr);
    }
}
