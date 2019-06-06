package defpackage;

import com.google.common.base.Supplier;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/* renamed from: absu */
public class absu<T> implements Supplier<T> {
    private final String a;
    private final Class<T> b;
    private final Gson c;
    private T d;

    public absu(String str, Class<T> cls) {
        this(str, cls, abst.a().a);
    }

    private absu(String str, Class<T> cls, Gson gson) {
        this.a = str;
        this.b = cls;
        this.c = gson;
        this.d = null;
    }

    public T get() {
        if (this.d == null) {
            try {
                this.d = this.c.fromJson(this.a, this.b);
            } catch (JsonSyntaxException | StackOverflowError unused) {
                return null;
            }
        }
        return this.d;
    }
}
