package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzbq;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.common.zzf;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.zzn;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public final class DynamiteModule {
    private static Boolean zzhdc;
    private static zzk zzhdd;
    private static zzm zzhde;
    private static String zzhdf;
    private static final ThreadLocal<zza> zzhdg = new ThreadLocal();
    private static final zzi zzhdh = new zza();
    public static final zzd zzhdi = new zzb();
    private static zzd zzhdj = new zzc();
    public static final zzd zzhdk = new zzd();
    public static final zzd zzhdl = new zze();
    public static final zzd zzhdm = new zzf();
    public static final zzd zzhdn = new zzg();
    private final Context zzhdo;

    public interface zzd {
        zzj zza(Context context, String str, zzi zzi);
    }

    static class zza {
        public Cursor zzhdp;

        private zza() {
        }

        /* synthetic */ zza(zza zza) {
            this();
        }
    }

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class zzc extends Exception {
        private zzc(String str) {
            super(str);
        }

        private zzc(String str, Throwable th) {
            super(str, th);
        }

        /* synthetic */ zzc(String str, Throwable th, zza zza) {
            this(str, th);
        }
    }

    static class zzb implements zzi {
        private final int zzhdq;
        private final int zzhdr = 0;

        public zzb(int i, int i2) {
            this.zzhdq = i;
        }

        public final int zzc(Context context, String str, boolean z) {
            return 0;
        }

        public final int zzx(Context context, String str) {
            return this.zzhdq;
        }
    }

    private DynamiteModule(Context context) {
        this.zzhdo = (Context) zzbq.checkNotNull(context);
    }

    private static Context zza(Context context, String str, int i, Cursor cursor, zzm zzm) {
        try {
            return (Context) zzn.zzy(zzm.zza(zzn.zzz(context), str, i, zzn.zzz(cursor)));
        } catch (Exception e) {
            str = "Failed to load DynamiteLoader: ";
            String valueOf = String.valueOf(e.toString());
            Log.e("DynamiteModule", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x0131 in {7, 11, 16, 17, 19, 27, 32, 33, 41, 44, 46, 48, 52, 54} preds:[]
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
    public static com.google.android.gms.dynamite.DynamiteModule zza(android.content.Context r10, com.google.android.gms.dynamite.DynamiteModule.zzd r11, java.lang.String r12) {
        /*
        r0 = ":";
        r1 = "DynamiteModule";
        r2 = zzhdg;
        r2 = r2.get();
        r2 = (com.google.android.gms.dynamite.DynamiteModule.zza) r2;
        r3 = new com.google.android.gms.dynamite.DynamiteModule$zza;
        r4 = 0;
        r3.<init>(r4);
        r5 = zzhdg;
        r5.set(r3);
        r5 = zzhdh;	 Catch:{ all -> 0x0121 }
        r5 = r11.zza(r10, r12, r5);	 Catch:{ all -> 0x0121 }
        r6 = r5.zzhds;	 Catch:{ all -> 0x0121 }
        r7 = r5.zzhdt;	 Catch:{ all -> 0x0121 }
        r8 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0121 }
        r8 = r8.length();	 Catch:{ all -> 0x0121 }
        r8 = r8 + 68;	 Catch:{ all -> 0x0121 }
        r9 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0121 }
        r9 = r9.length();	 Catch:{ all -> 0x0121 }
        r8 = r8 + r9;	 Catch:{ all -> 0x0121 }
        r9 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0121 }
        r9.<init>(r8);	 Catch:{ all -> 0x0121 }
        r8 = "Considering local module ";	 Catch:{ all -> 0x0121 }
        r9.append(r8);	 Catch:{ all -> 0x0121 }
        r9.append(r12);	 Catch:{ all -> 0x0121 }
        r9.append(r0);	 Catch:{ all -> 0x0121 }
        r9.append(r6);	 Catch:{ all -> 0x0121 }
        r6 = " and remote module ";	 Catch:{ all -> 0x0121 }
        r9.append(r6);	 Catch:{ all -> 0x0121 }
        r9.append(r12);	 Catch:{ all -> 0x0121 }
        r9.append(r0);	 Catch:{ all -> 0x0121 }
        r9.append(r7);	 Catch:{ all -> 0x0121 }
        r0 = r9.toString();	 Catch:{ all -> 0x0121 }
        android.util.Log.i(r1, r0);	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        r6 = -1;	 Catch:{ all -> 0x0121 }
        if (r0 != r6) goto L_0x0069;	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhds;	 Catch:{ all -> 0x0121 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        r7 = 1;	 Catch:{ all -> 0x0121 }
        if (r0 != r7) goto L_0x0072;	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhdt;	 Catch:{ all -> 0x0121 }
        if (r0 == 0) goto L_0x00f7;	 Catch:{ all -> 0x0121 }
        r0 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        if (r0 != r6) goto L_0x0089;	 Catch:{ all -> 0x0121 }
        r10 = zzz(r10, r12);	 Catch:{ all -> 0x0121 }
        r11 = r3.zzhdp;
        if (r11 == 0) goto L_0x0083;
        r11 = r3.zzhdp;
        r11.close();
        r11 = zzhdg;
        r11.set(r2);
        return r10;
        r0 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        if (r0 != r7) goto L_0x00dc;
        r0 = r5.zzhdt;	 Catch:{ zzc -> 0x0098 }
        r10 = zza(r10, r12, r0);	 Catch:{ zzc -> 0x0098 }
        r11 = r3.zzhdp;
        if (r11 == 0) goto L_0x0083;
        goto L_0x007e;
        r0 = move-exception;
        r7 = "Failed to load remote module: ";	 Catch:{ all -> 0x0121 }
        r8 = r0.getMessage();	 Catch:{ all -> 0x0121 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0121 }
        r9 = r8.length();	 Catch:{ all -> 0x0121 }
        if (r9 == 0) goto L_0x00ae;	 Catch:{ all -> 0x0121 }
        r7 = r7.concat(r8);	 Catch:{ all -> 0x0121 }
        goto L_0x00b4;	 Catch:{ all -> 0x0121 }
        r8 = new java.lang.String;	 Catch:{ all -> 0x0121 }
        r8.<init>(r7);	 Catch:{ all -> 0x0121 }
        r7 = r8;	 Catch:{ all -> 0x0121 }
        android.util.Log.w(r1, r7);	 Catch:{ all -> 0x0121 }
        r1 = r5.zzhds;	 Catch:{ all -> 0x0121 }
        if (r1 == 0) goto L_0x00d4;	 Catch:{ all -> 0x0121 }
        r1 = new com.google.android.gms.dynamite.DynamiteModule$zzb;	 Catch:{ all -> 0x0121 }
        r5 = r5.zzhds;	 Catch:{ all -> 0x0121 }
        r7 = 0;	 Catch:{ all -> 0x0121 }
        r1.<init>(r5, r7);	 Catch:{ all -> 0x0121 }
        r11 = r11.zza(r10, r12, r1);	 Catch:{ all -> 0x0121 }
        r11 = r11.zzhdu;	 Catch:{ all -> 0x0121 }
        if (r11 != r6) goto L_0x00d4;	 Catch:{ all -> 0x0121 }
        r10 = zzz(r10, r12);	 Catch:{ all -> 0x0121 }
        r11 = r3.zzhdp;
        if (r11 == 0) goto L_0x0083;
        goto L_0x007e;
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0121 }
        r11 = "Remote load failed. No local fallback found.";	 Catch:{ all -> 0x0121 }
        r10.<init>(r11, r0, r4);	 Catch:{ all -> 0x0121 }
        throw r10;	 Catch:{ all -> 0x0121 }
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0121 }
        r11 = r5.zzhdu;	 Catch:{ all -> 0x0121 }
        r12 = 47;	 Catch:{ all -> 0x0121 }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0121 }
        r0.<init>(r12);	 Catch:{ all -> 0x0121 }
        r12 = "VersionPolicy returned invalid code:";	 Catch:{ all -> 0x0121 }
        r0.append(r12);	 Catch:{ all -> 0x0121 }
        r0.append(r11);	 Catch:{ all -> 0x0121 }
        r11 = r0.toString();	 Catch:{ all -> 0x0121 }
        r10.<init>(r11, r4);	 Catch:{ all -> 0x0121 }
        throw r10;	 Catch:{ all -> 0x0121 }
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x0121 }
        r11 = r5.zzhds;	 Catch:{ all -> 0x0121 }
        r12 = r5.zzhdt;	 Catch:{ all -> 0x0121 }
        r0 = 91;	 Catch:{ all -> 0x0121 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0121 }
        r1.<init>(r0);	 Catch:{ all -> 0x0121 }
        r0 = "No acceptable module found. Local version is ";	 Catch:{ all -> 0x0121 }
        r1.append(r0);	 Catch:{ all -> 0x0121 }
        r1.append(r11);	 Catch:{ all -> 0x0121 }
        r11 = " and remote version is ";	 Catch:{ all -> 0x0121 }
        r1.append(r11);	 Catch:{ all -> 0x0121 }
        r1.append(r12);	 Catch:{ all -> 0x0121 }
        r11 = ".";	 Catch:{ all -> 0x0121 }
        r1.append(r11);	 Catch:{ all -> 0x0121 }
        r11 = r1.toString();	 Catch:{ all -> 0x0121 }
        r10.<init>(r11, r4);	 Catch:{ all -> 0x0121 }
        throw r10;	 Catch:{ all -> 0x0121 }
        r10 = move-exception;
        r11 = r3.zzhdp;
        if (r11 == 0) goto L_0x012b;
        r11 = r3.zzhdp;
        r11.close();
        r11 = zzhdg;
        r11.set(r2);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zza(android.content.Context, com.google.android.gms.dynamite.DynamiteModule$zzd, java.lang.String):com.google.android.gms.dynamite.DynamiteModule");
    }

    private static DynamiteModule zza(Context context, String str, int i) {
        Boolean bool;
        synchronized (DynamiteModule.class) {
            bool = zzhdc;
        }
        if (bool != null) {
            return bool.booleanValue() ? zzc(context, str, i) : zzb(context, str, i);
        } else {
            throw new zzc("Failed to determine which loading route to use.", null);
        }
    }

    private static void zza(ClassLoader classLoader) {
        try {
            zzm zzm;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                zzm = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                zzm = queryLocalInterface instanceof zzm ? (zzm) queryLocalInterface : new zzn(iBinder);
            }
            zzhde = zzm;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new zzc("Failed to instantiate dynamite loader", e, null);
        }
    }

    private static DynamiteModule zzb(Context context, String str, int i) {
        String str2 = "Failed to load remote module.";
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        zzk zzdh = zzdh(context);
        if (zzdh != null) {
            try {
                IObjectWrapper zza = zzdh.zza(zzn.zzz(context), str, i);
                if (zzn.zzy(zza) != null) {
                    return new DynamiteModule((Context) zzn.zzy(zza));
                }
                throw new zzc(str2, null);
            } catch (RemoteException e) {
                throw new zzc(str2, e, null);
            }
        }
        throw new zzc("Failed to create IDynamiteLoader.", null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:76:0x00ed in {15, 17, 19, 23, 29, 35, 40, 42, 44, 48, 50, 52, 53, 55, 56, 62, 66, 67, 69, 71, 75} preds:[]
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
    public static int zzc(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        r0 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r0);
        r1 = zzhdc;	 Catch:{ all -> 0x00ea }
        if (r1 != 0) goto L_0x00b7;
        r1 = r8.getApplicationContext();	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r1 = r1.getClassLoader();	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class;	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r2 = r2.getName();	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r1 = r1.loadClass(r2);	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r2 = "sClassLoader";	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r2 = r1.getDeclaredField(r2);	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        monitor-enter(r1);	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r3 = 0;
        r4 = r2.get(r3);	 Catch:{ all -> 0x0087 }
        r4 = (java.lang.ClassLoader) r4;	 Catch:{ all -> 0x0087 }
        if (r4 == 0) goto L_0x0038;	 Catch:{ all -> 0x0087 }
        r2 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        if (r4 != r2) goto L_0x0032;	 Catch:{ all -> 0x0087 }
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0087 }
        goto L_0x0084;
        zza(r4);	 Catch:{ zzc -> 0x0035 }
    L_0x0035:
        r2 = java.lang.Boolean.TRUE;	 Catch:{ all -> 0x0087 }
        goto L_0x0084;	 Catch:{ all -> 0x0087 }
        r4 = "com.google.android.gms";	 Catch:{ all -> 0x0087 }
        r5 = r8.getApplicationContext();	 Catch:{ all -> 0x0087 }
        r5 = r5.getPackageName();	 Catch:{ all -> 0x0087 }
        r4 = r4.equals(r5);	 Catch:{ all -> 0x0087 }
        if (r4 == 0) goto L_0x0050;	 Catch:{ all -> 0x0087 }
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        r2.set(r3, r4);	 Catch:{ all -> 0x0087 }
        goto L_0x002f;
        r4 = zze(r8, r9, r10);	 Catch:{ zzc -> 0x007c }
        r5 = zzhdf;	 Catch:{ zzc -> 0x007c }
        if (r5 == 0) goto L_0x0079;	 Catch:{ zzc -> 0x007c }
        r5 = zzhdf;	 Catch:{ zzc -> 0x007c }
        r5 = r5.isEmpty();	 Catch:{ zzc -> 0x007c }
        if (r5 == 0) goto L_0x0061;	 Catch:{ zzc -> 0x007c }
        goto L_0x0079;	 Catch:{ zzc -> 0x007c }
        r5 = new com.google.android.gms.dynamite.zzh;	 Catch:{ zzc -> 0x007c }
        r6 = zzhdf;	 Catch:{ zzc -> 0x007c }
        r7 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ zzc -> 0x007c }
        r5.<init>(r6, r7);	 Catch:{ zzc -> 0x007c }
        zza(r5);	 Catch:{ zzc -> 0x007c }
        r2.set(r3, r5);	 Catch:{ zzc -> 0x007c }
        r5 = java.lang.Boolean.TRUE;	 Catch:{ zzc -> 0x007c }
        zzhdc = r5;	 Catch:{ zzc -> 0x007c }
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        monitor-exit(r0);	 Catch:{ all -> 0x00ea }
        return r4;
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        monitor-exit(r0);	 Catch:{ all -> 0x00ea }
        return r4;
    L_0x007c:
        r4 = java.lang.ClassLoader.getSystemClassLoader();	 Catch:{ all -> 0x0087 }
        r2.set(r3, r4);	 Catch:{ all -> 0x0087 }
        goto L_0x002f;	 Catch:{ all -> 0x0087 }
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        r1 = r2;	 Catch:{ all -> 0x0087 }
        goto L_0x00b5;	 Catch:{ all -> 0x0087 }
        r2 = move-exception;	 Catch:{ all -> 0x0087 }
        monitor-exit(r1);	 Catch:{ all -> 0x0087 }
        throw r2;	 Catch:{ ClassNotFoundException -> 0x008e, IllegalAccessException -> 0x008c, NoSuchFieldException -> 0x008a }
        r1 = move-exception;
        goto L_0x008f;
        r1 = move-exception;
        goto L_0x008f;
        r1 = move-exception;
        r2 = "DynamiteModule";	 Catch:{ all -> 0x00ea }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ea }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00ea }
        r3 = r3.length();	 Catch:{ all -> 0x00ea }
        r3 = r3 + 30;	 Catch:{ all -> 0x00ea }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ea }
        r4.<init>(r3);	 Catch:{ all -> 0x00ea }
        r3 = "Failed to load module via V2: ";	 Catch:{ all -> 0x00ea }
        r4.append(r3);	 Catch:{ all -> 0x00ea }
        r4.append(r1);	 Catch:{ all -> 0x00ea }
        r1 = r4.toString();	 Catch:{ all -> 0x00ea }
        android.util.Log.w(r2, r1);	 Catch:{ all -> 0x00ea }
        r1 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x00ea }
        zzhdc = r1;	 Catch:{ all -> 0x00ea }
        monitor-exit(r0);	 Catch:{ all -> 0x00ea }
        r0 = r1.booleanValue();
        if (r0 == 0) goto L_0x00e5;
        r8 = zze(r8, r9, r10);	 Catch:{ zzc -> 0x00c3 }
        return r8;
        r8 = move-exception;
        r9 = "Failed to retrieve remote module version: ";
        r8 = r8.getMessage();
        r8 = java.lang.String.valueOf(r8);
        r10 = r8.length();
        if (r10 == 0) goto L_0x00d9;
        r8 = r9.concat(r8);
        goto L_0x00de;
        r8 = new java.lang.String;
        r8.<init>(r9);
        r9 = "DynamiteModule";
        android.util.Log.w(r9, r8);
        r8 = 0;
        return r8;
        r8 = zzd(r8, r9, r10);
        return r8;
        r8 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ea }
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zzc(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule zzc(Context context, String str, int i) {
        zzm zzm;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("Selected remote version of ");
        stringBuilder.append(str);
        stringBuilder.append(", version >= ");
        stringBuilder.append(i);
        Log.i("DynamiteModule", stringBuilder.toString());
        synchronized (DynamiteModule.class) {
            zzm = zzhde;
        }
        if (zzm != null) {
            zza zza = (zza) zzhdg.get();
            if (zza == null || zza.zzhdp == null) {
                throw new zzc("No result cursor", null);
            }
            context = zza(context.getApplicationContext(), str, i, zza.zzhdp, zzm);
            if (context != null) {
                return new DynamiteModule(context);
            }
            throw new zzc("Failed to get module context", null);
        }
        throw new zzc("DynamiteLoaderV2 was not cached.", null);
    }

    private static int zzd(Context context, String str, boolean z) {
        zzk zzdh = zzdh(context);
        if (zzdh == null) {
            return 0;
        }
        try {
            return zzdh.zza(zzn.zzz(context), str, z);
        } catch (RemoteException e) {
            str = "Failed to retrieve remote module version: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    private static zzk zzdh(Context context) {
        synchronized (DynamiteModule.class) {
            zzk zzk;
            if (zzhdd != null) {
                zzk = zzhdd;
                return zzk;
            } else if (zzf.zzahf().isGooglePlayServicesAvailable(context) != 0) {
                return null;
            } else {
                try {
                    IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                    if (iBinder == null) {
                        zzk = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                        zzk = queryLocalInterface instanceof zzk ? (zzk) queryLocalInterface : new zzl(iBinder);
                    }
                    if (zzk != null) {
                        zzhdd = zzk;
                        return zzk;
                    }
                } catch (Exception e) {
                    String str = "DynamiteModule";
                    String str2 = "Failed to load IDynamiteLoader from GmsCore: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a2  */
    private static int zze(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
        r0 = 0;
        r1 = r8.getContentResolver();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        if (r10 == 0) goto L_0x000a;
    L_0x0007:
        r8 = "api_force_staging";
        goto L_0x000c;
    L_0x000a:
        r8 = "api";
    L_0x000c:
        r10 = r8.length();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r10 = r10 + 42;
        r2 = java.lang.String.valueOf(r9);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r2 = r2.length();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r10 = r10 + r2;
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r2.<init>(r10);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r10 = "content://com.google.android.gms.chimera/";
        r2.append(r10);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r2.append(r8);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r8 = "/";
        r2.append(r8);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r2.append(r9);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r8 = r2.toString();	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r2 = android.net.Uri.parse(r8);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r6 = 0;
        r8 = r1.query(r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x008f, all -> 0x008d }
        if (r8 == 0) goto L_0x0075;
    L_0x0042:
        r9 = r8.moveToFirst();	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        if (r9 == 0) goto L_0x0075;
    L_0x0048:
        r9 = 0;
        r9 = r8.getInt(r9);	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        if (r9 <= 0) goto L_0x006f;
    L_0x004f:
        r10 = com.google.android.gms.dynamite.DynamiteModule.class;
        monitor-enter(r10);	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r1 = 2;
        r1 = r8.getString(r1);	 Catch:{ all -> 0x006c }
        zzhdf = r1;	 Catch:{ all -> 0x006c }
        monitor-exit(r10);	 Catch:{ all -> 0x006c }
        r10 = zzhdg;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r10 = r10.get();	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r10 = (com.google.android.gms.dynamite.DynamiteModule.zza) r10;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        if (r10 == 0) goto L_0x006f;
    L_0x0064:
        r1 = r10.zzhdp;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        if (r1 != 0) goto L_0x006f;
    L_0x0068:
        r10.zzhdp = r8;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r8 = r0;
        goto L_0x006f;
    L_0x006c:
        r9 = move-exception;
        monitor-exit(r10);	 Catch:{ all -> 0x006c }
        throw r9;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
    L_0x006f:
        if (r8 == 0) goto L_0x0074;
    L_0x0071:
        r8.close();
    L_0x0074:
        return r9;
    L_0x0075:
        r9 = "DynamiteModule";
        r10 = "Failed to retrieve remote module version.";
        android.util.Log.w(r9, r10);	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r9 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        r10 = "Failed to connect to dynamite module ContentResolver.";
        r9.<init>(r10, r0);	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
        throw r9;	 Catch:{ Exception -> 0x0088, all -> 0x0084 }
    L_0x0084:
        r9 = move-exception;
        r0 = r8;
        r8 = r9;
        goto L_0x00a0;
    L_0x0088:
        r9 = move-exception;
        r7 = r9;
        r9 = r8;
        r8 = r7;
        goto L_0x0091;
    L_0x008d:
        r8 = move-exception;
        goto L_0x00a0;
    L_0x008f:
        r8 = move-exception;
        r9 = r0;
    L_0x0091:
        r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.zzc;	 Catch:{ all -> 0x009e }
        if (r10 == 0) goto L_0x0096;
    L_0x0095:
        throw r8;	 Catch:{ all -> 0x009e }
    L_0x0096:
        r10 = new com.google.android.gms.dynamite.DynamiteModule$zzc;	 Catch:{ all -> 0x009e }
        r1 = "V2 version check failed";
        r10.<init>(r1, r8, r0);	 Catch:{ all -> 0x009e }
        throw r10;	 Catch:{ all -> 0x009e }
    L_0x009e:
        r8 = move-exception;
        r0 = r9;
    L_0x00a0:
        if (r0 == 0) goto L_0x00a5;
    L_0x00a2:
        r0.close();
    L_0x00a5:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.zze(android.content.Context, java.lang.String, boolean):int");
    }

    public static int zzx(Context context, String str) {
        String str2 = "DynamiteModule";
        String valueOf;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 61);
            stringBuilder.append("com.google.android.gms.dynamite.descriptors.");
            stringBuilder.append(str);
            stringBuilder.append(".ModuleDescriptor");
            Class loadClass = classLoader.loadClass(stringBuilder.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get(null).equals(str)) {
                return declaredField2.getInt(null);
            }
            valueOf = String.valueOf(declaredField.get(null));
            stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 51) + String.valueOf(str).length());
            stringBuilder.append("Module descriptor id '");
            stringBuilder.append(valueOf);
            stringBuilder.append("' didn't match expected id '");
            stringBuilder.append(str);
            stringBuilder.append("'");
            Log.e(str2, stringBuilder.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 45);
            stringBuilder2.append("Local module descriptor class for ");
            stringBuilder2.append(str);
            stringBuilder2.append(" not found.");
            Log.w(str2, stringBuilder2.toString());
            return 0;
        } catch (Exception e) {
            str = "Failed to load module descriptor class: ";
            valueOf = String.valueOf(e.getMessage());
            Log.e(str2, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            return 0;
        }
    }

    public static int zzy(Context context, String str) {
        return zzc(context, str, false);
    }

    private static DynamiteModule zzz(Context context, String str) {
        str = String.valueOf(str);
        String str2 = "Selected local version of ";
        Log.i("DynamiteModule", str.length() != 0 ? str2.concat(str) : new String(str2));
        return new DynamiteModule(context.getApplicationContext());
    }

    public final Context zzarl() {
        return this.zzhdo;
    }

    public final IBinder zzhk(String str) {
        try {
            return (IBinder) this.zzhdo.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            String str2 = "Failed to instantiate module class: ";
            str = String.valueOf(str);
            throw new zzc(str.length() != 0 ? str2.concat(str) : new String(str2), e, null);
        }
    }
}
