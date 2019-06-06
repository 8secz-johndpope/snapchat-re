package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aego */
public final class aego extends TypeAdapter<aegn> {
    private final Gson a;
    private final Supplier<TypeAdapter<aefg>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefg.class)));
    private final Supplier<TypeAdapter<aegj>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegj.class)));
    private final Supplier<TypeAdapter<aenb>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenb.class)));

    public aego(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aegn read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aegn;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x00d4;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1808669166: goto L_0x004c;
            case -85171680: goto L_0x0042;
            case -34244654: goto L_0x0038;
            case 3534794: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "snap";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 0;
        goto L_0x0057;
    L_0x0038:
        r4 = "cash_transaction";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 2;
        goto L_0x0057;
    L_0x0042:
        r4 = "chat_message";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 1;
        goto L_0x0057;
    L_0x004c:
        r4 = "iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 3;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00b5;
    L_0x0059:
        if (r2 == r1) goto L_0x009a;
    L_0x005b:
        if (r2 == r6) goto L_0x0080;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006c;
    L_0x006b:
        goto L_0x00bd;
    L_0x006c:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0079;
    L_0x0070:
        r2 = r8.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x007d;
    L_0x0079:
        r2 = r8.nextString();
    L_0x007d:
        r0.d = r2;
        goto L_0x0019;
    L_0x0080:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0089;
    L_0x0088:
        goto L_0x00bd;
    L_0x0089:
        r2 = r7.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aefg) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x009a:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00a3;
    L_0x00a2:
        goto L_0x00bd;
    L_0x00a3:
        r2 = r7.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aegj) r2;
        r0.b = r2;
        goto L_0x0019;
    L_0x00b5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00c2;
    L_0x00bd:
        r8.nextNull();
        goto L_0x0019;
    L_0x00c2:
        r2 = r7.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r8);
        r2 = (defpackage.aenb) r2;
        r0.a = r2;
        goto L_0x0019;
    L_0x00d4:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aego.read(com.google.gson.stream.JsonReader):aegn");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aegn aegn) {
        if (aegn == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aegn.a != null) {
            jsonWriter.name("snap");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aegn.a);
        }
        if (aegn.b != null) {
            jsonWriter.name("chat_message");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aegn.b);
        }
        if (aegn.c != null) {
            jsonWriter.name("cash_transaction");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aegn.c);
        }
        if (aegn.d != null) {
            jsonWriter.name("iter_token");
            jsonWriter.value(aegn.d);
        }
        jsonWriter.endObject();
    }
}
