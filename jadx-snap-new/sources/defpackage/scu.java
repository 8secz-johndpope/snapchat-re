package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: scu */
public final class scu extends sdu {
    final ajws<sdr> a;
    public final ajws<sdr> b;
    public final AtomicBoolean c = new AtomicBoolean(false);
    private final ajxe d;
    private final ajxe e;
    private final ajwy<sgp> f;
    private final ajwy<scm> g;

    /* renamed from: scu$c */
    static final class c extends akcq implements akbk<sgt> {
        c(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (sgt) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: scu$b */
    static final class b extends akcq implements akbk<gqr> {
        b(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (gqr) ((ajwy) this.receiver).get();
        }
    }

    /* renamed from: scu$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(scu.class), "reporter", "getReporter()Lcom/snap/notification/reporting/NotificationDroppedReporter;"), new akdc(akde.a(scu.class), "exceptionTracker", "getExceptionTracker()Lcom/snap/crash/api/exceptiontracker/ExceptionTracker;")};
        a aVar = new a();
    }

    public scu(ajwy<sgp> ajwy, ajwy<scm> ajwy2, ajwy<sgt> ajwy3, ajwy<gqr> ajwy4) {
        akcr.b(ajwy, "notificationAcknowledger");
        akcr.b(ajwy2, "notificationServiceBinder");
        akcr.b(ajwy3, "reporterProvider");
        akcr.b(ajwy4, "exceptionTrackerProvider");
        this.f = ajwy;
        this.g = ajwy2;
        this.d = ajxh.a(new c(ajwy3));
        this.e = ajxh.a(new b(ajwy4));
        Object ajwo = new ajwo();
        String str = "PublishSubject.create()";
        akcr.a(ajwo, str);
        this.a = (ajws) ajwo;
        ajwo = new ajwo();
        akcr.a(ajwo, str);
        this.b = (ajws) ajwo;
    }

    private final sgt a() {
        return (sgt) this.d.b();
    }

    private final void a(ajws<sdr> ajws, boolean z, sdr sdr) {
        if (!ajws.n()) {
            String str = z ? "InApp" : "System";
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" emitter has no observers! Notification type: ");
            stringBuilder.append(sdr.b);
            stringBuilder.append('.');
            b().a(gqt.HIGH, new Throwable(stringBuilder.toString()), sdv.a.callsite("PublishSubjectNotificationEmitter"));
        }
    }

    private final gqr b() {
        return (gqr) this.e.b();
    }

    public final void a(sdr sdr) {
        akcr.b(sdr, "notification");
        if (this.c.get()) {
            b(sdr);
        } else {
            c(sdr);
        }
    }

    public final void b(sdr sdr) {
        akcr.b(sdr, "notification");
        if (sdr.e) {
            new StringBuilder("Emitting inApp notification to ").append(this.b);
            ajws ajws = this.b;
            a(ajws, true, sdr);
            ajws.a((Object) sdr);
            return;
        }
        a().a(sdr);
    }

    public final void c(sdr sdr) {
        akcr.b(sdr, "notification");
        ((scm) this.g.get()).a();
        new StringBuilder("Emitting system notification to ").append(this.a);
        ((sgp) this.f.get()).a(sdr);
        ajws ajws = this.a;
        a(ajws, false, sdr);
        ajws.a((Object) sdr);
    }
}
