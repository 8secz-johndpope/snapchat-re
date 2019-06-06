package defpackage;

import android.os.Build;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: zkn */
public final class zkn {
    private static final List<String> g = ajym.b((Object[]) new String[]{"vivo 1723", "vivo 1726", "vivo 1727", "vivo 1802", "vivo 1803", "vivo 1804", "vivo 1806", "vivo 1807", "vivo 1808", "vivo 1814", "vivo 1815", "vivo 1816", "vivo 1851", "Vivo XL4", "vivo Y83", "vivo X21A", "Vivo XI+", "Vivo XI", "Vivo XI PLUS"});
    final AtomicBoolean a = new AtomicBoolean(g.contains(Build.MODEL));
    final AtomicBoolean b = new AtomicBoolean(false);
    final absj c;
    private final ajxe d = ajxh.a(new b(this));
    private final ajei e;
    private final iii f;

    /* renamed from: zkn$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: zkn$b */
    static final class b extends akcs implements akbk<Integer> {
        private /* synthetic */ zkn a;

        b(zkn zkn) {
            this.a = zkn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.c.b());
        }
    }

    /* renamed from: zkn$1 */
    static final class 1<T> implements ajfb<ajxm<? extends Boolean, ? extends Boolean>> {
        private /* synthetic */ zkn a;

        1(zkn zkn) {
            this.a = zkn;
        }

        public final /* synthetic */ void accept(Object obj) {
            ajxm ajxm = (ajxm) obj;
            boolean booleanValue = ((Boolean) ajxm.a).booleanValue();
            boolean booleanValue2 = ((Boolean) ajxm.b).booleanValue();
            AtomicBoolean atomicBoolean = this.a.a;
            booleanValue = booleanValue || this.a.a.get();
            atomicBoolean.set(booleanValue);
            this.a.b.set(booleanValue2);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(zkn.class), "statusBarHeight", "getStatusBarHeight()I");
        a aVar = new a();
    }

    public zkn(ajei ajei, ajdp<Boolean> ajdp, ajdp<Boolean> ajdp2, iii iii, absj absj) {
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ajdp, "needsCustomInsetsServerConfig");
        akcr.b(ajdp2, "insetsDetectorV2ServerConfig");
        akcr.b(iii, "windowConfiguration");
        akcr.b(absj, "statusBarUtils");
        this.e = ajei;
        this.f = iii;
        this.c = absj;
        this.e.a(ajwa.b(ajdp, ajdp2).f((ajfb) new 1(this)));
    }

    private final int a() {
        return ((Number) this.d.b()).intValue();
    }

    /* JADX WARNING: Missing block: B:8:0x001d, code skipped:
            if (r3.top == 0) goto L_0x001f;
     */
    public final android.graphics.Rect a(android.graphics.Rect r3) {
        /*
        r2 = this;
        r0 = "insets";
        defpackage.akcr.b(r3, r0);
        r0 = r2.b;
        r0 = r0.get();
        if (r0 == 0) goto L_0x0024;
    L_0x000d:
        r0 = r2.f;
        r0 = r0.a;
        if (r0 == 0) goto L_0x0031;
    L_0x0013:
        r0 = r0.b;
        r1 = defpackage.iii.d.GONE;
        if (r0 != r1) goto L_0x001b;
    L_0x0019:
        r0 = 0;
        goto L_0x002f;
    L_0x001b:
        r0 = r3.top;
        if (r0 != 0) goto L_0x0031;
    L_0x001f:
        r0 = r2.a();
        goto L_0x002f;
    L_0x0024:
        r0 = r2.a;
        r0 = r0.get();
        if (r0 == 0) goto L_0x002d;
    L_0x002c:
        goto L_0x001f;
    L_0x002d:
        r0 = r3.top;
    L_0x002f:
        r3.top = r0;
    L_0x0031:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zkn.a(android.graphics.Rect):android.graphics.Rect");
    }
}
