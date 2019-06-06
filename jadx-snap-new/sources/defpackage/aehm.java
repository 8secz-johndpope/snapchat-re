package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aehm */
public final class aehm extends TypeAdapter<aehl> {
    private final Gson a;
    private final Supplier<TypeAdapter<afbi>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbi.class)));
    private final Supplier<TypeAdapter<afbm>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbm.class)));
    private final Supplier<TypeAdapter<afbo>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbo.class)));
    private final Supplier<TypeAdapter<afbu>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbu.class)));

    public aehm(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:98:0x01f7, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aehl read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new aehl;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x020e;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2062946298: goto L_0x0088;
            case -1891589478: goto L_0x007e;
            case -1479596984: goto L_0x0073;
            case -920232201: goto L_0x0069;
            case 109770997: goto L_0x005f;
            case 314034902: goto L_0x0054;
            case 895808750: goto L_0x004a;
            case 1127795132: goto L_0x0040;
            case 1288234221: goto L_0x0036;
            case 2080876536: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0092;
    L_0x002c:
        r4 = "intended_post_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0034:
        r2 = 6;
        goto L_0x0093;
    L_0x0036:
        r4 = "story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x003e:
        r2 = 2;
        goto L_0x0093;
    L_0x0040:
        r4 = "other_story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0048:
        r2 = 4;
        goto L_0x0093;
    L_0x004a:
        r4 = "friend_story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0052:
        r2 = 3;
        goto L_0x0093;
    L_0x0054:
        r4 = "friend_story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x005c:
        r2 = 8;
        goto L_0x0093;
    L_0x005f:
        r4 = "story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0067:
        r2 = 1;
        goto L_0x0093;
    L_0x0069:
        r4 = "story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0071:
        r2 = 7;
        goto L_0x0093;
    L_0x0073:
        r4 = "other_story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x007b:
        r2 = 9;
        goto L_0x0093;
    L_0x007e:
        r4 = "engagement_percentage";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0086:
        r2 = 5;
        goto L_0x0093;
    L_0x0088:
        r4 = "collaborator";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0092;
    L_0x0090:
        r2 = 0;
        goto L_0x0093;
    L_0x0092:
        r2 = -1;
    L_0x0093:
        switch(r2) {
            case 0: goto L_0x01ef;
            case 1: goto L_0x01d4;
            case 2: goto L_0x01b9;
            case 3: goto L_0x019e;
            case 4: goto L_0x0183;
            case 5: goto L_0x016d;
            case 6: goto L_0x0157;
            case 7: goto L_0x0118;
            case 8: goto L_0x00d9;
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
        goto L_0x01f7;
    L_0x00a4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00a8:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00b8:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x00d2;
    L_0x00be:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00ca;
    L_0x00c6:
        r7.nextNull();
        goto L_0x00b8;
    L_0x00ca:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x00b8;
    L_0x00d2:
        r7.endArray();
        r0.j = r2;
        goto L_0x0019;
    L_0x00d9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e3;
    L_0x00e1:
        goto L_0x01f7;
    L_0x00e3:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00e7:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00f7:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0111;
    L_0x00fd:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0109;
    L_0x0105:
        r7.nextNull();
        goto L_0x00f7;
    L_0x0109:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x00f7;
    L_0x0111:
        r7.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x0118:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0122;
    L_0x0120:
        goto L_0x01f7;
    L_0x0122:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0126:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.e;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0136:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0150;
    L_0x013c:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0148;
    L_0x0144:
        r7.nextNull();
        goto L_0x0136;
    L_0x0148:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0136;
    L_0x0150:
        r7.endArray();
        r0.h = r2;
        goto L_0x0019;
    L_0x0157:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0161;
    L_0x015f:
        goto L_0x01f7;
    L_0x0161:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x016d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0177;
    L_0x0175:
        goto L_0x01f7;
    L_0x0177:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x0183:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x018c;
    L_0x018b:
        goto L_0x01f7;
    L_0x018c:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x019e:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a7;
    L_0x01a6:
        goto L_0x01f7;
    L_0x01a7:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x01b9:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01c2;
    L_0x01c1:
        goto L_0x01f7;
    L_0x01c2:
        r2 = r6.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x01d4:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01dd;
    L_0x01dc:
        goto L_0x01f7;
    L_0x01dd:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbi) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x01ef:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01fc;
    L_0x01f7:
        r7.nextNull();
        goto L_0x0019;
    L_0x01fc:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbm) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x020e:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aehm.read(com.google.gson.stream.JsonReader):aehl");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aehl aehl) {
        if (aehl == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aehl.a != null) {
            jsonWriter.name("collaborator");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aehl.a);
        }
        if (aehl.b != null) {
            jsonWriter.name("story");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aehl.b);
        }
        if (aehl.c != null) {
            jsonWriter.name("story_extras");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aehl.c);
        }
        if (aehl.d != null) {
            jsonWriter.name("friend_story_extras");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aehl.d);
        }
        if (aehl.e != null) {
            jsonWriter.name("other_story_extras");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aehl.e);
        }
        if (aehl.f != null) {
            jsonWriter.name("engagement_percentage");
            jsonWriter.value(aehl.f);
        }
        if (aehl.g != null) {
            jsonWriter.name("intended_post_time");
            jsonWriter.value(aehl.g);
        }
        if (aehl.h != null) {
            jsonWriter.name("story_notes");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (afbu write : aehl.h) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aehl.i != null) {
            jsonWriter.name("friend_story_notes");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (afbu write2 : aehl.i) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aehl.j != null) {
            jsonWriter.name("other_story_notes");
            typeAdapter = (TypeAdapter) this.e.get();
            jsonWriter.beginArray();
            for (afbu write3 : aehl.j) {
                typeAdapter.write(jsonWriter, write3);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
