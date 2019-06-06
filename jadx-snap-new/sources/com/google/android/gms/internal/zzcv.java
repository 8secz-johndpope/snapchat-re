package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

public final class zzcv {
    private static final String[] zzahz = new String[]{"/aclk", "/pcs/click"};
    private String zzahv = "googleads.g.doubleclick.net";
    private String zzahw = "/pagead/ads";
    private String zzahx = "ad.doubleclick.net";
    private String[] zzahy = new String[]{".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzcr zzaia;

    public zzcv(zzcr zzcr) {
        this.zzaia = zzcr;
    }

    private final Uri zza(Uri uri, Context context, String str, boolean z, View view, Activity activity) {
        try {
            boolean zza = zza(uri);
            String str2 = "ms";
            if (zza) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzcw("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter(str2) != null) {
                throw new zzcw("Query parameter already exists: ms");
            }
            String zza2 = z ? this.zzaia.zza(context, str, view, activity) : this.zzaia.zza(context);
            str = "=";
            String str3;
            StringBuilder stringBuilder;
            if (zza) {
                str3 = "dc_ms";
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                String str4 = ";";
                if (indexOf != -1) {
                    indexOf++;
                    stringBuilder = new StringBuilder(uri2.substring(0, indexOf));
                    stringBuilder.append(str3);
                    stringBuilder.append(str);
                    stringBuilder.append(zza2);
                    stringBuilder.append(str4);
                    stringBuilder.append(uri2.substring(indexOf));
                    return Uri.parse(stringBuilder.toString());
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                StringBuilder stringBuilder2 = new StringBuilder(uri2.substring(0, encodedPath.length() + indexOf2));
                stringBuilder2.append(str4);
                stringBuilder2.append(str3);
                stringBuilder2.append(str);
                stringBuilder2.append(zza2);
                stringBuilder2.append(str4);
                stringBuilder2.append(uri2.substring(indexOf2 + encodedPath.length()));
                return Uri.parse(stringBuilder2.toString());
            }
            str3 = uri.toString();
            int indexOf3 = str3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = str3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter(str2, zza2).build();
            }
            indexOf3++;
            stringBuilder = new StringBuilder(str3.substring(0, indexOf3));
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append(zza2);
            stringBuilder.append("&");
            stringBuilder.append(str3.substring(indexOf3));
            return Uri.parse(stringBuilder.toString());
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    private final boolean zza(Uri uri) {
        if (uri != null) {
            try {
                return uri.getHost().equals(this.zzahx);
            } catch (NullPointerException unused) {
                return false;
            }
        }
        throw new NullPointerException();
    }

    public final Uri zza(Uri uri, Context context) {
        return zza(uri, context, null, false, null, null);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) {
        try {
            return zza(uri, context, uri.getQueryParameter("ai"), true, view, activity);
        } catch (UnsupportedOperationException unused) {
            throw new zzcw("Provided Uri is not in a valid state");
        }
    }

    public final void zza(MotionEvent motionEvent) {
        this.zzaia.zza(motionEvent);
    }

    public final zzcr zzae() {
        return this.zzaia;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0021 in {8, 9, 10, 11, 13} preds:[]
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
    public final boolean zzb(android.net.Uri r6) {
        /*
        r5 = this;
        if (r6 == 0) goto L_0x001b;
        r0 = 0;
        r6 = r6.getHost();	 Catch:{ NullPointerException -> 0x001a }
        r1 = r5.zzahy;	 Catch:{ NullPointerException -> 0x001a }
        r2 = r1.length;	 Catch:{ NullPointerException -> 0x001a }
        r3 = 0;	 Catch:{ NullPointerException -> 0x001a }
        if (r3 >= r2) goto L_0x001a;	 Catch:{ NullPointerException -> 0x001a }
        r4 = r1[r3];	 Catch:{ NullPointerException -> 0x001a }
        r4 = r6.endsWith(r4);	 Catch:{ NullPointerException -> 0x001a }
        if (r4 == 0) goto L_0x0017;
        r6 = 1;
        return r6;
        r3 = r3 + 1;
        goto L_0x000b;
        return r0;
        r6 = new java.lang.NullPointerException;
        r6.<init>();
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzcv.zzb(android.net.Uri):boolean");
    }

    public final boolean zzc(Uri uri) {
        if (zzb(uri)) {
            for (String endsWith : zzahz) {
                if (uri.getPath().endsWith(endsWith)) {
                    return true;
                }
            }
        }
        return false;
    }
}
