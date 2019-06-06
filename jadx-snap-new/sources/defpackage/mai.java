package defpackage;

import com.google.common.base.Supplier;
import com.snap.core.db.record.DiscoverStorySnapModel;
import defpackage.man.a.b;
import defpackage.map.a;
import defpackage.map.a.c;

/* renamed from: mai */
public final class mai implements mao {
    final Supplier<iha> a;
    final String b;
    private final akbl<a, ajdp<? extends man.a>> c = new a(this);
    private final map d;
    private final man e;

    /* renamed from: mai$a */
    static final class a extends akcs implements akbl<defpackage.map.a, ajdp<? extends defpackage.man.a>> {
        private /* synthetic */ mai a;

        a(mai mai) {
            this.a = mai;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            String str;
            defpackage.map.a aVar = (defpackage.map.a) obj;
            akcr.b(aVar, "result");
            if (aVar instanceof c) {
                iha iha = (iha) this.a.a.get();
                c cVar = (c) aVar;
                mhs mhs = cVar.a;
                String str2 = this.a.b;
                Object a = iha.a(cVar.b, Object.class);
                String str3 = "serializer.fromJson(resu…Profile, Any::class.java)";
                akcr.a(a, str3);
                String str4 = DiscoverStorySnapModel.LENSID;
                akcr.b(mhs, str4);
                String str5 = "userAgent";
                akcr.b(str2, str5);
                String str6 = "latencyProfile";
                akcr.b(a, str6);
                Object b = iha.b(defpackage.maq.a.a(mhs, str2, "cpu", a));
                mhs mhs2 = cVar.a;
                String str7 = this.a.b;
                Object a2 = iha.a(cVar.c, Object.class);
                akcr.a(a2, str3);
                akcr.b(mhs2, str4);
                akcr.b(str7, str5);
                akcr.b(a2, str6);
                Object b2 = iha.b(defpackage.maq.a.a(mhs2, str7, "gpu", a2));
                Object[] objArr = new b[2];
                mhs mhs3 = cVar.a;
                akcr.a(b, "cpuReport");
                objArr[0] = new b(mhs3, b, cVar.d);
                mhs mhs4 = cVar.a;
                akcr.a(b2, "gpuReport");
                objArr[1] = new b(mhs4, b2, cVar.d);
                obj = ajdp.a(objArr);
                str = "Observable.fromArray(\n  …                       ))";
            } else {
                obj = ajdp.b(defpackage.man.a.a.a);
                str = "just(InstrumentationConsole.Model.Empty)";
            }
            akcr.a(obj, str);
            return obj;
        }
    }

    public mai(map map, man man, Supplier<iha> supplier, String str) {
        akcr.b(map, "instrumentationUseCase");
        akcr.b(man, "instrumentationConsole");
        akcr.b(supplier, "serializationHelperSupplier");
        akcr.b(str, "userAgent");
        this.d = map;
        this.e = man;
        this.a = supplier;
        this.b = str;
    }

    public final ajej a() {
        Object f = this.d.b().u(new maj(this.c)).f((ajfb) this.e);
        akcr.a(f, "instrumentationUseCase.o…e(instrumentationConsole)");
        return f;
    }

    public final ajdp<Object> b() {
        return mha.a.a(this);
    }
}
