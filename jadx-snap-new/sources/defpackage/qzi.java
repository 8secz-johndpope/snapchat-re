package defpackage;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.util.Map;

/* renamed from: qzi */
public final class qzi {
    public static final qzi h = new qzi();
    public final qzf a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    final int g;

    /* renamed from: qzi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static qzi a(JsonReader jsonReader) {
            akcr.b(jsonReader, "p0");
            qzf qzf = qzi.h.a;
            String str = qzi.h.b;
            String str2 = qzi.h.c;
            String str3 = qzi.h.d;
            int i = qzi.h.e;
            int i2 = qzi.h.f;
            int i3 = qzi.h.g;
            jsonReader.beginObject();
            qzf qzf2 = qzf;
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i4 = i;
            int i5 = i2;
            int i6 = i3;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (nextName != null) {
                    str2 = "p0.nextString()";
                    switch (nextName.hashCode()) {
                        case -1608986269:
                            if (!nextName.equals("display_duration_in_days")) {
                                break;
                            }
                            i5 = jsonReader.nextInt();
                            break;
                        case -42298471:
                            if (!nextName.equals("sub_title")) {
                                break;
                            }
                            str6 = jsonReader.nextString();
                            akcr.a((Object) str6, str2);
                            break;
                        case 3226745:
                            if (!nextName.equals("icon")) {
                                break;
                            }
                            str4 = jsonReader.nextString();
                            akcr.a((Object) str4, str2);
                            break;
                        case 3575610:
                            str = "type";
                            if (!nextName.equals(str)) {
                                break;
                            }
                            Object nextString = jsonReader.nextString();
                            akcr.a(nextString, str2);
                            akcr.b(nextString, str);
                            qzf = (qzf) ((Map) qzf.lookupMap$delegate.b()).get(nextString);
                            if (qzf == null) {
                                qzf = qzf.UNDEFINED;
                            }
                            qzf2 = qzf;
                            break;
                        case 106006350:
                            if (!nextName.equals("order")) {
                                break;
                            }
                            i6 = jsonReader.nextInt();
                            break;
                        case 110371416:
                            if (!nextName.equals("title")) {
                                break;
                            }
                            str5 = jsonReader.nextString();
                            akcr.a((Object) str5, str2);
                            break;
                        case 844431991:
                            if (!nextName.equals("max_cap")) {
                                break;
                            }
                            i4 = jsonReader.nextInt();
                            break;
                        default:
                            break;
                    }
                }
            }
            jsonReader.endObject();
            return new qzi(qzf2, str4, str5, str6, i4, i5, i6);
        }

        public static void a(JsonWriter jsonWriter, qzi qzi) {
            akcr.b(jsonWriter, "p0");
            akcr.b(qzi, "p1");
            jsonWriter.beginObject();
            jsonWriter.name("title");
            jsonWriter.value(qzi.c);
            jsonWriter.name("icon");
            jsonWriter.value(qzi.b);
            jsonWriter.name("sub_title");
            jsonWriter.value(qzi.d);
            jsonWriter.name("type");
            jsonWriter.value(qzi.a.id);
            jsonWriter.name("max_cap");
            jsonWriter.value((Number) Integer.valueOf(qzi.e));
            jsonWriter.name("display_duration_in_days");
            jsonWriter.value((Number) Integer.valueOf(qzi.f));
            jsonWriter.name("order");
            jsonWriter.value((Number) Integer.valueOf(qzi.g));
            jsonWriter.endObject();
        }
    }

    /* renamed from: qzi$b */
    public static final class b extends TypeAdapter<qzi> {
        /* renamed from: a */
        public final qzi read(JsonReader jsonReader) {
            return jsonReader == null ? qzi.h : a.a(jsonReader);
        }

        /* renamed from: a */
        public final void write(JsonWriter jsonWriter, qzi qzi) {
            if (qzi != null && jsonWriter != null) {
                a.a(jsonWriter, qzi);
            }
        }
    }

    static {
        a aVar = new a();
    }

    public qzi() {
        this(qzf.UNDEFINED, "", "", "", 3, 2, 0);
    }

    public qzi(qzf qzf, String str, String str2, String str3, int i, int i2, int i3) {
        akcr.b(qzf, "type");
        akcr.b(str, "icon");
        akcr.b(str2, "title");
        akcr.b(str3, "description");
        this.a = qzf;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (akcr.a(obj.getClass(), getClass()) ^ 1) == 0) {
            qzi qzi = (qzi) obj;
            return qzi.a == this.a && akcr.a(qzi.b, this.b) && akcr.a(qzi.d, this.d) && akcr.a(qzi.c, this.c) && qzi.e == this.e && qzi.f == this.f && qzi.g == this.g;
        }
    }
}
