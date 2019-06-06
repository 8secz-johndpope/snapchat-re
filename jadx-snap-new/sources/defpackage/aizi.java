package defpackage;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: aizi */
final class aizi implements ajah {
    static final Logger a = Logger.getLogger(aizo.class.getName());
    static final Set<String> f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"Socket closed"})));
    ajah b;
    Socket c;
    final a d;
    final AtomicLong e = new AtomicLong();
    private final aiyv g;

    /* renamed from: aizi$b */
    abstract class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(aizi aizi, byte b) {
            this();
        }

        public abstract void a();

        public final void run() {
            try {
                if (aizi.this.b != null) {
                    a();
                    return;
                }
                throw new IOException("Unable to perform write due to unavailable frameWriter.");
            } catch (Exception | RuntimeException e) {
                aizi.this.d.a(e);
            }
        }
    }

    /* renamed from: aizi$a */
    interface a {
        void a(Throwable th);
    }

    /* renamed from: aizi$6 */
    class 6 implements Runnable {
        6() {
        }

        public final void run() {
            if (aizi.this.b != null) {
                try {
                    aizi.this.b.close();
                    aizi.this.c.close();
                } catch (IOException e) {
                    Logger logger = aizi.a;
                    Level level = (e.getMessage() == null || !aizi.f.contains(e.getMessage())) ? Level.INFO : Level.FINE;
                    logger.log(level, "Failed closing connection", e);
                }
            }
        }
    }

    /* renamed from: aizi$1 */
    class 1 extends b {
        1() {
            super(aizi.this, (byte) 0);
        }

        public final void a() {
            aizi.this.b.a();
        }
    }

    public aizi(a aVar, aiyv aiyv) {
        this.d = aVar;
        this.g = aiyv;
    }

    public final void a() {
        this.g.execute(new 1());
    }

    public final void a(final int i, final long j) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(i, j);
            }
        });
    }

    public final void a(final int i, final ajaf ajaf) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(i, ajaf);
            }
        });
    }

    public final void a(final int i, final ajaf ajaf, final byte[] bArr) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(i, ajaf, bArr);
                aizi.this.b.b();
            }
        });
    }

    /* Access modifiers changed, original: final */
    public final void a(ajah ajah, Socket socket) {
        Preconditions.checkState(this.b == null, "AsyncFrameWriter's setFrameWriter() should only be called once.");
        this.b = (ajah) Preconditions.checkNotNull(ajah, "frameWriter");
        this.c = (Socket) Preconditions.checkNotNull(socket, "socket");
    }

    public final void a(final ajam ajam) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(ajam);
            }
        });
    }

    public final void a(final boolean z, final int i, final int i2) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(z, i, i2);
            }
        });
    }

    public final void a(boolean z, int i, akkd akkd, int i2) {
        final boolean z2 = z;
        final int i3 = i;
        final akkd akkd2 = akkd;
        final int i4 = i2;
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(z2, i3, akkd2, i4);
            }
        });
    }

    public final void a(boolean z, boolean z2, int i, int i2, List<ajai> list) {
        final boolean z3 = z;
        final boolean z4 = z2;
        final int i3 = i;
        final int i4 = i2;
        final List<ajai> list2 = list;
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.a(z3, z4, i3, i4, list2);
            }
        });
    }

    public final void b() {
        final long incrementAndGet = this.e.incrementAndGet();
        this.g.execute(new b() {
            public final void a() {
                if (aizi.this.e.get() == incrementAndGet) {
                    aizi.this.b.b();
                }
            }
        });
    }

    public final void b(final ajam ajam) {
        this.g.execute(new b() {
            public final void a() {
                aizi.this.b.b(ajam);
            }
        });
    }

    public final int c() {
        ajah ajah = this.b;
        return ajah == null ? 16384 : ajah.c();
    }

    public final void close() {
        this.g.execute(new 6());
    }
}
