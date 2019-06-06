package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: grw */
public final class grw implements gqj {
    final Context a;
    final ajwy<gte> b;
    final ajwy<abkm> c;
    final ajwy<gsj> d;
    private final ajwy<gtd> e;

    /* renamed from: grw$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: grw$b */
    static final class b<T, R> implements ajfc<Boolean, ajdb> {
        private /* synthetic */ grw a;
        private /* synthetic */ gqi b;

        b(grw grw, gqi gqi) {
            this.a = grw;
            this.b = gqi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Boolean bool = (Boolean) obj;
            akcr.b(bool, "enabled");
            if (!bool.booleanValue()) {
                return ajvo.a(ajhn.a);
            }
            ajcx a;
            int i = grx.a[this.b.c.ordinal()];
            if (i == 1) {
                gte gte = (gte) this.a.b.get();
                grw grw = this.a;
                gqi gqi = this.b;
                String str = gqi.a;
                ailp ailp = ailp.ANR;
                String message = gqi.getMessage();
                String str2 = "";
                String str3 = message == null ? str2 : message;
                message = gqi.getMessage();
                String str4 = message == null ? str2 : message;
                String str5 = gqi.a;
                idd idd = gqi.b;
                Object stackTrace = gqi.getStackTrace();
                akcr.a(stackTrace, "this.stackTrace");
                StringBuilder stringBuilder = new StringBuilder(Log.getStackTraceString(new gqi(str4, str5, idd, null, stackTrace, gqi.c, gqi.d, gqi.e, gqi.f, gqi.g)));
                if (gqi.getCause() != null) {
                    stringBuilder.append("Caused by: ");
                    stringBuilder.append(Log.getStackTraceString(gqi.getCause()));
                }
                stringBuilder.append("----THREAD DUMP----\n");
                stringBuilder.append(gqi.d);
                Object stringBuilder2 = stringBuilder.toString();
                String str6 = stringBuilder2;
                akcr.a(stringBuilder2, "stringBuilder.append(THR…              .toString()");
                long currentTimeMillis = System.currentTimeMillis();
                List list = gqi.f;
                List b = grw.b(gqi);
                stringBuilder2 = absh.a(grw.a);
                String str7 = stringBuilder2;
                akcr.a(stringBuilder2, "ScApplicationInfo.getVersionName(context)");
                ailq a2 = ((gte) grw.b.get()).a();
                long b2 = ((gte) grw.b.get()).b();
                stringBuilder2 = grw.c.get();
                akcr.a(stringBuilder2, "crashUserDataProvider.get()");
                a = gte.a(new gtb(str, ailp, str3, str6, currentTimeMillis, null, list, b, str7, a2, b2, ((abkm) stringBuilder2).c(), ((gsj) grw.d.get()).a(), gqi.g));
            } else if (i == 2 || i == 3) {
                a = ajvo.a(ajhn.a);
                akcr.a((Object) a, "Completable.complete()");
            } else {
                throw new ajxk();
            }
            return a;
        }
    }

    static {
        a aVar = new a();
    }

    public grw(Context context, ajwy<gte> ajwy, ajwy<gtd> ajwy2, ajwy<abkm> ajwy3, ajwy<gsj> ajwy4) {
        akcr.b(context, "context");
        akcr.b(ajwy, "snapAirCrashReporter");
        akcr.b(ajwy2, "snapAirCrashReportGating");
        akcr.b(ajwy3, "crashUserDataProvider");
        akcr.b(ajwy4, "crashPreferencesDataProvider");
        this.a = context;
        this.b = ajwy;
        this.e = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
    }

    static List<aill> b(gqi gqi) {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : gqi.e.entrySet()) {
            aill aill = new aill();
            aill.a = (String) entry.getKey();
            aill.b = (String) entry.getValue();
            arrayList.add(aill);
        }
        idd idd = gqi.b;
        if (idd != null) {
            aill aill2 = new aill();
            aill2.a = "CALLSITE";
            aill2.b = idd.toString();
            arrayList.add(aill2);
            aill2 = new aill();
            aill2.a = "JIRA_PROJECT";
            aill2.b = idd.a.getProject().projectName;
            arrayList.add(aill2);
        }
        return arrayList;
    }

    public final void a(gqi gqi) {
        akcr.b(gqi, "anrException");
        ((gtd) this.e.get()).a().e((ajfc) new b(this, gqi)).e();
    }
}
