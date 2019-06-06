package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* renamed from: bwp */
public abstract class bwp implements bwt {
    protected final int a;
    final blg[] b;
    private bsr c;
    private int[] d;
    private final long[] e;
    private int f;

    /* renamed from: bwp$a */
    static final class a implements Comparator<blg> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((blg) obj2).b - ((blg) obj).b;
        }
    }

    public bwp(bsr bsr, int... iArr) {
        int i = 0;
        byo.b(iArr.length > 0);
        this.c = (bsr) byo.a((Object) bsr);
        this.a = iArr.length;
        this.b = new blg[this.a];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.b[i2] = bsr.b[iArr[i2]];
        }
        Arrays.sort(this.b, new a());
        this.d = new int[this.a];
        while (true) {
            int i3 = this.a;
            if (i < i3) {
                this.d[i] = bsr.a(this.b[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    public int a(long j, List<? extends btg> list) {
        return list.size();
    }

    public final int a(blg blg) {
        for (int i = 0; i < this.a; i++) {
            if (this.b[i] == blg) {
                return i;
            }
        }
        return -1;
    }

    public final blg a(int i) {
        return this.b[i];
    }

    public void a(float f) {
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    public final int b(int i) {
        return this.d[i];
    }

    public final int c(int i) {
        for (int i2 = 0; i2 < this.a; i2++) {
            if (this.d[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public void c() {
    }

    public final bsr d() {
        return this.c;
    }

    public final boolean d(int i) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.a && !a) {
            a = (i2 == i || a(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + 60000);
        return true;
    }

    public final int e() {
        return this.d.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bwp bwp = (bwp) obj;
            return this.c == bwp.c && Arrays.equals(this.d, bwp.d);
        }
    }

    public final blg f() {
        return this.b[a()];
    }

    public final int g() {
        return this.d[a()];
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.c) * 31) + Arrays.hashCode(this.d);
        }
        return this.f;
    }
}
