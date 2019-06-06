package defpackage;

import com.mapbox.services.android.telemetry.navigation.MapboxNavigationEvent;
import com.snap.core.db.record.StorySyncStateModel;
import java.io.File;

/* renamed from: atc */
final class atc extends aiqx implements asq {
    public atc(aiqo aiqo, String str, String str2, aisx aisx) {
        super(aiqo, str, str2, aisx, 2);
    }

    private static aisw a(aisw aisw, ati ati) {
        aisw.a("report_id", null, ati.b());
        for (File file : ati.d()) {
            String name;
            String str;
            String str2 = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                name = file.getName();
                str = "minidump_file";
            } else if (file.getName().equals(StorySyncStateModel.METADATA)) {
                name = file.getName();
                str = "crash_meta_file";
            } else if (file.getName().equals("binaryImages")) {
                name = file.getName();
                str = "binary_images_file";
            } else if (file.getName().equals("session")) {
                name = file.getName();
                str = "session_meta_file";
            } else if (file.getName().equals("app")) {
                name = file.getName();
                str = "app_meta_file";
            } else if (file.getName().equals(MapboxNavigationEvent.KEY_DEVICE)) {
                name = file.getName();
                str = "device_meta_file";
            } else if (file.getName().equals("os")) {
                name = file.getName();
                str = "os_meta_file";
            } else if (file.getName().equals("user")) {
                name = file.getName();
                str = "user_meta_file";
            } else if (file.getName().equals("logs")) {
                name = file.getName();
                str = "logs_file";
            } else if (file.getName().equals("keys")) {
                name = file.getName();
                str = "keys_file";
            } else {
            }
            aisw.a(str, name, str2, file);
        }
        return aisw;
    }

    public final boolean a(asp asp) {
        aisw a = a();
        String str = asp.a;
        StringBuilder stringBuilder = new StringBuilder("Crashlytics Android SDK/");
        stringBuilder.append(this.b.a());
        a.a("User-Agent", stringBuilder.toString()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a()).a("X-CRASHLYTICS-API-KEY", str);
        aisw a2 = atc.a(a, asp.b);
        aiqr a3 = aiqj.a();
        StringBuilder stringBuilder2 = new StringBuilder("Sending report to: ");
        stringBuilder2.append(this.a);
        String str2 = "CrashlyticsCore";
        a3.a(str2, stringBuilder2.toString());
        int b = a2.b();
        aiqj.a().a(str2, "Result was: ".concat(String.valueOf(b)));
        return airp.a(b) == 0;
    }
}
