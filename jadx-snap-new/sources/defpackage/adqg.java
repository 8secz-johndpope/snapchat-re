package defpackage;

import com.google.common.collect.Sets;
import com.mapbox.mapboxsdk.style.sources.RasterSource;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: adqg */
public final class adqg extends Thread {
    final adqd a;
    final ArrayBlockingQueue<aesm> b = new ArrayBlockingQueue(RasterSource.DEFAULT_TILE_SIZE);
    final BlockingQueue<adqb> c = new ArrayBlockingQueue(1);
    final AtomicBoolean d = new AtomicBoolean(false);
    final AtomicReference<a> e = new AtomicReference(a.AWAITING_CONNECTION);
    final Set<adpy> f = Sets.newCopyOnWriteArraySet();

    /* renamed from: adqg$a */
    enum a {
        AWAITING_CONNECTION,
        CONNECTED
    }

    public adqg(adqd adqd) {
        setName("SecureChatSessionOutputThread");
        this.a = adqd;
    }

    public final void run() {
        this.d.set(false);
        while (!this.d.get()) {
            aesm aesm;
            try {
                adqb adqb = (adqb) this.c.take();
                this.e.set(a.CONNECTED);
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                while (true) {
                    aesm = (aesm) this.b.take();
                    adqd adqd = this.a;
                    adqk adqk = (adqk) adqd.a.get(aesm.p);
                    Object obj = 1;
                    if (adqk == null || adqk.b != 1) {
                        obj = null;
                    }
                    if (obj != null) {
                        adqd = this.a;
                        adqk = (adqk) adqd.a.get(aesm.p);
                        if (adqk != null) {
                            adqk.b = 2;
                        }
                        adqb.a(aesm);
                        this.a.a(aesm.p);
                    }
                }
            } catch (IOException e) {
                this.a.a(aesm.p, psd.ERROR, e.getMessage());
                throw e;
            } catch (Exception unused) {
                for (adpy a : this.f) {
                    a.a();
                }
                this.e.set(a.AWAITING_CONNECTION);
            }
        }
    }
}
