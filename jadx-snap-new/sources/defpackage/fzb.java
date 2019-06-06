package defpackage;

import android.os.Looper;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import defpackage.akgx.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: fzb */
public abstract class fzb {

    /* renamed from: fzb$1 */
    static class 1 implements ifk {
        private /* synthetic */ Optional a;

        1(Optional optional) {
            this.a = optional;
        }

        public final void a(Throwable th, idd idd) {
            ((gqr) this.a.get()).a(gqt.NORMAL, th, idd, idd.a());
        }
    }

    static a a(Optional<a> optional, aipn<ryw<ryz>> aipn, Set<glu> set) {
        if (optional.isPresent()) {
            return (a) optional.get();
        }
        ajdw a = zfw.a.a((ajdw) zgb.a(iew.a.callsite("retrofit")).f(), 2);
        a.getClass();
        return gmh.a((aipn) aipn, (Set) set, new -$$Lambda$SkrnmYFYiSMhvRvxSpW57YzpUjo(a));
    }

    static gpf a(ajwy<ilv> ajwy, zfl zfl) {
        -$$Lambda$fzb$T4VuV3MybgpF8CpOQAAVfpUJhLo -__lambda_fzb_t4vuv3mybgpf8cpoqaavfpujhlo = new -$$Lambda$fzb$T4VuV3MybgpF8CpOQAAVfpUJhLo(zfl);
        Supplier supplier = zgd.e;
        supplier.getClass();
        return new gpf(ImmutableSet.of(-__lambda_fzb_t4vuv3mybgpf8cpoqaavfpujhlo, new -$$Lambda$S9mTnZmUVZlw33KrxWjGnrjeZNQ(supplier)), ajwy);
    }

    static rys<ryz, glv, glq> a(ajwy<ftl> ajwy, ajwy<glt> ajwy2, ajwy<gls> ajwy3, glh glh) {
        Object obj;
        ArrayList newArrayList = Lists.newArrayList();
        if (glh.a()) {
            obj = ajwy2.get();
        } else {
            newArrayList.add(new glc());
            obj = new glx(rzf.a.UPLOAD, 2);
        }
        newArrayList.add(obj);
        newArrayList.add(new glj(new -$$Lambda$fzb$opk714SExHweBmOEToOsEHdmw7g(ajwy), new -$$Lambda$fzb$1EODa3eNfhpSBB33l71c7bxOapg(((Boolean) glh.a.get()).booleanValue() ? (rzo.a) ajwy3.get() : new glx(rzf.a.LARGE_MEDIA, 3))));
        newArrayList.add(new glx(rzf.a.SMALL_MEDIA, 10));
        newArrayList.add(new gld());
        return new rzo(newArrayList);
    }

    static rzw a(Executor executor, List<saa> list, gme gme, ihh ihh, rxh rxh) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            sbo.a aVar = new sbo.a(executor, ihh);
            aVar.b.addAll(list);
            aVar.a = (rzy) Preconditions.checkNotNull(gme);
            aVar.f = (rzu.a) Preconditions.checkNotNull(rxh);
            aVar.d = (sbw) Preconditions.checkNotNull(sbx.a("Network"));
            return new sbo(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, (byte) 0);
        }
        throw new IllegalStateException("Please ensure network library loads on a background thread.");
    }
}
