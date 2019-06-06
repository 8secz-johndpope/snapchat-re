package defpackage;

import android.os.Build.VERSION;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

/* renamed from: gsx */
public final class gsx implements gqy {
    final ajwy<grt> a;
    final ajwy<ifb> b;

    /* renamed from: gsx$a */
    static final class a implements ajev {
        private /* synthetic */ gsx a;
        private /* synthetic */ String b;
        private /* synthetic */ File c;

        a(gsx gsx, String str, File file) {
            this.a = gsx;
            this.b = str;
            this.c = file;
        }

        public final void run() {
            grt grt = (grt) this.a.a.get();
            String str = this.b;
            String h = ((ifb) this.a.b.get()).h();
            String k = ((ifb) this.a.b.get()).k();
            byte[] bArr = new byte[4];
            new FileInputStream(this.c).read(bArr);
            Object bytes = "MDMP".getBytes(akfp.a);
            akcr.a(bytes, "(this as java.lang.String).getBytes(charset)");
            boolean equals = Arrays.equals(bArr, bytes);
            akcr.b(str, "crashId");
            String str2 = "Native Crash";
            akcr.b(str2, "crashMessage");
            ilv ilv = (ilv) grt.a.get();
            String str3 = "";
            String str4 = "app_version";
            ilz a = iot.APP_CRASH.a("category", "native").a(str4, h == null ? str3 : h);
            String str5 = VERSION.RELEASE;
            String str6 = "Build.VERSION.RELEASE";
            akcr.a((Object) str5, str6);
            String str7 = "os_version";
            ilv.c(a.a(str7, str5), 1);
            grt.a(str, aaal.NATIVE, null, str2, null, h, k);
            if (!equals) {
                ilv ilv2 = (ilv) grt.a.get();
                iot iot = iot.INVALID_APP_CRASH_REPORT;
                if (h == null) {
                    h = str3;
                }
                ilz a2 = iot.a(str4, h);
                str = VERSION.RELEASE;
                akcr.a((Object) str, str6);
                ilv2.c(a2.a(str7, str), 1);
            }
        }
    }

    public gsx(ajwy<grt> ajwy, ajwy<ifb> ajwy2) {
        akcr.b(ajwy, "crashAnalyticsHelper");
        akcr.b(ajwy2, "userAgent");
        this.a = ajwy;
        this.b = ajwy2;
    }

    public final ajcx a(String str, File file, File file2) {
        akcr.b(str, "crashId");
        akcr.b(file, "breakpadReportFile");
        akcr.b(file2, "ferriteReportFile");
        Object a = ajcx.a((ajev) new a(this, str, file));
        akcr.a(a, "Completable.fromAction {…padReportFile))\n        }");
        return a;
    }
}
