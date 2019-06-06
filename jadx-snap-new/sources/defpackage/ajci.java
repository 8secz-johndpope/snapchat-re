package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* renamed from: ajci */
public final class ajci {
    public static final ajci b = new ajci(ajcm.a, ajcj.a, ajcn.a);
    final ajcn a;
    private final ajcm c;
    private final ajcj d;

    private ajci(ajcm ajcm, ajcj ajcj, ajcn ajcn) {
        this.c = ajcm;
        this.d = ajcj;
        this.a = ajcn;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajci)) {
            return false;
        }
        ajci ajci = (ajci) obj;
        return this.c.equals(ajci.c) && this.d.equals(ajci.d) && this.a.equals(ajci.a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.c, this.d, this.a);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("traceId", this.c).add("spanId", this.d).add("traceOptions", this.a).toString();
    }
}
