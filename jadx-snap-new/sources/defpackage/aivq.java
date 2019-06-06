package defpackage;

import com.google.common.base.MoreObjects;
import defpackage.aiuh.a;

/* renamed from: aivq */
abstract class aivq<RespT> extends a<RespT> {
    aivq() {
    }

    public abstract a<?> a();

    public void a(aivw aivw, aivl aivl) {
        a().a(aivw, aivl);
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", a()).toString();
    }
}
