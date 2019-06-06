package defpackage;

import defpackage.fth.a;
import java.util.Objects;

/* renamed from: hxe */
final class hxe implements fth {
    private String a;

    hxe(String str) {
        this.a = str;
    }

    public final a<?> a() {
        return a.a("");
    }

    public final ftg b() {
        return ftg.AB_PLATFORM;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((hxe) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a});
    }

    public final String name() {
        return this.a;
    }

    public final String toString() {
        return name();
    }
}
