package defpackage;

import android.os.Build.VERSION;
import defpackage.sdb.d;

/* renamed from: scr */
public class scr {
    public final aipn<sdu> a;
    public final aipn<sdb> b;
    public final aipn<sch> c;
    public final zfw d;

    /* renamed from: scr$f */
    public static final class f extends akcq implements akbl<sdr, Boolean> {
        public f(scr scr) {
            super(1, scr);
        }

        public final String getName() {
            return "shouldTransferToInApp";
        }

        public final akej getOwner() {
            return akde.a(scr.class);
        }

        public final String getSignature() {
            return "shouldTransferToInApp(Lcom/snap/notification/api/NotificationDisplayModel;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "p1");
            akcr.b(sdr, "notificationDisplayModel");
            boolean z = sdr.e && sdr.g;
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: scr$h */
    public static final class h extends akcq implements akbl<sdr, ajxw> {
        public h(sdu sdu) {
            super(1, sdu);
        }

        public final String getName() {
            return "emitInAppNotification";
        }

        public final akej getOwner() {
            return akde.a(sdu.class);
        }

        public final String getSignature() {
            return "emitInAppNotification(Lcom/snap/notification/api/NotificationDisplayModel;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "p1");
            ((sdu) this.receiver).b(sdr);
            return ajxw.a;
        }
    }

    /* renamed from: scr$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: scr$e */
    public static final class e<T> implements ajfb<ajej> {
        private /* synthetic */ scr a;

        public e(scr scr) {
            this.a = scr;
        }

        public final /* synthetic */ void accept(Object obj) {
            sdb sdb = (sdb) this.a.b.get();
            if (VERSION.SDK_INT >= 23) {
                akbl akbl = d.a;
                try {
                    gr a = seu.a(sdb.d);
                    for (Object obj2 : seu.c(sdb.d)) {
                        if (((Boolean) akbl.invoke(obj2)).booleanValue()) {
                            a.a(obj2.getId());
                        }
                    }
                } catch (SecurityException unused) {
                }
            }
        }
    }

    /* renamed from: scr$g */
    public static final class g<T> implements ajfb<sdr> {
        public static final g a = new g();

        g() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: scr$b */
    public static final class b extends akcq implements akbl<sdr, Boolean> {
        public b(scr scr) {
            super(1, scr);
        }

        public final String getName() {
            return "shouldTransferToSystem";
        }

        public final akej getOwner() {
            return akde.a(scr.class);
        }

        public final String getSignature() {
            return "shouldTransferToSystem(Lcom/snap/notification/api/NotificationDisplayModel;)Z";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "p1");
            akcr.b(sdr, "notificationDisplayModel");
            return Boolean.valueOf(sdr.f);
        }
    }

    /* renamed from: scr$d */
    public static final class d extends akcq implements akbl<sdr, ajxw> {
        public d(sdu sdu) {
            super(1, sdu);
        }

        public final String getName() {
            return "emitSystemNotification";
        }

        public final akej getOwner() {
            return akde.a(sdu.class);
        }

        public final String getSignature() {
            return "emitSystemNotification(Lcom/snap/notification/api/NotificationDisplayModel;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            sdr sdr = (sdr) obj;
            akcr.b(sdr, "p1");
            ((sdu) this.receiver).c(sdr);
            return ajxw.a;
        }
    }

    /* renamed from: scr$c */
    public static final class c<T> implements ajfb<sdr> {
        public static final c a = new c();

        c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    private scr(aipn<sdu> aipn, aipn<sdb> aipn2, aipn<sch> aipn3, zfw zfw) {
        akcr.b(aipn, "notificationEmitter");
        akcr.b(aipn2, "systemNotificationManager");
        akcr.b(aipn3, "inAppNotificationManager");
        akcr.b(zfw, "schedulers");
        this.a = aipn;
        this.b = aipn2;
        this.c = aipn3;
        this.d = zfw;
    }

    public scr(aipn<sdu> aipn, aipn<sdb> aipn2, aipn<sch> aipn3, zgb zgb) {
        akcr.b(aipn, "notificationEmitter");
        akcr.b(aipn2, "systemNotificationManager");
        akcr.b(aipn3, "inAppNotificationManager");
        akcr.b(zgb, "schedulersProvider");
        this((aipn) aipn, (aipn) aipn2, (aipn) aipn3, zgb.a(sdv.a, "NotificationTransferManager"));
    }
}
