package defpackage;

import java.util.Set;

/* renamed from: eoe */
public final class eoe implements zgj {
    private final Set<dno> a;

    public eoe(Set<dno> set) {
        this.a = set;
    }

    public final ajej start() {
        ajei ajei = new ajei();
        for (dno dno : this.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(abpm.a(dno.getClass()));
            stringBuilder.append(":start");
            fsv.a(stringBuilder.toString(), new -$$Lambda$eoe$sCdTwmF3u5v-xOVkUEWhXg2aZ1U(ajei, dno));
        }
        return ajei;
    }
}
