package defpackage;

/* renamed from: aitp */
final class aitp implements aitz {
    aitp() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0193  */
    public final defpackage.aity a(defpackage.airh r27, org.json.JSONObject r28) {
        /*
        r26 = this;
        r0 = r28;
        r1 = 0;
        r2 = "settings_version";
        r12 = r0.optInt(r2, r1);
        r2 = 3600; // 0xe10 float:5.045E-42 double:1.7786E-320;
        r3 = "cache_duration";
        r13 = r0.optInt(r3, r2);
        r3 = "app";
        r3 = r0.getJSONObject(r3);
        r4 = "identifier";
        r15 = r3.getString(r4);
        r4 = "status";
        r16 = r3.getString(r4);
        r4 = "url";
        r17 = r3.getString(r4);
        r5 = "reports_url";
        r18 = r3.getString(r5);
        r5 = "ndk_reports_url";
        r19 = r3.getString(r5);
        r5 = "update_required";
        r20 = r3.optBoolean(r5, r1);
        r5 = "icon";
        r6 = r3.has(r5);
        r7 = 0;
        if (r6 == 0) goto L_0x006c;
    L_0x0044:
        r6 = r3.getJSONObject(r5);
        r8 = "hash";
        r6 = r6.has(r8);
        if (r6 == 0) goto L_0x006c;
    L_0x0050:
        r3 = r3.getJSONObject(r5);
        r5 = r3.getString(r8);
        r6 = "width";
        r6 = r3.getInt(r6);
        r8 = "height";
        r3 = r3.getInt(r8);
        r8 = new aith;
        r8.<init>(r5, r6, r3);
        r21 = r8;
        goto L_0x006e;
    L_0x006c:
        r21 = r7;
    L_0x006e:
        r6 = new aitj;
        r14 = r6;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21);
        r3 = "session";
        r3 = r0.getJSONObject(r3);
        r5 = 64000; // 0xfa00 float:8.9683E-41 double:3.162E-319;
        r8 = "log_buffer_size";
        r15 = r3.optInt(r8, r5);
        r5 = 8;
        r8 = "max_chained_exception_depth";
        r16 = r3.optInt(r8, r5);
        r5 = 64;
        r8 = "max_custom_exception_events";
        r17 = r3.optInt(r8, r5);
        r8 = "max_custom_key_value_pairs";
        r18 = r3.optInt(r8, r5);
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r8 = "identifier_mask";
        r19 = r3.optInt(r8, r5);
        r5 = "send_session_without_crash";
        r20 = r3.optBoolean(r5, r1);
        r5 = 4;
        r8 = "max_complete_sessions_count";
        r21 = r3.optInt(r8, r5);
        r8 = new aitu;
        r14 = r8;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21);
        r3 = "prompt";
        r3 = r0.getJSONObject(r3);
        r5 = "title";
        r9 = "Send Crash Report?";
        r15 = r3.optString(r5, r9);
        r5 = "message";
        r9 = "Looks like we crashed! Please help us fix the problem by sending a crash report.";
        r16 = r3.optString(r5, r9);
        r5 = "send_button_title";
        r9 = "Send";
        r17 = r3.optString(r5, r9);
        r5 = 1;
        r9 = "show_cancel_button";
        r18 = r3.optBoolean(r9, r5);
        r9 = "cancel_button_title";
        r10 = "Don't Send";
        r19 = r3.optString(r9, r10);
        r9 = "show_always_send_button";
        r20 = r3.optBoolean(r9, r5);
        r9 = "always_send_button_title";
        r10 = "Always Send";
        r21 = r3.optString(r9, r10);
        r9 = new aitt;
        r14 = r9;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21);
        r3 = "features";
        r3 = r0.getJSONObject(r3);
        r10 = "prompt_enabled";
        r15 = r3.optBoolean(r10, r1);
        r10 = "collect_logged_exceptions";
        r16 = r3.optBoolean(r10, r5);
        r10 = "collect_reports";
        r17 = r3.optBoolean(r10, r5);
        r10 = "collect_analytics";
        r18 = r3.optBoolean(r10, r1);
        r10 = "firebase_crashlytics_enabled";
        r19 = r3.optBoolean(r10, r1);
        r10 = new aitr;
        r14 = r10;
        r14.<init>(r15, r16, r17, r18, r19);
        r3 = "analytics";
        r3 = r0.getJSONObject(r3);
        r11 = "https://e.crashlytics.com/spi/v2/events";
        r15 = r3.optString(r4, r11);
        r4 = 600; // 0x258 float:8.41E-43 double:2.964E-321;
        r11 = "flush_interval_secs";
        r16 = r3.optInt(r11, r4);
        r4 = 8000; // 0x1f40 float:1.121E-41 double:3.9525E-320;
        r11 = "max_byte_size_per_file";
        r17 = r3.optInt(r11, r4);
        r4 = "max_file_count_per_send";
        r18 = r3.optInt(r4, r5);
        r4 = 100;
        r11 = "max_pending_send_file_count";
        r19 = r3.optInt(r11, r4);
        r4 = "forward_to_google_analytics";
        r20 = r3.optBoolean(r4, r1);
        r4 = "include_purchase_events_in_forwarded_events";
        r21 = r3.optBoolean(r4, r1);
        r1 = "track_custom_events";
        r22 = r3.optBoolean(r1, r5);
        r1 = "track_predefined_events";
        r23 = r3.optBoolean(r1, r5);
        r1 = "sampling_rate";
        r24 = r3.optInt(r1, r5);
        r1 = "flush_on_background";
        r25 = r3.optBoolean(r1, r5);
        r1 = new aitg;
        r14 = r1;
        r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25);
        r3 = "beta";
        r3 = r0.getJSONObject(r3);
        r4 = "update_endpoint";
        r4 = r3.optString(r4, r7);
        r5 = "update_suspend_duration";
        r2 = r3.optInt(r5, r2);
        r11 = new aitk;
        r11.<init>(r4, r2);
        r2 = (long) r13;
        r4 = "expires_at";
        r5 = r0.has(r4);
        if (r5 == 0) goto L_0x0199;
    L_0x0193:
        r2 = r0.getLong(r4);
        r4 = r2;
        goto L_0x01a1;
    L_0x0199:
        r4 = r27.a();
        r14 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r2 = r2 * r14;
        r4 = r4 + r2;
    L_0x01a1:
        r0 = new aity;
        r3 = r0;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r1;
        r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aitp.a(airh, org.json.JSONObject):aity");
    }
}
