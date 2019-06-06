package defpackage;

/* renamed from: uaz */
public final class uaz implements tpw {
    final sdm a;
    private final String b = "StatusAndSoftNavBarActivator";
    private final ajei c = new ajei();
    private final toc d;
    private final ajdp<Boolean> e;

    /* renamed from: uaz$a */
    static final class a<T> implements ajfb<Boolean> {
        private /* synthetic */ uaz a;

        a(uaz uaz) {
            this.a = uaz;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Boolean) obj;
            akcr.a(obj, "it");
            if (obj.booleanValue()) {
                sdm sdm = this.a.a;
                zjm zjm = toc.a;
                Object obj2 = sdl.a;
                akcr.a(obj2, "InAppNotificationPolicy.SKIP_ALL");
                sdm.a(zjm, obj2);
                return;
            }
            this.a.a.a(toc.a);
        }
    }

    public uaz(sdm sdm, toc toc, ajdp<Boolean> ajdp) {
        akcr.b(sdm, "inAppNotificationPolicySetter");
        akcr.b(toc, "previewFeature");
        akcr.b(ajdp, "inAppNotificationPolicyChangeObservable");
        this.a = sdm;
        this.d = toc;
        this.e = ajdp;
    }

    public final String a() {
        return this.b;
    }

    public final ajej start() {
        ajej f = this.e.f((ajfb) new a(this));
        akcr.a((Object) f, "inAppNotificationPolicyC…      }\n                }");
        ajvv.a(f, this.c);
        return this.c;
    }
}
