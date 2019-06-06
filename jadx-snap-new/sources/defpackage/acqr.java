package defpackage;

import android.content.res.Resources;
import android.os.SystemClock;
import android.text.TextUtils;
import com.snapchat.android.R;
import defpackage.acvm.d;

/* renamed from: acqr */
public final class acqr implements d {
    private final acqx a;
    private final Resources b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private final String h;
    private long i;
    private boolean j;
    private long k = 0;
    private String l;
    private String m;

    public acqr(acqx acqx, String str, Resources resources) {
        this.a = acqx;
        this.h = str;
        this.b = resources;
    }

    private synchronized void e() {
        if (this.j || SystemClock.currentThreadTimeMillis() - this.k > 30000) {
            this.j = false;
            this.k = SystemClock.currentThreadTimeMillis();
            this.l = adbu.a(this.c, this.d);
            boolean equals = TextUtils.equals(this.h, this.g);
            String a = this.a.a(this.i);
            String str = this.d;
            if (!equals) {
                if (!TextUtils.isEmpty(str)) {
                    a = this.b.getString(R.string.nyc_map_friend_on_map_subtitle, new Object[]{a, str});
                }
            }
            this.m = a;
        }
    }

    public final String a() {
        return this.e;
    }

    public final synchronized void a(alhq alhq, String str) {
        if (this.c == null || !this.c.equals(str)) {
            this.c = str;
            this.j = true;
        }
        if (this.i != alhq.d) {
            this.i = alhq.d;
            this.j = true;
        }
        if (this.d == null || !this.d.equals(alhq.e)) {
            this.d = alhq.e;
            this.j = true;
        }
        if (this.g == null || !this.g.equals(alhq.a)) {
            this.g = alhq.a;
            this.j = true;
        }
    }

    public final void a(String str, String str2) {
        if (!TextUtils.equals(str, this.e) || !TextUtils.equals(str2, this.f)) {
            this.e = str;
            this.f = str2;
        }
    }

    public final String b() {
        return this.f;
    }

    public final synchronized String c() {
        e();
        return this.l;
    }

    public final synchronized String d() {
        e();
        return this.m;
    }
}
