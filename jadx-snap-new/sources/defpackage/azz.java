package defpackage;

/* renamed from: azz */
public final class azz {
    private static boolean a;

    public static synchronized void a() {
        synchronized (azz.class) {
            if (!a) {
                System.loadLibrary("static-webp");
                a = true;
            }
        }
    }
}
