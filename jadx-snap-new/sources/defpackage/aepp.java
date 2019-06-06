package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aepp */
public final class aepp extends TypeAdapter<aepo> {
    private final Gson a;

    public aepp(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:99:0x01a3, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aepo read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aepo;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x01bd;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1949191675: goto L_0x0088;
            case -1923169788: goto L_0x007e;
            case -1685992454: goto L_0x0074;
            case -1658424139: goto L_0x0069;
            case -1147321230: goto L_0x005e;
            case 3355: goto L_0x0054;
            case 3575610: goto L_0x004a;
            case 109250890: goto L_0x0040;
            case 261526057: goto L_0x0036;
            case 1315628960: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0092;
    L_0x002c:
        r4 = "asset_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0034:
        r2 = 4;
        goto L_0x0093;
    L_0x0036:
        r4 = "asset_signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x003e:
        r2 = 5;
        goto L_0x0093;
    L_0x0040:
        r4 = "scale";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0048:
        r2 = 3;
        goto L_0x0093;
    L_0x004a:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0052:
        r2 = 0;
        goto L_0x0093;
    L_0x0054:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x005c:
        r2 = 1;
        goto L_0x0093;
    L_0x005e:
        r4 = "content_signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0066:
        r2 = 9;
        goto L_0x0093;
    L_0x0069:
        r4 = "original_filename";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0071:
        r2 = 8;
        goto L_0x0093;
    L_0x0074:
        r4 = "request_timing";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x007c:
        r2 = 2;
        goto L_0x0093;
    L_0x007e:
        r4 = "animation_group";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0086:
        r2 = 7;
        goto L_0x0093;
    L_0x0088:
        r4 = "preload_limit";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0090:
        r2 = 6;
        goto L_0x0093;
    L_0x0092:
        r2 = -1;
    L_0x0093:
        switch(r2) {
            case 0: goto L_0x019b;
            case 1: goto L_0x017d;
            case 2: goto L_0x015f;
            case 3: goto L_0x014a;
            case 4: goto L_0x012c;
            case 5: goto L_0x010d;
            case 6: goto L_0x00f7;
            case 7: goto L_0x00d8;
            case 8: goto L_0x00b9;
            case 9: goto L_0x009a;
            default: goto L_0x0096;
        };
    L_0x0096:
        r6.skipValue();
        goto L_0x0019;
    L_0x009a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a4;
    L_0x00a2:
        goto L_0x01a3;
    L_0x00a4:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b1;
    L_0x00a8:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b5;
    L_0x00b1:
        r2 = r6.nextString();
    L_0x00b5:
        r0.j = r2;
        goto L_0x0019;
    L_0x00b9:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c3;
    L_0x00c1:
        goto L_0x01a3;
    L_0x00c3:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d0;
    L_0x00c7:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d4;
    L_0x00d0:
        r2 = r6.nextString();
    L_0x00d4:
        r0.i = r2;
        goto L_0x0019;
    L_0x00d8:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e2;
    L_0x00e0:
        goto L_0x01a3;
    L_0x00e2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ef;
    L_0x00e6:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00f3;
    L_0x00ef:
        r2 = r6.nextString();
    L_0x00f3:
        r0.h = r2;
        goto L_0x0019;
    L_0x00f7:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0101;
    L_0x00ff:
        goto L_0x01a3;
    L_0x0101:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x010d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0117;
    L_0x0115:
        goto L_0x01a3;
    L_0x0117:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0124;
    L_0x011b:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0128;
    L_0x0124:
        r2 = r6.nextString();
    L_0x0128:
        r0.f = r2;
        goto L_0x0019;
    L_0x012c:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0135;
    L_0x0134:
        goto L_0x01a3;
    L_0x0135:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0142;
    L_0x0139:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0146;
    L_0x0142:
        r2 = r6.nextString();
    L_0x0146:
        r0.e = r2;
        goto L_0x0019;
    L_0x014a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0153;
    L_0x0152:
        goto L_0x01a3;
    L_0x0153:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x015f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0168;
    L_0x0167:
        goto L_0x01a3;
    L_0x0168:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0175;
    L_0x016c:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0179;
    L_0x0175:
        r2 = r6.nextString();
    L_0x0179:
        r0.c = r2;
        goto L_0x0019;
    L_0x017d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0186;
    L_0x0185:
        goto L_0x01a3;
    L_0x0186:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0193;
    L_0x018a:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0197;
    L_0x0193:
        r2 = r6.nextString();
    L_0x0197:
        r0.b = r2;
        goto L_0x0019;
    L_0x019b:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a8;
    L_0x01a3:
        r6.nextNull();
        goto L_0x0019;
    L_0x01a8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01b5;
    L_0x01ac:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01b9;
    L_0x01b5:
        r2 = r6.nextString();
    L_0x01b9:
        r0.a = r2;
        goto L_0x0019;
    L_0x01bd:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aepp.read(com.google.gson.stream.JsonReader):aepo");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aepo aepo) {
        if (aepo == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aepo.a != null) {
            jsonWriter.name("type");
            jsonWriter.value(aepo.a);
        }
        if (aepo.b != null) {
            jsonWriter.name("id");
            jsonWriter.value(aepo.b);
        }
        if (aepo.c != null) {
            jsonWriter.name("request_timing");
            jsonWriter.value(aepo.c);
        }
        if (aepo.d != null) {
            jsonWriter.name("scale");
            jsonWriter.value(aepo.d);
        }
        if (aepo.e != null) {
            jsonWriter.name("asset_url");
            jsonWriter.value(aepo.e);
        }
        if (aepo.f != null) {
            jsonWriter.name("asset_signature");
            jsonWriter.value(aepo.f);
        }
        if (aepo.g != null) {
            jsonWriter.name("preload_limit");
            jsonWriter.value(aepo.g);
        }
        if (aepo.h != null) {
            jsonWriter.name("animation_group");
            jsonWriter.value(aepo.h);
        }
        if (aepo.i != null) {
            jsonWriter.name("original_filename");
            jsonWriter.value(aepo.i);
        }
        if (aepo.j != null) {
            jsonWriter.name("content_signature");
            jsonWriter.value(aepo.j);
        }
        jsonWriter.endObject();
    }
}
