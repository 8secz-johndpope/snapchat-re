package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agfm */
public final class agfm extends TypeAdapter<agfl> {
    private final Gson a;
    private final Supplier<TypeAdapter<agfa>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfa.class)));
    private final Supplier<TypeAdapter<agfc>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfc.class)));
    private final Supplier<TypeAdapter<agff>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(agff.class)));
    private final Supplier<TypeAdapter<agfj>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(agfj.class)));

    public agfm(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.agfl read(com.google.gson.stream.JsonReader r8) {
        /*
        r7 = this;
        r0 = r8.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r8.nextNull();
        r8 = 0;
        return r8;
    L_0x000d:
        r0 = new agfl;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0119;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1138935912: goto L_0x004c;
            case -475745824: goto L_0x0042;
            case 1463997404: goto L_0x0038;
            case 1858191693: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "default_precache_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 1;
        goto L_0x0057;
    L_0x0038:
        r4 = "lookahead_precache";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 2;
        goto L_0x0057;
    L_0x0042:
        r4 = "lookahead_precache_per_section";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 3;
        goto L_0x0057;
    L_0x004c:
        r4 = "precache_counts_per_story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 0;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00d7;
    L_0x0059:
        if (r2 == r1) goto L_0x00bc;
    L_0x005b:
        if (r2 == r6) goto L_0x00a1;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006c;
    L_0x006b:
        goto L_0x00df;
    L_0x006c:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0070:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0080:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x009a;
    L_0x0086:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0092;
    L_0x008e:
        r8.nextNull();
        goto L_0x0080;
    L_0x0092:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0080;
    L_0x009a:
        r8.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x00a1:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00aa;
    L_0x00a9:
        goto L_0x00df;
    L_0x00aa:
        r2 = r7.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.agfa) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c5;
    L_0x00c4:
        goto L_0x00df;
    L_0x00c5:
        r2 = r7.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.agff) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x00d7:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e4;
    L_0x00df:
        r8.nextNull();
        goto L_0x0019;
    L_0x00e4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00e8:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00f8:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0112;
    L_0x00fe:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x010a;
    L_0x0106:
        r8.nextNull();
        goto L_0x00f8;
    L_0x010a:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x00f8;
    L_0x0112:
        r8.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x0119:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfm.read(com.google.gson.stream.JsonReader):agfl");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agfl agfl) {
        if (agfl == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agfl.a != null) {
            jsonWriter.name("precache_counts_per_story");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (agfj write : agfl.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (agfl.b != null) {
            jsonWriter.name("default_precache_count");
            ((TypeAdapter) this.d.get()).write(jsonWriter, agfl.b);
        }
        if (agfl.c != null) {
            jsonWriter.name("lookahead_precache");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfl.c);
        }
        if (agfl.d != null) {
            jsonWriter.name("lookahead_precache_per_section");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (agfc write2 : agfl.d) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
