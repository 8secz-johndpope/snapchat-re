package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import defpackage.aiuk.a;
import java.util.List;

/* renamed from: aivh */
public abstract class aivh {

    /* renamed from: aivh$a */
    public static abstract class a {
        public abstract aivh a(b bVar);
    }

    /* renamed from: aivh$d */
    public static abstract class d {
        public abstract aiuf a();

        public abstract aivl b();

        public abstract aivm<?, ?> c();
    }

    /* renamed from: aivh$b */
    public static abstract class b {
        public e a(List<aiuw> list, aiud aiud) {
            throw new UnsupportedOperationException();
        }

        public abstract void a(aiuo aiuo, f fVar);

        public void a(e eVar, List<aiuw> list) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: aivh$c */
    public static final class c {
        public static final c a = new c(null, aivw.b, false);
        public final e b;
        public final a c = null;
        public final aivw d;
        public final boolean e;

        public c(e eVar, aivw aivw, boolean z) {
            this.b = eVar;
            this.d = (aivw) Preconditions.checkNotNull(aivw, "status");
            this.e = z;
        }

        public static c a(e eVar) {
            return new c((e) Preconditions.checkNotNull(eVar, "subchannel"), aivw.b, false);
        }

        public static c a(aivw aivw) {
            Preconditions.checkArgument(aivw.b() ^ 1, "error status shouldn't be OK");
            return new c(null, aivw, false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Objects.equal(this.b, cVar.b) && Objects.equal(this.d, cVar.d) && Objects.equal(null, null) && this.e == cVar.e;
        }

        public final int hashCode() {
            return Objects.hashCode(this.b, this.d, null, Boolean.valueOf(this.e));
        }

        public final String toString() {
            return MoreObjects.toStringHelper((Object) this).add("subchannel", this.b).add("streamTracerFactory", null).add("status", this.d).add("drop", this.e).toString();
        }
    }

    /* renamed from: aivh$e */
    public static abstract class e {
        public abstract void a();

        public abstract void b();

        public List<aiuw> c() {
            throw new UnsupportedOperationException();
        }

        public abstract aiud d();
    }

    /* renamed from: aivh$f */
    public static abstract class f {
        public abstract c a(d dVar);
    }

    public abstract void a();

    public abstract void a(e eVar, aiup aiup);

    public abstract void a(aivw aivw);

    public abstract void a(List<aiuw> list, aiud aiud);

    public String toString() {
        return getClass().getSimpleName();
    }
}
