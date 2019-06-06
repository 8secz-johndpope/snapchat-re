package defpackage;

import android.content.Context;
import com.snap.framework.developer.BuildConfigInfo;

/* renamed from: yud */
public final class yud extends yub {
    private final String e = this.h;
    private final BuildConfigInfo f;
    private final String g;
    private final String h;

    public yud(Context context, BuildConfigInfo buildConfigInfo, String str, String str2) {
        akcr.b(context, "appContext");
        akcr.b(buildConfigInfo, "buildConfigInfo");
        akcr.b(str, "defaultActivityClassName");
        akcr.b(str2, "defaultAppFamily");
        super(context, "SingleDynamicAppManager");
        this.f = buildConfigInfo;
        this.g = str;
        this.h = str2;
    }

    public final String a() {
        return this.e;
    }

    public final BuildConfigInfo b() {
        return this.f;
    }

    public final void c() {
        Object string = e().getString(yuc.b, "");
        this.c = e().getInt(yuc.f, 0);
        if ((akcr.a(string, this.e) ^ 1) != 0 && this.c < 3) {
            e().edit().putInt(yuc.f, this.c + 1).commit();
            this.a.a("SingleDynamicAppManager");
            e().edit().putString(yuc.b, this.e).putString(yuc.c, this.e).putInt(yuc.e, ((Number) this.b.b()).intValue()).putInt(yuc.f, 0).putString(yuc.d, string).commit();
        }
    }

    public final String d() {
        return this.g;
    }
}
