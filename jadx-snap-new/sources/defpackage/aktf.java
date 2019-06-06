package defpackage;

import java.io.Serializable;
import java.util.Locale;

/* renamed from: aktf */
public abstract class aktf implements Serializable {
    public abstract akqz a();

    public final String a(Locale locale) {
        return a().a(b(), locale);
    }

    public abstract long b();

    public final String b(Locale locale) {
        return a().b(b(), locale);
    }

    /* Access modifiers changed, original: protected */
    public akqx c() {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public final int d() {
        return a().a(b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aktf)) {
            return false;
        }
        aktf aktf = (aktf) obj;
        return d() == aktf.d() && a().a().equals(aktf.a().a()) && aktl.a(c(), aktf.c());
    }

    public int hashCode() {
        return ((d() * 17) + a().a().hashCode()) + c().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Property[");
        stringBuilder.append(a().b());
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
