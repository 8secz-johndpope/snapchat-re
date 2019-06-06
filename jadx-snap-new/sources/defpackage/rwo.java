package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.common.base.Optional;
import com.snap.core.db.column.MessageClientStatus;
import com.snap.core.db.column.MessageClientStatusKt;
import com.snap.core.db.record.StorySnapRecord.SelectStorySnapForThumbnailByUsernameRecord;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarsInfo;
import com.snap.ui.avatar.FeedStoryInfo;
import com.snapchat.android.R;
import java.util.List;

/* renamed from: rwo */
public class rwo implements ipv {
    private static final SparseArray<zjm> g = new SparseArray();
    final gpb a;
    final aipn<yhx> b;
    private final achb<zjm, zjk> c;
    private final aipn<vxd> d;
    private final aipn<usd> e;
    private final aipn<iqh> f;

    /* renamed from: rwo$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: rwo$d */
    static final class d<T> implements ajfl<abkq> {
        public static final d a = new d();

        d() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return abkq.b != null;
        }
    }

    /* renamed from: rwo$e */
    static final class e<T, R> implements ajfc<T, ajdt<? extends R>> {
        private /* synthetic */ rwo a;

        e(rwo rwo) {
            this.a = rwo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            yhx yhx = (yhx) this.a.b.get();
            String str = abkq.b;
            if (str == null) {
                akcr.a();
            }
            return yhx.b(str);
        }
    }

    /* renamed from: rwo$f */
    static final class f<T> implements ajfl<abkq> {
        public static final f a = new f();

        f() {
        }

        public final /* synthetic */ boolean test(Object obj) {
            abkq abkq = (abkq) obj;
            akcr.b(abkq, "it");
            return abkq.b != null;
        }
    }

    /* renamed from: rwo$c */
    public static final class c<T1, T2, R> implements ajex<T1, T2, R> {
        public final R apply(T1 t1, T2 t2) {
            return new ajxm((abkq) t2, (Optional) t1);
        }
    }

    /* renamed from: rwo$g */
    static final class g<T, R> implements ajfc<T, R> {
        private /* synthetic */ rwo a;

        g(rwo rwo) {
            this.a = rwo;
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list;
            ajxm ajxm = (ajxm) obj;
            akcr.b(ajxm, "<name for destructuring parameter 0>");
            Object obj2 = (abkq) ajxm.a;
            Optional optional = (Optional) ajxm.b;
            SelectStorySnapForThumbnailByUsernameRecord selectStorySnapForThumbnailByUsernameRecord = (SelectStorySnapForThumbnailByUsernameRecord) optional.orNull();
            FeedStoryInfo feedStoryInfo = null;
            MessageClientStatus clientStatus = selectStorySnapForThumbnailByUsernameRecord != null ? selectStorySnapForThumbnailByUsernameRecord.clientStatus() : null;
            rwo rwo = this.a;
            akcr.a(obj2, "userSession");
            if (obj2.a == null || obj2.f == null || obj2.b == null) {
                list = ajyw.a;
            } else {
                String str = obj2.a;
                if (str == null) {
                    akcr.a();
                }
                String str2 = obj2.f;
                if (str2 == null) {
                    akcr.a();
                }
                String str3 = obj2.b;
                if (str3 == null) {
                    akcr.a();
                }
                String a = ddq.a(str).a(rwo.a.a().l);
                akcr.a((Object) a, "getParserForUser(userId)…rSession.bitmojiSelfieId)");
                list = ajyl.a(new Avatar(str3, dds.a(str2, a, afnd.UNKNOWN, false, 0, 24), null, null, 12, null));
            }
            SelectStorySnapForThumbnailByUsernameRecord selectStorySnapForThumbnailByUsernameRecord2 = (SelectStorySnapForThumbnailByUsernameRecord) optional.orNull();
            boolean z = true;
            if (selectStorySnapForThumbnailByUsernameRecord2 != null) {
                String clientId = selectStorySnapForThumbnailByUsernameRecord2.clientId();
                if (clientId != null) {
                    Object storyId = selectStorySnapForThumbnailByUsernameRecord2.storyId();
                    akcr.a(storyId, "it.storyId()");
                    Object kind = selectStorySnapForThumbnailByUsernameRecord2.kind();
                    akcr.a(kind, "it.kind()");
                    Uri a2 = yjl.a(clientId, storyId, kind, true, true);
                    MessageClientStatus clientStatus2 = selectStorySnapForThumbnailByUsernameRecord2.clientStatus();
                    FeedStoryInfo feedStoryInfo2 = new FeedStoryInfo(a2, false, false, false, true, false, false, false, clientStatus2 != null ? MessageClientStatusKt.isFailedState(clientStatus2) : false, false, 736, null);
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            }
            AvatarsInfo avatarsInfo = new AvatarsInfo(list, feedStoryInfo, false, false);
            boolean z2 = clientStatus == MessageClientStatus.QUEUED || clientStatus == MessageClientStatus.SENDING;
            if (!(clientStatus == MessageClientStatus.FAILED || clientStatus == MessageClientStatus.FAILED_NON_RECOVERABLE)) {
                z = false;
            }
            return new ips(avatarsInfo, z2, z);
        }
    }

    /* renamed from: rwo$h */
    static final class h<T> implements ajfb<ips> {
        public static final h a = new h();

        h() {
        }

        public final /* synthetic */ void accept(Object obj) {
            ((ips) obj).a.getFriendStoryInfo();
        }
    }

    /* renamed from: rwo$b */
    static final class b extends akcq implements akbl<zjm, Integer> {
        b(rwo rwo) {
            super(1, rwo);
        }

        public final String getName() {
            return "getPredefinedSceneForPage";
        }

        public final akej getOwner() {
            return akde.a(rwo.class);
        }

        public final String getSignature() {
            return "getPredefinedSceneForPage(Lcom/snap/ui/deck/MainPageType;)Ljava/lang/Integer;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            zjm zjm = (zjm) obj;
            akcr.b(zjm, "p1");
            return rwo.e(zjm);
        }
    }

    static {
        a aVar = new a();
        g.put(R.id.camera_capture_button, dnh.a);
        g.put(R.id.feed_icon_container, qxo.a);
        g.put(R.id.discoverfeed_icon_container, hbn.a);
        g.put(R.id.memories_icon_container, ojc.a);
        g.put(R.id.map_icon_container, adcw.a);
        g.put(R.id.neon_header_title, vxc.a);
        g.put(R.id.hova_header_search_icon, vxc.a);
        g.put(R.id.neon_header_avatar_container, upp.b);
        g.put(R.id.neon_add_friend_button_container, irc.m);
    }

    public rwo(achb<zjm, zjk> achb, aipn<vxd> aipn, aipn<usd> aipn2, gpb gpb, aipn<yhx> aipn3, aipn<iqh> aipn4) {
        akcr.b(achb, "navigationHost");
        akcr.b(aipn, "searchLauncher");
        akcr.b(aipn2, "profileLauncher");
        akcr.b(gpb, "userAuth");
        akcr.b(aipn3, "storiesDataProvider");
        akcr.b(aipn4, "addFriendsLauncher");
        this.c = achb;
        this.d = aipn;
        this.e = aipn2;
        this.a = gpb;
        this.b = aipn3;
        this.f = aipn4;
    }

    static Integer e(zjm zjm) {
        int i;
        if (akcr.a((Object) zjm, qxo.a)) {
            i = R.layout.hova_feed;
        } else if (akcr.a((Object) zjm, hbn.a)) {
            i = R.layout.hova_discoverfeed;
        } else if (akcr.a((Object) zjm, dnh.a)) {
            i = R.layout.hova_main_camera;
        } else if (akcr.a((Object) zjm, dnh.c)) {
            i = R.layout.hova_stacked_camera;
        } else if (akcr.a((Object) zjm, ojc.a)) {
            i = R.layout.hova_memories;
        } else if (akcr.a((Object) zjm, ojc.d)) {
            i = 0;
        } else if (akcr.a((Object) zjm, vxc.a)) {
            i = R.layout.hova_search;
        } else if (akcr.a((Object) zjm, adcw.a)) {
            i = R.layout.hova_map;
        } else if (akcr.a((Object) zjm, upp.b)) {
            i = R.layout.hova_profile;
        } else if (akcr.a((Object) zjm, pql.a)) {
            i = -1;
        } else if (!akcr.a((Object) zjm, kus.a)) {
            return null;
        } else {
            i = R.layout.hova_lens_explorer;
        }
        return Integer.valueOf(i);
    }

    public final ajdp<ips> a() {
        Object u = this.a.c().a((ajfl) d.a).c(1).u(new e(this));
        akcr.a(u, "userAuth.observeUserSess…humbnail(it.username!!) }");
        Object j = this.a.c().a((ajfl) f.a).j(ajfu.a);
        akcr.a(j, "userAuth.observeUserSess…  .distinctUntilChanged()");
        ajdp a = ajdp.a((ajdt) u, (ajdt) j, (ajex) new c());
        if (a == null) {
            akcr.a();
        }
        u = a.p(new g(this)).j(ajfu.a).d((ajfb) h.a);
        akcr.a(u, "Observables.combineLates…      }\n                }");
        return u;
    }

    public final SparseArray<zjm> a(zjm zjm) {
        akcr.b(zjm, "pageType");
        Integer e = rwo.e(zjm);
        if (e != null) {
            int intValue = e.intValue();
            Object obj = (intValue == -1 || intValue == 0) ? null : 1;
            if (obj == null) {
                e = null;
            }
            if (e != null) {
                e.intValue();
                return g;
            }
        }
        return null;
    }

    public void a(ViewGroup viewGroup, zjm zjm) {
        akcr.b(viewGroup, "view");
        akcr.b(zjm, "pageType");
    }

    public int b(zjm zjm) {
        akcr.b(zjm, "pageType");
        Integer e = rwo.e(zjm);
        return e != null ? e.intValue() : zjm.b ? rwp.a(this.c, zjm, new b(this)) : 0;
    }

    public Integer c(zjm zjm) {
        akcr.b(zjm, "pageType");
        return rwo.e(zjm);
    }

    public void d(zjm zjm) {
        akcr.b(zjm, "pageType");
        if (akcr.a((Object) zjm, vxc.a)) {
            vxd vxd = (vxd) this.d.get();
            achg h = this.c.h();
            if (h != null) {
                vxd.a(new vxe((zjm) h));
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else if (akcr.a((Object) zjm, upp.b)) {
            ((usd) this.e.get()).a(new usq(usg.MY_PROFILE, "my_profile", null, abbd.HOVA_NAV_BAR, null, 20));
        } else if (akcr.a((Object) zjm, irc.m)) {
            ((iqh) this.f.get()).a(ith.ADD_FRIENDS_BUTTON_ON_TOP_BAR);
        } else {
            achb.a(this.c, zjm, true, null, 4);
        }
    }
}
