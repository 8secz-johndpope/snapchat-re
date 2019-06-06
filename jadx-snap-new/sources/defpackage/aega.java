package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.Map.Entry;

/* renamed from: aega */
public final class aega extends TypeAdapter<aefz> {
    private final Gson a;
    private final Supplier<TypeAdapter<aefn>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefn.class)));
    private final Supplier<TypeAdapter<aefv>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefv.class)));
    private final Supplier<TypeAdapter<aekq>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekq.class)));
    private final Supplier<TypeAdapter<aemx>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemx.class)));
    private final Supplier<TypeAdapter<ahak>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahak.class)));

    public aega(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:150:0x02c3, code skipped:
            r8.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aefz read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aefz;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x02dd;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1591688886: goto L_0x00b5;
            case -949065371: goto L_0x00aa;
            case -660277003: goto L_0x00a0;
            case -636270765: goto L_0x0095;
            case -293152067: goto L_0x008a;
            case 244678117: goto L_0x0080;
            case 807752752: goto L_0x0076;
            case 1093305826: goto L_0x006c;
            case 1135095551: goto L_0x0061;
            case 1227051610: goto L_0x0057;
            case 1519317509: goto L_0x004d;
            case 1906841425: goto L_0x0043;
            case 1909280299: goto L_0x0039;
            case 1945133929: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x00c0;
    L_0x002d:
        r4 = "fetch_reason";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0035:
        r2 = 12;
        goto L_0x00c1;
    L_0x0039:
        r4 = "group_delta_requests";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0041:
        r2 = 4;
        goto L_0x00c1;
    L_0x0043:
        r4 = "pull_to_refresh";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x004b:
        r2 = 2;
        goto L_0x00c1;
    L_0x004d:
        r4 = "checksums_dict";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0055:
        r2 = 0;
        goto L_0x00c1;
    L_0x0057:
        r4 = "features_map";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x005f:
        r2 = 1;
        goto L_0x00c1;
    L_0x0061:
        r4 = "group_pagination_type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0069:
        r2 = 11;
        goto L_0x00c1;
    L_0x006c:
        r4 = "conversation_delta_query_map";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0074:
        r2 = 7;
        goto L_0x00c1;
    L_0x0076:
        r4 = "exclude_friends";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x007e:
        r2 = 5;
        goto L_0x00c1;
    L_0x0080:
        r4 = "friends_request";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0088:
        r2 = 3;
        goto L_0x00c1;
    L_0x008a:
        r4 = "feed_delta_sync_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x0092:
        r2 = 13;
        goto L_0x00c1;
    L_0x0095:
        r4 = "feed_iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x009d:
        r2 = 9;
        goto L_0x00c1;
    L_0x00a0:
        r4 = "messages_tier";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00a8:
        r2 = 6;
        goto L_0x00c1;
    L_0x00aa:
        r4 = "conversation_snap_delta_query_map";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00b2:
        r2 = 8;
        goto L_0x00c1;
    L_0x00b5:
        r4 = "message_iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x00c0;
    L_0x00bd:
        r2 = 10;
        goto L_0x00c1;
    L_0x00c0:
        r2 = -1;
    L_0x00c1:
        switch(r2) {
            case 0: goto L_0x02bb;
            case 1: goto L_0x029d;
            case 2: goto L_0x027b;
            case 3: goto L_0x0260;
            case 4: goto L_0x0221;
            case 5: goto L_0x01fe;
            case 6: goto L_0x01df;
            case 7: goto L_0x01a0;
            case 8: goto L_0x0161;
            case 9: goto L_0x0142;
            case 10: goto L_0x0123;
            case 11: goto L_0x0104;
            case 12: goto L_0x00e5;
            case 13: goto L_0x00c9;
            default: goto L_0x00c4;
        };
    L_0x00c4:
        r8.skipValue();
        goto L_0x0019;
    L_0x00c9:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00d3;
    L_0x00d1:
        goto L_0x02c3;
    L_0x00d3:
        r2 = r7.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aekq) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x00e5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ef;
    L_0x00ed:
        goto L_0x02c3;
    L_0x00ef:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00fc;
    L_0x00f3:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0100;
    L_0x00fc:
        r2 = r8.nextString();
    L_0x0100:
        r0.m = r2;
        goto L_0x0019;
    L_0x0104:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x010e;
    L_0x010c:
        goto L_0x02c3;
    L_0x010e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x011b;
    L_0x0112:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x011f;
    L_0x011b:
        r2 = r8.nextString();
    L_0x011f:
        r0.l = r2;
        goto L_0x0019;
    L_0x0123:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x012d;
    L_0x012b:
        goto L_0x02c3;
    L_0x012d:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x013a;
    L_0x0131:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x013e;
    L_0x013a:
        r2 = r8.nextString();
    L_0x013e:
        r0.k = r2;
        goto L_0x0019;
    L_0x0142:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014c;
    L_0x014a:
        goto L_0x02c3;
    L_0x014c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0159;
    L_0x0150:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x015d;
    L_0x0159:
        r2 = r8.nextString();
    L_0x015d:
        r0.j = r2;
        goto L_0x0019;
    L_0x0161:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016b;
    L_0x0169:
        goto L_0x02c3;
    L_0x016b:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x017b:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0199;
    L_0x0181:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x0191;
    L_0x018d:
        r8.nextNull();
        goto L_0x017b;
    L_0x0191:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x017b;
    L_0x0199:
        r8.endObject();
        r0.i = r2;
        goto L_0x0019;
    L_0x01a0:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01aa;
    L_0x01a8:
        goto L_0x02c3;
    L_0x01aa:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
        r8.beginObject();
    L_0x01ba:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x01d8;
    L_0x01c0:
        r4 = r8.nextName();
        r5 = r8.peek();
        r6 = com.google.gson.stream.JsonToken.NULL;
        if (r5 != r6) goto L_0x01d0;
    L_0x01cc:
        r8.nextNull();
        goto L_0x01ba;
    L_0x01d0:
        r5 = r3.read(r8);
        r2.put(r4, r5);
        goto L_0x01ba;
    L_0x01d8:
        r8.endObject();
        r0.h = r2;
        goto L_0x0019;
    L_0x01df:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e9;
    L_0x01e7:
        goto L_0x02c3;
    L_0x01e9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x01f6;
    L_0x01ed:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x01fa;
    L_0x01f6:
        r2 = r8.nextString();
    L_0x01fa:
        r0.g = r2;
        goto L_0x0019;
    L_0x01fe:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0208;
    L_0x0206:
        goto L_0x02c3;
    L_0x0208:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0215;
    L_0x020c:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0219;
    L_0x0215:
        r2 = r8.nextBoolean();
    L_0x0219:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0221:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x022b;
    L_0x0229:
        goto L_0x02c3;
    L_0x022b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x022f:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.f;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x023f:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0259;
    L_0x0245:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0251;
    L_0x024d:
        r8.nextNull();
        goto L_0x023f;
    L_0x0251:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x023f;
    L_0x0259:
        r8.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x0260:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0269;
    L_0x0268:
        goto L_0x02c3;
    L_0x0269:
        r2 = r7.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aemx) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x027b:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0284;
    L_0x0283:
        goto L_0x02c3;
    L_0x0284:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0291;
    L_0x0288:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0295;
    L_0x0291:
        r2 = r8.nextBoolean();
    L_0x0295:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x029d:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02a6;
    L_0x02a5:
        goto L_0x02c3;
    L_0x02a6:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02b3;
    L_0x02aa:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02b7;
    L_0x02b3:
        r2 = r8.nextString();
    L_0x02b7:
        r0.b = r2;
        goto L_0x0019;
    L_0x02bb:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c8;
    L_0x02c3:
        r8.nextNull();
        goto L_0x0019;
    L_0x02c8:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x02d5;
    L_0x02cc:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x02d9;
    L_0x02d5:
        r2 = r8.nextString();
    L_0x02d9:
        r0.a = r2;
        goto L_0x0019;
    L_0x02dd:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aega.read(com.google.gson.stream.JsonReader):aefz");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aefz aefz) {
        if (aefz == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aefz.a != null) {
            jsonWriter.name("checksums_dict");
            jsonWriter.value(aefz.a);
        }
        if (aefz.b != null) {
            jsonWriter.name("features_map");
            jsonWriter.value(aefz.b);
        }
        if (aefz.c != null) {
            jsonWriter.name("pull_to_refresh");
            jsonWriter.value(aefz.c.booleanValue());
        }
        if (aefz.d != null) {
            jsonWriter.name("friends_request");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aefz.d);
        }
        if (aefz.e != null) {
            jsonWriter.name("group_delta_requests");
            typeAdapter = (TypeAdapter) this.f.get();
            jsonWriter.beginArray();
            for (ahak write : aefz.e) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aefz.f != null) {
            jsonWriter.name("exclude_friends");
            jsonWriter.value(aefz.f.booleanValue());
        }
        if (aefz.g != null) {
            jsonWriter.name("messages_tier");
            jsonWriter.value(aefz.g);
        }
        if (aefz.h != null) {
            jsonWriter.name("conversation_delta_query_map");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginObject();
            for (Entry entry : aefz.h.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                typeAdapter.write(jsonWriter, entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aefz.i != null) {
            jsonWriter.name("conversation_snap_delta_query_map");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginObject();
            for (Entry entry2 : aefz.i.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                typeAdapter.write(jsonWriter, entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (aefz.j != null) {
            jsonWriter.name("feed_iter_token");
            jsonWriter.value(aefz.j);
        }
        if (aefz.k != null) {
            jsonWriter.name("message_iter_token");
            jsonWriter.value(aefz.k);
        }
        if (aefz.l != null) {
            jsonWriter.name("group_pagination_type");
            jsonWriter.value(aefz.l);
        }
        if (aefz.m != null) {
            jsonWriter.name("fetch_reason");
            jsonWriter.value(aefz.m);
        }
        if (aefz.n != null) {
            jsonWriter.name("feed_delta_sync_token");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aefz.n);
        }
        jsonWriter.endObject();
    }
}
