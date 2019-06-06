package defpackage;

import android.util.Base64;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;

/* renamed from: zsh */
public final class zsh {
    public final ajxe a;
    private final ajxe b;
    private final ajxe c;

    /* renamed from: zsh$a */
    public enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;

        static {
            int[] iArr = new int[]{1, 2, 3};
            a = 1;
            b = 2;
            c = 3;
            d = iArr;
        }

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    /* renamed from: zsh$d */
    static final class d extends akcs implements akbk<gqr> {
        private /* synthetic */ aipn a;

        d(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) this.a.get();
        }
    }

    /* renamed from: zsh$c */
    static final class c extends akcs implements akbk<ftl> {
        private /* synthetic */ aipn a;

        c(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ftl) this.a.get();
        }
    }

    /* renamed from: zsh$b */
    static final class b extends akcs implements akbk<ihh> {
        private /* synthetic */ aipn a;

        b(aipn aipn) {
            this.a = aipn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ihh) this.a.get();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(zsh.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;"), new akdc(akde.a(zsh.class), "configProvider", "getConfigProvider()Lcom/snap/configprovider/framework/CompositeConfigurationProvider;"), new akdc(akde.a(zsh.class), "clock", "getClock()Lcom/snap/framework/time/Clock;")};
    }

    public zsh(aipn<ftl> aipn, aipn<gqr> aipn2, aipn<ihh> aipn3) {
        akcr.b(aipn, "configProviderLazy");
        akcr.b(aipn2, "exceptionTrackerLazy");
        akcr.b(aipn3, "clockLazy");
        this.b = ajxh.a(new d(aipn2));
        this.c = ajxh.a(new c(aipn));
        this.a = ajxh.a(new b(aipn3));
    }

    public final alsc a(String str) {
        alsc alsc = null;
        Object decode = str != null ? Base64.decode(str, 2) : null;
        if (decode == null) {
            return null;
        }
        if (((decode.length == 0 ? 1 : 0) ^ 1) == 0) {
            return null;
        }
        try {
            akcr.b(decode, "decodedApplicableExperiments");
            alsc = alsc.a(decode);
            return alsc;
        } catch (InvalidProtocolBufferNanoException e) {
            ((gqr) this.b.b()).a(gqt.NORMAL, e, zpy.a.callsite("decodeAndParseExperiments"));
            return alsc;
        }
    }

    public final ftl a() {
        return (ftl) this.c.b();
    }
}
