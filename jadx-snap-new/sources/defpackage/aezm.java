package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.snapchat.soju.android.SojuJsonAdapter;
import java.lang.reflect.InvocationTargetException;

/* renamed from: aezm */
public class aezm implements TypeAdapterFactory {
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String str = "'s constructor";
        String str2 = "Error calling ";
        SojuJsonAdapter sojuJsonAdapter = (SojuJsonAdapter) typeToken.getRawType().getAnnotation(SojuJsonAdapter.class);
        if (sojuJsonAdapter != null) {
            Class a = sojuJsonAdapter.a();
            try {
                return (TypeAdapter) a.getConstructor(new Class[]{Gson.class}).newInstance(new Object[]{gson});
            } catch (NoSuchMethodException e) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a);
                stringBuilder.append(" does not have a constructor that takes a single Gson object");
                throw new IllegalArgumentException(stringBuilder.toString(), e);
            } catch (IllegalAccessException e2) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(a);
                stringBuilder.append("'s constructor is not accessible");
                throw new IllegalArgumentException(stringBuilder.toString(), e2);
            } catch (InstantiationException e3) {
                stringBuilder2 = new StringBuilder(str2);
                stringBuilder2.append(a);
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString(), e3);
            } catch (InvocationTargetException e4) {
                stringBuilder2 = new StringBuilder(str2);
                stringBuilder2.append(a);
                stringBuilder2.append(str);
                throw new IllegalArgumentException(stringBuilder2.toString(), e4);
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(typeToken);
        stringBuilder3.append(" must have the SojuJsonAdapter annotation.");
        throw new IllegalArgumentException(stringBuilder3.toString());
    }
}
