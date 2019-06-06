package defpackage;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: ahan */
public final class ahan extends TypeAdapter<aham> {
    private final Gson a;
    private final Supplier<TypeAdapter<ahew>> b = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahew.class)));
    private final Supplier<TypeAdapter<ahfl>> c = Suppliers.memoize(new afdq(this.a, TypeToken.get(ahfl.class)));

    public ahan(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Missing block: B:177:0x0363, code skipped:
            r6.nextNull();
     */
    /* renamed from: a */
    public final defpackage.aham read(com.google.gson.stream.JsonReader r6) {
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
        r0 = new aham;
        r0.<init>();
        r1 = 1;
        r6.setLenient(r1);
        r6.beginObject();
    L_0x0019:
        r2 = r6.hasNext();
        if (r2 == 0) goto L_0x0381;
    L_0x001f:
        r2 = r6.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        switch(r4) {
            case -2092698859: goto L_0x010a;
            case -2039583856: goto L_0x00ff;
            case -1778818161: goto L_0x00f5;
            case -1340848303: goto L_0x00ea;
            case -1253494695: goto L_0x00df;
            case -1205782842: goto L_0x00d5;
            case -915570462: goto L_0x00ca;
            case -693572666: goto L_0x00bf;
            case -467950976: goto L_0x00b4;
            case -84366202: goto L_0x00aa;
            case -5483663: goto L_0x00a0;
            case 109542336: goto L_0x0096;
            case 118882686: goto L_0x008a;
            case 122842137: goto L_0x007f;
            case 168108394: goto L_0x0073;
            case 247252293: goto L_0x0067;
            case 569192980: goto L_0x005c;
            case 704916108: goto L_0x0050;
            case 848809328: goto L_0x0044;
            case 1158945463: goto L_0x0039;
            case 1307626463: goto L_0x002d;
            default: goto L_0x002b;
        };
    L_0x002b:
        goto L_0x0115;
    L_0x002d:
        r4 = "trophy_case";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0035:
        r2 = 8;
        goto L_0x0116;
    L_0x0039:
        r4 = "is_high_accuracy_required_for_nearby";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0041:
        r2 = 7;
        goto L_0x0116;
    L_0x0044:
        r4 = "max_suggestions_in_full_page";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x004c:
        r2 = 17;
        goto L_0x0116;
    L_0x0050:
        r4 = "user_segments_response";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0058:
        r2 = 10;
        goto L_0x0116;
    L_0x005c:
        r4 = "is_add_nearby_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0064:
        r2 = 6;
        goto L_0x0116;
    L_0x0067:
        r4 = "max_suggestions_in_search_result";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x006f:
        r2 = 15;
        goto L_0x0116;
    L_0x0073:
        r4 = "should_show_quick_add_unit";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x007b:
        r2 = 19;
        goto L_0x0116;
    L_0x007f:
        r4 = "suggested_friend_sync_version";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0087:
        r2 = 4;
        goto L_0x0116;
    L_0x008a:
        r4 = "was_snapchat_contact_permission_never_granted";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0092:
        r2 = 18;
        goto L_0x0116;
    L_0x0096:
        r4 = "is_email_verified";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x009e:
        r2 = 0;
        goto L_0x0116;
    L_0x00a0:
        r4 = "suggested_friend_fetch_threshold_hours";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00a8:
        r2 = 5;
        goto L_0x0116;
    L_0x00aa:
        r4 = "email_pending_verification";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00b2:
        r2 = 1;
        goto L_0x0116;
    L_0x00b4:
        r4 = "max_suggestions_in_quick_add";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00bc:
        r2 = 14;
        goto L_0x0116;
    L_0x00bf:
        r4 = "last_checked_trophies_timestamp";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00c7:
        r2 = 9;
        goto L_0x0116;
    L_0x00ca:
        r4 = "is_user_searchability_prompt_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00d2:
        r2 = 16;
        goto L_0x0116;
    L_0x00d5:
        r4 = "require_phone_password_confirmed";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00dd:
        r2 = 2;
        goto L_0x0116;
    L_0x00df:
        r4 = "is_snapchat_contact_permission_ios_v2_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00e7:
        r2 = 13;
        goto L_0x0116;
    L_0x00ea:
        r4 = "is_contact_sync_enabled";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00f2:
        r2 = 20;
        goto L_0x0116;
    L_0x00f5:
        r4 = "red_gear_duration_millis";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x00fd:
        r2 = 3;
        goto L_0x0116;
    L_0x00ff:
        r4 = "display_name_pop_up_count";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0107:
        r2 = 12;
        goto L_0x0116;
    L_0x010a:
        r4 = "force_addressbook_full_sync";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0115;
    L_0x0112:
        r2 = 11;
        goto L_0x0116;
    L_0x0115:
        r2 = -1;
    L_0x0116:
        switch(r2) {
            case 0: goto L_0x035b;
            case 1: goto L_0x033d;
            case 2: goto L_0x031b;
            case 3: goto L_0x0306;
            case 4: goto L_0x02f1;
            case 5: goto L_0x02dc;
            case 6: goto L_0x02b9;
            case 7: goto L_0x0296;
            case 8: goto L_0x027a;
            case 9: goto L_0x0264;
            case 10: goto L_0x0248;
            case 11: goto L_0x0225;
            case 12: goto L_0x020f;
            case 13: goto L_0x01ec;
            case 14: goto L_0x01d6;
            case 15: goto L_0x01c0;
            case 16: goto L_0x019d;
            case 17: goto L_0x0187;
            case 18: goto L_0x0164;
            case 19: goto L_0x0141;
            case 20: goto L_0x011e;
            default: goto L_0x0119;
        };
    L_0x0119:
        r6.skipValue();
        goto L_0x0019;
    L_0x011e:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0128;
    L_0x0126:
        goto L_0x0363;
    L_0x0128:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0135;
    L_0x012c:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0139;
    L_0x0135:
        r2 = r6.nextBoolean();
    L_0x0139:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.u = r2;
        goto L_0x0019;
    L_0x0141:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x014b;
    L_0x0149:
        goto L_0x0363;
    L_0x014b:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0158;
    L_0x014f:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x015c;
    L_0x0158:
        r2 = r6.nextBoolean();
    L_0x015c:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.t = r2;
        goto L_0x0019;
    L_0x0164:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x016e;
    L_0x016c:
        goto L_0x0363;
    L_0x016e:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x017b;
    L_0x0172:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x017f;
    L_0x017b:
        r2 = r6.nextBoolean();
    L_0x017f:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.s = r2;
        goto L_0x0019;
    L_0x0187:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0191;
    L_0x018f:
        goto L_0x0363;
    L_0x0191:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.r = r2;
        goto L_0x0019;
    L_0x019d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01a7;
    L_0x01a5:
        goto L_0x0363;
    L_0x01a7:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x01b4;
    L_0x01ab:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x01b8;
    L_0x01b4:
        r2 = r6.nextBoolean();
    L_0x01b8:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.q = r2;
        goto L_0x0019;
    L_0x01c0:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01ca;
    L_0x01c8:
        goto L_0x0363;
    L_0x01ca:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.p = r2;
        goto L_0x0019;
    L_0x01d6:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01e0;
    L_0x01de:
        goto L_0x0363;
    L_0x01e0:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.o = r2;
        goto L_0x0019;
    L_0x01ec:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x01f6;
    L_0x01f4:
        goto L_0x0363;
    L_0x01f6:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0203;
    L_0x01fa:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0207;
    L_0x0203:
        r2 = r6.nextBoolean();
    L_0x0207:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.n = r2;
        goto L_0x0019;
    L_0x020f:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0219;
    L_0x0217:
        goto L_0x0363;
    L_0x0219:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.m = r2;
        goto L_0x0019;
    L_0x0225:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x022f;
    L_0x022d:
        goto L_0x0363;
    L_0x022f:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x023c;
    L_0x0233:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0240;
    L_0x023c:
        r2 = r6.nextBoolean();
    L_0x0240:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.l = r2;
        goto L_0x0019;
    L_0x0248:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0252;
    L_0x0250:
        goto L_0x0363;
    L_0x0252:
        r2 = r5.c;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r6);
        r2 = (defpackage.ahfl) r2;
        r0.k = r2;
        goto L_0x0019;
    L_0x0264:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x026e;
    L_0x026c:
        goto L_0x0363;
    L_0x026e:
        r2 = r6.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.j = r2;
        goto L_0x0019;
    L_0x027a:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0284;
    L_0x0282:
        goto L_0x0363;
    L_0x0284:
        r2 = r5.b;
        r2 = r2.get();
        r2 = (com.google.gson.TypeAdapter) r2;
        r2 = r2.read(r6);
        r2 = (defpackage.ahew) r2;
        r0.i = r2;
        goto L_0x0019;
    L_0x0296:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02a0;
    L_0x029e:
        goto L_0x0363;
    L_0x02a0:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02ad;
    L_0x02a4:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02b1;
    L_0x02ad:
        r2 = r6.nextBoolean();
    L_0x02b1:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.h = r2;
        goto L_0x0019;
    L_0x02b9:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02c3;
    L_0x02c1:
        goto L_0x0363;
    L_0x02c3:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x02d0;
    L_0x02c7:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x02d4;
    L_0x02d0:
        r2 = r6.nextBoolean();
    L_0x02d4:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.g = r2;
        goto L_0x0019;
    L_0x02dc:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02e5;
    L_0x02e4:
        goto L_0x0363;
    L_0x02e5:
        r2 = r6.nextInt();
        r2 = java.lang.Integer.valueOf(r2);
        r0.f = r2;
        goto L_0x0019;
    L_0x02f1:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x02fa;
    L_0x02f9:
        goto L_0x0363;
    L_0x02fa:
        r2 = r6.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.e = r2;
        goto L_0x0019;
    L_0x0306:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x030f;
    L_0x030e:
        goto L_0x0363;
    L_0x030f:
        r2 = r6.nextLong();
        r2 = java.lang.Long.valueOf(r2);
        r0.d = r2;
        goto L_0x0019;
    L_0x031b:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0324;
    L_0x0323:
        goto L_0x0363;
    L_0x0324:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0331;
    L_0x0328:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0335;
    L_0x0331:
        r2 = r6.nextBoolean();
    L_0x0335:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.c = r2;
        goto L_0x0019;
    L_0x033d:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0346;
    L_0x0345:
        goto L_0x0363;
    L_0x0346:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0353;
    L_0x034a:
        r2 = r6.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x0357;
    L_0x0353:
        r2 = r6.nextString();
    L_0x0357:
        r0.b = r2;
        goto L_0x0019;
    L_0x035b:
        r2 = r6.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0368;
    L_0x0363:
        r6.nextNull();
        goto L_0x0019;
    L_0x0368:
        r3 = com.google.gson.stream.JsonToken.STRING;
        if (r2 != r3) goto L_0x0375;
    L_0x036c:
        r2 = r6.nextString();
        r2 = java.lang.Boolean.parseBoolean(r2);
        goto L_0x0379;
    L_0x0375:
        r2 = r6.nextBoolean();
    L_0x0379:
        r2 = java.lang.Boolean.valueOf(r2);
        r0.a = r2;
        goto L_0x0019;
    L_0x0381:
        r6.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahan.read(com.google.gson.stream.JsonReader):aham");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, aham aham) {
        if (aham == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (aham.a != null) {
            jsonWriter.name("is_email_verified");
            jsonWriter.value(aham.a.booleanValue());
        }
        if (aham.b != null) {
            jsonWriter.name("email_pending_verification");
            jsonWriter.value(aham.b);
        }
        if (aham.c != null) {
            jsonWriter.name("require_phone_password_confirmed");
            jsonWriter.value(aham.c.booleanValue());
        }
        if (aham.d != null) {
            jsonWriter.name("red_gear_duration_millis");
            jsonWriter.value(aham.d);
        }
        if (aham.e != null) {
            jsonWriter.name("suggested_friend_sync_version");
            jsonWriter.value(aham.e);
        }
        if (aham.f != null) {
            jsonWriter.name("suggested_friend_fetch_threshold_hours");
            jsonWriter.value(aham.f);
        }
        if (aham.g != null) {
            jsonWriter.name("is_add_nearby_enabled");
            jsonWriter.value(aham.g.booleanValue());
        }
        if (aham.h != null) {
            jsonWriter.name("is_high_accuracy_required_for_nearby");
            jsonWriter.value(aham.h.booleanValue());
        }
        if (aham.i != null) {
            jsonWriter.name("trophy_case");
            ((TypeAdapter) this.b.get()).write(jsonWriter, aham.i);
        }
        if (aham.j != null) {
            jsonWriter.name("last_checked_trophies_timestamp");
            jsonWriter.value(aham.j);
        }
        if (aham.k != null) {
            jsonWriter.name("user_segments_response");
            ((TypeAdapter) this.c.get()).write(jsonWriter, aham.k);
        }
        if (aham.l != null) {
            jsonWriter.name("force_addressbook_full_sync");
            jsonWriter.value(aham.l.booleanValue());
        }
        if (aham.m != null) {
            jsonWriter.name("display_name_pop_up_count");
            jsonWriter.value(aham.m);
        }
        if (aham.n != null) {
            jsonWriter.name("is_snapchat_contact_permission_ios_v2_enabled");
            jsonWriter.value(aham.n.booleanValue());
        }
        if (aham.o != null) {
            jsonWriter.name("max_suggestions_in_quick_add");
            jsonWriter.value(aham.o);
        }
        if (aham.p != null) {
            jsonWriter.name("max_suggestions_in_search_result");
            jsonWriter.value(aham.p);
        }
        if (aham.q != null) {
            jsonWriter.name("is_user_searchability_prompt_enabled");
            jsonWriter.value(aham.q.booleanValue());
        }
        if (aham.r != null) {
            jsonWriter.name("max_suggestions_in_full_page");
            jsonWriter.value(aham.r);
        }
        if (aham.s != null) {
            jsonWriter.name("was_snapchat_contact_permission_never_granted");
            jsonWriter.value(aham.s.booleanValue());
        }
        if (aham.t != null) {
            jsonWriter.name("should_show_quick_add_unit");
            jsonWriter.value(aham.t.booleanValue());
        }
        if (aham.u != null) {
            jsonWriter.name("is_contact_sync_enabled");
            jsonWriter.value(aham.u.booleanValue());
        }
        jsonWriter.endObject();
    }
}
