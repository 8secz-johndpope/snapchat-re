package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* renamed from: gtp */
public final class gtp implements gqx {
    final aipn<abss> a;
    final aipn<abkm> b;
    final aipn<gsi> c;
    final aipn<gpz> d;

    /* renamed from: gtp$a */
    static final class a implements ajev {
        private /* synthetic */ gtp a;
        private /* synthetic */ Throwable b;

        a(gtp gtp, Throwable th) {
            this.a = gtp;
            this.b = th;
        }

        public final void run() {
            gtp gtp = this.a;
            Throwable th = this.b;
            if (aiqj.c() && asj.f() != null) {
                asj.f().a("LAST_FATAL_EXCEPTION", th.toString());
                String str = "";
                asj.f().a("LAST_NON_FATAL_EXCEPTION", str);
                asj.f().a("ERROR_TYPE", "JAVA_CRASH");
                if (((abss) gtp.a.get()).d()) {
                    asj f = asj.f();
                    Object obj = gtp.b.get();
                    String str2 = "crashUserDataProvider.get()";
                    akcr.a(obj, str2);
                    String a = ((abkm) obj).a();
                    if (a == null) {
                        a = str;
                    }
                    f.b(a);
                    f = asj.f();
                    obj = gtp.b.get();
                    akcr.a(obj, str2);
                    a = ((abkm) obj).b();
                    if (a != null) {
                        str = a;
                    }
                    f.c(str);
                }
                if (th instanceof zfd) {
                    zfd zfd = (zfd) th;
                    asj.f().a("CALLSITE", zfd.a.toString());
                    asj.f().a("JIRA_PROJECT", zfd.a.a.getProject().label);
                }
                asj f2 = asj.f();
                gpz gpz = (gpz) gtp.d.get();
                List a2 = gpz.a();
                StringBuilder stringBuilder = new StringBuilder();
                int i = 0;
                for (Object next : a2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        ajym.a();
                    }
                    ailj ailj = (ailj) next;
                    if (i != 0) {
                        stringBuilder.append(" >> ");
                    }
                    SimpleDateFormat simpleDateFormat = (SimpleDateFormat) gpz.a.b();
                    Object obj2 = ailj.a;
                    akcr.a(obj2, "crashBreadcrumbData.timeStamp");
                    stringBuilder.append(simpleDateFormat.format(new Date(obj2.longValue())));
                    stringBuilder.append(" ");
                    stringBuilder.append(ailj.b);
                    stringBuilder.append("\r\n");
                    i = i2;
                }
                Object stringBuilder2 = stringBuilder.toString();
                akcr.a(stringBuilder2, "stringBuilder.toString()");
                f2.a("NAVIGATION", stringBuilder2);
                for (gqb gqb : ((gsi) gtp.c.get()).a(gqf.JAVA)) {
                    asj.f().a(gqb.a, gqb.b);
                }
            }
        }
    }

    public gtp(aipn<abss> aipn, aipn<abkm> aipn2, aipn<gsi> aipn3, aipn<gpz> aipn4) {
        akcr.b(aipn, "releaseManager");
        akcr.b(aipn2, "crashUserDataProvider");
        akcr.b(aipn3, "crashMetadataProvidersFactory");
        akcr.b(aipn4, "crashBreadcrumbProvidersFactory");
        this.a = aipn;
        this.b = aipn2;
        this.c = aipn3;
        this.d = aipn4;
    }

    public final int a() {
        return 1;
    }

    public final ajcx a(Thread thread, Throwable th) {
        akcr.b(thread, "thread");
        akcr.b(th, "throwable");
        Object a = ajcx.a((ajev) new a(this, th));
        akcr.a(a, "Completable.fromAction {…rAttribution(throwable) }");
        return a;
    }
}
