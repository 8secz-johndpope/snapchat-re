package defpackage;

import com.snap.core.db.AllUpdatesProcessor;

/* renamed from: shf */
public final class shf implements AllUpdatesProcessor {
    private final ajei a;
    private final tnj b;

    public shf(ajei ajei, tnj tnj) {
        akcr.b(ajei, "userSessionDisposable");
        akcr.b(tnj, "preferences");
        this.a = ajei;
        this.b = tnj;
    }

    /* JADX WARNING: Missing block: B:16:0x0095, code skipped:
            if (r1 == null) goto L_0x0097;
     */
    public final void applyUpdates(defpackage.aecy r10, com.snap.core.db.api.SnapDb r11, com.snap.core.db.api.DbTransaction r12) {
        /*
        r9 = this;
        r0 = "updates";
        defpackage.akcr.b(r10, r0);
        r0 = "database";
        defpackage.akcr.b(r11, r0);
        r11 = "tx";
        defpackage.akcr.b(r12, r11);
        r10 = r10.c;
        if (r10 == 0) goto L_0x00ac;
    L_0x0013:
        r11 = r9.a;
        r12 = r9.b;
        r12 = r12.b();
        r0 = defpackage.sft.NOTIFICATION_SOUND;
        r0 = (defpackage.fth) r0;
        r1 = r10.br;
        r2 = "OFF";
        r3 = 1;
        r1 = defpackage.akgb.a(r1, r2, r3);
        r1 = r1 ^ r3;
        r1 = java.lang.Boolean.valueOf(r1);
        r12 = r12.a(r0, r1);
        r0 = defpackage.sft.NOTIFICATION_RINGING;
        r0 = (defpackage.fth) r0;
        r1 = r10.bs;
        r1 = defpackage.akgb.a(r1, r2, r3);
        r1 = r1 ^ r3;
        r1 = java.lang.Boolean.valueOf(r1);
        r12 = r12.a(r0, r1);
        r0 = defpackage.sft.NOTIFICATIONS_ENABLE;
        r0 = (defpackage.fth) r0;
        r1 = r10.bM;
        r2 = java.lang.Boolean.FALSE;
        r1 = defpackage.akcr.a(r1, r2);
        r1 = r1 ^ r3;
        r1 = java.lang.Boolean.valueOf(r1);
        r12 = r12.a(r0, r1);
        r0 = defpackage.sft.NOTIFICATION_PRIVACY;
        r0 = (defpackage.fth) r0;
        r10 = r10.N;
        r1 = 0;
        if (r10 == 0) goto L_0x009a;
    L_0x0062:
        if (r10 == 0) goto L_0x0097;
    L_0x0064:
        r10 = (java.lang.Number) r10;
        r10 = r10.intValue();
        r2 = com.snap.core.db.column.PrivacyType.values();
        r4 = r2.length;
        r5 = 0;
        r6 = 0;
    L_0x0071:
        if (r6 >= r4) goto L_0x0085;
    L_0x0073:
        r7 = r2[r6];
        r8 = r7.getIntValue();
        if (r8 != r10) goto L_0x007d;
    L_0x007b:
        r8 = 1;
        goto L_0x007e;
    L_0x007d:
        r8 = 0;
    L_0x007e:
        if (r8 == 0) goto L_0x0082;
    L_0x0080:
        r1 = r7;
        goto L_0x0085;
    L_0x0082:
        r6 = r6 + 1;
        goto L_0x0071;
    L_0x0085:
        if (r1 != 0) goto L_0x0095;
    L_0x0087:
        r1 = new shg$a;
        r1.<init>(r10);
        r1 = (defpackage.akbk) r1;
        r10 = r1.invoke();
        r1 = r10;
        r1 = (com.snap.core.db.column.PrivacyType) r1;
    L_0x0095:
        if (r1 != 0) goto L_0x009a;
    L_0x0097:
        r10 = com.snap.core.db.column.PrivacyType.EVERYONE;
        r1 = r10;
    L_0x009a:
        r1 = (java.lang.Enum) r1;
        r10 = r12.a(r0, r1);
        r10 = r10.b();
        r12 = "preferences.edit()\n     …\n                .apply()";
        defpackage.akcr.a(r10, r12);
        r11.a(r10);
    L_0x00ac:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shf.applyUpdates(aecy, com.snap.core.db.api.SnapDb, com.snap.core.db.api.DbTransaction):void");
    }
}
