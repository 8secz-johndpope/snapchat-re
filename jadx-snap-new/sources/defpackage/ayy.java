package defpackage;

/* renamed from: ayy */
public final class ayy {
    private static boolean a;
    private static ayx b;

    public static ayx a(avn avn, atw atw, avq<auz, avb> avq) {
        if (!a) {
            try {
                b = (ayx) Class.forName("com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl").getConstructor(new Class[]{avn.class, atw.class, avq.class}).newInstance(new Object[]{avn, atw, avq});
            } catch (Throwable unused) {
            }
            if (b != null) {
                a = true;
            }
        }
        return b;
    }
}
