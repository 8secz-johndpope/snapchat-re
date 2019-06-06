package com.google.android.gms.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.Global;
import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import android.util.JsonWriter;
import com.brightcove.player.captioning.TTMLParser.Tags;
import com.google.android.gms.common.util.zzc;
import com.google.android.gms.common.util.zze;
import com.google.android.gms.common.util.zzi;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.record.MessageMediaRefModel;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

@zzabh
public final class zzaks {
    private static Object sLock = new Object();
    private static boolean zzdip = false;
    private static boolean zzdiq = false;
    private static zze zzdir = zzi.zzanq();
    private static final Set<String> zzdis = new HashSet(Arrays.asList(new String[0]));
    private final List<String> zzdit;

    public zzaks() {
        this(null);
    }

    public zzaks(String str) {
        List asList;
        if (isEnabled()) {
            String uuid = UUID.randomUUID().toString();
            String str2 = "network_request_";
            if (str == null) {
                String[] strArr = new String[1];
                uuid = String.valueOf(uuid);
                strArr[0] = uuid.length() != 0 ? str2.concat(uuid) : new String(str2);
                asList = Arrays.asList(strArr);
            } else {
                String[] strArr2 = new String[2];
                String str3 = "ad_request_";
                str = String.valueOf(str);
                strArr2[0] = str.length() != 0 ? str3.concat(str) : new String(str3);
                str = String.valueOf(uuid);
                strArr2[1] = str.length() != 0 ? str2.concat(str) : new String(str2);
                asList = Arrays.asList(strArr2);
            }
        } else {
            asList = new ArrayList();
        }
        this.zzdit = asList;
    }

    public static boolean isEnabled() {
        boolean z;
        synchronized (sLock) {
            z = zzdip && zzdiq;
        }
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:17:0x0042 in {8, 9, 10, 13, 16} preds:[]
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
    private static synchronized void log(java.lang.String r5) {
        /*
        r0 = com.google.android.gms.internal.zzaks.class;
        monitor-enter(r0);
        r1 = "GMA Debug BEGIN";	 Catch:{ all -> 0x003f }
        com.google.android.gms.internal.zzaky.zzcy(r1);	 Catch:{ all -> 0x003f }
        r1 = 0;	 Catch:{ all -> 0x003f }
        r2 = r5.length();	 Catch:{ all -> 0x003f }
        if (r1 >= r2) goto L_0x0038;	 Catch:{ all -> 0x003f }
        r2 = r1 + 4000;	 Catch:{ all -> 0x003f }
        r3 = r5.length();	 Catch:{ all -> 0x003f }
        r3 = java.lang.Math.min(r2, r3);	 Catch:{ all -> 0x003f }
        r4 = "GMA Debug CONTENT ";	 Catch:{ all -> 0x003f }
        r1 = r5.substring(r1, r3);	 Catch:{ all -> 0x003f }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x003f }
        r3 = r1.length();	 Catch:{ all -> 0x003f }
        if (r3 == 0) goto L_0x002e;	 Catch:{ all -> 0x003f }
        r1 = r4.concat(r1);	 Catch:{ all -> 0x003f }
        goto L_0x0033;	 Catch:{ all -> 0x003f }
        r1 = new java.lang.String;	 Catch:{ all -> 0x003f }
        r1.<init>(r4);	 Catch:{ all -> 0x003f }
        com.google.android.gms.internal.zzaky.zzcy(r1);	 Catch:{ all -> 0x003f }
        r1 = r2;	 Catch:{ all -> 0x003f }
        goto L_0x0009;	 Catch:{ all -> 0x003f }
        r5 = "GMA Debug FINISH";	 Catch:{ all -> 0x003f }
        com.google.android.gms.internal.zzaky.zzcy(r5);	 Catch:{ all -> 0x003f }
        monitor-exit(r0);
        return;
        r5 = move-exception;
        monitor-exit(r0);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzaks.log(java.lang.String):void");
    }

    static final /* synthetic */ void zza(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        jsonWriter.endObject();
    }

    private static void zza(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (!zzdis.contains(str)) {
                    String str2 = "value";
                    String str3 = "name";
                    if (!(entry.getValue() instanceof List)) {
                        if (!(entry.getValue() instanceof String)) {
                            zzaky.e("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name(str3).value(str);
                        jsonWriter.name(str2).value((String) entry.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String str4 : (List) entry.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name(str3).value(str);
                            jsonWriter.name(str2).value(str4);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    private final void zza(String str, zzakx zzakx) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(zzdir.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.zzdit) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            zzakx.zza(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            zzaky.zzb("unable to log", e);
        }
        log(stringWriter.toString());
    }

    static final /* synthetic */ void zza(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name(MessageMediaRefModel.URI).value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        zza(jsonWriter, map);
        if (bArr != null) {
            jsonWriter.name(Tags.BODY).value(zzc.zzj(bArr));
        }
        jsonWriter.endObject();
    }

    public static void zzae(boolean z) {
        synchronized (sLock) {
            zzdip = true;
            zzdiq = z;
        }
    }

    private final void zzb(String str, String str2, Map<String, ?> map, byte[] bArr) {
        zza("onNetworkRequest", new zzakt(str, str2, map, bArr));
    }

    private final void zzb(Map<String, ?> map, int i) {
        zza("onNetworkResponse", new zzaku(i, map));
    }

    public static boolean zzbi(Context context) {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        return ((Boolean) zzlc.zzio().zzd(zzoi.zzbqf)).booleanValue() && Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
    }

    private final void zzcx(String str) {
        zza("onNetworkRequestError", new zzakw(str));
    }

    public static void zzsc() {
        synchronized (sLock) {
            zzdip = false;
            zzdiq = false;
            zzaky.zzcz("Ad debug logging enablement is out of date.");
        }
    }

    public static boolean zzsd() {
        boolean z;
        synchronized (sLock) {
            z = zzdip;
        }
        return z;
    }

    public final void zza(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (isEnabled()) {
            zzb(str, str2, map, bArr);
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, int i) {
        if (isEnabled()) {
            String str = null;
            zzb(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i >= MapboxConstants.ANIMATION_DURATION) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String str2 = "Can not get error message from error HttpURLConnection\n";
                    String valueOf = String.valueOf(e.getMessage());
                    zzaky.zzcz(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                }
                zzcx(str);
            }
        }
    }

    public final void zza(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (isEnabled()) {
            zzb(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void zza(Map<String, ?> map, int i) {
        if (isEnabled()) {
            zzb(map, i);
            if (i < Callback.DEFAULT_DRAG_ANIMATION_DURATION || i >= MapboxConstants.ANIMATION_DURATION) {
                zzcx(null);
            }
        }
    }

    public final void zzcw(String str) {
        if (isEnabled() && str != null) {
            zzf(str.getBytes());
        }
    }

    public final void zzf(byte[] bArr) {
        zza("onNetworkResponseBody", new zzakv(bArr));
    }
}
