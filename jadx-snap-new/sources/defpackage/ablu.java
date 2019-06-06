package defpackage;

import android.os.SystemClock;
import com.google.common.base.Preconditions;
import defpackage.abln.e;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;

/* renamed from: ablu */
public final class ablu {
    private final abls a;
    private l b;
    private ablt c;
    private Long d = null;
    private Map<String, Long> e = new iv();

    /* renamed from: ablu$e */
    public enum e {
        RECORDING_GESTURE_BEGIN,
        PRE_CAPTURE_OPERATION_REQUESTED,
        PRE_CAPTURE_OPERATION_FINISHED,
        RECORDING_GESTURE_FINISHED,
        CAMERA_CAPTURE_CONTENT_READY,
        CONTENT_PROXY_SENT,
        PREVIEW_BEGIN_PREPARATION,
        PREVIEW_FINISH_PREPARATION,
        PREVIEW_UI_VISIBLE,
        PREVIEW_MEDIA_READY,
        PREVIEW_PLAYER_FIRST_FRAME
    }

    /* renamed from: ablu$k */
    public enum k {
        COLD_START,
        WARM_START
    }

    /* renamed from: ablu$j */
    public enum j {
        CAMERA,
        CHAT
    }

    /* renamed from: ablu$d */
    enum d implements e {
        CAPTURE_TO_FIRST_FRAME_OR_SHUTTER(e.PRE_CAPTURE_OPERATION_REQUESTED, e.PRE_CAPTURE_OPERATION_FINISHED),
        FIRST_FRAME_OR_SHUTTER_TO_MEDIA_READY(e.PRE_CAPTURE_OPERATION_FINISHED, e.CAMERA_CAPTURE_CONTENT_READY),
        CONTENT_PROXY_SENT_TO_PREVIEW_INIT(e.CONTENT_PROXY_SENT, e.PREVIEW_BEGIN_PREPARATION),
        PREVIEW_INIT_TO_UI_VISIBLE(e.PREVIEW_BEGIN_PREPARATION, e.PREVIEW_UI_VISIBLE),
        PREVIEW_INIT_TO_MEDIA_READY(e.PREVIEW_BEGIN_PREPARATION, e.PREVIEW_MEDIA_READY),
        MEDIA_READY_TO_FIRST_FRAME(e.CAMERA_CAPTURE_CONTENT_READY, e.PREVIEW_PLAYER_FIRST_FRAME);
        
        final e mEndEvent;
        final e mStartEvent;

        private d(e eVar, e eVar2) {
            this.mStartEvent = eVar;
            this.mEndEvent = eVar2;
        }

        public final String a() {
            return name();
        }
    }

    /* renamed from: ablu$c */
    public enum c {
        TAKE_PICTURE_API,
        SCREENSHOT,
        SCREENSHOT_PLUS,
        POST_PROCESSING_SCREENSHOT,
        API_FALLBACK,
        SC_MEDIA_RECORDER,
        ANDROID_MEDIA_RECORDER
    }

    /* renamed from: ablu$l */
    static class l {
        final EnumSet<d> a;
        final EnumMap<d, abll> b;
        int c;

        private l() {
            this.a = EnumSet.allOf(d.class);
            this.b = new EnumMap(d.class);
        }

        /* synthetic */ l(byte b) {
            this();
        }
    }

    /* renamed from: ablu$a */
    public enum a {
        FRONT,
        BACK
    }

    /* renamed from: ablu$b */
    public enum b {
        CAMERA1,
        CAMERA2,
        AR_CORE
    }

    /* renamed from: ablu$g */
    public enum g {
        PICTURE,
        VIDEO
    }

    /* renamed from: ablu$f */
    public enum f {
        DETECTED,
        ENABLED,
        NOT_DETECTED,
        NOT_SUPPORTED
    }

    /* renamed from: ablu$h */
    public enum h {
        ;
        
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;

        static {
            e = new int[]{1, 2, 3, 4};
        }

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    /* renamed from: ablu$i */
    public enum i {
        LOW_POWER,
        NORMAL
    }

    public ablu(abls abls) {
        this.a = abls;
    }

    private void a(Object obj) {
        if (obj != null) {
            a("key (%s) is set", obj);
        }
    }

    private void a(String str, Object... objArr) {
        str = String.format(str, objArr);
        if (this.c.p.length() < 256) {
            StringBuilder stringBuilder = this.c.p;
            stringBuilder.append('|');
            stringBuilder.append(str);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:55:0x021d in {5, 19, 20, 26, 32, 36, 37, 41, 42, 43, 46, 47, 48, 51, 54} preds:[]
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
    private synchronized void b() {
        /*
        r11 = this;
        monitor-enter(r11);
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        if (r0 != 0) goto L_0x0007;
        monitor-exit(r11);
        return;
        r0 = r11.d;	 Catch:{ all -> 0x021a }
        r1 = 0;	 Catch:{ all -> 0x021a }
        r2 = 1;	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        r0 = r0.b;	 Catch:{ all -> 0x021a }
        r3 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_REQUESTED;	 Catch:{ all -> 0x021a }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        r0 = r0.b;	 Catch:{ all -> 0x021a }
        r3 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_FINISHED;	 Catch:{ all -> 0x021a }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        r0 = r0.b;	 Catch:{ all -> 0x021a }
        r3 = defpackage.ablu.e.CAMERA_CAPTURE_CONTENT_READY;	 Catch:{ all -> 0x021a }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = r11.c;	 Catch:{ all -> 0x021a }
        r0 = r0.b;	 Catch:{ all -> 0x021a }
        r3 = defpackage.ablu.e.RECORDING_GESTURE_FINISHED;	 Catch:{ all -> 0x021a }
        r0 = r0.containsKey(r3);	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x0043;	 Catch:{ all -> 0x021a }
        r0 = 1;	 Catch:{ all -> 0x021a }
        goto L_0x0044;	 Catch:{ all -> 0x021a }
        r0 = 0;	 Catch:{ all -> 0x021a }
        r3 = 0;	 Catch:{ all -> 0x021a }
        if (r0 == 0) goto L_0x01a5;	 Catch:{ all -> 0x021a }
        r0 = r11.a;	 Catch:{ all -> 0x021a }
        r1 = r11.c;	 Catch:{ all -> 0x021a }
        r4 = new ablt;	 Catch:{ all -> 0x021a }
        r4.<init>();	 Catch:{ all -> 0x021a }
        r4.a = r2;	 Catch:{ all -> 0x021a }
        r2 = r11.d;	 Catch:{ all -> 0x021a }
        com.google.common.base.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x021a }
        r2 = new java.util.EnumMap;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.class;	 Catch:{ all -> 0x021a }
        r2.<init>(r5);	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.RECORDING_GESTURE_BEGIN;	 Catch:{ all -> 0x021a }
        r6 = 0;	 Catch:{ all -> 0x021a }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x021a }
        r2.put(r5, r6);	 Catch:{ all -> 0x021a }
        r5 = r11.c;	 Catch:{ all -> 0x021a }
        r5 = r5.b;	 Catch:{ all -> 0x021a }
        r5 = r5.entrySet();	 Catch:{ all -> 0x021a }
        r5 = r5.iterator();	 Catch:{ all -> 0x021a }
        r6 = r5.hasNext();	 Catch:{ all -> 0x021a }
        if (r6 == 0) goto L_0x009e;	 Catch:{ all -> 0x021a }
        r6 = r5.next();	 Catch:{ all -> 0x021a }
        r6 = (java.util.Map.Entry) r6;	 Catch:{ all -> 0x021a }
        r7 = r6.getValue();	 Catch:{ all -> 0x021a }
        r7 = (java.lang.Long) r7;	 Catch:{ all -> 0x021a }
        r7 = r7.longValue();	 Catch:{ all -> 0x021a }
        r6 = r6.getKey();	 Catch:{ all -> 0x021a }
        r9 = r11.d;	 Catch:{ all -> 0x021a }
        r9 = r9.longValue();	 Catch:{ all -> 0x021a }
        r7 = r7 - r9;	 Catch:{ all -> 0x021a }
        r7 = java.lang.Long.valueOf(r7);	 Catch:{ all -> 0x021a }
        r2.put(r6, r7);	 Catch:{ all -> 0x021a }
        goto L_0x0075;	 Catch:{ all -> 0x021a }
        r4.b = r2;	 Catch:{ all -> 0x021a }
        r2 = r11.e();	 Catch:{ all -> 0x021a }
        r4.c = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.d;	 Catch:{ all -> 0x021a }
        r4.d = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.e;	 Catch:{ all -> 0x021a }
        r4.e = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.f;	 Catch:{ all -> 0x021a }
        r4.f = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.g;	 Catch:{ all -> 0x021a }
        r4.g = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.h;	 Catch:{ all -> 0x021a }
        r4.h = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.j;	 Catch:{ all -> 0x021a }
        r4.j = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.i;	 Catch:{ all -> 0x021a }
        r4.i = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.k;	 Catch:{ all -> 0x021a }
        r4.k = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.l;	 Catch:{ all -> 0x021a }
        r4.l = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.m;	 Catch:{ all -> 0x021a }
        r4.m = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.n;	 Catch:{ all -> 0x021a }
        r4.n = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.o;	 Catch:{ all -> 0x021a }
        r4.o = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.p;	 Catch:{ all -> 0x021a }
        r4.p = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.q;	 Catch:{ all -> 0x021a }
        r4.q = r2;	 Catch:{ all -> 0x021a }
        r2 = r11.d;	 Catch:{ all -> 0x021a }
        com.google.common.base.Preconditions.checkNotNull(r2);	 Catch:{ all -> 0x021a }
        r2 = r11.c;	 Catch:{ all -> 0x021a }
        r2 = r2.b;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.PREVIEW_PLAYER_FIRST_FRAME;	 Catch:{ all -> 0x021a }
        r2 = r2.get(r5);	 Catch:{ all -> 0x021a }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x021a }
        r5 = r2.longValue();	 Catch:{ all -> 0x021a }
        r2 = r11.c;	 Catch:{ all -> 0x021a }
        r2 = r2.b;	 Catch:{ all -> 0x021a }
        r7 = defpackage.ablu.e.PREVIEW_UI_VISIBLE;	 Catch:{ all -> 0x021a }
        r2 = r2.get(r7);	 Catch:{ all -> 0x021a }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x021a }
        r7 = r2.longValue();	 Catch:{ all -> 0x021a }
        r5 = java.lang.Math.max(r5, r7);	 Catch:{ all -> 0x021a }
        r2 = r11.d;	 Catch:{ all -> 0x021a }
        r7 = r2.longValue();	 Catch:{ all -> 0x021a }
        r5 = r5 - r7;	 Catch:{ all -> 0x021a }
        r7 = r11.d();	 Catch:{ all -> 0x021a }
        r5 = r5 - r7;	 Catch:{ all -> 0x021a }
        r2 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x021a }
        r4.r = r2;	 Catch:{ all -> 0x021a }
        r5 = r11.d();	 Catch:{ all -> 0x021a }
        r2 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x021a }
        r4.s = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.g;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.g.VIDEO;	 Catch:{ all -> 0x021a }
        if (r2 != r5) goto L_0x014f;	 Catch:{ all -> 0x021a }
        r2 = r1.b;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_REQUESTED;	 Catch:{ all -> 0x021a }
        r2 = r2.get(r5);	 Catch:{ all -> 0x021a }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x021a }
        r5 = r1.b;	 Catch:{ all -> 0x021a }
        r6 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_FINISHED;	 Catch:{ all -> 0x021a }
        r5 = r5.get(r6);	 Catch:{ all -> 0x021a }
        r5 = (java.lang.Long) r5;	 Catch:{ all -> 0x021a }
        if (r5 == 0) goto L_0x0175;	 Catch:{ all -> 0x021a }
        if (r2 == 0) goto L_0x0175;	 Catch:{ all -> 0x021a }
        r5 = r5.longValue();	 Catch:{ all -> 0x021a }
        r7 = r2.longValue();	 Catch:{ all -> 0x021a }
        r5 = r5 - r7;	 Catch:{ all -> 0x021a }
        r2 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x021a }
        goto L_0x0176;	 Catch:{ all -> 0x021a }
        r2 = r1.b;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.CAMERA_CAPTURE_CONTENT_READY;	 Catch:{ all -> 0x021a }
        r2 = r2.get(r5);	 Catch:{ all -> 0x021a }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x021a }
        r5 = r1.b;	 Catch:{ all -> 0x021a }
        r6 = defpackage.ablu.e.RECORDING_GESTURE_FINISHED;	 Catch:{ all -> 0x021a }
        r5 = r5.get(r6);	 Catch:{ all -> 0x021a }
        r5 = (java.lang.Long) r5;	 Catch:{ all -> 0x021a }
        if (r2 == 0) goto L_0x0175;	 Catch:{ all -> 0x021a }
        if (r5 == 0) goto L_0x0175;	 Catch:{ all -> 0x021a }
        r6 = r2.longValue();	 Catch:{ all -> 0x021a }
        r8 = r5.longValue();	 Catch:{ all -> 0x021a }
        r6 = r6 - r8;	 Catch:{ all -> 0x021a }
        r2 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x021a }
        goto L_0x0176;	 Catch:{ all -> 0x021a }
        r2 = r3;	 Catch:{ all -> 0x021a }
        r4.t = r2;	 Catch:{ all -> 0x021a }
        r2 = r1.b;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.PREVIEW_PLAYER_FIRST_FRAME;	 Catch:{ all -> 0x021a }
        r2 = r2.get(r5);	 Catch:{ all -> 0x021a }
        r2 = (java.lang.Long) r2;	 Catch:{ all -> 0x021a }
        r1 = r1.b;	 Catch:{ all -> 0x021a }
        r5 = defpackage.ablu.e.CAMERA_CAPTURE_CONTENT_READY;	 Catch:{ all -> 0x021a }
        r1 = r1.get(r5);	 Catch:{ all -> 0x021a }
        r1 = (java.lang.Long) r1;	 Catch:{ all -> 0x021a }
        if (r2 == 0) goto L_0x019e;	 Catch:{ all -> 0x021a }
        if (r1 == 0) goto L_0x019e;	 Catch:{ all -> 0x021a }
        r5 = r2.longValue();	 Catch:{ all -> 0x021a }
        r1 = r1.longValue();	 Catch:{ all -> 0x021a }
        r5 = r5 - r1;	 Catch:{ all -> 0x021a }
        r1 = java.lang.Long.valueOf(r5);	 Catch:{ all -> 0x021a }
        goto L_0x019f;	 Catch:{ all -> 0x021a }
        r1 = r3;	 Catch:{ all -> 0x021a }
        r4.u = r1;	 Catch:{ all -> 0x021a }
        r0.a(r4);	 Catch:{ all -> 0x021a }
        goto L_0x020b;	 Catch:{ all -> 0x021a }
        r0 = "start time: %s, biased record not null: %b, PRE_CAPTURE_OPERATION_REQUESTED valid: %b, PRE_CAPTURE_OPERATION_FINISHED valid: %b, RECORDING_GESTURE_FINISHED valid: %b";	 Catch:{ all -> 0x021a }
        r4 = 5;	 Catch:{ all -> 0x021a }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x021a }
        r5 = r11.d;	 Catch:{ all -> 0x021a }
        r4[r1] = r5;	 Catch:{ all -> 0x021a }
        r5 = r11.c;	 Catch:{ all -> 0x021a }
        if (r5 == 0) goto L_0x01b4;	 Catch:{ all -> 0x021a }
        r5 = 1;	 Catch:{ all -> 0x021a }
        goto L_0x01b5;	 Catch:{ all -> 0x021a }
        r5 = 0;	 Catch:{ all -> 0x021a }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x021a }
        r4[r2] = r5;	 Catch:{ all -> 0x021a }
        r5 = 2;	 Catch:{ all -> 0x021a }
        r6 = r11.c;	 Catch:{ all -> 0x021a }
        r6 = r6.b;	 Catch:{ all -> 0x021a }
        r7 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_REQUESTED;	 Catch:{ all -> 0x021a }
        r6 = r6.containsKey(r7);	 Catch:{ all -> 0x021a }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x021a }
        r4[r5] = r6;	 Catch:{ all -> 0x021a }
        r5 = 3;	 Catch:{ all -> 0x021a }
        r6 = r11.c;	 Catch:{ all -> 0x021a }
        r6 = r6.b;	 Catch:{ all -> 0x021a }
        r7 = defpackage.ablu.e.PRE_CAPTURE_OPERATION_FINISHED;	 Catch:{ all -> 0x021a }
        r6 = r6.containsKey(r7);	 Catch:{ all -> 0x021a }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x021a }
        r4[r5] = r6;	 Catch:{ all -> 0x021a }
        r5 = 4;	 Catch:{ all -> 0x021a }
        r6 = r11.c;	 Catch:{ all -> 0x021a }
        r6 = r6.b;	 Catch:{ all -> 0x021a }
        r7 = defpackage.ablu.e.RECORDING_GESTURE_FINISHED;	 Catch:{ all -> 0x021a }
        r6 = r6.containsKey(r7);	 Catch:{ all -> 0x021a }
        r6 = java.lang.Boolean.valueOf(r6);	 Catch:{ all -> 0x021a }
        r4[r5] = r6;	 Catch:{ all -> 0x021a }
        r0 = java.lang.String.format(r0, r4);	 Catch:{ all -> 0x021a }
        r4 = "insufficient data: (%s)";	 Catch:{ all -> 0x021a }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x021a }
        r2[r1] = r0;	 Catch:{ all -> 0x021a }
        r11.a(r4, r2);	 Catch:{ all -> 0x021a }
        r0 = new ablt;	 Catch:{ all -> 0x021a }
        r0.<init>();	 Catch:{ all -> 0x021a }
        r1 = r11.c;	 Catch:{ all -> 0x021a }
        r1 = r1.p;	 Catch:{ all -> 0x021a }
        r0.p = r1;	 Catch:{ all -> 0x021a }
        r1 = r11.a;	 Catch:{ all -> 0x021a }
        r1.a(r0);	 Catch:{ all -> 0x021a }
        r11.c = r3;	 Catch:{ all -> 0x021a }
        r11.e = r3;	 Catch:{ all -> 0x021a }
        r0 = r11.b;	 Catch:{ all -> 0x021a }
        r0 = r0.c;	 Catch:{ all -> 0x021a }
        defpackage.zgo.a(r0);	 Catch:{ all -> 0x021a }
        r11.b = r3;	 Catch:{ all -> 0x021a }
        monitor-exit(r11);
        return;
        r0 = move-exception;
        monitor-exit(r11);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablu.b():void");
    }

    private boolean c() {
        return this.c != null;
    }

    private long d() {
        return this.c.g != g.VIDEO ? 0 : Math.min(((Long) this.c.b.get(e.RECORDING_GESTURE_FINISHED)).longValue(), ((Long) this.c.b.get(e.CAMERA_CAPTURE_CONTENT_READY)).longValue()) - ((Long) this.c.b.get(e.PRE_CAPTURE_OPERATION_FINISHED)).longValue();
    }

    private Map<String, Long> e() {
        Preconditions.checkNotNull(this.d);
        iv ivVar = new iv();
        for (Entry entry : this.e.entrySet()) {
            ivVar.put(entry.getKey(), Long.valueOf(((Long) entry.getValue()).longValue() - this.d.longValue()));
        }
        return ivVar;
    }

    public final synchronized ablu a() {
        if (this.c != null) {
            String stringBuilder = this.c.p.toString();
            this.c = new ablt();
            a("last snap creation record not closed:(%s)", stringBuilder);
        } else {
            this.c = new ablt();
        }
        this.e = new iv();
        this.b = new l();
        this.b.c = zgo.a();
        this.d = Long.valueOf(SystemClock.elapsedRealtime());
        this.a.a();
        return this;
    }

    public final synchronized ablu a(a aVar) {
        if (c()) {
            a(this.c.m);
            this.c.m = aVar;
        }
        return this;
    }

    public final synchronized ablu a(b bVar) {
        if (c()) {
            a(this.c.o);
            this.c.o = bVar;
        }
        return this;
    }

    public final synchronized ablu a(c cVar) {
        if (c()) {
            a(this.c.h);
            this.c.h = cVar;
        }
        return this;
    }

    public final synchronized ablu a(f fVar) {
        if (c()) {
            a(this.c.e);
            this.c.e = fVar;
        }
        return this;
    }

    public final synchronized ablu a(g gVar) {
        if (c()) {
            a(this.c.g);
            this.c.g = gVar;
        }
        return this;
    }

    public final synchronized ablu a(j jVar) {
        if (c()) {
            a(this.c.n);
            this.c.n = jVar;
        }
        return this;
    }

    public final synchronized ablu a(k kVar) {
        if (c()) {
            a(this.c.i);
            this.c.i = kVar;
        }
        return this;
    }

    public final synchronized ablu a(String str) {
        if (c()) {
            if (this.e.containsKey(str)) {
                a("key (%s) is set more than once", str);
            }
            zgo.b();
            this.e.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
        }
        return this;
    }

    public final synchronized ablu a(String str, String str2) {
        if (c()) {
            if (this.c.d.containsKey(str)) {
                a("key (%s) is set more than once", str);
            }
            this.c.d.put(str, str2);
        }
        return this;
    }

    public final synchronized ablu a(UUID uuid) {
        if (c()) {
            a(this.c.l);
            this.c.l = uuid;
        }
        return this;
    }

    public final synchronized ablu a(boolean z) {
        if (c()) {
            a(this.c.j);
            this.c.j = Boolean.valueOf(z);
        }
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:39:0x00a4 in {5, 11, 19, 24, 31, 33, 35, 38} preds:[]
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
    public final synchronized void a(defpackage.ablu.e r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = defpackage.ablu.e.RECORDING_GESTURE_BEGIN;	 Catch:{ all -> 0x00a1 }
        if (r8 != r0) goto L_0x0007;
        monitor-exit(r7);
        return;
        r0 = r7.c();	 Catch:{ all -> 0x00a1 }
        if (r0 == 0) goto L_0x009f;	 Catch:{ all -> 0x00a1 }
        r0 = r7.c;	 Catch:{ all -> 0x00a1 }
        r0 = r0.b;	 Catch:{ all -> 0x00a1 }
        r0 = r0.containsKey(r8);	 Catch:{ all -> 0x00a1 }
        r1 = 0;	 Catch:{ all -> 0x00a1 }
        r2 = 1;	 Catch:{ all -> 0x00a1 }
        if (r0 == 0) goto L_0x0022;	 Catch:{ all -> 0x00a1 }
        r0 = "key (%s) is set more than once";	 Catch:{ all -> 0x00a1 }
        r3 = new java.lang.Object[r2];	 Catch:{ all -> 0x00a1 }
        r3[r1] = r8;	 Catch:{ all -> 0x00a1 }
        r7.a(r0, r3);	 Catch:{ all -> 0x00a1 }
        r0 = r7.c;	 Catch:{ all -> 0x00a1 }
        r0 = r0.b;	 Catch:{ all -> 0x00a1 }
        r3 = android.os.SystemClock.elapsedRealtime();	 Catch:{ all -> 0x00a1 }
        r3 = java.lang.Long.valueOf(r3);	 Catch:{ all -> 0x00a1 }
        r0.put(r8, r3);	 Catch:{ all -> 0x00a1 }
        r0 = r7.b;	 Catch:{ all -> 0x00a1 }
        r8.name();	 Catch:{ all -> 0x00a1 }
        defpackage.zgo.b();	 Catch:{ all -> 0x00a1 }
        r3 = r0.a;	 Catch:{ all -> 0x00a1 }
        r3 = r3.iterator();	 Catch:{ all -> 0x00a1 }
        r4 = r3.hasNext();	 Catch:{ all -> 0x00a1 }
        if (r4 == 0) goto L_0x007d;	 Catch:{ all -> 0x00a1 }
        r4 = r3.next();	 Catch:{ all -> 0x00a1 }
        r4 = (defpackage.ablu.d) r4;	 Catch:{ all -> 0x00a1 }
        r5 = r4.mStartEvent;	 Catch:{ all -> 0x00a1 }
        if (r8 != r5) goto L_0x0060;	 Catch:{ all -> 0x00a1 }
        r5 = r0.b;	 Catch:{ all -> 0x00a1 }
        r5 = r5.containsKey(r4);	 Catch:{ all -> 0x00a1 }
        if (r5 != 0) goto L_0x0060;	 Catch:{ all -> 0x00a1 }
        r5 = defpackage.abll.a(r4);	 Catch:{ all -> 0x00a1 }
        r6 = r0.b;	 Catch:{ all -> 0x00a1 }
        r6.put(r4, r5);	 Catch:{ all -> 0x00a1 }
        r5 = r4.mEndEvent;	 Catch:{ all -> 0x00a1 }
        if (r8 != r5) goto L_0x003f;	 Catch:{ all -> 0x00a1 }
        r5 = r0.b;	 Catch:{ all -> 0x00a1 }
        r5 = r5.containsKey(r4);	 Catch:{ all -> 0x00a1 }
        if (r5 == 0) goto L_0x003f;	 Catch:{ all -> 0x00a1 }
        r5 = r0.b;	 Catch:{ all -> 0x00a1 }
        r5 = r5.get(r4);	 Catch:{ all -> 0x00a1 }
        r5 = (defpackage.abll) r5;	 Catch:{ all -> 0x00a1 }
        r5.a();	 Catch:{ all -> 0x00a1 }
        r5 = r0.b;	 Catch:{ all -> 0x00a1 }
        r5.remove(r4);	 Catch:{ all -> 0x00a1 }
        goto L_0x003f;	 Catch:{ all -> 0x00a1 }
        r8 = r7.c;	 Catch:{ all -> 0x00a1 }
        if (r8 == 0) goto L_0x009a;	 Catch:{ all -> 0x00a1 }
        r8 = r7.c;	 Catch:{ all -> 0x00a1 }
        r8 = r8.b;	 Catch:{ all -> 0x00a1 }
        r0 = defpackage.ablu.e.PREVIEW_UI_VISIBLE;	 Catch:{ all -> 0x00a1 }
        r8 = r8.containsKey(r0);	 Catch:{ all -> 0x00a1 }
        if (r8 == 0) goto L_0x009a;	 Catch:{ all -> 0x00a1 }
        r8 = r7.c;	 Catch:{ all -> 0x00a1 }
        r8 = r8.b;	 Catch:{ all -> 0x00a1 }
        r0 = defpackage.ablu.e.PREVIEW_PLAYER_FIRST_FRAME;	 Catch:{ all -> 0x00a1 }
        r8 = r8.containsKey(r0);	 Catch:{ all -> 0x00a1 }
        if (r8 == 0) goto L_0x009a;	 Catch:{ all -> 0x00a1 }
        r1 = 1;	 Catch:{ all -> 0x00a1 }
        if (r1 == 0) goto L_0x009f;	 Catch:{ all -> 0x00a1 }
        r7.b();	 Catch:{ all -> 0x00a1 }
        monitor-exit(r7);
        return;
        r8 = move-exception;
        monitor-exit(r7);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ablu.a(ablu$e):void");
    }

    public final synchronized ablu b(String str) {
        if (c()) {
            if (this.c.k != null) {
                a("lensesId is set more than once", new Object[0]);
            }
            this.c.k = str;
        }
        return this;
    }

    public final synchronized ablu c(String str) {
        if (c()) {
            a(this.c.q);
            this.c.q = str;
        }
        return this;
    }
}
