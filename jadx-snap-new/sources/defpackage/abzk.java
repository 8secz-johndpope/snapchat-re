package defpackage;

/* renamed from: abzk */
public enum abzk {
    REGULAR(0),
    BIGTEXT(1),
    BIGTEXT_CENTER(2),
    BIGTEXT_RIGHT(3);
    
    public final int type;

    /* renamed from: abzk$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = defpackage.abzk.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.abzk.REGULAR;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.abzk.BIGTEXT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.abzk.BIGTEXT_CENTER;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = defpackage.abzk.BIGTEXT_RIGHT;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.abzk$1.<clinit>():void");
        }
    }

    private abzk(int i) {
        this.type = i;
    }

    public static boolean a(int i) {
        return i == BIGTEXT.type || i == BIGTEXT_CENTER.type || i == BIGTEXT_RIGHT.type;
    }

    public final int a() {
        return this.type;
    }

    public final String toString() {
        int i = 1.a[ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "BIG_TEXT_RIGHT" : "BIG_TEXT_CENTER" : "BIG_TEXT" : "DEFAULT";
    }
}
