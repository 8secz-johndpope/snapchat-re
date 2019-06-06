package defpackage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.content.Context;
import com.google.common.base.Predicate;

/* renamed from: sni */
public class sni extends sno {
    public static final Predicate<sqh> a = new 1();

    /* renamed from: sni$1 */
    static class 1 implements Predicate<sqh> {
        1() {
        }

        public final /* synthetic */ boolean apply(Object obj) {
            return ((sjv) ((sqh) obj).a(sqh.bw)) == sjv.HIDE_ON_MEDIA_DISPLAYED;
        }
    }

    /* renamed from: sni$2 */
    class 2 extends abtx {
        2() {
        }

        public final void onAnimationEnd(Animator animator) {
            sni.this.d.setVisibility(8);
        }
    }

    sni(Context context) {
        super(context);
    }

    public final void a_(szw szw) {
        super.a_(szw);
        if (szw.a(skb.k, false)) {
            if (this.f != null) {
                this.f.cancel();
                this.f = null;
            }
            sqa sqa = (sqa) this.I.a(sqh.bl);
            if (sqa == sqa.LOADED || sqa == sqa.PREPARING) {
                if (this.F != sjo.STARTED) {
                    this.d.setVisibility(8);
                } else if (this.f == null) {
                    a((AnimatorListener) new 2());
                }
                this.b = sjn.FULLY_DISPLAYED;
                n();
                m();
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void m() {
        sqa sqa = (sqa) this.I.a(sqh.bl);
        if (this.f != null) {
            this.f.cancel();
            this.f = null;
        }
        if (this.g != null) {
            this.g.cancel();
            this.g = null;
        }
        if (sqa == sqa.RETRYABLE_ERROR) {
            o();
        } else {
            a((Float) this.I.a(sqh.bm));
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void n() {
        z().m();
    }
}
