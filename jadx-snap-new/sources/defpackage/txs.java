package defpackage;

import android.text.TextUtils;
import com.google.common.base.Preconditions;
import com.looksery.sdk.LSAudioChainWrapper;
import com.snapchat.android.framework.misc.AppContext;
import defpackage.acak.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: txs */
public final class txs implements adfh {
    static final String e = e;
    final ReentrantLock a = new ReentrantLock();
    public final AtomicReference<a> b = new AtomicReference();
    a c = a.NO_EFFECT;
    volatile LSAudioChainWrapper d;
    private Integer f;
    private final ofe g;

    /* renamed from: txs$b */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: txs$a */
    static abstract class a implements Runnable {
        boolean a;
    }

    /* renamed from: txs$c */
    public static final class c extends a {
        private /* synthetic */ txs b;
        private /* synthetic */ a c;

        c(txs txs, a aVar) {
            this.b = txs;
            this.c = aVar;
        }

        public final void run() {
            this.b.a.lock();
            try {
                this.b.c = this.c;
                if (!(txs.a(this.b.c) && this.b.c(this.b.c))) {
                    LSAudioChainWrapper lSAudioChainWrapper = this.b.d;
                    if (lSAudioChainWrapper != null) {
                        lSAudioChainWrapper.applyEffect(txs.e);
                    }
                }
                this.b.a.unlock();
            } catch (Throwable th) {
                this.b.a.unlock();
            }
        }
    }

    static {
        b bVar = new b();
    }

    public txs(ofe ofe) {
        akcr.b(ofe, "soundToolTypeResourceProvider");
        this.g = ofe;
    }

    static boolean a(a aVar) {
        return (aVar == a.NO_EFFECT || aVar == a.MUTED) ? false : true;
    }

    private final void b() {
        if (this.d == null) {
            this.a.lock();
            try {
                if (this.d == null) {
                    if (this.f == null) {
                        this.f = Integer.valueOf(44100);
                    }
                    Integer num = this.f;
                    if (num != null) {
                        this.d = new LSAudioChainWrapper(AppContext.get(), num.intValue());
                    }
                }
                this.a.unlock();
            } catch (Throwable th) {
                this.a.unlock();
            }
        }
    }

    public final void a() {
        if (this.d != null) {
            this.a.lock();
            try {
                if (this.d != null) {
                    LSAudioChainWrapper lSAudioChainWrapper = this.d;
                    if (lSAudioChainWrapper != null) {
                        lSAudioChainWrapper.release();
                    }
                    this.d = null;
                }
                this.a.unlock();
            } catch (Throwable th) {
                this.a.unlock();
            }
        }
    }

    public final void a(int i) {
        Preconditions.checkArgument(true);
        this.f = Integer.valueOf(i);
        if (txs.a(this.c)) {
            b();
            b(this.c).run();
        }
    }

    public final void a(byte[] bArr, int i) {
        akcr.b(bArr, "pcm16AudioData");
        a aVar = (a) this.b.getAndSet(null);
        if (aVar != null) {
            if (aVar.a) {
                b();
            }
            if (this.d != null) {
                aVar.run();
            }
        }
        if (txs.a(this.c)) {
            LSAudioChainWrapper lSAudioChainWrapper = this.d;
            if (lSAudioChainWrapper != null) {
                lSAudioChainWrapper.processPcm16(bArr, i);
            }
        }
    }

    public final a b(a aVar) {
        c cVar = new c(this, aVar);
        cVar.a = txs.a(aVar);
        return cVar;
    }

    /* Access modifiers changed, original: final */
    public final boolean c(a aVar) {
        String a = ofe.a(aVar);
        if (!TextUtils.isEmpty(a)) {
            LSAudioChainWrapper lSAudioChainWrapper = this.d;
            if (!(lSAudioChainWrapper == null || a == null || !lSAudioChainWrapper.applyEffect(a))) {
                return true;
            }
        }
        return false;
    }
}
