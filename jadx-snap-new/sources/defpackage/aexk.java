package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: aexk */
public final class aexk extends TypeAdapter<aexj> {
    private final Gson a;

    public aexk(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aexj read(com.google.gson.stream.JsonReader r8) {
        /*
        r7 = this;
        r0 = r8.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r8.nextNull();
        r8 = 0;
        return r8;
    L_0x000d:
        r0 = new aexj;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00de;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1877659646: goto L_0x004c;
            case -1131969353: goto L_0x0042;
            case 1990570625: goto L_0x0038;
            case 2103204981: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "response_compare_result";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 2;
        goto L_0x0057;
    L_0x0038:
        r4 = "response_checksum";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 1;
        goto L_0x0057;
    L_0x0042:
        r4 = "response_compare_results_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 3;
        goto L_0x0057;
    L_0x004c:
        r4 = "server_latency";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 0;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00bc;
    L_0x0059:
        if (r2 == r1) goto L_0x009e;
    L_0x005b:
        if (r2 == r6) goto L_0x0080;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006c;
    L_0x006b:
        goto L_0x00c4;
    L_0x006c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0079;
    L_0x0070:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007d;
    L_0x0079:
        r2 = r8.nextString();
    L_0x007d:
        r0.d = r2;
        goto L_0x0019;
    L_0x0080:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0089;
    L_0x0088:
        goto L_0x00c4;
    L_0x0089:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0096;
    L_0x008d:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x009a;
    L_0x0096:
        r2 = r8.nextString();
    L_0x009a:
        r0.c = r2;
        goto L_0x0019;
    L_0x009e:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00c4;
    L_0x00a7:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b4;
    L_0x00ab:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b8;
    L_0x00b4:
        r2 = r8.nextString();
    L_0x00b8:
        r0.b = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c9;
    L_0x00c4:
        r8.nextNull();
        goto L_0x0019;
    L_0x00c9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d6;
    L_0x00cd:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00da;
    L_0x00d6:
        r2 = r8.nextString();
    L_0x00da:
        r0.a = r2;
        goto L_0x0019;
    L_0x00de:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aexk.read(com.google.gson.stream.JsonReader):aexj");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aexj aexj) {
        if (aexj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aexj.a != null) {
            jsonWriter.name("server_latency");
            jsonWriter.value(aexj.a);
        }
        if (aexj.b != null) {
            jsonWriter.name("response_checksum");
            jsonWriter.value(aexj.b);
        }
        if (aexj.c != null) {
            jsonWriter.name("response_compare_result");
            jsonWriter.value(aexj.c);
        }
        if (aexj.d != null) {
            jsonWriter.name("response_compare_results_dict");
            jsonWriter.value(aexj.d);
        }
        jsonWriter.endObject();
    }
}
