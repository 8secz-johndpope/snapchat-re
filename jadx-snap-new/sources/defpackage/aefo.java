package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aefo */
public final class aefo extends TypeAdapter<aefn> {
    private final Gson a;

    public aefo(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007d  */
    /* renamed from: a */
    public final defpackage.aefn read(com.google.gson.stream.JsonReader r7) {
        /*
        r6 = this;
        r0 = r7.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r7.nextNull();
        r7 = 0;
        return r7;
    L_0x000d:
        r0 = new aefn;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x00ae;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -2074231483; // 0xffffffff845dbd45 float:-2.6065333E-36 double:NaN;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 717598775; // 0x2ac5b037 float:3.5116503E-13 double:3.54540902E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "last_known_msg_seqs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 0;
        goto L_0x0048;
    L_0x003d:
        r4 = "last_known_update_seqs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 1;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x007d;
    L_0x004a:
        if (r2 == r1) goto L_0x0050;
    L_0x004c:
        r7.skipValue();
        goto L_0x0019;
    L_0x0050:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0059;
    L_0x0058:
        goto L_0x0085;
    L_0x0059:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x0061:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x0077;
    L_0x0067:
        r3 = r7.nextName();
        r4 = r7.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0061;
    L_0x0077:
        r7.endObject();
        r0.b = r2;
        goto L_0x0019;
    L_0x007d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0089;
    L_0x0085:
        r7.nextNull();
        goto L_0x0019;
    L_0x0089:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r7.beginObject();
    L_0x0091:
        r3 = r7.hasNext();
        if (r3 == 0) goto L_0x00a7;
    L_0x0097:
        r3 = r7.nextName();
        r4 = r7.nextLong();
        r4 = java.lang.Long.valueOf(r4);
        r2.put(r3, r4);
        goto L_0x0091;
    L_0x00a7:
        r7.endObject();
        r0.a = r2;
        goto L_0x0019;
    L_0x00ae:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefo.read(com.google.gson.stream.JsonReader):aefn");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aefn aefn) {
        if (aefn == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aefn.a != null) {
            jsonWriter.name("last_known_msg_seqs");
            jsonWriter.beginObject();
            for (Entry entry : aefn.a.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((Number) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aefn.b != null) {
            jsonWriter.name("last_known_update_seqs");
            jsonWriter.beginObject();
            for (Entry entry2 : aefn.b.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                jsonWriter.value((Number) entry2.getValue());
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
