package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import java.util.List;

/* renamed from: iyj */
public final class iyj implements czl, gvn {
    final zjw a;
    final iqy b;
    private final List<String> c;

    /* renamed from: iyj$a */
    static final class a implements Runnable {
        private /* synthetic */ iyj a;
        private /* synthetic */ Uri b;

        a(iyj iyj, Uri uri) {
            this.a = iyj;
            this.b = uri;
        }

        public final void run() {
            ith ith;
            iqy iqy = this.a.b;
            achb achb = this.a.a.d;
            Uri uri = this.b;
            akcr.b(uri, MessageMediaRefModel.URI);
            if (!akcr.a((Object) "https://www.snapchat.com/add-friends/.*", uri.toString())) {
                if (!akcr.a((Object) "http://www.snapchat.com/add-friends/.*", uri.toString())) {
                    ith = ith.ADDED_ME_NOTIFICATION;
                    defpackage.iqy.a.a(iqy, achb, 0, false, ith, this.a.a, 6);
                }
            }
            ith = ith.ADDED_ME_WELCOME_EMAIL;
            defpackage.iqy.a.a(iqy, achb, 0, false, ith, this.a.a, 6);
        }
    }

    public iyj(zjw zjw, iqy iqy) {
        akcr.b(zjw, "deepLinkNavigator");
        akcr.b(iqy, "friendingApi");
        this.a = zjw;
        this.b = iqy;
        Object of = ImmutableList.of("snapchat://friending/addfriends/.*", "https://www.snapchat.com/add-friends/.*", "http://www.snapchat.com/add-friends/.*");
        akcr.a(of, "ImmutableList.of(\n      …N_ADD_FRIENDS_HTTPS\n    )");
        this.c = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.ADD_FRIEND;
    }

    public final List<String> a() {
        return this.c;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        Object a = ajcx.a((Runnable) new a(this, uri));
        akcr.a(a, "Completable.fromRunnable…pLinkNavigator)\n        }");
        return a;
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
