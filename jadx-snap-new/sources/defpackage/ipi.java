package defpackage;

import android.app.Activity;
import android.content.Context;
import com.snap.taskexecution.scoping.recipes.ScopedFragmentActivity.b;
import com.snap.ui.avatar.AvatarView;
import com.snap.ui.avatar.AvatarsInfo;
import com.snapchat.android.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ipi */
public final class ipi {
    final idl a = ipk.a.getAttributionFor("Hova");
    final iw<zjm> b = new iw();
    final HashMap<zjm, abua> c = new HashMap();
    final HashMap<zjm, ajej> d = new HashMap();
    private final ajxe e;
    private final ipv f;
    private final zgk<b> g;

    /* renamed from: ipi$c */
    static final class c extends akcs implements akbk<zfw> {
        private /* synthetic */ zgb a;

        c(zgb zgb) {
            this.a = zgb;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return zgb.a(ipk.a.callsite("avatar"));
        }
    }

    /* renamed from: ipi$a */
    static final class a implements ajev {
        private /* synthetic */ ipi a;
        private /* synthetic */ zjm b;

        a(ipi ipi, zjm zjm) {
            this.a = ipi;
            this.b = zjm;
        }

        public final void run() {
            abua abua = (abua) this.a.c.get(this.b);
            if (abua != null) {
                abua.c();
            }
            this.a.c.put(this.b, null);
        }
    }

    /* renamed from: ipi$b */
    static final class b<T> implements ajfb<ips> {
        private /* synthetic */ ipi a;
        private /* synthetic */ AvatarView b;
        private /* synthetic */ zjm c;

        b(ipi ipi, AvatarView avatarView, zjm zjm) {
            this.a = ipi;
            this.b = avatarView;
            this.c = zjm;
        }

        public final /* synthetic */ void accept(Object obj) {
            ips ips = (ips) obj;
            AvatarsInfo avatarsInfo = ips.a;
            boolean z = ips.b;
            this.b.setAvatarsInfo(avatarsInfo.getAvatars(), avatarsInfo.getFriendStoryInfo(), avatarsInfo.isStillNewFriend(), avatarsInfo.getHasActiveTyping(), this.a.a);
            this.b.setClickable(false);
            if (z) {
                Map map = this.a.c;
                zjm zjm = this.c;
                Object obj2 = map.get(zjm);
                if (obj2 == null) {
                    obj2 = new abua(this.b.getStoryView(), this.b.getArcView());
                    map.put(zjm, obj2);
                }
                abua abua = (abua) obj2;
                this.b.hideCircle();
                this.b.getArcView().a(this.b.getResources().getColor(R.color.regular_yellow));
                this.b.getArcView().b(this.b.getResources().getDimensionPixelOffset(R.dimen.hova_nav_avatar_animating_ring_stroke_size));
                abua.b();
                return;
            }
            abua abua2 = (abua) this.a.c.get(this.c);
            if (abua2 != null) {
                abua2.c();
            }
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ipi.class), "schedulers", "getSchedulers()Lcom/snap/taskexecution/scheduling/QualifiedSchedulers;");
    }

    public ipi(ipv ipv, zgb zgb, zgk<b> zgk) {
        akcr.b(ipv, "hovaSpecs");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(zgk, "scoper");
        this.f = ipv;
        this.g = zgk;
        this.e = ajxh.a(new c(zgb));
    }

    private final zfw a() {
        return (zfw) this.e.b();
    }

    public final void a(AvatarView avatarView, zjm zjm) {
        akcr.b(avatarView, "avatarView");
        akcr.b(zjm, "pageType");
        if (!this.b.contains(zjm)) {
            Context context = avatarView.getContext();
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity == null || !activity.isDestroyed()) {
                this.b.add(zjm);
                Object f = this.f.a().b((ajdw) a().h()).a((ajdw) a().l()).a((ajev) new a(this, zjm)).f((ajfb) new b(this, avatarView, zjm));
                akcr.a(f, "hovaSpecs.observeAvatar(…      }\n                }");
                this.d.put(zjm, f);
                ipo.a(f, this.g, b.ON_DESTROY, "Hova observe avatar");
            }
        }
    }
}
