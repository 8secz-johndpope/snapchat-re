package defpackage;

import android.content.res.Resources;
import com.snapchat.android.R;

/* renamed from: acqx */
public final class acqx {
    private final Resources a;
    private final ihh b;

    public acqx(Resources resources, ihh ihh) {
        akcr.b(resources, "res");
        akcr.b(ihh, "clock");
        this.a = resources;
        this.b = ihh;
    }

    public final String a(long j) {
        Object string;
        String str;
        j = Math.abs(this.b.a() - j);
        long j2 = j / 1000;
        if (j <= 60000) {
            string = this.a.getString(R.string.just_now);
            str = "res.getString(R.string.just_now)";
        } else if (j < 3600000) {
            string = this.a.getString(R.string.minutes_ago_abbreviated, new Object[]{Long.valueOf(j2 / 60)});
            str = "res.getString(R.string.m…onds / MINUTE_IN_SECONDS)";
        } else {
            string = this.a.getString(R.string.hours_ago_abbreviated, new Object[]{Long.valueOf(j2 / 3600)});
            str = "res.getString(R.string.h…econds / HOUR_IN_SECONDS)";
        }
        akcr.a(string, str);
        return string;
    }
}
