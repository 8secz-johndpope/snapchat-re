package defpackage;

/* renamed from: abyp */
public final class abyp {

    /* renamed from: abyp$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[aesf.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.aesf.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.aesf.MALIBU_SOUND;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.aesf.MALIBU_NO_SOUND;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.aesf.SCREAMINGMANTIS;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abyp$1.<clinit>():void");
        }
    }

    public static boolean a(int i) {
        if (!(i == 1 || i == 2 || i == 5 || i == 6 || i == 9 || i == 17 || i == 18)) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean a(aesf aesf) {
        return abyp.a(aesf.a());
    }

    public static boolean b(int i) {
        return i == 7;
    }

    public static boolean b(aesf aesf) {
        return abyp.c(aesf.a());
    }

    public static boolean c(int i) {
        return i == 0 || i == 16 || i == 10 || i == 11;
    }

    public static boolean c(aesf aesf) {
        return abyp.d(aesf.a());
    }

    public static boolean d(int i) {
        return i == 1 || i == 5 || i == 9 || i == 12 || i == 14 || i == 17;
    }

    public static boolean d(aesf aesf) {
        return abyp.e(aesf.a());
    }

    public static boolean e(int i) {
        return i == 2 || i == 6 || i == 13 || i == 15 || i == 18;
    }

    public static boolean e(aesf aesf) {
        return abyp.f(aesf.a());
    }

    public static boolean f(int i) {
        return i == 10 || i == 11 || i == 16;
    }

    public static boolean f(aesf aesf) {
        return abyp.f(aesf.a()) || abyp.g(aesf.a());
    }

    public static boolean g(int i) {
        if (!(i == 5 || i == 6 || i == 17 || i == 18)) {
            switch (i) {
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static boolean g(aesf aesf) {
        int a = aesf.a();
        if (!abyp.h(a)) {
            return (a == 10 ? 1 : null) != null || abyp.j(a);
        }
    }

    public static boolean h(int i) {
        return i == 5 || i == 6;
    }

    public static boolean h(aesf aesf) {
        int i = 1.a[aesf.ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public static boolean i(int i) {
        return abyp.f(i) || abyp.g(i);
    }

    public static boolean j(int i) {
        switch (i) {
            case 16:
            case 17:
            case 18:
                return true;
            default:
                return false;
        }
    }

    public static String k(int i) {
        switch (i) {
            case 1:
                return "VIDEO";
            case 2:
                return "VIDEO_NO_SOUND";
            case 4:
                return "DISCOVER";
            case 5:
                return "VIDEO_SOUND_LAGUNA";
            case 6:
                return "VIDEO_NO_SOUND_LAGUNA";
            case 7:
                return "GIF";
            case 9:
                return "AUDIO_STITCH";
            case 10:
                return "PSYCHOMANTIS";
            case 11:
                return "SCREAMINGMANTIS";
            case 12:
                return "MALIBU_SOUND";
            case 13:
                return "MALIBU_NO_SOUND";
            case 14:
                return "LAGUNAHD_SOUND";
            case 15:
                return "LAGUNAHD_NO_SOUND";
            case 16:
                return "GHOSTMANTIS";
            case 17:
                return "NEWPORT_SOUND";
            case 18:
                return "NEWPORT_NO_SOUND";
            default:
                return "IMAGE";
        }
    }
}
