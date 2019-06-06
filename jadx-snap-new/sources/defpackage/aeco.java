package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeco */
public final class aeco extends TypeAdapter<aecn> {
    private final Gson a;
    private final Supplier<TypeAdapter<aecj>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aecj.class)));
    private final Supplier<TypeAdapter<aecl>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aecl.class)));

    public aeco(Gson gson) {
        this.a = gson;
    }

    /* renamed from: a */
    public final defpackage.aecn read(com.google.gson.stream.JsonReader r8) {
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
        r0 = new aecn;
        r0.<init>();
        r1 = 1;
        r8.setLenient(r1);
        r8.beginObject();
    L_0x0019:
        r2 = r8.hasNext();
        if (r2 == 0) goto L_0x0127;
    L_0x001f:
        r2 = r8.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = 3;
        r6 = 2;
        switch(r4) {
            case -1902412900: goto L_0x004c;
            case -836047820: goto L_0x0042;
            case 747805238: goto L_0x0038;
            case 1755844444: goto L_0x002e;
            default: goto L_0x002d;
        };
    L_0x002d:
        goto L_0x0056;
    L_0x002e:
        r4 = "shut_off_rules";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0036:
        r2 = 2;
        goto L_0x0057;
    L_0x0038:
        r4 = "use_app_install_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0040:
        r2 = 3;
        goto L_0x0057;
    L_0x0042:
        r4 = "use_v2";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x004a:
        r2 = 1;
        goto L_0x0057;
    L_0x004c:
        r4 = "ad_sources";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0056;
    L_0x0054:
        r2 = 0;
        goto L_0x0057;
    L_0x0056:
        r2 = -1;
    L_0x0057:
        if (r2 == 0) goto L_0x00e5;
    L_0x0059:
        if (r2 == r1) goto L_0x00c3;
    L_0x005b:
        if (r2 == r6) goto L_0x0085;
    L_0x005d:
        if (r2 == r5) goto L_0x0063;
    L_0x005f:
        r8.skipValue();
        goto L_0x0019;
    L_0x0063:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x006d;
    L_0x006b:
        goto L_0x00ed;
    L_0x006d:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x007a;
    L_0x0071:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x007e;
    L_0x007a:
        r2 = r8.nextBoolean();
    L_0x007e:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x0085:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x008e;
    L_0x008d:
        goto L_0x00ed;
    L_0x008e:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0092:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.b;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x00a2:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x00bc;
    L_0x00a8:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x00b4;
    L_0x00b0:
        r8.nextNull();
        goto L_0x00a2;
    L_0x00b4:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x00a2;
    L_0x00bc:
        r8.endArray();
        r0.c = r2;
        goto L_0x0019;
    L_0x00c3:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00ed;
    L_0x00cc:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d0:
        r2 = r8.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x00dd;
    L_0x00d9:
        r2 = r8.nextBoolean();
    L_0x00dd:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.b = r2;
        goto L_0x0019;
    L_0x00e5:
        r2 = r8.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00f2;
    L_0x00ed:
        r8.nextNull();
        goto L_0x0019;
    L_0x00f2:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x00f6:
        r8.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r7.c;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0106:
        r4 = r8.hasNext();
        if (r4 == 0) goto L_0x0120;
    L_0x010c:
        r4 = r8.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0118;
    L_0x0114:
        r8.nextNull();
        goto L_0x0106;
    L_0x0118:
        r4 = r3.read(r8);
        r2.add(r4);
        goto L_0x0106;
    L_0x0120:
        r8.endArray();
        r0.a = r2;
        goto L_0x0019;
    L_0x0127:
        r8.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeco.read(com.google.gson.stream.JsonReader):aecn");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aecn aecn) {
        if (aecn == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aecn.a != null) {
            jsonWriter.name("ad_sources");
            typeAdapter = (TypeAdapter) this.c.get();
            jsonWriter.beginArray();
            for (aecl write : aecn.a) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aecn.b != null) {
            jsonWriter.name("use_v2");
            jsonWriter.value(aecn.b.booleanValue());
        }
        if (aecn.c != null) {
            jsonWriter.name("shut_off_rules");
            typeAdapter = (TypeAdapter) this.b.get();
            jsonWriter.beginArray();
            for (aecj write2 : aecn.c) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aecn.d != null) {
            jsonWriter.name("use_app_install_v2");
            jsonWriter.value(aecn.d.booleanValue());
        }
        jsonWriter.endObject();
    }
}
