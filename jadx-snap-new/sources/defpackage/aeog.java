package defpackage;

import com.coremedia.iso.boxes.AuthorBox;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeog */
public final class aeog extends TypeAdapter<aeof> {
    private final Gson a;
    private final Supplier<TypeAdapter<aexp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexp.class)));

    public aeog(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aeof read(com.google.gson.stream.JsonReader r10) {
        /*
        r9 = this;
        r0 = r10.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r10.nextNull();
        r10 = 0;
        return r10;
    L_0x000d:
        r0 = new aeof;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0147;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case 3707: goto L_0x0062;
            case 3005864: goto L_0x0058;
            case 3151786: goto L_0x004e;
            case 3242279: goto L_0x0044;
            case 948812179: goto L_0x003a;
            case 951584262: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "conv_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 2;
        goto L_0x006d;
    L_0x003a:
        r4 = "conn_seq_num";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 5;
        goto L_0x006d;
    L_0x0044:
        r4 = "isv3";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 3;
        goto L_0x006d;
    L_0x004e:
        r4 = "from";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 0;
        goto L_0x006d;
    L_0x0058:
        r4 = "auth";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 4;
        goto L_0x006d;
    L_0x0062:
        r4 = "to";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 1;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x0125;
    L_0x006f:
        if (r2 == r1) goto L_0x00ee;
    L_0x0071:
        if (r2 == r8) goto L_0x00d0;
    L_0x0073:
        if (r2 == r7) goto L_0x00ae;
    L_0x0075:
        if (r2 == r6) goto L_0x0092;
    L_0x0077:
        if (r2 == r5) goto L_0x007d;
    L_0x0079:
        r10.skipValue();
        goto L_0x0019;
    L_0x007d:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0087;
    L_0x0085:
        goto L_0x012d;
    L_0x0087:
        r2 = r10.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0092:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x009c;
    L_0x009a:
        goto L_0x012d;
    L_0x009c:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.aexp) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x00ae:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b7;
    L_0x00b6:
        goto L_0x012d;
    L_0x00b7:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00c4;
    L_0x00bb:
        r2 = r10.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00c8;
    L_0x00c4:
        r2 = r10.nextBoolean();
    L_0x00c8:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x00d0:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d8:
        goto L_0x012d;
    L_0x00d9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00e6;
    L_0x00dd:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ea;
    L_0x00e6:
        r2 = r10.nextString();
    L_0x00ea:
        r0.c = r2;
        goto L_0x0019;
    L_0x00ee:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f7;
    L_0x00f6:
        goto L_0x012d;
    L_0x00f7:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00fb:
        r10.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0103:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x011e;
    L_0x0109:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0116;
    L_0x010d:
        r4 = r10.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x011a;
    L_0x0116:
        r4 = r10.nextString();
    L_0x011a:
        r3.add(r4);
        goto L_0x0103;
    L_0x011e:
        r10.endArray();
        r0.b = r3;
        goto L_0x0019;
    L_0x0125:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0132;
    L_0x012d:
        r10.nextNull();
        goto L_0x0019;
    L_0x0132:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x013f;
    L_0x0136:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0143;
    L_0x013f:
        r2 = r10.nextString();
    L_0x0143:
        r0.a = r2;
        goto L_0x0019;
    L_0x0147:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeog.read(com.google.gson.stream.JsonReader):aeof");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeof aeof) {
        if (aeof == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeof.a != null) {
            jsonWriter.name("from");
            jsonWriter.value(aeof.a);
        }
        if (aeof.b != null) {
            jsonWriter.name("to");
            jsonWriter.beginArray();
            for (String value : aeof.b) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aeof.c != null) {
            jsonWriter.name("conv_id");
            jsonWriter.value(aeof.c);
        }
        if (aeof.d != null) {
            jsonWriter.name("isv3");
            jsonWriter.value(aeof.d.booleanValue());
        }
        if (aeof.e != null) {
            jsonWriter.name(AuthorBox.TYPE);
            ((TypeAdapter) this.b.get()).write(jsonWriter, aeof.e);
        }
        if (aeof.f != null) {
            jsonWriter.name("conn_seq_num");
            jsonWriter.value(aeof.f);
        }
        jsonWriter.endObject();
    }
}
