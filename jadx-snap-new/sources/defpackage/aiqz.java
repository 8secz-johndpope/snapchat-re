package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;

/* renamed from: aiqz */
final class aiqz {
    final aitd a;
    private final Context b;

    /* renamed from: aiqz$1 */
    class 1 extends aire {
        private /* synthetic */ aiqy a;

        1(aiqy aiqy) {
            this.a = aiqy;
        }

        public final void a() {
            aiqy a = aiqz.this.a();
            if (!this.a.equals(a)) {
                aiqj.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                aiqz.this.a(a);
            }
        }
    }

    public aiqz(Context context) {
        this.b = context.getApplicationContext();
        this.a = new aite(context, "TwitterAdvertisingInfoPreferences");
    }

    static boolean b(aiqy aiqy) {
        return (aiqy == null || TextUtils.isEmpty(aiqy.a)) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final aiqy a() {
        aiqr a;
        String str;
        aiqy a2 = new aira(this.b).a();
        String str2 = "Fabric";
        if (aiqz.b(a2)) {
            a = aiqj.a();
            str = "Using AdvertisingInfo from Reflection Provider";
        } else {
            a2 = new airb(this.b).a();
            if (aiqz.b(a2)) {
                a = aiqj.a();
                str = "Using AdvertisingInfo from Service Provider";
            } else {
                a = aiqj.a();
                str = "AdvertisingInfo not present";
            }
        }
        a.a(str2, str);
        return a2;
    }

    /* Access modifiers changed, original: final */
    @SuppressLint({"CommitPrefEdits"})
    public final void a(aiqy aiqy) {
        String str = "limit_ad_tracking_enabled";
        String str2 = "advertising_id";
        if (aiqz.b(aiqy)) {
            aitd aitd = this.a;
            aitd.a(aitd.b().putString(str2, aiqy.a).putBoolean(str, aiqy.b));
            return;
        }
        aitd aitd2 = this.a;
        aitd2.a(aitd2.b().remove(str2).remove(str));
    }
}
