package defpackage;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

/* renamed from: sao */
public final class sao {
    public final int a;
    public final Throwable b;
    public final san c;
    public final String d;
    public final sar e;
    public final long f;
    public final long g;
    public final long h;
    public final rzz i;

    /* renamed from: sao$a */
    public static final class a {
        public int a;
        public String b;
        public san c;
        public sar d;
        public long e;
        public long f;
        public long g;
        public rzz h;
        private Throwable i;

        public /* synthetic */ a() {
            this(0, null, null, null, sas.c, -1, -1, -1, sas.b);
        }

        public a(byte b) {
            this();
        }

        public a(int i, String str, Throwable th, san san, sar sar, long j, long j2, long j3, rzz rzz) {
            akcr.b(sar, "responseInfo");
            akcr.b(rzz, "detailedRequestTimingInfo");
            this.a = i;
            this.b = str;
            this.i = th;
            this.c = san;
            this.d = sar;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = rzz;
        }

        public final sao a() {
            return new sao(this.a, this.i, this.c, this.b, this.d, this.e, this.f, this.g, this.h);
        }

        public final void a(Throwable th) {
            akcr.b(th, "exception");
            this.i = th;
        }
    }

    public sao(int i, Throwable th, san san, String str, sar sar, long j, long j2, long j3, rzz rzz) {
        akcr.b(sar, "responseInfo");
        akcr.b(rzz, "detailedRequestTimingInfo");
        this.a = i;
        this.b = th;
        this.c = san;
        this.d = str;
        this.e = sar;
        this.f = j;
        this.g = j2;
        this.h = j3;
        this.i = rzz;
    }

    public final boolean a() {
        int i = this.a;
        return i >= Callback.DEFAULT_DRAG_ANIMATION_DURATION && i < MapboxConstants.ANIMATION_DURATION && this.b == null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sao) {
                sao sao = (sao) obj;
                if ((this.a == sao.a ? 1 : null) != null && akcr.a(this.b, sao.b) && akcr.a(this.c, sao.c) && akcr.a(this.d, sao.d) && akcr.a(this.e, sao.e)) {
                    if ((this.f == sao.f ? 1 : null) != null) {
                        if ((this.g == sao.g ? 1 : null) != null) {
                            if ((this.h == sao.h ? 1 : null) == null || !akcr.a(this.i, sao.i)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Throwable th = this.b;
        int i2 = 0;
        i = (i + (th != null ? th.hashCode() : 0)) * 31;
        san san = this.c;
        i = (i + (san != null ? san.hashCode() : 0)) * 31;
        String str = this.d;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        sar sar = this.e;
        i = (i + (sar != null ? sar.hashCode() : 0)) * 31;
        long j = this.f;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.g;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        j = this.h;
        i = (i + ((int) (j ^ (j >>> 32)))) * 31;
        rzz rzz = this.i;
        if (rzz != null) {
            i2 = rzz.hashCode();
        }
        return i + i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RequestFinishedInfo(statusCode=");
        stringBuilder.append(this.a);
        stringBuilder.append(", exception=");
        stringBuilder.append(this.b);
        stringBuilder.append(", errorInfo=");
        stringBuilder.append(this.c);
        stringBuilder.append(", responseMessage=");
        stringBuilder.append(this.d);
        stringBuilder.append(", responseInfo=");
        stringBuilder.append(this.e);
        stringBuilder.append(", contentLength=");
        stringBuilder.append(this.f);
        stringBuilder.append(", totalBytesDownloaded=");
        stringBuilder.append(this.g);
        stringBuilder.append(", totalBytesRead=");
        stringBuilder.append(this.h);
        stringBuilder.append(", detailedRequestTimingInfo=");
        stringBuilder.append(this.i);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
