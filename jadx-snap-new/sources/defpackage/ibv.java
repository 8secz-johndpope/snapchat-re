package defpackage;

import android.text.TextUtils;
import com.google.common.base.Supplier;

/* renamed from: ibv */
public abstract class ibv {
    protected final ajwy<hyk> a;
    protected final ajwy<hys> b;
    private final hyw c;
    private final ajwy<ian> d;

    /* renamed from: ibv$a */
    public static class a {
        final byte[] a;
        final boolean b;
        final boolean c;

        a(byte[] bArr, boolean z, boolean z2) {
            this.a = bArr;
            this.b = z;
            this.c = z2;
        }
    }

    protected ibv(ajwy<ian> ajwy, hyw hyw, ajwy<hyk> ajwy2, ajwy<hys> ajwy3) {
        this.c = hyw;
        this.d = ajwy;
        this.a = ajwy2;
        this.b = ajwy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x012e  */
    private defpackage.ibv.a a(defpackage.icg r29, defpackage.icf r30, com.google.common.base.Supplier<byte[]> r31, com.google.common.base.Supplier<byte[]> r32, java.lang.String r33, java.lang.String r34, java.lang.String r35) {
        /*
        r28 = this;
        r1 = r28;
        r0 = r29;
        r2 = r1.b;
        r2 = r2.get();
        r2 = (defpackage.hys) r2;
        r3 = defpackage.hyt.FIDELIUS_SNAP_INVERSE_PHI;
        r2 = r2.a(r3);
        r2 = r2.a();
        r13 = r28.a();
        r14 = r0.b;
        r3 = android.text.TextUtils.isEmpty(r33);
        r15 = 1;
        r16 = r3 ^ 1;
        r3 = r32.get();
        r3 = (byte[]) r3;
        r4 = r31.get();
        r4 = (byte[]) r4;
        r12 = defpackage.abne.a(r4);
        r11 = 0;
        r10 = 0;
        if (r3 == 0) goto L_0x01fd;
    L_0x0037:
        r4 = android.text.TextUtils.isEmpty(r12);
        if (r4 == 0) goto L_0x003f;
    L_0x003d:
        goto L_0x01fd;
    L_0x003f:
        r4 = r0.d;
        r4 = r4.get(r12);
        r9 = r4;
        r9 = (defpackage.ahqf) r9;
        if (r9 != 0) goto L_0x006c;
    L_0x004a:
        r0 = r1.a;
        r0 = r0.get();
        r3 = r0;
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = 0;
        r0 = 0;
        r12 = "failure_changed_device_suppress_on";
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r2 = 0;
        r10 = r12;
        r13 = r11;
        r11 = r0;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = new ibv$a;
        r0.<init>(r13, r15, r2);
        return r0;
    L_0x006c:
        r8 = r9.i;
        r7 = r0.c;
        r4 = defpackage.abne.b(r7);
        r0 = r0.a;
        if (r4 == 0) goto L_0x01b9;
    L_0x0078:
        r5 = android.text.TextUtils.isEmpty(r35);
        if (r5 != 0) goto L_0x01b9;
    L_0x007e:
        r5 = android.text.TextUtils.isEmpty(r12);
        if (r5 != 0) goto L_0x01b9;
    L_0x0084:
        r6 = r9.k;
        if (r6 == 0) goto L_0x01a9;
    L_0x0088:
        r5 = r6.intValue();
        r10 = 9;
        if (r5 != r10) goto L_0x01a9;
    L_0x0090:
        r5 = r1.a(r7);
        if (r5 != 0) goto L_0x011e;
    L_0x0096:
        r10 = r1.d;	 Catch:{ GeneralSecurityException -> 0x00f3 }
        r10 = r10.get();	 Catch:{ GeneralSecurityException -> 0x00f3 }
        r10 = (defpackage.ian) r10;	 Catch:{ GeneralSecurityException -> 0x00f3 }
        r10 = r10.a(r3, r4);	 Catch:{ GeneralSecurityException -> 0x00f3 }
        if (r10 == 0) goto L_0x00b5;
    L_0x00a4:
        r1.a(r10, r7, r8, r0);	 Catch:{ GeneralSecurityException -> 0x00e4 }
        r19 = r6;
        r29 = r7;
        r22 = r8;
        r20 = r9;
        r21 = r10;
        r23 = r12;
        r15 = 0;
        goto L_0x011c;
    L_0x00b5:
        r0 = r1.a;	 Catch:{ GeneralSecurityException -> 0x00e4 }
        r0 = r0.get();	 Catch:{ GeneralSecurityException -> 0x00e4 }
        r3 = r0;
        r3 = (defpackage.hyk) r3;	 Catch:{ GeneralSecurityException -> 0x00e4 }
        r5 = 0;
        r0 = java.lang.Boolean.FALSE;	 Catch:{ GeneralSecurityException -> 0x00e4 }
        r17 = "failure_mystique_null";
        r18 = 0;
        r4 = r2;
        r19 = r6;
        r6 = r0;
        r29 = r7;
        r7 = r13;
        r22 = r8;
        r8 = r14;
        r20 = r9;
        r9 = r16;
        r21 = r10;
        r15 = 0;
        r10 = r17;
        r11 = r18;
        r23 = r12;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ GeneralSecurityException -> 0x00e2 }
        goto L_0x011c;
    L_0x00e2:
        r0 = move-exception;
        goto L_0x0101;
    L_0x00e4:
        r0 = move-exception;
        r19 = r6;
        r29 = r7;
        r22 = r8;
        r20 = r9;
        r21 = r10;
        r23 = r12;
        r15 = 0;
        goto L_0x0101;
    L_0x00f3:
        r0 = move-exception;
        r19 = r6;
        r29 = r7;
        r22 = r8;
        r20 = r9;
        r23 = r12;
        r15 = 0;
        r21 = r5;
    L_0x0101:
        r3 = r1.a;
        r3 = r3.get();
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = java.lang.Boolean.FALSE;
        r11 = defpackage.abmt.a(r0);
        r10 = "failure_mystique_gen_sec_exc";
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L_0x011c:
        r0 = 0;
        goto L_0x012c;
    L_0x011e:
        r19 = r6;
        r29 = r7;
        r22 = r8;
        r20 = r9;
        r23 = r12;
        r15 = 0;
        r21 = r5;
        r0 = 1;
    L_0x012c:
        if (r21 == 0) goto L_0x01f4;
    L_0x012e:
        r24 = r19.intValue();
        r3 = new icb;
        r4 = r1.d;
        r4 = r4.get();
        r26 = r4;
        r26 = (defpackage.ian) r26;
        r4 = r1.a;
        r4 = r4.get();
        r27 = r4;
        r27 = (defpackage.hyk) r27;
        r17 = r3;
        r18 = r20;
        r19 = r21;
        r20 = r35;
        r21 = r23;
        r23 = r29;
        r25 = r30;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
        r12 = r3.a();
        r3 = r12.a;
        if (r3 == 0) goto L_0x0183;
    L_0x0161:
        r3 = r1.a;
        r3 = r3.get();
        r3 = (defpackage.hyk) r3;
        r5 = 1;
        r6 = java.lang.Boolean.valueOf(r0);
        r10 = 0;
        r11 = 0;
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r0 = r12;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r2 = new ibv$a;
        r0 = r0.a;
        r2.<init>(r0, r15, r15);
        return r2;
    L_0x0183:
        r3 = r1.a;
        r3 = r3.get();
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = java.lang.Boolean.valueOf(r0);
        r11 = 0;
        r10 = "failure_unwrapping";
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r0 = r12;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r0.b;
        if (r0 == 0) goto L_0x01f4;
    L_0x01a2:
        r2 = r29;
        r1.b(r2);
        r10 = 1;
        goto L_0x01f5;
    L_0x01a9:
        r15 = 0;
        r0 = r1.a;
        r0 = r0.get();
        r3 = r0;
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = 0;
        r11 = 0;
        r10 = "failure_recipient_version_mismatch";
        goto L_0x01ea;
    L_0x01b9:
        r23 = r12;
        r15 = 0;
        if (r4 != 0) goto L_0x01c1;
    L_0x01be:
        r11 = "isSenderOutBytesNull";
        goto L_0x01d4;
    L_0x01c1:
        r0 = android.text.TextUtils.isEmpty(r35);
        if (r0 == 0) goto L_0x01ca;
    L_0x01c7:
        r11 = "isMyUserIdEmpty";
        goto L_0x01d4;
    L_0x01ca:
        r0 = android.text.TextUtils.isEmpty(r23);
        if (r0 == 0) goto L_0x01d3;
    L_0x01d0:
        r11 = "isMyOutBetaStringEmpty";
        goto L_0x01d4;
    L_0x01d3:
        r11 = 0;
    L_0x01d4:
        r0 = r1.a;
        r0 = r0.get();
        r3 = r0;
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = 0;
        r0 = java.lang.String.valueOf(r11);
        r4 = "failure_unexpected_null_or_empty:";
        r10 = r4.concat(r0);
        r11 = 0;
    L_0x01ea:
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L_0x01f4:
        r10 = 0;
    L_0x01f5:
        r0 = new ibv$a;
        r2 = 1;
        r12 = 0;
        r0.<init>(r12, r2, r10);
        return r0;
    L_0x01fd:
        r12 = r11;
        r15 = 0;
        r0 = r1.a;
        r0 = r0.get();
        r3 = r0;
        r3 = (defpackage.hyk) r3;
        r5 = 0;
        r6 = 0;
        r11 = 0;
        r10 = "failure_missing_betas";
        r4 = r2;
        r7 = r13;
        r8 = r14;
        r9 = r16;
        r2 = r12;
        r12 = r34;
        r3.a(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = new ibv$a;
        r0.<init>(r2, r15, r15);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibv.a(icg, icf, com.google.common.base.Supplier, com.google.common.base.Supplier, java.lang.String, java.lang.String, java.lang.String):ibv$a");
    }

    public final String a(String str, icg icg, String str2, boolean z, icf icf, Supplier<byte[]> supplier, Supplier<byte[]> supplier2, String str3, String str4) {
        hyk hyk;
        String str5;
        String str6 = str3;
        a a = a(icg, icf, supplier, supplier2, str2, str3, str4);
        String str7;
        if (a.a != null) {
            String a2 = abne.a(a.a);
            if (TextUtils.isEmpty(a2)) {
                hyk = (hyk) this.a.get();
                str5 = "failure_fid_key_string";
            } else {
                hyk hyk2;
                if (!z) {
                    hyk2 = (hyk) this.a.get();
                    str7 = "success_with_no_cleartext";
                } else if (TextUtils.isEmpty(str2)) {
                    hyk2 = (hyk) this.a.get();
                    str7 = "success_with_cleartext_lost";
                } else {
                    str7 = str2;
                    if (TextUtils.equals(a2, str2)) {
                        hyk2 = (hyk) this.a.get();
                        str7 = "success_with_cleartext_match";
                    } else {
                        hyk = (hyk) this.a.get();
                        str5 = "failure_mismatch";
                    }
                }
                hyk2.a(str6, true, str7);
                return a2;
            }
        }
        if (a.b) {
            hyv c = this.c.c("retry_".concat(String.valueOf(str3)));
            if (c == null) {
                hyk = (hyk) this.a.get();
                str5 = "snap_view_no_retry_service";
            } else if (TextUtils.isEmpty(str)) {
                hyk = (hyk) this.a.get();
                str5 = "snap_view_retry_missing_snap_id";
            } else {
                str7 = str;
                c.a(str, a.c, str6);
            }
            hyk.a(str5);
        }
        hyk = (hyk) this.a.get();
        str5 = "failure_fid_key_unwrap";
        hyk.a(str6, false, str5);
        return null;
    }

    public abstract void a(byte[] bArr, String str, String str2, int i);

    public abstract boolean a();

    public abstract byte[] a(String str);

    public abstract void b(String str);
}
