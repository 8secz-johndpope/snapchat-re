package defpackage;

import com.snap.android.linearallocexpander.LaExpander;
import net.sqlcipher.database.SQLiteDatabase;
import org.opencv.imgproc.Imgproc;

/* renamed from: bkx */
public final class bkx implements blj {
    private final bxi a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final int f;
    private final boolean g;
    private final bzf h;
    private int i;
    private boolean j;

    public bkx() {
        this(new bxi());
    }

    @Deprecated
    private bkx(bxi bxi) {
        this(bxi, 15000, SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH, 2500, 5000);
    }

    @Deprecated
    public bkx(bxi bxi, int i, int i2, int i3, int i4) {
        this(bxi, i, i2, i3, i4, (byte) 0);
    }

    @Deprecated
    public bkx(bxi bxi, int i, int i2, int i3, int i4, byte b) {
        String str = "0";
        String str2 = "bufferForPlaybackMs";
        bkx.a(i3, 0, str2, str);
        String str3 = "bufferForPlaybackAfterRebufferMs";
        bkx.a(i4, 0, str3, str);
        str = "minBufferMs";
        bkx.a(i, i3, str, str2);
        bkx.a(i, i4, str, str3);
        bkx.a(i2, i, "maxBufferMs", str);
        this.a = bxi;
        this.b = ((long) i) * 1000;
        this.c = ((long) i2) * 1000;
        this.d = ((long) i3) * 1000;
        this.e = ((long) i4) * 1000;
        this.f = -1;
        this.g = true;
        this.h = null;
    }

    private static void a(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" cannot be less than ");
        stringBuilder.append(str2);
        byo.a(z, stringBuilder.toString());
    }

    private void a(boolean z) {
        this.i = 0;
        this.j = false;
        if (z) {
            this.a.d();
        }
    }

    public final void a() {
        a(false);
    }

    public final void a(bls[] blsArr, bwu bwu) {
        int i = 0;
        for (int i2 = 0; i2 < blsArr.length; i2++) {
            if (bwu.b[i2] != null) {
                int a = blsArr[i2].a();
                int i3 = Imgproc.FLOODFILL_MASK_ONLY;
                if (a == 0) {
                    i3 = LaExpander.DEFAULT_KITKAT_LINEAR_ALLOC_SIZE;
                } else if (a == 1) {
                    i3 = 3538944;
                } else if (a == 2) {
                    i3 = 13107200;
                } else if (!(a == 3 || a == 4)) {
                    throw new IllegalStateException();
                }
                i += i3;
            }
        }
        this.i = i;
        this.a.a(this.i);
    }

    public final boolean a(long j, float f) {
        Object obj = this.a.e() >= this.i ? 1 : null;
        long j2 = this.b;
        if (f > 1.0f) {
            j2 = Math.min(bzo.a(j2, f), this.c);
        }
        if (j < j2) {
            this.j = true;
        } else if (j > this.c || obj != null) {
            this.j = false;
        }
        return this.j;
    }

    public final boolean a(long j, float f, boolean z) {
        j = bzo.b(j, f);
        long j2 = z ? this.e : this.d;
        return j2 <= 0 || j >= j2;
    }

    public final void b() {
        a(true);
    }

    public final void c() {
        a(true);
    }

    public final bwy d() {
        return this.a;
    }
}
