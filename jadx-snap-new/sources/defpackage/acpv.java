package defpackage;

import android.util.Pair;
import defpackage.alhh.a;
import java.util.List;
import java.util.Set;

/* renamed from: acpv */
public interface acpv {

    /* renamed from: acpv$a */
    public static class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.d = str3;
            this.c = str4;
        }
    }

    /* renamed from: acpv$b */
    public static class b {
        public boolean a;
        public boolean b;

        public b(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a == this.a && bVar.b == this.b;
        }

        public final int hashCode() {
            return ((this.a + 527) * 31) + (this.b ? 2 : 0);
        }
    }

    acqf a(String str);

    void a(acqf acqf);

    void a(List<alhj> list);

    boolean a();

    boolean a(int i);

    boolean a(a aVar);

    boolean a(String str, long j);

    acqf b(String str);

    Set<acqg> b();

    void b(List<aljr> list);

    boolean b(acqf acqf);

    List<acqf> c(List<acqf> list);

    void c();

    void c(String str);

    void d();

    void d(String str);

    Pair<List<acqf>, Integer> e();

    boolean e(String str);

    b f(String str);

    List<acqf> f();

    int g(String str);

    List<acqf> g();

    void h();

    boolean i();

    void j();
}
