package defpackage;

import com.google.protobuf.nano.MessageNano;
import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: gka */
public final class gka extends a {
    public final akwk<akhw, ?> a(Type type, Annotation[] annotationArr, akwt akwt) {
        akcr.b(type, "type");
        akcr.b(annotationArr, "annotations");
        akcr.b(akwt, "retrofit");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        return MessageNano.class.isAssignableFrom(cls) ? new gkc(cls) : null;
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        akcr.b(type, "type");
        akcr.b(annotationArr, "parameterAnnotations");
        akcr.b(annotationArr2, "methodAnnotations");
        akcr.b(akwt, "retrofit");
        return ((type instanceof Class) && MessageNano.class.isAssignableFrom((Class) type)) ? new gkb() : null;
    }
}
