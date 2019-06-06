package defpackage;

import android.os.Bundle;
import android.util.Log;
import defpackage.bau.a;
import defpackage.bau.b;
import java.util.Collections;

/* renamed from: baq */
public final class baq {
    private final String a;

    public baq(String str) {
        this.a = str;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:11:0x0040 in {3, 7, 10} preds:[]
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
    private static java.lang.String a(java.util.List<defpackage.baw> r5) {
        /*
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = new org.json.JSONArray;
        r1.<init>();
        r2 = new org.json.JSONArray;
        r2.<init>();
        r5 = r5.iterator();
        r3 = r5.hasNext();
        if (r3 == 0) goto L_0x002a;
        r3 = r5.next();
        r3 = (defpackage.baw) r3;
        r4 = r3.b;
        r1.put(r4);
        r3 = r3.a;
        r2.put(r3);
        goto L_0x0013;
        r5 = "uri_flags";	 Catch:{ JSONException -> 0x0039 }
        r0.put(r5, r1);	 Catch:{ JSONException -> 0x0039 }
        r5 = "uris";	 Catch:{ JSONException -> 0x0039 }
        r0.put(r5, r2);	 Catch:{ JSONException -> 0x0039 }
        r5 = r0.toString();
        return r5;
        r5 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r5);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baq.a(java.util.List):java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:10:0x003c in {5, 6, 9} preds:[]
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
    private static java.util.List<defpackage.baw> a(java.lang.String r7) {
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0035 }
        r1.<init>(r7);	 Catch:{ JSONException -> 0x0035 }
        r7 = "uri_flags";	 Catch:{ JSONException -> 0x0035 }
        r7 = r1.getJSONArray(r7);	 Catch:{ JSONException -> 0x0035 }
        r2 = "uris";	 Catch:{ JSONException -> 0x0035 }
        r1 = r1.getJSONArray(r2);	 Catch:{ JSONException -> 0x0035 }
        r2 = r7.length();	 Catch:{ JSONException -> 0x0035 }
        r3 = 0;	 Catch:{ JSONException -> 0x0035 }
        if (r3 >= r2) goto L_0x0034;	 Catch:{ JSONException -> 0x0035 }
        r4 = r7.getInt(r3);	 Catch:{ JSONException -> 0x0035 }
        r5 = r1.getString(r3);	 Catch:{ JSONException -> 0x0035 }
        r6 = new baw;	 Catch:{ JSONException -> 0x0035 }
        r5 = android.net.Uri.parse(r5);	 Catch:{ JSONException -> 0x0035 }
        r6.<init>(r5, r4);	 Catch:{ JSONException -> 0x0035 }
        r0.add(r6);	 Catch:{ JSONException -> 0x0035 }
        r3 = r3 + 1;
        goto L_0x001b;
        return r0;
        r7 = move-exception;
        r0 = new java.lang.RuntimeException;
        r0.<init>(r7);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baq.a(java.lang.String):java.util.List");
    }

    private void a(bau bau, Bundle bundle) {
        String str = "trigger_type";
        StringBuilder stringBuilder;
        if (bau == bay.a) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.a);
            stringBuilder2.append(str);
            bundle.putInt(stringBuilder2.toString(), 2);
        } else if (bau instanceof b) {
            b bVar = (b) bau;
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(str);
            bundle.putInt(stringBuilder.toString(), 1);
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("window_start");
            bundle.putInt(stringBuilder.toString(), bVar.a);
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("window_end");
            bundle.putInt(stringBuilder.toString(), bVar.b);
        } else if (bau instanceof a) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(str);
            bundle.putInt(stringBuilder.toString(), 3);
            String a = baq.a(((a) bau).a);
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("observed_uris");
            bundle.putString(stringBuilder.toString(), a);
        } else {
            throw new IllegalArgumentException("Unsupported trigger.");
        }
    }

    private void a(bax bax, Bundle bundle) {
        if (bax == null) {
            bax = bax.a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("retry_policy");
        bundle.putInt(stringBuilder.toString(), bax.c);
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("initial_backoff_seconds");
        bundle.putInt(stringBuilder.toString(), bax.d);
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("maximum_backoff_seconds");
        bundle.putInt(stringBuilder.toString(), bax.e);
    }

    private bau b(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("trigger_type");
        int i = bundle.getInt(stringBuilder.toString());
        if (i == 1) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("window_start");
            i = bundle.getInt(stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.a);
            stringBuilder2.append("window_end");
            return bay.a(i, bundle.getInt(stringBuilder2.toString()));
        } else if (i == 2) {
            return bay.a;
        } else {
            if (i != 3) {
                String str = "FJD.ExternalReceiver";
                if (Log.isLoggable(str, 3)) {
                    Log.d(str, "Unsupported trigger.");
                }
                return null;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("observed_uris");
            return bay.a(Collections.unmodifiableList(baq.a(bundle.getString(stringBuilder.toString()))));
        }
    }

    private bax c(Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("retry_policy");
        int i = bundle.getInt(stringBuilder.toString());
        if (i != 1 && i != 2) {
            return bax.a;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(this.a);
        stringBuilder2.append("initial_backoff_seconds");
        int i2 = bundle.getInt(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(this.a);
        stringBuilder3.append("maximum_backoff_seconds");
        return new bax(i, i2, bundle.getInt(stringBuilder3.toString()));
    }

    public final Bundle a(bas bas, Bundle bundle) {
        if (bundle != null) {
            Bundle b = bas.b();
            if (b != null) {
                bundle.putAll(b);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("persistent");
            bundle.putInt(stringBuilder.toString(), bas.g());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("recurring");
            bundle.putBoolean(stringBuilder.toString(), bas.h());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("replace_current");
            bundle.putBoolean(stringBuilder.toString(), bas.d());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("tag");
            bundle.putString(stringBuilder.toString(), bas.e());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("service");
            bundle.putString(stringBuilder.toString(), bas.i());
            stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("constraints");
            bundle.putInt(stringBuilder.toString(), baa.a(bas.a()));
            a(bas.f(), bundle);
            a(bas.c(), bundle);
            return bundle;
        }
        throw new IllegalArgumentException("Unexpected null Bundle provided");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x00f1 in {6, 14, 16, 18, 20} preds:[]
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
    public final defpackage.bar.a a(android.os.Bundle r10) {
        /*
        r9 = this;
        if (r10 == 0) goto L_0x00e9;
        r0 = new android.os.Bundle;
        r0.<init>(r10);
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r1 = r9.a;
        r10.append(r1);
        r1 = "recurring";
        r10.append(r1);
        r10 = r10.toString();
        r10 = r0.getBoolean(r10);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = r9.a;
        r1.append(r2);
        r2 = "replace_current";
        r1.append(r2);
        r1 = r1.toString();
        r1 = r0.getBoolean(r1);
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = r9.a;
        r2.append(r3);
        r3 = "persistent";
        r2.append(r3);
        r2 = r2.toString();
        r2 = r0.getInt(r2);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = r9.a;
        r3.append(r4);
        r4 = "constraints";
        r3.append(r4);
        r3 = r3.toString();
        r3 = r0.getInt(r3);
        r3 = defpackage.baa.a(r3);
        r4 = r9.b(r0);
        r5 = r9.c(r0);
        r6 = new java.lang.StringBuilder;
        r6.<init>();
        r7 = r9.a;
        r6.append(r7);
        r7 = "tag";
        r6.append(r7);
        r6 = r6.toString();
        r6 = r0.getString(r6);
        r7 = new java.lang.StringBuilder;
        r7.<init>();
        r8 = r9.a;
        r7.append(r8);
        r8 = "service";
        r7.append(r8);
        r7 = r7.toString();
        r7 = r0.getString(r7);
        if (r6 == 0) goto L_0x00e7;
        if (r7 == 0) goto L_0x00e7;
        if (r4 == 0) goto L_0x00e7;
        if (r5 != 0) goto L_0x00a6;
        goto L_0x00e7;
        r8 = new bar$a;
        r8.<init>();
        r8.a = r6;
        r8.b = r7;
        r8.c = r4;
        r8.h = r5;
        r8.d = r10;
        r8.e = r2;
        r8.f = r3;
        r8.i = r1;
        r10 = r9.a;
        r10 = android.text.TextUtils.isEmpty(r10);
        if (r10 != 0) goto L_0x00e3;
        r10 = r0.keySet();
        r10 = r10.iterator();
        r1 = r10.hasNext();
        if (r1 == 0) goto L_0x00e3;
        r1 = r10.next();
        r1 = (java.lang.String) r1;
        r2 = r9.a;
        r1 = r1.startsWith(r2);
        if (r1 == 0) goto L_0x00cb;
        r10.remove();
        goto L_0x00cb;
        r8.a(r0);
        return r8;
        r10 = 0;
        return r10;
        r10 = new java.lang.IllegalArgumentException;
        r0 = "Unexpected null Bundle provided";
        r10.<init>(r0);
        throw r10;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.baq.a(android.os.Bundle):bar$a");
    }
}
