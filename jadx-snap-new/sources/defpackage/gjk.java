package defpackage;

import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;

/* renamed from: gjk */
public final class gjk extends gjj<Object, String> {
    private final iha a;

    public gjk(iha iha) {
        super(Object.class);
        this.a = iha;
    }

    private String c(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (gjp.a(obj.getClass())) {
            return obj.toString();
        }
        try {
            obj = this.a.b(obj);
            return obj;
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder("Trouble serializing: Class=");
            stringBuilder.append(obj.getClass().getName());
            stringBuilder.append(", with toString()=");
            stringBuilder.append(obj);
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String a(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        return serializedName != null ? serializedName.value() : super.a(field);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(Object obj) {
        return c(obj);
    }
}
