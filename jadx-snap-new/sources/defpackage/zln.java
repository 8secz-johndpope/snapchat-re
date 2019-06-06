package defpackage;

import com.google.common.collect.ImmutableMap;

/* renamed from: zln */
public class zln<Target> {
    public static final a Companion = new a();
    private static final b DEFAULT_SCOPE_UNTIL = b.ON_DROP_TARGET;
    private static final ImmutableMap<b, b> SCOPES = ImmutableMap.builder().put(b.ON_TAKE_TARGET, b.ON_DROP_TARGET).build();
    private final String defaultName = getClass().getName();
    private final ajwl<b> lifecycleSubject;
    private final zgk<b> taskScoper;

    /* renamed from: zln$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zln$b */
    public enum b {
        ON_TAKE_TARGET,
        ON_DROP_TARGET
    }

    public zln() {
        Object ajwl = new ajwl();
        akcr.a(ajwl, "BehaviorSubject.create<LifecycleEvent>()");
        this.lifecycleSubject = ajwl;
        this.taskScoper = new zgk(this.lifecycleSubject, SCOPES);
    }

    public static /* synthetic */ ajej bind$default(zln zln, ajej ajej, b bVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bVar = DEFAULT_SCOPE_UNTIL;
            }
            if ((i & 4) != 0) {
                str = zln.defaultName;
                akcr.a((Object) str, "defaultName");
            }
            return zln.bind(ajej, bVar, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    public static /* synthetic */ ajej bindTo$default(zln zln, ajej ajej, zln zln2, b bVar, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                bVar = DEFAULT_SCOPE_UNTIL;
            }
            if ((i & 4) != 0) {
                str = zln.defaultName;
                akcr.a((Object) str, "defaultName");
            }
            return zln.bindTo(ajej, zln2, bVar, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindTo");
    }

    public final <T extends ajej> T bind(T t) {
        return zln.bind$default(this, t, null, null, 6, null);
    }

    public final <T extends ajej> T bind(T t, b bVar) {
        return zln.bind$default(this, t, bVar, null, 4, null);
    }

    public final <T extends ajej> T bind(T t, b bVar, String str) {
        akcr.b(t, "disposable");
        akcr.b(bVar, "event");
        akcr.b(str, "disposableName");
        Object a = this.taskScoper.a(t, bVar, str);
        akcr.a(a, "taskScoper.bind(disposable, event, disposableName)");
        return a;
    }

    public final <D extends ajej> D bindTo(D d, zln<?> zln, b bVar, String str) {
        akcr.b(d, "receiver$0");
        akcr.b(zln, "scopedComponent");
        akcr.b(bVar, "lifecycleEvent");
        akcr.b(str, "disposableName");
        zln.bind(d, bVar, str);
        return d;
    }

    public void dropTarget() {
        this.lifecycleSubject.a(b.ON_DROP_TARGET);
    }

    public void takeTarget(Target target) {
        this.lifecycleSubject.a(b.ON_TAKE_TARGET);
    }
}
