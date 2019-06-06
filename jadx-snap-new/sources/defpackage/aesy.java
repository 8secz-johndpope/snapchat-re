package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aesy */
public final class aesy extends TypeAdapter<aesx> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeof>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeof.class)));

    public aesy(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:123:0x0244, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aesx read(com.google.gson.stream.JsonReader r7) {
        /*
        r6 = this;
        r0 = r7.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r7.nextNull();
        r7 = 0;
        return r7;
    L_0x000d:
        r0 = new aesx;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x025e;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1221270899: goto L_0x00b5;
            case -517848601: goto L_0x00aa;
            case 3355: goto L_0x00a0;
            case 3575610: goto L_0x0096;
            case 30491792: goto L_0x008c;
            case 55126294: goto L_0x0081;
            case 109757585: goto L_0x0077;
            case 213072007: goto L_0x006d;
            case 351608024: goto L_0x0063;
            case 370959366: goto L_0x0059;
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
        r2 = 0;
        goto L_0x00c1;
    L_0x0059:
        r4 = "chat_message_sender_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0061:
        r2 = 3;
        goto L_0x00c1;
    L_0x0063:
        r4 = "version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x006b:
        r2 = 2;
        goto L_0x00c1;
    L_0x006d:
        r4 = "chat_message_seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0075:
        r2 = 4;
        goto L_0x00c1;
    L_0x0077:
        r4 = "state";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x007f:
        r2 = 1;
        goto L_0x00c1;
    L_0x0081:
        r4 = "timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0089:
        r2 = 13;
        goto L_0x00c1;
    L_0x008c:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0094:
        r2 = 7;
        goto L_0x00c1;
    L_0x0096:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x009e:
        r2 = 5;
        goto L_0x00c1;
    L_0x00a0:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00a8:
        r2 = 6;
        goto L_0x00c1;
    L_0x00aa:
        r4 = "mischief_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00b2:
        r2 = 11;
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
            case 0: goto L_0x023c;
            case 1: goto L_0x021e;
            case 2: goto L_0x0209;
            case 3: goto L_0x01eb;
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
        r7.skipValue();
        goto L_0x0019;
    L_0x00c9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d3;
    L_0x00d1:
        goto L_0x0244;
    L_0x00d3:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.n = r2;
        goto L_0x0019;
    L_0x00df:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e9;
    L_0x00e7:
        goto L_0x0244;
    L_0x00e9:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x00f5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ff;
    L_0x00fd:
        goto L_0x0244;
    L_0x00ff:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x010b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0115;
    L_0x0113:
        goto L_0x0244;
    L_0x0115:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x011d:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x0133;
    L_0x0123:
        r3 = r7.nextName();
        r4 = r7.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x011d;
    L_0x0133:
        r7.endObject();
        r0.k = r2;
        goto L_0x0019;
    L_0x013a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0144;
    L_0x0142:
        goto L_0x0244;
    L_0x0144:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0151;
    L_0x0148:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0155;
    L_0x0151:
        r2 = r7.nextBoolean();
    L_0x0155:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x015d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0167;
    L_0x0165:
        goto L_0x0244;
    L_0x0167:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeof) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x0179:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0183;
    L_0x0181:
        goto L_0x0244;
    L_0x0183:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0190;
    L_0x0187:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0194;
    L_0x0190:
        r2 = r7.nextString();
    L_0x0194:
        r0.q = r2;
        goto L_0x0019;
    L_0x0198:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a2;
    L_0x01a0:
        goto L_0x0244;
    L_0x01a2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01af;
    L_0x01a6:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01b3;
    L_0x01af:
        r2 = r7.nextString();
    L_0x01b3:
        r0.p = r2;
        goto L_0x0019;
    L_0x01b7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c1;
    L_0x01bf:
        goto L_0x0244;
    L_0x01c1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01ce;
    L_0x01c5:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01d2;
    L_0x01ce:
        r2 = r7.nextString();
    L_0x01d2:
        r0.o = r2;
        goto L_0x0019;
    L_0x01d6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01df;
    L_0x01de:
        goto L_0x0244;
    L_0x01df:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x01eb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01f4;
    L_0x01f3:
        goto L_0x0244;
    L_0x01f4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0201;
    L_0x01f8:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0205;
    L_0x0201:
        r2 = r7.nextString();
    L_0x0205:
        r0.d = r2;
        goto L_0x0019;
    L_0x0209:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0212;
    L_0x0211:
        goto L_0x0244;
    L_0x0212:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x021e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0227;
    L_0x0226:
        goto L_0x0244;
    L_0x0227:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0234;
    L_0x022b:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0238;
    L_0x0234:
        r2 = r7.nextString();
    L_0x0238:
        r0.b = r2;
        goto L_0x0019;
    L_0x023c:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0249;
    L_0x0244:
        r7.nextNull();
        goto L_0x0019;
    L_0x0249:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0256;
    L_0x024d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x025a;
    L_0x0256:
        r2 = r7.nextString();
    L_0x025a:
        r0.a = r2;
        goto L_0x0019;
    L_0x025e:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aesy.read(com.google.gson.stream.JsonReader):aesx");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aesx aesx) {
        if (aesx == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aesx.a != null) {
            jsonWriter.name("chat_message_id");
            jsonWriter.value(aesx.a);
        }
        if (aesx.b != null) {
            jsonWriter.name("state");
            jsonWriter.value(aesx.b);
        }
        if (aesx.c != null) {
            jsonWriter.name("version");
            jsonWriter.value(aesx.c);
        }
        if (aesx.d != null) {
            jsonWriter.name("chat_message_sender_id");
            jsonWriter.value(aesx.d);
        }
        if (aesx.e != null) {
            jsonWriter.name("chat_message_seq_num");
            jsonWriter.value(aesx.e);
        }
        if (aesx.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aesx.o);
        }
        if (aesx.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aesx.p);
        }
        if (aesx.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aesx.q);
        }
        if (aesx.i != null) {
            jsonWriter.name("header");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aesx.i);
        }
        if (aesx.j != null) {
            jsonWriter.name("retried");
            jsonWriter.value(aesx.j.booleanValue());
        }
        if (aesx.k != null) {
            jsonWriter.name("known_chat_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry : aesx.k.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aesx.l != null) {
            jsonWriter.name("mischief_version");
            jsonWriter.value(aesx.l);
        }
        if (aesx.m != null) {
            jsonWriter.name("seq_num");
            jsonWriter.value(aesx.m);
        }
        if (aesx.n != null) {
            jsonWriter.name("timestamp");
            jsonWriter.value(aesx.n);
        }
        jsonWriter.endObject();
    }
}
