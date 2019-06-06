package defpackage;

import com.snap.graphene.impl.api.upload.GrapheneUploadJob;
import defpackage.hwm.a;
import java.util.concurrent.Callable;

/* renamed from: imy */
public final class imy implements hwm<GrapheneUploadJob, akxa<Void>> {
    final imv a;

    /* renamed from: imy$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ imy a;
        private /* synthetic */ GrapheneUploadJob b;

        a(imy imy, GrapheneUploadJob grapheneUploadJob) {
            this.a = imy;
            this.b = grapheneUploadJob;
        }

        public final /* synthetic */ Object call() {
            this.a.a.a(this.b.a);
            akcr.b(this.b, "durableJob");
            return ajxw.a;
        }
    }

    public imy(imv imv) {
        akcr.b(imv, "retryManager");
        this.a = imv;
    }

    public final void a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final void a(String str, Integer num) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final boolean a(Throwable th) {
        String str = "throwable";
        akcr.b(th, str);
        akcr.b(th, str);
        return false;
    }

    public final /* synthetic */ void b(hwg hwg) {
        GrapheneUploadJob grapheneUploadJob = (GrapheneUploadJob) hwg;
        String str = "durableJob";
        akcr.b(grapheneUploadJob, str);
        this.a.a(grapheneUploadJob.a);
        akcr.b(grapheneUploadJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        GrapheneUploadJob grapheneUploadJob = (GrapheneUploadJob) hwg;
        akcr.b(grapheneUploadJob, "durableJob");
        Object b = ajcx.b((Callable) new a(this, grapheneUploadJob));
        akcr.a(b, "Completable.fromCallable…saction(durableJob)\n    }");
        return b;
    }

    public final ide c() {
        return imo.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        GrapheneUploadJob grapheneUploadJob = (GrapheneUploadJob) hwg;
        String str = "durableJob";
        akcr.b(grapheneUploadJob, str);
        akcr.b(grapheneUploadJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        GrapheneUploadJob grapheneUploadJob = (GrapheneUploadJob) hwg;
        akcr.b(grapheneUploadJob, "durableJob");
        return a.b(grapheneUploadJob);
    }
}
