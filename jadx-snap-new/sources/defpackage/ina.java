package defpackage;

import com.snap.core.db.record.CognacRVModel;
import com.snap.graphene.impl.api.GrapheneHttpInterface;
import defpackage.imz.a;
import java.util.concurrent.TimeUnit;

/* renamed from: ina */
public final class ina implements imz {
    private final aipn<ajdw> a;
    private final aipn<ajdw> b;
    private final ajwy<GrapheneHttpInterface> c;
    private final ajwy<imv> d;

    /* renamed from: ina$a */
    static final class a<T> implements ajfb<Throwable> {
        private /* synthetic */ ina a;
        private /* synthetic */ byte[] b;
        private /* synthetic */ String c;

        a(ina ina, byte[] bArr, String str) {
            this.a = ina;
            this.b = bArr;
            this.c = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Throwable) obj;
            ina ina = this.a;
            byte[] bArr = this.b;
            String str = this.c;
            akcr.a(obj, "throwable");
            ((imv) ina.d.get()).a(new defpackage.imz.a(bArr, str)).e();
        }
    }

    /* renamed from: ina$b */
    static final class b<T> implements ajfb<akxa<Void>> {
        private /* synthetic */ ina a;
        private /* synthetic */ byte[] b;
        private /* synthetic */ String c;

        b(ina ina, byte[] bArr, String str) {
            this.a = ina;
            this.b = bArr;
            this.c = str;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (akxa) obj;
            akcr.a(obj, "result");
            if (obj.c()) {
                ina ina = this.a;
                byte[] bArr = this.b;
                String str = this.c;
                obj = obj.b();
                if (obj == null) {
                    akcr.a();
                }
                akcr.a(obj, "result.error()!!");
                ((imv) ina.d.get()).a(new a(bArr, str)).e();
            }
        }
    }

    public ina(aipn<ajdw> aipn, aipn<ajdw> aipn2, ajwy<GrapheneHttpInterface> ajwy, ajwy<imv> ajwy2) {
        akcr.b(aipn, "networkScheduler");
        akcr.b(aipn2, "concurrentScheduler");
        akcr.b(ajwy, "grapheneHttpInterface");
        akcr.b(ajwy2, "retryManager");
        this.a = aipn;
        this.b = aipn2;
        this.c = ajwy;
        this.d = ajwy2;
    }

    public final ajdx<akxa<Void>> a(byte[] bArr, String str) {
        akcr.b(bArr, "metricFrame");
        akcr.b(str, CognacRVModel.REQUESTID);
        GrapheneHttpInterface grapheneHttpInterface = (GrapheneHttpInterface) this.c.get();
        Object create = akhu.create((akho) imu.a.b(), bArr);
        akcr.a(create, "RequestBody.create(PROTO_MEDIA_TYPE, metricFrame)");
        Object c = grapheneHttpInterface.emitMetricFrame(create).c(2, TimeUnit.MINUTES, (ajdw) this.b.get()).b((ajdw) this.a.get()).d((ajfb) new a(this, bArr, str)).c((ajfb) new b(this, bArr, str));
        akcr.a(c, "grapheneHttpInterface.ge…      }\n                }");
        return c;
    }
}
