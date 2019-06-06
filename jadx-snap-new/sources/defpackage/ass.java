package defpackage;

import java.io.File;
import java.util.Map.Entry;

/* renamed from: ass */
final class ass extends aiqx implements asq {
    public ass(aiqo aiqo, String str, String str2, aisx aisx) {
        super(aiqo, str, str2, aisx, 2);
    }

    public final boolean a(asp asp) {
        aiqr a;
        aisw a2 = a().a("X-CRASHLYTICS-API-KEY", asp.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a());
        for (Entry entry : asp.b.e().entrySet()) {
            a2 = a2.a((String) entry.getKey(), (String) entry.getValue());
        }
        ati ati = asp.b;
        a2.a("report[identifier]", null, ati.b());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (ati.d().length == 1) {
            a = aiqj.a();
            StringBuilder stringBuilder = new StringBuilder("Adding single file ");
            stringBuilder.append(ati.a());
            stringBuilder.append(str2);
            stringBuilder.append(ati.b());
            a.a(str3, stringBuilder.toString());
            a2 = a2.a("report[file]", ati.a(), str, ati.c());
        } else {
            int i = 0;
            for (File file : ati.d()) {
                aiqr a3 = aiqj.a();
                StringBuilder stringBuilder2 = new StringBuilder("Adding file ");
                stringBuilder2.append(file.getName());
                stringBuilder2.append(str2);
                stringBuilder2.append(ati.b());
                a3.a(str3, stringBuilder2.toString());
                StringBuilder stringBuilder3 = new StringBuilder("report[file");
                stringBuilder3.append(i);
                stringBuilder3.append("]");
                a2.a(stringBuilder3.toString(), file.getName(), str, file);
                i++;
            }
        }
        aiqr a4 = aiqj.a();
        StringBuilder stringBuilder4 = new StringBuilder("Sending report to: ");
        stringBuilder4.append(this.a);
        a4.a(str3, stringBuilder4.toString());
        int b = a2.b();
        a = aiqj.a();
        StringBuilder stringBuilder5 = new StringBuilder("Create report request ID: ");
        stringBuilder5.append(a2.b("X-REQUEST-ID"));
        a.a(str3, stringBuilder5.toString());
        aiqj.a().a(str3, "Result was: ".concat(String.valueOf(b)));
        return airp.a(b) == 0;
    }
}
