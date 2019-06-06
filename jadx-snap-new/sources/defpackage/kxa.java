package defpackage;

import com.brightcove.player.event.Event;
import defpackage.czn.b;
import java.io.Closeable;

/* renamed from: kxa */
public final class kxa implements akbl<mji, ajcx> {
    final czq<byte[]> a;

    /* renamed from: kxa$a */
    static final class a implements ajda {
        final /* synthetic */ mji a;
        private /* synthetic */ kxa b;

        /* renamed from: kxa$a$a */
        public static final class a implements czo<byte[]> {
            private /* synthetic */ a a;

            a(a aVar) {
                this.a = aVar;
            }

            public final /* synthetic */ void a(Object obj, int i, czn czn) {
                byte[] bArr = (byte[]) obj;
                akcr.b(bArr, "audioData");
                akcr.b(czn, "audioFormat");
                if (czn.a == b.PCM_16) {
                    defpackage.mji.a a = mjj.a(bArr, i, czn.b, czn.c, czn.d);
                    try {
                        this.a.a.a().a(a);
                    } finally {
                        a.f();
                    }
                }
            }
        }

        a(kxa kxa, mji mji) {
            this.b = kxa;
            this.a = mji;
        }

        public final void subscribe(ajcy ajcy) {
            akcr.b(ajcy, Event.EMITTER);
            if (!ajcy.isDisposed()) {
                ajcy.a(ajek.a((ajev) new kxb(new akbk<ajxw>(this.b.a.a(new a(this))) {
                    public final String getName() {
                        return "close";
                    }

                    public final akej getOwner() {
                        return akde.a(Closeable.class);
                    }

                    public final String getSignature() {
                        return "close()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        ((Closeable) this.receiver).close();
                        return ajxw.a;
                    }
                })));
            }
        }
    }

    public kxa(czq<byte[]> czq) {
        akcr.b(czq, "audioSource");
        this.a = czq;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        mji mji = (mji) obj;
        akcr.b(mji, "audioProcessor");
        obj = ajcx.a((ajda) new a(this, mji));
        akcr.a(obj, "Completable.create { emi…chment::close))\n        }");
        return obj;
    }
}
