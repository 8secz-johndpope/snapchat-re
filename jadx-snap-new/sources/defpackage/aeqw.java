package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeqw */
public final class aeqw extends TypeAdapter<aeqv> {
    private final Gson a;
    private final Supplier<TypeAdapter<aenr>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenr.class)));

    public aeqw(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:79:0x0166, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aeqv read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aeqv;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01a0;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1738831944: goto L_0x0068;
            case -1241968251: goto L_0x005e;
            case -855335583: goto L_0x0054;
            case -818470149: goto L_0x004a;
            case -466397994: goto L_0x0040;
            case 1002235430: goto L_0x0036;
            case 1298869614: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "active_rear_lenses";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 5;
        goto L_0x0073;
    L_0x0036:
        r4 = "precached_lenses";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 1;
        goto L_0x0073;
    L_0x0040:
        r4 = "cache_ttl_millis";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 2;
        goto L_0x0073;
    L_0x004a:
        r4 = "preselected_lens_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 4;
        goto L_0x0073;
    L_0x0054:
        r4 = "median_index_depth";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 6;
        goto L_0x0073;
    L_0x005e:
        r4 = "active_lenses";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 0;
        goto L_0x0073;
    L_0x0068:
        r4 = "lens_list_signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 3;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x015e;
            case 1: goto L_0x0120;
            case 2: goto L_0x010b;
            case 3: goto L_0x00ed;
            case 4: goto L_0x00ce;
            case 5: goto L_0x008f;
            case 6: goto L_0x007a;
            default: goto L_0x0076;
        };
    L_0x0076:
        r7.skipValue();
        goto L_0x0019;
    L_0x007a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0084;
    L_0x0082:
        goto L_0x0166;
    L_0x0084:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x008f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x0166;
    L_0x0099:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x009d:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00ad:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x00c7;
    L_0x00b3:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00bf;
    L_0x00bb:
        r7.nextNull();
        goto L_0x00ad;
    L_0x00bf:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x00ad;
    L_0x00c7:
        r7.endArray();
        r0.f = r2;
        goto L_0x0019;
    L_0x00ce:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d8;
    L_0x00d6:
        goto L_0x0166;
    L_0x00d8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e5;
    L_0x00dc:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e9;
    L_0x00e5:
        r2 = r7.nextString();
    L_0x00e9:
        r0.e = r2;
        goto L_0x0019;
    L_0x00ed:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f6;
    L_0x00f5:
        goto L_0x0166;
    L_0x00f6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0103;
    L_0x00fa:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0107;
    L_0x0103:
        r2 = r7.nextString();
    L_0x0107:
        r0.d = r2;
        goto L_0x0019;
    L_0x010b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0114;
    L_0x0113:
        goto L_0x0166;
    L_0x0114:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x0120:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0129;
    L_0x0128:
        goto L_0x0166;
    L_0x0129:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x012d:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x013d:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0157;
    L_0x0143:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x014f;
    L_0x014b:
        r7.nextNull();
        goto L_0x013d;
    L_0x014f:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x013d;
    L_0x0157:
        r7.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x015e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016b;
    L_0x0166:
        r7.nextNull();
        goto L_0x0019;
    L_0x016b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x016f:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x017f:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0199;
    L_0x0185:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0191;
    L_0x018d:
        r7.nextNull();
        goto L_0x017f;
    L_0x0191:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x017f;
    L_0x0199:
        r7.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x01a0:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqw.read(com.google.gson.stream.JsonReader):aeqv");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeqv aeqv) {
        if (aeqv == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeqv.a != null) {
            jsonWriter.name("active_lenses");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write : aeqv.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeqv.b != null) {
            jsonWriter.name("precached_lenses");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write2 : aeqv.b) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aeqv.c != null) {
            jsonWriter.name("cache_ttl_millis");
            jsonWriter.value(aeqv.c);
        }
        if (aeqv.d != null) {
            jsonWriter.name("lens_list_signature");
            jsonWriter.value(aeqv.d);
        }
        if (aeqv.e != null) {
            jsonWriter.name("preselected_lens_id");
            jsonWriter.value(aeqv.e);
        }
        if (aeqv.f != null) {
            jsonWriter.name("active_rear_lenses");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write22 : aeqv.f) {
                typeAdapter.write(jsonWriter, write22);
            }
            jsonWriter.endArray();
        }
        if (aeqv.g != null) {
            jsonWriter.name("median_index_depth");
            jsonWriter.value(aeqv.g);
        }
        jsonWriter.endObject();
    }
}
