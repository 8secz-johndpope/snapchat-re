package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aikl */
public final class aikl extends TypeAdapter<aikk> {
    private final Gson a;

    public aikl(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:77:0x0137, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aikk read(com.google.gson.stream.JsonReader r6) {
        /*
        r5 = this;
        r0 = r6.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r6.nextNull();
        r6 = 0;
        return r6;
    L_0x000d:
        r0 = new aikk;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0151;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2104092752: goto L_0x0068;
            case -265713450: goto L_0x005e;
            case -147132913: goto L_0x0054;
            case 256495087: goto L_0x004a;
            case 414872763: goto L_0x0040;
            case 937259329: goto L_0x0036;
            case 1615086568: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 3;
        goto L_0x0073;
    L_0x0036:
        r4 = "bitmoji_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 5;
        goto L_0x0073;
    L_0x0040:
        r4 = "bitmoji_snapcode_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 6;
        goto L_0x0073;
    L_0x004a:
        r4 = "verified_user_info_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 2;
        goto L_0x0073;
    L_0x0054:
        r4 = "user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 1;
        goto L_0x0073;
    L_0x005e:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 0;
        goto L_0x0073;
    L_0x0068:
        r4 = "bitmoji_avatar_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 4;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x012f;
            case 1: goto L_0x0111;
            case 2: goto L_0x00f3;
            case 3: goto L_0x00d5;
            case 4: goto L_0x00b7;
            case 5: goto L_0x0098;
            case 6: goto L_0x007a;
            default: goto L_0x0076;
        };
    L_0x0076:
        r6.skipValue();
        goto L_0x0019;
    L_0x007a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0084;
    L_0x0082:
        goto L_0x0137;
    L_0x0084:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0091;
    L_0x0088:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0095;
    L_0x0091:
        r2 = r6.nextString();
    L_0x0095:
        r0.g = r2;
        goto L_0x0019;
    L_0x0098:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a2;
    L_0x00a0:
        goto L_0x0137;
    L_0x00a2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00af;
    L_0x00a6:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b3;
    L_0x00af:
        r2 = r6.nextString();
    L_0x00b3:
        r0.f = r2;
        goto L_0x0019;
    L_0x00b7:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c0;
    L_0x00bf:
        goto L_0x0137;
    L_0x00c0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00cd;
    L_0x00c4:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d1;
    L_0x00cd:
        r2 = r6.nextString();
    L_0x00d1:
        r0.e = r2;
        goto L_0x0019;
    L_0x00d5:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00de;
    L_0x00dd:
        goto L_0x0137;
    L_0x00de:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00eb;
    L_0x00e2:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ef;
    L_0x00eb:
        r2 = r6.nextString();
    L_0x00ef:
        r0.d = r2;
        goto L_0x0019;
    L_0x00f3:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00fc;
    L_0x00fb:
        goto L_0x0137;
    L_0x00fc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0109;
    L_0x0100:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x010d;
    L_0x0109:
        r2 = r6.nextString();
    L_0x010d:
        r0.c = r2;
        goto L_0x0019;
    L_0x0111:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011a;
    L_0x0119:
        goto L_0x0137;
    L_0x011a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0127;
    L_0x011e:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x012b;
    L_0x0127:
        r2 = r6.nextString();
    L_0x012b:
        r0.b = r2;
        goto L_0x0019;
    L_0x012f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x013c;
    L_0x0137:
        r6.nextNull();
        goto L_0x0019;
    L_0x013c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0149;
    L_0x0140:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x014d;
    L_0x0149:
        r2 = r6.nextString();
    L_0x014d:
        r0.a = r2;
        goto L_0x0019;
    L_0x0151:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aikl.read(com.google.gson.stream.JsonReader):aikk");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aikk aikk) {
        if (aikk == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aikk.a != null) {
            jsonWriter.name("username");
            jsonWriter.value(aikk.a);
        }
        if (aikk.b != null) {
            jsonWriter.name("user_id");
            jsonWriter.value(aikk.b);
        }
        if (aikk.c != null) {
            jsonWriter.name("verified_user_info_id");
            jsonWriter.value(aikk.c);
        }
        if (aikk.d != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(aikk.d);
        }
        if (aikk.e != null) {
            jsonWriter.name("bitmoji_avatar_id");
            jsonWriter.value(aikk.e);
        }
        if (aikk.f != null) {
            jsonWriter.name("bitmoji_selfie_id");
            jsonWriter.value(aikk.f);
        }
        if (aikk.g != null) {
            jsonWriter.name("bitmoji_snapcode_selfie_id");
            jsonWriter.value(aikk.g);
        }
        jsonWriter.endObject();
    }
}
