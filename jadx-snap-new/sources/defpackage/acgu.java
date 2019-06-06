package defpackage;

import com.google.auto.value.AutoValue;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import defpackage.acgt.a;

@AutoValue
/* renamed from: acgu */
public abstract class acgu<T extends achg> {

    /* renamed from: acgu$a */
    public static abstract class a<T extends achg> {
        private static achr b(acis acis) {
            if (acis.equals(acis.a)) {
                return achr.LEFT_TO_RIGHT;
            }
            if (acis.equals(acis.b)) {
                return achr.RIGHT_TO_LEFT;
            }
            if (acis.equals(acis.c)) {
                return achr.TOP_TO_BOTTOM;
            }
            if (acis.equals(acis.d)) {
                return achr.BOTTOM_TO_TOP;
            }
            if (acis.equals(acis.e)) {
                return achr.LEFT_TO_RIGHT;
            }
            throw new RuntimeException("Unimplemented default input gesture for output transition, please specify an input gesture");
        }

        public abstract a<T> a(acgw acgw);

        public abstract a<T> a(T t);

        public abstract a<T> a(achr achr);

        public abstract a<T> a(acis acis);

        public abstract a<T> a(boolean z);

        public abstract achr a();

        public abstract a<T> b(T t);

        public abstract acis b();

        public abstract acgu<T> c();

        public final acgu<T> d() {
            if (a() == null) {
                a(a.b(b()));
            }
            acgu c = c();
            Preconditions.checkState(c.h() != null);
            return c;
        }
    }

    public static <U extends achg> acgu<U> a(achr achr, acis acis, U u) {
        return acgu.k().a(acgw.DISMISS).a(achr).a(acis).a((achg) u).a(true).d();
    }

    public static <U extends achg> acgu<U> a(achr achr, acis acis, U u, boolean z) {
        return acgu.k().a(acgw.PRESENT).a(achr).a(acis).a(null).b((achg) u).a(z).d();
    }

    public static <U extends achg> acgu<U> a(acis acis, U u) {
        return acgu.k().a(acgw.PRESENT).a(acis).a(null).b((achg) u).a(true).d();
    }

    public static <U extends achg> acgu<U> a(acis acis, U u, boolean z) {
        return acgu.k().a(acgw.PRESENT).a(acis).b((achg) u).a(z).d();
    }

    public static <U extends achg> acgu<U> b(acis acis, U u) {
        return acgu.b(acis, u, true);
    }

    public static <U extends achg> acgu<U> b(acis acis, U u, boolean z) {
        return acgu.k().a(acgw.DISMISS).a(acis).a((achg) u).a(z).d();
    }

    public static <U extends achg> a<U> k() {
        return new a().a(true);
    }

    public final acgu<T> a(T t, Function<Void, String> function) {
        a a;
        String str = "\nwith navigation host state ";
        String str2 = " to bottom page ";
        StringBuilder stringBuilder;
        if (c() == acgw.PRESENT) {
            if (d() == null || d().equals(t)) {
                a = g().a((achg) t);
            } else {
                stringBuilder = new StringBuilder("attach bottom page invalid with existing source page type ");
                stringBuilder.append(d());
                stringBuilder.append(str2);
                stringBuilder.append(t);
                stringBuilder.append(str);
                stringBuilder.append((String) function.apply(null));
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (e() == null || e().equals(t)) {
            a = g().b((achg) t);
        } else {
            stringBuilder = new StringBuilder("attach bottom page invalid with existing destination page type ");
            stringBuilder.append(d());
            stringBuilder.append(str2);
            stringBuilder.append(t);
            stringBuilder.append(str);
            stringBuilder.append((String) function.apply(null));
            throw new IllegalStateException(stringBuilder.toString());
        }
        return a.d();
    }

    public abstract achr a();

    public abstract acis b();

    public abstract acgw c();

    public abstract T d();

    public abstract T e();

    public abstract boolean f();

    public abstract a<T> g();

    public final T h() {
        return c() == acgw.PRESENT ? e() : d();
    }

    public final T i() {
        return c() == acgw.PRESENT ? d() : e();
    }

    public final acgu<T> j() {
        return acgu.k().b(d()).a(e()).a(achr.a(a())).a(acgw.a(c())).a(b().a()).a(f()).d();
    }

    public String toString() {
        return new akmf(this).a("inputGesture", a()).a("outputTransition", b()).a("navigationType", c()).a("sourcePageType", d()).a("destinationPageType", e()).a("shouldAnimate", f()).toString();
    }
}
