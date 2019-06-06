package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: bxh */
public final class bxh {
    public final Uri a;
    public final byte[] b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public bxh(Uri uri) {
        this(uri, 0, -1, null, 3);
    }

    public bxh(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public bxh(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public bxh(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public bxh(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        byo.a(j >= 0);
        byo.a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        byo.a(z);
        this.a = uri;
        this.b = bArr;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str;
        this.g = i;
    }

    private bxh a(long j, long j2) {
        if (j == 0 && this.e == j2) {
            return this;
        }
        return new bxh(this.a, this.b, this.c + j, this.d + j, j2, this.f, this.g);
    }

    public final bxh a(long j) {
        long j2 = this.e;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return a(j, j3);
    }

    public final boolean a(int i) {
        return (this.g & i) == i;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DataSpec[");
        stringBuilder.append(this.a);
        String str = ppy.d;
        stringBuilder.append(str);
        stringBuilder.append(Arrays.toString(this.b));
        stringBuilder.append(str);
        stringBuilder.append(this.c);
        stringBuilder.append(str);
        stringBuilder.append(this.d);
        stringBuilder.append(str);
        stringBuilder.append(this.e);
        stringBuilder.append(str);
        stringBuilder.append(this.f);
        stringBuilder.append(str);
        stringBuilder.append(this.g);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
