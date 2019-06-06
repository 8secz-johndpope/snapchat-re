package defpackage;

import defpackage.miw.b.a;
import defpackage.miw.c;

/* renamed from: mlx */
public final class mlx implements mob {
    final c a;

    /* renamed from: mlx$a */
    static final class a<T1, T2, R> implements ajex<String, String, Boolean> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj, Object obj2) {
            obj = (String) obj;
            obj2 = (String) obj2;
            akcr.b(obj, "expected");
            akcr.b(obj2, "actual");
            return Boolean.valueOf(akcr.a(obj, obj2));
        }
    }

    /* renamed from: mlx$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ mlx a;
        private /* synthetic */ String b;

        b(mlx mlx, String str) {
            this.a = mlx;
            this.b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "it");
            if (bool.booleanValue()) {
                return this.a.a.f(mja.TRACKING_DATA_CHECKSUM);
            }
            StringBuilder stringBuilder = new StringBuilder("Cannot find checksum for ");
            stringBuilder.append(this.b);
            obj = ajdp.b((Throwable) new IllegalArgumentException(stringBuilder.toString()));
            akcr.a(obj, "Observable.error(Illegal…ksum for $resourceName\"))");
            return obj;
        }
    }

    public mlx(miw miw) {
        akcr.b(miw, "configurationRepository");
        this.a = miw.a(a.a);
    }

    public final ajdp<String> a(String str) {
        akcr.b(str, "resourceName");
        Object u = ajdp.b((ajdt) ajdp.b((Object) str), (ajdt) this.a.f(mja.TRACKING_DATA_NAME), (ajex) a.a).u(new b(this, str));
        akcr.a(u, "Observable.zip<String, S…  }\n                    }");
        return u;
    }
}
