package defpackage;

import android.os.StrictMode;
import com.google.common.base.Charsets;
import com.google.gson.Gson;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: iha */
public final class iha {
    public final abst a;

    /* renamed from: iha$3 */
    class 3 extends TypeToken<List<?>> {
        3() {
        }
    }

    /* renamed from: iha$2 */
    class 2 extends TypeToken<Map<?, ?>> {
        2() {
        }
    }

    /* renamed from: iha$4 */
    class 4 extends TypeToken<List<?>> {
        4() {
        }
    }

    /* renamed from: iha$a */
    public static class a {
        public static final iha a = new iha(Collections.emptyMap(), Collections.emptySet());
    }

    /* renamed from: iha$1 */
    class 1 extends TypeToken<Map<?, ?>> {
        1() {
        }
    }

    public iha(Map<Type, Object> map, Set<TypeAdapterFactory> set) {
        this(map, set, new abqo());
    }

    private iha(Map<Type, Object> map, Set<TypeAdapterFactory> set, abqo abqo) {
        this.a = new abst(map, set, null, abqo);
    }

    @Deprecated
    public static iha a() {
        return a.a;
    }

    private <E> String a(List<E> list) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return list.isEmpty() ? this.a.a((Object) list, new 3().getType()) : this.a.a((Object) list, new 4().getType());
    }

    private <K, V> String a(Map<K, V> map) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return map.isEmpty() ? this.a.a((Object) map, new 1().getType()) : this.a.a((Object) map, new 2().getType());
    }

    public final <TClass> TClass a(InputStream inputStream, Class<TClass> cls) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return this.a.a(new InputStreamReader(inputStream, Charsets.UTF_8), (Type) cls);
    }

    public final <T> T a(InputStream inputStream, Type type) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return this.a.a(new InputStreamReader(inputStream, Charsets.UTF_8), type);
    }

    public final <TClass> TClass a(String str, Class<TClass> cls) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return this.a.a(str, (Class) cls);
    }

    public final <T> T a(String str, Type type) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return this.a.a(str, type);
    }

    public final String a(Object obj, Type type) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return this.a.a(obj, type);
    }

    public final <TClass> byte[] a(TClass tClass) {
        return b(tClass).getBytes();
    }

    @Deprecated
    public final Gson b() {
        return this.a.a;
    }

    public final <TClass> String b(TClass tClass) {
        StrictMode.noteSlowCall("Serialization is expensive and must not happen on the main thread");
        return tClass instanceof Map ? a((Map) tClass) : tClass instanceof List ? a((List) tClass) : this.a.a((Object) tClass);
    }
}
