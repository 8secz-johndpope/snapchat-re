package defpackage;

import com.brightcove.player.event.EventType;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: ahex */
public final class ahex extends TypeAdapter<ahew> {
    private final Gson a;
    private final Supplier<TypeAdapter<aheu>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aheu.class)));

    public ahex(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.ahew read(com.google.gson.stream.JsonReader r9) {
        /*
        r8 = this;
        r0 = r9.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r9.nextNull();
        r9 = 0;
        return r9;
    L_0x000d:
        r0 = new ahew;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x011f;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 4;
        r6 = 3;
        r7 = 2;
        switch(r4) {
            case -340323263: goto L_0x0057;
            case 109264530: goto L_0x004d;
            case 1048029707: goto L_0x0043;
            case 1490291622: goto L_0x0039;
            case 2142644866: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0061;
    L_0x002f:
        r4 = "sent_snaps";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0037:
        r2 = 2;
        goto L_0x0062;
    L_0x0039:
        r4 = "metric_counters";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0041:
        r2 = 4;
        goto L_0x0062;
    L_0x0043:
        r4 = "received_snaps";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x004b:
        r2 = 3;
        goto L_0x0062;
    L_0x004d:
        r4 = "score";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x0055:
        r2 = 1;
        goto L_0x0062;
    L_0x0057:
        r4 = "response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0061;
    L_0x005f:
        r2 = 0;
        goto L_0x0062;
    L_0x0061:
        r2 = -1;
    L_0x0062:
        if (r2 == 0) goto L_0x00dd;
    L_0x0064:
        if (r2 == r1) goto L_0x00c8;
    L_0x0066:
        if (r2 == r7) goto L_0x00b3;
    L_0x0068:
        if (r2 == r6) goto L_0x009e;
    L_0x006a:
        if (r2 == r5) goto L_0x0070;
    L_0x006c:
        r9.skipValue();
        goto L_0x0019;
    L_0x0070:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0079;
    L_0x0078:
        goto L_0x00e5;
    L_0x0079:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x0081:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x0097;
    L_0x0087:
        r3 = r9.nextName();
        r4 = r9.nextInt();
        r4 = java.lang.Integer.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0081;
    L_0x0097:
        r9.endObject();
        r0.e = r2;
        goto L_0x0019;
    L_0x009e:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a7;
    L_0x00a6:
        goto L_0x00e5;
    L_0x00a7:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x00b3:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00e5;
    L_0x00bc:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x00c8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d1;
    L_0x00d0:
        goto L_0x00e5;
    L_0x00d1:
        r2 = r9.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x00dd:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ea;
    L_0x00e5:
        r9.nextNull();
        goto L_0x0019;
    L_0x00ea:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00ee:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00fe:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0118;
    L_0x0104:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0110;
    L_0x010c:
        r9.nextNull();
        goto L_0x00fe;
    L_0x0110:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x00fe;
    L_0x0118:
        r9.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x011f:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahex.read(com.google.gson.stream.JsonReader):ahew");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, ahew ahew) {
        if (ahew == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (ahew.a != null) {
            jsonWriter.name(EventType.RESPONSE);
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aheu write : ahew.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (ahew.b != null) {
            jsonWriter.name("score");
            jsonWriter.value(ahew.b);
        }
        if (ahew.c != null) {
            jsonWriter.name("sent_snaps");
            jsonWriter.value(ahew.c);
        }
        if (ahew.d != null) {
            jsonWriter.name("received_snaps");
            jsonWriter.value(ahew.d);
        }
        if (ahew.e != null) {
            jsonWriter.name("metric_counters");
            jsonWriter.beginObject();
            for (Entry entry : ahew.e.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
