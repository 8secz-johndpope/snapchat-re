package defpackage;

import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gjw */
public final class gjw extends a {
    private final aipn<akxe> a;
    private final List<gjy> b;
    private final Executor c;

    public gjw(List<gjy> list, aipn<akxe> aipn, Executor executor) {
        this.b = list;
        this.a = aipn;
        this.c = executor;
    }

    public final akwk<akhw, ?> a(Type type, Annotation[] annotationArr, akwt akwt) {
        return new gjx(((akxe) this.a.get()).a(type, annotationArr, akwt), this.b, this.c);
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        return ((akxe) this.a.get()).a(type, annotationArr, annotationArr2, akwt);
    }
}
