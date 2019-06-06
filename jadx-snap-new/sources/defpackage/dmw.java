package defpackage;

/* renamed from: dmw */
public final class dmw implements dmv {
    private final gcw a;
    private final abss b;

    public dmw(gcw gcw, abss abss) {
        this.a = gcw;
        this.b = abss;
    }

    public final boolean a() {
        String a = this.a.a();
        return this.b.c() ? (a.equals("https://devsnapchat.appspot.com") || a.endsWith("-dot-devsnapchat.appspot.com")) ? false : true : true;
    }
}
