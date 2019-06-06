package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afgg */
public final class afgg extends TypeAdapter<afgf> {
    private final Gson a;

    public afgg(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:77:0x0184, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afgf read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new afgf;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0195;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2110430187: goto L_0x0093;
            case -1089766922: goto L_0x0089;
            case -242928381: goto L_0x007f;
            case -242896668: goto L_0x0075;
            case -242840930: goto L_0x006b;
            case -242813061: goto L_0x0061;
            case 1057134809: goto L_0x0057;
            case 1350384710: goto L_0x004c;
            case 1350416423: goto L_0x0041;
            case 1350472161: goto L_0x0036;
            case 1350500030: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x009d;
    L_0x002c:
        r4 = "transcoding_output_bitrate_720p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0034:
        r2 = 7;
        goto L_0x009e;
    L_0x0036:
        r4 = "transcoding_output_bitrate_640p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x003e:
        r2 = 8;
        goto L_0x009e;
    L_0x0041:
        r4 = "transcoding_output_bitrate_480p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0049:
        r2 = 9;
        goto L_0x009e;
    L_0x004c:
        r4 = "transcoding_output_bitrate_360p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0054:
        r2 = 10;
        goto L_0x009e;
    L_0x0057:
        r4 = "recording_bitrate_1080p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x005f:
        r2 = 0;
        goto L_0x009e;
    L_0x0061:
        r4 = "recording_bitrate_720p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0069:
        r2 = 1;
        goto L_0x009e;
    L_0x006b:
        r4 = "recording_bitrate_640p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0073:
        r2 = 2;
        goto L_0x009e;
    L_0x0075:
        r4 = "recording_bitrate_480p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x007d:
        r2 = 3;
        goto L_0x009e;
    L_0x007f:
        r4 = "recording_bitrate_360p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0087:
        r2 = 4;
        goto L_0x009e;
    L_0x0089:
        r4 = "transcoding_output_bitrate_1080p";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x0091:
        r2 = 6;
        goto L_0x009e;
    L_0x0093:
        r4 = "transcoding_output_width";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x009d;
    L_0x009b:
        r2 = 5;
        goto L_0x009e;
    L_0x009d:
        r2 = -1;
    L_0x009e:
        switch(r2) {
            case 0: goto L_0x017c;
            case 1: goto L_0x0167;
            case 2: goto L_0x0152;
            case 3: goto L_0x013d;
            case 4: goto L_0x0128;
            case 5: goto L_0x0113;
            case 6: goto L_0x00fe;
            case 7: goto L_0x00e8;
            case 8: goto L_0x00d2;
            case 9: goto L_0x00bc;
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
        goto L_0x0184;
    L_0x00b0:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.k = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c6;
    L_0x00c4:
        goto L_0x0184;
    L_0x00c6:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x00d2:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00dc;
    L_0x00da:
        goto L_0x0184;
    L_0x00dc:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.i = r2;
        goto L_0x0019;
    L_0x00e8:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f2;
    L_0x00f0:
        goto L_0x0184;
    L_0x00f2:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.h = r2;
        goto L_0x0019;
    L_0x00fe:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0107;
    L_0x0106:
        goto L_0x0184;
    L_0x0107:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x0113:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011c;
    L_0x011b:
        goto L_0x0184;
    L_0x011c:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0128:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0131;
    L_0x0130:
        goto L_0x0184;
    L_0x0131:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x013d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0146;
    L_0x0145:
        goto L_0x0184;
    L_0x0146:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x0152:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x015b;
    L_0x015a:
        goto L_0x0184;
    L_0x015b:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x0167:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0170;
    L_0x016f:
        goto L_0x0184;
    L_0x0170:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x017c:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0189;
    L_0x0184:
        r6.nextNull();
        goto L_0x0019;
    L_0x0189:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x0195:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afgg.read(com.google.gson.stream.JsonReader):afgf");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afgf afgf) {
        if (afgf == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afgf.a != null) {
            jsonWriter.name("recording_bitrate_1080p");
            jsonWriter.value(afgf.a);
        }
        if (afgf.b != null) {
            jsonWriter.name("recording_bitrate_720p");
            jsonWriter.value(afgf.b);
        }
        if (afgf.c != null) {
            jsonWriter.name("recording_bitrate_640p");
            jsonWriter.value(afgf.c);
        }
        if (afgf.d != null) {
            jsonWriter.name("recording_bitrate_480p");
            jsonWriter.value(afgf.d);
        }
        if (afgf.e != null) {
            jsonWriter.name("recording_bitrate_360p");
            jsonWriter.value(afgf.e);
        }
        if (afgf.f != null) {
            jsonWriter.name("transcoding_output_width");
            jsonWriter.value(afgf.f);
        }
        if (afgf.g != null) {
            jsonWriter.name("transcoding_output_bitrate_1080p");
            jsonWriter.value(afgf.g);
        }
        if (afgf.h != null) {
            jsonWriter.name("transcoding_output_bitrate_720p");
            jsonWriter.value(afgf.h);
        }
        if (afgf.i != null) {
            jsonWriter.name("transcoding_output_bitrate_640p");
            jsonWriter.value(afgf.i);
        }
        if (afgf.j != null) {
            jsonWriter.name("transcoding_output_bitrate_480p");
            jsonWriter.value(afgf.j);
        }
        if (afgf.k != null) {
            jsonWriter.name("transcoding_output_bitrate_360p");
            jsonWriter.value(afgf.k);
        }
        jsonWriter.endObject();
    }
}
