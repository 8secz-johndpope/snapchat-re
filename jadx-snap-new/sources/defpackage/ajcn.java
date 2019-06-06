package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* renamed from: ajcn */
public final class ajcn {
    public static final ajcn a = new ajcn();
    private final byte b = (byte) 0;

    private ajcn() {
    }

    public final boolean equals(Object obj) {
        return obj == this || (obj instanceof ajcn);
    }

    public final int hashCode() {
        return Objects.hashCode(Byte.valueOf((byte) 0));
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("sampled", false).toString();
    }
}
