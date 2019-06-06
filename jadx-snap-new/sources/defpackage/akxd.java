package defpackage;

import defpackage.akwi.a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: akxd */
public final class akxd extends a {
    private final ajdw a;
    private final boolean b;

    public akxd(ajdw ajdw, boolean z) {
        this.a = ajdw;
        this.b = z;
    }

    public static akxd a() {
        return new akxd(null, false);
    }

    public static akxd b() {
        return new akxd(null, true);
    }

    public final akwi<?, ?> a(Type type) {
        Class a = akwv.a(type);
        if (a == ajcx.class) {
            return new akxc(Void.class, this.a, this.b, false, true, false, false, false, true);
        }
        boolean z = a == ajde.class;
        boolean z2 = a == ajdx.class;
        boolean z3 = a == ajdj.class;
        if (a != ajdp.class && !z && !z2 && !z3) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2;
            boolean z4;
            boolean z5;
            type = akwv.a(0, (ParameterizedType) type);
            a = akwv.a(type);
            if (a == akws.class) {
                if (type instanceof ParameterizedType) {
                    a2 = akwv.a(0, (ParameterizedType) type);
                    z4 = false;
                } else {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
            } else if (a != akxa.class) {
                a2 = type;
                z4 = false;
                z5 = true;
                return new akxc(a2, this.a, this.b, z4, z5, z, z2, z3, false);
            } else if (type instanceof ParameterizedType) {
                a2 = akwv.a(0, (ParameterizedType) type);
                z4 = true;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            z5 = false;
            return new akxc(a2, this.a, this.b, z4, z5, z, z2, z3, false);
        }
        String str = !z ? !z2 ? z3 ? "Maybe" : "Observable" : "Single" : "Flowable";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" return type must be parameterized as ");
        stringBuilder.append(str);
        stringBuilder.append("<Foo> or ");
        stringBuilder.append(str);
        stringBuilder.append("<? extends Foo>");
        throw new IllegalStateException(stringBuilder.toString());
    }
}
