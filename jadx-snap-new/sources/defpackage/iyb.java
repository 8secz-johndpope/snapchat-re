package defpackage;

import com.snap.identity.job.PermissionSettingsReporterDurableJob;
import defpackage.hwm.a;

/* renamed from: iyb */
public final class iyb implements hwm<PermissionSettingsReporterDurableJob, Boolean> {
    private final zfw a = zgb.a(irc.t, "PERMISSION_SETTINGS_REPORT_DURABLE_JOB");
    private final ipy b;

    public iyb(ipy ipy, zgb zgb) {
        akcr.b(ipy, "reporter");
        akcr.b(zgb, "schedulersProvider");
        this.b = ipy;
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
        PermissionSettingsReporterDurableJob permissionSettingsReporterDurableJob = (PermissionSettingsReporterDurableJob) hwg;
        String str = "durableJob";
        akcr.b(permissionSettingsReporterDurableJob, str);
        akcr.b(permissionSettingsReporterDurableJob, str);
    }

    public final /* synthetic */ ajcx c(hwg hwg) {
        PermissionSettingsReporterDurableJob permissionSettingsReporterDurableJob = (PermissionSettingsReporterDurableJob) hwg;
        akcr.b(permissionSettingsReporterDurableJob, "durableJob");
        return a.a(permissionSettingsReporterDurableJob);
    }

    public final /* bridge */ /* synthetic */ ide c() {
        return irc.t;
    }

    public final void d() {
    }

    public final /* synthetic */ void d(hwg hwg) {
        akcr.b((PermissionSettingsReporterDurableJob) hwg, "durableJob");
    }

    public final /* synthetic */ ajcx e(hwg hwg) {
        PermissionSettingsReporterDurableJob permissionSettingsReporterDurableJob = (PermissionSettingsReporterDurableJob) hwg;
        akcr.b(permissionSettingsReporterDurableJob, "durableJob");
        return a.b(permissionSettingsReporterDurableJob);
    }
}
