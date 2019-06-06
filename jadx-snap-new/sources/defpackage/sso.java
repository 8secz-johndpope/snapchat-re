package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.smi.a;
import defpackage.ssi.c;
import defpackage.suh.aa;
import defpackage.suh.b;
import java.util.List;

/* renamed from: sso */
public class sso {
    final d a = new d();
    final sug b;
    final srs c;
    public final sst d;
    private final achb<zjm, zjk> e;
    private final gln f;
    private final Context g;
    private final ssl h;
    private final zgb i;
    private final abqo j;
    private final ajwy<fxi> k;
    private final b l;
    private final ajwy<oec> m;

    /* renamed from: sso$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: sso$d */
    public static final class d implements a {
        d() {
        }
    }

    /* renamed from: sso$e */
    static final class e<T, R> implements ajfc<T, R> {
        public static final e a = new e();

        e() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            gej gej = (gej) obj;
            akcr.b(gej, "contentResult");
            sqh sqh = new sqh();
            sxa.a(sqh, gej);
            Object a = sqh.a(sqh.cT);
            akcr.a(a, "fakePage.get(OperaPageModel.PLAYBACK_ITEM_LOADED)");
            boolean booleanValue = ((Boolean) a).booleanValue();
            Object a2 = sqh.a(sqh.cU);
            akcr.a(a2, "fakePage.get(OperaPageMo….PLAYBACK_ITEM_LOADSTATE)");
            c cVar = new c(booleanValue, (aajl) a2);
            gej.close();
            return Optional.of(cVar);
        }
    }

    /* renamed from: sso$f */
    static final class f<T> implements ajfb<Optional<c>> {
        private /* synthetic */ svy.b a;

        f(svy.b bVar) {
            this.a = bVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Optional) obj;
            akcr.a(obj, "loadingState");
            if (obj.isPresent()) {
                svy.b bVar = this.a;
                obj = obj.get();
                akcr.a(obj, "loadingState.get()");
                bVar.a((c) obj);
            }
        }
    }

    /* renamed from: sso$g */
    static final class g<T> implements ajfb<Throwable> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: sso$b */
    static final class b extends akcs implements akbw<sqh, defpackage.svy.b, ajxw> {
        private /* synthetic */ sso a;
        private /* synthetic */ stl b;

        b(sso sso, stl stl) {
            this.a = sso;
            this.b = stl;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            sqh sqh = (sqh) obj;
            defpackage.svy.b bVar = (defpackage.svy.b) obj2;
            akcr.b(sqh, "page");
            akcr.b(bVar, "callback");
            sso sso = this.a;
            stl stl = this.b;
            svv svv = (svv) sqh.a(svt.a);
            if (svv != null) {
                srp srp = svw.b(svv).d;
                if (srp != null) {
                    obj = sso.c.a(srp).b((ajdw) sso.a().h()).f(e.a).c(Optional.absent()).b((ajdw) sso.a().l()).c((ajfb) new f(bVar)).d((ajfb) g.a).c();
                    akcr.a(obj, "operaMediaDownloader.get…             .subscribe()");
                    sth.a(obj, stl.f(), null);
                }
            }
            return ajxw.a;
        }
    }

    /* renamed from: sso$c */
    static final class c extends akcs implements akbl<smi, a> {
        private /* synthetic */ sso a;

        c(sso sso) {
            this.a = sso;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            smi smi = (smi) obj;
            akcr.b(smi, "group");
            sug sug = this.a.b;
            obj = smi.a().a();
            akcr.a(obj, "group.type.featureName");
            ssv a = sug.a(obj);
            if (a != null) {
                a.a aVar = a.c;
                if (aVar != null) {
                    a a2 = aVar.a();
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            return this.a.a;
        }
    }

    static {
        a aVar = new a();
    }

    public sso(sug sug, achb<zjm, zjk> achb, gln gln, Context context, ssl ssl, zgb zgb, abqo abqo, ajwy<fxi> ajwy, srs srs, b bVar, sst sst, ajwy<oec> ajwy2) {
        akcr.b(sug, "operaFeatureSpecManager");
        akcr.b(achb, "navigationHost");
        akcr.b(gln, "uiPageManager");
        akcr.b(context, "context");
        akcr.b(ssl, "operaFeature");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(abqo, "clock");
        akcr.b(ajwy, "deviceConfiguration");
        akcr.b(srs, "operaMediaDownloader");
        akcr.b(bVar, "launcherDeps");
        akcr.b(sst, "operaWarmup");
        akcr.b(ajwy2, "overlayBlobConverter");
        this.b = sug;
        this.e = achb;
        this.f = gln;
        this.g = context;
        this.h = ssl;
        this.i = zgb;
        this.j = abqo;
        this.k = ajwy;
        this.c = srs;
        this.l = bVar;
        this.d = sst;
        this.m = ajwy2;
    }

    private final suh a(long j, sti sti, ssi ssi, stl stl) {
        Object resources = this.g.getResources();
        akcr.a(resources, "context.resources");
        stl.a(resources, this.h, new skh(), b(), this.m);
        return new suh(this.l, stl, sti, new svy(ssi, j, this.j, new b(this, stl)), ajym.b((Object[]) new swa[]{new ssr(this.f, this.e, a(), this.k), new suj()}));
    }

    private final akbl<smi, a> b() {
        return new c(this);
    }

    public final ajcx a(List<? extends smi> list, sti sti, int i, ssi ssi, stl stl) {
        List<? extends smi> list2 = list;
        int i2 = i;
        akcr.b(list, "groups");
        sti sti2 = sti;
        akcr.b(sti, "featureConfiguration");
        akcr.b(ssi, LocalMessageActionModel.ANALYTICS);
        akcr.b(stl, "operaPresenterContext");
        if (i2 < 0 || i2 >= list.size()) {
            throw new IllegalArgumentException("Starting group index is not valid: ".concat(String.valueOf(i)));
        }
        return a((ste) new ste.b((List) list, 0, 0, 0, 30), sti, (smi) list.get(i), ssi, stl);
    }

    public final ajcx a(smi smi, sti sti, ssi ssi, stl stl) {
        smi smi2 = smi;
        akcr.b(smi, "group");
        sti sti2 = sti;
        akcr.b(sti, "featureConfiguration");
        ssi ssi2 = ssi;
        akcr.b(ssi2, LocalMessageActionModel.ANALYTICS);
        stl stl2 = stl;
        akcr.b(stl2, "operaPresenterContext");
        return a((ste) new ste.b(ajyl.a(smi), 0, 0, 0, 30), sti2, smi2, ssi2, stl2);
    }

    public final ajcx a(ste ste, sti sti, smi smi, ssi ssi, stl stl) {
        Throwable th;
        ste ste2 = ste;
        smi smi2 = smi;
        ssi ssi2 = ssi;
        String str = "navigationHost";
        String str2 = "groupsProvider";
        akcr.b(ste2, str2);
        akcr.b(sti, "featureConfiguration");
        String str3 = "startingGroup";
        akcr.b(smi2, str3);
        akcr.b(ssi2, LocalMessageActionModel.ANALYTICS);
        akcr.b(stl, "operaPresenterContext");
        szy a = szr.b.a("OperaLauncher:launch", "");
        try {
            long c = abqo.c();
            suh a2 = a(c, sti, ssi, stl);
            try {
                achb achb = this.e;
                akcr.b(ste2, "groups");
                akcr.b(smi2, str3);
                akcr.b(achb, str);
                akcr.b(ste2, str2);
                akcr.b(smi2, str3);
                akcr.b(achb, str);
                Object e = a2.a(ste2, smi2, achb).a((ajdw) a2.b().l()).c((ajfb) new aa(a2, achb)).e();
                akcr.a(e, "newOperaNavigable(groups…         .ignoreElement()");
                ssi2.c(c, abqo.c());
                szr.b.a(a);
                return e;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    szr.b.a(a);
                }
            }
        } catch (Throwable th5) {
            th3 = th5;
            throw th3;
        }
    }

    public final zfw a() {
        return zgb.a(this.h.callsite("OperaLauncher"));
    }

    public final ajdx<acig<zjm, zjk>> b(ste ste, sti sti, smi smi, ssi ssi, stl stl) {
        akcr.b(ste, "groupsProvider");
        akcr.b(sti, "featureConfiguration");
        akcr.b(smi, "startingGroup");
        akcr.b(ssi, LocalMessageActionModel.ANALYTICS);
        akcr.b(stl, "operaPresenterContext");
        long c = abqo.c();
        ajdx a = a(c, sti, ssi, stl).a(ste, smi, this.e);
        ssi.c(c, abqo.c());
        return a;
    }
}
