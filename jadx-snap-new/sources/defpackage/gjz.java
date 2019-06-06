package defpackage;

import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: gjz */
public final class gjz extends a {
    private final akxe a = akxe.a();

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        akcr.b(type, "type");
        akcr.b(annotationArr, "parameterAnnotations");
        akcr.b(annotationArr2, "methodAnnotations");
        akcr.b(akwt, "retrofit");
        if (type instanceof Class) {
            Object obj = null;
            for (Annotation annotation : annotationArr2) {
                if (annotation instanceof gjg) {
                    obj = 1;
                    break;
                }
            }
            if (obj != null) {
                return this.a.a(type, annotationArr, annotationArr2, akwt);
            }
        }
        return null;
    }
}
