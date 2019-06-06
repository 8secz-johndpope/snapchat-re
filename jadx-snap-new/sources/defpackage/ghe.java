package defpackage;

import com.brightcove.player.event.Event;
import com.coremedia.iso.boxes.FreeSpaceBox;
import com.looksery.sdk.listener.AnalyticsListener;
import com.snap.core.db.record.DataConsumption;
import java.util.List;

/* renamed from: ghe */
public final class ghe implements ger {
    private final ajxe a;

    /* renamed from: ghe$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: ghe$d */
    static final class d extends akcs implements akbk<get> {
        private /* synthetic */ ajwy a;

        d(ajwy ajwy) {
            this.a = ajwy;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (get) this.a.get();
        }
    }

    /* renamed from: ghe$b */
    static final class b<T, R> implements ajfc<T, Iterable<? extends U>> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, Event.LIST);
            return list;
        }
    }

    /* renamed from: ghe$c */
    static final class c<T, R> implements ajfc<T, R> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            DataConsumption dataConsumption = (DataConsumption) obj;
            akcr.b(dataConsumption, "it");
            return dataConsumption.getNetworkRequestId();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ghe.class), "repository", "getRepository()Lcom/snap/core/net/content/api/DataConsumptionRepository;");
        a aVar = new a();
    }

    public ghe(ajwy<get> ajwy) {
        akcr.b(ajwy, "repositoryProvider");
        this.a = ajxh.a(new d(ajwy));
    }

    private final get c() {
        return (get) this.a.b();
    }

    public final ajdp<List<String>> a() {
        ajdp p = c().a().c((ajfc) b.a).p(c.a);
        Object obj = ajuk.INSTANCE;
        ajfv.a(100, AnalyticsListener.ANALYTICS_COUNT_KEY);
        ajfv.a(100, FreeSpaceBox.TYPE);
        ajfv.a(obj, "bufferSupplier is null");
        Object a = ajvo.a(new ajnu(p, obj));
        akcr.a(a, "repository.selectAndDele….buffer(MAX_ID_LIST_SIZE)");
        return a;
    }

    public final ajcx b() {
        return c().a(System.currentTimeMillis() - 604800000);
    }
}
