package defpackage;

import com.snap.messaging.friendsfeed.FriendsFeedHttpInterface;

/* renamed from: qys */
public final class qys implements aiqc<FriendsFeedHttpInterface> {
    private final ajwy<gcy> a;

    public static FriendsFeedHttpInterface a(gcy gcy) {
        akcr.b(gcy, "fsn");
        Object a = gcy.a(FriendsFeedHttpInterface.class);
        akcr.a(a, "fsn.create(FriendsFeedHttpInterface::class.java)");
        return (FriendsFeedHttpInterface) aiqf.a((FriendsFeedHttpInterface) a, "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return qys.a((gcy) this.a.get());
    }
}
