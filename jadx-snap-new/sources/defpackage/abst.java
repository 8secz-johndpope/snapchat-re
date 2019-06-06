package defpackage;

import android.os.SystemClock;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import defpackage.abnn.a;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

@Deprecated
/* renamed from: abst */
public final class abst {
    public static aipn<abst> b;
    public final Gson a;
    private final a c;
    private final abqo d;
    private final AtomicLong e;

    /* renamed from: abst$1 */
    static class 1 implements Supplier<Gson> {
        1() {
        }

        public final /* synthetic */ Object get() {
            return new GsonBuilder().setPrettyPrinting().create();
        }
    }

    /* renamed from: abst$a */
    public static final class a {
        public static final Type a = new 1().getType();
        public static final Type b = new 4().getType();

        /* renamed from: abst$a$1 */
        static class 1 extends TypeToken<Map<String, String>> {
            1() {
            }
        }

        /* renamed from: abst$a$2 */
        static class 2 extends TypeToken<Map<String, Set<String>>> {
            2() {
            }
        }

        /* renamed from: abst$a$3 */
        static class 3 extends TypeToken<Map<String, Object>> {
            3() {
            }
        }

        /* renamed from: abst$a$4 */
        static class 4 extends TypeToken<List<String>> {
            4() {
            }
        }

        /* renamed from: abst$a$5 */
        static class 5 extends TypeToken<Map<String, Map<String, String>>> {
            5() {
            }
        }

        /* renamed from: abst$a$6 */
        static class 6 extends TypeToken<List<Map<String, Object>>> {
            6() {
            }
        }

        static {
            new 2().getType();
            new 3().getType();
            new 5().getType();
            new 6().getType();
        }
    }

    static {
        JsonParser jsonParser = new JsonParser();
        Suppliers.memoize(new 1());
    }

    public abst(Map<Type, Object> map) {
        this(map, new abqo());
    }

    private abst(Map<Type, Object> map, abqo abqo) {
        this(map, Collections.emptySet(), null, abqo);
    }

    public abst(Map<Type, Object> map, Set<TypeAdapterFactory> set, a aVar, abqo abqo) {
        this.e = new AtomicLong(0);
        this.a = abst.a((Map) map, (Set) set);
        this.c = null;
        this.d = abqo;
    }

    private long a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        this.e.getAndAdd(elapsedRealtime);
        return elapsedRealtime;
    }

    public static abst a() {
        return (abst) ((aipn) Preconditions.checkNotNull(b)).get();
    }

    private static Gson a(Map<Type, Object> map, Set<TypeAdapterFactory> set) {
        GsonBuilder serializeSpecialFloatingPointValues = new GsonBuilder().enableComplexMapKeySerialization().serializeSpecialFloatingPointValues();
        for (Entry entry : map.entrySet()) {
            serializeSpecialFloatingPointValues.registerTypeAdapter((Type) entry.getKey(), entry.getValue());
        }
        for (TypeAdapterFactory registerTypeAdapterFactory : set) {
            serializeSpecialFloatingPointValues.registerTypeAdapterFactory(registerTypeAdapterFactory);
        }
        return serializeSpecialFloatingPointValues.create();
    }

    private <T> void a(Class<T> cls, Throwable th, String str) {
        if (this.c != null) {
            JsonSyntaxException jsonSyntaxException = new JsonSyntaxException(String.format("Json Error from parsing %s: [%s]", new Object[]{cls.getSimpleName(), str}), th);
        }
    }

    public final <T> T a(Reader reader, Type type) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object fromJson = this.a.fromJson(reader, type);
            a(elapsedRealtime);
            return fromJson;
        } catch (JsonSyntaxException | NumberFormatException | StackOverflowError e) {
            a(type.getClass(), e, "N/A from Reader.");
            return null;
        }
    }

    public final <T> T a(String str, Class<T> cls) {
        if (str == null) {
            return null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object fromJson = this.a.fromJson(str, (Class) cls);
            a(elapsedRealtime);
            return fromJson;
        } catch (JsonSyntaxException | NumberFormatException | StackOverflowError e) {
            a(cls, e, str);
            return null;
        }
    }

    public final <T> T a(String str, Type type) {
        if (str == null) {
            return null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object fromJson = this.a.fromJson(str, type);
            a(elapsedRealtime);
            return fromJson;
        } catch (JsonSyntaxException | NumberFormatException | StackOverflowError e) {
            a(type.getClass(), e, str);
            return null;
        }
    }

    public final String a(Object obj) {
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String toJson = this.a.toJson(obj);
            a(elapsedRealtime);
            return toJson;
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Failed to serialize object. (You might be trying to serialize a mock).", e);
        }
    }

    public final String a(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String toJson = this.a.toJson(obj, type);
            a(elapsedRealtime);
            return toJson;
        } catch (UnsupportedOperationException e) {
            throw new UnsupportedOperationException("Failed to serialize object. (You might be trying to serialize a mock).", e);
        }
    }
}
