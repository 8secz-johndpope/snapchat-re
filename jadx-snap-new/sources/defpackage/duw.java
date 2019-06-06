package defpackage;

import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;

/* renamed from: duw */
public final class duw extends zgi {
    final ajwy<doe> a;
    private final ajwy<dqm> b;

    /* renamed from: duw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: duw$b */
    static final class b<T> implements ajfb<Boolean> {
        private /* synthetic */ duw a;

        b(duw duw) {
            this.a = duw;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            doe doe = (doe) this.a.a.get();
            akcr.a(obj, "it");
            doe.a(obj.booleanValue() ? defpackage.doe.b.OPEN : defpackage.doe.b.CLOSE, 2);
        }
    }

    static {
        a aVar = new a();
    }

    public duw(zgk<b> zgk, ajwy<dqm> ajwy, ajwy<doe> ajwy2) {
        akcr.b(zgk, "taskScoper");
        akcr.b(ajwy, "cameraStateProvider");
        akcr.b(ajwy2, "cameraUsageCollector");
        super(zgk);
        this.b = ajwy;
        this.a = ajwy2;
    }

    public final ajej b() {
        Object f = ((dqm) this.b.get()).l().j(ajfu.a).f((ajfb) new b(this));
        akcr.a(f, "cameraStateProvider.get(…      )\n                }");
        return f;
    }
}
