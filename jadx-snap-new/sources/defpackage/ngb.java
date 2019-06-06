package defpackage;

import com.snap.location.map.SharingPreferenceHttpInterface;
import defpackage.nga.a;
import defpackage.nga.d;
import defpackage.nga.e;

/* renamed from: ngb */
public final class ngb implements nga {
    private final ajdw a;
    private final aipn<SharingPreferenceHttpInterface> b;

    /* renamed from: ngb$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ngb$b */
    static final class b<T> implements ajfb<alhe> {
        private /* synthetic */ a a;

        b(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (alhe) obj;
            a aVar = this.a;
            akcr.a(obj, "it");
            aVar.a(obj);
        }
    }

    /* renamed from: ngb$c */
    static final class c<T> implements ajfb<Throwable> {
        private /* synthetic */ a a;

        c(a aVar) {
            this.a = aVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: ngb$d */
    static final class d<T> implements ajfb<aljb> {
        private /* synthetic */ defpackage.nga.d a;

        d(defpackage.nga.d dVar) {
            this.a = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (aljb) obj;
            defpackage.nga.d dVar = this.a;
            akcr.a(obj, "it");
            dVar.a(obj);
        }
    }

    /* renamed from: ngb$e */
    static final class e<T> implements ajfb<Throwable> {
        private /* synthetic */ d a;

        e(d dVar) {
            this.a = dVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    /* renamed from: ngb$f */
    static final class f<T> implements ajfb<alke> {
        private /* synthetic */ e a;

        f(e eVar) {
            this.a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (alke) obj;
            e eVar = this.a;
            akcr.a(obj, "it");
            eVar.a(obj);
        }
    }

    /* renamed from: ngb$g */
    static final class g<T> implements ajfb<Throwable> {
        private /* synthetic */ e a;

        g(e eVar) {
            this.a = eVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            this.a.a();
        }
    }

    static {
        a aVar = new a();
    }

    public ngb(ide ide, aipn<SharingPreferenceHttpInterface> aipn, zgb zgb) {
        akcr.b(ide, "feature");
        akcr.b(aipn, "httpInterface");
        akcr.b(zgb, "schedulersProvider");
        this.b = aipn;
        this.a = zgb.a(ide.callsite("MapSharingPreferenceClientImpl")).g();
    }

    public final void a(ncp ncp, e eVar) {
        akcr.b(ncp, "prefs");
        akcr.b(eVar, "callback");
        alkd alkd = new alkd();
        alkd.a = ncp.a();
        alkd.a(ncp.b());
        ((SharingPreferenceHttpInterface) this.b.get()).setLocationSharingSettings(alkd).b(this.a).a((ajfb) new f(eVar), (ajfb) new g(eVar));
    }

    public final void a(a<alhe> aVar) {
        akcr.b(aVar, "callback");
        ((SharingPreferenceHttpInterface) this.b.get()).deleteLocationSharingSettings(new alhd()).b(this.a).a((ajfb) new b(aVar), (ajfb) new c(aVar));
    }

    public final void a(d dVar) {
        akcr.b(dVar, "callback");
        ((SharingPreferenceHttpInterface) this.b.get()).getLocationSharingSettings(new alja()).b(this.a).a((ajfb) new d(dVar), (ajfb) new e(dVar));
    }
}
