package defpackage;

import com.snap.ui.avatar.AvatarCache;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ral */
public final class ral implements ajej, zlx {
    public final ajei a = new ajei();
    public final AvatarCache b;
    public final zfw c;
    public final rad d;
    public final raj e;
    public final prd f;
    public final qzq g;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final ihi i;
    private final qzm j;
    private final qzm k;
    private final qzn l;
    private final boolean m = true;

    public ral(AvatarCache avatarCache, zfw zfw, rad rad, ihi ihi, raj raj, prd prd, qzm qzm, qzm qzm2, qzn qzn, qzq qzq) {
        akcr.b(avatarCache, "avatarCache");
        akcr.b(zfw, "schedulers");
        akcr.b(rad, "feedTooltipManager");
        akcr.b(ihi, "dateTimeUtils");
        akcr.b(raj, "feedItemPosProvider");
        akcr.b(prd, "navTracker");
        akcr.b(qzm, "chatSnapFetcher");
        akcr.b(qzm2, "storySnapFetcher");
        akcr.b(qzn, "fetchSnapStateStore");
        akcr.b(qzq, "fetchStoryStateStore");
        this.b = avatarCache;
        this.c = zfw;
        this.d = rad;
        this.i = ihi;
        this.e = raj;
        this.f = prd;
        this.j = qzm;
        this.k = qzm2;
        this.l = qzn;
        this.g = qzq;
    }

    public final void dispose() {
        if (this.h.compareAndSet(false, true)) {
            this.a.dispose();
        }
    }

    /* JADX WARNING: Missing block: B:22:0x006a, code skipped:
            if (defpackage.akcr.a(r2.g, r3.g) != false) goto L_0x006f;
     */
    public final boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x006f;
    L_0x0002:
        r0 = r3 instanceof defpackage.ral;
        if (r0 == 0) goto L_0x006d;
    L_0x0006:
        r3 = (defpackage.ral) r3;
        r0 = r2.b;
        r1 = r3.b;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0012:
        r0 = r2.c;
        r1 = r3.c;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x001c:
        r0 = r2.d;
        r1 = r3.d;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0026:
        r0 = r2.i;
        r1 = r3.i;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0030:
        r0 = r2.e;
        r1 = r3.e;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x003a:
        r0 = r2.f;
        r1 = r3.f;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0044:
        r0 = r2.j;
        r1 = r3.j;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x004e:
        r0 = r2.k;
        r1 = r3.k;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0058:
        r0 = r2.l;
        r1 = r3.l;
        r0 = defpackage.akcr.a(r0, r1);
        if (r0 == 0) goto L_0x006d;
    L_0x0062:
        r0 = r2.g;
        r3 = r3.g;
        r3 = defpackage.akcr.a(r0, r3);
        if (r3 == 0) goto L_0x006d;
    L_0x006c:
        goto L_0x006f;
    L_0x006d:
        r3 = 0;
        return r3;
    L_0x006f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ral.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AvatarCache avatarCache = this.b;
        int i = 0;
        int hashCode = (avatarCache != null ? avatarCache.hashCode() : 0) * 31;
        zfw zfw = this.c;
        hashCode = (hashCode + (zfw != null ? zfw.hashCode() : 0)) * 31;
        rad rad = this.d;
        hashCode = (hashCode + (rad != null ? rad.hashCode() : 0)) * 31;
        ihi ihi = this.i;
        hashCode = (hashCode + (ihi != null ? ihi.hashCode() : 0)) * 31;
        raj raj = this.e;
        hashCode = (hashCode + (raj != null ? raj.hashCode() : 0)) * 31;
        prd prd = this.f;
        hashCode = (hashCode + (prd != null ? prd.hashCode() : 0)) * 31;
        qzm qzm = this.j;
        hashCode = (hashCode + (qzm != null ? qzm.hashCode() : 0)) * 31;
        qzm = this.k;
        hashCode = (hashCode + (qzm != null ? qzm.hashCode() : 0)) * 31;
        qzn qzn = this.l;
        hashCode = (hashCode + (qzn != null ? qzn.hashCode() : 0)) * 31;
        qzq qzq = this.g;
        if (qzq != null) {
            i = qzq.hashCode();
        }
        return ((hashCode + i) * 31) + 1;
    }

    public final boolean isDisposed() {
        return this.h.get();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("FriendsFeedBindingContext(avatarCache=");
        stringBuilder.append(this.b);
        stringBuilder.append(", schedulers=");
        stringBuilder.append(this.c);
        stringBuilder.append(", feedTooltipManager=");
        stringBuilder.append(this.d);
        stringBuilder.append(", dateTimeUtils=");
        stringBuilder.append(this.i);
        stringBuilder.append(", feedItemPosProvider=");
        stringBuilder.append(this.e);
        stringBuilder.append(", navTracker=");
        stringBuilder.append(this.f);
        stringBuilder.append(", chatSnapFetcher=");
        stringBuilder.append(this.j);
        stringBuilder.append(", storySnapFetcher=");
        stringBuilder.append(this.k);
        stringBuilder.append(", fetchSnapStateStore=");
        stringBuilder.append(this.l);
        stringBuilder.append(", fetchStoryStateStore=");
        stringBuilder.append(this.g);
        stringBuilder.append(", isOfficialBadgeEnabled=true");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
