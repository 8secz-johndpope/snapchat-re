package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aggi */
public final class aggi extends TypeAdapter<aggh> {
    private final Gson a;
    private final Supplier<TypeAdapter<aggp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aggp.class)));
    private final Supplier<TypeAdapter<aggr>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aggr.class)));
    private final Supplier<TypeAdapter<aggt>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aggt.class)));

    public aggi(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aggh read(com.google.gson.stream.JsonReader r9) {
        /*
        r8 = this;
        r0 = r9.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r9.nextNull();
        r9 = 0;
        return r9;
    L_0x000d:
        r0 = new aggh;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x017c;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -296773946: goto L_0x0057;
            case 351608024: goto L_0x004d;
            case 1281899399: goto L_0x0043;
            case 1299283699: goto L_0x0039;
            case 1786503084: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "cdn_routing_rules";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 2;
        goto L_0x0062;
    L_0x0039:
        r4 = "cdn_infos";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 3;
        goto L_0x0062;
    L_0x0043:
        r4 = "routing_definitions";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 4;
        goto L_0x0062;
    L_0x004d:
        r4 = "version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 0;
        goto L_0x0062;
    L_0x0057:
        r4 = "cachable_urls";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 1;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x0163;
    L_0x0064:
        if (r2 == r1) goto L_0x012c;
    L_0x0066:
        if (r2 == r7) goto L_0x00ee;
    L_0x0068:
        if (r2 == r6) goto L_0x00af;
    L_0x006a:
        if (r2 == r5) goto L_0x0070;
    L_0x006c:
        r9.skipValue();
        goto L_0x0019;
    L_0x0070:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x007a;
    L_0x0078:
        goto L_0x016b;
    L_0x007a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x007e:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x008e:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00a8;
    L_0x0094:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00a0;
    L_0x009c:
        r9.nextNull();
        goto L_0x008e;
    L_0x00a0:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x008e;
    L_0x00a8:
        r9.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x00af:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b9;
    L_0x00b7:
        goto L_0x016b;
    L_0x00b9:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00bd:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00cd:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x00e7;
    L_0x00d3:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00df;
    L_0x00db:
        r9.nextNull();
        goto L_0x00cd;
    L_0x00df:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x00cd;
    L_0x00e7:
        r9.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x00ee:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f7;
    L_0x00f6:
        goto L_0x016b;
    L_0x00f7:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00fb:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x010b:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0125;
    L_0x0111:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x011d;
    L_0x0119:
        r9.nextNull();
        goto L_0x010b;
    L_0x011d:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x010b;
    L_0x0125:
        r9.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x012c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0135;
    L_0x0134:
        goto L_0x016b;
    L_0x0135:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0139:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0141:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x015c;
    L_0x0147:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0154;
    L_0x014b:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0158;
    L_0x0154:
        r4 = r9.nextString();
    L_0x0158:
        r3.add(r4);
        goto L_0x0141;
    L_0x015c:
        r9.endArray();
        r0.b = r3;
        goto L_0x0019;
    L_0x0163:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0170;
    L_0x016b:
        r9.nextNull();
        goto L_0x0019;
    L_0x0170:
        r2 = r9.nextDouble();
        r2 = java.lang.Double.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x017c:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggi.read(com.google.gson.stream.JsonReader):aggh");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aggh aggh) {
        if (aggh == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aggh.a != null) {
            jsonWriter.name("version");
            jsonWriter.value(aggh.a);
        }
        if (aggh.b != null) {
            jsonWriter.name("cachable_urls");
            jsonWriter.beginArray();
            for (String value : aggh.b) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aggh.c != null) {
            jsonWriter.name("cdn_routing_rules");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (aggt write : aggh.c) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aggh.d != null) {
            jsonWriter.name("cdn_infos");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aggp write2 : aggh.d) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aggh.e != null) {
            jsonWriter.name("routing_definitions");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aggr write3 : aggh.e) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
