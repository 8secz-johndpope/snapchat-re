package defpackage;

import com.snap.messaging.talk.TalkHttpInterface;

/* renamed from: rou */
public final class rou implements abjo {
    private final ide a;
    private final ajwy<gpb> b;
    private final ajwy<rrn> c;
    private final ajwy<quk> d;
    private final ajwy<qvd> e;
    private final ajdx<TalkHttpInterface> f;
    private final zgb g;

    public rou(ide ide, ajwy<gpb> ajwy, ajwy<rrn> ajwy2, ajwy<quk> ajwy3, ajwy<qvd> ajwy4, ajdx<TalkHttpInterface> ajdx, zgb zgb) {
        akcr.b(ide, "feature");
        akcr.b(ajwy, "userAuth");
        akcr.b(ajwy2, "talkRepositoryProvider");
        akcr.b(ajwy3, "conversationsRepositoryProvider");
        akcr.b(ajwy4, "messagingRepositoryProvider");
        akcr.b(ajdx, "talkHttpInterface");
        akcr.b(zgb, "schedulersProvider");
        this.a = ide;
        this.b = ajwy;
        this.c = ajwy2;
        this.d = ajwy3;
        this.e = ajwy4;
        this.f = ajdx;
        this.g = zgb;
    }

    private final rox a(String str, String str2, String str3) {
        ide ide = this.a;
        Object obj = this.d.get();
        akcr.a(obj, "conversationsRepositoryProvider.get()");
        quk quk = (quk) obj;
        obj = this.e.get();
        akcr.a(obj, "messagingRepositoryProvider.get()");
        qvd qvd = (qvd) obj;
        zgb zgb = this.g;
        ajdx ajdx = this.f;
        obj = this.c.get();
        akcr.a(obj, "talkRepositoryProvider.get()");
        rrn rrn = (rrn) obj;
        obj = this.b.get();
        akcr.a(obj, "userAuth.get()");
        String b = ((gpb) obj).b();
        if (b == null) {
            akcr.a();
        }
        return new rox(str, b, str2, str3, ajdx, rrn, quk, ide, qvd, zgb);
    }

    public final /* synthetic */ abjt a(String str) {
        akcr.b(str, "conversationId");
        return a(str, null, null);
    }

    public final /* synthetic */ abjt a(String str, String str2) {
        akcr.b(str, "conversationId");
        akcr.b(str2, "cognacId");
        return a(str, str2, "cognac");
    }
}
