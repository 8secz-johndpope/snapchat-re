package defpackage;

import com.snap.circumstanceengine.lib.ConfigSyncJob;
import defpackage.hwm.a;
import java.util.concurrent.Callable;

/* renamed from: eww */
public final class eww implements hwm<ConfigSyncJob, accb> {
    private final ews a;

    /* renamed from: eww$a */
    static final class a<V> implements Callable<Object> {
        private /* synthetic */ eww a;
        private /* synthetic */ ConfigSyncJob b;

        a(eww eww, ConfigSyncJob configSyncJob) {
            this.a = eww;
            this.b = configSyncJob;
        }

        public final /* synthetic */ Object call() {
            akcr.b(this.b, "durableJob");
            return ajxw.a;
        }
    }

    public eww(ews ews) {
        akcr.b(ews, "configSyncEngine");
        this.a = ews;
    }

    public final void a(String str) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final void a(String str, Integer num) {
        String str2 = "uuid";
        akcr.b(str, str2);
        akcr.b(str, str2);
    }

    public final boolean a(Throwable th) {
        String str = "throwable";
        akcr.b(th, str);
        akcr.b(th, str);
        return false;
    }

    public final /* bridge */ /* synthetic */ void b(hwg hwg) {
        ConfigSyncJob configSyncJob = (ConfigSyncJob) hwg;
        String str = "durableJob";
        akcr.b(configSyncJob, str);
        akcr.b(configSyncJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        ConfigSyncJob configSyncJob = (ConfigSyncJob) hwg;
        akcr.b(configSyncJob, "durableJob");
        Object b = ajcx.b((Callable) new a(this, configSyncJob));
        akcr.a(b, "Completable.fromCallable…saction(durableJob)\n    }");
        return b;
    }

    public final ide c() {
        return evh.a;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        ConfigSyncJob configSyncJob = (ConfigSyncJob) hwg;
        String str = "durableJob";
        akcr.b(configSyncJob, str);
        akcr.b(configSyncJob, str);
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        ConfigSyncJob configSyncJob = (ConfigSyncJob) hwg;
        akcr.b(configSyncJob, "durableJob");
        return a.b(configSyncJob);
    }
}
