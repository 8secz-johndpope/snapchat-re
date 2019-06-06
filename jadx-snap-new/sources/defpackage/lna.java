package defpackage;

import com.snap.core.db.api.SnapDb;
import defpackage.mzl.a;

/* renamed from: lna */
public abstract class lna {

    /* renamed from: lna$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lna$d */
    public interface d {
        SnapDb a();

        zgb b();
    }

    /* renamed from: lna$a */
    public static abstract class a implements mhi<lna> {
        public abstract a a(ide ide);

        public abstract a a(d dVar);
    }

    /* renamed from: lna$c */
    public static final class c {

        /* renamed from: lna$c$a */
        static final class a extends akcs implements akbk<lmy> {
            private /* synthetic */ ajwy a;

            a(ajwy ajwy) {
                this.a = ajwy;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                Object obj = this.a.get();
                akcr.a(obj, "remoteRepository.get()");
                return new lmy((mzk) obj);
            }
        }

        static {
            c cVar = new c();
        }

        private c() {
        }

        public static final mzk a(ajwy<mzk> ajwy) {
            akcr.b(ajwy, "remoteRepository");
            akbk aVar = new a(ajwy);
            akcr.b(aVar, "receiver$0");
            return new a(ajxh.a(aVar));
        }

        public static final mzk a(SnapDb snapDb, zfw zfw, ide ide) {
            akcr.b(snapDb, "snapDb");
            akcr.b(zfw, "qualifiedSchedulers");
            akcr.b(ide, "attributedFeature");
            return new lne(snapDb, zfw, ide);
        }

        public static final zfw a(zgb zgb, ide ide) {
            akcr.b(zgb, "schedulersProvider");
            akcr.b(ide, "attributedFeature");
            return zgb.a(ide.callsite("LensesPersistenceComponent"));
        }
    }

    static {
        b bVar = new b();
    }

    public abstract mzk c();
}
