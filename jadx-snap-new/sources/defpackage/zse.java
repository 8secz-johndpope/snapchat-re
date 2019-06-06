package defpackage;

import android.util.Base64;
import com.google.common.base.Optional;
import com.google.common.reflect.TypeToken;
import defpackage.zpq.b.a;
import java.lang.reflect.Type;
import java.util.concurrent.Callable;

/* renamed from: zse */
public final class zse implements a {
    final ajxe a = ajxh.a(f.a);
    final ihh b;
    private final ftl c;
    private final ajdx<iha> d;

    /* renamed from: zse$f */
    static final class f extends akcs implements akbk<Type> {
        public static final f a = new f();

        /* renamed from: zse$f$1 */
        public static final class 1 extends TypeToken<abrj<String>> {
            1() {
            }
        }

        f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new 1().getType();
        }
    }

    /* renamed from: zse$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ zse a;
        private /* synthetic */ String b;

        c(zse zse, String str) {
            this.a = zse;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            iha iha = (iha) obj;
            akcr.b(iha, "it");
            return Optional.fromNullable(iha.a(this.b, (Type) this.a.a.b()));
        }
    }

    /* renamed from: zse$d */
    static final class d<T> implements ajfl<Optional<abrj<String>>> {
        private /* synthetic */ zse a;
        private /* synthetic */ long b;

        d(zse zse, long j) {
            this.a = zse;
            this.b = j;
        }

        public final /* synthetic */ boolean test(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            abrj abrj = (abrj) optional.orNull();
            return (abrj != null ? abrj.b() + this.b : 0) >= this.a.b.a();
        }
    }

    /* renamed from: zse$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Optional optional = (Optional) obj;
            akcr.b(optional, "it");
            return (abrj) optional.get();
        }
    }

    /* renamed from: zse$b */
    static final class b<T, R> implements ajfc<T, ajeb<? extends R>> {
        private /* synthetic */ zse a;

        b(zse zse) {
            this.a = zse;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abrj abrj = (abrj) obj;
            akcr.b(abrj, "it");
            obj = abrj.a();
            akcr.a(obj, "it.value");
            return zse.a((String) obj);
        }
    }

    /* renamed from: zse$a */
    static final class a<V> implements Callable<T> {
        private /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        public final /* synthetic */ Object call() {
            return Base64.decode(this.a, 2);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zse.class), "timestampedValueType", "getTimestampedValueType()Ljava/lang/reflect/Type;");
    }

    public zse(ftl ftl, ajdx<iha> ajdx, ihh ihh) {
        akcr.b(ftl, "configProvider");
        akcr.b(ajdx, "serializationHelper");
        akcr.b(ihh, "clock");
        this.c = ftl;
        this.d = ajdx;
        this.b = ihh;
    }

    public static ajdx<byte[]> a(String str) {
        akcr.b(str, "stringToken");
        Object c = ajdx.c((Callable) new a(str));
        akcr.a(c, "Single.fromCallable {\n  …ully.\")\n                }");
        akcr.a(c, "trace(\"\") {\n            …          }\n            }");
        return c;
    }

    public final ajdx<byte[]> a() {
        String j = this.c.j(zpt.GTQ_AUTH_PAYLOAD);
        if (j == null) {
            j = null;
        }
        Object f = this.d.f(new c(this, j)).a((ajfl) new d(this, this.c.h(zpt.SERVER_CONFIG_GTQ_AUTH_TOKEN_EXPIRATION_MILLIS))).f(e.a);
        akcr.a(f, "serializationHelper\n    …is}\") }\n                }");
        f = f.c((ajfc) new b(this));
        akcr.a(f, "fromCache().flatMapSingle { decode(it.value) }");
        return f;
    }
}
