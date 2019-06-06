package defpackage;

import com.looksery.sdk.DeviceClass;

/* renamed from: mos */
public final /* synthetic */ class mos {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeviceClass.values().length];
        a = iArr;
        iArr[DeviceClass.HIGH_END.ordinal()] = 1;
        a[DeviceClass.MID_END.ordinal()] = 2;
        a[DeviceClass.LOW_END.ordinal()] = 3;
        a[DeviceClass.BARELY_WORKING.ordinal()] = 4;
    }
}
