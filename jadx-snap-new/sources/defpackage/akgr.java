package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import java.util.Collections;
import java.util.List;

/* renamed from: akgr */
public final class akgr {
    public static List<ResolveInfo> a(Context context, Intent intent) {
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return queryBroadcastReceivers != null ? queryBroadcastReceivers : Collections.emptyList();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0043 in {7, 8, 10} preds:[]
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
    public static void b(android.content.Context r3, android.content.Intent r4) {
        /*
        r0 = defpackage.akgr.a(r3, r4);
        r1 = r0.size();
        if (r1 == 0) goto L_0x002b;
        r0 = r0.iterator();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x002a;
        r1 = r0.next();
        r1 = (android.content.pm.ResolveInfo) r1;
        r2 = new android.content.Intent;
        r2.<init>(r4);
        if (r1 == 0) goto L_0x000e;
        r1 = r1.resolvePackageName;
        r2.setPackage(r1);
        r3.sendBroadcast(r2);
        goto L_0x000e;
        return;
        r3 = new akgh;
        r0 = new java.lang.StringBuilder;
        r1 = "unable to resolve intent: ";
        r0.<init>(r1);
        r4 = r4.toString();
        r0.append(r4);
        r4 = r0.toString();
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akgr.b(android.content.Context, android.content.Intent):void");
    }

    public static void c(Context context, Intent intent) {
        Object obj = null;
        if (VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                akgr.b(context, intent2);
                obj = 1;
            } catch (akgh unused) {
            }
        }
        if (obj == null) {
            akgr.b(context, intent);
        }
    }
}
