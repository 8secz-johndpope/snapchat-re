package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qws */
public final class qws {
    public final ConcurrentHashMap<UUID, qwu> a = new ConcurrentHashMap();
    public AtomicInteger b = new AtomicInteger();
    public final ConcurrentHashMap<String, Integer> c = new ConcurrentHashMap();
    public final Set<String> d = Sets.newConcurrentHashSet();
    public AtomicBoolean e = new AtomicBoolean(false);
    public final Context f;
    private final qwr g;

    public qws(Context context, qwr qwr) {
        akcr.b(context, "context");
        akcr.b(qwr, "notificationUpdater");
        this.f = context;
        this.g = qwr;
    }

    private void a(UUID uuid, long j, long j2, boolean z) {
        akcr.b(uuid, "uuid");
        if (this.b.get() > 0) {
            Object values = this.c.values();
            akcr.a(values, "jobsInProgressWithMediaCount.values");
            int w = ajyu.w((Iterable) values);
            if (z) {
                qwu qwu = (qwu) this.a.get(uuid);
                if (qwu != null) {
                    qwu.c = true;
                    qwu.a = qwu.b;
                    this.g.a(this.a, this.b, uuid, w);
                    return;
                }
            }
            qwu qwu2 = (qwu) this.a.get(uuid);
            if (qwu2 == null) {
                this.a.put(uuid, new qwu(j, j2, z));
            } else {
                qwu2.a = Math.max(j, qwu2.a);
            }
            this.g.a(this.a, this.b, uuid, w);
        }
    }

    public static /* synthetic */ void a(qws qws, UUID uuid, long j, long j2, boolean z, int i) {
        qws.a(uuid, (i & 2) != 0 ? 0 : j, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? false : z);
    }

    public final void a(Intent intent) {
        if (VERSION.SDK_INT < 26) {
            this.f.startService(intent);
        } else if (this.e.get()) {
            this.f.startForegroundService(intent);
        } else {
            this.f.startService(intent);
        }
    }
}
