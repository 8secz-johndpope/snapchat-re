package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.ConfigRuleModel;

/* renamed from: aeqc */
public final class aeqc extends TypeAdapter<aeqb> {
    private final Gson a;

    public aeqc(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:69:0x0125, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aeqb read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aeqb;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x013f;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1684229801: goto L_0x0068;
            case -1498572536: goto L_0x005e;
            case 338699282: goto L_0x0054;
            case 651215103: goto L_0x004a;
            case 979623115: goto L_0x0040;
            case 1073584312: goto L_0x0036;
            case 1536908355: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0072;
    L_0x002c:
        r4 = "checksum";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 3;
        goto L_0x0073;
    L_0x0036:
        r4 = "signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x003e:
        r2 = 4;
        goto L_0x0073;
    L_0x0040:
        r4 = "resource_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0048:
        r2 = 0;
        goto L_0x0073;
    L_0x004a:
        r4 = "quality";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0052:
        r2 = 1;
        goto L_0x0073;
    L_0x0054:
        r4 = "last_updated";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x005c:
        r2 = 5;
        goto L_0x0073;
    L_0x005e:
        r4 = "algorithm_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0066:
        r2 = 6;
        goto L_0x0073;
    L_0x0068:
        r4 = "archive_link";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0072;
    L_0x0070:
        r2 = 2;
        goto L_0x0073;
    L_0x0072:
        r2 = -1;
    L_0x0073:
        switch(r2) {
            case 0: goto L_0x011d;
            case 1: goto L_0x00ff;
            case 2: goto L_0x00e1;
            case 3: goto L_0x00c3;
            case 4: goto L_0x00a5;
            case 5: goto L_0x008f;
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
        goto L_0x0125;
    L_0x0084:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x008f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x0125;
    L_0x0099:
        r2 = r6.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x00a5:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ae;
    L_0x00ad:
        goto L_0x0125;
    L_0x00ae:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00bb;
    L_0x00b2:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00bf;
    L_0x00bb:
        r2 = r6.nextString();
    L_0x00bf:
        r0.e = r2;
        goto L_0x0019;
    L_0x00c3:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cc;
    L_0x00cb:
        goto L_0x0125;
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
        r0.d = r2;
        goto L_0x0019;
    L_0x00e1:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ea;
    L_0x00e9:
        goto L_0x0125;
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
        r0.c = r2;
        goto L_0x0019;
    L_0x00ff:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0108;
    L_0x0107:
        goto L_0x0125;
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
        r0.b = r2;
        goto L_0x0019;
    L_0x011d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012a;
    L_0x0125:
        r6.nextNull();
        goto L_0x0019;
    L_0x012a:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0137;
    L_0x012e:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x013b;
    L_0x0137:
        r2 = r6.nextString();
    L_0x013b:
        r0.a = r2;
        goto L_0x0019;
    L_0x013f:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqc.read(com.google.gson.stream.JsonReader):aeqb");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeqb aeqb) {
        if (aeqb == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeqb.a != null) {
            jsonWriter.name("resource_type");
            jsonWriter.value(aeqb.a);
        }
        if (aeqb.b != null) {
            jsonWriter.name("quality");
            jsonWriter.value(aeqb.b);
        }
        if (aeqb.c != null) {
            jsonWriter.name("archive_link");
            jsonWriter.value(aeqb.c);
        }
        if (aeqb.d != null) {
            jsonWriter.name("checksum");
            jsonWriter.value(aeqb.d);
        }
        if (aeqb.e != null) {
            jsonWriter.name("signature");
            jsonWriter.value(aeqb.e);
        }
        if (aeqb.f != null) {
            jsonWriter.name(ConfigRuleModel.LAST_UPDATED);
            jsonWriter.value(aeqb.f);
        }
        if (aeqb.g != null) {
            jsonWriter.name("algorithm_version");
            jsonWriter.value(aeqb.g);
        }
        jsonWriter.endObject();
    }
}
