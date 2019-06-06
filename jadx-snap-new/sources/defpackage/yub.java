package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: yub */
public abstract class yub implements ytt {
    final yua a = new yua(this.d);
    final ajxe b = ajxh.a(new a(this));
    int c;
    final Context d;
    private final ajxe e = ajxh.a(new b(this));
    private final String f;

    /* renamed from: yub$b */
    static final class b extends akcs implements akbk<SharedPreferences> {
        private /* synthetic */ yub a;

        b(yub yub) {
            this.a = yub;
            super(0);
        }

        private SharedPreferences a() {
            return this.a.d.getSharedPreferences(yuc.a, 0);
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    /* renamed from: yub$a */
    static final class a extends akcs implements akbk<Integer> {
        private /* synthetic */ yub a;

        a(yub yub) {
            this.a = yub;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.a.d.getPackageManager().getPackageInfo(this.a.d.getPackageName(), 0).versionCode);
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(yub.class), "preferences", "getPreferences$stuffing_core_release()Landroid/content/SharedPreferences;"), new akdc(akde.a(yub.class), "appVersionCode", "getAppVersionCode$stuffing_core_release()I")};
    }

    public yub(Context context, String str) {
        akcr.b(context, "appContext");
        akcr.b(str, "tag");
        this.d = context;
        this.f = str;
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.e.b();
    }
}
