package defpackage;

import android.text.TextUtils;

/* renamed from: gpr */
public final class gpr implements gpq {
    final dlg a;
    private final hwl b;
    private final ajwy<hwo> c;
    private final ajei d;
    private final gpb e;

    /* renamed from: gpr$a */
    static final class a<T> implements ajfb<abkq> {
        private /* synthetic */ gpr a;

        a(gpr gpr) {
            this.a = gpr;
        }

        public final /* synthetic */ void accept(Object obj) {
            final abkq abkq = (abkq) obj;
            this.a.a.a(new dli() {
                public final Long a() {
                    return Long.valueOf(abkq.j);
                }

                public final String b() {
                    return abkq.b;
                }

                public final boolean c() {
                    return !TextUtils.isEmpty((CharSequence) abkq.b);
                }

                public final Boolean d() {
                    return Boolean.valueOf(TextUtils.isEmpty(abkq.f) ^ 1);
                }

                public final String e() {
                    return abkq.i;
                }
            });
        }
    }

    public gpr(hwl hwl, ajwy<hwo> ajwy, ajei ajei, gpb gpb, dlg dlg) {
        akcr.b(hwl, "durableJobManager");
        akcr.b(ajwy, "userScopeJobRegistry");
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(gpb, "userAuthStore");
        akcr.b(dlg, "blizzardLifecycle");
        this.b = hwl;
        this.c = ajwy;
        this.d = ajei;
        this.e = gpb;
        this.a = dlg;
    }

    public final void a() {
        this.b.b();
        this.b.a(hwp.USER_SCOPE, this.c);
        this.d.a(this.e.c().f((ajfb) new a(this)));
    }
}
