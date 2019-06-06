package defpackage;

/* renamed from: ains */
public final class ains {
    public static final int a(int i, int i2) {
        int a = akdp.a((float) Math.pow(10.0d, 0.0d));
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 + i;
            if (i5 <= a) {
                return (i3 + 2) + ((i - 1) << 1);
            }
            i4++;
            int a2 = akdp.a((float) Math.pow(10.0d, (double) i4));
            i3 += (i4 + 1) * (Math.min(a2, i5) - Math.max(a, Math.min(a2, i2)));
            a = a2;
        }
    }
}
