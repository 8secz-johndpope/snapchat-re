package defpackage;

import android.content.Context;
import com.snapchat.android.R;
import defpackage.sdr.a;
import java.util.concurrent.TimeUnit;

/* renamed from: rvn */
public final class rvn implements gmq {
    final sdu a;
    final Context b;
    final ajwy<ilv> c;
    private final ajxe d = ajxh.a(new c(this));
    private final ygx e;
    private final zgb f;
    private final igb g;

    /* renamed from: rvn$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ rvn a;

        c(rvn rvn) {
            this.a = rvn;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(yet.a.callsite("MushroomDiskUsageNotificationEmitter"));
        }
    }

    /* renamed from: rvn$a */
    static final class a<T> implements ajfl<ajxm<? extends ygy, ? extends Long>> {
        private /* synthetic */ rvn a;

        a(rvn rvn) {
            this.a = rvn;
        }

        public final /* synthetic */ boolean test(Object obj) {
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "it");
            Object obj2 = ajxm.a;
            akcr.a(obj2, "it.first");
            ygy ygy = (ygy) obj2;
            long longValue = ((Number) ajxm.b).longValue();
            String str = "storageState";
            akcr.b(ygy, str);
            boolean z = true;
            if (longValue <= ygy.b && ygy.a != ygw.EMERGENCY) {
                z = false;
            }
            if (z) {
                ((ilv) this.a.c.get()).c(iot.DISK_STORAGE_STATE.a(str, ((ygy) ajxm.a).a.name()), 1);
            }
            return z;
        }
    }

    /* renamed from: rvn$b */
    static final class b<T> implements ajfb<ajxm<? extends ygy, ? extends Long>> {
        private /* synthetic */ rvn a;

        b(rvn rvn) {
            this.a = rvn;
        }

        public final /* synthetic */ void accept(Object obj) {
            rvn rvn = this.a;
            rvn.a.b(new a().c(rvn.b.getString(R.string.low_disk_notification_title)).d(rvn.b.getString(R.string.low_disk_notification_sub_title)).a(sec.LOW_DISK).a());
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(rvn.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public rvn(sdu sdu, ygx ygx, zgb zgb, Context context, igb igb, ajwy<ilv> ajwy) {
        akcr.b(sdu, "notificationEmitter");
        akcr.b(ygx, "storageStateMonitorRx");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(context, "context");
        akcr.b(igb, "noDiskExceptionDetector");
        akcr.b(ajwy, "graphene");
        this.a = sdu;
        this.e = ygx;
        this.f = zgb;
        this.b = context;
        this.g = igb;
        this.c = ajwy;
    }

    public final ajej a() {
        Object f = ajwa.a(this.e.b, this.g.a()).b((ajdw) ((zfw) this.d.b()).l()).a((ajfl) new a(this)).d(10, TimeUnit.SECONDS).f((ajfb) new b(this));
        akcr.a(f, "Observables.combineLates…ribe { onLowDiskState() }");
        return f;
    }
}
