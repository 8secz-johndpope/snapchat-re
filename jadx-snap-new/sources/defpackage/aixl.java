package defpackage;

import com.google.common.base.MoreObjects;

/* renamed from: aixl */
abstract class aixl extends aivi {
    private final aivi a;

    aixl(aivi aivi) {
        this.a = aivi;
    }

    public final <RequestT, ResponseT> aiuh<RequestT, ResponseT> a(aivm<RequestT, ResponseT> aivm, aiuf aiuf) {
        return this.a.a(aivm, aiuf);
    }

    public final String a() {
        return this.a.a();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", this.a).toString();
    }
}
