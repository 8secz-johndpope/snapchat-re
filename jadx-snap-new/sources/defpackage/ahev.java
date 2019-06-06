package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahev */
public final class ahev extends TypeAdapter<aheu> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahey>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahey.class)));

    public ahev(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aheu read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aheu;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00e0;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -892494539; // 0xffffffffcacd9d35 float:-6737562.5 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = -287016227; // 0xffffffffeee47add float:-3.5355557E28 double:NaN;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = 102727412; // 0x61f7ef4 float:2.9997847E-35 double:5.0754085E-316;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "label";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 0;
        goto L_0x0058;
    L_0x0043:
        r4 = "unicode";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 1;
        goto L_0x0058;
    L_0x004d:
        r4 = "stages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 2;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00be;
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
        goto L_0x00c6;
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
        goto L_0x00c6;
    L_0x00a9:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00b6;
    L_0x00ad:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00ba;
    L_0x00b6:
        r2 = r8.nextString();
    L_0x00ba:
        r0.b = r2;
        goto L_0x0019;
    L_0x00be:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cb;
    L_0x00c6:
        r8.nextNull();
        goto L_0x0019;
    L_0x00cb:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d8;
    L_0x00cf:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00dc;
    L_0x00d8:
        r2 = r8.nextString();
    L_0x00dc:
        r0.a = r2;
        goto L_0x0019;
    L_0x00e0:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahev.read(com.google.gson.stream.JsonReader):aheu");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aheu aheu) {
        if (aheu == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aheu.a != null) {
            jsonWriter.name("label");
            jsonWriter.value(aheu.a);
        }
        if (aheu.b != null) {
            jsonWriter.name("unicode");
            jsonWriter.value(aheu.b);
        }
        if (aheu.c != null) {
            jsonWriter.name("stages");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (ahey write : aheu.c) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }
}
