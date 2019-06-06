package defpackage;

import android.text.TextUtils;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.snap.core.db.api.SqlDelightDbClient;
import com.snap.core.db.api.SqlDelightDbManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: hzu */
public final class hzu {
    public final SqlDelightDbManager a;
    private final Supplier<SqlDelightDbClient> b;
    private final ajwy<hyk> c;
    private final Runnable d;

    public hzu(SqlDelightDbManager sqlDelightDbManager, ajwy<hyk> ajwy) {
        this(sqlDelightDbManager, ajwy, -$$Lambda$hzu$pTBUQp3yxZuF1tf-HywEacoaJ0I.INSTANCE);
    }

    private hzu(SqlDelightDbManager sqlDelightDbManager, ajwy<hyk> ajwy, Runnable runnable) {
        this.a = sqlDelightDbManager;
        this.b = new ihx(new -$$Lambda$hzu$oQRD3ySO13O8mR6X6ZysW76yXJI(sqlDelightDbManager));
        this.c = ajwy;
        this.d = runnable;
    }

    private static /* synthetic */ void d() {
    }

    public final SqlDelightDbClient a() {
        this.d.run();
        return (SqlDelightDbClient) this.b.get();
    }

    public final void a(String str) {
        this.a.throwIfNotDbScheduler();
        b().c().b(str);
    }

    public final void a(String str, String str2) {
        this.a.throwIfNotDbScheduler();
        b().c().a(str, str2);
    }

    public final hyg b() {
        this.d.run();
        return (hyg) ((SqlDelightDbClient) this.b.get()).getDatabase();
    }

    public final List<icd> c() {
        ArrayList newArrayList = Lists.newArrayList();
        for (iaj iaj : ((SqlDelightDbClient) this.b.get()).queryAsList("FideliusDefaultRepository:getFideliusDeviceUsers", b().c().a())) {
            String a = iaj.a();
            String b = iaj.b();
            if (TextUtils.isEmpty(a) || TextUtils.isEmpty(b)) {
                ((hyk) this.c.get()).a(TextUtils.isEmpty(a), TextUtils.isEmpty(b));
            } else {
                newArrayList.add(new icd(a, b));
            }
        }
        return newArrayList;
    }
}
