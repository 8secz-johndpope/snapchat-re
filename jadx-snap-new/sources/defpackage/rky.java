package defpackage;

import android.content.Context;
import com.snap.core.db.column.FeedKind;
import com.snap.core.db.query.LegacySendToQueries.Recent;
import com.snapchat.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: rky */
public final class rky extends rkp<rmk> {
    private final zpd a;
    private final rix b;
    private final String c;
    private final String d;
    private final int e = R.string.send_to_recents;
    private final String f;
    private final ajdp<znh<zmy>> g;
    private final ajwl<Integer> l = ajwl.i(Integer.valueOf(0));
    private final Set<String> m;
    private final String n;
    private final ris o;
    private final ajwm p;

    /* renamed from: rky$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[FeedKind.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.snap.core.db.column.FeedKind.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snap.core.db.column.FeedKind.GROUP;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snap.core.db.column.FeedKind.DIRECT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rky$1.<clinit>():void");
        }
    }

    /* renamed from: rky$a */
    public static class a {
        final int a;
        final boolean b;

        a(int i, boolean z) {
            this.a = i;
            this.b = z;
        }
    }

    public rky(riq riq, zpd zpd, zkf zkf, rix rix, ajdp<List<ril>> ajdp, ajdp<List<ril>> ajdp2, ajdp<Integer> ajdp3, Set<String> set, ajdp<Integer> ajdp4, ajdp<Integer> ajdp5, ajdp<Integer> ajdp6, ajdp<List<ril>> ajdp7, ajdp<Integer> ajdp8, ajdp<Boolean> ajdp9, Context context, String str, ajcx ajcx, ris ris, ajwm ajwm) {
        riq riq2 = riq;
        super(riq, context);
        zkf zkf2 = zkf;
        zkf.a(this);
        this.a = zpd;
        this.b = rix;
        this.c = riq.a(R.string.send_to_recents);
        String str2 = "";
        this.d = str2;
        this.f = str2;
        this.m = set;
        this.n = str;
        this.o = ris;
        this.p = ajwm;
        ajdw h = riq.k().h();
        ajdp a = ajdp.a(ajdp4.a(h), this.l.a(h), ajdp5.c(1).c().a(h), -$$Lambda$rky$kFblUULVt6_Cav2LUTzfHVPCcp4.INSTANCE);
        ajdp a2 = ajdp.a((ajdt) ajdp3, (ajdt) ajdp9, -$$Lambda$MocvT3wtpHV6Cld0LA7scf9S8oY.INSTANCE);
        this.g = ajdp.a(ajdp.a(h), ajdp7.a(h), d().a().a(h), ajdp2.a(h), a2.a(h), riq.g().a(h), a.a(h), ajdp6.a(h), ajdp8.a(h), new -$$Lambda$Ig9Rk8izWmjtocUVbQeKNFzkosM(this)).a(f()).u(new -$$Lambda$rky$XRDzegMpgOjBM2h-9rSbWEW1drw(ajcx)).d(new -$$Lambda$rky$rmuTA7qmqgGFVoKX5E8oeB_4DVM(this));
    }

    private static /* synthetic */ Integer a(Integer num, Integer num2, Integer num3) {
        return num3.intValue() == Integer.MAX_VALUE ? Integer.valueOf(Integer.MAX_VALUE) : Integer.valueOf(num.intValue() + (num2.intValue() * num3.intValue()));
    }

    private List<ril> a(List<ril> list) {
        ArrayList arrayList = new ArrayList();
        for (ril ril : list) {
            if (!ril.a.isGroup()) {
                Set set = this.m;
                if (!(set == null || set.isEmpty() || !this.m.contains(ril.a.username()))) {
                }
            }
            arrayList.add(ril);
        }
        return arrayList;
    }

    private static void a(List<ril> list, int i, List<zmy> list2, boolean z) {
        if (!(i == 0 || list.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (ril ril : list) {
                Object rhi;
                int i2 = 1.a[ril.a.kind().ordinal()];
                Recent recent;
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (ril.a.isGroup()) {
                            throw new IllegalArgumentException("RecentRankable is not a friend");
                        }
                        recent = ril.a;
                        rhp rhp = new rhp(recent.userId(), recent.username(), new rhh(recent.friendDisplayNameSafe(), null), recent.friendRowId(), null);
                    }
                } else if (ril.a.isGroup()) {
                    recent = ril.a;
                    rhi = new rhi(recent.key(), new rhh(recent.feedDisplayName(), null), null);
                } else {
                    throw new IllegalArgumentException("RecentRankable is not a group");
                }
                arrayList.add(rhi);
            }
            list2.add(new rmt(arrayList, z));
        }
    }

    private void a(znh<zmy> znh) {
        ajwm ajwm = this.p;
        if (ajwm != null) {
            ajwm.a();
        }
    }

    public final int a() {
        return 3;
    }

    /* Access modifiers changed, original: protected|final */
    public final List<zmy> a(List<ril> list, List<ril> list2, boolean z, List<ril> list3, a aVar, String str, int i, int i2, int i3) {
        List list4 = list;
        a aVar2 = aVar;
        if (aVar2.b) {
            return Collections.emptyList();
        }
        if (!akly.a(str)) {
            return Collections.emptyList();
        }
        if (!list.isEmpty()) {
            List<ril> list5 = list2;
            list.removeAll(list5.subList(0, Math.min(i3, list2.size())));
            list4 = list.subList(0, Math.min(i2, list.size()));
        }
        if (list4.isEmpty()) {
            return Collections.emptyList();
        }
        e().a(3, list4.size());
        ArrayList arrayList = new ArrayList(list4.size() + 1);
        arrayList.add(this.o.a(this.c, this.d, null, 2131889433, 3, this.f));
        rky.a(list3, aVar2.a, arrayList, z);
        list4 = a(list4);
        int min = Math.min(i, list4.size());
        arrayList.addAll(rkt.a(3, d(), this.a, list4, min, this.n, this.o));
        if (arrayList.size() - 1 < list4.size()) {
            arrayList.add(this.o.a(3));
        }
        this.k = arrayList.size();
        e().a(aazf.RECENTS, arrayList.size());
        return arrayList;
    }

    public final ajdp<znh<zmy>> c() {
        return this.g;
    }

    @akqq
    public final void onViewMoreEvent(rjq rjq) {
        if (rjq.a == 3) {
            ajwl ajwl = this.l;
            ajwl.a(Integer.valueOf(((Integer) ajwl.p()).intValue() + 1));
        }
    }
}
