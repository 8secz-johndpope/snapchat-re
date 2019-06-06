package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aggs */
public final class aggs extends TypeAdapter<aggr> {
    private final Gson a;
    private final Supplier<TypeAdapter<aggp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aggp.class)));
    private final Supplier<TypeAdapter<aggt>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aggt.class)));

    public aggs(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aggr read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aggr;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0119;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1771191423; // 0xffffffff966dc381 float:-1.9206398E-25 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = 912421092; // 0x366270e4 float:3.3742335E-6 double:4.50795916E-315;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 1842039021; // 0x6dcb48ed float:7.8642024E27 double:9.100881986E-315;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "url_match_patterns";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 0;
        goto L_0x0058;
    L_0x0043:
        r4 = "route_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 2;
        goto L_0x0058;
    L_0x004d:
        r4 = "route_rules";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 1;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00de;
    L_0x005a:
        if (r2 == r1) goto L_0x00a0;
    L_0x005c:
        if (r2 == r6) goto L_0x0062;
    L_0x005e:
        r8.skipValue();
        goto L_0x0019;
    L_0x0062:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006b;
    L_0x006a:
        goto L_0x00e6;
    L_0x006b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x006f:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x007f:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0099;
    L_0x0085:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0091;
    L_0x008d:
        r8.nextNull();
        goto L_0x007f;
    L_0x0091:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x007f;
    L_0x0099:
        r8.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x00a0:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00e6;
    L_0x00a9:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00ad:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00bd:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00d7;
    L_0x00c3:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00cf;
    L_0x00cb:
        r8.nextNull();
        goto L_0x00bd;
    L_0x00cf:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x00bd;
    L_0x00d7:
        r8.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x00de:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00eb;
    L_0x00e6:
        r8.nextNull();
        goto L_0x0019;
    L_0x00eb:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00ef:
        r8.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x00f7:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0112;
    L_0x00fd:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x010a;
    L_0x0101:
        r4 = r8.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x010e;
    L_0x010a:
        r4 = r8.nextString();
    L_0x010e:
        r3.add(r4);
        goto L_0x00f7;
    L_0x0112:
        r8.endArray();
        r0.a = r3;
        goto L_0x0019;
    L_0x0119:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggs.read(com.google.gson.stream.JsonReader):aggr");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aggr aggr) {
        if (aggr == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aggr.a != null) {
            jsonWriter.name("url_match_patterns");
            jsonWriter.beginArray();
            for (String value : aggr.a) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aggr.b != null) {
            jsonWriter.name("route_rules");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aggt write : aggr.b) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aggr.c != null) {
            jsonWriter.name("route_info");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aggp write2 : aggr.c) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
