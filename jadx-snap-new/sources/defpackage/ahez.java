package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahez */
public final class ahez extends TypeAdapter<ahey> {
    private final Gson a;

    public ahez(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.ahey read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new ahey;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00d4;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -892481550: goto L_0x004c;
            case -287016227: goto L_0x0042;
            case 102727412: goto L_0x0038;
            case 353632266: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "achieved_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 3;
        goto L_0x0057;
    L_0x0038:
        r4 = "label";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 0;
        goto L_0x0057;
    L_0x0042:
        r4 = "unicode";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 1;
        goto L_0x0057;
    L_0x004c:
        r4 = "status";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 2;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00b2;
    L_0x0059:
        if (r2 == r1) goto L_0x0094;
    L_0x005b:
        if (r2 == r6) goto L_0x0077;
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
        goto L_0x00ba;
    L_0x006c:
        r2 = r8.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x0077:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0080;
    L_0x007f:
        goto L_0x00ba;
    L_0x0080:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x008d;
    L_0x0084:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0091;
    L_0x008d:
        r2 = r8.nextString();
    L_0x0091:
        r0.c = r2;
        goto L_0x0019;
    L_0x0094:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x009d;
    L_0x009c:
        goto L_0x00ba;
    L_0x009d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00aa;
    L_0x00a1:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ae;
    L_0x00aa:
        r2 = r8.nextString();
    L_0x00ae:
        r0.b = r2;
        goto L_0x0019;
    L_0x00b2:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00bf;
    L_0x00ba:
        r8.nextNull();
        goto L_0x0019;
    L_0x00bf:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00cc;
    L_0x00c3:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00d0;
    L_0x00cc:
        r2 = r8.nextString();
    L_0x00d0:
        r0.a = r2;
        goto L_0x0019;
    L_0x00d4:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahez.read(com.google.gson.stream.JsonReader):ahey");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahey ahey) {
        if (ahey == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahey.a != null) {
            jsonWriter.name("label");
            jsonWriter.value(ahey.a);
        }
        if (ahey.b != null) {
            jsonWriter.name("unicode");
            jsonWriter.value(ahey.b);
        }
        if (ahey.c != null) {
            jsonWriter.name("status");
            jsonWriter.value(ahey.c);
        }
        if (ahey.d != null) {
            jsonWriter.name("achieved_timestamp");
            jsonWriter.value(ahey.d);
        }
        jsonWriter.endObject();
    }
}
