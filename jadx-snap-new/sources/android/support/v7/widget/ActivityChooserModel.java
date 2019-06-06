package android.support.v7.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import com.brightcove.player.event.Event;
import com.brightcove.player.media.CuePointFields;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class ActivityChooserModel extends DataSetObservable {
    static final String a = "ActivityChooserModel";
    private static final Object j = new Object();
    private static final Map<String, ActivityChooserModel> k = new HashMap();
    final Object b = new Object();
    final List<ActivityResolveInfo> c = new ArrayList();
    final Context d;
    final String e;
    Intent f;
    boolean g = true;
    boolean h = false;
    OnChooseActivityListener i;
    private final List<HistoricalRecord> l = new ArrayList();
    private ActivitySorter m = new a();
    private int n = 50;
    private boolean o = false;
    private boolean p = true;

    public interface ActivityChooserModelClient {
        void setActivityChooserModel(ActivityChooserModel activityChooserModel);
    }

    public static final class ActivityResolveInfo implements Comparable<ActivityResolveInfo> {
        public final ResolveInfo resolveInfo;
        public float weight;

        public ActivityResolveInfo(ResolveInfo resolveInfo) {
            this.resolveInfo = resolveInfo;
        }

        public final int compareTo(ActivityResolveInfo activityResolveInfo) {
            return Float.floatToIntBits(activityResolveInfo.weight) - Float.floatToIntBits(this.weight);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return Float.floatToIntBits(this.weight) == Float.floatToIntBits(((ActivityResolveInfo) obj).weight);
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.weight) + 31;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("resolveInfo:");
            stringBuilder.append(this.resolveInfo.toString());
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public interface ActivitySorter {
        void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2);
    }

    public static final class HistoricalRecord {
        public final ComponentName activity;
        public final long time;
        public final float weight;

        public HistoricalRecord(ComponentName componentName, long j, float f) {
            this.activity = componentName;
            this.time = j;
            this.weight = f;
        }

        public HistoricalRecord(String str, long j, float f) {
            this(ComponentName.unflattenFromString(str), j, f);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            HistoricalRecord historicalRecord = (HistoricalRecord) obj;
            ComponentName componentName = this.activity;
            if (componentName == null) {
                if (historicalRecord.activity != null) {
                    return false;
                }
            } else if (!componentName.equals(historicalRecord.activity)) {
                return false;
            }
            return this.time == historicalRecord.time && Float.floatToIntBits(this.weight) == Float.floatToIntBits(historicalRecord.weight);
        }

        public final int hashCode() {
            ComponentName componentName = this.activity;
            int hashCode = ((componentName == null ? 0 : componentName.hashCode()) + 31) * 31;
            long j = this.time;
            return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.weight);
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append("; activity:");
            stringBuilder.append(this.activity);
            stringBuilder.append("; time:");
            stringBuilder.append(this.time);
            stringBuilder.append("; weight:");
            stringBuilder.append(new BigDecimal((double) this.weight));
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public interface OnChooseActivityListener {
        boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent);
    }

    final class b extends AsyncTask<Object, Void, Void> {
        b() {
        }

        /* JADX WARNING: Missing block: B:10:0x006b, code skipped:
            if (r15 != null) goto L_0x006d;
     */
        /* JADX WARNING: Missing block: B:12:?, code skipped:
            r15.close();
     */
        /* JADX WARNING: Missing block: B:18:0x008d, code skipped:
            if (r15 == null) goto L_0x00ca;
     */
        /* JADX WARNING: Missing block: B:23:0x00aa, code skipped:
            if (r15 == null) goto L_0x00ca;
     */
        /* JADX WARNING: Missing block: B:28:0x00c7, code skipped:
            if (r15 == null) goto L_0x00ca;
     */
        private java.lang.Void a(java.lang.Object... r15) {
            /*
            r14 = this;
            r0 = "historical-record";
            r1 = "historical-records";
            r2 = "Error writing historical record file: ";
            r3 = 0;
            r4 = r15[r3];
            r4 = (java.util.List) r4;
            r5 = 1;
            r15 = r15[r5];
            r15 = (java.lang.String) r15;
            r6 = 0;
            r7 = android.support.v7.widget.ActivityChooserModel.this;	 Catch:{ FileNotFoundException -> 0x00d5 }
            r7 = r7.d;	 Catch:{ FileNotFoundException -> 0x00d5 }
            r15 = r7.openFileOutput(r15, r3);	 Catch:{ FileNotFoundException -> 0x00d5 }
            r7 = android.util.Xml.newSerializer();
            r7.setOutput(r15, r6);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r8 = "UTF-8";
            r9 = java.lang.Boolean.TRUE;	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.startDocument(r8, r9);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.startTag(r6, r1);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r8 = r4.size();	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r9 = 0;
        L_0x002f:
            if (r9 >= r8) goto L_0x0061;
        L_0x0031:
            r10 = r4.remove(r3);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r10 = (android.support.v7.widget.ActivityChooserModel.HistoricalRecord) r10;	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.startTag(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r11 = "activity";
            r12 = r10.activity;	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r12 = r12.flattenToString();	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.attribute(r6, r11, r12);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r11 = "time";
            r12 = r10.time;	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r12 = java.lang.String.valueOf(r12);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.attribute(r6, r11, r12);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r11 = "weight";
            r10 = r10.weight;	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r10 = java.lang.String.valueOf(r10);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.attribute(r6, r11, r10);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.endTag(r6, r0);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r9 = r9 + 1;
            goto L_0x002f;
        L_0x0061:
            r7.endTag(r6, r1);	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r7.endDocument();	 Catch:{ IllegalArgumentException -> 0x00ad, IllegalStateException -> 0x0090, IOException -> 0x0073 }
            r0 = android.support.v7.widget.ActivityChooserModel.this;
            r0.g = r5;
            if (r15 == 0) goto L_0x00ca;
        L_0x006d:
            r15.close();	 Catch:{ IOException -> 0x00ca }
            goto L_0x00ca;
        L_0x0071:
            r0 = move-exception;
            goto L_0x00cb;
        L_0x0073:
            r0 = move-exception;
            r1 = android.support.v7.widget.ActivityChooserModel.a;	 Catch:{ all -> 0x0071 }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
            r3.<init>(r2);	 Catch:{ all -> 0x0071 }
            r2 = android.support.v7.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x0071 }
            r2 = r2.e;	 Catch:{ all -> 0x0071 }
            r3.append(r2);	 Catch:{ all -> 0x0071 }
            r2 = r3.toString();	 Catch:{ all -> 0x0071 }
            android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0071 }
            r0 = android.support.v7.widget.ActivityChooserModel.this;
            r0.g = r5;
            if (r15 == 0) goto L_0x00ca;
        L_0x008f:
            goto L_0x006d;
        L_0x0090:
            r0 = move-exception;
            r1 = android.support.v7.widget.ActivityChooserModel.a;	 Catch:{ all -> 0x0071 }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
            r3.<init>(r2);	 Catch:{ all -> 0x0071 }
            r2 = android.support.v7.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x0071 }
            r2 = r2.e;	 Catch:{ all -> 0x0071 }
            r3.append(r2);	 Catch:{ all -> 0x0071 }
            r2 = r3.toString();	 Catch:{ all -> 0x0071 }
            android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0071 }
            r0 = android.support.v7.widget.ActivityChooserModel.this;
            r0.g = r5;
            if (r15 == 0) goto L_0x00ca;
        L_0x00ac:
            goto L_0x006d;
        L_0x00ad:
            r0 = move-exception;
            r1 = android.support.v7.widget.ActivityChooserModel.a;	 Catch:{ all -> 0x0071 }
            r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0071 }
            r3.<init>(r2);	 Catch:{ all -> 0x0071 }
            r2 = android.support.v7.widget.ActivityChooserModel.this;	 Catch:{ all -> 0x0071 }
            r2 = r2.e;	 Catch:{ all -> 0x0071 }
            r3.append(r2);	 Catch:{ all -> 0x0071 }
            r2 = r3.toString();	 Catch:{ all -> 0x0071 }
            android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x0071 }
            r0 = android.support.v7.widget.ActivityChooserModel.this;
            r0.g = r5;
            if (r15 == 0) goto L_0x00ca;
        L_0x00c9:
            goto L_0x006d;
        L_0x00ca:
            return r6;
        L_0x00cb:
            r1 = android.support.v7.widget.ActivityChooserModel.this;
            r1.g = r5;
            if (r15 == 0) goto L_0x00d4;
        L_0x00d1:
            r15.close();	 Catch:{ IOException -> 0x00d4 }
        L_0x00d4:
            throw r0;
        L_0x00d5:
            r0 = move-exception;
            r1 = android.support.v7.widget.ActivityChooserModel.a;
            r15 = java.lang.String.valueOf(r15);
            r15 = r2.concat(r15);
            android.util.Log.e(r1, r15, r0);
            return r6;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel$b.a(java.lang.Object[]):java.lang.Void");
        }

        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            return a(objArr);
        }
    }

    static final class a implements ActivitySorter {
        private final Map<ComponentName, ActivityResolveInfo> a = new HashMap();

        a() {
        }

        public final void sort(Intent intent, List<ActivityResolveInfo> list, List<HistoricalRecord> list2) {
            Map map = this.a;
            map.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) list.get(i);
                activityResolveInfo.weight = MapboxConstants.MINIMUM_ZOOM;
                map.put(new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name), activityResolveInfo);
            }
            float f = 1.0f;
            for (size = list2.size() - 1; size >= 0; size--) {
                HistoricalRecord historicalRecord = (HistoricalRecord) list2.get(size);
                ActivityResolveInfo activityResolveInfo2 = (ActivityResolveInfo) map.get(historicalRecord.activity);
                if (activityResolveInfo2 != null) {
                    activityResolveInfo2.weight += historicalRecord.weight * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    private ActivityChooserModel(Context context, String str) {
        this.d = context.getApplicationContext();
        if (!TextUtils.isEmpty(str)) {
            String str2 = ".xml";
            if (!str.endsWith(str2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str);
                stringBuilder.append(str2);
                this.e = stringBuilder.toString();
                return;
            }
        }
        this.e = str;
    }

    public static ActivityChooserModel a(Context context, String str) {
        ActivityChooserModel activityChooserModel;
        synchronized (j) {
            activityChooserModel = (ActivityChooserModel) k.get(str);
            if (activityChooserModel == null) {
                activityChooserModel = new ActivityChooserModel(context, str);
                k.put(str, activityChooserModel);
            }
        }
        return activityChooserModel;
    }

    private void e() {
        if (!this.o) {
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        } else if (this.p) {
            this.p = false;
            if (!TextUtils.isEmpty(this.e)) {
                new b().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[]{new ArrayList(this.l), this.e});
            }
        }
    }

    private boolean f() {
        if (this.m == null || this.f == null || this.c.isEmpty() || this.l.isEmpty()) {
            return false;
        }
        this.m.sort(this.f, this.c, Collections.unmodifiableList(this.l));
        return true;
    }

    private boolean g() {
        int i = 0;
        if (!this.h || this.f == null) {
            return false;
        }
        this.h = false;
        this.c.clear();
        List queryIntentActivities = this.d.getPackageManager().queryIntentActivities(this.f, 0);
        int size = queryIntentActivities.size();
        while (i < size) {
            this.c.add(new ActivityResolveInfo((ResolveInfo) queryIntentActivities.get(i)));
            i++;
        }
        return true;
    }

    private boolean h() {
        if (!this.g || !this.p || TextUtils.isEmpty(this.e)) {
            return false;
        }
        this.g = false;
        this.o = true;
        j();
        return true;
    }

    private void i() {
        int size = this.l.size() - this.n;
        if (size > 0) {
            this.p = true;
            for (int i = 0; i < size; i++) {
                this.l.remove(0);
            }
        }
    }

    private void j() {
        String str;
        StringBuilder stringBuilder;
        String str2 = "Error reading historical recrod file: ";
        try {
            FileInputStream openFileInput = this.d.openFileInput(this.e);
            try {
                XmlPullParser newPullParser = Xml.newPullParser();
                newPullParser.setInput(openFileInput, "UTF-8");
                int i = 0;
                while (i != 1 && i != 2) {
                    i = newPullParser.next();
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.l;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (!(next == 3 || next == 4)) {
                                if ("historical-record".equals(newPullParser.getName())) {
                                    list.add(new HistoricalRecord(newPullParser.getAttributeValue(null, Event.ACTIVITY), Long.parseLong(newPullParser.getAttributeValue(null, CuePointFields.TIME)), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                                } else {
                                    throw new XmlPullParserException("Share records file not well-formed.");
                                }
                            }
                        } else if (openFileInput != null) {
                            try {
                                openFileInput.close();
                            } catch (IOException unused) {
                            }
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (XmlPullParserException e) {
                str = a;
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(this.e);
                Log.e(str, stringBuilder.toString(), e);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (IOException e2) {
                str = a;
                stringBuilder = new StringBuilder(str2);
                stringBuilder.append(this.e);
                Log.e(str, stringBuilder.toString(), e2);
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused4) {
                    }
                }
            }
        } catch (FileNotFoundException unused5) {
        }
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            d();
            size = this.c.size();
        }
        return size;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:16:0x0024 in {8, 9, 12, 15} preds:[]
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
    public final int a(android.content.pm.ResolveInfo r6) {
        /*
        r5 = this;
        r0 = r5.b;
        monitor-enter(r0);
        r5.d();	 Catch:{ all -> 0x0021 }
        r1 = r5.c;	 Catch:{ all -> 0x0021 }
        r2 = r1.size();	 Catch:{ all -> 0x0021 }
        r3 = 0;	 Catch:{ all -> 0x0021 }
        if (r3 >= r2) goto L_0x001e;	 Catch:{ all -> 0x0021 }
        r4 = r1.get(r3);	 Catch:{ all -> 0x0021 }
        r4 = (android.support.v7.widget.ActivityChooserModel.ActivityResolveInfo) r4;	 Catch:{ all -> 0x0021 }
        r4 = r4.resolveInfo;	 Catch:{ all -> 0x0021 }
        if (r4 != r6) goto L_0x001b;	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return r3;	 Catch:{ all -> 0x0021 }
        r3 = r3 + 1;	 Catch:{ all -> 0x0021 }
        goto L_0x000d;	 Catch:{ all -> 0x0021 }
        r6 = -1;	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        return r6;	 Catch:{ all -> 0x0021 }
        r6 = move-exception;	 Catch:{ all -> 0x0021 }
        monitor-exit(r0);	 Catch:{ all -> 0x0021 }
        throw r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActivityChooserModel.a(android.content.pm.ResolveInfo):int");
    }

    public final ResolveInfo a(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            d();
            resolveInfo = ((ActivityResolveInfo) this.c.get(i)).resolveInfo;
        }
        return resolveInfo;
    }

    /* Access modifiers changed, original: final */
    public final boolean a(HistoricalRecord historicalRecord) {
        boolean add = this.l.add(historicalRecord);
        if (add) {
            this.p = true;
            i();
            e();
            f();
            notifyChanged();
        }
        return add;
    }

    public final Intent b(int i) {
        synchronized (this.b) {
            if (this.f == null) {
                return null;
            }
            d();
            ActivityResolveInfo activityResolveInfo = (ActivityResolveInfo) this.c.get(i);
            ComponentName componentName = new ComponentName(activityResolveInfo.resolveInfo.activityInfo.packageName, activityResolveInfo.resolveInfo.activityInfo.name);
            Intent intent = new Intent(this.f);
            intent.setComponent(componentName);
            if (this.i != null) {
                if (this.i.onChooseActivity(this, new Intent(intent))) {
                    return null;
                }
            }
            a(new HistoricalRecord(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo b() {
        synchronized (this.b) {
            d();
            if (this.c.isEmpty()) {
                return null;
            }
            ResolveInfo resolveInfo = ((ActivityResolveInfo) this.c.get(0)).resolveInfo;
            return resolveInfo;
        }
    }

    public final int c() {
        int size;
        synchronized (this.b) {
            d();
            size = this.l.size();
        }
        return size;
    }

    /* Access modifiers changed, original: final */
    public final void d() {
        int g = g() | h();
        i();
        if (g != 0) {
            f();
            notifyChanged();
        }
    }
}
