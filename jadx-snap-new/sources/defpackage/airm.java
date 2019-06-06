package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import defpackage.aiqz.1;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

/* renamed from: airm */
public final class airm {
    private static final Pattern e = Pattern.compile("[^\\p{Alnum}]");
    private static final String f = Pattern.quote("/");
    public final boolean a;
    public final boolean b;
    public final Context c;
    public final String d;
    private final ReentrantLock g = new ReentrantLock();
    private final airn h;
    private final String i;
    private final Collection<aiqo> j;
    private aiqz k;
    private aiqy l;
    private boolean m;
    private airl n;

    /* renamed from: airm$a */
    public enum a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private a(int i) {
            this.protobufIndex = i;
        }
    }

    public airm(Context context, String str, Collection<aiqo> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.c = context;
            this.d = str;
            this.i = null;
            this.j = collection;
            this.h = new airn();
            this.k = new aiqz(context);
            this.n = new airl();
            this.a = airf.a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            String str2 = "Fabric";
            if (!this.a) {
                aiqr a = aiqj.a();
                StringBuilder stringBuilder = new StringBuilder("Device ID collection disabled for ");
                stringBuilder.append(context.getPackageName());
                a.a(str2, stringBuilder.toString());
            }
            this.b = airf.a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.b) {
                aiqr a2 = aiqj.a();
                StringBuilder stringBuilder2 = new StringBuilder("User information collection disabled for ");
                stringBuilder2.append(context.getPackageName());
                a2.a(str2, stringBuilder2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0045 in {7, 8, 10, 13} preds:[]
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
    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private java.lang.String a(android.content.SharedPreferences r4) {
        /*
        r3 = this;
        r0 = "crashlytics.installation.id";
        r1 = r3.g;
        r1.lock();
        r1 = 0;
        r2 = r4.getString(r0, r1);	 Catch:{ all -> 0x003e }
        if (r2 != 0) goto L_0x0038;	 Catch:{ all -> 0x003e }
        r2 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x003e }
        r2 = r2.toString();	 Catch:{ all -> 0x003e }
        if (r2 != 0) goto L_0x001a;	 Catch:{ all -> 0x003e }
        r2 = r1;	 Catch:{ all -> 0x003e }
        goto L_0x002d;	 Catch:{ all -> 0x003e }
        r1 = e;	 Catch:{ all -> 0x003e }
        r1 = r1.matcher(r2);	 Catch:{ all -> 0x003e }
        r2 = "";	 Catch:{ all -> 0x003e }
        r1 = r1.replaceAll(r2);	 Catch:{ all -> 0x003e }
        r2 = java.util.Locale.US;	 Catch:{ all -> 0x003e }
        r1 = r1.toLowerCase(r2);	 Catch:{ all -> 0x003e }
        goto L_0x0018;	 Catch:{ all -> 0x003e }
        r4 = r4.edit();	 Catch:{ all -> 0x003e }
        r4 = r4.putString(r0, r2);	 Catch:{ all -> 0x003e }
        r4.commit();	 Catch:{ all -> 0x003e }
        r4 = r3.g;
        r4.unlock();
        return r2;
        r4 = move-exception;
        r0 = r3.g;
        r0.unlock();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airm.a(android.content.SharedPreferences):java.lang.String");
    }

    public static String a(String str) {
        return str.replaceAll(f, "");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:19:0x0046 in {5, 10, 11, 15, 18} preds:[]
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
    @android.annotation.SuppressLint({"CommitPrefEdits"})
    private void a(android.content.SharedPreferences r4, java.lang.String r5) {
        /*
        r3 = this;
        r0 = "crashlytics.advertising.id";
        r1 = r3.g;
        r1.lock();
        r1 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x0013;
        r4 = r3.g;
        r4.unlock();
        return;
        r1 = 0;
        r1 = r4.getString(r0, r1);	 Catch:{ all -> 0x003f }
        r2 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x002a;	 Catch:{ all -> 0x003f }
        r4 = r4.edit();	 Catch:{ all -> 0x003f }
        r4 = r4.putString(r0, r5);	 Catch:{ all -> 0x003f }
        r4.commit();	 Catch:{ all -> 0x003f }
        goto L_0x000d;	 Catch:{ all -> 0x003f }
        r1 = r1.equals(r5);	 Catch:{ all -> 0x003f }
        if (r1 != 0) goto L_0x000d;	 Catch:{ all -> 0x003f }
        r4 = r4.edit();	 Catch:{ all -> 0x003f }
        r1 = "crashlytics.installation.id";	 Catch:{ all -> 0x003f }
        r4 = r4.remove(r1);	 Catch:{ all -> 0x003f }
        r4 = r4.putString(r0, r5);	 Catch:{ all -> 0x003f }
        goto L_0x0026;
        r4 = move-exception;
        r5 = r3.g;
        r5.unlock();
        throw r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.airm.a(android.content.SharedPreferences, java.lang.String):void");
    }

    private static void a(Map<a, String> map, a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }

    public static String b() {
        return String.format(Locale.US, "%s/%s", new Object[]{airm.a(Build.MANUFACTURER), airm.a(Build.MODEL)});
    }

    private void b(SharedPreferences sharedPreferences) {
        aiqy e = e();
        if (e != null) {
            a(sharedPreferences, e.a);
        }
    }

    public final String a() {
        SharedPreferences sharedPreferences = this.c.getSharedPreferences("com.crashlytics.prefs", 0);
        b(sharedPreferences);
        String string = sharedPreferences.getString("crashlytics.installation.id", null);
        return string == null ? a(sharedPreferences) : string;
    }

    public final Map<a, String> c() {
        HashMap hashMap = new HashMap();
        for (aiqo aiqo : this.j) {
            if (aiqo instanceof airj) {
                for (Entry entry : ((airj) aiqo).e().entrySet()) {
                    airm.a(hashMap, (a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public final String d() {
        return this.h.a(this.c);
    }

    public final synchronized aiqy e() {
        if (!this.m) {
            aiqz aiqz = this.k;
            aiqy aiqy = new aiqy(aiqz.a.a().getString("advertising_id", ""), aiqz.a.a().getBoolean("limit_ad_tracking_enabled", false));
            if (aiqz.b(aiqy)) {
                aiqj.a().a("Fabric", "Using AdvertisingInfo from Preference Store");
                new Thread(new 1(aiqy)).start();
            } else {
                aiqy = aiqz.a();
                aiqz.a(aiqy);
            }
            this.l = aiqy;
            this.m = true;
        }
        return this.l;
    }
}
