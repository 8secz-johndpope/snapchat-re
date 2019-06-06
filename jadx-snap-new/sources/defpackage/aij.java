package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.android.linearallocexpander.LaExpander;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: aij */
public final class aij {
    public int a = 0;
    private int b;
    private int c;
    private Integer d = null;
    private int e;
    private int f = -1;
    private boolean g = false;
    private OutputStream h;
    private Bitmap i;
    private byte[] j;
    private byte[] k;
    private int l;
    private byte[] m;
    private boolean[] n = new boolean[256];
    private int o = 7;
    private int p = -1;
    private boolean q = false;
    private boolean r = true;
    private boolean s = false;
    private int t = 10;
    private boolean u;

    private void a(int i) {
        this.h.write(i & 255);
        this.h.write((i >> 8) & 255);
    }

    private void a(String str) {
        for (int i = 0; i < str.length(); i++) {
            this.h.write((byte) str.charAt(i));
        }
    }

    private void b() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        byte[] bArr = this.j;
        int length = bArr.length;
        int i8 = length / 3;
        this.k = new byte[i8];
        ail ail = new ail(bArr, length, this.t);
        ail.a();
        int i9 = 0;
        length = 0;
        while (true) {
            i = 256;
            i2 = 1;
            if (length >= 256) {
                break;
            }
            iArr = ail.a[length];
            iArr[0] = iArr[0] >> 4;
            iArr = ail.a[length];
            iArr[1] = iArr[1] >> 4;
            iArr = ail.a[length];
            iArr[2] = iArr[2] >> 4;
            ail.a[length][3] = length;
            length++;
        }
        length = 0;
        int i10 = 0;
        int i11 = 0;
        while (length < i) {
            int[] iArr2 = ail.a[length];
            i3 = length + 1;
            i4 = length;
            i5 = iArr2[1];
            i6 = i3;
            while (i6 < i) {
                iArr = ail.a[i6];
                if (iArr[1] < i5) {
                    i5 = iArr[1];
                    i4 = i6;
                }
                i6++;
                i = 256;
            }
            iArr = ail.a[i4];
            if (length != i4) {
                i7 = iArr[0];
                iArr[0] = iArr2[0];
                iArr2[0] = i7;
                i7 = iArr[1];
                iArr[1] = iArr2[1];
                iArr2[1] = i7;
                i7 = iArr[2];
                iArr[2] = iArr2[2];
                iArr2[2] = i7;
                i6 = iArr[3];
                iArr[3] = iArr2[3];
                iArr2[3] = i6;
            }
            if (i5 != i10) {
                ail.b[i10] = (i11 + length) >> 1;
                while (true) {
                    i10++;
                    if (i10 >= i5) {
                        break;
                    }
                    ail.b[i10] = length;
                }
                i11 = length;
                i10 = i5;
            }
            length = i3;
            i = 256;
        }
        i = 255;
        ail.b[i10] = (i11 + 255) >> 1;
        length = 256;
        for (i10++; i10 < 256; i10++) {
            ail.b[i10] = 255;
        }
        byte[] bArr2 = new byte[768];
        int[] iArr3 = new int[256];
        for (i11 = 0; i11 < 256; i11++) {
            iArr3[ail.a[i11][3]] = i11;
        }
        i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            length = iArr3[i11];
            i6 = i12 + 1;
            bArr2[i12] = (byte) ail.a[length][0];
            i12 = i6 + 1;
            bArr2[i6] = (byte) ail.a[length][1];
            i6 = i12 + 1;
            bArr2[i12] = (byte) ail.a[length][2];
            i11++;
            i12 = i6;
            length = 256;
        }
        this.m = bArr2;
        length = 0;
        while (true) {
            bArr2 = this.m;
            if (length >= bArr2.length) {
                break;
            }
            byte b = bArr2[length];
            i11 = length + 2;
            bArr2[length] = bArr2[i11];
            bArr2[i11] = b;
            this.n[length / 3] = false;
            length += 3;
        }
        length = 0;
        i7 = 0;
        while (length < i8) {
            byte[] bArr3 = this.j;
            i12 = i7 + 1;
            i7 = bArr3[i7] & i;
            i6 = i12 + 1;
            i12 = bArr3[i12] & i;
            i3 = i6 + 1;
            i11 = bArr3[i6] & i;
            i4 = ail.b[i12];
            i5 = i4 - 1;
            i = 256;
            i10 = MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL;
            i6 = -1;
            while (true) {
                if (i4 >= i) {
                    if (i5 < 0) {
                        break;
                    }
                    i = 256;
                }
                if (i4 < i) {
                    iArr = ail.a[i4];
                    i2 = iArr[i2] - i12;
                    if (i2 >= i10) {
                        i4 = 256;
                    } else {
                        i4++;
                        if (i2 < 0) {
                            i2 = -i2;
                        }
                        i9 = iArr[i9] - i7;
                        if (i9 < 0) {
                            i9 = -i9;
                        }
                        i2 += i9;
                        if (i2 < i10) {
                            i9 = iArr[2] - i11;
                            if (i9 < 0) {
                                i9 = -i9;
                            }
                            i2 += i9;
                            if (i2 < i10) {
                                i6 = iArr[3];
                                i10 = i2;
                            }
                        }
                    }
                }
                if (i5 >= 0) {
                    int[] iArr4 = ail.a[i5];
                    i2 = i12 - iArr4[1];
                    if (i2 >= i10) {
                        i9 = 0;
                        i = 256;
                        i2 = 1;
                        i5 = -1;
                    } else {
                        i5--;
                        if (i2 < 0) {
                            i2 = -i2;
                        }
                        i = iArr4[0] - i7;
                        if (i < 0) {
                            i = -i;
                        }
                        i2 += i;
                        if (i2 < i10) {
                            i = iArr4[2] - i11;
                            if (i < 0) {
                                i = -i;
                            }
                            i += i2;
                            if (i < i10) {
                                i6 = iArr4[3];
                                i10 = i;
                            }
                        }
                    }
                }
                i9 = 0;
                i = 256;
                i2 = 1;
            }
            this.n[i6] = i2;
            this.k[length] = (byte) i6;
            length++;
            i7 = i3;
            i = 255;
        }
        this.j = null;
        this.l = 8;
        this.o = 7;
        if (this.u) {
            if (this.m == null) {
                i10 = -1;
            } else {
                i9 = Color.red(0);
                length = Color.green(0);
                i8 = Color.blue(0);
                int length2 = this.m.length;
                int i13 = 0;
                i = LaExpander.DEFAULT_KITKAT_LINEAR_ALLOC_SIZE;
                i10 = 0;
                while (i13 < length2) {
                    bArr2 = this.m;
                    i2 = i13 + 1;
                    i13 = i9 - (bArr2[i13] & 255);
                    i12 = i2 + 1;
                    i2 = length - (bArr2[i2] & 255);
                    i7 = i8 - (bArr2[i12] & 255);
                    i13 = ((i13 * i13) + (i2 * i2)) + (i7 * i7);
                    i7 = i12 / 3;
                    if (this.n[i7] && i13 < r6) {
                        i = i13;
                        i10 = i7;
                    }
                    i13 = i12 + 1;
                }
            }
            this.e = i10;
        }
    }

    private void c() {
        OutputStream outputStream = this.h;
        byte[] bArr = this.m;
        outputStream.write(bArr, 0, bArr.length);
        int length = 768 - this.m.length;
        for (int i = 0; i < length; i++) {
            this.h.write(0);
        }
    }

    public final boolean a() {
        if (!this.g) {
            return false;
        }
        boolean z;
        this.g = false;
        try {
            this.h.write(59);
            this.h.flush();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        this.e = 0;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.m = null;
        this.q = false;
        this.r = true;
        return z;
    }

    public final boolean a(Bitmap bitmap) {
        String str = "AnimatedGifEncoder";
        if (bitmap == null || !this.g) {
            return false;
        }
        try {
            int width;
            int i;
            if (!this.s) {
                width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (!this.g || this.r) {
                    this.b = width;
                    this.c = height;
                    if (this.b <= 0) {
                        this.b = 320;
                    }
                    if (this.c <= 0) {
                        this.c = 240;
                    }
                    this.s = true;
                }
            }
            this.i = bitmap;
            int width2 = this.i.getWidth();
            int height2 = this.i.getHeight();
            if (!(width2 == this.b && height2 == this.c)) {
                bitmap = Bitmap.createBitmap(this.b, this.c, Config.ARGB_8888);
                new Canvas(bitmap).drawBitmap(bitmap, MapboxConstants.MINIMUM_ZOOM, MapboxConstants.MINIMUM_ZOOM, null);
                this.i = bitmap;
            }
            int[] iArr = new int[(width2 * height2)];
            this.i.getPixels(iArr, 0, width2, 0, 0, width2, height2);
            this.j = new byte[(iArr.length * 3)];
            this.u = false;
            width = iArr.length;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < width) {
                int i5 = iArr[i2];
                if (i5 == 0) {
                    i3++;
                }
                width2 = i4 + 1;
                this.j[i4] = (byte) i5;
                int i6 = width2 + 1;
                this.j[width2] = (byte) (i5 >> 8);
                width2 = i6 + 1;
                this.j[i6] = (byte) (i5 >> 16);
                i2++;
                i4 = width2;
            }
            double d = (double) (i3 * 100);
            double d2 = (double) width;
            Double.isNaN(d);
            Double.isNaN(d2);
            d /= d2;
            this.u = d > 4.0d;
            if (Log.isLoggable(str, 3)) {
                StringBuilder stringBuilder = new StringBuilder("got pixels for frame with ");
                stringBuilder.append(d);
                stringBuilder.append("% transparent pixels");
                Log.d(str, stringBuilder.toString());
            }
            b();
            if (this.r) {
                a(this.b);
                a(this.c);
                this.h.write(this.o | 240);
                this.h.write(0);
                this.h.write(0);
                c();
                if (this.f >= 0) {
                    this.h.write(33);
                    this.h.write(255);
                    this.h.write(11);
                    a("NETSCAPE2.0");
                    this.h.write(3);
                    this.h.write(1);
                    a(this.f);
                    this.h.write(0);
                }
            }
            this.h.write(33);
            this.h.write(249);
            this.h.write(4);
            if (this.u) {
                i = 2;
                width = 1;
            } else {
                i = 0;
                width = 0;
            }
            if (this.p >= 0) {
                i = this.p & 7;
            }
            this.h.write(((i << 2) | 0) | width);
            a(this.a);
            this.h.write(this.e);
            this.h.write(0);
            this.h.write(44);
            a(0);
            a(0);
            a(this.b);
            a(this.c);
            if (this.r) {
                this.h.write(0);
            } else {
                this.h.write(this.o | 128);
            }
            if (!this.r) {
                c();
            }
            aik aik = new aik(this.b, this.c, this.k, this.l);
            OutputStream outputStream = this.h;
            outputStream.write(aik.c);
            aik.d = aik.a * aik.b;
            aik.e = 0;
            aik.a(aik.c + 1, outputStream);
            outputStream.write(0);
            this.r = false;
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean a(OutputStream outputStream) {
        boolean z = false;
        if (outputStream == null) {
            return false;
        }
        this.q = false;
        this.h = outputStream;
        try {
            a("GIF89a");
            z = true;
        } catch (IOException unused) {
        }
        this.g = z;
        return z;
    }
}
