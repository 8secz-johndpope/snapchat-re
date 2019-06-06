package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/* renamed from: ypo */
public final class ypo implements ajej, zmb {
    final Map<String, ajej> a = new LinkedHashMap();
    final yhw b;
    private final ajxe c = ajxh.a(new d(this));
    private zgb d;

    /* renamed from: ypo$d */
    static final class d extends akcs implements akbk<zfw> {
        private /* synthetic */ ypo a;

        d(ypo ypo) {
            this.a = ypo;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yhy.j, "PublicUserStoriesSyncableSection");
        }
    }

    /* renamed from: ypo$a */
    public interface a {
        String a();
    }

    /* renamed from: ypo$b */
    static final class b<T, R> implements ajfc<List<? extends String>, ajdb> {
        private /* synthetic */ ypo a;

        b(ypo ypo) {
            this.a = ypo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            akcr.b(list, "it");
            return this.a.b.a(list);
        }
    }

    /* renamed from: ypo$c */
    static final class c implements ajev {
        private /* synthetic */ ypo a;
        private /* synthetic */ String b;

        c(ypo ypo, String str) {
            this.a = ypo;
            this.b = str;
        }

        public final void run() {
            this.a.a.remove(this.b);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ypo.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public ypo(zgb zgb, yhw yhw) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(yhw, "publicUserStorySyncer");
        this.d = zgb;
        this.b = yhw;
    }

    public final void a(View view, zmy zmy) {
        if (zmy instanceof a) {
            ajej ajej = (ajej) this.a.get(((a) zmy).a());
            if (ajej != null) {
                ajej.dispose();
            }
        }
    }

    public final void b(View view, zmy zmy) {
        if (zmy instanceof a) {
            String a = ((a) zmy).a();
            if (!this.a.containsKey(a)) {
                Object e = ajdp.b(ajyl.a(a)).e(200, TimeUnit.MILLISECONDS).a((ajfc) new b(this), false).a((ajdw) ((zfw) this.c.b()).l()).f(new c(this, a)).e();
                akcr.a(e, "disposable");
                if (!e.isDisposed()) {
                    this.a.put(a, e);
                }
            }
        }
    }

    public final void dispose() {
        for (ajej ajej : ajyu.k(this.a.values())) {
            if (!ajej.isDisposed()) {
                ajej.dispose();
            }
        }
    }

    public final boolean isDisposed() {
        if (!this.a.isEmpty()) {
            Object obj;
            Map map = this.a;
            if (!map.isEmpty()) {
                for (Entry value : map.entrySet()) {
                    if (!((ajej) value.getValue()).isDisposed()) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
            return obj != null;
        }
    }
}
