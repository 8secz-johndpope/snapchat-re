package defpackage;

import android.support.v7.widget.RecyclerView.ItemAnimator;
import org.opencv.imgproc.Imgproc;

/* renamed from: ail */
final class ail {
    int[][] a;
    int[] b = new int[256];
    private int c;
    private byte[] d;
    private int e;
    private int f;
    private int[] g = new int[256];
    private int[] h = new int[256];
    private int[] i = new int[32];

    public ail(byte[] bArr, int i, int i2) {
        this.d = bArr;
        this.e = i;
        this.f = i2;
        this.a = new int[256][];
        for (i = 0; i < 256; i++) {
            int[][] iArr = this.a;
            iArr[i] = new int[4];
            int[] iArr2 = iArr[i];
            int i3 = (i << 12) / 256;
            iArr2[2] = i3;
            iArr2[1] = i3;
            iArr2[0] = i3;
            this.h[i] = 256;
            this.g[i] = 0;
        }
    }

    public final void a() {
        int i;
        int i2 = 1509;
        if (this.e < 1509) {
            this.f = 1;
        }
        int i3 = this.f;
        this.c = ((i3 - 1) / 3) + 30;
        byte[] bArr = this.d;
        int i4 = this.e;
        i3 = i4 / (i3 * 3);
        int i5 = i3 / 100;
        int i6 = 0;
        while (true) {
            i = 32;
            if (i6 >= 32) {
                break;
            }
            this.i[i6] = (((1024 - (i6 * i6)) << 8) / Imgproc.INTER_TAB_SIZE2) * Imgproc.INTER_TAB_SIZE2;
            i6++;
        }
        i6 = this.e;
        if (i6 < 1509) {
            i2 = 3;
        } else if (i6 % 499 != 0) {
            i2 = 1497;
        } else if (i6 % 491 != 0) {
            i2 = 1473;
        } else if (i6 % 487 != 0) {
            i2 = 1461;
        }
        i6 = i5;
        int i7 = 0;
        i5 = 0;
        int i8 = Imgproc.INTER_TAB_SIZE2;
        int i9 = ItemAnimator.FLAG_MOVED;
        while (i7 < i3) {
            int i10;
            byte[] bArr2;
            int i11;
            int[] iArr;
            int i12;
            int i13;
            int i14 = (bArr[i5] & 255) << 4;
            int i15 = (bArr[i5 + 1] & 255) << 4;
            int i16 = (bArr[i5 + 2] & 255) << 4;
            int i17 = 0;
            int i18 = -1;
            int i19 = -1;
            int i20 = Integer.MAX_VALUE;
            int i21 = Integer.MAX_VALUE;
            while (i17 < 256) {
                int[] iArr2 = this.a[i17];
                i10 = i3;
                i3 = iArr2[0] - i14;
                if (i3 < 0) {
                    i3 = -i3;
                }
                bArr2 = bArr;
                i11 = iArr2[1] - i15;
                if (i11 < 0) {
                    i11 = -i11;
                }
                i3 += i11;
                i11 = iArr2[2] - i16;
                if (i11 < 0) {
                    i11 = -i11;
                }
                i3 += i11;
                i11 = i20;
                if (i3 < i11) {
                    i20 = i3;
                    i18 = i17;
                } else {
                    i20 = i11;
                }
                i3 -= this.g[i17] >> 12;
                i11 = i21;
                if (i3 < i11) {
                    i21 = i3;
                    i19 = i17;
                } else {
                    i21 = i11;
                }
                iArr = this.h;
                i11 = iArr[i17] >> 10;
                iArr[i17] = iArr[i17] - i11;
                iArr = this.g;
                iArr[i17] = iArr[i17] + (i11 << 10);
                i17++;
                i3 = i10;
                bArr = bArr2;
            }
            i10 = i3;
            bArr2 = bArr;
            iArr = this.h;
            iArr[i18] = iArr[i18] + 64;
            iArr = this.g;
            iArr[i18] = iArr[i18] - Imgproc.FLOODFILL_FIXED_RANGE;
            iArr = this.a[i19];
            iArr[0] = iArr[0] - ((i8 * (iArr[0] - i14)) / Imgproc.INTER_TAB_SIZE2);
            iArr[1] = iArr[1] - ((i8 * (iArr[1] - i15)) / Imgproc.INTER_TAB_SIZE2);
            iArr[2] = iArr[2] - (((iArr[2] - i16) * i8) / Imgproc.INTER_TAB_SIZE2);
            if (i != 0) {
                i3 = i19 - i;
                if (i3 < -1) {
                    i3 = -1;
                }
                i12 = i19 + i;
                i11 = 256;
                if (i12 <= 256) {
                    i11 = i12;
                }
                i12 = i19 + 1;
                i17 = i19 - 1;
                i18 = 1;
                while (true) {
                    if (i12 >= i11 && i17 <= i3) {
                        break;
                    }
                    i13 = i;
                    i19 = i18 + 1;
                    i = this.i[i18];
                    if (i12 < i11) {
                        i20 = i11;
                        i21 = i12 + 1;
                        int[] iArr3 = this.a[i12];
                        try {
                            iArr3[0] = iArr3[0] - (((iArr3[0] - i14) * i) / 262144);
                            iArr3[1] = iArr3[1] - (((iArr3[1] - i15) * i) / 262144);
                            iArr3[2] = iArr3[2] - (((iArr3[2] - i16) * i) / 262144);
                        } catch (Exception unused) {
                        }
                        i12 = i21;
                    } else {
                        i20 = i11;
                    }
                    if (i17 > i3) {
                        i21 = i17 - 1;
                        int[] iArr4 = this.a[i17];
                        try {
                            iArr4[0] = iArr4[0] - (((iArr4[0] - i14) * i) / 262144);
                            iArr4[1] = iArr4[1] - (((iArr4[1] - i15) * i) / 262144);
                            iArr4[2] = iArr4[2] - ((i * (iArr4[2] - i16)) / 262144);
                        } catch (Exception unused2) {
                        }
                        i = i13;
                        i18 = i19;
                        i11 = i20;
                        i17 = i21;
                    } else {
                        i = i13;
                        i18 = i19;
                        i11 = i20;
                    }
                }
            }
            i13 = i;
            i5 += i2;
            if (i5 >= i4) {
                i5 -= this.e;
            }
            i7++;
            if (i6 == 0) {
                i6 = 1;
            }
            if (i7 % i6 == 0) {
                i8 -= i8 / this.c;
                i9 -= i9 / 30;
                i12 = i9 >> 6;
                i = i12 <= 1 ? 0 : i12;
                for (i17 = 0; i17 < i; i17++) {
                    i12 = i * i;
                    this.i[i17] = (((i12 - (i17 * i17)) << 8) / i12) * i8;
                }
            } else {
                i = i13;
            }
            i3 = i10;
            bArr = bArr2;
        }
    }
}
