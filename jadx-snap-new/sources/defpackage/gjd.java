package defpackage;

import defpackage.gdx.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: gjd */
public final class gjd implements b {
    private final ygm.b<ygk, ygh> a;
    private final LinkedList<Closeable> b;
    private volatile boolean c;
    private int d;
    private final yes.b e;
    private final String f;
    private final long g;
    private final akbk<yeu> h;
    private final akbk<ygm.b<ygk, ygh>> i;
    private final ihh j;

    /* renamed from: gjd$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        a aVar = new a();
    }

    public gjd(yes.b bVar, String str, long j, akbk<? extends yeu> akbk, akbk<? extends ygm.b<ygk, ygh>> akbk2) {
        akcr.b(str, "key");
        akcr.b(akbk, "snapshotCreator");
        akcr.b(akbk2, "leaseCreator");
        this(bVar, str, j, akbk, akbk2, new ihl());
    }

    private gjd(yes.b bVar, String str, long j, akbk<? extends yeu> akbk, akbk<? extends ygm.b<ygk, ygh>> akbk2, ihh ihh) {
        akcr.b(str, "key");
        akcr.b(akbk, "snapshotCreator");
        akcr.b(akbk2, "leaseCreator");
        akcr.b(ihh, "clock");
        this.e = bVar;
        this.f = str;
        this.g = j;
        this.h = akbk;
        this.i = akbk2;
        this.j = ihh;
        this.a = (ygm.b) this.i.invoke();
        this.b = new LinkedList();
    }

    private final void a(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            try {
                ((Closeable) it.next()).close();
            } catch (IOException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        this.b.clear();
    }

    public final OutputStream a() {
        StringBuilder stringBuilder;
        if (this.c) {
            stringBuilder = new StringBuilder("Controller is closed for ");
            stringBuilder.append(this.f);
            throw new IllegalStateException(stringBuilder.toString());
        }
        yes.b bVar = this.e;
        if (bVar != null) {
            int i = this.d;
            this.d = i + 1;
            Object a = gij.a(abrg.a((OutputStream) bVar.a(i)), this.b);
            akcr.a(a, "Files.openBufferedOutput…++)).addTo(outputStreams)");
            return (OutputStream) a;
        }
        stringBuilder = new StringBuilder("Unable to create editor for ");
        stringBuilder.append(this.f);
        throw new IOException(stringBuilder.toString());
    }

    public final gez b() {
        try {
            StringBuilder stringBuilder;
            if (this.e != null) {
                gez gez = 0;
                if (this.g > gez) {
                    this.e.a(this.j.a() + this.g);
                }
                a(false);
                this.e.e();
                this.c = true;
                ygm.b bVar = (ygm.b) this.i.invoke();
                yeu yeu = (yeu) this.h.invoke();
                if (yeu != null) {
                    gez = new gje(yeu, bVar, this.h, this.i);
                    return gez;
                }
                bVar.a();
                stringBuilder = new StringBuilder("Failed to create entry snapshot for ");
                stringBuilder.append(this.f);
                throw new IOException(stringBuilder.toString());
            }
            stringBuilder = new StringBuilder("Unable to access editor for ");
            stringBuilder.append(this.f);
            throw new IOException(stringBuilder.toString());
        } finally {
            this.a.a();
        }
    }

    public final void c() {
        if (!this.c) {
            this.c = true;
            a(true);
            yes.b bVar = this.e;
            if (bVar != null) {
                bVar.h();
            }
            this.a.a();
        }
    }
}
