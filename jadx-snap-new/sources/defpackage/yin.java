package defpackage;

/* renamed from: yin */
public final class yin {
    final yid a;
    final ihh b;

    /* renamed from: yin$a */
    static final class a<T, R> implements ajfc<T, R> {
        private /* synthetic */ yin a;

        a(yin yin) {
            this.a = yin;
        }

        public final /* synthetic */ Object apply(Object obj) {
            defpackage.yif.a aVar = (defpackage.yif.a) obj;
            akcr.b(aVar, "it");
            aelt aelt = new aelt();
            aelt.d = iig.a().toString();
            aelt.f = Long.valueOf(this.a.b.a());
            agbh agbh = new agbh();
            agbh.b = aVar.b;
            agbh.a = aVar.a;
            agbh.d = ygz.a;
            aelt.b = agbh;
            return aelt;
        }
    }

    public yin(yid yid, ihh ihh) {
        akcr.b(yid, "storyRepository");
        akcr.b(ihh, "clock");
        this.a = yid;
        this.b = ihh;
    }
}
