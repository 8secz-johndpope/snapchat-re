package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aehq */
public final class aehq extends TypeAdapter<aehp> {
    private final Gson a;
    private final Supplier<TypeAdapter<aexh>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexh.class)));

    public aehq(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aehp read(com.google.gson.stream.JsonReader r10) {
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
        r0 = new aehp;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0137;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case -1869711339: goto L_0x0062;
            case -1867169789: goto L_0x0058;
            case 3355: goto L_0x004e;
            case 3575610: goto L_0x0044;
            case 30491792: goto L_0x003a;
            case 1743941273: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "failure_reason";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 1;
        goto L_0x006d;
    L_0x003a:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 5;
        goto L_0x006d;
    L_0x0044:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 3;
        goto L_0x006d;
    L_0x004e:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 4;
        goto L_0x006d;
    L_0x0058:
        r4 = "success";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 0;
        goto L_0x006d;
    L_0x0062:
        r4 = "alternative_server";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 2;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x0111;
    L_0x006f:
        if (r2 == r1) goto L_0x00f3;
    L_0x0071:
        if (r2 == r8) goto L_0x00d8;
    L_0x0073:
        if (r2 == r7) goto L_0x00ba;
    L_0x0075:
        if (r2 == r6) goto L_0x009c;
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
        goto L_0x0119;
    L_0x0087:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0094;
    L_0x008b:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0098;
    L_0x0094:
        r2 = r10.nextString();
    L_0x0098:
        r0.q = r2;
        goto L_0x0019;
    L_0x009c:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a5;
    L_0x00a4:
        goto L_0x0119;
    L_0x00a5:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b2;
    L_0x00a9:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b6;
    L_0x00b2:
        r2 = r10.nextString();
    L_0x00b6:
        r0.p = r2;
        goto L_0x0019;
    L_0x00ba:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c3;
    L_0x00c2:
        goto L_0x0119;
    L_0x00c3:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d0;
    L_0x00c7:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d4;
    L_0x00d0:
        r2 = r10.nextString();
    L_0x00d4:
        r0.o = r2;
        goto L_0x0019;
    L_0x00d8:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e1;
    L_0x00e0:
        goto L_0x0119;
    L_0x00e1:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.aexh) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x00f3:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0119;
    L_0x00fc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0109;
    L_0x0100:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x010d;
    L_0x0109:
        r2 = r10.nextString();
    L_0x010d:
        r0.b = r2;
        goto L_0x0019;
    L_0x0111:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011e;
    L_0x0119:
        r10.nextNull();
        goto L_0x0019;
    L_0x011e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x012b;
    L_0x0122:
        r2 = r10.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x012f;
    L_0x012b:
        r2 = r10.nextBoolean();
    L_0x012f:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x0137:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehq.read(com.google.gson.stream.JsonReader):aehp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aehp aehp) {
        if (aehp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aehp.a != null) {
            jsonWriter.name("success");
            jsonWriter.value(aehp.a.booleanValue());
        }
        if (aehp.b != null) {
            jsonWriter.name("failure_reason");
            jsonWriter.value(aehp.b);
        }
        if (aehp.c != null) {
            jsonWriter.name("alternative_server");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aehp.c);
        }
        if (aehp.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aehp.o);
        }
        if (aehp.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aehp.p);
        }
        if (aehp.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aehp.q);
        }
        jsonWriter.endObject();
    }
}
