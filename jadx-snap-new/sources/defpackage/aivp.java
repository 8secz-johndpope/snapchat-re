package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: aivp */
abstract class aivp<ReqT, RespT> extends aiuh<ReqT, RespT> {
    aivp() {
    }

    public void a() {
        b().a();
    }

    public void a(int i) {
        b().a(i);
    }

    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    public abstract aiuh<?, ?> b();

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", b()).toString();
    }
}
