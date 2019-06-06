package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abqr */
public final class abqr implements Runnable {
    public boolean a;
    public boolean b = false;
    private final Handler c = new Handler(Looper.getMainLooper());
    private boolean d = false;
    private long e;
    private long f;
    private long g;
    private float h = 1000.0f;
    private long i = 0;
    private long j = 0;
    private final List<a> k = new ArrayList();

    /* renamed from: abqr$a */
    public interface a {
        void a();

        void a(long j, float f);
    }

    private void a(float f) {
        f = abpf.a(f, (float) MapboxConstants.MINIMUM_ZOOM, 1.0f);
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            ((a) this.k.get(i)).a(this.e, f);
        }
    }

    public final long a(long j) {
        return (long) ((((float) j) * 1000.0f) / this.h);
    }

    public final void a() {
        this.i = SystemClock.elapsedRealtime();
        if (this.a) {
            this.d = true;
            return;
        }
        this.a = true;
        this.c.post(this);
    }

    public final void a(long j, long j2, long j3) {
        this.e = j;
        this.f = j2;
        this.g = j3;
        a(((float) j2) / ((float) j));
    }

    public final void a(a aVar) {
        this.k.add(aVar);
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            this.j = SystemClock.elapsedRealtime();
        }
    }

    public final void b(a aVar) {
        this.k.remove(aVar);
    }

    public final void c() {
        if (!this.a) {
            this.i = (SystemClock.elapsedRealtime() - this.j) + this.i;
            this.a = true;
            this.c.post(this);
        }
    }

    public final void run() {
        if (this.d) {
            this.a = true;
        }
        int i = 0;
        this.d = false;
        if (this.a) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.i;
            long a = a(this.e);
            long a2 = a(this.f);
            long a3 = a(this.g);
            float abs = a2 == a3 ? 1.0f : ((float) elapsedRealtime) / ((float) Math.abs(a2 - a3));
            a(((Math.min(1.0f, abs) * ((float) (a3 - a2))) + ((float) a2)) / ((float) a));
            if (abs >= 1.0f) {
                if (this.b) {
                    this.i = SystemClock.elapsedRealtime();
                } else {
                    this.i = 0;
                    this.j = 0;
                    this.a = false;
                    int size = this.k.size();
                    while (i < size) {
                        ((a) this.k.get(i)).a();
                        i++;
                    }
                    i = 1;
                }
            }
            if (i == 0 || this.d) {
                this.c.postDelayed(this, 16);
            }
        }
    }
}
