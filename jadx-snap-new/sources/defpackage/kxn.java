package defpackage;

import android.net.Uri;
import defpackage.dpu.b.a.c;
import defpackage.vso.i;
import defpackage.vso.j;
import defpackage.vso.k.a;
import defpackage.vso.m;

/* renamed from: kxn */
public final class kxn implements myv {
    final ajfb<dpz> a;
    final ajfb<dpu> b;
    final akbl<String, Uri> c;
    private final vpc d;

    /* renamed from: kxn$1 */
    static final class 1 extends akcq implements akbl<String, Uri> {
        public static final 1 a = new 1();

        1() {
            super(1);
        }

        public final String getName() {
            return "parse";
        }

        public final akej getOwner() {
            return akde.a(Uri.class);
        }

        public final String getSignature() {
            return "parse(Ljava/lang/String;)Landroid/net/Uri;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Uri.parse((String) obj);
        }
    }

    /* renamed from: kxn$b */
    static final class b<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ kxn a;

        b(kxn kxn) {
            this.a = kxn;
        }

        public final /* synthetic */ Object apply(Object obj) {
            vso vso = (vso) obj;
            akcr.b(vso, "event");
            if (vso instanceof a) {
                a aVar = (a) vso;
                return kxn.a(new dpz.a(aVar.c, (Uri) this.a.c.invoke(aVar.d)), this.a.a);
            } else if (vso instanceof m.a) {
                return kxn.a(new defpackage.dpu.b.a.a(((m.a) vso).b), this.a.b);
            } else {
                if (vso instanceof j) {
                    return kxn.a(new defpackage.dpu.b.a.a(((j) vso).b), this.a.b);
                }
                if (vso instanceof i.a) {
                    return kxn.a(c.a, this.a.b);
                }
                obj = ajvo.a(ajot.a);
                akcr.a(obj, "empty()");
                return obj;
            }
        }
    }

    /* renamed from: kxn$a */
    static final class a extends akcs implements akbk<ajej> {
        private /* synthetic */ Object a;
        private /* synthetic */ ajfb b;

        a(Object obj, ajfb ajfb) {
            this.a = obj;
            this.b = ajfb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return ajdp.b(this.a).f(this.b);
        }
    }

    public /* synthetic */ kxn(vpc vpc, ajfb ajfb, ajfb ajfb2) {
        this(vpc, ajfb, ajfb2, 1.a);
    }

    private kxn(vpc vpc, ajfb<dpz> ajfb, ajfb<dpu> ajfb2, akbl<? super String, ? extends Uri> akbl) {
        akcr.b(vpc, "scanCardsClient");
        akcr.b(ajfb, "scanSendToEventConsumer");
        akcr.b(ajfb2, "lensesCameraInteractor");
        akcr.b(akbl, "uriParser");
        this.d = vpc;
        this.a = ajfb;
        this.b = ajfb2;
        this.c = akbl;
    }

    static <T> ajdp<Object> a(T t, ajfb<T> ajfb) {
        return myu.a((akbk) new a(t, ajfb));
    }

    public final ajdp<Object> a(myv.a aVar) {
        akcr.b(aVar, "request");
        Object u = this.d.a(new vpb.c(aVar.a, 1)).u(new b(this));
        akcr.a(u, "scanCardsClient\n        …      }\n                }");
        return u;
    }
}
