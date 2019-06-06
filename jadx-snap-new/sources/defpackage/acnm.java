package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.snap.ui.avatar.Avatar;
import com.snap.ui.avatar.AvatarCache;
import com.snap.ui.avatar.AvatarView;
import com.snap.ui.avatar.FeedStoryInfo;
import com.snapchat.android.R;
import defpackage.actg.a;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: acnm */
public final class acnm implements acon {
    final acsk a;
    private final njy b;
    private final int c = R.id.avatar_view;
    private final AvatarCache d;
    private final zfw e;

    /* renamed from: acnm$b */
    static final class b implements Runnable {
        final /* synthetic */ acnm a;
        final /* synthetic */ AvatarView b;
        final /* synthetic */ Avatar c;
        final /* synthetic */ njx d;
        private /* synthetic */ FeedStoryInfo e;

        /* renamed from: acnm$b$1 */
        static final class 1 implements OnClickListener {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
            }

            public final void onClick(View view) {
                acnm acnm = this.a.a;
                njx njx = this.a.d;
                AvatarView avatarView = this.a.b;
                String b = njx.b();
                String c = njx.c();
                Long g = njx.g();
                if (!(b == null || c == null || g == null)) {
                    long longValue = g.longValue();
                    acnm.a.a(new a(b, c, new srk(avatarView, sqx.CIRCLE)), longValue);
                }
                this.a.d.l();
                this.a.b.setAvatarInfo(this.a.c, nka.a(this.a.d), false, false, adcw.a());
            }
        }

        b(acnm acnm, AvatarView avatarView, Avatar avatar, FeedStoryInfo feedStoryInfo, njx njx) {
            this.a = acnm;
            this.b = avatarView;
            this.c = avatar;
            this.e = feedStoryInfo;
            this.d = njx;
        }

        public final void run() {
            this.b.setAvatarInfo(this.c, this.e, false, false, adcw.a());
            if (this.d != null) {
                this.b.setOnClickListener(new 1(this));
            }
        }
    }

    /* renamed from: acnm$a */
    public static final class a implements akbw<Long, List<? extends Avatar>, ajxw> {
        private final WeakReference<AvatarView> a;

        public a(WeakReference<AvatarView> weakReference) {
            akcr.b(weakReference, "avatarRef");
            this.a = weakReference;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ((Number) obj).longValue();
            List list = (List) obj2;
            akcr.b(list, "avatars");
            Object obj3 = (AvatarView) this.a.get();
            if (obj3 != null) {
                akcr.a(obj3, "avatarRef.get()?: return");
                AvatarView.setAvatarsInfo$default(obj3, list, null, false, false, adcw.a(), 14, null);
            }
            return ajxw.a;
        }
    }

    public acnm(njy njy, acsk acsk, AvatarCache avatarCache, zfw zfw) {
        akcr.b(njy, "mapFriendStoryDataProvider");
        akcr.b(acsk, "mapPlaybackManager");
        akcr.b(avatarCache, "avatarCache");
        akcr.b(zfw, "schedulers");
        this.b = njy;
        this.a = acsk;
        this.d = avatarCache;
        this.e = zfw;
    }

    private final njx a(njv njv) {
        String c = njv.c();
        return c != null ? this.b.e(c) : null;
    }

    private final void a(AvatarView avatarView, njv njv, njx njx, FeedStoryInfo feedStoryInfo) {
        Uri a;
        String e = njv.e();
        if (e != null) {
            String f = njv.f();
            if (f == null) {
                f = "6972338";
            }
            a = dds.a(e, f, afnd.PROFILE, false, 0, 24);
        } else {
            a = null;
        }
        avatarView.post(new b(this, avatarView, new Avatar(njv.b(), a, null, null, 12, null), feedStoryInfo, njx));
    }

    public final void a(View view) {
        akcr.b(view, "bitmojiView");
    }

    public final void a(View view, String str) {
        akcr.b(view, "view");
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar_view);
        if (str != null) {
            this.d.loadAvatarsForFeed(Long.parseLong(str), null, null, null, this.e, new a(new WeakReference(avatarView)));
        }
    }

    public final void a(View view, njv njv) {
        akcr.b(view, "view");
        akcr.b(njv, "friend");
        njx a = a(njv);
        FeedStoryInfo a2 = a != null ? nka.a(a) : null;
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar_view);
        if (avatarView != null) {
            a(avatarView, njv, a, a2);
        }
    }

    public final void b(View view, njv njv) {
        akcr.b(view, "view");
        akcr.b(njv, "friend");
        njx a = a(njv);
        FeedStoryInfo feedStoryInfo = null;
        if (a != null) {
            akcr.b(a, "receiver$0");
            if (!a.i()) {
                feedStoryInfo = nka.a(a);
            }
        }
        AvatarView avatarView = (AvatarView) view.findViewById(R.id.avatar_view);
        if (avatarView != null) {
            a(avatarView, njv, a, feedStoryInfo);
        }
    }
}
