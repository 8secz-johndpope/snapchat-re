package defpackage;

import defpackage.ablc.a;
import java.util.UUID;

/* renamed from: cyx */
public final class cyx implements abla {
    final aipn<dib> a;
    private final ajxe b;

    /* renamed from: cyx$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: cyx$c */
    static final class c extends akcs implements akbk<ajdw> {
        private /* synthetic */ zgb a;

        c(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(djb.a, "CameraLivePreviewBlizzardReporter").f();
        }
    }

    /* renamed from: cyx$b */
    static final class b implements Runnable {
        private /* synthetic */ cyx a;
        private /* synthetic */ abkz b;

        b(cyx cyx, abkz abkz) {
            this.a = cyx;
            this.b = abkz;
        }

        public final void run() {
            aamg aamg;
            dib dib = (dib) this.a.a.get();
            abkz abkz = this.b;
            aacd aacd = new aacd();
            UUID uuid = abkz.b;
            aacd.a(uuid != null ? uuid.toString() : null);
            aacd.a(abkz.c);
            aacd.a(abkz.d);
            boolean z = abkz.f;
            if (z) {
                aamg = aamg.FLASH_BUTTON;
            } else if (z) {
                throw new ajxk();
            } else {
                aamg = aamg.DEFAULT_STATE;
            }
            aacd.a(aamg);
            aacd.a(abkz.e);
            aacd.a();
            aacd.b();
            aacd.d((Long) abkz.a.get(a.FLIP));
            aacd.c((Long) abkz.a.get(a.DOUBLE_TAP));
            aacd.b((Long) abkz.a.get(a.FLASH));
            aacd.a((Long) abkz.a.get(a.NIGHT_MODE));
            aacd.e((Long) abkz.a.get(a.DROP_DOWN));
            aacd.f((Long) abkz.a.get(a.TIMER));
            aacd.h((Long) abkz.a.get(a.PORTRAIT));
            aacd.i((Long) abkz.a.get(a.BATCH_CAPTURE));
            aacd.g((Long) abkz.a.get(a.GRID));
            dib.a((aajt) aacd);
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(cyx.class), "reportingScheduler", "getReportingScheduler()Lio/reactivex/Scheduler;");
        a aVar = new a();
    }

    public cyx(aipn<dib> aipn, zgb zgb) {
        akcr.b(aipn, "blizzardEventLogger");
        akcr.b(zgb, "schedulersProvider");
        this.a = aipn;
        this.b = ajxh.a(new c(zgb));
    }

    public final void a(abkz abkz) {
        akcr.b(abkz, "cameraLivePreviewRecord");
        ((ajdw) this.b.b()).a((Runnable) new b(this, abkz));
    }
}
