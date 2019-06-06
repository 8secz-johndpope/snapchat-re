package defpackage;

import defpackage.acvm.a;
import defpackage.acvm.b;

/* renamed from: acwo */
public abstract class acwo {
    public acvm a;
    acua b;
    final String c;
    public boolean d;

    /* renamed from: acwo$1 */
    class 1 implements a {
        1() {
        }

        public final int a(acvr acvr, String str) {
            return 1;
        }

        public final acua a() {
            return acwo.this.b;
        }

        public final boolean a(acvr acvr) {
            return false;
        }

        public final String b() {
            StringBuilder stringBuilder = new StringBuilder("ext-");
            stringBuilder.append(acwo.this.c);
            return stringBuilder.toString();
        }
    }

    protected acwo(String str) {
        this.c = str;
    }

    public abstract acua a();

    public final void a(aclg aclg, double d, double d2) {
        if (this.b == null) {
            this.b = a();
        }
        acvm acvm = this.a;
        if (acvm == null) {
            b bVar = new b();
            bVar.b = d;
            bVar.a = d2;
            bVar.c = this.c;
            bVar.f = 2;
            bVar.d = new 1();
            bVar.g = false;
            this.a = bVar.c();
            aclg.f.a(this.a);
            this.d = true;
            return;
        }
        acvm.c = d;
        acvm.d = d2;
        aclg.f.i();
    }
}
