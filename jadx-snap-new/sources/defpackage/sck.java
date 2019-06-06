package defpackage;

/* renamed from: sck */
public final class sck {
    final zfw a = zgb.a(sdv.a, "NotificationAppOpenBinder");
    public final sir b = new sir(new d(this));
    final ajei c;
    final ajwy<sdb> d;
    final ajwy<sen> e;
    final ajwy<scw> f;

    /* renamed from: sck$d */
    static final class d extends akcq implements akbk<ajxw> {
        d(sck sck) {
            super(0, sck);
        }

        public final String getName() {
            return "bindInner";
        }

        public final akej getOwner() {
            return akde.a(sck.class);
        }

        public final String getSignature() {
            return "bindInner()V";
        }

        public final /* synthetic */ Object invoke() {
            sck sck = (sck) this.receiver;
            ((sen) sck.e.get()).a();
            sck.c.a(((scw) sck.f.get()).a.a((ajdw) sck.a.h()).f((ajfb) new scl(new b((sdb) sck.d.get()))));
            sck.c.a(((scw) sck.f.get()).b.a((ajdw) sck.a.h()).f((ajfb) new scl(new c(sck))));
            return ajxw.a;
        }
    }

    /* renamed from: sck$b */
    static final class b extends akcq implements akbl<akbl<? super sdr, ? extends Boolean>, ajxw> {
        b(sdb sdb) {
            super(1, sdb);
        }

        public final String getName() {
            return "clearNotificationsIf";
        }

        public final akej getOwner() {
            return akde.a(sdb.class);
        }

        public final String getSignature() {
            return "clearNotificationsIf(Lkotlin/jvm/functions/Function1;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            akbl akbl = (akbl) obj;
            akcr.b(akbl, "p1");
            ((sdb) this.receiver).a(akbl);
            return ajxw.a;
        }
    }

    /* renamed from: sck$c */
    static final class c extends akcq implements akbl<sdd, ajxw> {
        c(sck sck) {
            super(1, sck);
        }

        public final String getName() {
            return "handleSystemNotificationRemovalRequest";
        }

        public final akej getOwner() {
            return akde.a(sck.class);
        }

        public final String getSignature() {
            return "handleSystemNotificationRemovalRequest(Lcom/snap/notification/SystemNotificationRemovalRequest;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdd sdd = (sdd) obj;
            akcr.b(sdd, "p1");
            sck sck = (sck) this.receiver;
            if (sdd.a) {
                sdb sdb = (sdb) sck.d.get();
                try {
                    seu.a(sdb.d).a();
                } catch (SecurityException unused) {
                }
                synchronized (sdb.a) {
                    sdb.a.clear();
                }
            }
            ((sdb) sck.d.get()).a(null, false);
            sdb sdb2 = (sdb) sck.d.get();
            String str = sdd.c;
            if (str != null) {
                sdb2.a((akbl) new defpackage.sdb.c(str));
            }
            return ajxw.a;
        }
    }

    /* renamed from: sck$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public sck(ajei ajei, ajwy<sdb> ajwy, ajwy<sen> ajwy2, ajwy<scw> ajwy3, zgb zgb) {
        akcr.b(ajei, "compositeDisposable");
        akcr.b(ajwy, "systemNotificationManager");
        akcr.b(ajwy2, "badgeManager");
        akcr.b(ajwy3, "notificationRemover");
        akcr.b(zgb, "schedulersProvider");
        this.c = ajei;
        this.d = ajwy;
        this.e = ajwy2;
        this.f = ajwy3;
    }
}
