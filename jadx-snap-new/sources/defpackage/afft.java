package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: afft */
public final class afft extends TypeAdapter<affs> {
    private final Gson a;
    private final Supplier<TypeAdapter<aenr>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenr.class)));

    public afft(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.affs read(com.google.gson.stream.JsonReader r10) {
        /*
        r9 = this;
        r0 = r10.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r10.nextNull();
        r10 = 0;
        return r10;
    L_0x000d:
        r0 = new affs;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x01d8;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case -1738831944: goto L_0x0062;
            case -1549782788: goto L_0x0058;
            case -1362753389: goto L_0x004e;
            case -1261945200: goto L_0x0044;
            case -872314113: goto L_0x003a;
            case 1858288519: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "user_owned_unlockables";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 0;
        goto L_0x006d;
    L_0x003a:
        r4 = "user_pinned_lenses";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 5;
        goto L_0x006d;
    L_0x0044:
        r4 = "user_unlocked_sticker_packs";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 4;
        goto L_0x006d;
    L_0x004e:
        r4 = "user_unlocked_filters";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 2;
        goto L_0x006d;
    L_0x0058:
        r4 = "personal_filters";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 1;
        goto L_0x006d;
    L_0x0062:
        r4 = "lens_list_signature";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 3;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x0196;
    L_0x006f:
        if (r2 == r1) goto L_0x0158;
    L_0x0071:
        if (r2 == r8) goto L_0x011a;
    L_0x0073:
        if (r2 == r7) goto L_0x00fb;
    L_0x0075:
        if (r2 == r6) goto L_0x00bc;
    L_0x0077:
        if (r2 == r5) goto L_0x007d;
    L_0x0079:
        r10.skipValue();
        goto L_0x0019;
    L_0x007d:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0087;
    L_0x0085:
        goto L_0x019e;
    L_0x0087:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x008b:
        r10.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x009b:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x00b5;
    L_0x00a1:
        r4 = r10.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00ad;
    L_0x00a9:
        r10.nextNull();
        goto L_0x009b;
    L_0x00ad:
        r4 = r3.read(r10);
        r2.add(r4);
        goto L_0x009b;
    L_0x00b5:
        r10.endArray();
        r0.f = r2;
        goto L_0x0019;
    L_0x00bc:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c6;
    L_0x00c4:
        goto L_0x019e;
    L_0x00c6:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00ca:
        r10.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00da:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x00f4;
    L_0x00e0:
        r4 = r10.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00ec;
    L_0x00e8:
        r10.nextNull();
        goto L_0x00da;
    L_0x00ec:
        r4 = r3.read(r10);
        r2.add(r4);
        goto L_0x00da;
    L_0x00f4:
        r10.endArray();
        r0.e = r2;
        goto L_0x0019;
    L_0x00fb:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0105;
    L_0x0103:
        goto L_0x019e;
    L_0x0105:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0112;
    L_0x0109:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0116;
    L_0x0112:
        r2 = r10.nextString();
    L_0x0116:
        r0.d = r2;
        goto L_0x0019;
    L_0x011a:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0123;
    L_0x0122:
        goto L_0x019e;
    L_0x0123:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0127:
        r10.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0137:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x0151;
    L_0x013d:
        r4 = r10.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0149;
    L_0x0145:
        r10.nextNull();
        goto L_0x0137;
    L_0x0149:
        r4 = r3.read(r10);
        r2.add(r4);
        goto L_0x0137;
    L_0x0151:
        r10.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x0158:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0161;
    L_0x0160:
        goto L_0x019e;
    L_0x0161:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0165:
        r10.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0175:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x018f;
    L_0x017b:
        r4 = r10.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0187;
    L_0x0183:
        r10.nextNull();
        goto L_0x0175;
    L_0x0187:
        r4 = r3.read(r10);
        r2.add(r4);
        goto L_0x0175;
    L_0x018f:
        r10.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x0196:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a3;
    L_0x019e:
        r10.nextNull();
        goto L_0x0019;
    L_0x01a3:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01a7:
        r10.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r9.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01b7:
        r4 = r10.hasNext();
        if (r4 == 0) goto L_0x01d1;
    L_0x01bd:
        r4 = r10.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01c9;
    L_0x01c5:
        r10.nextNull();
        goto L_0x01b7;
    L_0x01c9:
        r4 = r3.read(r10);
        r2.add(r4);
        goto L_0x01b7;
    L_0x01d1:
        r10.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x01d8:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afft.read(com.google.gson.stream.JsonReader):affs");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, affs affs) {
        if (affs == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (affs.a != null) {
            jsonWriter.name("user_owned_unlockables");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write : affs.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (affs.b != null) {
            jsonWriter.name("personal_filters");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write2 : affs.b) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (affs.c != null) {
            jsonWriter.name("user_unlocked_filters");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write22 : affs.c) {
                typeAdapter.write(jsonWriter, write22);
            }
            jsonWriter.endArray();
        }
        if (affs.d != null) {
            jsonWriter.name("lens_list_signature");
            jsonWriter.value(affs.d);
        }
        if (affs.e != null) {
            jsonWriter.name("user_unlocked_sticker_packs");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write222 : affs.e) {
                typeAdapter.write(jsonWriter, write222);
            }
            jsonWriter.endArray();
        }
        if (affs.f != null) {
            jsonWriter.name("user_pinned_lenses");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aenr write3 : affs.f) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
