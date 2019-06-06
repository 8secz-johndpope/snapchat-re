package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import defpackage.qzi.a;
import defpackage.qzi.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* renamed from: qzh */
public final class qzh {
    public static final qzh c = new qzh(ajyw.a, 7);
    public final List<qzi> a;
    public final int b;

    /* renamed from: qzh$d */
    public static final class d implements TypeAdapterFactory {

        /* renamed from: qzh$d$a */
        static final class a extends akcs implements akbk<b> {
            public static final a a = new a();

            a() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new b();
            }
        }

        public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
            if (!(gson == null || typeToken == null)) {
                c cVar;
                if (qzh.class.isAssignableFrom(typeToken.getRawType())) {
                    cVar = new c();
                } else if (qzi.class.isAssignableFrom(typeToken.getRawType())) {
                    cVar = a.a;
                }
                return cVar;
            }
            return null;
        }
    }

    /* renamed from: qzh$c */
    public static final class c extends TypeAdapter<qzh> {
        /* renamed from: a */
        public final qzh read(JsonReader jsonReader) {
            if (jsonReader == null) {
                return qzh.c;
            }
            List arrayList = new ArrayList();
            int i = 7;
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName != null) {
                    int hashCode = nextName.hashCode();
                    if (hashCode != -1808589219) {
                        if (hashCode == 110844025) {
                            if (nextName.equals("types")) {
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    qzi a = a.a(jsonReader);
                                    if (a.a != qzf.UNDEFINED) {
                                        arrayList.add(a);
                                    }
                                }
                                jsonReader.endArray();
                            }
                        }
                    } else if (nextName.equals("cooldown_in_days")) {
                        i = jsonReader.nextInt();
                    }
                }
            }
            jsonReader.endObject();
            return new qzh(arrayList, i);
        }

        /* renamed from: a */
        public final void write(JsonWriter jsonWriter, qzh qzh) {
            if (qzh != null && jsonWriter != null) {
                jsonWriter.beginObject();
                jsonWriter.name("types");
                jsonWriter.beginArray();
                for (qzi a : qzh.a) {
                    a.a(jsonWriter, a);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
            }
        }
    }

    /* renamed from: qzh$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: qzh$a */
    public static final class a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return ajzy.a(Integer.valueOf(((qzi) t).g), Integer.valueOf(((qzi) t2).g));
        }
    }

    static {
        b bVar = new b();
    }

    public qzh(List<qzi> list, int i) {
        akcr.b(list, "serverPrompts");
        this.b = i;
        this.a = ajyu.a((Iterable) ajyu.h((Collection) list), (Comparator) new a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || (akcr.a(obj.getClass(), getClass()) ^ 1) != 0) {
            return false;
        }
        qzh qzh = (qzh) obj;
        if (qzh.b != this.b || qzh.a.size() != this.a.size()) {
            return false;
        }
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            if ((akcr.a((qzi) this.a.get(i), (qzi) qzh.a.get(i)) ^ 1) != 0) {
                return false;
            }
        }
        return true;
    }
}
