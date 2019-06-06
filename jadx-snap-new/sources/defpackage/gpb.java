package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: gpb */
public class gpb {
    public final ajwl<gpa> a = new ajwl();
    private final ajdx<SharedPreferences> b;
    private final abkn c;
    private final gdd d;
    private final gdh e;
    private final abkm f;
    private final ajwy<ilw> g;
    private final zfw h;
    private final gpd i;
    private final ajei j = new ajei();
    private String k = null;

    public gpb(Context context, abkn abkn, gdd gdd, gdh gdh, abkm abkm, gpd gpd, ajwy<ilw> ajwy) {
        this.c = abkn;
        this.d = gdd;
        this.e = gdh;
        this.f = abkm;
        this.g = ajwy;
        this.h = zgb.a(gpc.a.callsite("UserAuthStore"));
        this.i = gpd;
        this.b = ajdx.c(new -$$Lambda$gpb$z5EZlgrwGMqEy-UA5dq-XDq9GFo(context)).a().b((ajdw) this.h.f());
        this.j.a(this.b.f(-$$Lambda$gpb$4gjXzfsfQxRzyS16kYQhhXGcaEc.INSTANCE).b((ajdw) this.h.f()).e(new -$$Lambda$gpb$A4jCC6fMHTL0o3QgPKKEPXzByNA(this)));
    }

    static gpa a(SharedPreferences sharedPreferences) {
        SharedPreferences sharedPreferences2 = sharedPreferences;
        String str = "key_username";
        String str2 = "key_auth_token";
        String str3 = "key_user_id";
        abmr.a("UserAuthStore:load");
        if (sharedPreferences2.contains(str3) && sharedPreferences2.contains(str2)) {
            if (sharedPreferences2.contains(str)) {
                String string = sharedPreferences2.getString(str3, null);
                String string2 = sharedPreferences2.getString(str, null);
                String string3 = sharedPreferences2.getString("key_display_name", null);
                String string4 = sharedPreferences2.getString("key_email", null);
                String string5 = sharedPreferences2.getString("key_phone", null);
                String string6 = sharedPreferences2.getString("key_bitmoji_avatar_id", null);
                String string7 = sharedPreferences2.getString(str2, null);
                long j = sharedPreferences2.getLong("key_birthday", Long.MIN_VALUE);
                return new gpa(new abkq(string, string2, string3, string4, string5, string6, string7, j == Long.MIN_VALUE ? null : Long.valueOf(j), sharedPreferences2.getString("key_blizzard_token", null), 0, Long.valueOf(sharedPreferences2.getLong("key_timestamp", 0)), sharedPreferences2.getString("key_bitmoji_selfie_id", null), sharedPreferences2.getString("key_country_code", null), sharedPreferences2.getString("key_ip_based_country_code", null), sharedPreferences2.getString("key_registration_country_code", null), Long.valueOf(sharedPreferences2.getLong("key_created_timestamp", -1))), sharedPreferences2.getBoolean("key_needs_verification_in_reg", false));
            }
        }
        return new gpa(abkr.a(), false);
    }

    private void a(gpa gpa) {
        abkq abkq = gpa.a;
        this.c.a = abkq;
        this.d.a(abkq);
        this.e.a(abkq);
        this.f.a = abkq;
        ((ilw) this.g.get()).a(abkq.b);
        this.a.a((Object) gpa);
    }

    private static Long b(Long l) {
        return l == null ? Long.valueOf(Long.MIN_VALUE) : l;
    }

    private /* synthetic */ void c(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().clear().commit();
        this.j.a();
        a(new gpa(abkr.a(), false));
    }

    private static /* synthetic */ void h() {
    }

    @Deprecated
    public final abkq a() {
        return e().a;
    }

    public final ajcx a(abkq abkq) {
        return this.b.c(new -$$Lambda$gpb$pmw9HNcbo1StraDlqz26rNiAR74(this, abkq)).e().b((ajdw) this.h.f());
    }

    public final ajcx a(Long l) {
        return this.b.e(new -$$Lambda$gpb$mhnvgtZgUNnn8BiyvaZfsbZ_Ny0(this, l));
    }

    public final ajcx a(String str) {
        return this.b.e(new -$$Lambda$gpb$iYgJQIqseq3O2Y8bvjRmi_umaWY(this, str));
    }

    public final ajcx a(String str, String str2) {
        return this.b.e(new -$$Lambda$gpb$lPnfRr6rVWpqKSE7wgX7RdL3A-c(this, str, str2));
    }

    public final ajcx a(boolean z) {
        return this.b.e(new -$$Lambda$gpb$euhhbmY3WRbbairbbVdBNQ-DeAY(this, z));
    }

    public final ajcx b(String str) {
        return this.b.e(new -$$Lambda$gpb$HWzkELrVosQUaX5VzJRZw2snYbY(this, str));
    }

    @Deprecated
    public final String b() {
        if (this.k == null) {
            this.k = e().a.b;
        }
        return this.k;
    }

    public final void b(abkq abkq) {
        this.j.a(a(abkq).a(-$$Lambda$gpb$hnj71u_pAHIT4n_gL-JiHQ5-66U.INSTANCE, -$$Lambda$gpb$QepIhZzsFIMlYtmrfu91XpKQM2k.INSTANCE));
    }

    public final ajdp<abkq> c() {
        return this.a.e(0, TimeUnit.MILLISECONDS).p(-$$Lambda$gpb$Cah2YeHvU8zqGH8Oo9QDRtQlDmo.INSTANCE);
    }

    public final ajdx<gpa> d() {
        return this.b.f(-$$Lambda$gpb$igt-EIaaVa-S5aULbzQquCkKR9E.INSTANCE).b((ajdw) this.h.f());
    }

    @Deprecated
    public final gpa e() {
        return (gpa) this.a.b();
    }

    public final ajdp<gpa> f() {
        return this.a;
    }

    public final ajcx g() {
        return this.b.e(new -$$Lambda$gpb$w3HzcG9E9fjNECEhKCdA1m-3vmI(this));
    }
}
