package defpackage;

/* renamed from: akma */
public final class akma {
    public static void a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, new Object[]{Long.valueOf(j)}));
        }
    }
}
