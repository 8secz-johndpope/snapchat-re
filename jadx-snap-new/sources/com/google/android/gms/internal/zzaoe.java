package com.google.android.gms.internal;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@zzabh
public final class zzaoe extends zzany {
    private static final Set<String> zzdox = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzdoy = new DecimalFormat("#,###");
    private File zzdoz;
    private boolean zzdpa;

    public zzaoe(zzann zzann) {
        super(zzann);
        File cacheDir = this.mContext.getCacheDir();
        if (cacheDir == null) {
            zzaky.zzcz("Context.getCacheDir() returned null");
            return;
        }
        this.zzdoz = new File(cacheDir, "admobVideoStreams");
        String str;
        String valueOf;
        if (!this.zzdoz.isDirectory() && !this.zzdoz.mkdirs()) {
            str = "Could not create preload cache directory at ";
            valueOf = String.valueOf(this.zzdoz.getAbsolutePath());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.zzdoz = null;
        } else if (!this.zzdoz.setReadable(true, false) || !this.zzdoz.setExecutable(true, false)) {
            str = "Could not set cache file permissions at ";
            valueOf = String.valueOf(this.zzdoz.getAbsolutePath());
            zzaky.zzcz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            this.zzdoz = null;
        }
    }

    private final File zzc(File file) {
        return new File(this.zzdoz, String.valueOf(file.getName()).concat(".done"));
    }

    public final void abort() {
        this.zzdpa = true;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:255:0x0509 in {2, 4, 7, 12, 13, 18, 25, 26, 30, 32, 39, 40, 42, 45, 46, 54, 55, 58, 70, 71, 74, 76, 77, 78, 80, 81, 82, 83, 90, 91, 93, 100, 101, 103, 118, 119, 122, 124, 125, 126, 128, 129, 130, 147, 149, 150, 151, 152, 153, 157, 165, 167, 168, 169, 171, 173, 175, 176, 177, 178, 185, 187, 188, 189, 190, 197, 199, 206, 208, 210, 212, 213, 214, 215, 217, 218, 219, 221, 222, 223, 224, 225, 227, 228, 229, 232, 234, 236, 238, 239, 246, 247, 248, 250, 254} preds:[]
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
    public final boolean zzdc(java.lang.String r31) {
        /*
        r30 = this;
        r8 = r30;
        r9 = r31;
        r0 = r8.zzdoz;
        r10 = 0;
        r11 = 0;
        if (r0 != 0) goto L_0x0010;
        r0 = "noCacheDir";
        r8.zza(r9, r10, r0, r10);
        return r11;
        r0 = r8.zzdoz;
        if (r0 != 0) goto L_0x0016;
        r3 = 0;
        goto L_0x0032;
        r0 = r0.listFiles();
        r1 = r0.length;
        r2 = 0;
        r3 = 0;
        if (r2 >= r1) goto L_0x0032;
        r4 = r0[r2];
        r4 = r4.getName();
        r5 = ".done";
        r4 = r4.endsWith(r5);
        if (r4 != 0) goto L_0x002f;
        r3 = r3 + 1;
        r2 = r2 + 1;
        goto L_0x001d;
        r0 = com.google.android.gms.internal.zzoi.zzblu;
        r1 = com.google.android.gms.internal.zzlc.zzio();
        r0 = r1.zzd(r0);
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        if (r3 <= r0) goto L_0x0094;
        r0 = r8.zzdoz;
        if (r0 != 0) goto L_0x004a;
        r0 = 0;
        goto L_0x0089;
        r1 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        r0 = r0.listFiles();
        r3 = r0.length;
        r4 = r1;
        r2 = r10;
        r1 = 0;
        if (r1 >= r3) goto L_0x0074;
        r6 = r0[r1];
        r7 = r6.getName();
        r12 = ".done";
        r7 = r7.endsWith(r12);
        if (r7 != 0) goto L_0x0071;
        r12 = r6.lastModified();
        r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1));
        if (r7 >= 0) goto L_0x0071;
        r2 = r6;
        r4 = r12;
        r1 = r1 + 1;
        goto L_0x0057;
        if (r2 == 0) goto L_0x0048;
        r0 = r2.delete();
        r1 = r8.zzc(r2);
        r2 = r1.isFile();
        if (r2 == 0) goto L_0x0089;
        r1 = r1.delete();
        r0 = r0 & r1;
        if (r0 != 0) goto L_0x0010;
        r0 = "Unable to expire stream cache";
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = "expireFailed";
        goto L_0x000c;
        com.google.android.gms.internal.zzlc.zzij();
        r0 = com.google.android.gms.internal.zzako.zzcu(r31);
        r12 = new java.io.File;
        r1 = r8.zzdoz;
        r12.<init>(r1, r0);
        r0 = r8.zzc(r12);
        r1 = r12.isFile();
        r13 = 1;
        if (r1 == 0) goto L_0x00da;
        r1 = r0.isFile();
        if (r1 == 0) goto L_0x00da;
        r0 = r12.length();
        r1 = (int) r0;
        r0 = "Stream cache hit at ";
        r2 = java.lang.String.valueOf(r31);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00c9;
        r0 = r0.concat(r2);
        goto L_0x00cf;
        r2 = new java.lang.String;
        r2.<init>(r0);
        r0 = r2;
        com.google.android.gms.internal.zzaky.zzby(r0);
        r0 = r12.getAbsolutePath();
        r8.zza(r9, r0, r1);
        return r13;
        r1 = r8.zzdoz;
        r1 = r1.getAbsolutePath();
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r31);
        r3 = r2.length();
        if (r3 == 0) goto L_0x00f4;
        r1 = r1.concat(r2);
        r14 = r1;
        goto L_0x00fa;
        r2 = new java.lang.String;
        r2.<init>(r1);
        r14 = r2;
        r1 = zzdox;
        monitor-enter(r1);
        r2 = zzdox;	 Catch:{ all -> 0x0506 }
        r2 = r2.contains(r14);	 Catch:{ all -> 0x0506 }
        if (r2 == 0) goto L_0x012a;	 Catch:{ all -> 0x0506 }
        r0 = "Stream cache already in progress at ";	 Catch:{ all -> 0x0506 }
        r2 = java.lang.String.valueOf(r31);	 Catch:{ all -> 0x0506 }
        r3 = r2.length();	 Catch:{ all -> 0x0506 }
        if (r3 == 0) goto L_0x0116;	 Catch:{ all -> 0x0506 }
        r0 = r0.concat(r2);	 Catch:{ all -> 0x0506 }
        goto L_0x011c;	 Catch:{ all -> 0x0506 }
        r2 = new java.lang.String;	 Catch:{ all -> 0x0506 }
        r2.<init>(r0);	 Catch:{ all -> 0x0506 }
        r0 = r2;	 Catch:{ all -> 0x0506 }
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ all -> 0x0506 }
        r0 = r12.getAbsolutePath();	 Catch:{ all -> 0x0506 }
        r2 = "inProgress";	 Catch:{ all -> 0x0506 }
        r8.zza(r9, r0, r2, r10);	 Catch:{ all -> 0x0506 }
        monitor-exit(r1);	 Catch:{ all -> 0x0506 }
        return r11;	 Catch:{ all -> 0x0506 }
        r2 = zzdox;	 Catch:{ all -> 0x0506 }
        r2.add(r14);	 Catch:{ all -> 0x0506 }
        monitor-exit(r1);	 Catch:{ all -> 0x0506 }
        r15 = "error";
        com.google.android.gms.ads.internal.zzbt.zzex();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = com.google.android.gms.internal.zzoi.zzblz;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r2 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = r2.zzd(r1);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = (java.lang.Integer) r1;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = r1.intValue();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = com.google.android.gms.internal.zzame.zzb(r9, r1);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r2 = r1 instanceof java.net.HttpURLConnection;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        if (r2 == 0) goto L_0x01ad;
        r2 = r1;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r2 = r2.getResponseCode();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r3 = 400; // 0x190 float:5.6E-43 double:1.976E-321;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        if (r2 < r3) goto L_0x01ad;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r15 = "badUrl";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = "HTTP request failed. Code: ";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = java.lang.Integer.toString(r2);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r3 = r1.length();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        if (r3 == 0) goto L_0x0170;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = r0;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        goto L_0x0175;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r3 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r3 = r3.length();	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r3 = r3 + 32;	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4.<init>(r3);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r3 = "HTTP status code ";	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4.append(r3);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4.append(r2);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r2 = " at ";	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4.append(r2);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r4.append(r9);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r2 = r4.toString();	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r0.<init>(r2);	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        throw r0;	 Catch:{ IOException -> 0x01a0, RuntimeException -> 0x019e }
        r0 = move-exception;
        goto L_0x01a1;
        r0 = move-exception;
        r26 = r10;
        r10 = r1;
        goto L_0x01aa;
        r0 = move-exception;
        goto L_0x01a8;
        r0 = move-exception;
        r26 = r10;
        r1 = r14;
        goto L_0x0473;
        r7 = r1.getContentLength();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        if (r7 >= 0) goto L_0x01dc;
        r0 = "Stream cache aborted, missing content-length header at ";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r2 = r1.length();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        if (r2 == 0) goto L_0x01c4;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        goto L_0x01ca;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r1;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = "contentLengthMissing";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r8.zza(r9, r0, r1, r10);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = zzdox;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0.remove(r14);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        return r11;
        r2 = zzdoy;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = (long) r7;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r2 = r2.format(r3);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = com.google.android.gms.internal.zzoi.zzblv;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = r4.zzd(r3);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = (java.lang.Integer) r3;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r6 = r3.intValue();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        if (r7 <= r6) goto L_0x024a;
        r0 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0.length();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0 + 33;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = r1.length();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0 + r1;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = "Content length ";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.append(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.append(r2);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = " exceeds limit at ";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.append(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.append(r9);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r1.toString();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        com.google.android.gms.internal.zzaky.zzcz(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r2 = r1.length();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        if (r2 == 0) goto L_0x0235;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        goto L_0x023b;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = r1;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r1 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r2 = "sizeExceeded";	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r8.zza(r9, r1, r2, r0);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0 = zzdox;	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        r0.remove(r14);	 Catch:{ IOException -> 0x01a7, RuntimeException -> 0x01a5 }
        return r11;
        r3 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = r3.length();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = r3 + 20;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4 = r4.length();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = r3 + r4;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.<init>(r3);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = "Caching ";	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.append(r3);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.append(r2);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r2 = " bytes from ";	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.append(r2);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.append(r9);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r2 = r4.toString();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        com.google.android.gms.internal.zzaky.zzby(r2);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r1 = r1.getInputStream();	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r5 = java.nio.channels.Channels.newChannel(r1);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r4.<init>(r12);	 Catch:{ IOException -> 0x046c, RuntimeException -> 0x046a }
        r3 = r4.getChannel();	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r1 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r2 = java.nio.ByteBuffer.allocate(r1);	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r16 = com.google.android.gms.ads.internal.zzbt.zzes();	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r17 = r16.currentTimeMillis();	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r1 = com.google.android.gms.internal.zzoi.zzbly;	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r10 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r1 = r10.zzd(r1);	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r1 = (java.lang.Long) r1;	 Catch:{ IOException -> 0x0462, RuntimeException -> 0x0460 }
        r10 = r14;
        r13 = r1.longValue();	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r1 = new com.google.android.gms.internal.zzake;	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r1.<init>(r13);	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r13 = com.google.android.gms.internal.zzoi.zzblx;	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r14 = com.google.android.gms.internal.zzlc.zzio();	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r13 = r14.zzd(r13);	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r13 = (java.lang.Long) r13;	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r13 = r13.longValue();	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        r19 = r5.read(r2);	 Catch:{ IOException -> 0x045b, RuntimeException -> 0x0459 }
        if (r19 < 0) goto L_0x03d8;
        r11 = r11 + r19;
        if (r11 <= r6) goto L_0x0300;
        r15 = "sizeExceeded";	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r0 = "File too big for full file cache. Size: ";	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r1 = java.lang.Integer.toString(r11);	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r2 = r1.length();	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        if (r2 == 0) goto L_0x02e0;	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r0 = r0.concat(r1);	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r1 = r0;	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        goto L_0x02e5;	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r1 = new java.lang.String;	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x02fb, RuntimeException -> 0x02f9 }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x02ef, RuntimeException -> 0x02ed }
        r2 = "stream cache file size limit exceeded";	 Catch:{ IOException -> 0x02ef, RuntimeException -> 0x02ed }
        r0.<init>(r2);	 Catch:{ IOException -> 0x02ef, RuntimeException -> 0x02ed }
        throw r0;	 Catch:{ IOException -> 0x02ef, RuntimeException -> 0x02ed }
        r0 = move-exception;
        goto L_0x02f0;
        r0 = move-exception;
        r26 = r4;
        r29 = r10;
        r10 = r1;
        r1 = r29;
        goto L_0x0473;
        r0 = move-exception;
        goto L_0x02fc;
        r0 = move-exception;
        r26 = r4;
        goto L_0x03d5;
        r2.flip();	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r19 = r3.write(r2);	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        if (r19 > 0) goto L_0x0303;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r2.clear();	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r19 = r16.currentTimeMillis();	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r19 = r19 - r17;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r21 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r21 = r21 * r13;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1));	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        if (r23 > 0) goto L_0x038f;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r19 = r2;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r2 = r8.zzdpa;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        if (r2 != 0) goto L_0x037f;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r2 = r1.tryAcquire();	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        if (r2 == 0) goto L_0x035b;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r20 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r2 = com.google.android.gms.internal.zzako.zzaju;	 Catch:{ IOException -> 0x03d0, RuntimeException -> 0x03ce }
        r21 = r15;
        r15 = new com.google.android.gms.internal.zzanz;	 Catch:{ IOException -> 0x0355, RuntimeException -> 0x0353 }
        r22 = 0;
        r23 = r1;
        r1 = r15;
        r24 = r10;
        r10 = r2;
        r2 = r30;
        r25 = r3;
        r3 = r31;
        r26 = r4;
        r4 = r20;
        r20 = r5;
        r5 = r11;
        r27 = r6;
        r6 = r7;
        r28 = r7;
        r7 = r22;
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r10.post(r15);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x036b;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r0 = move-exception;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x0356;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r0 = move-exception;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r26 = r4;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r1 = r10;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x0456;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r23 = r1;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r25 = r3;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r26 = r4;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r20 = r5;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r27 = r6;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r28 = r7;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r24 = r10;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r21 = r15;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = r19;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r5 = r20;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r15 = r21;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r1 = r23;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r10 = r24;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3 = r25;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r4 = r26;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r6 = r27;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r7 = r28;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x02be;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r26 = r4;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r24 = r10;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r21 = r15;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r15 = "externalAbort";	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r1 = "abort requested";	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r0.<init>(r1);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        throw r0;	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r26 = r4;
        r24 = r10;
        r21 = r15;
        r15 = "downloadTimeout";	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r0 = java.lang.Long.toString(r13);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r1 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r1 = r1.length();	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r1 = r1 + 29;	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r2.<init>(r1);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r1 = "Timeout exceeded. Limit: ";	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r2.append(r1);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r2.append(r0);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r0 = " sec";	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r2.append(r0);	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r10 = r2.toString();	 Catch:{ IOException -> 0x03cc, RuntimeException -> 0x03ca }
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x03c5, RuntimeException -> 0x03c3 }
        r1 = "stream cache time limit exceeded";	 Catch:{ IOException -> 0x03c5, RuntimeException -> 0x03c3 }
        r0.<init>(r1);	 Catch:{ IOException -> 0x03c5, RuntimeException -> 0x03c3 }
        throw r0;	 Catch:{ IOException -> 0x03c5, RuntimeException -> 0x03c3 }
        r0 = move-exception;
        goto L_0x03c6;
        r0 = move-exception;
        r1 = r24;
        goto L_0x0473;
        r0 = move-exception;
        goto L_0x0424;
        r0 = move-exception;
        goto L_0x0424;
        r0 = move-exception;
        goto L_0x03d1;
        r0 = move-exception;
        r26 = r4;
        r21 = r15;
        r1 = r10;
        goto L_0x0468;
        r26 = r4;
        r24 = r10;
        r21 = r15;
        r26.close();	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r1 = 3;	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r1 = com.google.android.gms.internal.zzaky.zzae(r1);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        if (r1 == 0) goto L_0x0427;
        r1 = zzdoy;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = (long) r11;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r1 = r1.format(r2);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = r2.length();	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = r2 + 22;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3 = java.lang.String.valueOf(r31);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3 = r3.length();	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = r2 + r3;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3.<init>(r2);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r2 = "Preloaded ";	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3.append(r2);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3.append(r1);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r1 = " bytes from ";	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3.append(r1);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r3.append(r9);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r1 = r3.toString();	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        com.google.android.gms.internal.zzaky.zzby(r1);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x0427;
        r0 = move-exception;
        goto L_0x0422;
        r0 = move-exception;
        r15 = r21;
        r1 = r24;
        goto L_0x0468;
        r1 = 1;
        r2 = 0;
        r12.setReadable(r1, r2);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r1 = r0.isFile();	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        if (r1 == 0) goto L_0x043a;
        r1 = java.lang.System.currentTimeMillis();	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        r0.setLastModified(r1);	 Catch:{ IOException -> 0x0421, RuntimeException -> 0x041f }
        goto L_0x043d;
        r0.createNewFile();	 Catch:{ IOException -> 0x043d, RuntimeException -> 0x041f }
    L_0x043d:
        r0 = r12.getAbsolutePath();	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r8.zza(r9, r0, r11);	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r0 = zzdox;	 Catch:{ IOException -> 0x0453, RuntimeException -> 0x0451 }
        r1 = r24;
        r0.remove(r1);	 Catch:{ IOException -> 0x044f, RuntimeException -> 0x044d }
        r0 = 1;
        return r0;
        r0 = move-exception;
        goto L_0x0456;
        r0 = move-exception;
        goto L_0x0456;
        r0 = move-exception;
        goto L_0x0454;
        r0 = move-exception;
        r1 = r24;
        r15 = r21;
        goto L_0x0468;
        r0 = move-exception;
        goto L_0x045c;
        r0 = move-exception;
        r26 = r4;
        r1 = r10;
        goto L_0x0466;
        r0 = move-exception;
        goto L_0x0463;
        r0 = move-exception;
        r26 = r4;
        r1 = r14;
        r21 = r15;
        r10 = 0;
        goto L_0x0473;
        r0 = move-exception;
        goto L_0x046d;
        r0 = move-exception;
        r1 = r14;
        r21 = r15;
        r10 = 0;
        r26 = 0;
        r2 = r0 instanceof java.lang.RuntimeException;
        if (r2 == 0) goto L_0x0480;
        r2 = com.google.android.gms.ads.internal.zzbt.zzep();
        r3 = "VideoStreamFullFileCache.preload";
        r2.zza(r0, r3);
        r26.close();	 Catch:{ IOException | NullPointerException -> 0x0483 }
        r2 = r8.zzdpa;
        if (r2 == 0) goto L_0x04ab;
        r0 = java.lang.String.valueOf(r31);
        r0 = r0.length();
        r0 = r0 + 26;
        r2 = new java.lang.StringBuilder;
        r2.<init>(r0);
        r0 = "Preload aborted for URL \"";
        r2.append(r0);
        r2.append(r9);
        r0 = "\"";
        r2.append(r0);
        r0 = r2.toString();
        com.google.android.gms.internal.zzaky.zzcy(r0);
        goto L_0x04ce;
        r2 = java.lang.String.valueOf(r31);
        r2 = r2.length();
        r2 = r2 + 25;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "Preload failed for URL \"";
        r3.append(r2);
        r3.append(r9);
        r2 = "\"";
        r3.append(r2);
        r2 = r3.toString();
        com.google.android.gms.internal.zzaky.zzc(r2, r0);
        r0 = r12.exists();
        if (r0 == 0) goto L_0x04f8;
        r0 = r12.delete();
        if (r0 != 0) goto L_0x04f8;
        r0 = "Could not delete partial cache file at ";
        r2 = r12.getAbsolutePath();
        r2 = java.lang.String.valueOf(r2);
        r3 = r2.length();
        if (r3 == 0) goto L_0x04ef;
        r0 = r0.concat(r2);
        goto L_0x04f5;
        r2 = new java.lang.String;
        r2.<init>(r0);
        r0 = r2;
        com.google.android.gms.internal.zzaky.zzcz(r0);
        r0 = r12.getAbsolutePath();
        r8.zza(r9, r0, r15, r10);
        r0 = zzdox;
        r0.remove(r1);
        r1 = 0;
        return r1;
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0506 }
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaoe.zzdc(java.lang.String):boolean");
    }
}
