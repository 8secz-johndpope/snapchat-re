package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.common.collect.Lists;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import defpackage.iah.a;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: hzx */
public final class hzx {
    public final SqlDelightDbManager a;
    public final SqlDelightDbClient b;
    public final hyg c = ((hyg) this.b.getDatabase());
    public final ajwy<hyk> d;
    private final hzq e;

    public hzx(SqlDelightDbManager sqlDelightDbManager, byte[] bArr, ajwy<hyk> ajwy) {
        this.a = sqlDelightDbManager;
        this.b = sqlDelightDbManager.getDbClient(new idd(hyn.a.getPage()));
        this.e = new hzq(bArr);
        this.d = ajwy;
    }

    private List<iah> b(List<iah> list) {
        ArrayList newArrayList = Lists.newArrayList();
        for (iah iah : list) {
            Object obj = null;
            if (iah != null) {
                try {
                    String a = iah.a();
                    String b = iah.b();
                    byte[] c = iah.c();
                    Long d = iah.d();
                    if (!(TextUtils.isEmpty(a) || TextUtils.isEmpty(b))) {
                        if (d != null) {
                            byte[] b2;
                            a = i(a);
                            b = i(b);
                            if (c != null) {
                                b2 = b(c);
                            }
                            obj = new a(a, b, b2, d);
                        }
                    }
                } catch (GeneralSecurityException e) {
                    ((hyk) this.d.get()).e(hzy.a, abmt.a(e));
                }
            }
            if (obj != null) {
                newArrayList.add(obj);
            }
        }
        return newArrayList;
    }

    private byte[] b(byte[] bArr) {
        return this.e.b(bArr);
    }

    private String i(String str) {
        return new String(this.e.b(Base64.decode(str, 2)));
    }

    public final icl a(String str) {
        iak iak = (iak) this.b.queryFirst("FideliusEncryptedRepository:getFideliusUserIdentity", this.c.d().a(h(str)));
        if (iak != null) {
            String a = iak.a();
            byte[] b = iak.b();
            byte[] c = iak.c();
            if (!(TextUtils.isEmpty(a) || b == null || c == null)) {
                try {
                    return new icl(i(a), b(b), b(c));
                } catch (GeneralSecurityException e) {
                    ((hyk) this.d.get()).e(iab.a, abmt.a(e));
                    throw e;
                }
            }
        }
        return null;
    }

    public final List<iah> a() {
        return b(this.b.queryAsList("FideliusEncryptedRepository:getAllFideliusFriendDeviceInfosInternal", this.c.a().a()));
    }

    public final List<iah> a(List<String> list) {
        try {
            Collection arrayList = new ArrayList(list.size());
            for (String h : list) {
                arrayList.add(h(h));
            }
            return b(this.b.queryAsList("FideliusEncryptedRepository:getFideliusFriendDeviceInfosForUserIds", this.c.a().a(arrayList)));
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).e(hzy.a, abmt.a(e));
            return new ArrayList();
        }
    }

    public final boolean a(String str, String str2, Long l) {
        this.a.throwIfNotDbScheduler();
        try {
            this.c.b().a(h(str), h(str2), l);
            return true;
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).d(hzz.a, abmt.a(e));
            return false;
        }
    }

    public final boolean a(String str, String str2, byte[] bArr, Integer num) {
        this.a.throwIfNotDbScheduler();
        try {
            this.c.a().a(h(str), h(str2), bArr == null ? null : a(bArr), Long.valueOf(num.longValue()));
            return true;
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).d(hzy.a, abmt.a(e));
            return false;
        }
    }

    public final byte[] a(byte[] bArr) {
        return this.e.a(bArr);
    }

    public final ice b(String str) {
        try {
            iah iah = (iah) this.b.queryFirst("FideliusEncryptedRepository:getFideliusFriendDeviceInfo", this.c.a().a(h(str)));
            if (iah != null) {
                String a = iah.a();
                String b = iah.b();
                byte[] c = iah.c();
                Long d = iah.d();
                if (!(TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || d == null)) {
                    return new ice(i(a), i(b), c == null ? null : b(c), Integer.valueOf(d.intValue()));
                }
            }
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).e(hzy.a, abmt.a(e));
        }
        return null;
    }

    public final List<iah> b() {
        return b(this.b.queryAsList("FideliusEncryptedRepository:getAllFideliusFriendDeviceInfosWithNoMystiquesInternal", this.c.a().b()));
    }

    public final List<iah> c(String str) {
        try {
            return b(this.b.queryAsList("FideliusEncryptedRepository:getFideliusFriendDeviceInfosForUserId", this.c.a().b(h(str))));
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).e(hzy.a, abmt.a(e));
            return new ArrayList();
        }
    }

    public final void d(String str) {
        this.a.throwIfNotDbScheduler();
        try {
            this.c.a().c(str);
        } catch (Exception e) {
            ((hyk) this.d.get()).f(hzy.a, abmt.a(e));
        }
    }

    public final void e(String str) {
        this.a.throwIfNotDbScheduler();
        try {
            this.c.a().d(str);
        } catch (Exception e) {
            ((hyk) this.d.get()).f(hzy.a, abmt.a(e));
        }
    }

    public final ici f(String str) {
        try {
            iai iai = (iai) this.b.queryFirst("FideliusEncryptedRepository:getFideliusSnapEncryptionKey", this.c.b().a(h(str)));
            if (iai != null) {
                String a = iai.a();
                String b = iai.b();
                Long c = iai.c();
                if (!(TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || c == null)) {
                    return new ici(i(a), i(b), c.longValue());
                }
            }
        } catch (GeneralSecurityException e) {
            ((hyk) this.d.get()).e(hzz.a, abmt.a(e));
        }
        return null;
    }

    public final boolean g(String str) {
        this.a.throwIfNotDbScheduler();
        try {
            this.c.b().b(str);
            return true;
        } catch (Exception e) {
            ((hyk) this.d.get()).f(hzz.a, abmt.a(e));
            return false;
        }
    }

    public final String h(String str) {
        return Base64.encodeToString(this.e.a(str.getBytes()), 2);
    }
}
