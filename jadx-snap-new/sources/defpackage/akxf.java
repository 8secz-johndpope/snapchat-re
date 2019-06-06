package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import defpackage.akkd.1;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: akxf */
final class akxf<T> implements akwk<T, akhu> {
    private static final akho a = akho.a("application/json; charset=UTF-8");
    private static final Charset b = Charset.forName("UTF-8");
    private final Gson c;
    private final TypeAdapter<T> d;

    akxf(Gson gson, TypeAdapter<T> typeAdapter) {
        this.c = gson;
        this.d = typeAdapter;
    }

    public final /* synthetic */ Object a(Object obj) {
        akkd akkd = new akkd();
        JsonWriter newJsonWriter = this.c.newJsonWriter(new OutputStreamWriter(new 1(), b));
        this.d.write(newJsonWriter, obj);
        newJsonWriter.close();
        return akhu.create(a, akkd.m());
    }
}
