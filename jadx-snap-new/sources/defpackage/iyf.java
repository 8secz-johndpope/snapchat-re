package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.snap.core.db.record.MessageMediaRefModel;
import defpackage.dnk.d;
import defpackage.iyg.a;
import defpackage.iyg.b;
import defpackage.iyg.c;
import java.util.List;

/* renamed from: iyf */
public final class iyf implements czl, gvn {
    final zjw a;
    private final List<String> b;
    private final zgb c;
    private final ira d;
    private final irv e;

    /* renamed from: iyf$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: iyf$b */
    static final class b<T, R> implements ajfc<T, R> {
        public static final b a = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            String str = (String) obj;
            akcr.b(str, "it");
            return new d(new dqf(str, 0, aayb.UNLOCK_DEEPLINK, aayc.SNAPCODE));
        }
    }

    /* renamed from: iyf$c */
    static final class c<T, R> implements ajfc<T, R> {
        private /* synthetic */ iyf a;

        c(iyf iyf) {
            this.a = iyf;
        }

        public final /* synthetic */ Object apply(Object obj) {
            d dVar = (d) obj;
            akcr.b(dVar, "payload");
            achb achb = this.a.a.d;
            if (achb.c && akcr.a(dnh.a, (zjm) achb.h())) {
                this.a.a.d.a(dVar, dnh.a);
            } else {
                zjw.a(this.a.a, dnh.a, true, null, dVar, 4);
            }
            return ajxw.a;
        }
    }

    static {
        a aVar = new a();
    }

    public iyf(zjw zjw, zgb zgb, ira ira, irv irv) {
        akcr.b(zjw, "deepLinkNavigator");
        akcr.b(zgb, "schedulersProvider");
        akcr.b(ira, "identityApi");
        akcr.b(irv, "snapTagApi");
        this.a = zjw;
        this.c = zgb;
        this.d = ira;
        this.e = irv;
        Object of = ImmutableList.of("https://www.snapchat.com/add/.*", "http://www.snapchat.com/add/.*", "snapchat://add/.*");
        akcr.a(of, "ImmutableList.of(\n      …\"snapchat://add/.*\"\n    )");
        this.b = (List) of;
    }

    public final aahz a(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return aahz.ADD_FRIEND;
    }

    public final List<String> a() {
        return this.b;
    }

    public final aahz b(Uri uri) {
        String str = MessageMediaRefModel.URI;
        akcr.b(uri, str);
        akcr.b(uri, str);
        return null;
    }

    public final ajcx c(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        zfw a = zgb.a(irc.t, "AddFriendDeepLinkHandler");
        iyg iyg = new iyg(this.d, this.e);
        akcr.b(uri, "deepLinkUri");
        Object h = iyg.a.a(uri).a((ajfc) a.a).a((ajfc) new b(iyg)).f(c.a).h(iyg.d.a);
        akcr.a(h, "identityApi.verifyAddFri…ust(\"\")\n                }");
        h = h.f(b.a).a((ajdw) a.l()).f(new c(this));
        akcr.a(h, "dataProvider.scanDataFro…      }\n                }");
        h = h.a((ajdw) a.h()).e();
        akcr.a(h, "observable\n             …         .ignoreElement()");
        return h;
    }

    public final ajcx d(Uri uri) {
        akcr.b(uri, MessageMediaRefModel.URI);
        return c(uri);
    }
}
