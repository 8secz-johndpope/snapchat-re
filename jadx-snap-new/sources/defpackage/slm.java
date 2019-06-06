package defpackage;

import android.view.ViewParent;
import com.google.common.base.MoreObjects;
import defpackage.szb.c;
import defpackage.tas.a;

/* renamed from: slm */
public abstract class slm extends slk {
    private static final a a = new a(-1, -1);
    public sit G;
    public sqh H = new sqh();
    public szw I = new szw();
    protected final szl J = new szl(f(), this);
    public boolean K;
    private sju b;
    private siw c;

    public final sit A() {
        sit sit = this.G;
        if (sit != null) {
            return sit;
        }
        throw new IllegalStateException("You cannot access context if it has not been attached");
    }

    /* renamed from: A_ */
    public a j() {
        return a;
    }

    public final szb B() {
        if (!this.K) {
            return null;
        }
        for (ViewParent parent = e().getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof szb) {
                return (szb) parent;
            }
        }
        return null;
    }

    public void B_() {
        this.G = null;
        this.b = null;
        this.K = false;
        this.c = null;
    }

    public final skh C() {
        return A().b.d;
    }

    public final siw D() {
        if (this.c == null) {
            this.c = A().b.b;
        }
        return this.c;
    }

    public sjn E() {
        return sjn.FULLY_DISPLAYED;
    }

    public boolean F() {
        return true;
    }

    public boolean G() {
        return false;
    }

    public boolean H() {
        return false;
    }

    public void a(float f) {
    }

    public void a(float f, float f2) {
    }

    public void a(sit sit, sju sju) {
        this.G = sit;
        this.b = sju;
        this.K = true;
    }

    public void a(sqh sqh, szw szw) {
        this.H = sqh;
        this.I = szw;
    }

    public void a(c cVar) {
    }

    public void a(szj szj) {
    }

    /* Access modifiers changed, original: protected */
    public void b() {
        super.b();
        this.J.a();
    }

    public void b(float f) {
    }

    public abvp k() {
        return null;
    }

    public abvb l() {
        return null;
    }

    public String toString() {
        return MoreObjects.toStringHelper((Object) this).add("page", this.H).add("view", e()).toString();
    }

    /* Access modifiers changed, original: final */
    public final void u() {
        this.H = new sqh();
        this.I = szw.cY;
    }

    public final sqh w() {
        return this.H;
    }

    public final szw x() {
        return this.I;
    }

    public final boolean y() {
        return this.K;
    }

    public final sju z() {
        sju sju = this.b;
        if (sju != null) {
            return sju;
        }
        throw new IllegalStateException("You cannot access parent if it has not been attached");
    }
}
