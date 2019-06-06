package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: agfb */
public final class agfb extends TypeAdapter<agfa> {
    private final Gson a;
    private final Supplier<TypeAdapter<agff>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(agff.class)));

    public agfb(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.agfa read(com.google.gson.stream.JsonReader r10) {
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
        r0 = new agfa;
        r0.<init>();
        r1 = 1;
        r10.setLenient(r1);
        r10.beginObject();
    L_0x0019:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0126;
    L_0x001f:
        r2 = r10.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 5;
        r6 = 4;
        r7 = 3;
        r8 = 2;
        switch(r4) {
            case -700560988: goto L_0x0062;
            case -275830672: goto L_0x0058;
            case 106006350: goto L_0x004e;
            case 400194325: goto L_0x0044;
            case 710689355: goto L_0x003a;
            case 1104007258: goto L_0x0030;
            default: goto L_0x002f;
        };
    L_0x002f:
        goto L_0x006c;
    L_0x0030:
        r4 = "num_stories_always_precached";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0038:
        r2 = 2;
        goto L_0x006d;
    L_0x003a:
        r4 = "num_snaps_to_load_before_allow_viewing";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0042:
        r2 = 5;
        goto L_0x006d;
    L_0x0044:
        r4 = "tap_to_load_counts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x004c:
        r2 = 0;
        goto L_0x006d;
    L_0x004e:
        r4 = "order";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = 4;
        goto L_0x006d;
    L_0x0058:
        r4 = "num_snaps_per_story_always_precached";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x0060:
        r2 = 3;
        goto L_0x006d;
    L_0x0062:
        r4 = "inline_forward_precache_counts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x006c;
    L_0x006a:
        r2 = 1;
        goto L_0x006d;
    L_0x006c:
        r2 = -1;
    L_0x006d:
        if (r2 == 0) goto L_0x0107;
    L_0x006f:
        if (r2 == r1) goto L_0x00ec;
    L_0x0071:
        if (r2 == r8) goto L_0x00d1;
    L_0x0073:
        if (r2 == r7) goto L_0x00b6;
    L_0x0075:
        if (r2 == r6) goto L_0x0098;
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
        goto L_0x010f;
    L_0x0087:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.agff) r2;
        r0.f = r2;
        goto L_0x0019;
    L_0x0098:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a1;
    L_0x00a0:
        goto L_0x010f;
    L_0x00a1:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ae;
    L_0x00a5:
        r2 = r10.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00b2;
    L_0x00ae:
        r2 = r10.nextString();
    L_0x00b2:
        r0.e = r2;
        goto L_0x0019;
    L_0x00b6:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00bf;
    L_0x00be:
        goto L_0x010f;
    L_0x00bf:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.agff) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x00d1:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00da;
    L_0x00d9:
        goto L_0x010f;
    L_0x00da:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.agff) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x00ec:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f5;
    L_0x00f4:
        goto L_0x010f;
    L_0x00f5:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.agff) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x0107:
        r2 = r10.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0114;
    L_0x010f:
        r10.nextNull();
        goto L_0x0019;
    L_0x0114:
        r2 = r9.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r10);
        r2 = (defpackage.agff) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x0126:
        r10.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agfb.read(com.google.gson.stream.JsonReader):agfa");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, agfa agfa) {
        if (agfa == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (agfa.a != null) {
            jsonWriter.name("tap_to_load_counts");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfa.a);
        }
        if (agfa.b != null) {
            jsonWriter.name("inline_forward_precache_counts");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfa.b);
        }
        if (agfa.c != null) {
            jsonWriter.name("num_stories_always_precached");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfa.c);
        }
        if (agfa.d != null) {
            jsonWriter.name("num_snaps_per_story_always_precached");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfa.d);
        }
        if (agfa.e != null) {
            jsonWriter.name("order");
            jsonWriter.value(agfa.e);
        }
        if (agfa.f != null) {
            jsonWriter.name("num_snaps_to_load_before_allow_viewing");
            ((TypeAdapter) this.b.get()).write(jsonWriter, agfa.f);
        }
        jsonWriter.endObject();
    }
}
