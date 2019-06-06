package defpackage;

import defpackage.akwk.a;
import defpackage.akxi.b;
import defpackage.akxi.c;
import defpackage.akxi.d;
import defpackage.akxi.e;
import defpackage.akxi.f;
import defpackage.akxi.g;
import defpackage.akxi.h;
import defpackage.akxi.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: akxj */
public final class akxj extends a {
    private akxj() {
    }

    public static akxj a() {
        return new akxj();
    }

    public final akwk<akhw, ?> a(Type type, Annotation[] annotationArr, akwt akwt) {
        return type == String.class ? i.a : (type == Boolean.class || type == Boolean.TYPE) ? akxi.a.a : (type == Byte.class || type == Byte.TYPE) ? b.a : (type == Character.class || type == Character.TYPE) ? c.a : (type == Double.class || type == Double.TYPE) ? d.a : (type == Float.class || type == Float.TYPE) ? e.a : (type == Integer.class || type == Integer.TYPE) ? f.a : (type == Long.class || type == Long.TYPE) ? g.a : (type == Short.class || type == Short.TYPE) ? h.a : null;
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        return (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) ? akxh.a : null;
    }
}
