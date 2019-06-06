package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.facebook.infer.annotation.ReturnsOwnership;
import defpackage.awg.1;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: awo */
public abstract class awo<BUILDER extends awo<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    private static final awq<Object> e = new 1();
    private static final NullPointerException f = new NullPointerException("No image request was specified!");
    private static final AtomicLong p = new AtomicLong();
    protected Object a = null;
    protected REQUEST b = null;
    public boolean c = false;
    protected axr d = null;
    private final Context g;
    private final Set<awq> h;
    private REQUEST i = null;
    private REQUEST[] j = null;
    private boolean k = true;
    private awq<? super INFO> l = null;
    private awr m = null;
    private boolean n = false;
    private String o = null;

    /* renamed from: awo$2 */
    class 2 implements aui<awf<IMAGE>> {
        private /* synthetic */ Object a;
        private /* synthetic */ Object b;
        private /* synthetic */ int c = 1;

        2(Object obj, Object obj2, int i) {
            this.a = obj;
            this.b = obj2;
        }

        public final /* synthetic */ Object get() {
            return awo.this.a(this.a, this.b, this.c);
        }

        public final String toString() {
            return aug.a(this).a("request", this.a.toString()).toString();
        }
    }

    /* renamed from: awo$1 */
    static class 1 extends awp<Object> {
        1() {
        }

        public final void a(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    protected awo(Context context, Set<awq> set) {
        this.g = context;
        this.h = set;
    }

    protected static String b() {
        return String.valueOf(p.getAndIncrement());
    }

    public abstract awf<IMAGE> a(REQUEST request, Object obj, int i);

    public final awn a() {
        auh.b(true, "Cannot specify both ImageRequest and FirstAvailableImageRequests!");
        auh.b(true, "Cannot specify DataSourceSupplier with other ImageRequests! Use one or the other.");
        awn d = d();
        d.e = false;
        d.f = null;
        d.a = null;
        Set<awq> set = this.h;
        if (set != null) {
            for (awq a : set) {
                d.a(a);
            }
        }
        if (this.c) {
            d.a(e);
        }
        return d;
    }

    public final BUILDER a(axr axr) {
        this.d = axr;
        return this;
    }

    public final BUILDER a(Object obj) {
        this.a = obj;
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final aui<awf<IMAGE>> c() {
        Object obj = this.b;
        aui<awf<IMAGE>> 2 = obj != null ? new 2(obj, this.a, 1) : null;
        return 2 == null ? new 1(f) : 2;
    }

    @ReturnsOwnership
    public abstract awn d();
}
