package defpackage;

/* renamed from: drf */
public final class drf {
    public ftl a;
    public hxs b;

    private /* synthetic */ ajdb a(Integer num) {
        return this.b.b(dnd.HANDS_FREE_SEEN_COUNT, Integer.valueOf(num.intValue() + 1));
    }

    private static /* synthetic */ Boolean a(Integer num, Integer num2) {
        boolean z = num.intValue() <= 0 && num2.intValue() < 3;
        return Boolean.valueOf(z);
    }

    private /* synthetic */ ajdb b(Integer num) {
        return this.b.b(dnd.HANDS_FREE_ENABLED_COUNT, Integer.valueOf(num.intValue() + 1));
    }

    public final ajdp<Boolean> a() {
        return ajdp.a(this.a.s(dnd.HANDS_FREE_ENABLED_COUNT), this.a.s(dnd.HANDS_FREE_SEEN_COUNT), -$$Lambda$drf$PY8PNYrRbUvF--iwT9IwrRITBbA.INSTANCE);
    }

    public final ajcx b() {
        return this.a.s(dnd.HANDS_FREE_ENABLED_COUNT).d().e(new -$$Lambda$drf$Zg1OataGaivqO4NS8WjSyXdL9O4(this));
    }

    public final ajcx c() {
        return this.a.s(dnd.HANDS_FREE_SEEN_COUNT).d().e(new -$$Lambda$drf$iASGJm66lg1HTVmjq_aaFB5sjFI(this));
    }
}
