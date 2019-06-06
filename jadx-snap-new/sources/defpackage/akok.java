package defpackage;

/* renamed from: akok */
final class akok {
    static akok e;
    private static akok k;
    private static akok l;
    boolean a = true;
    boolean b = false;
    boolean c = false;
    int d;
    private boolean f = true;
    private boolean g = false;
    private boolean h = true;
    private boolean i = true;
    private boolean j = true;

    static {
        akok akok = new akok();
        k = akok;
        akok.f = true;
        akok = k;
        akok.a = false;
        akok.g = false;
        akok.b = false;
        akok.c = true;
        akok.h = false;
        akok.i = false;
        akok.d = 0;
        akok = new akok();
        e = akok;
        akok.f = true;
        akok = e;
        akok.a = true;
        akok.g = false;
        akok.b = false;
        akok.c = false;
        k.d = 1;
        akok = new akok();
        l = akok;
        akok.f = false;
        akok = l;
        akok.a = true;
        akok.g = false;
        akok.b = true;
        akok.c = false;
        akok.j = false;
        akok.d = 2;
    }

    akok() {
    }

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public final String a(Class cls) {
        return a(cls, cls.getName(), this.f);
    }

    /* Access modifiers changed, original: final */
    public final String a(Class cls, String str, boolean z) {
        if (cls == null) {
            return "ANONYMOUS";
        }
        if (!cls.isArray()) {
            return z ? akok.a(str).replace('$', '.') : str.replace('$', '.');
        } else {
            cls = cls.getComponentType();
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(a(cls, cls.getName(), z));
            stringBuffer.append("[]");
            return stringBuffer.toString();
        }
    }

    public final void a(StringBuffer stringBuffer, Class[] clsArr) {
        for (int i = 0; i < clsArr.length; i++) {
            if (i > 0) {
                stringBuffer.append(ppy.d);
            }
            stringBuffer.append(a(clsArr[i]));
        }
    }
}
