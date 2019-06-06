package defpackage;

/* renamed from: vsn */
public final class vsn {
    private static boolean a;
    private static boolean b;

    public static synchronized boolean a() {
        synchronized (vsn.class) {
            if (a) {
                boolean z = b;
                return z;
            }
            a = true;
            try {
                System.loadLibrary("c++_shared");
                System.loadLibrary("opencv");
                System.loadLibrary("snapscan");
                b = true;
                return true;
            } catch (SecurityException | UnsatisfiedLinkError e) {
                if (!(e.getMessage() == null || e.getMessage().contains("snapscan") || e.getMessage().contains("c++_shared"))) {
                    e.getMessage().contains("opencv");
                }
                b = false;
                return false;
            }
        }
    }
}
