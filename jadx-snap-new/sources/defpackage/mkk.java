package defpackage;

import com.looksery.sdk.ExperimentProvider;
import java.util.Map;

/* renamed from: mkk */
public final class mkk implements ExperimentProvider {
    private final Map<String, mja> a;
    private final miw b;

    public mkk(miw miw) {
        akcr.b(miw, "configurationRepository");
        this.b = miw;
        r3 = new ajxm[18];
        r3[0] = ajxs.a("LENSCORE_SNAPPABLES_CONTEXT_R1#LOOKSERY_SNAPPABLES_VARIABLE", mja.LENSCORE_SNAPPABLES_CONTEXT_R1);
        r3[1] = ajxs.a("LENSCORE_SNAPPABLES_CONTEXT_R2#LOOKSERY_SNAPPABLES_VARIABLE", mja.LENSCORE_SNAPPABLES_CONTEXT_R2);
        r3[2] = ajxs.a("LENSCORE_SNAPPABLES_CONTEXT_R3#LOOKSERY_SNAPPABLES_VARIABLE", mja.LENSCORE_SNAPPABLES_CONTEXT_R3);
        r3[3] = ajxs.a("LENSCORE_HIGH_ACCURACY_FACE_DETECTION#load_priority", mja.LENSCORE_HIGH_ACCURACY_FACE_DETECTION_LOAD_PRIORITY);
        r3[4] = ajxs.a("LENSCORE_HIGH_ACCURACY_FACE_DETECTION#mode", mja.LENSCORE_HIGH_ACCURACY_FACE_DETECTION_MODE);
        r3[5] = ajxs.a("LENSCORE_PROCESSING_ASYNC_TRACKING_ANDROID_V3#async_tracking_enabled", mja.LENS_PROCESSING_ASYNC_TRACKING_ANDROID_ASYNC_TRACKING_ENABLED);
        r3[6] = ajxs.a("LENSCORE_PROCESSING_ASYNC_TRACKING_ANDROID_V3#face_detect_async_texture_read_enabled", mja.LENS_PROCESSING_ASYNC_TRACKING_ANDROID_ASYNC_TEXREAD_ENABLED);
        r3[7] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_ticks_he_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_HE_ANDROID_MULTIPLIER);
        r3[8] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_ticks_me_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_ME_ANDROID_MULTIPLIER);
        r3[9] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_ticks_le_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS_LE_ANDROID_MULTIPLIER);
        r3[10] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_time_he_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_HE_ANDROID_MULTIPLIER);
        r3[11] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_time_me_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_ME_ANDROID_MULTIPLIER);
        r3[12] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_time_le_android_multiplier", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIME_LE_ANDROID_MULTIPLIER);
        r3[13] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_times_millis", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TIMES_MILLIS);
        r3[14] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_states_count", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_STATES_COUNT);
        r3[15] = ajxs.a("LENSCORE_SECOND_FACE_DETECTION_THROTTLE#throttle_ticks", mja.LENSCORE_SECOND_FACE_DETECTION_THROTTLE_TICKS);
        r3[16] = ajxs.a("LENSCORE_FRAMEBUFFER_FETCH_WHITELIST_EXPERIMENT#framebuffer_fetch_whitelist_extension_gpus", mja.LENSCORE_FRAMEBUFFER_FETCH_WHITELIST);
        r3[17] = ajxs.a("LENSCORE_ASYNC_MIPMAP_ABTEST_NAME#kAsyncMipmapABTestKey", mja.LENSCORE_ASYNC_MIPMAP);
        this.a = ajzm.a(r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A:{SYNTHETIC, RETURN} */
    public final java.lang.String getExperimentParameter(java.lang.String r4, java.lang.String r5) {
        /*
        r3 = this;
        r0 = "studyName";
        defpackage.akcr.b(r4, r0);
        r0 = "variable";
        defpackage.akcr.b(r5, r0);
        r0 = r3.a;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r4);
        r4 = 35;
        r1.append(r4);
        r1.append(r5);
        r4 = r1.toString();
        r4 = r0.get(r4);
        r4 = (defpackage.mja) r4;
        if (r4 == 0) goto L_0x011e;
    L_0x0028:
        r5 = r3.b;
        r5 = r5.a(defpackage.miw.b.a.a);
        r0 = r4;
        r0 = (defpackage.mje) r0;	 Catch:{ Throwable -> 0x00eb }
        r1 = java.lang.String.class;
        r2 = java.lang.Boolean.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00d0;
    L_0x003b:
        r2 = java.lang.Boolean.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 == 0) goto L_0x0045;
    L_0x0043:
        goto L_0x00d0;
    L_0x0045:
        r2 = java.lang.Integer.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00cb;
    L_0x004d:
        r2 = java.lang.Integer.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 == 0) goto L_0x0056;
    L_0x0055:
        goto L_0x00cb;
    L_0x0056:
        r2 = java.lang.Long.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00c6;
    L_0x005e:
        r2 = java.lang.Long.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 == 0) goto L_0x0067;
    L_0x0066:
        goto L_0x00c6;
    L_0x0067:
        r2 = java.lang.Float.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00c1;
    L_0x006f:
        r2 = java.lang.Float.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 == 0) goto L_0x0078;
    L_0x0077:
        goto L_0x00c1;
    L_0x0078:
        r2 = java.lang.Double.TYPE;	 Catch:{ Throwable -> 0x00eb }
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00bc;
    L_0x0080:
        r2 = java.lang.Double.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 == 0) goto L_0x0089;
    L_0x0088:
        goto L_0x00bc;
    L_0x0089:
        r2 = java.lang.String.class;
        r2 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r2 != 0) goto L_0x00b7;
    L_0x0091:
        r2 = java.lang.String.class;
        r1 = defpackage.akcr.a(r1, r2);	 Catch:{ Throwable -> 0x00eb }
        if (r1 == 0) goto L_0x009a;
    L_0x0099:
        goto L_0x00b7;
    L_0x009a:
        r5 = new java.lang.IllegalArgumentException;	 Catch:{ Throwable -> 0x00eb }
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x00eb }
        r1 = "Unsupported input type: [";
        r0.<init>(r1);	 Catch:{ Throwable -> 0x00eb }
        r1 = java.lang.String.class;
        r0.append(r1);	 Catch:{ Throwable -> 0x00eb }
        r1 = 93;
        r0.append(r1);	 Catch:{ Throwable -> 0x00eb }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x00eb }
        r5.<init>(r0);	 Catch:{ Throwable -> 0x00eb }
        r5 = (java.lang.Throwable) r5;	 Catch:{ Throwable -> 0x00eb }
        throw r5;	 Catch:{ Throwable -> 0x00eb }
    L_0x00b7:
        r5 = r5.f(r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00bc:
        r5 = r5.c(r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00c1:
        r5 = r5.b(r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00c6:
        r5 = r5.e(r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00cb:
        r5 = r5.d(r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x00d4;
    L_0x00d0:
        r5 = r5.a(r0);	 Catch:{ Throwable -> 0x00eb }
    L_0x00d4:
        r0 = java.lang.String.class;
        r5 = r5.a(r0);	 Catch:{ Throwable -> 0x00eb }
        r0 = "cast(R::class.java)";
        defpackage.akcr.a(r5, r0);	 Catch:{ Throwable -> 0x00eb }
        r5 = r5.b();	 Catch:{ Throwable -> 0x00eb }
        r0 = "observe<T>(key).blockingFirst()";
        defpackage.akcr.a(r5, r0);	 Catch:{ Throwable -> 0x00eb }
        goto L_0x010f;
    L_0x00e9:
        r4 = move-exception;
        goto L_0x011d;
    L_0x00eb:
        r5 = move-exception;
        r0 = com.google.common.base.Throwables.getRootCause(r5);	 Catch:{ all -> 0x00e9 }
        r0 = r0 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x00e9 }
        if (r0 == 0) goto L_0x011c;
    L_0x00f4:
        r5 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x00e9 }
        r5.interrupt();	 Catch:{ all -> 0x00e9 }
        r4 = (defpackage.mje) r4;	 Catch:{ all -> 0x00e9 }
        r4 = r4.a();	 Catch:{ all -> 0x00e9 }
        r5 = "key.delegate";
        defpackage.akcr.a(r4, r5);	 Catch:{ all -> 0x00e9 }
        r4 = r4.b();	 Catch:{ all -> 0x00e9 }
        if (r4 == 0) goto L_0x0114;
    L_0x010c:
        r5 = r4;
        r5 = (java.lang.String) r5;	 Catch:{ all -> 0x00e9 }
    L_0x010f:
        r5 = (java.lang.String) r5;
        if (r5 != 0) goto L_0x0120;
    L_0x0113:
        goto L_0x011e;
    L_0x0114:
        r4 = new ajxt;	 Catch:{ all -> 0x00e9 }
        r5 = "null cannot be cast to non-null type kotlin.String";
        r4.<init>(r5);	 Catch:{ all -> 0x00e9 }
        throw r4;	 Catch:{ all -> 0x00e9 }
    L_0x011c:
        throw r5;	 Catch:{ all -> 0x00e9 }
    L_0x011d:
        throw r4;
    L_0x011e:
        r5 = "";
    L_0x0120:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mkk.getExperimentParameter(java.lang.String, java.lang.String):java.lang.String");
    }
}
