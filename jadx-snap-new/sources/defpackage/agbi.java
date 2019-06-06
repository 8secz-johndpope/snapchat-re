package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agbi */
public final class agbi extends TypeAdapter<agbh> {
    private final Gson a;
    private final Supplier<TypeAdapter<agbj>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agbj.class)));

    public agbi(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:92:0x018a, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.agbh read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new agbh;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01a4;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2080936664: goto L_0x0072;
            case -1708833845: goto L_0x0068;
            case -605654343: goto L_0x005e;
            case -53317599: goto L_0x0054;
            case 369455310: goto L_0x004a;
            case 621891667: goto L_0x0040;
            case 1303287530: goto L_0x0036;
            case 1536908355: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x007c;
    L_0x002c:
        r4 = "checksum";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0034:
        r2 = 0;
        goto L_0x007d;
    L_0x0036:
        r4 = "request_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x003e:
        r2 = 2;
        goto L_0x007d;
    L_0x0040:
        r4 = "sync_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0048:
        r2 = 1;
        goto L_0x007d;
    L_0x004a:
        r4 = "should_return_story_scores";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0052:
        r2 = 4;
        goto L_0x007d;
    L_0x0054:
        r4 = "mob_story_types_to_rank";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x005c:
        r2 = 3;
        goto L_0x007d;
    L_0x005e:
        r4 = "checksum_missing_reason";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0066:
        r2 = 6;
        goto L_0x007d;
    L_0x0068:
        r4 = "request_source";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0070:
        r2 = 7;
        goto L_0x007d;
    L_0x0072:
        r4 = "mischief_id_in_order_resp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x007a:
        r2 = 5;
        goto L_0x007d;
    L_0x007c:
        r2 = -1;
    L_0x007d:
        switch(r2) {
            case 0: goto L_0x0182;
            case 1: goto L_0x0164;
            case 2: goto L_0x0146;
            case 3: goto L_0x0108;
            case 4: goto L_0x00e5;
            case 5: goto L_0x00c2;
            case 6: goto L_0x00a3;
            case 7: goto L_0x0084;
            default: goto L_0x0080;
        };
    L_0x0080:
        r7.skipValue();
        goto L_0x0019;
    L_0x0084:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x008e;
    L_0x008c:
        goto L_0x018a;
    L_0x008e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x009b;
    L_0x0092:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x009f;
    L_0x009b:
        r2 = r7.nextString();
    L_0x009f:
        r0.h = r2;
        goto L_0x0019;
    L_0x00a3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ad;
    L_0x00ab:
        goto L_0x018a;
    L_0x00ad:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ba;
    L_0x00b1:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00be;
    L_0x00ba:
        r2 = r7.nextString();
    L_0x00be:
        r0.g = r2;
        goto L_0x0019;
    L_0x00c2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cc;
    L_0x00ca:
        goto L_0x018a;
    L_0x00cc:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d0:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00dd;
    L_0x00d9:
        r2 = r7.nextBoolean();
    L_0x00dd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x00e5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ef;
    L_0x00ed:
        goto L_0x018a;
    L_0x00ef:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00fc;
    L_0x00f3:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0100;
    L_0x00fc:
        r2 = r7.nextBoolean();
    L_0x0100:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x0108:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0111;
    L_0x0110:
        goto L_0x018a;
    L_0x0111:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0115:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0125:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x013f;
    L_0x012b:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0137;
    L_0x0133:
        r7.nextNull();
        goto L_0x0125;
    L_0x0137:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0125;
    L_0x013f:
        r7.endArray();
        r0.d = r2;
        goto L_0x0019;
    L_0x0146:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014f;
    L_0x014e:
        goto L_0x018a;
    L_0x014f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x015c;
    L_0x0153:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0160;
    L_0x015c:
        r2 = r7.nextString();
    L_0x0160:
        r0.c = r2;
        goto L_0x0019;
    L_0x0164:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016d;
    L_0x016c:
        goto L_0x018a;
    L_0x016d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x017a;
    L_0x0171:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x017e;
    L_0x017a:
        r2 = r7.nextString();
    L_0x017e:
        r0.b = r2;
        goto L_0x0019;
    L_0x0182:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x018f;
    L_0x018a:
        r7.nextNull();
        goto L_0x0019;
    L_0x018f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x019c;
    L_0x0193:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01a0;
    L_0x019c:
        r2 = r7.nextString();
    L_0x01a0:
        r0.a = r2;
        goto L_0x0019;
    L_0x01a4:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agbi.read(com.google.gson.stream.JsonReader):agbh");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agbh agbh) {
        if (agbh == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agbh.a != null) {
            jsonWriter.name("checksum");
            jsonWriter.value(agbh.a);
        }
        if (agbh.b != null) {
            jsonWriter.name("sync_metadata");
            jsonWriter.value(agbh.b);
        }
        if (agbh.c != null) {
            jsonWriter.name("request_type");
            jsonWriter.value(agbh.c);
        }
        if (agbh.d != null) {
            jsonWriter.name("mob_story_types_to_rank");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (agbj write : agbh.d) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (agbh.e != null) {
            jsonWriter.name("should_return_story_scores");
            jsonWriter.value(agbh.e.booleanValue());
        }
        if (agbh.f != null) {
            jsonWriter.name("mischief_id_in_order_resp");
            jsonWriter.value(agbh.f.booleanValue());
        }
        if (agbh.g != null) {
            jsonWriter.name("checksum_missing_reason");
            jsonWriter.value(agbh.g);
        }
        if (agbh.h != null) {
            jsonWriter.name("request_source");
            jsonWriter.value(agbh.h);
        }
        jsonWriter.endObject();
    }
}
