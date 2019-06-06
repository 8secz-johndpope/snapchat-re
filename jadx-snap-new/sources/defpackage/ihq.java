package defpackage;

/* renamed from: ihq */
public final class ihq {
    public static long a(String str) {
        try {
            r3 = new int[4];
            int i = 0;
            r3[0] = 48;
            r3[1] = 40;
            r3[2] = 32;
            r3[3] = 0;
            String[] split = str.split("\\.");
            long j = 0;
            while (i < split.length && i < 4) {
                j |= Long.parseLong(split[i]) << r3[i];
                i++;
            }
            return j;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
