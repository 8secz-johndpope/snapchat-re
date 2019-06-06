package defpackage;

import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: adqf */
public final class adqf extends Thread {
    final BlockingQueue<adqa> a = new ArrayBlockingQueue(1);
    final AtomicBoolean b = new AtomicBoolean(false);
    final Set<adpy> c = Sets.newCopyOnWriteArraySet();
    private final Set<adpx> d = Sets.newCopyOnWriteArraySet();

    public adqf() {
        setName("SecureChatSessionInputThread");
    }

    public final void a(adpx adpx) {
        this.d.add(adpx);
    }

    public final void b(adpx adpx) {
        this.d.remove(adpx);
    }

    public final void run() {
        this.b.set(false);
        while (!this.b.get()) {
            try {
                adqa adqa = (adqa) this.a.take();
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                while (true) {
                    aesm a = adqa.a();
                    if (a != null) {
                        for (adpx a2 : this.d) {
                            a2.a(a);
                        }
                    }
                }
            } catch (Exception unused) {
                for (adpy a3 : this.c) {
                    a3.a();
                }
            }
        }
    }
}
