package defpackage;

/* renamed from: qxw */
public final class qxw {
    final ajwy<rbk> a;

    /* renamed from: qxw$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ qxt a;

        a(qxt qxt) {
            this.a = qxt;
        }

        public final /* synthetic */ Object apply(Object obj) {
            rbj rbj = (rbj) obj;
            akcr.b(rbj, "config");
            if (this.a == qxt.LOGIN && !rbj.a) {
                return qxu.NONE;
            }
            if (!rbj.a || !qxy.a.contains(this.a)) {
                return rbj.b ? qxu.LEGACY_LOQ : qxu.LEGACY;
            } else {
                int i = qxx.a[this.a.ordinal()];
                return i != 1 ? i != 2 ? i != 3 ? qxu.ARROYO_FEED_FIRST : rbj.c ? qxu.ARROYO_FEED_PAGINATION : qxu.LEGACY_LOQ : qxu.ARROYO_FEED_FIRST_LOGIN : qxu.ARROYO_FEED_FIRST_COLD;
            }
        }
    }

    public qxw(ajwy<rbk> ajwy) {
        akcr.b(ajwy, "friendsFeedConfigProvider");
        this.a = ajwy;
    }
}
