package defpackage;

import com.google.protobuf.nano.Timestamp;
import com.snap.core.db.record.BenchmarkRequestRecordModel;
import defpackage.fim.a;
import defpackage.fim.c;
import defpackage.fim.g;
import defpackage.fim.h;
import defpackage.fim.j;
import defpackage.fim.k;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: fin */
public final class fin implements fik {
    private final fim a;

    public fin(fim fim) {
        akcr.b(fim, "benchmarkRepository");
        this.a = fim;
    }

    public final ajdx<List<Integer>> a() {
        Object c = ajdx.c((Callable) new g(this.a));
        akcr.a(c, "Single.fromCallable {\n  …              }\n        }");
        return c;
    }

    public final ajdx<Boolean> a(int i) {
        fim fim = this.a;
        return fim.a().callInTransaction("BenchmarkRepository:markBenchmarkScheduled", new k(fim, i));
    }

    public final ajdx<Boolean> a(acbt acbt) {
        akcr.b(acbt, "benchmarkRequest");
        fim fim = this.a;
        akcr.b(acbt, "benchmarkRequests");
        Timestamp timestamp = acbt.b;
        return fim.a().callInTransaction("BenchmarkRepository:addBenchmarkRequest", new a(fim, acbt, timestamp != null ? Long.valueOf(timestamp.getSeconds()) : null));
    }

    public final ajdx<Boolean> a(acbu acbu) {
        String str = BenchmarkRequestRecordModel.BENCHMARKRESULT;
        akcr.b(acbu, str);
        fim fim = this.a;
        akcr.b(acbu, str);
        return fim.a().callInTransaction("BenchmarkRepository:addBenchmarkResult", new c(fim, acbu));
    }

    public final ajdx<Boolean> a(List<acbu> list) {
        String str = "results";
        akcr.b(list, str);
        fim fim = this.a;
        akcr.b(list, str);
        return fim.a().callInTransaction("BenchmarkRepository:markBenchmarkResultsReported", new j(fim, list));
    }

    public final ajdx<List<acbu>> b() {
        Object c = ajdx.c((Callable) new h(this.a));
        akcr.a(c, "Single.fromCallable {\n  …ilterNotNull()\n\n        }");
        return c;
    }
}
