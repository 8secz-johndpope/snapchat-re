package defpackage;

import com.google.common.base.MoreObjects;
import java.io.InputStream;

/* renamed from: aixi */
abstract class aixi implements aiws {
    aixi() {
    }

    public abstract aiws a();

    public final void a(int i) {
        a().a(i);
    }

    public final void a(aium aium) {
        a().a(aium);
    }

    public final void a(aius aius) {
        a().a(aius);
    }

    public final void a(aiuu aiuu) {
        a().a(aiuu);
    }

    public final void a(aivw aivw) {
        a().a(aivw);
    }

    public void a(aiwt aiwt) {
        a().a(aiwt);
    }

    public final void a(InputStream inputStream) {
        a().a(inputStream);
    }

    public final void a(String str) {
        a().a(str);
    }

    public final void b(int i) {
        a().b(i);
    }

    public final void c(int i) {
        a().c(i);
    }

    public final void d() {
        a().d();
    }

    public final void f() {
        a().f();
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("delegate", a()).toString();
    }
}
