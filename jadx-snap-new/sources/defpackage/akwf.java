package defpackage;

import java.security.PrivilegedAction;

/* renamed from: akwf */
public final class akwf {

    /* renamed from: akwf$1 */
    static class 1 implements PrivilegedAction<String> {
        1() {
        }

        public final /* synthetic */ Object run() {
            return System.getProperty("line.separator");
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0009 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Missing block: B:4:?, code skipped:
            java.lang.String.format("%n", new java.lang.Object[0]);
     */
    /* JADX WARNING: Missing block: B:5:0x0011, code skipped:
            return;
     */
    static {
        /*
        r0 = new akwf$1;	 Catch:{ Exception -> 0x0009 }
        r0.<init>();	 Catch:{ Exception -> 0x0009 }
        java.security.AccessController.doPrivileged(r0);	 Catch:{ Exception -> 0x0009 }
        return;
    L_0x0009:
        r0 = "%n";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0011 }
        java.lang.String.format(r0, r1);	 Catch:{ Exception -> 0x0011 }
    L_0x0011:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akwf.<clinit>():void");
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }
}
