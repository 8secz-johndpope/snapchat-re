package defpackage;

import com.google.common.collect.Iterables;
import defpackage.sdl.a;

/* renamed from: scf */
public final class scf {
    public final zfw a = zgb.a(sdv.a, "InAppNotificationBinder");
    public final ajwy<scu> b;
    public final ajwy<sch> c;

    /* renamed from: scf$d */
    public static final class d extends akcq implements akbl<sdr, ajxw> {
        public d(sch sch) {
            super(1, sch);
        }

        public final String getName() {
            return "addNotification";
        }

        public final akej getOwner() {
            return akde.a(sch.class);
        }

        public final String getSignature() {
            return "addNotification(Lcom/snap/notification/api/NotificationDisplayModel;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            obj = (sdr) obj;
            akcr.b(obj, "p1");
            sch sch = (sch) this.receiver;
            akcr.b(obj, "notification");
            Object obj2 = obj.d;
            if (obj2 != null) {
                Iterables.removeIf(sch.b, new defpackage.sch.d(sch, obj2));
                sdr sdr = sch.e;
                if (akcr.a(sdr != null ? sdr.c : null, obj2)) {
                    shy shy = sch.g;
                    if (shy != null) {
                        shy.a(true);
                    }
                }
            }
            sdl a = ((scj) sch.h.get()).a();
            if (a.evaluateNotification(obj) == a.DROP) {
                sch.b().a(obj);
                sch.a().a(obj);
            } else {
                sch.b.offer(obj);
                sch.a(a);
            }
            return ajxw.a;
        }
    }

    /* renamed from: scf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: scf$b */
    public static final class b<T> implements ajfb<ajej> {
        public static final b a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: scf$c */
    public static final class c implements ajev {
        public static final c a = new c();

        c() {
        }

        public final void run() {
        }
    }

    /* renamed from: scf$e */
    public static final class e<T> implements ajfb<Throwable> {
        public static final e a = new e();

        e() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        a aVar = new a();
    }

    public scf(ajwy<scu> ajwy, ajwy<sch> ajwy2, zgb zgb) {
        akcr.b(ajwy, "notificationEmitter");
        akcr.b(ajwy2, "inAppNotificationManager");
        akcr.b(zgb, "schedulersProvider");
        this.b = ajwy;
        this.c = ajwy2;
    }
}
