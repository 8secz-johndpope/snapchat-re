package defpackage;

/* renamed from: ajzw */
public final class ajzw {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    private static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[]{1, 2, 3, 4};
        e = iArr;
    }

    public static int[] a() {
        return (int[]) e.clone();
    }
}
