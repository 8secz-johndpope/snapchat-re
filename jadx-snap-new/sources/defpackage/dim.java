package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.base.Strings;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: dim */
public final class dim {
    private final ajwy<Context> a;
    private final ajwy<abrk> b;
    private final ajwy<ilv> c;
    private SharedPreferences d;

    public dim(ajwy<ilv> ajwy, ajwy<Context> ajwy2, ajwy<abrk> ajwy3) {
        this.a = ajwy2;
        this.b = ajwy3;
        this.c = ajwy;
    }

    public final void a() {
        this.d = ((Context) this.a.get()).getSharedPreferences(String.format("%s.%s", new Object[]{"com.snapchat.android.analytics.framework", ((Context) this.a.get()).getPackageName()}), 0);
    }

    public final String b() {
        Date date = new Date();
        String str = "com.snapchat.android.analytics.framework.dailyClientId";
        String string = this.d.getString(str, null);
        if (Strings.isNullOrEmpty(string)) {
            string = ((abrk) this.b.get()).a(abro.DAILY_CLIENT_ID, null);
            if (!Strings.isNullOrEmpty(string)) {
                this.d.edit().putString(str, string).apply();
                ((ilv) this.c.get()).c(ino.PROPERTY_STORE_DAILY_CLIENT_ID, 1);
            }
        }
        String str2 = "com.snapchat.android.analytics.framework.dailyClientIdTs";
        long j = this.d.getLong(str2, 0);
        if (j == 0) {
            j = ((abrk) this.b.get()).c(abro.DAILY_CLIENT_ID_TIMESTAMP);
            if (j != 0) {
                this.d.edit().putLong(str2, j).apply();
                ((ilv) this.c.get()).c(ino.PROPERTY_STORE_DAILY_CL_ID_TS, 1);
            }
        }
        if (!Strings.isNullOrEmpty(string)) {
            Date date2 = new Date(j);
            TimeZone timeZone = TimeZone.getTimeZone("GMT-8");
            Calendar instance = Calendar.getInstance(timeZone);
            instance.setTime(date2);
            Calendar instance2 = Calendar.getInstance(timeZone);
            instance2.setTime(date);
            if (instance == null || instance2 == null) {
                throw new IllegalArgumentException("The date must not be null");
            }
            int i = 0;
            if (instance.get(0) == instance2.get(0) && instance.get(1) == instance2.get(1) && instance.get(6) == instance2.get(6)) {
                i = 1;
            }
            if (i != 0) {
                return string;
            }
        }
        string = abpu.a().toString();
        this.d.edit().putString(str, string).putLong(str2, date.getTime()).apply();
        return string;
    }
}
