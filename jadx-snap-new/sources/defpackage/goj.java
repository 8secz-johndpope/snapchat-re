package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: goj */
public final class goj implements gnb {
    private final String a;
    private final gnq b = gnq.a;
    private final String c;
    private final boolean d;

    /* renamed from: goj$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: goj$b */
    public static final class b implements gno {
        private /* synthetic */ goj a;

        b(goj goj) {
            this.a = goj;
        }

        public final void a(String str, String str2, String str3) {
            akcr.b(str, "processorKey");
            akcr.b(str2, "constraintName");
            akcr.b(str3, "uuid");
        }

        public final void a(String str, String str2, String str3, long j, int i) {
            akcr.b(str, "processorKey");
            akcr.b(str2, "constraintName");
            akcr.b(str3, "uuid");
        }

        public final void a(String str, String str2, String str3, long j, gnf gnf) {
            akcr.b(str, "processorKey");
            akcr.b(str2, "constraintName");
            akcr.b(str3, "uuid");
            akcr.b(gnf, "deviceState");
        }

        public final void a(String str, String str2, String str3, String str4, long j) {
            akcr.b(str, "processorKey");
            akcr.b(str2, "constraintName");
            akcr.b(str3, "uuid");
            akcr.b(str4, "reason");
        }
    }

    static {
        a aVar = new a();
    }

    public goj() {
        String str = "Fixed4am30jitter10s_4";
        this.a = str;
        this.c = str;
    }

    public final ajdx<Integer> a(gfu gfu, Map<String, String> map) {
        akcr.b(gfu, "contentResolver");
        Object b = ajdx.b(Integer.valueOf(0)).b(10, TimeUnit.SECONDS);
        akcr.a(b, "Single.just(0)\n         …lay(10, TimeUnit.SECONDS)");
        return b;
    }

    public final boolean a() {
        return this.d;
    }

    public final List<gna> b() {
        return ajyl.a(new gna("fixed_time", false, false, 0, 0, false, new gnh(4, 30, null, 4), null, 440));
    }

    public final gno c() {
        return new b(this);
    }
}
