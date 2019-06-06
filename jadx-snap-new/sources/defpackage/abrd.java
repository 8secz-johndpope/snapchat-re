package defpackage;

@Deprecated
/* renamed from: abrd */
public enum abrd {
    BARELY_WORKING(0),
    LOW_END(1),
    MID_END(2),
    HIGH_END(3),
    UNKNOWN_CLASS(10);
    
    private final int mDeviceClassValue;

    private abrd(int i) {
        this.mDeviceClassValue = i;
    }
}
