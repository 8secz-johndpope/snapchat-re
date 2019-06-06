package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* renamed from: adhu */
public final class adhu {
    public final int a;
    public final int b;
    public final int c;
    public final int[] d;
    public final int[] e;
    private final adhk f;

    public adhu(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        this(i, i2, i3, iArr, iArr2, adhk.a);
    }

    private adhu(int i, int i2, int i3, int[] iArr, int[] iArr2, adhk adhk) {
        boolean z = true;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        boolean z2 = i3 == 0 || GLES20.glIsFramebuffer(i3);
        Preconditions.checkArgument(z2);
        Preconditions.checkArgument(iArr.length == 4);
        if (!(iArr2 == null || iArr2.length == 4)) {
            z = false;
        }
        Preconditions.checkArgument(z);
        this.f = adhk;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = (int[]) iArr.clone();
        this.e = iArr2 != null ? (int[]) iArr2.clone() : null;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final adhu c() {
        adhk.c(this.d);
        GLES20.glBindFramebuffer(36160, this.c);
        if (this.e != null) {
            GLES20.glEnable(3089);
            adhk.d(this.e);
        } else {
            GLES20.glDisable(3089);
        }
        return this;
    }

    public final adhu d() {
        GLES20.glBindFramebuffer(36160, 0);
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adhu)) {
            return false;
        }
        adhu adhu = (adhu) obj;
        return (this.a == adhu.a && this.b == adhu.b && this.c == adhu.c && Arrays.equals(this.d, adhu.d)) ? Arrays.equals(this.e, adhu.e) : false;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }
}
