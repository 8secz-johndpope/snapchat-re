package defpackage;

/* renamed from: ems */
public final /* synthetic */ class ems {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[edl.values().length];
        a = iArr;
        iArr[edl.NOT_INIT.ordinal()] = 1;
        a[edl.CAMERA_OPEN_FAILURE.ordinal()] = 2;
        a[edl.PERMISSION_NOT_GRANTED.ordinal()] = 3;
        a[edl.CAMERA_DISABLED.ordinal()] = 4;
        a[edl.PERMISSION_NONE.ordinal()] = 5;
        a[edl.START_PREVIEW_FAILURE.ordinal()] = 6;
        iArr = new int[eca.values().length];
        b = iArr;
        iArr[eca.CAMERA1.ordinal()] = 1;
        b[eca.CAMERA2.ordinal()] = 2;
        b[eca.ARCORE.ordinal()] = 3;
        b[eca.UNDEFINED.ordinal()] = 4;
        iArr = new int[ebx.values().length];
        c = iArr;
        iArr[ebx.FRONT_FACING.ordinal()] = 1;
        c[ebx.BACK_FACING.ordinal()] = 2;
        c[ebx.NONE.ordinal()] = 3;
        iArr = new int[edi.values().length];
        d = iArr;
        iArr[edi.BACKGROUND.ordinal()] = 1;
        d[edi.MAIN.ordinal()] = 2;
        d[edi.VIDEONOTE.ordinal()] = 3;
        d[edi.VIDEOCHAT.ordinal()] = 4;
    }
}
