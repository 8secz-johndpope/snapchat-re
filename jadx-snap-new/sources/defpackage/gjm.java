package defpackage;

import com.snap.core.net.converter.JsonAuth;
import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: gjm */
public final class gjm extends a {
    private final iha a;
    private final gdd b;

    private gjm(iha iha, gdd gdd) {
        this.a = iha;
        this.b = gdd;
    }

    public static gjm a(iha iha, gdd gdd) {
        return new gjm(iha, gdd);
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        for (Annotation annotation : annotationArr2) {
            if (annotation instanceof JsonAuth) {
                return new gjn(this.a, this.b, ((JsonAuth) annotation).field());
            }
            if (annotation instanceof gjh) {
                return new gjs(this.a, this.b);
            }
        }
        return new gjl(this.a, this.b);
    }
}
