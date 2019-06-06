package defpackage;

import com.google.protobuf.nano.Empty;
import com.google.protobuf.nano.MessageNano;
import defpackage.aivm.a;
import defpackage.aivm.c;

/* renamed from: acej */
public final class acej {
    private static volatile aivm<aceg, Empty> a;
    private static volatile aivm<acem, acen> b;
    private static volatile aivm<aces, acet> c;
    private static volatile aivm<acfa, acfb> d;
    private static volatile aivm<acfc, acfd> e;
    private static volatile aivm<acfe, acff> f;
    private static volatile aivm<acfx, acfy> g;
    private static volatile aivm<acfv, acfw> h;
    private static volatile aivm<acfn, acfo> i;
    private static volatile aivm<acft, acfu> j;
    private static volatile aivm<acfl, acfm> k;
    private static volatile aivm<acfg, acfh> l;
    private static volatile aivm<acgf, Empty> m;
    private static volatile aivm<acfr, acfs> n;
    private static volatile aivm<acfp, acfq> o;
    private static volatile aivm<acgk, acgl> p;

    /* renamed from: acej$a */
    public static final class a extends ajar<a> {
        private a(aiug aiug) {
            super(aiug);
        }

        private a(aiug aiug, aiuf aiuf) {
            super(aiug, aiuf);
        }

        public final acfy a(acfx acfx) {
            return (acfy) ajas.a(this.a, acej.a(), this.b, acfx);
        }

        public final /* synthetic */ ajar a(aiug aiug, aiuf aiuf) {
            return new a(aiug, aiuf);
        }
    }

    /* renamed from: acej$b */
    static final class b<T extends MessageNano> implements ajao<T> {
        private final int a;

        b(int i) {
            this.a = i;
        }

        public final T a() {
            acgl aceg;
            switch (this.a) {
                case 0:
                    aceg = new aceg();
                    break;
                case 1:
                    aceg = new Empty();
                    break;
                case 2:
                    aceg = new acem();
                    break;
                case 3:
                    aceg = new acen();
                    break;
                case 4:
                    aceg = new aces();
                    break;
                case 5:
                    aceg = new acet();
                    break;
                case 6:
                    aceg = new acfa();
                    break;
                case 7:
                    aceg = new acfb();
                    break;
                case 8:
                    aceg = new acfc();
                    break;
                case 9:
                    aceg = new acfd();
                    break;
                case 10:
                    aceg = new acfe();
                    break;
                case 11:
                    aceg = new acff();
                    break;
                case 12:
                    aceg = new acfx();
                    break;
                case 13:
                    aceg = new acfy();
                    break;
                case 14:
                    aceg = new acfv();
                    break;
                case 15:
                    aceg = new acfw();
                    break;
                case 16:
                    aceg = new acfn();
                    break;
                case 17:
                    aceg = new acfo();
                    break;
                case 18:
                    aceg = new acft();
                    break;
                case 19:
                    aceg = new acfu();
                    break;
                case 20:
                    aceg = new acfl();
                    break;
                case 21:
                    aceg = new acfm();
                    break;
                case 22:
                    aceg = new acfg();
                    break;
                case 23:
                    aceg = new acfh();
                    break;
                case 24:
                    aceg = new acgf();
                    break;
                case 25:
                    aceg = new Empty();
                    break;
                case 26:
                    aceg = new acfr();
                    break;
                case 27:
                    aceg = new acfs();
                    break;
                case 28:
                    aceg = new acfp();
                    break;
                case 29:
                    aceg = new acfq();
                    break;
                case 30:
                    aceg = new acgk();
                    break;
                case 31:
                    aceg = new acgl();
                    break;
                default:
                    throw new AssertionError();
            }
            return aceg;
        }
    }

    static {
        acej.b();
        acej.c();
        acej.d();
        acej.e();
        acej.f();
        acej.g();
        acej.a();
        acej.h();
        acej.i();
        acej.j();
        acej.k();
        acej.l();
        acej.m();
        acej.n();
        acej.o();
        acej.p();
    }

    private acej() {
    }

    public static aivm<acfx, acfy> a() {
        aivm<acfx, acfy> aivm = g;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = g;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getUploadLocations");
                    a.e = true;
                    a.a = ajaq.a(new b(12));
                    a.b = ajaq.a(new b(13));
                    aivm = a.a();
                    g = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<aceg, Empty> b() {
        aivm<aceg, Empty> aivm = a;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = a;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "adminDeleteContents");
                    a.e = true;
                    a.a = ajaq.a(new b(0));
                    a.b = ajaq.a(new b(1));
                    aivm = a.a();
                    a = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acem, acen> c() {
        aivm<acem, acen> aivm = b;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = b;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "claimContent");
                    a.e = true;
                    a.a = ajaq.a(new b(2));
                    a.b = ajaq.a(new b(3));
                    aivm = a.a();
                    b = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<aces, acet> d() {
        aivm<aces, acet> aivm = c;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = c;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "claimVariants");
                    a.e = true;
                    a.a = ajaq.a(new b(4));
                    a.b = ajaq.a(new b(5));
                    aivm = a.a();
                    c = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfa, acfb> e() {
        aivm<acfa, acfb> aivm = d;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = d;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "createFromBytes");
                    a.e = true;
                    a.a = ajaq.a(new b(6));
                    a.b = ajaq.a(new b(7));
                    aivm = a.a();
                    d = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfc, acfd> f() {
        aivm<acfc, acfd> aivm = e;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = e;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "createFromReference");
                    a.e = true;
                    a.a = ajaq.a(new b(8));
                    a.b = ajaq.a(new b(9));
                    aivm = a.a();
                    e = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfe, acff> g() {
        aivm<acfe, acff> aivm = f;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = f;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "createFromReferences");
                    a.e = true;
                    a.a = ajaq.a(new b(10));
                    a.b = ajaq.a(new b(11));
                    aivm = a.a();
                    f = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfv, acfw> h() {
        aivm<acfv, acfw> aivm = h;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = h;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getServiceUploadLocations");
                    a.e = true;
                    a.a = ajaq.a(new b(14));
                    a.b = ajaq.a(new b(15));
                    aivm = a.a();
                    h = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfn, acfo> i() {
        aivm<acfn, acfo> aivm = i;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = i;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getContentDescriptors");
                    a.e = true;
                    a.a = ajaq.a(new b(16));
                    a.b = ajaq.a(new b(17));
                    aivm = a.a();
                    i = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acft, acfu> j() {
        aivm<acft, acfu> aivm = j;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = j;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getNetworkMapping");
                    a.e = true;
                    a.a = ajaq.a(new b(18));
                    a.b = ajaq.a(new b(19));
                    aivm = a.a();
                    j = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfl, acfm> k() {
        aivm<acfl, acfm> aivm = k;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = k;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getClientRules");
                    a.e = true;
                    a.a = ajaq.a(new b(20));
                    a.b = ajaq.a(new b(21));
                    aivm = a.a();
                    k = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfg, acfh> l() {
        aivm<acfg, acfh> aivm = l;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = l;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "deleteContent");
                    a.e = true;
                    a.a = ajaq.a(new b(22));
                    a.b = ajaq.a(new b(23));
                    aivm = a.a();
                    l = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acgf, Empty> m() {
        aivm<acgf, Empty> aivm = m;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = m;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "releaseClaims");
                    a.e = true;
                    a.a = ajaq.a(new b(24));
                    a.b = ajaq.a(new b(25));
                    aivm = a.a();
                    m = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfr, acfs> n() {
        aivm<acfr, acfs> aivm = n;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = n;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getFreshContentObjects");
                    a.e = true;
                    a.a = ajaq.a(new b(26));
                    a.b = ajaq.a(new b(27));
                    aivm = a.a();
                    n = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acfp, acfq> o() {
        aivm<acfp, acfq> aivm = o;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = o;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "getFreshContentObject");
                    a.e = true;
                    a.a = ajaq.a(new b(28));
                    a.b = ajaq.a(new b(29));
                    aivm = a.a();
                    o = aivm;
                }
            }
        }
        return aivm;
    }

    private static aivm<acgk, acgl> p() {
        aivm<acgk, acgl> aivm = p;
        if (aivm == null) {
            synchronized (acej.class) {
                aivm = p;
                if (aivm == null) {
                    a a = aivm.a();
                    a.c = c.UNARY;
                    a.d = aivm.a("snapchat.content.BoltService", "resolveContentObjects");
                    a.e = true;
                    a.a = ajaq.a(new b(30));
                    a.b = ajaq.a(new b(31));
                    aivm = a.a();
                    p = aivm;
                }
            }
        }
        return aivm;
    }
}
