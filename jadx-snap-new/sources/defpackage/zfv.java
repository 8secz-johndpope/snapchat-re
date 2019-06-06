package defpackage;

/* renamed from: zfv */
final class zfv {
    public static String a(Runnable runnable) {
        String str = null;
        if (runnable instanceof zfu) {
            str = ((zfu) runnable).a;
        } else {
            boolean z = runnable instanceof zft;
        }
        return str == null ? runnable.getClass().getName() : str;
    }
}
