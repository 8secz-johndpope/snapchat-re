package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: hnw */
public final class hnw {
    public final List<hjd> a = new ArrayList();
    public final ajwo<Boolean> b;
    public hjd c;

    public hnw() {
        Object ajwo = new ajwo();
        akcr.a(ajwo, "PublishSubject.create<Boolean>()");
        this.b = ajwo;
        this.c = hje.f;
    }

    public final int a(hjd hjd) {
        akcr.b(hjd, "section");
        return this.a.indexOf(hjd);
    }

    public final void a(hjd hjd, hjd hjd2) {
        akcr.b(hjd, "sectionToInsert");
        akcr.b(hjd2, "insertBefore");
        int indexOf = this.a.indexOf(hjd2);
        if (indexOf >= 0) {
            this.a.add(indexOf, hjd);
        }
    }

    public final int b(hjd hjd, hjd hjd2) {
        return this.a.indexOf(hjd) - this.a.indexOf(hjd2);
    }

    public final void b(hjd hjd) {
        akcr.b(hjd, "section");
        if (hjd.equals(this.c)) {
            int indexOf = this.a.indexOf(hjd);
            this.c = indexOf > 0 ? (hjd) this.a.get(indexOf - 1) : hje.f;
        }
        this.a.remove(hjd);
    }

    public final void c(hjd hjd) {
        akcr.b(hjd, "section");
        if (b(hjd, this.c) > 0) {
            this.b.a(Boolean.TRUE);
        } else {
            hjd = this.c;
        }
        this.c = hjd;
    }
}
