package defpackage;

import android.text.TextUtils;

/* renamed from: iaw */
public final class iaw {
    private final ajwy<hyk> a;
    private final hyj b;
    private final hyh c;
    private int d = 0;

    public iaw(hyh hyh, ajwy<hyk> ajwy, hyj hyj) {
        this.a = ajwy;
        this.b = hyj;
        this.c = hyh;
    }

    public final synchronized void a() {
        this.d = 0;
    }

    public final synchronized boolean a(String str, String str2, String str3, boolean z) {
        if (TextUtils.isEmpty(str2)) {
            ((hyk) this.a.get()).b();
        } else {
            boolean equals = TextUtils.equals(str2, str);
            ((hyk) this.a.get()).a(equals, (long) this.d, z);
            if (equals) {
                a();
            } else {
                this.d++;
                if (this.d > 2) {
                    if (!abss.a().f()) {
                        return true;
                    }
                    StringBuilder stringBuilder = new StringBuilder("[SEC-4751] ");
                    stringBuilder.append(this.d);
                    stringBuilder.append(" mismatches encountered by user ");
                    stringBuilder.append(str3);
                    stringBuilder.append('.');
                }
            }
        }
        return false;
    }
}
