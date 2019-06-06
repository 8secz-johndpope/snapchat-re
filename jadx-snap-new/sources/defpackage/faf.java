package defpackage;

import android.content.res.Resources;
import com.google.common.base.Optional;
import com.snapchat.android.R;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: faf */
public final class faf implements eyn {
    private final aipn<fcp> a;
    private final aipn<eya> b;
    private final aipn<ezd> c;
    private final ConcurrentMap<String, ajcx> d = new ConcurrentHashMap();
    private final ConcurrentMap<String, ajdx<Optional<fgk>>> e = new ConcurrentHashMap();

    public faf(aipn<fcp> aipn, aipn<eya> aipn2, aipn<ezd> aipn3) {
        this.a = aipn;
        this.b = aipn2;
        this.c = aipn3;
    }

    private /* synthetic */ void a(String str) {
        this.e.remove(str);
    }

    private /* synthetic */ void b(String str) {
        this.d.remove(str);
    }

    private /* synthetic */ Optional c(String str, String str2) {
        return Optional.fromNullable(((fcp) this.a.get()).b(str, str2));
    }

    public final ajcx a() {
        return ((ezd) this.c.get()).d() ? ((eya) this.b.get()).a(true) : ajvo.a(ajhn.a);
    }

    public final fgk a(String str, String str2) {
        return ((fcp) this.a.get()).b(str, str2);
    }

    public final String a(Resources resources, int i, List<String> list) {
        return fes.a(resources, i, (List) list, true);
    }

    public final String a(Resources resources, boolean z, String str) {
        int i;
        Object[] objArr;
        if (z) {
            i = R.string.group_active_secondary_text;
            objArr = new Object[]{str};
        } else {
            i = R.string.friend_active_secondary_text;
            objArr = new Object[]{str};
        }
        return resources.getString(i, objArr);
    }

    public final ajdx<Optional<fgk>> b(String str, String str2) {
        fgk b = ((fcp) this.a.get()).b(str, str2);
        if (b != null) {
            return ajdx.b(Optional.of(b));
        }
        if (((fcp) this.a.get()).b(str)) {
            return ajdx.b(Optional.absent());
        }
        this.d.putIfAbsent(str, ((eya) this.b.get()).a(str).f(new -$$Lambda$faf$JJDHx76h5xbRfViqSvhz4DVPDvg(this, str)));
        this.e.putIfAbsent(str2, ((ajcx) this.d.get(str)).c(new -$$Lambda$faf$73toAJ97K9ZhSix1OEk0zScXdkM(this, str, str2)).b(new -$$Lambda$faf$mVtm8fJxN0GUtc36O642-fz21mU(this, str2)));
        return (ajdx) this.e.get(str2);
    }
}
