package defpackage;

import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aegk */
public final class aegk extends TypeAdapter<aegj> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeof>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeof.class)));
    private final Supplier<TypeAdapter<aeso>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeso.class)));
    private final Supplier<TypeAdapter<aewk>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aewk.class)));

    public aegk(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:138:0x02a9, code skipped:
            r8.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aegj read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aegj;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x02c0;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1221270899: goto L_0x00b5;
            case -557067987: goto L_0x00ab;
            case -517848601: goto L_0x00a0;
            case 3355: goto L_0x0096;
            case 3029410: goto L_0x008c;
            case 3575610: goto L_0x0082;
            case 30491792: goto L_0x0078;
            case 55126294: goto L_0x006d;
            case 287706775: goto L_0x0063;
            case 411587801: goto L_0x0059;
            case 976247706: goto L_0x004f;
            case 1098377527: goto L_0x0044;
            case 1982549926: goto L_0x0039;
            case 2003494359: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00c0;
    L_0x002d:
        r4 = "known_chat_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0035:
        r2 = 10;
        goto L_0x00c1;
    L_0x0039:
        r4 = "seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0041:
        r2 = 12;
        goto L_0x00c1;
    L_0x0044:
        r4 = "retried";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x004c:
        r2 = 9;
        goto L_0x00c1;
    L_0x004f:
        r4 = "chat_message_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0057:
        r2 = 1;
        goto L_0x00c1;
    L_0x0059:
        r4 = "saved_state";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0061:
        r2 = 2;
        goto L_0x00c1;
    L_0x0063:
        r4 = "preservations";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x006b:
        r2 = 3;
        goto L_0x00c1;
    L_0x006d:
        r4 = "timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0075:
        r2 = 13;
        goto L_0x00c1;
    L_0x0078:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0080:
        r2 = 7;
        goto L_0x00c1;
    L_0x0082:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x008a:
        r2 = 5;
        goto L_0x00c1;
    L_0x008c:
        r4 = "body";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0094:
        r2 = 0;
        goto L_0x00c1;
    L_0x0096:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x009e:
        r2 = 6;
        goto L_0x00c1;
    L_0x00a0:
        r4 = "mischief_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00a8:
        r2 = 11;
        goto L_0x00c1;
    L_0x00ab:
        r4 = "last_released_seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00b3:
        r2 = 4;
        goto L_0x00c1;
    L_0x00b5:
        r4 = "header";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00bd:
        r2 = 8;
        goto L_0x00c1;
    L_0x00c0:
        r2 = -1;
    L_0x00c1:
        switch(r2) {
            case 0: goto L_0x02a1;
            case 1: goto L_0x0283;
            case 2: goto L_0x0245;
            case 3: goto L_0x0205;
            case 4: goto L_0x01d6;
            case 5: goto L_0x01b7;
            case 6: goto L_0x0198;
            case 7: goto L_0x0179;
            case 8: goto L_0x015d;
            case 9: goto L_0x013a;
            case 10: goto L_0x010b;
            case 11: goto L_0x00f5;
            case 12: goto L_0x00df;
            case 13: goto L_0x00c9;
            default: goto L_0x00c4;
        };
    L_0x00c4:
        r8.skipValue();
        goto L_0x0019;
    L_0x00c9:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d3;
    L_0x00d1:
        goto L_0x02a9;
    L_0x00d3:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.n = r2;
        goto L_0x0019;
    L_0x00df:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e9;
    L_0x00e7:
        goto L_0x02a9;
    L_0x00e9:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x00f5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ff;
    L_0x00fd:
        goto L_0x02a9;
    L_0x00ff:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x010b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0115;
    L_0x0113:
        goto L_0x02a9;
    L_0x0115:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x011d:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x0133;
    L_0x0123:
        r3 = r8.nextName();
        r4 = r8.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x011d;
    L_0x0133:
        r8.endObject();
        r0.k = r2;
        goto L_0x0019;
    L_0x013a:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0144;
    L_0x0142:
        goto L_0x02a9;
    L_0x0144:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0151;
    L_0x0148:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0155;
    L_0x0151:
        r2 = r8.nextBoolean();
    L_0x0155:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x015d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0167;
    L_0x0165:
        goto L_0x02a9;
    L_0x0167:
        r2 = r7.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aeof) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x0179:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0183;
    L_0x0181:
        goto L_0x02a9;
    L_0x0183:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0190;
    L_0x0187:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0194;
    L_0x0190:
        r2 = r8.nextString();
    L_0x0194:
        r0.q = r2;
        goto L_0x0019;
    L_0x0198:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a2;
    L_0x01a0:
        goto L_0x02a9;
    L_0x01a2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01af;
    L_0x01a6:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01b3;
    L_0x01af:
        r2 = r8.nextString();
    L_0x01b3:
        r0.p = r2;
        goto L_0x0019;
    L_0x01b7:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c1;
    L_0x01bf:
        goto L_0x02a9;
    L_0x01c1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01ce;
    L_0x01c5:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01d2;
    L_0x01ce:
        r2 = r8.nextString();
    L_0x01d2:
        r0.o = r2;
        goto L_0x0019;
    L_0x01d6:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e0;
    L_0x01de:
        goto L_0x02a9;
    L_0x01e0:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x01e8:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x01fe;
    L_0x01ee:
        r3 = r8.nextName();
        r4 = r8.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x01e8;
    L_0x01fe:
        r8.endObject();
        r0.e = r2;
        goto L_0x0019;
    L_0x0205:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x020f;
    L_0x020d:
        goto L_0x02a9;
    L_0x020f:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r8.beginObject();
    L_0x0217:
        r3 = r8.hasNext();
        if (r3 == 0) goto L_0x023e;
    L_0x021d:
        r3 = r8.nextName();
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.STRING;
        if (r4 != r5) goto L_0x0232;
    L_0x0229:
        r4 = r8.nextString();
        r4 = java.lang.Boolean.parseBoolean(r4);
        goto L_0x0236;
    L_0x0232:
        r4 = r8.nextBoolean();
    L_0x0236:
        r4 = java.lang.Boolean.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0217;
    L_0x023e:
        r8.endObject();
        r0.d = r2;
        goto L_0x0019;
    L_0x0245:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x024e;
    L_0x024d:
        goto L_0x02a9;
    L_0x024e:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x025e:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x027c;
    L_0x0264:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0274;
    L_0x0270:
        r8.nextNull();
        goto L_0x025e;
    L_0x0274:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x025e;
    L_0x027c:
        r8.endObject();
        r0.c = r2;
        goto L_0x0019;
    L_0x0283:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x028c;
    L_0x028b:
        goto L_0x02a9;
    L_0x028c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0299;
    L_0x0290:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x029d;
    L_0x0299:
        r2 = r8.nextString();
    L_0x029d:
        r0.b = r2;
        goto L_0x0019;
    L_0x02a1:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02ae;
    L_0x02a9:
        r8.nextNull();
        goto L_0x0019;
    L_0x02ae:
        r2 = r7.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aeso) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x02c0:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aegk.read(com.google.gson.stream.JsonReader):aegj");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aegj aegj) {
        if (aegj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aegj.a != null) {
            jsonWriter.name(Tags.BODY);
            ((TypeAdapter) this.c.get()).write(jsonWriter, aegj.a);
        }
        if (aegj.b != null) {
            jsonWriter.name("chat_message_id");
            jsonWriter.value(aegj.b);
        }
        if (aegj.c != null) {
            jsonWriter.name("saved_state");
            TypeAdapter typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginObject();
            for (Entry entry : aegj.c.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aegj.d != null) {
            jsonWriter.name("preservations");
            jsonWriter.beginObject();
            for (Entry entry2 : aegj.d.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value(((Boolean) entry2.getValue()).booleanValue());
            }
            jsonWriter.endObject();
        }
        if (aegj.e != null) {
            jsonWriter.name("last_released_seq_num");
            jsonWriter.beginObject();
            for (Entry entry22 : aegj.e.entrySet()) {
                jsonWriter.name((String) entry22.getKey());
                jsonWriter.value((Number) entry22.getValue());
            }
            jsonWriter.endObject();
        }
        if (aegj.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aegj.o);
        }
        if (aegj.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aegj.p);
        }
        if (aegj.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aegj.q);
        }
        if (aegj.i != null) {
            jsonWriter.name("header");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aegj.i);
        }
        if (aegj.j != null) {
            jsonWriter.name("retried");
            jsonWriter.value(aegj.j.booleanValue());
        }
        if (aegj.k != null) {
            jsonWriter.name("known_chat_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry222 : aegj.k.entrySet()) {
                jsonWriter.name((String) entry222.getKey());
                jsonWriter.value((Number) entry222.getValue());
            }
            jsonWriter.endObject();
        }
        if (aegj.l != null) {
            jsonWriter.name("mischief_version");
            jsonWriter.value(aegj.l);
        }
        if (aegj.m != null) {
            jsonWriter.name("seq_num");
            jsonWriter.value(aegj.m);
        }
        if (aegj.n != null) {
            jsonWriter.name("timestamp");
            jsonWriter.value(aegj.n);
        }
        jsonWriter.endObject();
    }
}
