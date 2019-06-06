package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aecq */
public final class aecq extends TypeAdapter<aecp> {
    private final Gson a;
    private final Supplier<TypeAdapter<byte[]>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(byte[].class)));

    public aecq(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aecp read(com.google.gson.stream.JsonReader r10) {
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
        r0 = new aecp;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0133;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case -2140950846: goto L_0x0062;
            case -2114884016: goto L_0x0058;
            case -1326120259: goto L_0x004e;
            case -873696512: goto L_0x0044;
            case 109254640: goto L_0x003a;
            case 339043230: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "user_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 1;
        goto L_0x006d;
    L_0x003a:
        r4 = "sceid";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 0;
        goto L_0x006d;
    L_0x0044:
        r4 = "pixel_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 3;
        goto L_0x006d;
    L_0x004e:
        r4 = "user_data_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 4;
        goto L_0x006d;
    L_0x0058:
        r4 = "track_host_and_path";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 2;
        goto L_0x006d;
    L_0x0062:
        r4 = "user_data_v2_encrypted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 5;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x0111;
    L_0x006f:
        if (r2 == r1) goto L_0x00f3;
    L_0x0071:
        if (r2 == r8) goto L_0x00d5;
    L_0x0073:
        if (r2 == r7) goto L_0x00b7;
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
        r0.f = r2;
        goto L_0x0019;
    L_0x009c:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a5;
    L_0x00a4:
        goto L_0x0119;
    L_0x00a5:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (byte[]) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x00b7:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c0;
    L_0x00bf:
        goto L_0x0119;
    L_0x00c0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00cd;
    L_0x00c4:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d1;
    L_0x00cd:
        r2 = r10.nextString();
    L_0x00d1:
        r0.d = r2;
        goto L_0x0019;
    L_0x00d5:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00de;
    L_0x00dd:
        goto L_0x0119;
    L_0x00de:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00eb;
    L_0x00e2:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ef;
    L_0x00eb:
        r2 = r10.nextString();
    L_0x00ef:
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
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x012b;
    L_0x0122:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x012f;
    L_0x012b:
        r2 = r10.nextString();
    L_0x012f:
        r0.a = r2;
        goto L_0x0019;
    L_0x0133:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecq.read(com.google.gson.stream.JsonReader):aecp");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aecp aecp) {
        if (aecp == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aecp.a != null) {
            jsonWriter.name("sceid");
            jsonWriter.value(aecp.a);
        }
        if (aecp.b != null) {
            jsonWriter.name("user_data");
            jsonWriter.value(aecp.b);
        }
        if (aecp.c != null) {
            jsonWriter.name("track_host_and_path");
            jsonWriter.value(aecp.c);
        }
        if (aecp.d != null) {
            jsonWriter.name("pixel_token");
            jsonWriter.value(aecp.d);
        }
        if (aecp.e != null) {
            jsonWriter.name("user_data_v2");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aecp.e);
        }
        if (aecp.f != null) {
            jsonWriter.name("user_data_v2_encrypted");
            jsonWriter.value(aecp.f);
        }
        jsonWriter.endObject();
    }
}
