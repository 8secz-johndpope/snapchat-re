package defpackage;

/* renamed from: saf */
public final class saf {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[]{1, 2, 3};
        d = iArr;
    }

    public static int[] a() {
        return (int[]) d.clone();
    }
}
