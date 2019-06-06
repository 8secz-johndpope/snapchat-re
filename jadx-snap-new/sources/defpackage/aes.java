package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aes */
final class aes {
    final ys a;
    final List<b> b;
    final yn c;
    boolean d;
    a e;
    boolean f;
    a g;
    Bitmap h;
    a i;
    private final Handler j;
    private final abg k;
    private boolean l;
    private ym<Bitmap> m;
    private zi<Bitmap> n;

    /* renamed from: aes$b */
    public interface b {
        void c();
    }

    /* renamed from: aes$c */
    class c implements Callback {
        c() {
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                aes.this.a((a) message.obj);
                return true;
            }
            if (message.what == 2) {
                aes.this.c.a((a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: aes$a */
    static class a extends agp<Bitmap> {
        final int a;
        Bitmap b;
        private final Handler c;
        private final long d;

        a(Handler handler, int i, long j) {
            this.c = handler;
            this.a = i;
            this.d = j;
        }

        public final /* synthetic */ void a(Object obj, agy agy) {
            this.b = (Bitmap) obj;
            this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
        }
    }

    private aes(abg abg, yn ynVar, ys ysVar, ym<Bitmap> ymVar, zi<Bitmap> ziVar, Bitmap bitmap) {
        this.b = new ArrayList();
        this.c = ynVar;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.k = abg;
        this.j = handler;
        this.m = ymVar;
        this.a = ysVar;
        a(ziVar, bitmap);
    }

    aes(yh yhVar, ys ysVar, int i, int i2, zi<Bitmap> ziVar, Bitmap bitmap) {
        this(yhVar.a, yh.b(yhVar.b.getBaseContext()), ysVar, yh.b(yhVar.b.getBaseContext()).d().b(((agi) ((agi) agi.b(aal.a).a(true)).b(true)).a(i, i2)), (zi) ziVar, bitmap);
    }

    private void d() {
        if (!this.d) {
            this.d = true;
            this.f = false;
            e();
        }
    }

    private void e() {
        if (this.d && !this.l) {
            a aVar = this.i;
            if (aVar != null) {
                this.i = null;
                a(aVar);
                return;
            }
            this.l = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.a.c());
            this.a.b();
            this.g = new a(this.j, this.a.e(), uptimeMillis);
            this.m.b(agi.b(aes.f())).a(this.a).a(this.g);
        }
    }

    private static zd f() {
        return new ahb(Double.valueOf(Math.random()));
    }

    /* Access modifiers changed, original: final */
    public final int a() {
        return this.a.d();
    }

    /* Access modifiers changed, original: final */
    public final void a(a aVar) {
        this.l = false;
        if (this.f) {
            this.j.obtainMessage(2, aVar).sendToTarget();
        } else if (this.d) {
            if (aVar.b != null) {
                c();
                a aVar2 = this.e;
                this.e = aVar;
                for (int size = this.b.size() - 1; size >= 0; size--) {
                    ((b) this.b.get(size)).c();
                }
                if (aVar2 != null) {
                    this.j.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            e();
        } else {
            this.i = aVar;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(b bVar) {
        if (this.f) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        } else if (this.b.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        } else {
            boolean isEmpty = this.b.isEmpty();
            this.b.add(bVar);
            if (isEmpty) {
                d();
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(zi<Bitmap> ziVar, Bitmap bitmap) {
        String str = "Argument must not be null";
        this.n = (zi) ahl.a((Object) ziVar, str);
        this.h = (Bitmap) ahl.a((Object) bitmap, str);
        this.m = this.m.b(new agi().a((zi) ziVar));
    }

    /* Access modifiers changed, original: final */
    public final Bitmap b() {
        a aVar = this.e;
        return aVar != null ? aVar.b : this.h;
    }

    /* Access modifiers changed, original: final */
    public final void b(b bVar) {
        this.b.remove(bVar);
        if (this.b.isEmpty()) {
            this.d = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        Bitmap bitmap = this.h;
        if (bitmap != null) {
            this.k.a(bitmap);
            this.h = null;
        }
    }
}
