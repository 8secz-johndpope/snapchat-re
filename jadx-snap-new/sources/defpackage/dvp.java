package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.widget.Toast;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: dvp */
public final class dvp {
    private final eca a;
    private final int b = -3;
    private final gqr c;
    private final Supplier<Handler> d;
    private final Context e;
    private HandlerThread f;
    private b g;

    /* renamed from: dvp$c */
    static class c extends HandlerThread {
        public c(String str, int i) {
            super(str, i);
        }

        /* Access modifiers changed, original: protected|final */
        public final void onLooperPrepared() {
        }
    }

    /* renamed from: dvp$b */
    public static class b extends abms {
        boolean a;
        private final eca b;
        private final gqr c;
        private final Context d;
        private final Supplier<Handler> e;
        private List<absv> f;
        private Field g;
        private MessageQueue h;
        private Field i;

        public b(eca eca, Looper looper, Context context, Supplier<Handler> supplier, gqr gqr) {
            super(looper);
            this.b = eca;
            this.d = context;
            this.e = supplier;
            this.c = gqr;
            if (this.C.f()) {
                this.f = Collections.synchronizedList(new ArrayList());
                try {
                    Field declaredField = Looper.class.getDeclaredField("mQueue");
                    declaredField.setAccessible(true);
                    this.g = MessageQueue.class.getDeclaredField("mMessages");
                    this.g.setAccessible(true);
                    this.i = Message.class.getDeclaredField("next");
                    this.i.setAccessible(true);
                    this.h = (MessageQueue) declaredField.get(getLooper());
                } catch (IllegalAccessException | NoSuchFieldException unused) {
                }
            }
        }

        private void a(String str, boolean z, long j) {
            if (this.C.f()) {
                long currentTimeMillis = System.currentTimeMillis();
                str = String.format(Locale.US, "op:%s,duration:%d,timestamp:%d", new Object[]{str, Long.valueOf(currentTimeMillis - j), Long.valueOf(currentTimeMillis)});
                absv absv = new absv();
                absv.b = ImmutableList.of(str);
                absv.a = z;
                this.f.add(absv);
            }
        }

        private /* synthetic */ void c() {
            Toast.makeText(this.d, "Camera ANR detected. Can you click Developer options -> Submit bug report -> Interactive Report and forward to core-camera@snapchat.com and S2R?", 1).show();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:21:0x005a in {14, 15, 16, 17, 18, 20} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public final void a() {
            /*
            r5 = this;
            r0 = r5.C;
            r0 = r0.f();
            if (r0 == 0) goto L_0x0052;
            r0 = r5.e;
            r0 = r0.get();
            r0 = (android.os.Handler) r0;
            r1 = new -$$Lambda$dvp$b$0-R6SPIJDK5v_MIQZZsTw4A-Rk0;
            r1.<init>(r5);
            r0.post(r1);
            r0 = new java.util.ArrayList;	 Catch:{ IllegalAccessException -> 0x0051 }
            r0.<init>();	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r5.g;	 Catch:{ IllegalAccessException -> 0x0051 }
            if (r1 == 0) goto L_0x004e;	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r5.h;	 Catch:{ IllegalAccessException -> 0x0051 }
            if (r1 == 0) goto L_0x004e;	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r5.i;	 Catch:{ IllegalAccessException -> 0x0051 }
            if (r1 == 0) goto L_0x004e;	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r5.g;	 Catch:{ IllegalAccessException -> 0x0051 }
            r2 = r5.h;	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r1.get(r2);	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = (android.os.Message) r1;	 Catch:{ IllegalAccessException -> 0x0051 }
            r2 = defpackage.ecx.values();	 Catch:{ IllegalAccessException -> 0x0051 }
            if (r1 == 0) goto L_0x004e;	 Catch:{ IllegalAccessException -> 0x0051 }
            r3 = r1.what;	 Catch:{ IllegalAccessException -> 0x0051 }
            r4 = r2.length;	 Catch:{ IllegalAccessException -> 0x0051 }
            if (r3 >= r4) goto L_0x0045;	 Catch:{ IllegalAccessException -> 0x0051 }
            r3 = r1.what;	 Catch:{ IllegalAccessException -> 0x0051 }
            r3 = r2[r3];	 Catch:{ IllegalAccessException -> 0x0051 }
            r0.add(r3);	 Catch:{ IllegalAccessException -> 0x0051 }
            r3 = r5.i;	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = r3.get(r1);	 Catch:{ IllegalAccessException -> 0x0051 }
            r1 = (android.os.Message) r1;	 Catch:{ IllegalAccessException -> 0x0051 }
            goto L_0x0037;	 Catch:{ IllegalAccessException -> 0x0051 }
            defpackage.dnz.a();	 Catch:{ IllegalAccessException -> 0x0051 }
            return;
            r0 = new java.lang.IllegalStateException;
            r1 = "not master mode";
            r0.<init>(r1);
            throw r0;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dvp$b.a():void");
        }

        /* Access modifiers changed, original: final */
        public final void a(ecx ecx, ecr ecr) {
            if (this.C.b()) {
                StringBuilder stringBuilder = new StringBuilder("Camera Operation ");
                stringBuilder.append(ecx.name());
                stringBuilder.append(" failed to execute");
                dqq.a();
            }
            gqr gqr = this.c;
            gqt gqt = gqt.NORMAL;
            idd callsite = dnj.a.callsite("CameraOperationHandler");
            StringBuilder stringBuilder2 = new StringBuilder("reportErrorOperation:");
            stringBuilder2.append(ecx.name());
            gqr.a(gqt, ecr, callsite.a(stringBuilder2.toString()));
            dnz.a();
            ecx.name();
        }

        public final void b() {
            dnz.a();
        }

        public final void handleMessage(Message message) {
            a aVar = (a) message.obj;
            ecx ecx = ecx.values()[message.what];
            long currentTimeMillis = System.currentTimeMillis();
            try {
                aVar.execute();
                dnz.a();
                a(ecx.name(), true, currentTimeMillis);
            } catch (ecr e) {
                a(ecx.name(), false, currentTimeMillis);
                a(ecx, e);
            }
        }
    }

    /* renamed from: dvp$a */
    public interface a {
        void execute();
    }

    public dvp(eca eca, Context context, Supplier<Handler> supplier, gqr gqr) {
        this.a = eca;
        this.e = context;
        this.d = supplier;
        this.c = gqr;
    }

    public final Message a(int i, a aVar) {
        return a().obtainMessage(i, aVar);
    }

    public final synchronized b a() {
        if (!(this.f == null || this.f.isAlive())) {
            this.f = null;
            this.g = null;
        }
        if (this.f == null) {
            this.f = new c("CameraHandlerThread", -3);
            this.f.start();
        }
        if (this.g == null) {
            this.g = new b(this.a, this.f.getLooper(), this.e, this.d, this.c);
        }
        return this.g;
    }

    public final void a(ecx ecx, ecr ecr) {
        a().a(ecx, ecr);
    }

    public final void a(Runnable runnable) {
        a().removeCallbacks(runnable);
    }

    public final void a(Runnable runnable, long j) {
        a().postDelayed(runnable, j);
    }

    public final void a(boolean z) {
        a().a = z;
    }
}
