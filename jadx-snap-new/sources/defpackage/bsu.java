package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: bsu */
public final class bsu {
    public static final bsu a = new bsu(new long[0]);
    public final long[] b;
    public final a[] c;
    private int d = 0;
    private long e;
    private long f;

    /* renamed from: bsu$a */
    public static final class a {
        private int a;
        private Uri[] b;
        private int[] c;
        private long[] d;

        public a() {
            this(new int[0], new Uri[0], new long[0]);
        }

        private a(int[] iArr, Uri[] uriArr, long[] jArr) {
            byo.a(true);
            this.a = -1;
            this.c = iArr;
            this.b = uriArr;
            this.d = jArr;
        }

        public final int a(int i) {
            i++;
            while (true) {
                int[] iArr = this.c;
                if (i >= iArr.length || iArr[i] == 0 || iArr[i] == 1) {
                    return i;
                }
                i++;
            }
            return i;
        }
    }

    private bsu(long... jArr) {
        this.b = Arrays.copyOf(jArr, 0);
        this.c = new a[0];
        this.e = 0;
        this.f = -9223372036854775807L;
    }

    public final int a(long j) {
        int length = this.b.length - 1;
        while (length >= 0) {
            long[] jArr = this.b;
            if (jArr[length] != Long.MIN_VALUE && jArr[length] <= j) {
                break;
            }
            length--;
        }
        return length >= 0 ? length : -1;
    }

    public final int b(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i < jArr.length && jArr[i] != Long.MIN_VALUE && j >= jArr[i]) {
                i++;
            }
        }
        return i < this.b.length ? i : -1;
    }
}
