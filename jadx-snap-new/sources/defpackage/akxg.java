package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/* renamed from: akxg */
final class akxg<T> implements akwk<akhw, T> {
    private final Gson a;
    private final TypeAdapter<T> b;

    akxg(Gson gson, TypeAdapter<T> typeAdapter) {
        this.a = gson;
        this.b = typeAdapter;
    }

    private T a(akhw akhw) {
        try {
            T read = this.b.read(this.a.newJsonReader(akhw.f()));
            return read;
        } finally {
            akhw.close();
        }
    }
}
