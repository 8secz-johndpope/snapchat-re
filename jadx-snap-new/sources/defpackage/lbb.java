package defpackage;

import defpackage.mov.b;

/* renamed from: lbb */
public final /* synthetic */ class lbb {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ebk.values().length];
        a = iArr;
        iArr[ebk.PREPARING_CAPTURE_VIDEO.ordinal()] = 1;
        a[ebk.CAPTURING_VIDEO.ordinal()] = 2;
        a[ebk.CAPTURING_VIDEO_WITHOUT_SURFACE_RECORDING.ordinal()] = 3;
        a[ebk.VIDEO_COMPLETING.ordinal()] = 4;
        a[ebk.CAPTURING_PICTURE.ordinal()] = 5;
        a[ebk.READY.ordinal()] = 6;
        a[ebk.REQUESTED.ordinal()] = 7;
        a[ebk.PRESENTING_CAPTURE_RESULT.ordinal()] = 8;
        iArr = new int[b.values().length];
        b = iArr;
        iArr[b.PREVIEW.ordinal()] = 1;
        b[b.PHOTO_CAPTURE.ordinal()] = 2;
        b[b.VIDEO_RECORDING.ordinal()] = 3;
    }
}
