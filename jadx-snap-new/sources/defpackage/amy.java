package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import defpackage.aib.a.a;
import java.security.MessageDigest;
import java.util.Random;
import java.util.UUID;

/* renamed from: amy */
final class amy {
    static final Random a = new Random();
    final b b;
    final Handler c;
    boolean d;
    boolean e;
    aht<aif, aif, Bitmap, Bitmap> f;
    a g;
    boolean h;
    private final aif i;

    /* renamed from: amy$b */
    public interface b {
        void b(int i);
    }

    /* renamed from: amy$c */
    class c implements Callback {
        private c() {
        }

        /* synthetic */ c(amy amy, byte b) {
            this();
        }

        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                a aVar = (a) message.obj;
                amy amy = amy.this;
                if (amy.h) {
                    amy.c.obtainMessage(2, aVar).sendToTarget();
                } else {
                    a aVar2 = amy.g;
                    amy.g = aVar;
                    amy.b.b(aVar.a);
                    if (aVar2 != null) {
                        amy.c.obtainMessage(2, aVar2).sendToTarget();
                    }
                    amy.e = false;
                    amy.c();
                }
                return true;
            }
            if (message.what == 2) {
                ahx.a((a) message.obj);
            }
            return false;
        }
    }

    /* renamed from: amy$d */
    static class d implements aio {
        private final UUID a;

        public d() {
            this(new UUID(amy.a.nextLong(), amy.a.nextLong()));
        }

        private d(UUID uuid) {
            this.a = uuid;
        }

        public final void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        public final boolean equals(Object obj) {
            return obj instanceof d ? ((d) obj).a.equals(this.a) : false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: amy$a */
    static class a extends apf<Bitmap> {
        final int a;
        Bitmap b;
        private final Handler c;
        private final long d;

        public a(Handler handler, int i, long j) {
            this.c = handler;
            this.a = i;
            this.d = j;
        }

        public final /* synthetic */ void a(Object obj, aou aou) {
            this.b = (Bitmap) obj;
            this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.d);
        }
    }

    private amy(b bVar, aif aif, aht<aif, aif, Bitmap, Bitmap> aht) {
        this.d = false;
        this.e = false;
        Handler handler = new Handler(Looper.getMainLooper(), new c(this, (byte) 0));
        this.b = bVar;
        this.i = aif;
        this.c = handler;
        this.f = aht;
    }

    public amy(Context context, b bVar, aif aif, int i, int i2) {
        aiq ana = new ana(ahx.a(context).d);
        amz amz = new amz();
        this(bVar, aif, new a((Object) aif).a(Bitmap.class).a((ain) alq.a).b(ana).a(true).a(ajd.NONE).b(i, i2));
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            this.h = false;
            c();
        }
    }

    public final void b() {
        this.d = false;
        api api = this.g;
        if (api != null) {
            ahx.a(api);
            this.g = null;
        }
        this.h = true;
    }

    /* Access modifiers changed, original: final */
    public final void c() {
        if (this.d && !this.e) {
            this.e = true;
            long uptimeMillis = SystemClock.uptimeMillis() + ((long) this.i.b());
            this.i.a();
            this.f.a(new d()).a(new a(this.c, this.i.d, uptimeMillis));
        }
    }
}
