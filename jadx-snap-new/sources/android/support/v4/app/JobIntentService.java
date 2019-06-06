package android.support.v4.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.addlive.djinni.LogicError;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    private static Object h = new Object();
    private static HashMap<ComponentName, h> i = new HashMap();
    a a;
    boolean b = false;
    private b c;
    private h d;
    private boolean e = false;
    private boolean f = false;
    private ArrayList<d> g;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ Object doInBackground(Object[] objArr) {
            while (true) {
                e c = JobIntentService.this.c();
                if (c == null) {
                    return null;
                }
                JobIntentService jobIntentService = JobIntentService.this;
                c.a();
                jobIntentService.a();
                c.b();
            }
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onCancelled(Object obj) {
            JobIntentService.this.b();
        }

        /* Access modifiers changed, original: protected|final|synthetic */
        public final /* synthetic */ void onPostExecute(Object obj) {
            JobIntentService.this.b();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    interface e {
        Intent a();

        void b();
    }

    static abstract class h {
        final ComponentName a;
        private boolean b;
        private int c;

        h(ComponentName componentName) {
            this.a = componentName;
        }

        public void a() {
        }

        /* Access modifiers changed, original: final */
        public final void a(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                StringBuilder stringBuilder = new StringBuilder("Given job ID ");
                stringBuilder.append(i);
                stringBuilder.append(" is different than previous ");
                stringBuilder.append(this.c);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }

        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }
    }

    static final class c extends h {
        private final Context b;
        private final WakeLock c;
        private final WakeLock d;
        private boolean e;
        private boolean f;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.b = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":launch");
            this.c = powerManager.newWakeLock(1, stringBuilder.toString());
            this.c.setReferenceCounted(false);
            stringBuilder = new StringBuilder();
            stringBuilder.append(componentName.getClassName());
            stringBuilder.append(":run");
            this.d = powerManager.newWakeLock(1, stringBuilder.toString());
            this.d.setReferenceCounted(false);
        }

        public final void a() {
            synchronized (this) {
                this.e = false;
            }
        }

        /* Access modifiers changed, original: final */
        public final void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.b.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.e) {
                        this.e = true;
                        if (!this.f) {
                            this.c.acquire(60000);
                        }
                    }
                }
            }
        }

        public final void b() {
            synchronized (this) {
                if (!this.f) {
                    this.f = true;
                    this.d.acquire(600000);
                    this.c.release();
                }
            }
        }

        public final void c() {
            synchronized (this) {
                if (this.f) {
                    if (this.e) {
                        this.c.acquire(60000);
                    }
                    this.f = false;
                    this.d.release();
                }
            }
        }
    }

    final class d implements e {
        private Intent a;
        private int b;

        d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public final Intent a() {
            return this.a;
        }

        public final void b() {
            JobIntentService.this.stopSelf(this.b);
        }
    }

    static final class f extends JobServiceEngine implements b {
        final Object a = new Object();
        JobParameters b;
        private JobIntentService c;

        final class a implements e {
            private JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public final Intent a() {
                return this.a.getIntent();
            }

            public final void b() {
                synchronized (f.this.a) {
                    if (f.this.b != null) {
                        f.this.b.completeWork(this.a);
                    }
                }
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.c = jobIntentService;
        }

        public final IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Missing block: B:9:0x0011, code skipped:
            if (r1 == null) goto L_0x0026;
     */
        /* JADX WARNING: Missing block: B:10:0x0013, code skipped:
            r1.getIntent().setExtrasClassLoader(r3.c.getClassLoader());
     */
        /* JADX WARNING: Missing block: B:11:0x0025, code skipped:
            return new android.support.v4.app.JobIntentService.f.a(r3, r1);
     */
        /* JADX WARNING: Missing block: B:12:0x0026, code skipped:
            return null;
     */
        public final android.support.v4.app.JobIntentService.e b() {
            /*
            r3 = this;
            r0 = r3.a;
            monitor-enter(r0);
            r1 = r3.b;	 Catch:{ all -> 0x0027 }
            r2 = 0;
            if (r1 != 0) goto L_0x000a;
        L_0x0008:
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            return r2;
        L_0x000a:
            r1 = r3.b;	 Catch:{ all -> 0x0027 }
            r1 = r1.dequeueWork();	 Catch:{ all -> 0x0027 }
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0026;
        L_0x0013:
            r0 = r1.getIntent();
            r2 = r3.c;
            r2 = r2.getClassLoader();
            r0.setExtrasClassLoader(r2);
            r0 = new android.support.v4.app.JobIntentService$f$a;
            r0.<init>(r1);
            return r0;
        L_0x0026:
            return r2;
        L_0x0027:
            r1 = move-exception;
            monitor-exit(r0);	 Catch:{ all -> 0x0027 }
            throw r1;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.JobIntentService$f.b():android.support.v4.app.JobIntentService$e");
        }

        public final boolean onStartJob(JobParameters jobParameters) {
            this.b = jobParameters;
            this.c.a(false);
            return true;
        }

        public final boolean onStopJob(JobParameters jobParameters) {
            JobIntentService jobIntentService = this.c;
            if (jobIntentService.a != null) {
                jobIntentService.a.cancel(false);
            }
            jobIntentService.b = true;
            synchronized (this.a) {
                this.b = null;
            }
            return true;
        }
    }

    static final class g extends h {
        private final JobInfo b;
        private final JobScheduler c;

        g(Context context, ComponentName componentName, int i) {
            super(componentName);
            a(i);
            this.b = new Builder(i, this.a).setOverrideDeadline(0).build();
            this.c = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* Access modifiers changed, original: final */
        public final void a(Intent intent) {
            this.c.enqueue(this.b, new JobWorkItem(intent));
        }
    }

    public JobIntentService() {
        this.g = VERSION.SDK_INT >= 26 ? null : new ArrayList();
    }

    private static h a(Context context, ComponentName componentName, boolean z, int i) {
        h hVar = (h) i.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        g cVar;
        if (VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else if (z) {
            cVar = new g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        g gVar = cVar;
        i.put(componentName, gVar);
        return gVar;
    }

    public static void a(Context context, Class cls, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent != null) {
            synchronized (h) {
                h a = a(context, componentName, true, LogicError.INVALID_SCOPE);
                a.a((int) LogicError.INVALID_SCOPE);
                a.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public abstract void a();

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        if (this.a == null) {
            this.a = new a();
            h hVar = this.d;
            if (hVar != null && z) {
                hVar.b();
            }
            this.a.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* Access modifiers changed, original: final */
    public final void b() {
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.a = null;
                if (this.g != null && this.g.size() > 0) {
                    a(false);
                } else if (!this.f) {
                    this.d.c();
                }
            }
        }
    }

    /* Access modifiers changed, original: 0000 */
    public e c() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.g) {
            if (this.g.size() > 0) {
                e eVar = (e) this.g.remove(0);
                return eVar;
            }
            return null;
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.c;
        return bVar != null ? bVar.a() : null;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.c = new f(this);
            this.d = null;
            return;
        }
        this.c = null;
        this.d = a(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.g;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = true;
                this.d.c();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.g == null) {
            return 2;
        }
        this.d.a();
        synchronized (this.g) {
            ArrayList arrayList = this.g;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i2));
            a(true);
        }
        return 3;
    }
}
