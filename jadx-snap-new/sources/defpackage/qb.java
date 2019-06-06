package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters.a;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: qb */
public final class qb implements pz {
    private static final String a = pq.a("Processor");
    private Context b;
    private pl c;
    private so d;
    private WorkDatabase e;
    private Map<String, qi> f = new HashMap();
    private List<qc> g;
    private Set<String> h;
    private final List<pz> i;
    private final Object j;

    /* renamed from: qb$a */
    static class a implements Runnable {
        private pz a;
        private String b;
        private ListenableFuture<Boolean> c;

        a(pz pzVar, String str, ListenableFuture<Boolean> listenableFuture) {
            this.a = pzVar;
            this.b = str;
            this.c = listenableFuture;
        }

        public final void run() {
            boolean booleanValue;
            try {
                booleanValue = ((Boolean) this.c.get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                booleanValue = true;
            }
            this.a.a(this.b, booleanValue);
        }
    }

    public qb(Context context, pl plVar, so soVar, WorkDatabase workDatabase, List<qc> list) {
        this.b = context;
        this.c = plVar;
        this.d = soVar;
        this.e = workDatabase;
        this.g = list;
        this.h = new HashSet();
        this.i = new ArrayList();
        this.j = new Object();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x004c in {6, 8, 11} preds:[]
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
    public final void a(java.lang.String r9, boolean r10) {
        /*
        r8 = this;
        r0 = r8.j;
        monitor-enter(r0);
        r1 = r8.f;	 Catch:{ all -> 0x0049 }
        r1.remove(r9);	 Catch:{ all -> 0x0049 }
        r1 = defpackage.pq.a();	 Catch:{ all -> 0x0049 }
        r2 = a;	 Catch:{ all -> 0x0049 }
        r3 = "%s %s executed; reschedule = %s";	 Catch:{ all -> 0x0049 }
        r4 = 3;	 Catch:{ all -> 0x0049 }
        r4 = new java.lang.Object[r4];	 Catch:{ all -> 0x0049 }
        r5 = r8.getClass();	 Catch:{ all -> 0x0049 }
        r5 = r5.getSimpleName();	 Catch:{ all -> 0x0049 }
        r6 = 0;	 Catch:{ all -> 0x0049 }
        r4[r6] = r5;	 Catch:{ all -> 0x0049 }
        r5 = 1;	 Catch:{ all -> 0x0049 }
        r4[r5] = r9;	 Catch:{ all -> 0x0049 }
        r5 = 2;	 Catch:{ all -> 0x0049 }
        r7 = java.lang.Boolean.valueOf(r10);	 Catch:{ all -> 0x0049 }
        r4[r5] = r7;	 Catch:{ all -> 0x0049 }
        r3 = java.lang.String.format(r3, r4);	 Catch:{ all -> 0x0049 }
        r4 = new java.lang.Throwable[r6];	 Catch:{ all -> 0x0049 }
        r1.a(r2, r3, r4);	 Catch:{ all -> 0x0049 }
        r1 = r8.i;	 Catch:{ all -> 0x0049 }
        r1 = r1.iterator();	 Catch:{ all -> 0x0049 }
        r2 = r1.hasNext();	 Catch:{ all -> 0x0049 }
        if (r2 == 0) goto L_0x0047;	 Catch:{ all -> 0x0049 }
        r2 = r1.next();	 Catch:{ all -> 0x0049 }
        r2 = (defpackage.pz) r2;	 Catch:{ all -> 0x0049 }
        r2.a(r9, r10);	 Catch:{ all -> 0x0049 }
        goto L_0x0037;	 Catch:{ all -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        return;	 Catch:{ all -> 0x0049 }
        r9 = move-exception;	 Catch:{ all -> 0x0049 }
        monitor-exit(r0);	 Catch:{ all -> 0x0049 }
        throw r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb.a(java.lang.String, boolean):void");
    }

    public final void a(pz pzVar) {
        synchronized (this.j) {
            this.i.add(pzVar);
        }
    }

    public final boolean a(String str) {
        synchronized (this.j) {
            pq.a().a(a, String.format("Processor stopping %s", new Object[]{str}), new Throwable[0]);
            qi qiVar = (qi) this.f.remove(str);
            if (qiVar != null) {
                qiVar.b();
                pq.a().a(a, String.format("WorkerWrapper stopped for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            pq.a().a(a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public final boolean a(String str, a aVar) {
        synchronized (this.j) {
            if (this.f.containsKey(str)) {
                pq.a().a(a, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            qi.a aVar2 = new qi.a(this.b, this.c, this.d, this.e, str);
            aVar2.f = this.g;
            if (aVar != null) {
                aVar2.g = aVar;
            }
            qi qiVar = new qi(aVar2);
            sn snVar = qiVar.e;
            snVar.addListener(new a(this, str, snVar), this.d.a());
            this.f.put(str, qiVar);
            this.d.c().execute(qiVar);
            pq.a().a(a, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    public final void b(pz pzVar) {
        synchronized (this.j) {
            this.i.remove(pzVar);
        }
    }

    public final boolean b(String str) {
        synchronized (this.j) {
            pq.a().a(a, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.h.add(str);
            qi qiVar = (qi) this.f.remove(str);
            if (qiVar != null) {
                qiVar.b();
                pq.a().a(a, String.format("WorkerWrapper cancelled for %s", new Object[]{str}), new Throwable[0]);
                return true;
            }
            pq.a().a(a, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
            return false;
        }
    }

    public final boolean c(String str) {
        boolean contains;
        synchronized (this.j) {
            contains = this.h.contains(str);
        }
        return contains;
    }

    public final boolean d(String str) {
        boolean containsKey;
        synchronized (this.j) {
            containsKey = this.f.containsKey(str);
        }
        return containsKey;
    }
}
