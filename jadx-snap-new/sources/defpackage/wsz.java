package defpackage;

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.gson.reflect.TypeToken;
import com.snap.core.db.api.SqlDelightDbClient;
import defpackage.wsx.a;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: wsz */
public final class wsz {
    static final Type a = new 1().getType();
    static final Type b = new 2().getType();
    static final Type c = new 3().getType();
    final SqlDelightDbClient d;
    final aipn<iha> e;
    final wqo f = ((wqo) this.d.getDatabase());
    private final wsn g;

    /* renamed from: wsz$1 */
    static class 1 extends TypeToken<ArrayList<String>> {
        1() {
        }
    }

    /* renamed from: wsz$2 */
    static class 2 extends TypeToken<ConcurrentHashMap<String, String>> {
        2() {
        }
    }

    /* renamed from: wsz$3 */
    static class 3 extends TypeToken<ArrayList<ailj>> {
        3() {
        }
    }

    /* renamed from: wsz$4 */
    class 4 implements Callable<Optional<wsx>> {
        4() {
        }

        public final /* synthetic */ Object call() {
            wsr wsr = (wsr) wsz.this.d.queryFirst("ShakeTicketRepository:getFirstPendingTicket", wsz.this.f.a().a(wsy.INITIAL.name()));
            if (wsr == null) {
                return Optional.absent();
            }
            wsz wsz = wsz.this;
            Iterable arrayList = TextUtils.isEmpty(wsr.g()) ? new ArrayList() : (List) ((iha) wsz.e.get()).a(wsr.g(), wsz.a);
            List arrayList2 = TextUtils.isEmpty(wsr.n()) ? new ArrayList() : (List) ((iha) wsz.e.get()).a(wsr.n(), wsz.a);
            ConcurrentHashMap concurrentHashMap = TextUtils.isEmpty(wsr.u()) ? new ConcurrentHashMap() : (ConcurrentHashMap) ((iha) wsz.e.get()).a(wsr.u(), wsz.b);
            List list = (List) ((iha) wsz.e.get()).a(wsr.v(), wsz.c);
            a aVar = new a(wsr.a(), ailz.a(wsr.b()), wsr.c(), wsr.d(), ailq.a(wsr.k()), wsr.j().longValue(), aima.a(wsr.l()));
            aVar.a = wsr.e();
            aVar.b = wsr.f();
            aVar.c = Lists.newArrayList(arrayList);
            aVar.d = wsr.h().booleanValue();
            aVar.e = wsr.i().booleanValue();
            aVar.h = wsr.m().longValue();
            a a = aVar.a(arrayList2);
            a.i = wsr.o().booleanValue();
            a.j = wsr.p();
            a.k = wsr.q();
            a.l = wsr.r();
            a.f = wsr.s().booleanValue();
            a.g = wsr.o().booleanValue();
            a.m = wsr.t().booleanValue();
            a.n = concurrentHashMap;
            a.o = list;
            a.p = wsr.w();
            return Optional.of(a.a());
        }
    }

    public wsz(wsn wsn, aipn<iha> aipn) {
        this.g = wsn;
        this.d = wsn.getDbClient(new idd(wqv.g.getPage()));
        this.e = aipn;
    }

    private /* synthetic */ void a(String str, wsy wsy, ainf.a aVar) {
        this.g.throwIfNotDbScheduler();
        this.f.a().a(wsy.name(), str);
    }

    public final ajcx a(String str, wsy wsy) {
        return this.d.runInTransactionCompat("ShakeTicketRepository:updateShakeTicketStatus", new -$$Lambda$wsz$EeKeP9SRUpuvilA0OGqkj7XsFdA(this, str, wsy));
    }

    public final ajcx a(wsx wsx) {
        return this.d.runInTransactionCompat("ShakeTicketRepository:insertShakeTicket", new -$$Lambda$wsz$48X5gaVQIBS2oiDfEffnnMsdJwM(this, wsx));
    }

    public final ajdx<Optional<wsx>> a() {
        return ajdx.c(new 4());
    }
}
