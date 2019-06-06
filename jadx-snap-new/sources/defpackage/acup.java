package defpackage;

import android.os.SystemClock;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import defpackage.acuk.a;
import defpackage.cgh.b;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: acup */
public final class acup {
    final a[] a;
    public final String b;
    public final String c;
    long d;
    long e;
    public long f;
    boolean g;
    public cgh h;
    b i;
    public b j;
    final ReentrantLock k = new ReentrantLock();

    /* renamed from: acup$a */
    public interface a {
        Object a(cgi cgi, float f, float f2);

        void a();

        void a(acmj acmj, b bVar);

        String b();

        boolean c();
    }

    /* renamed from: acup$b */
    public static class b {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final cgi e = new cgn();
        public final cgi f = new cgn();
        public boolean g;

        public b(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.d = f3;
            this.c = f / f2;
        }
    }

    /* renamed from: acup$1 */
    public class 1 implements b {
        private /* synthetic */ adbv a;
        private /* synthetic */ acyc b;

        public 1(adbv adbv, acyc acyc) {
            this.a = adbv;
            this.b = acyc;
        }

        public final void a() {
            int i = 0;
            acup.this.g = false;
            Throwable e;
            try {
                acmj j = this.a.j();
                cgj a = this.a.d.a();
                if (!(j == null || a == null)) {
                    if (this.a.e()) {
                        float c = j.c();
                        float d = j.d();
                        if (c != MapboxConstants.MINIMUM_ZOOM) {
                            if (d != MapboxConstants.MINIMUM_ZOOM) {
                                if (acup.this.i == null) {
                                    acup.this.i = new b(c, d, this.a.b.density);
                                }
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                b bVar = acup.this.i;
                                bVar.e.setLatitude(a.getLatNorth());
                                bVar.e.setLongitude(a.getLonEast());
                                bVar.f.setLatitude(a.getLatSouth());
                                bVar.f.setLongitude(a.getLonWest());
                                bVar.g = false;
                                acuk.a();
                                acyc acyc = this.b;
                                float i2 = (float) j.i();
                                if (acyc.a == null || Float.compare(i2, acyc.b) != 0) {
                                    acyc.b = i2;
                                    acyc.a = acyc.a(i2);
                                }
                                a[] aVarArr = acup.this.a;
                                int length = aVarArr.length;
                                while (i < length) {
                                    a aVar = aVarArr[i];
                                    if (aVar.c()) {
                                        SystemClock.elapsedRealtime();
                                        acup.this.k.lock();
                                        aVar.a(j, acup.this.i);
                                        acup.this.k.unlock();
                                        aVar.b();
                                        acuk.a();
                                        SystemClock.elapsedRealtime();
                                        aVar.b();
                                        acuk.a();
                                    }
                                    i++;
                                }
                                if (acup.this.i.g) {
                                    this.a.m();
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                acup.this.d += currentTimeMillis - elapsedRealtime;
                                acup acup = acup.this;
                                acup.e++;
                                acup = acup.this;
                                acup.f++;
                                e = null;
                                if (e != null) {
                                    acmu o = this.a.o();
                                    if (o != null) {
                                        o.a("Failed to update renderer.", e);
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (a | Exception e2) {
                e = e2;
            } catch (Throwable th) {
                acup.this.k.unlock();
            }
        }

        public final void b() {
            if (!acup.this.g) {
                acup acup = acup.this;
                acup.g = true;
                try {
                    for (a aVar : acup.a) {
                        acup.this.k.lock();
                        aVar.a();
                        acup.this.k.unlock();
                    }
                } catch (Exception e) {
                    acmu o = this.a.o();
                    if (o != null) {
                        o.a("Failed to complete renderer", e);
                    }
                } catch (Throwable th) {
                    acup.this.k.unlock();
                }
                acup.this.f = 0;
            }
        }
    }

    public acup(String str, String str2, a... aVarArr) {
        this.a = aVarArr;
        this.b = str2;
        this.c = str;
    }

    public final Object a(cgi cgi, float f, float f2, int i) {
        i = this.a.length - 1;
        while (i >= 0) {
            this.k.lock();
            try {
                Object a = this.a[i].a(cgi, f, f2);
                if (a != null) {
                    this.k.unlock();
                    return a;
                }
                this.k.unlock();
                i--;
            } catch (Throwable th) {
                this.k.unlock();
                throw th;
            }
        }
        return null;
    }
}
