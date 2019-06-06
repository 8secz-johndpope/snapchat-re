package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aena */
public final class aena extends TypeAdapter<aemz> {
    private final Gson a;
    private final Supplier<TypeAdapter<aejy>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aejy.class)));
    private final Supplier<TypeAdapter<aelf>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aelf.class)));

    public aena(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:114:0x0205, code skipped:
            r8.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aemz read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aemz;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x023f;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2145187362: goto L_0x007d;
            case -1286888396: goto L_0x0073;
            case -1239137217: goto L_0x0069;
            case -1030036527: goto L_0x005f;
            case -600094315: goto L_0x0055;
            case -207737163: goto L_0x004a;
            case 93628175: goto L_0x0040;
            case 1031198784: goto L_0x0036;
            case 1054855510: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0087;
    L_0x002c:
        r4 = "added_friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0034:
        r2 = 3;
        goto L_0x0088;
    L_0x0036:
        r4 = "extra_friendmoji_mutable_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x003e:
        r2 = 5;
        goto L_0x0088;
    L_0x0040:
        r4 = "bests";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0048:
        r2 = 4;
        goto L_0x0088;
    L_0x004a:
        r4 = "added_friends_sync_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0052:
        r2 = 8;
        goto L_0x0088;
    L_0x0055:
        r4 = "friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x005d:
        r2 = 0;
        goto L_0x0088;
    L_0x005f:
        r4 = "extra_friendmoji_read_only_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0067:
        r2 = 6;
        goto L_0x0088;
    L_0x0069:
        r4 = "friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0071:
        r2 = 1;
        goto L_0x0088;
    L_0x0073:
        r4 = "friends_sync_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x007b:
        r2 = 2;
        goto L_0x0088;
    L_0x007d:
        r4 = "added_friends_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0085:
        r2 = 7;
        goto L_0x0088;
    L_0x0087:
        r2 = -1;
    L_0x0088:
        switch(r2) {
            case 0: goto L_0x01fd;
            case 1: goto L_0x01df;
            case 2: goto L_0x01c1;
            case 3: goto L_0x0183;
            case 4: goto L_0x014b;
            case 5: goto L_0x010c;
            case 6: goto L_0x00cd;
            case 7: goto L_0x00ae;
            case 8: goto L_0x008f;
            default: goto L_0x008b;
        };
    L_0x008b:
        r8.skipValue();
        goto L_0x0019;
    L_0x008f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x0205;
    L_0x0099:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00a6;
    L_0x009d:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00aa;
    L_0x00a6:
        r2 = r8.nextString();
    L_0x00aa:
        r0.i = r2;
        goto L_0x0019;
    L_0x00ae:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b8;
    L_0x00b6:
        goto L_0x0205;
    L_0x00b8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00c5;
    L_0x00bc:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c9;
    L_0x00c5:
        r2 = r8.nextString();
    L_0x00c9:
        r0.h = r2;
        goto L_0x0019;
    L_0x00cd:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d7;
    L_0x00d5:
        goto L_0x0205;
    L_0x00d7:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x00e7:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0105;
    L_0x00ed:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x00fd;
    L_0x00f9:
        r8.nextNull();
        goto L_0x00e7;
    L_0x00fd:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x00e7;
    L_0x0105:
        r8.endObject();
        r0.g = r2;
        goto L_0x0019;
    L_0x010c:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0116;
    L_0x0114:
        goto L_0x0205;
    L_0x0116:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x0126:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0144;
    L_0x012c:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x013c;
    L_0x0138:
        r8.nextNull();
        goto L_0x0126;
    L_0x013c:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x0126;
    L_0x0144:
        r8.endObject();
        r0.f = r2;
        goto L_0x0019;
    L_0x014b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0155;
    L_0x0153:
        goto L_0x0205;
    L_0x0155:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0159:
        r8.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0161:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x017c;
    L_0x0167:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0174;
    L_0x016b:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0178;
    L_0x0174:
        r4 = r8.nextString();
    L_0x0178:
        r3.add(r4);
        goto L_0x0161;
    L_0x017c:
        r8.endArray();
        r0.e = r3;
        goto L_0x0019;
    L_0x0183:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x018c;
    L_0x018b:
        goto L_0x0205;
    L_0x018c:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0190:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01a0:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x01ba;
    L_0x01a6:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01b2;
    L_0x01ae:
        r8.nextNull();
        goto L_0x01a0;
    L_0x01b2:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x01a0;
    L_0x01ba:
        r8.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x01c1:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ca;
    L_0x01c9:
        goto L_0x0205;
    L_0x01ca:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01d7;
    L_0x01ce:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01db;
    L_0x01d7:
        r2 = r8.nextString();
    L_0x01db:
        r0.c = r2;
        goto L_0x0019;
    L_0x01df:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e8;
    L_0x01e7:
        goto L_0x0205;
    L_0x01e8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01f5;
    L_0x01ec:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01f9;
    L_0x01f5:
        r2 = r8.nextString();
    L_0x01f9:
        r0.b = r2;
        goto L_0x0019;
    L_0x01fd:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x020a;
    L_0x0205:
        r8.nextNull();
        goto L_0x0019;
    L_0x020a:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x020e:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x021e:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0238;
    L_0x0224:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0230;
    L_0x022c:
        r8.nextNull();
        goto L_0x021e;
    L_0x0230:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x021e;
    L_0x0238:
        r8.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x023f:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aena.read(com.google.gson.stream.JsonReader):aemz");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aemz aemz) {
        if (aemz == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aemz.a != null) {
            jsonWriter.name("friends");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aelf write : aemz.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aemz.b != null) {
            jsonWriter.name("friends_sync_token");
            jsonWriter.value(aemz.b);
        }
        if (aemz.c != null) {
            jsonWriter.name("friends_sync_type");
            jsonWriter.value(aemz.c);
        }
        if (aemz.d != null) {
            jsonWriter.name("added_friends");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aelf write2 : aemz.d) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aemz.e != null) {
            jsonWriter.name("bests");
            jsonWriter.beginArray();
            for (String value : aemz.e) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aemz.f != null) {
            jsonWriter.name("extra_friendmoji_mutable_dict");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry : aemz.f.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aemz.g != null) {
            jsonWriter.name("extra_friendmoji_read_only_dict");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry2 : aemz.g.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                typeAdapter.write(jsonWriter, entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (aemz.h != null) {
            jsonWriter.name("added_friends_sync_token");
            jsonWriter.value(aemz.h);
        }
        if (aemz.i != null) {
            jsonWriter.name("added_friends_sync_type");
            jsonWriter.value(aemz.i);
        }
        jsonWriter.endObject();
    }
}
