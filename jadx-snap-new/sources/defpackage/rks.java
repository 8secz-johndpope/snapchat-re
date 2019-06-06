package defpackage;

import android.content.Context;
import com.google.common.base.Strings;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: rks */
public final class rks extends rkp<rmq> {
    private final zpd a;
    private final String b;
    private final String c;
    private final String d;
    private final ajdp<znh<zmy>> e;
    private final boolean f;
    private final ajwl<Integer> g;
    private int l;
    private ris m;

    public rks(riq riq, zpd zpd, zkf zkf, ajdp<List<riz>> ajdp, Context context, ajcx ajcx, ris ris, ajdp<Boolean> ajdp2, boolean z) {
        this(riq, zpd, zkf, ajdp, context, ajcx, ris, ajdp2, z, (byte) 0);
    }

    private rks(riq riq, zpd zpd, zkf zkf, ajdp<List<riz>> ajdp, Context context, ajcx ajcx, ris ris, ajdp<Boolean> ajdp2, boolean z, byte b) {
        super(riq, context);
        this.g = new ajwl();
        this.a = zpd;
        this.f = z;
        this.b = riq.a(z ? R.string.send_to_new_group : R.string.send_to_groups);
        this.m = ris;
        this.l = 4;
        String str = "";
        this.c = z ? str : riq.a(R.string.send_to_create_group);
        this.d = str;
        this.g.a(Integer.valueOf(this.l));
        zkf.a(this);
        ajdw h = riq.k().h();
        this.e = ajdp.a(ajdp.a(h), riq.g().a(h), this.g.a(h), ajdp2.a(h), new -$$Lambda$rks$SpaAuq-SuIuClntDErteL5H5_MI(this)).a(f()).u(new -$$Lambda$rks$9cKJwUUQ-SRy6M_glM59ctzaaX8(ajcx));
    }

    private List<zmy> a(List<riz> list, String str, int i, boolean z) {
        if (!Strings.isNullOrEmpty(str)) {
            return Collections.emptyList();
        }
        if (!list.isEmpty()) {
            e().a(2, list.size());
            ArrayList arrayList = new ArrayList(list.size() + 1);
            arrayList.add(this.m.a(this.b, this.c, abps.b(this.c) ? null : Integer.valueOf(R.drawable.send_to_stories_section_header_new_story_plus), 2131889418, a(), this.d));
            arrayList.addAll(rkt.a(list, Math.min(i, list.size()), this.m, d(), a()));
            if (arrayList.size() - 1 < list.size()) {
                arrayList.add(this.m.a(a()));
            }
            this.k = arrayList.size();
            this.h.j().d();
            e().a(aazf.GROUPS, arrayList.size());
            return arrayList;
        } else if (this.f) {
            return Collections.emptyList();
        } else {
            if (z) {
                return Collections.emptyList();
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(this.m.a(this.b, this.c, Integer.valueOf(R.drawable.send_to_stories_section_header_new_story_plus), 2131889418, a(), this.d));
            arrayList2.add(new rmv(rit.MISCHIEF_EMPTY, this.i));
            return arrayList2;
        }
    }

    public final int a() {
        return this.f ? 16 : 2;
    }

    public final ajdp<znh<zmy>> c() {
        return this.e;
    }

    @akqq
    public final void onViewMoreEvent(rjq rjq) {
        if (rjq.a == a()) {
            ajwl ajwl = this.g;
            ajwl.a(Integer.valueOf(((Integer) ajwl.p()).intValue() + 5));
        }
    }
}
