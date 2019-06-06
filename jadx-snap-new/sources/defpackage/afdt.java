package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afdt */
public final class afdt extends TypeAdapter<afds> {
    private final Gson a;

    public afdt(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:117:0x01e4, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afds read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new afds;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x01fe;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -842846748: goto L_0x0092;
            case -748548589: goto L_0x0088;
            case -562167145: goto L_0x007e;
            case -429146273: goto L_0x0074;
            case 290812207: goto L_0x006a;
            case 509730443: goto L_0x0060;
            case 771803876: goto L_0x0055;
            case 1056961687: goto L_0x004b;
            case 1472780726: goto L_0x0040;
            case 1862906308: goto L_0x0036;
            case 2114795341: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x009d;
    L_0x002c:
        r4 = "encrypted_sponsored_unlockable_targeting_info_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0034:
        r2 = 3;
        goto L_0x009e;
    L_0x0036:
        r4 = "ranking_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x003e:
        r2 = 5;
        goto L_0x009e;
    L_0x0040:
        r4 = "batch_track_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0048:
        r2 = 10;
        goto L_0x009e;
    L_0x004b:
        r4 = "ad_serve_request_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0053:
        r2 = 0;
        goto L_0x009e;
    L_0x0055:
        r4 = "proto_track_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x005d:
        r2 = 9;
        goto L_0x009e;
    L_0x0060:
        r4 = "skip_track";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0068:
        r2 = 2;
        goto L_0x009e;
    L_0x006a:
        r4 = "raw_ad_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0072:
        r2 = 1;
        goto L_0x009e;
    L_0x0074:
        r4 = "ad_track_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x007c:
        r2 = 4;
        goto L_0x009e;
    L_0x007e:
        r4 = "encrypted_user_track_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0086:
        r2 = 7;
        goto L_0x009e;
    L_0x0088:
        r4 = "ranking_data";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0090:
        r2 = 6;
        goto L_0x009e;
    L_0x0092:
        r4 = "json_track_url";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x009a:
        r2 = 8;
        goto L_0x009e;
    L_0x009d:
        r2 = -1;
    L_0x009e:
        switch(r2) {
            case 0: goto L_0x01dc;
            case 1: goto L_0x01be;
            case 2: goto L_0x019c;
            case 3: goto L_0x017e;
            case 4: goto L_0x0160;
            case 5: goto L_0x0141;
            case 6: goto L_0x0122;
            case 7: goto L_0x0103;
            case 8: goto L_0x00e4;
            case 9: goto L_0x00c5;
            case 10: goto L_0x00a6;
            default: goto L_0x00a1;
        };
    L_0x00a1:
        r6.skipValue();
        goto L_0x0019;
    L_0x00a6:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00b0;
    L_0x00ae:
        goto L_0x01e4;
    L_0x00b0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00bd;
    L_0x00b4:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00c1;
    L_0x00bd:
        r2 = r6.nextString();
    L_0x00c1:
        r0.k = r2;
        goto L_0x0019;
    L_0x00c5:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cf;
    L_0x00cd:
        goto L_0x01e4;
    L_0x00cf:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00dc;
    L_0x00d3:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00e0;
    L_0x00dc:
        r2 = r6.nextString();
    L_0x00e0:
        r0.j = r2;
        goto L_0x0019;
    L_0x00e4:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ee;
    L_0x00ec:
        goto L_0x01e4;
    L_0x00ee:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00fb;
    L_0x00f2:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ff;
    L_0x00fb:
        r2 = r6.nextString();
    L_0x00ff:
        r0.i = r2;
        goto L_0x0019;
    L_0x0103:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010d;
    L_0x010b:
        goto L_0x01e4;
    L_0x010d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x011a;
    L_0x0111:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x011e;
    L_0x011a:
        r2 = r6.nextString();
    L_0x011e:
        r0.h = r2;
        goto L_0x0019;
    L_0x0122:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012c;
    L_0x012a:
        goto L_0x01e4;
    L_0x012c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0139;
    L_0x0130:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x013d;
    L_0x0139:
        r2 = r6.nextString();
    L_0x013d:
        r0.g = r2;
        goto L_0x0019;
    L_0x0141:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014b;
    L_0x0149:
        goto L_0x01e4;
    L_0x014b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0158;
    L_0x014f:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x015c;
    L_0x0158:
        r2 = r6.nextString();
    L_0x015c:
        r0.f = r2;
        goto L_0x0019;
    L_0x0160:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0169;
    L_0x0168:
        goto L_0x01e4;
    L_0x0169:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0176;
    L_0x016d:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x017a;
    L_0x0176:
        r2 = r6.nextString();
    L_0x017a:
        r0.e = r2;
        goto L_0x0019;
    L_0x017e:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0187;
    L_0x0186:
        goto L_0x01e4;
    L_0x0187:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0194;
    L_0x018b:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0198;
    L_0x0194:
        r2 = r6.nextString();
    L_0x0198:
        r0.d = r2;
        goto L_0x0019;
    L_0x019c:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a5;
    L_0x01a4:
        goto L_0x01e4;
    L_0x01a5:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01b2;
    L_0x01a9:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01b6;
    L_0x01b2:
        r2 = r6.nextBoolean();
    L_0x01b6:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x01be:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c7;
    L_0x01c6:
        goto L_0x01e4;
    L_0x01c7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01d4;
    L_0x01cb:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01d8;
    L_0x01d4:
        r2 = r6.nextString();
    L_0x01d8:
        r0.b = r2;
        goto L_0x0019;
    L_0x01dc:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e9;
    L_0x01e4:
        r6.nextNull();
        goto L_0x0019;
    L_0x01e9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01f6;
    L_0x01ed:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01fa;
    L_0x01f6:
        r2 = r6.nextString();
    L_0x01fa:
        r0.a = r2;
        goto L_0x0019;
    L_0x01fe:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdt.read(com.google.gson.stream.JsonReader):afds");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afds afds) {
        if (afds == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afds.a != null) {
            jsonWriter.name("ad_serve_request_id");
            jsonWriter.value(afds.a);
        }
        if (afds.b != null) {
            jsonWriter.name("raw_ad_data");
            jsonWriter.value(afds.b);
        }
        if (afds.c != null) {
            jsonWriter.name("skip_track");
            jsonWriter.value(afds.c.booleanValue());
        }
        if (afds.d != null) {
            jsonWriter.name("encrypted_sponsored_unlockable_targeting_info_data");
            jsonWriter.value(afds.d);
        }
        if (afds.e != null) {
            jsonWriter.name("ad_track_url");
            jsonWriter.value(afds.e);
        }
        if (afds.f != null) {
            jsonWriter.name("ranking_id");
            jsonWriter.value(afds.f);
        }
        if (afds.g != null) {
            jsonWriter.name("ranking_data");
            jsonWriter.value(afds.g);
        }
        if (afds.h != null) {
            jsonWriter.name("encrypted_user_track_data");
            jsonWriter.value(afds.h);
        }
        if (afds.i != null) {
            jsonWriter.name("json_track_url");
            jsonWriter.value(afds.i);
        }
        if (afds.j != null) {
            jsonWriter.name("proto_track_url");
            jsonWriter.value(afds.j);
        }
        if (afds.k != null) {
            jsonWriter.name("batch_track_url");
            jsonWriter.value(afds.k);
        }
        jsonWriter.endObject();
    }
}
