package com.snap.scan.generator;

import com.google.common.base.Preconditions;
import com.snap.scan.core.SnapScanResult.CodeType;
import defpackage.vsn;
import defpackage.vsp;
import defpackage.vsq;

public class MushroomSnapcodeSVGGeneratorImpl implements vsq {
    private static final boolean a = vsn.a();
    private long b;

    private static native void nativeDestroy(long j);

    private static native String nativeGenerate(long j, byte[] bArr);

    private static native String nativeGenerateBitmojiStyleWithVersion(long j, int i, byte[] bArr);

    private static native String nativeGenerateDotsOnly(long j, byte[] bArr);

    private static native String nativeGenerateDotsOnlyWithVersion(long j, int i, byte[] bArr);

    private static native String nativeGenerateGhostOnly(long j);

    private static native String nativeGenerateWithVersion(long j, int i, byte[] bArr);

    private static native long nativeInstantiate(int i, int i2);

    private static native byte[] nativeMaskData10by10Only(long j, byte[] bArr);

    private static native void nativeSetBorderAndDotColor(long j, int i);

    private static native void nativeSetBorderSize(long j, double d);

    private static native void nativeSetGhostExteriorSVGFileContent(String str);

    private static native void nativeSetGhostInteriorColor(long j, int i);

    private static native void nativeSetGhostInteriorSVGFileContent(String str);

    private static native void nativeSetSize(long j, int i);

    private static native void nativeSetSnapcodeColor(long j, int i);

    public final String a(int i, byte[] bArr) {
        return nativeGenerateWithVersion(this.b, i, bArr);
    }

    public final void a() {
        nativeSetGhostInteriorColor(this.b, 16777215);
    }

    public final void a(double d) {
        nativeSetBorderSize(this.b, d);
    }

    public final void a(CodeType codeType) {
        boolean z = codeType == CodeType.SNAPCODE_10x10 || codeType == CodeType.SNAPCODE_18x18 || codeType == CodeType.SNAPCODE_BITMOJI;
        Preconditions.checkArgument(z);
        if (a) {
            try {
                this.b = nativeInstantiate(100, codeType.ordinal());
                return;
            } catch (UnsatisfiedLinkError e) {
                throw new vsp("native instantiate failed. ", e);
            }
        }
        throw new vsp("Loader load SnapScan failed. ");
    }

    public final String b(int i, byte[] bArr) {
        return nativeGenerateBitmojiStyleWithVersion(this.b, i, bArr);
    }

    public final void b() {
        long j = this.b;
        if (j != 0) {
            nativeDestroy(j);
            this.b = 0;
        }
    }
}
