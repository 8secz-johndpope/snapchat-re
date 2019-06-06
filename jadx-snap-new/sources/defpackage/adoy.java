package defpackage;

import com.snap.core.db.column.SnapServerStatus;

/* renamed from: adoy */
public final class adoy {
    public static final String a(aenb aenb) {
        akcr.b(aenb, "receiver$0");
        StringBuilder stringBuilder = new StringBuilder("GenericSnap[id=");
        stringBuilder.append(aenb.O);
        stringBuilder.append(", from=");
        stringBuilder.append(aenb.a);
        stringBuilder.append(", status=");
        stringBuilder.append(SnapServerStatus.parseFromSnap(aenb));
        stringBuilder.append(", timestamp=");
        stringBuilder.append(aenb.S);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public static final boolean a(aenb aenb, String str, String str2) {
        akcr.b(aenb, "receiver$0");
        akcr.b(str, "myUsername");
        akcr.b(str2, "friendUsername");
        return aenb.a != null ? akcr.a((Object) str, aenb.a) : akcr.a((Object) str2, aenb.n);
    }

    public static final String b(aenb aenb) {
        akcr.b(aenb, "receiver$0");
        Object obj = aenb.O;
        akcr.a(obj, "id");
        return qwh.a(obj);
    }

    public static final Long c(aenb aenb) {
        akcr.b(aenb, "receiver$0");
        return aenb.S;
    }

    public static final Long d(aenb aenb) {
        akcr.b(aenb, "receiver$0");
        return aenb.R;
    }

    public static final Integer e(aenb aenb) {
        akcr.b(aenb, "receiver$0");
        return aenb.Q;
    }
}
