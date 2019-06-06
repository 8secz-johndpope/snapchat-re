package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import java.util.Arrays;

/* renamed from: cyt */
public final class cyt {
    public final String a;
    public final int b;
    public final Throwable c;
    public final byte[] d;
    public final long e;
    public final akhl f;
    private final String g;

    /* renamed from: cyt$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        private static cyt a(String str, int i, Throwable th, akhl akhl) {
            akcr.b(str, "url");
            akcr.b(th, "exception");
            akcr.b(akhl, "headers");
            return new cyt(str, i, th.getMessage(), th, null, -1, akhl);
        }

        public static /* synthetic */ cyt a(String str, int i, Throwable th, akhl akhl, int i2) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                akhl = akhl.a(new String[0]);
                akcr.a((Object) akhl, "Headers.of()");
            }
            return a.a(str, i, th, akhl);
        }
    }

    static {
        a aVar = new a();
    }

    public cyt(String str, int i, String str2, Throwable th, byte[] bArr, long j, akhl akhl) {
        akcr.b(str, "url");
        akcr.b(akhl, "headers");
        this.a = str;
        this.b = i;
        this.g = str2;
        this.c = th;
        this.d = bArr;
        this.e = j;
        this.f = akhl;
    }

    public final boolean a() {
        int i = this.b;
        return Callback.DEFAULT_DRAG_ANIMATION_DURATION <= i && 299 >= i && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((akcr.a(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            cyt cyt = (cyt) obj;
            return this.b == cyt.b && (akcr.a(this.g, cyt.g) ^ 1) == 0 && (akcr.a(this.c, cyt.c) ^ 1) == 0 && Arrays.equals(this.d, cyt.d);
        } else {
            throw new ajxt("null cannot be cast to non-null type com.snap.ads.network.SnapAdsResponse");
        }
    }

    public final int hashCode() {
        int i = this.b * 31;
        String str = this.g;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.c;
        i = (i + (th != null ? th.hashCode() : 0)) * 31;
        byte[] bArr = this.d;
        if (bArr != null) {
            i2 = Arrays.hashCode(bArr);
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("SnapAdsResponse(url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", code=");
        stringBuilder.append(this.b);
        stringBuilder.append(", message=");
        stringBuilder.append(this.g);
        stringBuilder.append(", exception=");
        stringBuilder.append(this.c);
        stringBuilder.append(", data=");
        stringBuilder.append(Arrays.toString(this.d));
        stringBuilder.append(", latencyMs=");
        stringBuilder.append(this.e);
        stringBuilder.append(", headers=");
        stringBuilder.append(this.f);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
