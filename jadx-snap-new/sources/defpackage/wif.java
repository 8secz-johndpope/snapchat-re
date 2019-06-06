package defpackage;

import android.util.Pair;
import com.google.common.base.Strings;
import com.snapchat.android.core.security.SCPluginWrapper;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wif */
public final class wif implements whj {
    private AtomicReference<Pair<String, String>> a = new AtomicReference(null);

    private static String a(byte[] bArr) {
        return String.format("%064x", new Object[]{new BigInteger(1, bArr)});
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x006e in {8, 9, 10, 12, 15} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static java.lang.String b(java.lang.String r4, java.lang.String r5) {
        /*
        r4 = java.lang.String.valueOf(r4);
        r0 = "iEk21fuwZApXlz93750dmW22pw389dPwOk";
        r4 = r0.concat(r4);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r5);
        r1.append(r0);
        r5 = r1.toString();
        r0 = "SHA-256";	 Catch:{ NoSuchAlgorithmException -> 0x0067 }
        r0 = java.security.MessageDigest.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0067 }
        r1 = com.google.common.base.Charsets.UTF_8;
        r4 = r4.getBytes(r1);
        r0.update(r4);
        r4 = r0.digest();
        r4 = defpackage.wif.a(r4);
        r5 = r5.getBytes(r1);
        r0.update(r5);
        r5 = r0.digest();
        r5 = defpackage.wif.a(r5);
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = 0;
        r2 = 64;
        if (r1 >= r2) goto L_0x0062;
        r2 = "0001110111101110001111010101111011010001001110011000110001000110";
        r2 = r2.charAt(r1);
        r3 = 48;
        if (r2 != r3) goto L_0x0058;
        r2 = r4.charAt(r1);
        goto L_0x005c;
        r2 = r5.charAt(r1);
        r0.append(r2);
        r1 = r1 + 1;
        goto L_0x0045;
        r4 = r0.toString();
        return r4;
        r4 = move-exception;
        r5 = new java.lang.RuntimeException;
        r5.<init>(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wif.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public final <T extends aedh> T a(T t) {
        String l = Long.toString(System.currentTimeMillis());
        t.C = l;
        t.D = wif.b("m198sOkJEn37DjqZ32lpRu76xmw288xSQ9", l);
        return t;
    }

    public final String a(String str) {
        return wif.b("m198sOkJEn37DjqZ32lpRu76xmw288xSQ9", str);
    }

    public final String a(String str, String str2) {
        int isNullOrEmpty = Strings.isNullOrEmpty(str2) ^ 1;
        Pair pair = (Pair) this.a.get();
        if (pair != null && ((String) pair.first).equals(str)) {
            return (String) pair.second;
        }
        Object b = wif.b(str2, str);
        if (SCPluginWrapper.a()) {
            b = SCPluginWrapper.signToken(b);
        }
        if (isNullOrEmpty != 0) {
            this.a.set(Pair.create(str, b));
        }
        return b;
    }

    public final void a() {
        this.a.set(null);
    }
}
