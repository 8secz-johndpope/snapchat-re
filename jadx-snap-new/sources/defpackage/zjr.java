package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: zjr */
public final class zjr {
    public static final Set<idg> h = new LinkedHashSet();
    public zgm a;
    public final long b;
    public Long c;
    public final idg d;
    public final aipn<icz> e;
    public final ihh f;
    public final abbd g;

    /* renamed from: zjr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static zjr a(idg idg, aipn<icz> aipn, ihh ihh, abbd abbd) {
            akcr.b(idg, "callsite");
            akcr.b(aipn, "metricReporter");
            akcr.b(ihh, "clock");
            return new zjr(idg, aipn, ihh, abbd, (byte) 0);
        }
    }

    static {
        a aVar = new a();
    }

    private zjr(idg idg, aipn<icz> aipn, ihh ihh, abbd abbd) {
        this.d = idg;
        this.e = aipn;
        this.f = ihh;
        this.g = abbd;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.d);
        stringBuilder.append(":load");
        this.a = zgo.a(stringBuilder.toString());
        this.b = this.f.a();
    }

    public /* synthetic */ zjr(idg idg, aipn aipn, ihh ihh, abbd abbd, byte b) {
        this(idg, aipn, ihh, abbd);
    }
}
