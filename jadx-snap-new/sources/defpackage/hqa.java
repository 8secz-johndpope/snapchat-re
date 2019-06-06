package defpackage;

import com.snap.core.db.column.FriendLinkType;
import java.util.List;
import java.util.Map;

/* renamed from: hqa */
public final class hqa implements hcf {
    private final ajxe a;

    /* renamed from: hqa$a */
    static final class a extends akcq implements akbk<iqw> {
        a(ajwy ajwy) {
            super(0, ajwy);
        }

        public final String getName() {
            return "get";
        }

        public final akej getOwner() {
            return akde.a(ajwy.class);
        }

        public final String getSignature() {
            return "get()Ljava/lang/Object;";
        }

        public final /* synthetic */ Object invoke() {
            return (iqw) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(hqa.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/api/FriendApi;");
    }

    public hqa(ajwy<iqw> ajwy) {
        akcr.b(ajwy, "friendApiProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    private final iqw a() {
        return (iqw) this.a.b();
    }

    public final FriendLinkType a(String str) {
        akcr.b(str, "friendUserName");
        return a().b(str);
    }

    public final Map<String, FriendLinkType> a(List<String> list) {
        akcr.b(list, "usernames");
        return a().b((List) list);
    }
}
