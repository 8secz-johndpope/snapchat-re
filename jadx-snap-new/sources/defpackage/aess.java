package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aess */
public final class aess extends TypeAdapter<aesr> {
    private final Gson a;
    private final Supplier<TypeAdapter<aeof>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeof.class)));

    public aess(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:107:0x01f7, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aesr read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aesr;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x0211;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1221270899: goto L_0x009e;
            case -517848601: goto L_0x0093;
            case 3355: goto L_0x0089;
            case 3575610: goto L_0x007f;
            case 30491792: goto L_0x0075;
            case 55126294: goto L_0x006a;
            case 213072007: goto L_0x0060;
            case 370959366: goto L_0x0056;
            case 976247706: goto L_0x004c;
            case 1098377527: goto L_0x0042;
            case 1982549926: goto L_0x0037;
            case 2003494359: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00a8;
    L_0x002c:
        r4 = "known_chat_sequence_numbers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0034:
        r2 = 8;
        goto L_0x00a9;
    L_0x0037:
        r4 = "seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x003f:
        r2 = 10;
        goto L_0x00a9;
    L_0x0042:
        r4 = "retried";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x004a:
        r2 = 7;
        goto L_0x00a9;
    L_0x004c:
        r4 = "chat_message_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0054:
        r2 = 0;
        goto L_0x00a9;
    L_0x0056:
        r4 = "chat_message_sender_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x005e:
        r2 = 2;
        goto L_0x00a9;
    L_0x0060:
        r4 = "chat_message_seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0068:
        r2 = 1;
        goto L_0x00a9;
    L_0x006a:
        r4 = "timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0072:
        r2 = 11;
        goto L_0x00a9;
    L_0x0075:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x007d:
        r2 = 5;
        goto L_0x00a9;
    L_0x007f:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0087:
        r2 = 3;
        goto L_0x00a9;
    L_0x0089:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x0091:
        r2 = 4;
        goto L_0x00a9;
    L_0x0093:
        r4 = "mischief_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x009b:
        r2 = 9;
        goto L_0x00a9;
    L_0x009e:
        r4 = "header";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00a8;
    L_0x00a6:
        r2 = 6;
        goto L_0x00a9;
    L_0x00a8:
        r2 = -1;
    L_0x00a9:
        switch(r2) {
            case 0: goto L_0x01ef;
            case 1: goto L_0x01da;
            case 2: goto L_0x01bc;
            case 3: goto L_0x019e;
            case 4: goto L_0x0180;
            case 5: goto L_0x0161;
            case 6: goto L_0x0145;
            case 7: goto L_0x0122;
            case 8: goto L_0x00f3;
            case 9: goto L_0x00dd;
            case 10: goto L_0x00c7;
            case 11: goto L_0x00b1;
            default: goto L_0x00ac;
        };
    L_0x00ac:
        r7.skipValue();
        goto L_0x0019;
    L_0x00b1:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00bb;
    L_0x00b9:
        goto L_0x01f7;
    L_0x00bb:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.n = r2;
        goto L_0x0019;
    L_0x00c7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d1;
    L_0x00cf:
        goto L_0x01f7;
    L_0x00d1:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x00dd:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e7;
    L_0x00e5:
        goto L_0x01f7;
    L_0x00e7:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x00f3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00fd;
    L_0x00fb:
        goto L_0x01f7;
    L_0x00fd:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x0105:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x011b;
    L_0x010b:
        r3 = r7.nextName();
        r4 = r7.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0105;
    L_0x011b:
        r7.endObject();
        r0.k = r2;
        goto L_0x0019;
    L_0x0122:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012c;
    L_0x012a:
        goto L_0x01f7;
    L_0x012c:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0139;
    L_0x0130:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x013d;
    L_0x0139:
        r2 = r7.nextBoolean();
    L_0x013d:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x0145:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014f;
    L_0x014d:
        goto L_0x01f7;
    L_0x014f:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aeof) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x0161:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016b;
    L_0x0169:
        goto L_0x01f7;
    L_0x016b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0178;
    L_0x016f:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x017c;
    L_0x0178:
        r2 = r7.nextString();
    L_0x017c:
        r0.q = r2;
        goto L_0x0019;
    L_0x0180:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0189;
    L_0x0188:
        goto L_0x01f7;
    L_0x0189:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0196;
    L_0x018d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x019a;
    L_0x0196:
        r2 = r7.nextString();
    L_0x019a:
        r0.p = r2;
        goto L_0x0019;
    L_0x019e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a7;
    L_0x01a6:
        goto L_0x01f7;
    L_0x01a7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01b4;
    L_0x01ab:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01b8;
    L_0x01b4:
        r2 = r7.nextString();
    L_0x01b8:
        r0.o = r2;
        goto L_0x0019;
    L_0x01bc:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c5;
    L_0x01c4:
        goto L_0x01f7;
    L_0x01c5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01d2;
    L_0x01c9:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01d6;
    L_0x01d2:
        r2 = r7.nextString();
    L_0x01d6:
        r0.c = r2;
        goto L_0x0019;
    L_0x01da:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e3;
    L_0x01e2:
        goto L_0x01f7;
    L_0x01e3:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x01ef:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01fc;
    L_0x01f7:
        r7.nextNull();
        goto L_0x0019;
    L_0x01fc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0209;
    L_0x0200:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x020d;
    L_0x0209:
        r2 = r7.nextString();
    L_0x020d:
        r0.a = r2;
        goto L_0x0019;
    L_0x0211:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aess.read(com.google.gson.stream.JsonReader):aesr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aesr aesr) {
        if (aesr == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aesr.a != null) {
            jsonWriter.name("chat_message_id");
            jsonWriter.value(aesr.a);
        }
        if (aesr.b != null) {
            jsonWriter.name("chat_message_seq_num");
            jsonWriter.value(aesr.b);
        }
        if (aesr.c != null) {
            jsonWriter.name("chat_message_sender_id");
            jsonWriter.value(aesr.c);
        }
        if (aesr.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aesr.o);
        }
        if (aesr.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aesr.p);
        }
        if (aesr.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aesr.q);
        }
        if (aesr.i != null) {
            jsonWriter.name("header");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aesr.i);
        }
        if (aesr.j != null) {
            jsonWriter.name("retried");
            jsonWriter.value(aesr.j.booleanValue());
        }
        if (aesr.k != null) {
            jsonWriter.name("known_chat_sequence_numbers");
            jsonWriter.beginObject();
            for (Entry entry : aesr.k.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aesr.l != null) {
            jsonWriter.name("mischief_version");
            jsonWriter.value(aesr.l);
        }
        if (aesr.m != null) {
            jsonWriter.name("seq_num");
            jsonWriter.value(aesr.m);
        }
        if (aesr.n != null) {
            jsonWriter.name("timestamp");
            jsonWriter.value(aesr.n);
        }
        jsonWriter.endObject();
    }
}
