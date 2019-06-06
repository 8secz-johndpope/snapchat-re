package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Strings;

/* renamed from: djk */
public final class djk extends dje {
    private final ftl a;
    private final aipn<iha> b;

    public djk(ftl ftl, djf djf, zyn zyn, aipn<iha> aipn, ilv ilv) {
        super(djf, zyn, ilv);
        this.a = ftl;
        this.b = aipn;
    }

    private /* synthetic */ Optional a(String str) {
        return Optional.fromNullable((zym) ((iha) this.b.get()).a(str, zym.class));
    }

    public final ajdp<Optional<zym>> d() {
        return this.a.u(djg.CONFIG_OVERRIDE).p(new -$$Lambda$djk$-3AoJ9jKr_v8TPOA49SInlkbFwE(this));
    }

    /* Access modifiers changed, original: protected|final */
    public final zym e() {
        String j = this.a.j(djg.CONFIG_OVERRIDE);
        return Strings.isNullOrEmpty(j) ? null : (zym) ((iha) this.b.get()).a(j, zym.class);
    }
}
