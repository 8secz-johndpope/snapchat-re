package defpackage;

import com.coremedia.iso.boxes.AuthorBox;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: aeho */
public final class aeho extends TypeAdapter<aehn> {
    private final Gson a;
    private final Supplier<TypeAdapter<aexp>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aexp.class)));

    public aeho(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:83:0x015e, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aehn read(com.google.gson.stream.JsonReader r6) {
        /*
        r5 = this;
        r0 = r6.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r6.nextNull();
        r6 = 0;
        return r6;
    L_0x000d:
        r0 = new aehn;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0178;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -901870406: goto L_0x0072;
            case -265713450: goto L_0x0068;
            case 3355: goto L_0x005e;
            case 3005864: goto L_0x0054;
            case 3575610: goto L_0x004a;
            case 30491792: goto L_0x0040;
            case 351608024: goto L_0x0036;
            case 1874684019: goto L_0x002c;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x007c;
    L_0x002c:
        r4 = "platform";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0034:
        r2 = 1;
        goto L_0x007d;
    L_0x0036:
        r4 = "version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x003e:
        r2 = 2;
        goto L_0x007d;
    L_0x0040:
        r4 = "app_engine_target";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0048:
        r2 = 7;
        goto L_0x007d;
    L_0x004a:
        r4 = "type";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0052:
        r2 = 5;
        goto L_0x007d;
    L_0x0054:
        r4 = "auth";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x005c:
        r2 = 4;
        goto L_0x007d;
    L_0x005e:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0066:
        r2 = 6;
        goto L_0x007d;
    L_0x0068:
        r4 = "username";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x0070:
        r2 = 0;
        goto L_0x007d;
    L_0x0072:
        r4 = "app_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x007c;
    L_0x007a:
        r2 = 3;
        goto L_0x007d;
    L_0x007c:
        r2 = -1;
    L_0x007d:
        switch(r2) {
            case 0: goto L_0x0156;
            case 1: goto L_0x0138;
            case 2: goto L_0x011a;
            case 3: goto L_0x00fc;
            case 4: goto L_0x00e1;
            case 5: goto L_0x00c2;
            case 6: goto L_0x00a3;
            case 7: goto L_0x0084;
            default: goto L_0x0080;
        };
    L_0x0080:
        r6.skipValue();
        goto L_0x0019;
    L_0x0084:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x008e;
    L_0x008c:
        goto L_0x015e;
    L_0x008e:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x009b;
    L_0x0092:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x009f;
    L_0x009b:
        r2 = r6.nextString();
    L_0x009f:
        r0.q = r2;
        goto L_0x0019;
    L_0x00a3:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ad;
    L_0x00ab:
        goto L_0x015e;
    L_0x00ad:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00ba;
    L_0x00b1:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00be;
    L_0x00ba:
        r2 = r6.nextString();
    L_0x00be:
        r0.p = r2;
        goto L_0x0019;
    L_0x00c2:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00cc;
    L_0x00ca:
        goto L_0x015e;
    L_0x00cc:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x00d9;
    L_0x00d0:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x00dd;
    L_0x00d9:
        r2 = r6.nextString();
    L_0x00dd:
        r0.o = r2;
        goto L_0x0019;
    L_0x00e1:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x00ea;
    L_0x00e9:
        goto L_0x015e;
    L_0x00ea:
        r2 = r5.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r6);
        r2 = (defpackage.aexp) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x00fc:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0105;
    L_0x0104:
        goto L_0x015e;
    L_0x0105:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0112;
    L_0x0109:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0116;
    L_0x0112:
        r2 = r6.nextString();
    L_0x0116:
        r0.d = r2;
        goto L_0x0019;
    L_0x011a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0123;
    L_0x0122:
        goto L_0x015e;
    L_0x0123:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0130;
    L_0x0127:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0134;
    L_0x0130:
        r2 = r6.nextString();
    L_0x0134:
        r0.c = r2;
        goto L_0x0019;
    L_0x0138:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0141;
    L_0x0140:
        goto L_0x015e;
    L_0x0141:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x014e;
    L_0x0145:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0152;
    L_0x014e:
        r2 = r6.nextString();
    L_0x0152:
        r0.b = r2;
        goto L_0x0019;
    L_0x0156:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0163;
    L_0x015e:
        r6.nextNull();
        goto L_0x0019;
    L_0x0163:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0170;
    L_0x0167:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0174;
    L_0x0170:
        r2 = r6.nextString();
    L_0x0174:
        r0.a = r2;
        goto L_0x0019;
    L_0x0178:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeho.read(com.google.gson.stream.JsonReader):aehn");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aehn aehn) {
        if (aehn == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aehn.a != null) {
            jsonWriter.name("username");
            jsonWriter.value(aehn.a);
        }
        if (aehn.b != null) {
            jsonWriter.name("platform");
            jsonWriter.value(aehn.b);
        }
        if (aehn.c != null) {
            jsonWriter.name("version");
            jsonWriter.value(aehn.c);
        }
        if (aehn.d != null) {
            jsonWriter.name("app_version");
            jsonWriter.value(aehn.d);
        }
        if (aehn.e != null) {
            jsonWriter.name(AuthorBox.TYPE);
            ((TypeAdapter) this.b.get()).write(jsonWriter, aehn.e);
        }
        if (aehn.o != null) {
            jsonWriter.name("type");
            jsonWriter.value(aehn.o);
        }
        if (aehn.p != null) {
            jsonWriter.name("id");
            jsonWriter.value(aehn.p);
        }
        if (aehn.q != null) {
            jsonWriter.name("app_engine_target");
            jsonWriter.value(aehn.q);
        }
        jsonWriter.endObject();
    }
}
