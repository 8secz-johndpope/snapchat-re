package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.brightcove.player.media.ErrorFields;
import com.google.common.base.Supplier;
import defpackage.kpm.a;
import defpackage.kpm.b;
import defpackage.kqe.aa;
import defpackage.kqe.ak;
import defpackage.kqe.i;
import defpackage.kqe.m;
import defpackage.kqe.r;
import defpackage.kqe.s;
import defpackage.kqe.v;
import defpackage.kqt.b.c;
import defpackage.kqt.b.d;
import defpackage.kqt.b.e;
import defpackage.kqt.b.f;
import defpackage.kqt.b.g;
import defpackage.kqt.b.h;
import defpackage.kqt.b.j;
import defpackage.kqt.b.k;
import defpackage.kqt.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: kvm */
final class kvm {

    /* renamed from: kvm$a */
    public static final class a implements b {
        private final ide a;
        private final zgb b;
        private final Supplier<iha> c;
        private final Supplier<dib> d;
        private final ilv e;
        private final miw f;
        private final Supplier<iib> g;
        private final abss h;
        private final cko i;
        private final Supplier<ckx> j;
        private final ajei k;
        private /* synthetic */ ide l;
        private /* synthetic */ zgb m;
        private /* synthetic */ Supplier n;
        private /* synthetic */ Supplier o;
        private /* synthetic */ ilv p;
        private /* synthetic */ miw q;
        private /* synthetic */ Supplier r;
        private /* synthetic */ abss s;
        private /* synthetic */ cko t;
        private /* synthetic */ Supplier u;
        private /* synthetic */ ajei v;

        a(ide ide, zgb zgb, Supplier supplier, Supplier supplier2, ilv ilv, miw miw, Supplier supplier3, abss abss, cko cko, Supplier supplier4, ajei ajei) {
            this.l = ide;
            this.m = zgb;
            this.n = supplier;
            this.o = supplier2;
            this.p = ilv;
            this.q = miw;
            this.r = supplier3;
            this.s = abss;
            this.t = cko;
            this.u = supplier4;
            this.v = ajei;
            this.a = ide;
            this.b = zgb;
            this.c = supplier;
            this.d = supplier2;
            this.e = ilv;
            this.f = miw;
            this.g = supplier3;
            this.h = abss;
            this.i = cko;
            this.j = supplier4;
            this.k = ajei;
        }

        public final ide a() {
            return this.a;
        }

        public final zgb b() {
            return this.b;
        }

        public final Supplier<dib> c() {
            return this.d;
        }

        public final Supplier<iha> d() {
            return this.c;
        }

        public final ilv e() {
            return this.e;
        }

        public final miw f() {
            return this.f;
        }

        public final Supplier<iib> g() {
            return this.g;
        }

        public final cko h() {
            return this.i;
        }

        public final Supplier<ckx> i() {
            return this.j;
        }

        public final ajei j() {
            return this.k;
        }
    }

    /* renamed from: kvm$b */
    static final class b<V> implements Callable<ajdt<? extends T>> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
        }

        public final /* synthetic */ Object call() {
            return ((a) this.a.get()).b();
        }
    }

    /* renamed from: kvm$c */
    static final class c extends akcs implements akbl<String, ajxw> {
        private /* synthetic */ Context a;

        c(Context context) {
            this.a = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            akcr.b(str, ErrorFields.MESSAGE);
            Toast.makeText(this.a, str, 1).show();
            return ajxw.a;
        }
    }

    static {
        kvm kvm = new kvm();
    }

    private kvm() {
    }

    public static final ajdp<kqr> a(ajwy<a> ajwy, zgb zgb, ide ide) {
        akcr.b(ajwy, "analyticsComponent");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        Object b = ajdp.a((Callable) new b(ajwy)).b((ajdw) zgb.a(ide.callsite("lensInfoObservable")).h());
        akcr.a(b, "Observable\n             …dulers.userInteractive())");
        return b;
    }

    public static final a a(a aVar, Supplier<dib> supplier, Supplier<iha> supplier2, zgb zgb, ide ide, ilv ilv, miw miw, Supplier<iib> supplier3, abss abss, cko cko, Supplier<ckx> supplier4, ajei ajei) {
        Supplier<dib> supplier5 = supplier;
        akcr.b(supplier, "blizzardEventLogger");
        akcr.b(supplier2, "serializationHelper");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        akcr.b(ilv, "graphene");
        akcr.b(miw, "configurationRepository");
        akcr.b(supplier3, "screenParameterProvider");
        akcr.b(abss, "releaseManager");
        akcr.b(cko, "adTrackerApi");
        akcr.b(supplier4, "swipeToLensSource");
        akcr.b(ajei, "compositeDisposable");
        if (aVar != null && aVar != null) {
            return aVar;
        }
        return kqo.c().a(new kpm(new a(ide, zgb, supplier2, supplier, ilv, miw, supplier3, abss, cko, supplier4, ajei)).a).a();
    }

    public static final kqf a(a aVar, dpr dpr) {
        akcr.b(aVar, "analyticsComponent");
        List arrayList = new ArrayList();
        arrayList.add(new kqq());
        Collection collection = arrayList;
        akcr.b(collection, "receiver$0");
        Object[] toArray = collection.toArray(new kql[0]);
        if (toArray != null) {
            kql[] kqlArr = (kql[]) toArray;
            kqlArr = (kql[]) Arrays.copyOf(kqlArr, kqlArr.length);
            akcr.b(kqlArr, "asyncTracers");
            if ((kqlArr.length == 0 ? 1 : null) == null) {
                Object aVar2 = kqlArr.length == 1 ? (kql) ajyi.c(kqlArr) : new kqm.a(kqlArr);
                String str = "asyncTracer";
                akcr.b(aVar2, str);
                akcr.b(aVar2, str);
                kqt.a aVar3 = new kqt.a(aVar2);
                akbw aVar4 = new kqt.b.a();
                Object simpleName = m.class.getSimpleName();
                String str2 = "E::class.java.simpleName";
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new g();
                simpleName = ak.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new kqt.b.b();
                simpleName = r.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new h();
                simpleName = ak.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new c();
                simpleName = i.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new kqt.b.i();
                simpleName = kqe.a.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new d();
                simpleName = s.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new j();
                simpleName = aa.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new e();
                simpleName = aa.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new k();
                simpleName = v.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new f();
                simpleName = m.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                aVar4 = new l();
                simpleName = s.class.getSimpleName();
                akcr.a(simpleName, str2);
                aVar3.a(simpleName, aVar4);
                kqt kqt = new kqt(aVar3.b, aVar3.a, (byte) 0);
                kqf kvs = dpr != null ? new kvs(dpr, aVar.a()) : aVar.a();
                kqf[] kqfArr = new kqf[]{kqt, kvs};
                akcr.b(kqfArr, "analyticsEventHandlers");
                return new kqh.a(kqfArr);
            }
            throw new IllegalArgumentException("empty asyncTracers");
        }
        throw new ajxt("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final miw a(lbp.a aVar, ide ide) {
        akcr.b(ide, "attributedFeature");
        if (aVar != null) {
            miw e = aVar.a(ide).a().e();
            if (e != null) {
                return e;
            }
        }
        return new miy();
    }

    public static final mng a(Context context, abss abss, kqf kqf, gqr gqr, zgb zgb, ide ide) {
        kvj kvj;
        akcr.b(context, "context");
        akcr.b(abss, "releaseManager");
        akcr.b(kqf, "analyticsEventHandler");
        akcr.b(gqr, "exceptionTracker");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ide, "attributedFeature");
        if (abss.j()) {
            kvj = new kvj(zgb.a(ide, "CrashImmediatelyNativeExceptionHandler").l());
        } else {
            kvj = new kvt(gqr, kqf, abss.d() ? new kvu(new c(context)) : mng.a.a, ide.callsite("NativeExceptionHandler"));
        }
        return kvj;
    }
}
