package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: acyk */
public final class acyk {
    String a;
    final Context b;
    final int c;
    private final ajxe d = ajxh.a(new a(this));

    /* renamed from: acyk$a */
    static final class a extends akcs implements akbk<SharedPreferences> {
        private /* synthetic */ acyk a;

        a(acyk acyk) {
            this.a = acyk;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Object sharedPreferences = this.a.b.getSharedPreferences("com.snapchat.map.mapbox", 0);
            akcr.a(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(acyk.class), "mPref", "getMPref()Landroid/content/SharedPreferences;");
    }

    public acyk(Context context, int i) {
        akcr.b(context, "context");
        this.b = context;
        this.c = i;
    }

    /* Access modifiers changed, original: final */
    public final SharedPreferences a() {
        return (SharedPreferences) this.d.b();
    }

    public final String b() {
        String str = this.a;
        if (str == null) {
            SharedPreferences a = a();
            StringBuilder stringBuilder = new StringBuilder("snapchat.access_token");
            stringBuilder.append(this.c);
            str = a.getString(stringBuilder.toString(), null);
        }
        return (str == null || !akgb.b(str, "pk.", false)) ? null : str;
    }
}
