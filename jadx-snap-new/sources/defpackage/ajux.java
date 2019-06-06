package defpackage;

/* renamed from: ajux */
public final class ajux {
    public static int a(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
