package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: nfp */
public final class nfp implements abov {
    final ajwy<nfq> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: nfp$a */
    static final class a extends akcs implements akbk<nfq> {
        private /* synthetic */ nfp a;

        a(nfp nfp) {
            this.a = nfp;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (nfq) this.a.a.get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(nfp.class), "locationStateDumpUtil", "getLocationStateDumpUtil()Lcom/snap/location/logging/LocationStateDumpUtil;");
    }

    public nfp(ajwy<nfq> ajwy) {
        akcr.b(ajwy, "locationDumpUtilProvider");
        this.a = ajwy;
    }

    public final File a(Context context, File file) {
        akcr.b(file, "outputFile");
        akbd.a(file, ((nfq) this.b.b()).a());
        return file;
    }

    public final String a() {
        return "location_state_logs.txt";
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return 10;
    }
}
