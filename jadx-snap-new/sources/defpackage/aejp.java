package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aejp */
public final class aejp extends TypeAdapter<aejo> {
    private final Gson a;

    public aejp(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:87:0x0161, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aejo read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aejo;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x017b;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2000376398: goto L_0x0072;
            case -1874738390: goto L_0x0068;
            case -1811450411: goto L_0x005e;
            case -1712557995: goto L_0x0054;
            case -1305706853: goto L_0x004a;
            case -490428775: goto L_0x0040;
            case -46869191: goto L_0x0036;
            case 2009974128: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x007c;
    L_0x002c:
        r4 = "compatibility";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0034:
        r2 = 7;
        goto L_0x007d;
    L_0x0036:
        r4 = "ad_video_catalog";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x003e:
        r2 = 3;
        goto L_0x007d;
    L_0x0040:
        r4 = "get_channels";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0048:
        r2 = 0;
        goto L_0x007d;
    L_0x004a:
        r4 = "validation_endpoint";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0052:
        r2 = 4;
        goto L_0x007d;
    L_0x0054:
        r4 = "video_catalog";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x005c:
        r2 = 2;
        goto L_0x007d;
    L_0x005e:
        r4 = "get_edition";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0066:
        r2 = 1;
        goto L_0x007d;
    L_0x0068:
        r4 = "resource_parameter_value";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0070:
        r2 = 6;
        goto L_0x007d;
    L_0x0072:
        r4 = "resource_parameter_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x007a:
        r2 = 5;
        goto L_0x007d;
    L_0x007c:
        r2 = -1;
    L_0x007d:
        switch(r2) {
            case 0: goto L_0x0159;
            case 1: goto L_0x013b;
            case 2: goto L_0x011d;
            case 3: goto L_0x00ff;
            case 4: goto L_0x00e1;
            case 5: goto L_0x00c2;
            case 6: goto L_0x00a3;
            case 7: goto L_0x0084;
            default: goto L_0x0080;
        };
    L_0x0080:
        r6.skipValue();
        goto L_0x0019;
    L_0x0084:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x008e;
    L_0x008c:
        goto L_0x0161;
    L_0x008e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x009b;
    L_0x0092:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x009f;
    L_0x009b:
        r2 = r6.nextString();
    L_0x009f:
        r0.h = r2;
        goto L_0x0019;
    L_0x00a3:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ad;
    L_0x00ab:
        goto L_0x0161;
    L_0x00ad:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ba;
    L_0x00b1:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00be;
    L_0x00ba:
        r2 = r6.nextString();
    L_0x00be:
        r0.g = r2;
        goto L_0x0019;
    L_0x00c2:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cc;
    L_0x00ca:
        goto L_0x0161;
    L_0x00cc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d0:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00dd;
    L_0x00d9:
        r2 = r6.nextString();
    L_0x00dd:
        r0.f = r2;
        goto L_0x0019;
    L_0x00e1:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ea;
    L_0x00e9:
        goto L_0x0161;
    L_0x00ea:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00f7;
    L_0x00ee:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00fb;
    L_0x00f7:
        r2 = r6.nextString();
    L_0x00fb:
        r0.e = r2;
        goto L_0x0019;
    L_0x00ff:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0108;
    L_0x0107:
        goto L_0x0161;
    L_0x0108:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0115;
    L_0x010c:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0119;
    L_0x0115:
        r2 = r6.nextString();
    L_0x0119:
        r0.d = r2;
        goto L_0x0019;
    L_0x011d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0126;
    L_0x0125:
        goto L_0x0161;
    L_0x0126:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0133;
    L_0x012a:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0137;
    L_0x0133:
        r2 = r6.nextString();
    L_0x0137:
        r0.c = r2;
        goto L_0x0019;
    L_0x013b:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0144;
    L_0x0143:
        goto L_0x0161;
    L_0x0144:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0151;
    L_0x0148:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0155;
    L_0x0151:
        r2 = r6.nextString();
    L_0x0155:
        r0.b = r2;
        goto L_0x0019;
    L_0x0159:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0166;
    L_0x0161:
        r6.nextNull();
        goto L_0x0019;
    L_0x0166:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0173;
    L_0x016a:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0177;
    L_0x0173:
        r2 = r6.nextString();
    L_0x0177:
        r0.a = r2;
        goto L_0x0019;
    L_0x017b:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejp.read(com.google.gson.stream.JsonReader):aejo");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aejo aejo) {
        if (aejo == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aejo.a != null) {
            jsonWriter.name("get_channels");
            jsonWriter.value(aejo.a);
        }
        if (aejo.b != null) {
            jsonWriter.name("get_edition");
            jsonWriter.value(aejo.b);
        }
        if (aejo.c != null) {
            jsonWriter.name("video_catalog");
            jsonWriter.value(aejo.c);
        }
        if (aejo.d != null) {
            jsonWriter.name("ad_video_catalog");
            jsonWriter.value(aejo.d);
        }
        if (aejo.e != null) {
            jsonWriter.name("validation_endpoint");
            jsonWriter.value(aejo.e);
        }
        if (aejo.f != null) {
            jsonWriter.name("resource_parameter_name");
            jsonWriter.value(aejo.f);
        }
        if (aejo.g != null) {
            jsonWriter.name("resource_parameter_value");
            jsonWriter.value(aejo.g);
        }
        if (aejo.h != null) {
            jsonWriter.name("compatibility");
            jsonWriter.value(aejo.h);
        }
        jsonWriter.endObject();
    }
}
