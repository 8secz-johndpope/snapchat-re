package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.StorySyncStateModel;

/* renamed from: aheo */
public final class aheo extends TypeAdapter<ahen> {
    private final Gson a;

    public aheo(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:117:0x01e4, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.ahen read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new ahen;
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
            case -2104092752: goto L_0x0093;
            case -2023621058: goto L_0x0089;
            case -964085839: goto L_0x007e;
            case -836030906: goto L_0x0074;
            case -573809741: goto L_0x0069;
            case -450004177: goto L_0x005f;
            case -265713450: goto L_0x0055;
            case 414872763: goto L_0x004b;
            case 880596744: goto L_0x0040;
            case 937259329: goto L_0x0036;
            case 1615086568: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x009d;
    L_0x002c:
        r4 = "display_name";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0034:
        r2 = 2;
        goto L_0x009e;
    L_0x0036:
        r4 = "bitmoji_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x003e:
        r2 = 6;
        goto L_0x009e;
    L_0x0040:
        r4 = "is_popular_accout";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0048:
        r2 = 9;
        goto L_0x009e;
    L_0x004b:
        r4 = "bitmoji_snapcode_selfie_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0053:
        r2 = 7;
        goto L_0x009e;
    L_0x0055:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x005d:
        r2 = 1;
        goto L_0x009e;
    L_0x005f:
        r4 = "metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0067:
        r2 = 5;
        goto L_0x009e;
    L_0x0069:
        r4 = "display_username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0071:
        r2 = 10;
        goto L_0x009e;
    L_0x0074:
        r4 = "userId";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x007c:
        r2 = 0;
        goto L_0x009e;
    L_0x007e:
        r4 = "emoji_symbol";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0086:
        r2 = 8;
        goto L_0x009e;
    L_0x0089:
        r4 = "story_privacy";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0091:
        r2 = 3;
        goto L_0x009e;
    L_0x0093:
        r4 = "bitmoji_avatar_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x009b:
        r2 = 4;
        goto L_0x009e;
    L_0x009d:
        r2 = -1;
    L_0x009e:
        switch(r2) {
            case 0: goto L_0x01dc;
            case 1: goto L_0x01be;
            case 2: goto L_0x01a0;
            case 3: goto L_0x0182;
            case 4: goto L_0x0164;
            case 5: goto L_0x0145;
            case 6: goto L_0x0126;
            case 7: goto L_0x0107;
            case 8: goto L_0x00e8;
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
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00dc;
    L_0x00d3:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00e0;
    L_0x00dc:
        r2 = r6.nextBoolean();
    L_0x00e0:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x00e8:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f2;
    L_0x00f0:
        goto L_0x01e4;
    L_0x00f2:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ff;
    L_0x00f6:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0103;
    L_0x00ff:
        r2 = r6.nextString();
    L_0x0103:
        r0.i = r2;
        goto L_0x0019;
    L_0x0107:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0111;
    L_0x010f:
        goto L_0x01e4;
    L_0x0111:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x011e;
    L_0x0115:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0122;
    L_0x011e:
        r2 = r6.nextString();
    L_0x0122:
        r0.h = r2;
        goto L_0x0019;
    L_0x0126:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0130;
    L_0x012e:
        goto L_0x01e4;
    L_0x0130:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x013d;
    L_0x0134:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0141;
    L_0x013d:
        r2 = r6.nextString();
    L_0x0141:
        r0.g = r2;
        goto L_0x0019;
    L_0x0145:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014f;
    L_0x014d:
        goto L_0x01e4;
    L_0x014f:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x015c;
    L_0x0153:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0160;
    L_0x015c:
        r2 = r6.nextString();
    L_0x0160:
        r0.f = r2;
        goto L_0x0019;
    L_0x0164:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016d;
    L_0x016c:
        goto L_0x01e4;
    L_0x016d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x017a;
    L_0x0171:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x017e;
    L_0x017a:
        r2 = r6.nextString();
    L_0x017e:
        r0.e = r2;
        goto L_0x0019;
    L_0x0182:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x018b;
    L_0x018a:
        goto L_0x01e4;
    L_0x018b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0198;
    L_0x018f:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x019c;
    L_0x0198:
        r2 = r6.nextString();
    L_0x019c:
        r0.d = r2;
        goto L_0x0019;
    L_0x01a0:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a9;
    L_0x01a8:
        goto L_0x01e4;
    L_0x01a9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01b6;
    L_0x01ad:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01ba;
    L_0x01b6:
        r2 = r6.nextString();
    L_0x01ba:
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aheo.read(com.google.gson.stream.JsonReader):ahen");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahen ahen) {
        if (ahen == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahen.a != null) {
            jsonWriter.name("userId");
            jsonWriter.value(ahen.a);
        }
        if (ahen.b != null) {
            jsonWriter.name("username");
            jsonWriter.value(ahen.b);
        }
        if (ahen.c != null) {
            jsonWriter.name("display_name");
            jsonWriter.value(ahen.c);
        }
        if (ahen.d != null) {
            jsonWriter.name("story_privacy");
            jsonWriter.value(ahen.d);
        }
        if (ahen.e != null) {
            jsonWriter.name("bitmoji_avatar_id");
            jsonWriter.value(ahen.e);
        }
        if (ahen.f != null) {
            jsonWriter.name(StorySyncStateModel.METADATA);
            jsonWriter.value(ahen.f);
        }
        if (ahen.g != null) {
            jsonWriter.name("bitmoji_selfie_id");
            jsonWriter.value(ahen.g);
        }
        if (ahen.h != null) {
            jsonWriter.name("bitmoji_snapcode_selfie_id");
            jsonWriter.value(ahen.h);
        }
        if (ahen.i != null) {
            jsonWriter.name("emoji_symbol");
            jsonWriter.value(ahen.i);
        }
        if (ahen.j != null) {
            jsonWriter.name("is_popular_accout");
            jsonWriter.value(ahen.j.booleanValue());
        }
        if (ahen.k != null) {
            jsonWriter.name("display_username");
            jsonWriter.value(ahen.k);
        }
        jsonWriter.endObject();
    }
}
