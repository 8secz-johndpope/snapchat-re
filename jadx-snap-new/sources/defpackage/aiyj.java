package defpackage;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import defpackage.aivh.d;

/* renamed from: aiyj */
final class aiyj extends d {
    private final aiuf a;
    private final aivl b;
    private final aivm<?, ?> c;

    aiyj(aivm<?, ?> aivm, aivl aivl, aiuf aiuf) {
        this.c = (aivm) Preconditions.checkNotNull(aivm, "method");
        this.b = (aivl) Preconditions.checkNotNull(aivl, "headers");
        this.a = (aiuf) Preconditions.checkNotNull(aiuf, "callOptions");
    }

    public final aiuf a() {
        return this.a;
    }

    public final aivl b() {
        return this.b;
    }

    public final aivm<?, ?> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aiyj aiyj = (aiyj) obj;
            return Objects.equal(this.a, aiyj.a) && Objects.equal(this.b, aiyj.b) && Objects.equal(this.c, aiyj.c);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.a, this.b, this.c);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[method=");
        stringBuilder.append(this.c);
        stringBuilder.append(" headers=");
        stringBuilder.append(this.b);
        stringBuilder.append(" callOptions=");
        stringBuilder.append(this.a);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
