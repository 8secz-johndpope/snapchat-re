package defpackage;

import com.snap.loginkit.lib.net.SnapKitHttpInterface;
import defpackage.nhj.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: nhi */
public final class nhi implements ngo {
    final aipn<SnapKitHttpInterface> a;
    final nhj b;
    private final zfw c = zgb.a(ngn.d, "LoginKitSyncImpl");
    private final aipn<ftl> d;

    /* renamed from: nhi$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: nhi$b */
    static final class b<T, R> implements ajfc<Long, ajdb> {
        final /* synthetic */ nhi a;

        /* renamed from: nhi$b$1 */
        static final class 1<T, R> implements ajfc<akws<koh>, ajdb> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final /* synthetic */ Object apply(Object obj) {
                ajcx b;
                akws akws = (akws) obj;
                akcr.b(akws, "it");
                if (akws.e()) {
                    List list;
                    koh koh = (koh) akws.f();
                    if (koh != null) {
                        kog[] kogArr = koh.a;
                        if (kogArr != null) {
                            Collection arrayList = new ArrayList(kogArr.length);
                            for (Object obj2 : kogArr) {
                                nhj nhj = this.a.a.b;
                                String str = "appConnection";
                                akcr.a(obj2, str);
                                akcr.b(obj2, str);
                                arrayList.add(nhj.a.runInTransaction("ConnectedApps:updateApp", new a(nhj, obj2)));
                            }
                            list = (List) arrayList;
                            b = ajcx.b((Iterable) list);
                        }
                    }
                    list = null;
                    b = ajcx.b((Iterable) list);
                } else {
                    b = ajvo.a(ajhn.a);
                }
                return b;
            }
        }

        /* renamed from: nhi$b$2 */
        static final class 2<T> implements ajfb<Throwable> {
            public static final 2 a = new 2();

            2() {
            }

            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }

        b(nhi nhi) {
            this.a = nhi;
        }

        public final /* synthetic */ Object apply(Object obj) {
            ajcx a;
            Long l = (Long) obj;
            akcr.b(l, "privacyScreenLastSeen");
            if (l.longValue() == 0) {
                a = ajvo.a(ajhn.a);
            } else {
                SnapKitHttpInterface snapKitHttpInterface = (SnapKitHttpInterface) this.a.a.get();
                Object a2 = wjd.LOGIN_KIT.a();
                akcr.a(a2, "SnapTokenAccessTokenScop…N_KIT.serverSideScopeName");
                a = snapKitHttpInterface.getUserAppConnections(a2).e((ajfc) new 1(this)).a((ajfb) 2.a);
            }
            return a;
        }
    }

    /* renamed from: nhi$c */
    static final class c<T> implements ajfl<Throwable> {
        public static final c a = new c();

        c() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            akcr.b((Throwable) obj, "error");
            return true;
        }
    }

    static {
        a aVar = new a();
    }

    public nhi(zgb zgb, aipn<ftl> aipn, aipn<SnapKitHttpInterface> aipn2, nhj nhj) {
        akcr.b(zgb, "schedulersProvider");
        akcr.b(aipn, "compositeConfigurationProvider");
        akcr.b(aipn2, "snapkitHttpInterface");
        akcr.b(nhj, "repository");
        this.d = aipn;
        this.a = aipn2;
        this.b = nhj;
    }

    public final ajcx a() {
        Object a = ((ftl) this.d.get()).t(nhf.LOGIN_KIT_PRIVACY_EXPLAINER_LAST_SEEN).e().b((ajdw) this.c.f()).e((ajfc) new b(this)).a((ajfl) c.a);
        akcr.a(a, "compositeConfigurationPr…   true\n                }");
        return a;
    }
}
