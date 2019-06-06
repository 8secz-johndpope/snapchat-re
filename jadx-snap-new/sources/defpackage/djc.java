package defpackage;

/* renamed from: djc */
public abstract class djc {
    public static boolean a(aajt aajt) {
        return aajt.getPerEventSamplingRate() < 1.0d && Math.random() > aajt.getPerEventSamplingRate();
    }

    public abstract boolean a(aajt aajt, zym zym);
}
