package defpackage;

import android.opengl.GLES20;
import com.google.common.base.Preconditions;
import java.util.Locale;

/* renamed from: adhd */
public final class adhd {
    public final int a;
    public final int b;
    public final int c;
    public final adhu d;
    public boolean e;
    private final String f;
    private final adhk g;
    private final int h;
    private boolean i;

    /* renamed from: adhd$a */
    public static class a {
    }

    public adhd(int i, int i2, int i3) {
        this(i, i2, i3, adhk.a);
    }

    private adhd(int i, int i2, int i3, adhk adhk) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        this.f = "CapturedFrame";
        this.i = false;
        this.e = false;
        this.g = adhk;
        Preconditions.checkArgument(i4 > 0);
        Preconditions.checkArgument(i5 > 0);
        Preconditions.checkArgument(i4 % 4 == 0);
        Preconditions.checkArgument(i5 % 4 == 0);
        this.a = i4;
        this.b = i5;
        if (i6 != -1) {
            Preconditions.checkArgument(GLES20.glIsRenderbuffer(i3));
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        adhk.a("glGenTextures");
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glPixelStorei(3333, 1);
        GLES20.glPixelStorei(3317, 1);
        adhk.a(6408, this.a, this.b, 6408, null);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        this.c = iArr[0];
        i5 = this.c;
        int[] iArr2 = new int[1];
        GLES20.glGenFramebuffers(1, iArr2, 0);
        adhk.a("glGenFramebuffers");
        GLES20.glBindFramebuffer(36160, iArr2[0]);
        adhk.d(i5);
        adhk.a("glFramebufferTexture2D");
        if (i6 != -1) {
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, i6);
            adhk.a("glFramebufferRenderbuffer");
        }
        Preconditions.checkState(GLES20.glCheckFramebufferStatus(36160) == 36053, String.format(Locale.US, "Framebuffer not ready, status: %d, textureId: %d, frameBufferId: %d, width: %d, height: %d, release: %b", new Object[]{Integer.valueOf(GLES20.glCheckFramebufferStatus(36160)), Integer.valueOf(i5), Integer.valueOf(iArr2[0]), Integer.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.i)}));
        this.h = iArr2[0];
        this.d = new adhu(this.a, this.b, this.h, new int[]{0, 0, r12, r13}, null);
    }

    public final void a() {
        Preconditions.checkState(this.i ^ 1, "Cannot begin capturing. Already released.");
        Preconditions.checkState(this.e ^ 1, "Cannot begin capturing. Already capturing.");
        this.d.c();
        this.e = true;
    }

    public final void a(boolean z) {
        Preconditions.checkState(this.i ^ 1, "Cannot end capturing. Already released.");
        Preconditions.checkState(this.e, "Cannot end capturing. Not currently capturing.");
        if (z) {
            GLES20.glBindFramebuffer(36160, 0);
        }
        this.e = false;
    }

    public final void b() {
        GLES20.glDeleteTextures(1, new int[]{this.c}, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.h}, 0);
        this.i = true;
    }
}
