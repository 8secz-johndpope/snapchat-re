package defpackage;

import org.joda.convert.ToString;

/* renamed from: aksc */
public abstract class aksc extends akse implements akru {
    protected aksc() {
    }

    public final int a(akra akra) {
        if (akra != null) {
            return akra.a(c()).a(b());
        }
        throw new IllegalArgumentException("The DateTimeFieldType must not be null");
    }

    public final int d() {
        return c().E().a(b());
    }

    public final int e() {
        return c().C().a(b());
    }

    public final int f() {
        return c().u().a(b());
    }

    public final int g() {
        return c().m().a(b());
    }

    public final int h() {
        return c().e().a(b());
    }

    @ToString
    public String toString() {
        return super.toString();
    }
}
