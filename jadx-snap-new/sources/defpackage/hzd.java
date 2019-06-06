package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: hzd */
public final class hzd extends psx {
    private Lock a;
    private hzx b;
    private final ajwy<iba> c;

    public hzd(ajwy<iba> ajwy) {
        akcr.b(ajwy, "identityKeysManager");
        this.c = ajwy;
    }

    public final void a(ibb ibb) {
        akcr.b(ibb, "fideliusUserDatabaseManager");
        Object b = ibb.b();
        akcr.a(b, "fideliusUserDatabaseManager.friendCacheReadLock");
        this.a = b;
        Object a = ibb.a();
        akcr.a(a, "fideliusUserDatabaseMana…deliusEncryptedRepository");
        this.b = a;
    }
}
