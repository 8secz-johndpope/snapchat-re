package defpackage;

import com.google.common.base.Optional;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: ifc */
public final class ifc implements ifg {
    final ConcurrentHashMap<Class<? extends Object>, ajwo<iff<? extends Object>>> a = new ConcurrentHashMap();
    private final ajwo<iff<?>> b;
    private final ajei c;
    private final ihh d;
    private final Optional<ifk> e;
    private final ajwy<abnm> f;

    /* renamed from: ifc$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ ifc a;

        a(ifc ifc) {
            this.a = ifc;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object absent;
            String str;
            iff iff = (iff) obj;
            akcr.b(iff, "event");
            ifc ifc = this.a;
            Class cls = iff.a.getClass();
            akcr.b(cls, "payloadType");
            ajwo ajwo = (ajwo) ifc.a.get(cls);
            if (ajwo == null || !ajwo.n()) {
                absent = Optional.absent();
                str = "Optional.absent()";
            } else {
                absent = Optional.of(ajwo);
                str = "Optional.of(subject)";
            }
            akcr.a(absent, str);
            return new je(absent, iff);
        }
    }

    /* renamed from: ifc$b */
    static final class b<T> implements ajfl<je<Optional<ajwo<iff<? extends Object>>>, iff<?>>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            je jeVar = (je) obj;
            akcr.b(jeVar, "pair");
            obj = jeVar.a;
            if (obj == null) {
                akcr.a();
            }
            akcr.a(obj, "pair.first!!");
            return ((Optional) obj).isPresent();
        }
    }

    /* renamed from: ifc$c */
    static final class c<T> implements ajfb<je<Optional<ajwo<iff<? extends Object>>>, iff<?>>> {
        private /* synthetic */ ifc a;

        c(ifc ifc) {
            this.a = ifc;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (je) obj;
            akcr.a(obj, "it");
            Object obj2 = obj.a;
            if (obj2 == null) {
                akcr.a();
            }
            akcr.a(obj2, "pair.first!!");
            if (((Optional) obj2).isPresent()) {
                obj2 = obj.a;
                if (obj2 == null) {
                    akcr.a();
                }
                ajwo ajwo = (ajwo) ((Optional) obj2).get();
                obj = obj.b;
                if (obj != null) {
                    ajwo.a((iff) obj);
                    return;
                }
                throw new ajxt("null cannot be cast to non-null type com.snap.framework.network.event.NetEvent<out kotlin.Any>");
            }
        }
    }

    /* renamed from: ifc$d */
    static final class d<T> implements ajfb<Throwable> {
        private /* synthetic */ ifc a;

        d(ifc ifc) {
            this.a = ifc;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ifc ifc = this.a;
            akcr.a((Object) th, "it");
            ifd.a(th, ifc.e);
        }
    }

    /* renamed from: ifc$f */
    static final class f<T, R> implements ajfc<T, R> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "netEvent");
            return iff;
        }
    }

    /* renamed from: ifc$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ ifc a;

        g(ifc ifc) {
            this.a = ifc;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            ifc ifc = this.a;
            akcr.a((Object) th, "it");
            ifd.a(th, ifc.e);
        }
    }

    /* renamed from: ifc$h */
    static final class h<T, R> implements ajfc<T, R> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "netEvent");
            return iff;
        }
    }

    /* renamed from: ifc$i */
    static final class i<T, R> implements ajfc<iff<T>, ajdb> {
        private /* synthetic */ akbl a;

        i(akbl akbl) {
            this.a = akbl;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "it");
            return (ajcx) this.a.invoke(iff);
        }
    }

    /* renamed from: ifc$j */
    static final class j<T, R> implements ajfc<Throwable, ajdb> {
        public static final j a = new j();

        j() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            akcr.b((Throwable) obj, "it");
            return ajvo.a(ajib.a);
        }
    }

    /* renamed from: ifc$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            iff iff = (iff) obj;
            akcr.b(iff, "netEvent");
            return iff;
        }
    }

    public ifc(ajdw ajdw, ihh ihh, Optional<ifk> optional, ajwy<abnm> ajwy) {
        akcr.b(ajdw, "scheduler");
        akcr.b(ihh, "clock");
        akcr.b(optional, "exceptionTracker");
        akcr.b(ajwy, "crasher");
        this.d = ihh;
        this.e = optional;
        this.f = ajwy;
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<NetEvent<*>>()");
        this.b = ajwo;
        ajej a = this.b.p(new a(this)).a((ajfl) b.a).a(ajdw).a((ajfb) new c(this), (ajfb) new d(this));
        this.c = new ajei(a);
    }

    public final <T> ajej a(Class<T> cls, ajfb<iff<T>> ajfb) {
        akcr.b(cls, "clazz");
        akcr.b(ajfb, "consumer");
        this.a.putIfAbsent(cls, new ajwo());
        Object obj = (ajwo) this.a.get(cls);
        if (obj != null) {
            akcr.a(obj, "observableMap[clazz] ?: …w IllegalStateException()");
            obj = obj.p(f.a).a((ajfb) new ifn(ajfb, this.e, this.f), (ajfb) new g(this));
            akcr.a(obj, "obs.map { netEvent -> ne…mer { this.onError(it) })");
            return obj;
        }
        throw new IllegalStateException();
    }

    public final <T> ajej a(Class<T> cls, akbl<? super iff<T>, ? extends ajcx> akbl) {
        akcr.b(cls, "clazz");
        akcr.b(akbl, "f");
        this.a.putIfAbsent(cls, new ajwo());
        Object obj = (ajwo) this.a.get(cls);
        if (obj != null) {
            akcr.a(obj, "observableMap[clazz] ?: …w IllegalStateException()");
            obj = obj.p(h.a).a((ajfc) new i(akbl), false).a((ajfc) j.a).e();
            akcr.a(obj, "obs.map { netEvent -> ne…             .subscribe()");
            return obj;
        }
        throw new IllegalStateException();
    }

    public final ifi a() {
        Object uuid = iig.a().toString();
        akcr.a(uuid, "id.toString()");
        return a(uuid);
    }

    public final ifi a(String str) {
        akcr.b(str, "id");
        return new ifi(str, this.b, this.d);
    }

    public final <T> ajej b(Class<T> cls, akbl<? super ajdp<iff<T>>, ? extends ajcx> akbl) {
        akcr.b(cls, "clazz");
        akcr.b(akbl, "f");
        this.a.putIfAbsent(cls, new ajwo());
        Object obj = (ajwo) this.a.get(cls);
        if (obj != null) {
            akcr.a(obj, "observableMap[clazz] ?: …w IllegalStateException()");
            obj = obj.p(e.a);
            akcr.a(obj, "obs.map { netEvent -> netEvent as NetEvent<T> }");
            obj = ((ajcx) akbl.invoke(obj)).e();
            akcr.a(obj, "f(obs.map { netEvent -> …etEvent<T> }).subscribe()");
            return obj;
        }
        throw new IllegalStateException();
    }
}
