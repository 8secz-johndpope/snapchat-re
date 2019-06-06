package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.zzx;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.File;
import java.io.IOException;
import java.security.KeyPair;

/* renamed from: caq */
public final class caq {
    private SharedPreferences a;
    private Context b;

    public caq(Context context) {
        this(context, "com.google.android.gms.appid");
    }

    private caq(Context context, String str) {
        String str2 = "FirebaseInstanceId";
        this.b = context;
        this.a = context.getSharedPreferences(str, 0);
        String valueOf = String.valueOf(str);
        str = "-no-backup";
        File file = new File(zzx.getNoBackupFilesDir(this.b), str.length() != 0 ? valueOf.concat(str) : new String(valueOf));
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i(str2, "App restored, clearing state");
                    b();
                    FirebaseInstanceId.getInstance(can.c()).f();
                }
            } catch (IOException e) {
                if (Log.isLoggable(str2, 3)) {
                    str = "Error creating file in no backup dir: ";
                    valueOf = String.valueOf(e.getMessage());
                    Log.d(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                }
            }
        }
    }

    private static String a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 3) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append("|S|");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 4) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append("|T|");
        stringBuilder.append(str2);
        stringBuilder.append("|");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    private final synchronized boolean c() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized car a(String str, String str2, String str3) {
        return car.a(this.a.getString(caq.b(str, str2, str3), null));
    }

    /* JADX WARNING: Missing block: B:12:0x0023, code skipped:
            return null;
     */
    public final synchronized java.lang.String a() {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x0024 }
        r1 = "topic_operaion_queue";
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x0024 }
        if (r0 == 0) goto L_0x0022;
    L_0x000c:
        r1 = ",";
        r0 = r0.split(r1);	 Catch:{ all -> 0x0024 }
        r1 = r0.length;	 Catch:{ all -> 0x0024 }
        r3 = 1;
        if (r1 <= r3) goto L_0x0022;
    L_0x0016:
        r1 = r0[r3];	 Catch:{ all -> 0x0024 }
        r1 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x0024 }
        if (r1 != 0) goto L_0x0022;
    L_0x001e:
        r0 = r0[r3];	 Catch:{ all -> 0x0024 }
        monitor-exit(r4);
        return r0;
    L_0x0022:
        monitor-exit(r4);
        return r2;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caq.a():java.lang.String");
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        str4 = car.a(str4, str5, System.currentTimeMillis());
        if (str4 != null) {
            Editor edit = this.a.edit();
            edit.putString(caq.b(str, str2, str3), str4);
            edit.commit();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x005d in {4, 5, 10, 11, 13, 15, 16, 19} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized boolean a(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x005a }
        r1 = "topic_operaion_queue";	 Catch:{ all -> 0x005a }
        r2 = "";	 Catch:{ all -> 0x005a }
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x005a }
        r1 = ",";	 Catch:{ all -> 0x005a }
        r2 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x005a }
        r3 = r2.length();	 Catch:{ all -> 0x005a }
        if (r3 == 0) goto L_0x001c;	 Catch:{ all -> 0x005a }
        r1 = r1.concat(r2);	 Catch:{ all -> 0x005a }
        goto L_0x0022;	 Catch:{ all -> 0x005a }
        r2 = new java.lang.String;	 Catch:{ all -> 0x005a }
        r2.<init>(r1);	 Catch:{ all -> 0x005a }
        r1 = r2;	 Catch:{ all -> 0x005a }
        r1 = r0.startsWith(r1);	 Catch:{ all -> 0x005a }
        if (r1 == 0) goto L_0x0058;	 Catch:{ all -> 0x005a }
        r1 = ",";	 Catch:{ all -> 0x005a }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x005a }
        r2 = r5.length();	 Catch:{ all -> 0x005a }
        if (r2 == 0) goto L_0x0039;	 Catch:{ all -> 0x005a }
        r5 = r1.concat(r5);	 Catch:{ all -> 0x005a }
        goto L_0x003e;	 Catch:{ all -> 0x005a }
        r5 = new java.lang.String;	 Catch:{ all -> 0x005a }
        r5.<init>(r1);	 Catch:{ all -> 0x005a }
        r5 = r5.length();	 Catch:{ all -> 0x005a }
        r5 = r0.substring(r5);	 Catch:{ all -> 0x005a }
        r0 = r4.a;	 Catch:{ all -> 0x005a }
        r0 = r0.edit();	 Catch:{ all -> 0x005a }
        r1 = "topic_operaion_queue";	 Catch:{ all -> 0x005a }
        r5 = r0.putString(r1, r5);	 Catch:{ all -> 0x005a }
        r5.apply();	 Catch:{ all -> 0x005a }
        r5 = 1;
        monitor-exit(r4);
        return r5;
        r5 = 0;
        goto L_0x0056;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caq.a(java.lang.String):boolean");
    }

    public final synchronized KeyPair b(String str) {
        KeyPair a;
        a = cap.a();
        long currentTimeMillis = System.currentTimeMillis();
        Editor edit = this.a.edit();
        edit.putString(caq.a(str, "|P|"), Base64.encodeToString(a.getPublic().getEncoded(), 11));
        edit.putString(caq.a(str, "|K|"), Base64.encodeToString(a.getPrivate().getEncoded(), 11));
        edit.putString(caq.a(str, "cre"), Long.toString(currentTimeMillis));
        edit.commit();
        return a;
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x003d in {7, 10, 13} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public final synchronized void c(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x003a }
        r0 = "|T|";	 Catch:{ all -> 0x003a }
        r5 = r5.concat(r0);	 Catch:{ all -> 0x003a }
        r0 = r4.a;	 Catch:{ all -> 0x003a }
        r0 = r0.edit();	 Catch:{ all -> 0x003a }
        r1 = r4.a;	 Catch:{ all -> 0x003a }
        r1 = r1.getAll();	 Catch:{ all -> 0x003a }
        r1 = r1.keySet();	 Catch:{ all -> 0x003a }
        r1 = r1.iterator();	 Catch:{ all -> 0x003a }
        r2 = r1.hasNext();	 Catch:{ all -> 0x003a }
        if (r2 == 0) goto L_0x0035;	 Catch:{ all -> 0x003a }
        r2 = r1.next();	 Catch:{ all -> 0x003a }
        r2 = (java.lang.String) r2;	 Catch:{ all -> 0x003a }
        r3 = r2.startsWith(r5);	 Catch:{ all -> 0x003a }
        if (r3 == 0) goto L_0x001f;	 Catch:{ all -> 0x003a }
        r0.remove(r2);	 Catch:{ all -> 0x003a }
        goto L_0x001f;	 Catch:{ all -> 0x003a }
        r0.commit();	 Catch:{ all -> 0x003a }
        monitor-exit(r4);
        return;
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caq.c(java.lang.String):void");
    }

    /* JADX WARNING: Missing block: B:16:0x007d, code skipped:
            return null;
     */
    public final synchronized java.security.KeyPair d(java.lang.String r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a;	 Catch:{ all -> 0x007e }
        r1 = "|P|";
        r1 = defpackage.caq.a(r5, r1);	 Catch:{ all -> 0x007e }
        r2 = 0;
        r0 = r0.getString(r1, r2);	 Catch:{ all -> 0x007e }
        r1 = r4.a;	 Catch:{ all -> 0x007e }
        r3 = "|K|";
        r5 = defpackage.caq.a(r5, r3);	 Catch:{ all -> 0x007e }
        r5 = r1.getString(r5, r2);	 Catch:{ all -> 0x007e }
        if (r0 == 0) goto L_0x007c;
    L_0x001c:
        if (r5 != 0) goto L_0x001f;
    L_0x001e:
        goto L_0x007c;
    L_0x001f:
        r1 = 8;
        r0 = android.util.Base64.decode(r0, r1);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r5 = android.util.Base64.decode(r5, r1);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r1 = "RSA";
        r1 = java.security.KeyFactory.getInstance(r1);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r3 = new java.security.spec.X509EncodedKeySpec;	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r3.<init>(r0);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r0 = r1.generatePublic(r3);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r3 = new java.security.spec.PKCS8EncodedKeySpec;	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r3.<init>(r5);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r5 = r1.generatePrivate(r3);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r1 = new java.security.KeyPair;	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        r1.<init>(r0, r5);	 Catch:{ InvalidKeySpecException -> 0x004a, NoSuchAlgorithmException | InvalidKeySpecException -> 0x0048 }
        monitor-exit(r4);
        return r1;
    L_0x0048:
        r5 = move-exception;
        goto L_0x004b;
    L_0x004a:
        r5 = move-exception;
    L_0x004b:
        r0 = "FirebaseInstanceId";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007e }
        r1 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007e }
        r1 = r1.length();	 Catch:{ all -> 0x007e }
        r1 = r1 + 19;
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007e }
        r3.<init>(r1);	 Catch:{ all -> 0x007e }
        r1 = "Invalid key stored ";
        r3.append(r1);	 Catch:{ all -> 0x007e }
        r3.append(r5);	 Catch:{ all -> 0x007e }
        r5 = r3.toString();	 Catch:{ all -> 0x007e }
        android.util.Log.w(r0, r5);	 Catch:{ all -> 0x007e }
        r5 = defpackage.can.c();	 Catch:{ all -> 0x007e }
        r5 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r5);	 Catch:{ all -> 0x007e }
        r5.f();	 Catch:{ all -> 0x007e }
        monitor-exit(r4);
        return r2;
    L_0x007c:
        monitor-exit(r4);
        return r2;
    L_0x007e:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caq.d(java.lang.String):java.security.KeyPair");
    }
}
