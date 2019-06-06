package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;

public class ContextCompat {
    private static final Object sLock = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static int getColor(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static ColorStateList getColorStateList(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:20:0x003b in {3, 7, 13, 16, 19} preds:[]
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
    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r4, int r5) {
        /*
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 21;
        if (r0 < r1) goto L_0x000b;
        r4 = r4.getDrawable(r5);
        return r4;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x001a;
        r4 = r4.getResources();
        r4 = r4.getDrawable(r5);
        return r4;
        r0 = sLock;
        monitor-enter(r0);
        r1 = sTempValue;	 Catch:{ all -> 0x0038 }
        if (r1 != 0) goto L_0x0028;	 Catch:{ all -> 0x0038 }
        r1 = new android.util.TypedValue;	 Catch:{ all -> 0x0038 }
        r1.<init>();	 Catch:{ all -> 0x0038 }
        sTempValue = r1;	 Catch:{ all -> 0x0038 }
        r1 = r4.getResources();	 Catch:{ all -> 0x0038 }
        r2 = sTempValue;	 Catch:{ all -> 0x0038 }
        r3 = 1;	 Catch:{ all -> 0x0038 }
        r1.getValue(r5, r2, r3);	 Catch:{ all -> 0x0038 }
        r5 = sTempValue;	 Catch:{ all -> 0x0038 }
        r5 = r5.resourceId;	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        goto L_0x0011;	 Catch:{ all -> 0x0038 }
        r4 = move-exception;	 Catch:{ all -> 0x0038 }
        monitor-exit(r0);	 Catch:{ all -> 0x0038 }
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.content.ContextCompat.getDrawable(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public static File[] getExternalCacheDirs(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        return VERSION.SDK_INT >= 24 ? context.isDeviceProtectedStorage() : false;
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
