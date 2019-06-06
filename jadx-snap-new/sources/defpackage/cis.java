package defpackage;

import android.text.TextUtils;
import com.google.protobuf.nano.Int32Value;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: cis */
public final class cis implements cih {
    private final ajxe a;
    private final ajxe b;
    private final ftl c;
    private final civ d;

    /* renamed from: cis$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cis$b */
    static final class b extends akcs implements akbk<cii> {
        private /* synthetic */ ajwy a;

        b(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (cii) this.a.get();
        }
    }

    /* renamed from: cis$c */
    static final class c extends akcs implements akbk<rxj> {
        private /* synthetic */ ajwy a;

        c(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (rxj) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(cis.class), "adRequestDataSupplierApi", "getAdRequestDataSupplierApi()Lcom/snap/adinfo/api/DeviceInfoSupplierApi;"), new akdc(akde.a(cis.class), "bandwidthClassManager", "getBandwidthClassManager()Lcom/snap/network/bandwidth/api/BandwidthClassManager;")};
        a aVar = new a();
    }

    public cis(ajwy<cii> ajwy, ftl ftl, civ civ, ajwy<rxj> ajwy2) {
        akcr.b(ajwy, "deviceInfoSupplierApiProvider");
        akcr.b(ftl, "configProvider");
        akcr.b(civ, "inventoryRequestBuilder");
        akcr.b(ajwy2, "bandwidthClassManagerProvider");
        this.c = ftl;
        this.d = civ;
        this.a = ajxh.a(new b(ajwy));
        this.b = ajxh.a(new c(ajwy2));
    }

    private final cii c() {
        return (cii) this.a.b();
    }

    public final ajdx<akzp> a(List<cjg> list, List<byte[]> list2) {
        alas[] alasArr;
        Object[] toArray;
        Object akzp = new akzp();
        akzp.a = c().l();
        akzp.b = c().o();
        akzp.c = c().p();
        akzp.d = c().q();
        akzp.e = c().r();
        Object obj = akzp.e;
        akcr.a(obj, "network");
        Object obj2 = (rxj) this.b.b();
        akcr.a(obj2, "bandwidthClassManager");
        obj.a(obj2.d() / 8000);
        boolean z = (!this.c.a((fth) cip.ENABLE_DEBUG_REQUEST) && TextUtils.isEmpty(this.c.j(cip.DEBUG_AD_ID)) && ((clb) this.c.l(cld.DEBUG_AD_TYPE)) == clb.NOT_APPLICABLE && TextUtils.isEmpty(this.c.j(cld.CUSTOM_AD_SERVER_HOST)) && (this.c.l(cld.PRESET_AD_SERVER_HOST) == null || ((cla) this.c.l(cld.PRESET_AD_SERVER_HOST)) == cla.DEFAULT)) ? false : true;
        akzp.a(z);
        String str = "null cannot be cast to non-null type kotlin.Array<T>";
        byte[][] bArr = null;
        if (list == null || list.isEmpty()) {
            alasArr = null;
        } else {
            Iterable<cjg> iterable = list;
            Collection arrayList = new ArrayList(ajyn.a((Iterable) iterable, 10));
            for (cjg cjg : iterable) {
                civ civ = this.d;
                akcr.b(cjg, "adRequestTargetingParams");
                alas alas = new alas();
                alas.a(cjg.a.a());
                alas.a(cjg.b);
                int i = cjg.c;
                Int32Value int32Value = new Int32Value();
                int32Value.setValue(i);
                alas.a = int32Value;
                alas.a(cjg.d);
                alas.b(cjg.f);
                String str2 = cjg.e;
                if (str2 != null) {
                    alas.b(str2);
                }
                alak alak = cjg.h;
                if (alak != null) {
                    alas.b = alak;
                }
                boolean a = civ.a().a((fth) cld.ENABLE_DPA);
                boolean a2 = civ.a().a((fth) cld.ENABLE_PETRA);
                alam alam = new alam();
                alam.b(a);
                alam.a(a2);
                alas.c = alam;
                alas.c(civ.a().a((fth) cld.ENABLE_AD_RESPONSE_PROTO_PAYLOAD));
                arrayList.add(alas);
            }
            toArray = ((List) arrayList).toArray(new alas[0]);
            if (toArray != null) {
                alasArr = (alas[]) toArray;
            } else {
                throw new ajxt(str);
            }
        }
        akzp.f = alasArr;
        if (list2 != null) {
            Collection collection = list2;
            if (collection != null) {
                toArray = collection.toArray(new byte[0][]);
                if (toArray != null) {
                    bArr = (byte[][]) toArray;
                } else {
                    throw new ajxt(str);
                }
            }
            throw new ajxt("null cannot be cast to non-null type java.util.Collection<T>");
        }
        akzp.g = bArr;
        Object b = ajdx.b(akzp);
        akcr.a(b, "Single.just(\n           …rray()\n                })");
        return b;
    }

    public final cjc a() {
        return new cjc(c().h(), this.c.a((fth) cip.LIMIT_AD_TRACKING_ENABLED), this.c.a((fth) cip.AUDIENCE_MATCH_OPT_OUT), this.c.a((fth) cip.EXTERNAL_ACTIVITY_MATCH_OPT_OUT));
    }

    public final cjd b() {
        return new cjd(c().g(), c().i());
    }
}
