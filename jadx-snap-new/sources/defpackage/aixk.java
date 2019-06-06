package defpackage;

import com.google.common.base.MoreObjects;
import defpackage.aiyd.a;
import java.util.concurrent.Executor;

/* renamed from: aixk */
abstract class aixk implements aiwx {
    aixk() {
    }

    public aiws a(aivm<?, ?> aivm, aivl aivl, aiuf aiuf) {
        return a().a(aivm, aivl, aiuf);
    }

    public abstract aiwx a();

    public final Runnable a(a aVar) {
        return a().a(aVar);
    }

    public final void a(aivw aivw) {
        a().a(aivw);
    }

    public final void a(aiwu.a aVar, Executor executor) {
        a().a(aVar, executor);
    }

    public final aivc b() {
        return a().b();
    }

    public final void b(aivw aivw) {
        a().b(aivw);
    }

    public final aiud c() {
        return a().c();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", a()).toString();
    }
}
