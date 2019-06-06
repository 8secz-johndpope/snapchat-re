package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: wje */
public final class wje {
    private final ihh a;

    public wje(ihh ihh) {
        this.a = (ihh) Preconditions.checkNotNull(ihh);
    }

    public final Map<wjd, alqu> a(String str, aeao aeao, List<aean> list) {
        String str2 = str;
        aeao aeao2 = aeao;
        HashMap hashMap = new HashMap();
        long toSeconds = TimeUnit.MILLISECONDS.toSeconds(this.a.a());
        for (aean aean : list) {
            Optional a = wjd.a(aean.c);
            if (a.isPresent()) {
                alqu alqu = new alqu();
                String str3 = aean.b;
                if (str3 != null) {
                    alqu.b = str3;
                    alqu.a |= 1;
                    if (str2 != null) {
                        alqu.d = str2;
                        alqu.a |= 2;
                        String[] strArr = new String[1];
                        int i = 0;
                        strArr[0] = aean.c;
                        alqu.c = strArr;
                        alqu.g = toSeconds;
                        alqu.a |= 16;
                        long toSeconds2 = ((aeao2.a & 1) != 0 ? 1 : null) != null ? aeao2.b : TimeUnit.MILLISECONDS.toSeconds(wjf.a);
                        long j = ((aeao2.a & 2) != 0 ? 1 : null) != null ? aeao2.c : 0;
                        if ((aean.a & 4) != 0) {
                            i = 1;
                        }
                        if (i != 0) {
                            alqu.e = (aean.d + toSeconds) - toSeconds2;
                            alqu.a |= 4;
                            alqu.f = (aean.d + toSeconds) - j;
                            alqu.a |= 8;
                        }
                        hashMap.put(a.get(), alqu);
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            str2 = str;
            aeao2 = aeao;
        }
        return hashMap;
    }

    public final boolean a(alqu alqu) {
        if (alqu != null) {
            return ((alqu.a & 8) != 0 ? 1 : null) != null && new Date(this.a.a()).after(new Date(TimeUnit.SECONDS.toMillis(alqu.f)));
        }
    }

    /* JADX WARNING: Missing block: B:27:0x006b, code skipped:
            return false;
     */
    public final boolean a(defpackage.alqu r7, defpackage.wjd r8) {
        /*
        r6 = this;
        r0 = 0;
        if (r7 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = r7.c;
        if (r1 == 0) goto L_0x006b;
    L_0x0008:
        r1 = r7.c;
        r1 = com.google.common.collect.ImmutableSet.copyOf(r1);
        r8 = r8.mServerSideScopeName;
        r8 = r1.contains(r8);
        if (r8 != 0) goto L_0x0017;
    L_0x0016:
        goto L_0x006b;
    L_0x0017:
        r8 = r7.b;
        r8 = com.google.common.base.Strings.isNullOrEmpty(r8);
        if (r8 == 0) goto L_0x0020;
    L_0x001f:
        return r0;
    L_0x0020:
        r8 = new java.util.Date;
        r1 = r6.a;
        r1 = r1.a();
        r8.<init>(r1);
        r1 = r7.a;
        r1 = r1 & 4;
        r2 = 1;
        if (r1 == 0) goto L_0x0034;
    L_0x0032:
        r1 = 1;
        goto L_0x0035;
    L_0x0034:
        r1 = 0;
    L_0x0035:
        if (r1 == 0) goto L_0x004b;
    L_0x0037:
        r3 = r7.e;
        r1 = new java.util.Date;
        r5 = java.util.concurrent.TimeUnit.SECONDS;
        r3 = r5.toMillis(r3);
        r1.<init>(r3);
        r1 = r1.before(r8);
        if (r1 == 0) goto L_0x004b;
    L_0x004a:
        return r0;
    L_0x004b:
        r1 = r7.a;
        r1 = r1 & 16;
        if (r1 == 0) goto L_0x0053;
    L_0x0051:
        r1 = 1;
        goto L_0x0054;
    L_0x0053:
        r1 = 0;
    L_0x0054:
        if (r1 == 0) goto L_0x006a;
    L_0x0056:
        r3 = r7.g;
        r7 = new java.util.Date;
        r1 = java.util.concurrent.TimeUnit.SECONDS;
        r3 = r1.toMillis(r3);
        r7.<init>(r3);
        r7 = r7.after(r8);
        if (r7 == 0) goto L_0x006a;
    L_0x0069:
        return r0;
    L_0x006a:
        return r2;
    L_0x006b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wje.a(alqu, wjd):boolean");
    }
}
