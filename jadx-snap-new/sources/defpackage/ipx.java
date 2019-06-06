package defpackage;

import java.util.List;

/* renamed from: ipx */
public class ipx implements hym {
    private final ajxe a;

    /* renamed from: ipx$a */
    static final class a extends akcq implements akbk<ixj> {
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
            return (ixj) ((ajwy) this.receiver).get();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(ipx.class), "friendRepository", "getFriendRepository()Lcom/snap/identity/db/FriendRepository;");
    }

    public ipx(ajwy<ixj> ajwy) {
        akcr.b(ajwy, "friendRepositoryProvider");
        this.a = ajxh.a(new a(ajwy));
    }

    public final List<String> a() {
        Object obj = (ixj) this.a.b();
        akcr.a(obj, "friendRepository");
        obj = obj.d();
        akcr.a(obj, "friendRepository.allMutualFriendUserIds");
        return obj;
    }
}
