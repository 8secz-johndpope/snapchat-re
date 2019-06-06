package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import com.snap.core.db.record.UploadedMediaModel;

/* renamed from: aema */
public final class aema extends TypeAdapter<aelz> {
    private final Gson a;
    private final Supplier<TypeAdapter<aegb>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegb.class)));
    private final Supplier<TypeAdapter<aelp>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aelp.class)));
    private final Supplier<TypeAdapter<aelr>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aelr.class)));
    private final Supplier<TypeAdapter<aemb>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemb.class)));
    private final Supplier<TypeAdapter<aemd>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aemd.class)));
    private final Supplier<TypeAdapter<afbe>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbe.class)));

    public aema(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:92:0x01c5, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aelz read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aelz;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01dc;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1840544998: goto L_0x0088;
            case -1821819624: goto L_0x007e;
            case -1559971545: goto L_0x0073;
            case -681050537: goto L_0x0068;
            case -138576613: goto L_0x005e;
            case 37109963: goto L_0x0054;
            case 567396278: goto L_0x004a;
            case 572719583: goto L_0x0040;
            case 1502956536: goto L_0x0036;
            case 1661853540: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0092;
    L_0x002c:
        r4 = "session_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0034:
        r2 = 5;
        goto L_0x0093;
    L_0x0036:
        r4 = "story_feed_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x003e:
        r2 = 1;
        goto L_0x0093;
    L_0x0040:
        r4 = "feed_items";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0048:
        r2 = 2;
        goto L_0x0093;
    L_0x004a:
        r4 = "creation_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0052:
        r2 = 4;
        goto L_0x0093;
    L_0x0054:
        r4 = "request_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x005c:
        r2 = 6;
        goto L_0x0093;
    L_0x005e:
        r4 = "chat_feed_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0066:
        r2 = 0;
        goto L_0x0093;
    L_0x0068:
        r4 = "user_signals";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0070:
        r2 = 9;
        goto L_0x0093;
    L_0x0073:
        r4 = "force_full_sync_feed_items";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x007b:
        r2 = 8;
        goto L_0x0093;
    L_0x007e:
        r4 = "ranking_metadata";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0086:
        r2 = 3;
        goto L_0x0093;
    L_0x0088:
        r4 = "debug_info";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0090:
        r2 = 7;
        goto L_0x0093;
    L_0x0092:
        r2 = -1;
    L_0x0093:
        switch(r2) {
            case 0: goto L_0x01bd;
            case 1: goto L_0x01a2;
            case 2: goto L_0x0164;
            case 3: goto L_0x0149;
            case 4: goto L_0x0133;
            case 5: goto L_0x0114;
            case 6: goto L_0x00f5;
            case 7: goto L_0x00d9;
            case 8: goto L_0x00b6;
            case 9: goto L_0x009a;
            default: goto L_0x0096;
        };
    L_0x0096:
        r7.skipValue();
        goto L_0x0019;
    L_0x009a:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a4;
    L_0x00a2:
        goto L_0x01c5;
    L_0x00a4:
        r2 = r6.f;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aemd) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x00b6:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c0;
    L_0x00be:
        goto L_0x01c5;
    L_0x00c0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00cd;
    L_0x00c4:
        r2 = r7.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00d1;
    L_0x00cd:
        r2 = r7.nextBoolean();
    L_0x00d1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.i = r2;
        goto L_0x0019;
    L_0x00d9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e3;
    L_0x00e1:
        goto L_0x01c5;
    L_0x00e3:
        r2 = r6.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aemb) r2;
        r0.h = r2;
        goto L_0x0019;
    L_0x00f5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ff;
    L_0x00fd:
        goto L_0x01c5;
    L_0x00ff:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x010c;
    L_0x0103:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0110;
    L_0x010c:
        r2 = r7.nextString();
    L_0x0110:
        r0.g = r2;
        goto L_0x0019;
    L_0x0114:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x011e;
    L_0x011c:
        goto L_0x01c5;
    L_0x011e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x012b;
    L_0x0122:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x012f;
    L_0x012b:
        r2 = r7.nextString();
    L_0x012f:
        r0.f = r2;
        goto L_0x0019;
    L_0x0133:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x013d;
    L_0x013b:
        goto L_0x01c5;
    L_0x013d:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x0149:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0152;
    L_0x0151:
        goto L_0x01c5;
    L_0x0152:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aelr) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x0164:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016d;
    L_0x016c:
        goto L_0x01c5;
    L_0x016d:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0171:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0181:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x019b;
    L_0x0187:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0193;
    L_0x018f:
        r7.nextNull();
        goto L_0x0181;
    L_0x0193:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0181;
    L_0x019b:
        r7.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x01a2:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ab;
    L_0x01aa:
        goto L_0x01c5;
    L_0x01ab:
        r2 = r6.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbe) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x01bd:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ca;
    L_0x01c5:
        r7.nextNull();
        goto L_0x0019;
    L_0x01ca:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.aegb) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x01dc:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aema.read(com.google.gson.stream.JsonReader):aelz");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aelz aelz) {
        if (aelz == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aelz.a != null) {
            jsonWriter.name("chat_feed_response");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aelz.a);
        }
        if (aelz.b != null) {
            jsonWriter.name("story_feed_response");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aelz.b);
        }
        if (aelz.c != null) {
            jsonWriter.name("feed_items");
            TypeAdapter typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aelp write : aelz.c) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aelz.d != null) {
            jsonWriter.name("ranking_metadata");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aelz.d);
        }
        if (aelz.e != null) {
            jsonWriter.name("creation_timestamp");
            jsonWriter.value(aelz.e);
        }
        if (aelz.f != null) {
            jsonWriter.name(UploadedMediaModel.SESSION_ID);
            jsonWriter.value(aelz.f);
        }
        if (aelz.g != null) {
            jsonWriter.name("request_id");
            jsonWriter.value(aelz.g);
        }
        if (aelz.h != null) {
            jsonWriter.name("debug_info");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aelz.h);
        }
        if (aelz.i != null) {
            jsonWriter.name("force_full_sync_feed_items");
            jsonWriter.value(aelz.i.booleanValue());
        }
        if (aelz.j != null) {
            jsonWriter.name("user_signals");
            ((TypeAdapter) this.f.get()).write(jsonWriter, aelz.j);
        }
        jsonWriter.endObject();
    }
}
