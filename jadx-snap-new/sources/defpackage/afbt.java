package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: afbt */
public final class afbt extends TypeAdapter<afbs> {
    private final Gson a;
    private final Supplier<TypeAdapter<afbi>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbi.class)));
    private final Supplier<TypeAdapter<afbo>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbo.class)));
    private final Supplier<TypeAdapter<afbu>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(afbu.class)));

    public afbt(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:83:0x01af, code skipped:
            r7.nextNull();
     */
    /* renamed from: a */
    public final defpackage.afbs read(com.google.gson.stream.JsonReader r7) {
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
        r0 = new afbs;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x01e9;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -1891589478: goto L_0x007d;
            case -1479596984: goto L_0x0073;
            case -920232201: goto L_0x0069;
            case 109770997: goto L_0x005f;
            case 314034902: goto L_0x0055;
            case 895808750: goto L_0x004b;
            case 1127795132: goto L_0x0041;
            case 1288234221: goto L_0x0037;
            case 2080876536: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0087;
    L_0x002c:
        r4 = "intended_post_time";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0034:
        r2 = 8;
        goto L_0x0088;
    L_0x0037:
        r4 = "story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x003f:
        r2 = 4;
        goto L_0x0088;
    L_0x0041:
        r4 = "other_story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0049:
        r2 = 6;
        goto L_0x0088;
    L_0x004b:
        r4 = "friend_story_extras";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0053:
        r2 = 5;
        goto L_0x0088;
    L_0x0055:
        r4 = "friend_story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x005d:
        r2 = 1;
        goto L_0x0088;
    L_0x005f:
        r4 = "story";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0067:
        r2 = 3;
        goto L_0x0088;
    L_0x0069:
        r4 = "story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0071:
        r2 = 0;
        goto L_0x0088;
    L_0x0073:
        r4 = "other_story_notes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x007b:
        r2 = 2;
        goto L_0x0088;
    L_0x007d:
        r4 = "engagement_percentage";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0087;
    L_0x0085:
        r2 = 7;
        goto L_0x0088;
    L_0x0087:
        r2 = -1;
    L_0x0088:
        switch(r2) {
            case 0: goto L_0x01a7;
            case 1: goto L_0x0169;
            case 2: goto L_0x012b;
            case 3: goto L_0x010f;
            case 4: goto L_0x00f3;
            case 5: goto L_0x00d7;
            case 6: goto L_0x00bb;
            case 7: goto L_0x00a5;
            case 8: goto L_0x008f;
            default: goto L_0x008b;
        };
    L_0x008b:
        r7.skipValue();
        goto L_0x0019;
    L_0x008f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0099;
    L_0x0097:
        goto L_0x01af;
    L_0x0099:
        r2 = r7.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x00a5:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00af;
    L_0x00ad:
        goto L_0x01af;
    L_0x00af:
        r2 = r7.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x00bb:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c5;
    L_0x00c3:
        goto L_0x01af;
    L_0x00c5:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x00d7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00e1;
    L_0x00df:
        goto L_0x01af;
    L_0x00e1:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x00f3:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00fd;
    L_0x00fb:
        goto L_0x01af;
    L_0x00fd:
        r2 = r6.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbo) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x010f:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0119;
    L_0x0117:
        goto L_0x01af;
    L_0x0119:
        r2 = r6.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r7);
        r2 = (defpackage.afbi) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x012b:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0134;
    L_0x0133:
        goto L_0x01af;
    L_0x0134:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0138:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0148:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x0162;
    L_0x014e:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x015a;
    L_0x0156:
        r7.nextNull();
        goto L_0x0148;
    L_0x015a:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0148;
    L_0x0162:
        r7.endArray();
        r0.j = r2;
        goto L_0x0019;
    L_0x0169:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0172;
    L_0x0171:
        goto L_0x01af;
    L_0x0172:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0176:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0186:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01a0;
    L_0x018c:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0198;
    L_0x0194:
        r7.nextNull();
        goto L_0x0186;
    L_0x0198:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x0186;
    L_0x01a0:
        r7.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x01a7:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01b4;
    L_0x01af:
        r7.nextNull();
        goto L_0x0019;
    L_0x01b4:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x01b8:
        r7.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r6.d;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x01c8:
        r4 = r7.hasNext();
        if (r4 == 0) goto L_0x01e2;
    L_0x01ce:
        r4 = r7.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x01da;
    L_0x01d6:
        r7.nextNull();
        goto L_0x01c8;
    L_0x01da:
        r4 = r3.read(r7);
        r2.add(r4);
        goto L_0x01c8;
    L_0x01e2:
        r7.endArray();
        r0.h = r2;
        goto L_0x0019;
    L_0x01e9:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbt.read(com.google.gson.stream.JsonReader):afbs");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afbs afbs) {
        if (afbs == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afbs.h != null) {
            jsonWriter.name("story_notes");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (afbu write : afbs.h) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (afbs.i != null) {
            jsonWriter.name("friend_story_notes");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (afbu write2 : afbs.i) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (afbs.j != null) {
            jsonWriter.name("other_story_notes");
            typeAdapter = (TypeAdapter) this.d.get();
            jsonWriter.beginArray();
            for (afbu write22 : afbs.j) {
                typeAdapter.write(jsonWriter, write22);
            }
            jsonWriter.endArray();
        }
        if (afbs.b != null) {
            jsonWriter.name("story");
            ((TypeAdapter) this.b.get()).write(jsonWriter, afbs.b);
        }
        if (afbs.c != null) {
            jsonWriter.name("story_extras");
            ((TypeAdapter) this.c.get()).write(jsonWriter, afbs.c);
        }
        if (afbs.d != null) {
            jsonWriter.name("friend_story_extras");
            ((TypeAdapter) this.c.get()).write(jsonWriter, afbs.d);
        }
        if (afbs.e != null) {
            jsonWriter.name("other_story_extras");
            ((TypeAdapter) this.c.get()).write(jsonWriter, afbs.e);
        }
        if (afbs.f != null) {
            jsonWriter.name("engagement_percentage");
            jsonWriter.value(afbs.f);
        }
        if (afbs.g != null) {
            jsonWriter.name("intended_post_time");
            jsonWriter.value(afbs.g);
        }
        jsonWriter.endObject();
    }
}
