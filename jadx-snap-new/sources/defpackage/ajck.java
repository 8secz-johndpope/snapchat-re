package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

/* renamed from: ajck */
public final class ajck {
    static final List<ajck> a;
    public static final ajck b = a.OK.a();
    public static final ajck c = a.CANCELLED.a();
    public static final ajck d = a.UNKNOWN.a();
    public static final ajck e = a.INVALID_ARGUMENT.a();
    public static final ajck f = a.DEADLINE_EXCEEDED.a();
    public static final ajck g = a.NOT_FOUND.a();
    public static final ajck h = a.ALREADY_EXISTS.a();
    public static final ajck i = a.PERMISSION_DENIED.a();
    public static final ajck j = a.UNAUTHENTICATED.a();
    public static final ajck k = a.RESOURCE_EXHAUSTED.a();
    public static final ajck l = a.FAILED_PRECONDITION.a();
    public static final ajck m = a.ABORTED.a();
    public static final ajck n = a.OUT_OF_RANGE.a();
    public static final ajck o = a.UNIMPLEMENTED.a();
    public static final ajck p = a.INTERNAL.a();
    public static final ajck q = a.UNAVAILABLE.a();
    public static final ajck r = a.DATA_LOSS.a();
    public final a s;
    public final String t;

    /* renamed from: ajck$a */
    public enum a {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);
        
        final int value;

        private a(int i) {
            this.value = i;
        }

        public final ajck a() {
            return (ajck) ajck.a.get(this.value);
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        a[] values = a.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            a aVar = values[i];
            ajck ajck = (ajck) treeMap.put(Integer.valueOf(aVar.value), new ajck(aVar, null));
            if (ajck == null) {
                i++;
            } else {
                StringBuilder stringBuilder = new StringBuilder("Code value duplication between ");
                stringBuilder.append(ajck.s.name());
                stringBuilder.append(" & ");
                stringBuilder.append(aVar.name());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        a = Collections.unmodifiableList(new ArrayList(treeMap.values()));
    }

    public ajck(a aVar, String str) {
        this.s = (a) Preconditions.checkNotNull(aVar, "canonicalCode");
        this.t = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajck)) {
            return false;
        }
        ajck ajck = (ajck) obj;
        return this.s == ajck.s && Objects.equal(this.t, ajck.t);
    }

    public final int hashCode() {
        return Objects.hashCode(this.s, this.t);
    }

    public final String toString() {
        return MoreObjects.toStringHelper((Object) this).add("canonicalCode", this.s).add("description", this.t).toString();
    }
}
