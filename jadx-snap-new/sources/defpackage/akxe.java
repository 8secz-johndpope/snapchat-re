package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import defpackage.akwk.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: akxe */
public final class akxe extends a {
    private final Gson a;

    private akxe(Gson gson) {
        this.a = gson;
    }

    public static akxe a() {
        return akxe.a(new Gson());
    }

    public static akxe a(Gson gson) {
        if (gson != null) {
            return new akxe(gson);
        }
        throw new NullPointerException("gson == null");
    }

    public final akwk<akhw, ?> a(Type type, Annotation[] annotationArr, akwt akwt) {
        return new akxg(this.a, this.a.getAdapter(TypeToken.get(type)));
    }

    public final akwk<?, akhu> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, akwt akwt) {
        return new akxf(this.a, this.a.getAdapter(TypeToken.get(type)));
    }
}
