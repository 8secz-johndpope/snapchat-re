package defpackage;

/* renamed from: acvd */
public final class acvd {
    final float[] a;

    public acvd(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (fArr == null || fArr.length < 8) {
            StringBuilder stringBuilder = new StringBuilder("Invalid storage array: ");
            stringBuilder.append(fArr == null ? -1 : fArr.length);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        this.a = fArr;
    }
}
