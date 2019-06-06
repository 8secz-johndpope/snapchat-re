package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.impl.DefaultBadger;

/* renamed from: akgn */
public class akgn implements akgg {
    private static final String[] a = new String[]{"_id", "class"};
    private DefaultBadger b;

    public akgn() {
        if (VERSION.SDK_INT >= 21) {
            this.b = new DefaultBadger();
        }
    }

    private static ContentValues a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    public final List<String> a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:31:0x009e in {8, 9, 10, 13, 23, 25, 27, 30} preds:[]
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
    public final void a(android.content.Context r11, android.content.ComponentName r12, int r13) {
        /*
        r10 = this;
        r0 = r10.b;
        r1 = 1;
        r2 = 0;
        if (r0 == 0) goto L_0x003a;
        r0 = new android.content.Intent;
        r3 = "android.intent.action.BADGE_COUNT_UPDATE";
        r0.<init>(r3);
        r0 = defpackage.akgr.a(r11, r0);
        r0 = r0.size();
        if (r0 > 0) goto L_0x0031;
        r0 = android.os.Build.VERSION.SDK_INT;
        r3 = 26;
        if (r0 < r3) goto L_0x002f;
        r0 = new android.content.Intent;
        r3 = "me.leolin.shortcutbadger.BADGE_COUNT_UPDATE";
        r0.<init>(r3);
        r0 = defpackage.akgr.a(r11, r0);
        r0 = r0.size();
        if (r0 <= 0) goto L_0x002f;
        goto L_0x0031;
        r0 = 0;
        goto L_0x0032;
        r0 = 1;
        if (r0 == 0) goto L_0x003a;
        r0 = r10.b;
        r0.a(r11, r12, r13);
        return;
        r0 = "content://com.sec.badge/apps?notify=true";
        r0 = android.net.Uri.parse(r0);
        r11 = r11.getContentResolver();
        r9 = 0;
        r5 = a;	 Catch:{ all -> 0x0099 }
        r6 = "package=?";	 Catch:{ all -> 0x0099 }
        r7 = new java.lang.String[r1];	 Catch:{ all -> 0x0099 }
        r3 = r12.getPackageName();	 Catch:{ all -> 0x0099 }
        r7[r2] = r3;	 Catch:{ all -> 0x0099 }
        r8 = 0;	 Catch:{ all -> 0x0099 }
        r3 = r11;	 Catch:{ all -> 0x0099 }
        r4 = r0;	 Catch:{ all -> 0x0099 }
        r9 = r3.query(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0099 }
        if (r9 == 0) goto L_0x0095;	 Catch:{ all -> 0x0099 }
        r3 = r12.getClassName();	 Catch:{ all -> 0x0099 }
        r4 = 0;	 Catch:{ all -> 0x0099 }
        r5 = r9.moveToNext();	 Catch:{ all -> 0x0099 }
        if (r5 == 0) goto L_0x008c;	 Catch:{ all -> 0x0099 }
        r5 = r9.getInt(r2);	 Catch:{ all -> 0x0099 }
        r6 = defpackage.akgn.a(r12, r13, r2);	 Catch:{ all -> 0x0099 }
        r7 = "_id=?";	 Catch:{ all -> 0x0099 }
        r8 = new java.lang.String[r1];	 Catch:{ all -> 0x0099 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x0099 }
        r8[r2] = r5;	 Catch:{ all -> 0x0099 }
        r11.update(r0, r6, r7, r8);	 Catch:{ all -> 0x0099 }
        r5 = "class";	 Catch:{ all -> 0x0099 }
        r5 = r9.getColumnIndex(r5);	 Catch:{ all -> 0x0099 }
        r5 = r9.getString(r5);	 Catch:{ all -> 0x0099 }
        r5 = r3.equals(r5);	 Catch:{ all -> 0x0099 }
        if (r5 == 0) goto L_0x005f;	 Catch:{ all -> 0x0099 }
        r4 = 1;	 Catch:{ all -> 0x0099 }
        goto L_0x005f;	 Catch:{ all -> 0x0099 }
        if (r4 != 0) goto L_0x0095;	 Catch:{ all -> 0x0099 }
        r12 = defpackage.akgn.a(r12, r13, r1);	 Catch:{ all -> 0x0099 }
        r11.insert(r0, r12);	 Catch:{ all -> 0x0099 }
        defpackage.akgs.a(r9);
        return;
        r11 = move-exception;
        defpackage.akgs.a(r9);
        throw r11;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgn.a(android.content.Context, android.content.ComponentName, int):void");
    }
}
