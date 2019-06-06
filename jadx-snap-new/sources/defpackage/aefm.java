package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: aefm */
public final class aefm extends TypeAdapter<aefi> {
    private final Gson a;
    private final Supplier<TypeAdapter<aefg>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefg.class)));
    private final Supplier<TypeAdapter<aefr>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefr.class)));
    private final Supplier<TypeAdapter<aeft>> d = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeft.class)));
    private final Supplier<TypeAdapter<aefx>> e = Suppliers.memoize(new afdq(this.a, TypeToken.get(aefx.class)));
    private final Supplier<TypeAdapter<aegp>> f = Suppliers.memoize(new afdq(this.a, TypeToken.get(aegp.class)));
    private final Supplier<TypeAdapter<aeic>> g = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeic.class)));
    private final Supplier<TypeAdapter<aeii>> h = Suppliers.memoize(new afdq(this.a, TypeToken.get(aeii.class)));
    private final Supplier<TypeAdapter<aekk>> i = Suppliers.memoize(new afdq(this.a, TypeToken.get(aekk.class)));
    private final Supplier<TypeAdapter<aenb>> j = Suppliers.memoize(new afdq(this.a, TypeToken.get(aenb.class)));
    private final Supplier<TypeAdapter<aepi>> k = Suppliers.memoize(new afdq(this.a, TypeToken.get(aepi.class)));
    private final Supplier<TypeAdapter<List<aegp>>> l = Suppliers.memoize(new afdq(this.a, new 1()));

    /* renamed from: aefm$1 */
    class 1 extends TypeToken<List<aegp>> {
        1() {
        }
    }

    public aefm(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:231:0x049b, code skipped:
            r9.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aefi read(com.google.gson.stream.JsonReader r9) {
        /*
        r8 = this;
        r0 = r9.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r9.nextNull();
        r9 = 0;
        return r9;
    L_0x000d:
        r0 = new aefi;
        r0.<init>();
        r1 = 1;
        r9.setLenient(r1);
        r9.beginObject();
    L_0x0019:
        r2 = r9.hasNext();
        if (r2 == 0) goto L_0x04b5;
    L_0x001f:
        r2 = r9.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2145617954: goto L_0x0122;
            case -1979713632: goto L_0x0118;
            case -1916627431: goto L_0x010d;
            case -1837667060: goto L_0x0102;
            case -1808669166: goto L_0x00f7;
            case -1754429250: goto L_0x00ec;
            case -814486906: goto L_0x00e1;
            case -212575018: goto L_0x00d6;
            case 3355: goto L_0x00cc;
            case 439223124: goto L_0x00c1;
            case 757643656: goto L_0x00b6;
            case 770144499: goto L_0x00ab;
            case 851493373: goto L_0x00a0;
            case 895477279: goto L_0x0095;
            case 919750545: goto L_0x0089;
            case 964669589: goto L_0x007e;
            case 994449915: goto L_0x0072;
            case 1192129990: goto L_0x0066;
            case 1381649843: goto L_0x005a;
            case 1432164721: goto L_0x004f;
            case 2004682331: goto L_0x0044;
            case 2009093589: goto L_0x0038;
            case 2013283283: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x012d;
    L_0x002d:
        r4 = "last_snap";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0035:
        r2 = 2;
        goto L_0x012e;
    L_0x0038:
        r4 = "conversation_state";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0040:
        r2 = 12;
        goto L_0x012e;
    L_0x0044:
        r4 = "last_cash_transaction";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x004c:
        r2 = 5;
        goto L_0x012e;
    L_0x004f:
        r4 = "conversation_interaction_event";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0057:
        r2 = 4;
        goto L_0x012e;
    L_0x005a:
        r4 = "pending_received_snaps";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0062:
        r2 = 8;
        goto L_0x012e;
    L_0x0066:
        r4 = "notification_status";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x006e:
        r2 = 15;
        goto L_0x012e;
    L_0x0072:
        r4 = "last_clear_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x007a:
        r2 = 18;
        goto L_0x012e;
    L_0x007e:
        r4 = "last_interaction_ts";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0086:
        r2 = 6;
        goto L_0x012e;
    L_0x0089:
        r4 = "conversation_snap_updates";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0091:
        r2 = 16;
        goto L_0x012e;
    L_0x0095:
        r4 = "last_chat_actions";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x009d:
        r2 = 3;
        goto L_0x012e;
    L_0x00a0:
        r4 = "pending_chats_for";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00a8:
        r2 = 7;
        goto L_0x012e;
    L_0x00ab:
        r4 = "is_snap_delta_fetch";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00b3:
        r2 = 19;
        goto L_0x012e;
    L_0x00b6:
        r4 = "conversation_messages";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00be:
        r2 = 9;
        goto L_0x012e;
    L_0x00c1:
        r4 = "username_to_user_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00c9:
        r2 = 17;
        goto L_0x012e;
    L_0x00cc:
        r4 = "id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00d4:
        r2 = 0;
        goto L_0x012e;
    L_0x00d6:
        r4 = "conversation_message_updates";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00de:
        r2 = 13;
        goto L_0x012e;
    L_0x00e1:
        r4 = "chat_release_data_map";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00e9:
        r2 = 21;
        goto L_0x012e;
    L_0x00ec:
        r4 = "message_retention_in_minutes";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00f4:
        r2 = 20;
        goto L_0x012e;
    L_0x00f7:
        r4 = "iter_token";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x00ff:
        r2 = 10;
        goto L_0x012e;
    L_0x0102:
        r4 = "is_cognac_notification_muted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x010a:
        r2 = 22;
        goto L_0x012e;
    L_0x010d:
        r4 = "favorite_stickers";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0115:
        r2 = 11;
        goto L_0x012e;
    L_0x0118:
        r4 = "participants";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x0120:
        r2 = 1;
        goto L_0x012e;
    L_0x0122:
        r4 = "is_delta_fetch";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x012d;
    L_0x012a:
        r2 = 14;
        goto L_0x012e;
    L_0x012d:
        r2 = -1;
    L_0x012e:
        switch(r2) {
            case 0: goto L_0x0493;
            case 1: goto L_0x045c;
            case 2: goto L_0x0441;
            case 3: goto L_0x0426;
            case 4: goto L_0x040a;
            case 5: goto L_0x03ee;
            case 6: goto L_0x03d8;
            case 7: goto L_0x03a0;
            case 8: goto L_0x0361;
            case 9: goto L_0x0345;
            case 10: goto L_0x0326;
            case 11: goto L_0x02e7;
            case 12: goto L_0x02cb;
            case 13: goto L_0x02af;
            case 14: goto L_0x028c;
            case 15: goto L_0x0269;
            case 16: goto L_0x024d;
            case 17: goto L_0x0211;
            case 18: goto L_0x01fb;
            case 19: goto L_0x01d8;
            case 20: goto L_0x01c2;
            case 21: goto L_0x0159;
            case 22: goto L_0x0136;
            default: goto L_0x0131;
        };
    L_0x0131:
        r9.skipValue();
        goto L_0x0019;
    L_0x0136:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0140;
    L_0x013e:
        goto L_0x049b;
    L_0x0140:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x014d;
    L_0x0144:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0151;
    L_0x014d:
        r2 = r9.nextBoolean();
    L_0x0151:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.w = r2;
        goto L_0x0019;
    L_0x0159:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0163;
    L_0x0161:
        goto L_0x049b;
    L_0x0163:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r3 = r8.l;
        r3.get();
        r9.beginObject();
    L_0x0170:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x01bb;
    L_0x0176:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0186;
    L_0x0182:
        r9.nextNull();
        goto L_0x0170;
    L_0x0186:
        r5 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r4 != r5) goto L_0x0170;
    L_0x018a:
        r9.beginArray();
        r4 = new java.util.ArrayList;
        r4.<init>();
        r5 = r8.f;
        r5 = r5.get();
        r5 = (com.google.gson.TypeAdapter) r5;
    L_0x019a:
        r6 = r9.hasNext();
        if (r6 == 0) goto L_0x01b4;
    L_0x01a0:
        r6 = r9.peek();
        r7 = com.google.gson.stream.JsonToken.NULL;
        if (r6 != r7) goto L_0x01ac;
    L_0x01a8:
        r9.nextNull();
        goto L_0x019a;
    L_0x01ac:
        r6 = r5.read(r9);
        r4.add(r6);
        goto L_0x019a;
    L_0x01b4:
        r9.endArray();
        r2.put(r3, r4);
        goto L_0x0170;
    L_0x01bb:
        r9.endObject();
        r0.v = r2;
        goto L_0x0019;
    L_0x01c2:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01cc;
    L_0x01ca:
        goto L_0x049b;
    L_0x01cc:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x01d8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e2;
    L_0x01e0:
        goto L_0x049b;
    L_0x01e2:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01ef;
    L_0x01e6:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01f3;
    L_0x01ef:
        r2 = r9.nextBoolean();
    L_0x01f3:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.t = r2;
        goto L_0x0019;
    L_0x01fb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0205;
    L_0x0203:
        goto L_0x049b;
    L_0x0205:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.s = r2;
        goto L_0x0019;
    L_0x0211:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x021b;
    L_0x0219:
        goto L_0x049b;
    L_0x021b:
        r2 = new com.google.gson.internal.LinkedTreeMap;
        r2.<init>();
        r9.beginObject();
    L_0x0223:
        r3 = r9.hasNext();
        if (r3 == 0) goto L_0x0246;
    L_0x0229:
        r3 = r9.nextName();
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r4 != r5) goto L_0x023e;
    L_0x0235:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0242;
    L_0x023e:
        r4 = r9.nextString();
    L_0x0242:
        r2.put(r3, r4);
        goto L_0x0223;
    L_0x0246:
        r9.endObject();
        r0.r = r2;
        goto L_0x0019;
    L_0x024d:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0257;
    L_0x0255:
        goto L_0x049b;
    L_0x0257:
        r2 = r8.e;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aefx) r2;
        r0.q = r2;
        goto L_0x0019;
    L_0x0269:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0273;
    L_0x0271:
        goto L_0x049b;
    L_0x0273:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0280;
    L_0x0277:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0284;
    L_0x0280:
        r2 = r9.nextBoolean();
    L_0x0284:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x028c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0296;
    L_0x0294:
        goto L_0x049b;
    L_0x0296:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02a3;
    L_0x029a:
        r2 = r9.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02a7;
    L_0x02a3:
        r2 = r9.nextBoolean();
    L_0x02a7:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.o = r2;
        goto L_0x0019;
    L_0x02af:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02b9;
    L_0x02b7:
        goto L_0x049b;
    L_0x02b9:
        r2 = r8.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aefr) r2;
        r0.n = r2;
        goto L_0x0019;
    L_0x02cb:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02d5;
    L_0x02d3:
        goto L_0x049b;
    L_0x02d5:
        r2 = r8.h;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aeii) r2;
        r0.m = r2;
        goto L_0x0019;
    L_0x02e7:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02f1;
    L_0x02ef:
        goto L_0x049b;
    L_0x02f1:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x02f5:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.i;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x0305:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x031f;
    L_0x030b:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0317;
    L_0x0313:
        r9.nextNull();
        goto L_0x0305;
    L_0x0317:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x0305;
    L_0x031f:
        r9.endArray();
        r0.l = r2;
        goto L_0x0019;
    L_0x0326:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0330;
    L_0x032e:
        goto L_0x049b;
    L_0x0330:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x033d;
    L_0x0334:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0341;
    L_0x033d:
        r2 = r9.nextString();
    L_0x0341:
        r0.k = r2;
        goto L_0x0019;
    L_0x0345:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x034f;
    L_0x034d:
        goto L_0x049b;
    L_0x034f:
        r2 = r8.d;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aeft) r2;
        r0.j = r2;
        goto L_0x0019;
    L_0x0361:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x036b;
    L_0x0369:
        goto L_0x049b;
    L_0x036b:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x036f:
        r9.beginArray();
        r2 = new java.util.ArrayList;
        r2.<init>();
        r3 = r8.j;
        r3 = r3.get();
        r3 = (com.google.gson.TypeAdapter) r3;
    L_0x037f:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x0399;
    L_0x0385:
        r4 = r9.peek();
        r5 = com.google.gson.stream.JsonToken.NULL;
        if (r4 != r5) goto L_0x0391;
    L_0x038d:
        r9.nextNull();
        goto L_0x037f;
    L_0x0391:
        r4 = r3.read(r9);
        r2.add(r4);
        goto L_0x037f;
    L_0x0399:
        r9.endArray();
        r0.i = r2;
        goto L_0x0019;
    L_0x03a0:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03aa;
    L_0x03a8:
        goto L_0x049b;
    L_0x03aa:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x03ae:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x03b6:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x03d1;
    L_0x03bc:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x03c9;
    L_0x03c0:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x03cd;
    L_0x03c9:
        r4 = r9.nextString();
    L_0x03cd:
        r3.add(r4);
        goto L_0x03b6;
    L_0x03d1:
        r9.endArray();
        r0.h = r3;
        goto L_0x0019;
    L_0x03d8:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03e2;
    L_0x03e0:
        goto L_0x049b;
    L_0x03e2:
        r2 = r9.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x03ee:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x03f8;
    L_0x03f6:
        goto L_0x049b;
    L_0x03f8:
        r2 = r8.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aefg) r2;
        r0.f = r2;
        goto L_0x0019;
    L_0x040a:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0414;
    L_0x0412:
        goto L_0x049b;
    L_0x0414:
        r2 = r8.g;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aeic) r2;
        r0.e = r2;
        goto L_0x0019;
    L_0x0426:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x042f;
    L_0x042e:
        goto L_0x049b;
    L_0x042f:
        r2 = r8.k;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aepi) r2;
        r0.d = r2;
        goto L_0x0019;
    L_0x0441:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x044a;
    L_0x0449:
        goto L_0x049b;
    L_0x044a:
        r2 = r8.j;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r9);
        r2 = (defpackage.aenb) r2;
        r0.c = r2;
        goto L_0x0019;
    L_0x045c:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0465;
    L_0x0464:
        goto L_0x049b;
    L_0x0465:
        r3 = com.google.gson.stream.JsonToken.BEGIN_ARRAY;
        if (r2 != r3) goto L_0x0019;
    L_0x0469:
        r9.beginArray();
        r3 = new java.util.ArrayList;
        r3.<init>();
    L_0x0471:
        r4 = r9.hasNext();
        if (r4 == 0) goto L_0x048c;
    L_0x0477:
        r4 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r4) goto L_0x0484;
    L_0x047b:
        r4 = r9.nextBoolean();
        r4 = java.lang.Boolean.toString(r4);
        goto L_0x0488;
    L_0x0484:
        r4 = r9.nextString();
    L_0x0488:
        r3.add(r4);
        goto L_0x0471;
    L_0x048c:
        r9.endArray();
        r0.b = r3;
        goto L_0x0019;
    L_0x0493:
        r2 = r9.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x04a0;
    L_0x049b:
        r9.nextNull();
        goto L_0x0019;
    L_0x04a0:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x04ad;
    L_0x04a4:
        r2 = r9.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x04b1;
    L_0x04ad:
        r2 = r9.nextString();
    L_0x04b1:
        r0.a = r2;
        goto L_0x0019;
    L_0x04b5:
        r9.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aefm.read(com.google.gson.stream.JsonReader):aefi");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aefi aefi) {
        if (aefi == null) {
            jsonWriter.nullValue();
            return;
        }
        TypeAdapter typeAdapter;
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aefi.a != null) {
            jsonWriter.name("id");
            jsonWriter.value(aefi.a);
        }
        if (aefi.b != null) {
            jsonWriter.name("participants");
            jsonWriter.beginArray();
            for (String value : aefi.b) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
        }
        if (aefi.c != null) {
            jsonWriter.name("last_snap");
            ((TypeAdapter) this.j.get()).write(jsonWriter, aefi.c);
        }
        if (aefi.d != null) {
            jsonWriter.name("last_chat_actions");
            ((TypeAdapter) this.k.get()).write(jsonWriter, aefi.d);
        }
        if (aefi.e != null) {
            jsonWriter.name("conversation_interaction_event");
            ((TypeAdapter) this.g.get()).write(jsonWriter, aefi.e);
        }
        if (aefi.f != null) {
            jsonWriter.name("last_cash_transaction");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aefi.f);
        }
        if (aefi.g != null) {
            jsonWriter.name("last_interaction_ts");
            jsonWriter.value(aefi.g);
        }
        if (aefi.h != null) {
            jsonWriter.name("pending_chats_for");
            jsonWriter.beginArray();
            for (String value2 : aefi.h) {
                jsonWriter.value(value2);
            }
            jsonWriter.endArray();
        }
        if (aefi.i != null) {
            jsonWriter.name("pending_received_snaps");
            typeAdapter = (TypeAdapter) this.j.get();
            jsonWriter.beginArray();
            for (aenb write : aefi.i) {
                typeAdapter.write(jsonWriter, write);
            }
            jsonWriter.endArray();
        }
        if (aefi.j != null) {
            jsonWriter.name("conversation_messages");
            ((TypeAdapter) this.d.get()).write(jsonWriter, aefi.j);
        }
        if (aefi.k != null) {
            jsonWriter.name("iter_token");
            jsonWriter.value(aefi.k);
        }
        if (aefi.l != null) {
            jsonWriter.name("favorite_stickers");
            typeAdapter = (TypeAdapter) this.i.get();
            jsonWriter.beginArray();
            for (aekk write2 : aefi.l) {
                typeAdapter.write(jsonWriter, write2);
            }
            jsonWriter.endArray();
        }
        if (aefi.m != null) {
            jsonWriter.name("conversation_state");
            ((TypeAdapter) this.h.get()).write(jsonWriter, aefi.m);
        }
        if (aefi.n != null) {
            jsonWriter.name("conversation_message_updates");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aefi.n);
        }
        if (aefi.o != null) {
            jsonWriter.name("is_delta_fetch");
            jsonWriter.value(aefi.o.booleanValue());
        }
        if (aefi.p != null) {
            jsonWriter.name("notification_status");
            jsonWriter.value(aefi.p.booleanValue());
        }
        if (aefi.q != null) {
            jsonWriter.name("conversation_snap_updates");
            ((TypeAdapter) this.e.get()).write(jsonWriter, aefi.q);
        }
        if (aefi.r != null) {
            jsonWriter.name("username_to_user_id");
            jsonWriter.beginObject();
            for (Entry entry : aefi.r.entrySet()) {
                jsonWriter.name((String) entry.getKey());
                jsonWriter.value((String) entry.getValue());
            }
            jsonWriter.endObject();
        }
        if (aefi.s != null) {
            jsonWriter.name("last_clear_timestamp");
            jsonWriter.value(aefi.s);
        }
        if (aefi.t != null) {
            jsonWriter.name("is_snap_delta_fetch");
            jsonWriter.value(aefi.t.booleanValue());
        }
        if (aefi.u != null) {
            jsonWriter.name("message_retention_in_minutes");
            jsonWriter.value(aefi.u);
        }
        if (aefi.v != null) {
            jsonWriter.name("chat_release_data_map");
            typeAdapter = (TypeAdapter) this.l.get();
            jsonWriter.beginObject();
            for (Entry entry2 : aefi.v.entrySet()) {
                jsonWriter.name((String) entry2.getKey());
                typeAdapter.write(jsonWriter, entry2.getValue());
            }
            jsonWriter.endObject();
        }
        if (aefi.w != null) {
            jsonWriter.name("is_cognac_notification_muted");
            jsonWriter.value(aefi.w.booleanValue());
        }
        jsonWriter.endObject();
    }
}
