package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aefu */
public final class aefu extends TypeAdapter<aeft> {
    private final Gson a;
    private final Supplier<TypeAdapter<aegn>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegn.class)));
    private final Supplier<TypeAdapter<aexp>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexp.class)));

    public aefu(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a  */
    /* renamed from: a */
    public final defpackage.aeft read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aeft;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00dc;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -1591688886; // 0xffffffffa120c14a float:-5.4465925E-19 double:NaN;
        r6 = 2;
        if (r4 == r5) goto L_0x004d;
    L_0x002e:
        r5 = -545578493; // 0xffffffffdf7b2203 float:-1.809603E19 double:NaN;
        if (r4 == r5) goto L_0x0043;
    L_0x0033:
        r5 = -462094004; // 0xffffffffe475014c float:-1.8078183E22 double:NaN;
        if (r4 == r5) goto L_0x0039;
    L_0x0038:
        goto L_0x0057;
    L_0x0039:
        r4 = "messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0041:
        r2 = 1;
        goto L_0x0058;
    L_0x0043:
        r4 = "messaging_auth";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x004b:
        r2 = 0;
        goto L_0x0058;
    L_0x004d:
        r4 = "message_iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0057;
    L_0x0055:
        r2 = 2;
        goto L_0x0058;
    L_0x0057:
        r2 = -1;
    L_0x0058:
        if (r2 == 0) goto L_0x00bd;
    L_0x005a:
        if (r2 == r1) goto L_0x007f;
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
        goto L_0x00c5;
    L_0x006b:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0078;
    L_0x006f:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007c;
    L_0x0078:
        r2 = r8.nextString();
    L_0x007c:
        r0.c = r2;
        goto L_0x0019;
    L_0x007f:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0088;
    L_0x0087:
        goto L_0x00c5;
    L_0x0088:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x008c:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x009c:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00b6;
    L_0x00a2:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00ae;
    L_0x00aa:
        r8.nextNull();
        goto L_0x009c;
    L_0x00ae:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x009c;
    L_0x00b6:
        r8.endArray();
        r0.b = r2;
        goto L_0x0019;
    L_0x00bd:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ca;
    L_0x00c5:
        r8.nextNull();
        goto L_0x0019;
    L_0x00ca:
        r2 = r7.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aexp) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x00dc:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefu.read(com.google.gson.stream.JsonReader):aeft");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aeft aeft) {
        if (aeft == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aeft.a != null) {
            jsonWriter.name("messaging_auth");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aeft.a);
        }
        if (aeft.b != null) {
            jsonWriter.name("messages");
            TypeAdapter typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aegn write : aeft.b) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aeft.c != null) {
            jsonWriter.name("message_iter_token");
            jsonWriter.value(aeft.c);
        }
        jsonWriter.endObject();
    }
}
