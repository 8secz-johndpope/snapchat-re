package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;

/* renamed from: akcm */
public final class akcm implements akcl, akei<Object> {
    private final Class<?> a;

    public akcm(Class<?> cls) {
        akcr.b(cls, "jClass");
        this.a = cls;
    }

    private static Void c() {
        throw new akbj();
    }

    public final Class<?> a() {
        return this.a;
    }

    public final String b() {
        akcm.c();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof akcm) && akcr.a(akbi.a(this), akbi.a((akei) obj));
    }

    public final List<Annotation> getAnnotations() {
        akcm.c();
        throw null;
    }

    public final int hashCode() {
        return akbi.a(this).hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}
