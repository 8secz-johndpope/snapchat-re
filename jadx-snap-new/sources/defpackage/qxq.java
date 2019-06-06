package defpackage;

/* renamed from: qxq */
public final class qxq {
    private qxp a = new qxp();
    private qxp b;
    private final ajwo<Boolean> c;

    public qxq() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create()");
        this.c = ajwo;
    }

    public final String a() {
        qxp qxp = this.a;
        if (qxp == null) {
            akcr.a();
        }
        return qxp.a;
    }

    public final aaua b() {
        qxp qxp = this.a;
        if (qxp == null) {
            akcr.a();
        }
        return qxp.b;
    }

    public final void c() {
        this.b = this.a;
        this.a = new qxp();
        this.c.a(Boolean.TRUE);
    }
}
