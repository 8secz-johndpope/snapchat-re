package defpackage;

import com.google.common.base.Supplier;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;

/* renamed from: afdq */
public class afdq<T> implements Supplier<TypeAdapter<T>> {
    private final Gson a;
    private final TypeToken<T> b;

    public afdq(Gson gson, TypeToken<T> typeToken) {
        this.a = gson;
        this.b = typeToken;
    }

    /* renamed from: a */
    public TypeAdapter<T> get() {
        return this.a.getAdapter(this.b);
    }
}
