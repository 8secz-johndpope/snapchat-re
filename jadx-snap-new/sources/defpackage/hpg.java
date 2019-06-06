package defpackage;

import android.text.TextUtils;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.column.FriendLinkType;
import com.snap.core.db.column.GroupStoryType;
import com.snap.core.db.query.LegacyDiscoverFeedQueries.SnapDbFriendStory;
import defpackage.hjh.a;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: hpg */
public final class hpg {
    private final ajwy<hjo> a;
    private final ajwy<hpj> b;
    private final ajwy<hcf> c;
    private final ajwy<hcc> d;
    private final ajwy<kfn> e;
    private final ajwy<hoy> f;
    private final ajwy<ezb> g;
    private final ajwy<hhp> h;
    private final ajwy<abqo> i;
    private final ajwy<hno> j;

    /* renamed from: hpg$1 */
    static /* synthetic */ class 1 {
        static final /* synthetic */ int[] a = new int[hji.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        static {
            /*
            r0 = defpackage.hji.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = defpackage.hji.FRIEND;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = defpackage.hji.GROUP;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = defpackage.hji.PRIVATE;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.hpg$1.<clinit>():void");
        }
    }

    public hpg(ajwy<hjo> ajwy, ajwy<hpj> ajwy2, ajwy<hcf> ajwy3, ajwy<hcc> ajwy4, ajwy<kfn> ajwy5, ajwy<hoy> ajwy6, ajwy<ezb> ajwy7, ajwy<hhp> ajwy8, ajwy<abqo> ajwy9, ajwy<hno> ajwy10) {
        this.a = ajwy;
        this.b = ajwy2;
        this.c = ajwy3;
        this.d = ajwy4;
        this.e = ajwy5;
        this.f = ajwy6;
        this.g = ajwy7;
        this.h = ajwy8;
        this.i = ajwy9;
        this.j = ajwy10;
    }

    public static hjx a(SnapDbFriendStory snapDbFriendStory, String str, ihx<Boolean> ihx) {
        if (snapDbFriendStory == null || snapDbFriendStory.friendUsername() == null) {
            return null;
        }
        hji hji;
        String feedSpecifiedName;
        vcy vcy = new vcy();
        vcy.a(0);
        vcy.a(snapDbFriendStory.friendUsername());
        vcy.a(0);
        hir a = hir.a(MapboxConstants.MINIMUM_ZOOM, -1, false, 0);
        GroupStoryType groupStoryType = snapDbFriendStory.groupStoryType();
        if (groupStoryType == null) {
            hji = hji.FRIEND;
        } else {
            int i = hjj.a[groupStoryType.ordinal()];
            if (i == 1) {
                hji = hji.CUSTOM;
            } else if (i == 2) {
                hji = hji.PRIVATE;
            } else if (i == 3) {
                hji = hji.GEOFENCE;
            } else if (i == 4) {
                hji = hji.GROUP;
            } else {
                throw new ajxk();
            }
        }
        String str2 = "";
        a c = new hij.a().a((long) String.format(Locale.getDefault(), "%d:%s", new Object[]{Long.valueOf(snapDbFriendStory._id()), snapDbFriendStory.friendUsername()}).hashCode()).a(hiy.a(vcy)).a(snapDbFriendStory.friendUsername()).a(hiq.n().a(hje.c).a()).a(hbj.FRIEND_STORY_CARD).b(vdi.a(vcy)).a(a).a(false).a().c(str2).b().c();
        boolean z = snapDbFriendStory.storyViewed() != null && snapDbFriendStory.storyViewed().booleanValue();
        a a2 = c.b(z).d(str).d().e().f().e(str2).g().f(str2).b(snapDbFriendStory._id()).g(snapDbFriendStory.bitmojiAvatarId()).h(snapDbFriendStory.bitmojiSelfieId()).c(snapDbFriendStory._id()).c(snapDbFriendStory.storyMuted() == 1).i(snapDbFriendStory.friendUsername()).j(snapDbFriendStory.friendUserId()).k(snapDbFriendStory.firstUnviewedSnapId()).d(snapDbFriendStory.storyLatestTimestamp().longValue()).a(hji);
        int i2 = 1.a[hji.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                feedSpecifiedName = !TextUtils.isEmpty(snapDbFriendStory.feedSpecifiedName()) ? snapDbFriendStory.feedSpecifiedName() : snapDbFriendStory.feedParticipantString();
            } else if (!(i2 == 3 && ((Boolean) ihx.get()).booleanValue())) {
                feedSpecifiedName = snapDbFriendStory.storyDisplayName();
            }
            return new hjx(a2.l(feedSpecifiedName).m(snapDbFriendStory.storyId()).h(), Integer.valueOf(0));
        }
        feedSpecifiedName = snapDbFriendStory.friendDisplayName();
        return new hjx(a2.l(feedSpecifiedName).m(snapDbFriendStory.storyId()).h(), Integer.valueOf(0));
    }

    private hjx a(vii vii, String str, String str2, int i, int i2, boolean z, String str3, hjd hjd, String str4, Map<String, FriendLinkType> map) {
        int i3;
        int i4;
        String str5;
        String str6;
        boolean z2;
        hir hir;
        long j;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str7;
        vii vii2 = vii;
        String str8 = str;
        String str9 = str2;
        int i5 = i;
        String str10 = str3;
        Map<String, FriendLinkType> map2 = map;
        boolean b = abps.b(str3) ^ 1;
        boolean z3 = vii2.g;
        vgz vgz = vii2.k;
        int i6 = vii2.p;
        boolean z4 = vii2.n == null || !vii2.n.a;
        Object obj = (vii2.o == null || !vii2.o.b) ? null : 1;
        float f = vii2.l;
        if (vii2.m) {
            i3 = i6;
            i4 = i5;
        } else {
            i3 = i6;
            i4 = -1;
        }
        hir a = hir.a(f, i4, z4, vii2.q);
        if (vgz != null) {
            str5 = !abps.b(vgz.a) ? vgz.a : null;
            str6 = !abps.b(vgz.g) ? vgz.g : null;
            z2 = vgz.b;
            hir = a;
            j = vgz.c;
            bArr = vgz.e;
            String str11 = str5;
            bArr2 = vgz.d;
            bArr3 = vgz.f;
            str7 = str11;
        } else {
            hir = a;
            j = 0;
            bArr3 = null;
            str7 = null;
            bArr2 = null;
            str6 = null;
            z2 = false;
            bArr = null;
        }
        hiq.a c = hiq.n().a(bArr).b(bArr2).a(z2).a(j).a(str7).b(str6).c(bArr3);
        if (z) {
            c.b(true).a(-1);
        } else if (b) {
            c.a(i5);
        }
        c.a(hjd);
        hiq a2 = c.a();
        j = vii2.e;
        hiv hie = vii2.o != null ? new hie(vii2.o.a, vii2.o.b) : null;
        String str12 = "";
        String str13;
        if (vii.e()) {
            vhh f2 = vii.f();
            hke a3 = hph.a(f2.a.a, hph.a(f2.b, f2.a.a.b));
            vip[] vipArr = f2.b;
            this.i.get();
            str13 = str12;
            z4 = obj != null || ((hcc) this.d.get()).a(hph.a(vipArr, System.currentTimeMillis()));
            str6 = ((hcc) this.d.get()).b(hkb.a(vii));
            if (f2.b.length == 0) {
                return null;
            }
            hjg.a a4 = new hii.a().a(j).a(hiy.a(vii2.d)).a(str8).a(hkc.a(vii)).b(vdi.a(vii2.d)).a(hir).a(a2).b(z3).a(vii2.i).c(vii2.j).a(f2.a.i).c(f2.c == null ? 0 : (int) f2.c.a).a(f2.a.j).d(str9).e(f2.a.a.a).b(i3).f(String.valueOf(vii2.f)).a(hie).c(z4).g(str6).i(b).h(str3).a(hpg.a(f2.b)).i(f2.a.b).j(f2.a.f).k(f2.a.g).l(f2.a.h).m(f2.a.e).a(a3);
            str5 = str13;
            a4 = a4.n(str5).o(str5).a(f2.a.k).q(f2.a.d).b(f2.a.c).p(str5);
            z4 = false;
            hjg.a h = a4.d(false).e(false).f(false).g(f2.a.l).h(f2.a.m);
            if (vii.r() && vii2.h) {
                z4 = true;
            }
            return new hjx(h.j(z4).a(), Integer.valueOf(i2));
        }
        hjx hjx;
        str6 = str3;
        str5 = str12;
        int i7 = i3;
        hir hir2 = hir;
        String a5;
        String str14;
        boolean z5;
        hiv hiv;
        long j2;
        if (vii.k()) {
            vhm l = vii.l();
            cvv a6 = ((hjo) this.a.get()).a(l);
            a5 = hjp.a(l.d);
            if (a6 == null || !a6.a() || a5 == null) {
                hjx = null;
            } else {
                str14 = a5;
                cvv cvv = a6;
                vhm vhm = l;
                z5 = b;
                hiv = hie;
                String str15 = str5;
                hjx hjx2 = null;
                j2 = j;
                int i8 = i7;
                hir hir3 = hir2;
                boolean z6 = z3;
                ((hhp) this.h.get()).a(str, str14, l.b, l.c, cvv, l.f, l.g);
                if (cvv.b()) {
                    ((hhp) this.h.get()).a(i5, cvv.c());
                    return hjx2;
                }
                double z7 = (double) cvv.z();
                Double.isNaN(z7);
                z7 /= 1000.0d;
                List a7 = hph.a(cvv);
                boolean z8 = obj != null || ((hcc) this.d.get()).a(a7);
                str12 = cvv.t();
                if (str12 == null) {
                    str12 = str15;
                }
                hjq.a a8 = new hil.a().a(j2).a(hiy.a(vii2.d)).a(str8).a(hkc.a(vii)).b(vdi.a(vii2.d)).a(hir3).a(a2).a(z6).d(vii2.i).c(vii2.j).a(a7.size()).a(z7).d(str2).a().b(i8).e(String.valueOf(vii2.f)).a(hiv).b(z8).f(str15).c(z5).g(str3).h(cvv.v()).a(new hke(str12)).i(cvv.u()).j(cvv.h()).k(cvv.g()).l(cvv.i()).m(str14).n(cvv.c()).a(cvv.j());
                vhm vhm2 = vhm;
                a8 = a8.o(vhm2.a).p(vhm2.b).q(vhm2.c).a(vhm2.f).b(vhm2.g).r(cvv.f()).s(cvv.r()).a(cvv.w());
                cvv cvv2 = cvv;
                return new hjx(a8.a(cvv2).b(cvv2.x()).t(cvv2.n()).e(cvv2.y()).u(cvv2.A()).b(), Integer.valueOf(i2));
            }
        }
        a5 = str5;
        hiv hiv2 = hie;
        z4 = b;
        int i9 = i7;
        j2 = j;
        String str16 = str9;
        a = hir2;
        str9 = str6;
        Object obj2 = null;
        boolean z9;
        if (vii.i()) {
            vhn j3 = vii.j();
            str13 = a5;
            hke a9 = hph.a(j3.a.b, hph.a(j3.b, j3.a.b.b));
            vip[] vipArr2 = j3.b;
            hke hke = a9;
            this.i.get();
            hiv = hiv2;
            z9 = obj != null || ((hcc) this.d.get()).a(hph.a(vipArr2, System.currentTimeMillis()));
            str6 = ((hcc) this.d.get()).b(hkb.a(vii));
            if (j3.b.length == 0) {
                return null;
            }
            Object obj3;
            vgy vgy = j3.a.m;
            String str17 = j3.a.e;
            z5 = z4;
            Map<String, FriendLinkType> map3 = map;
            FriendLinkType a10 = map3 == null ? ((hcf) this.c.get()).a(str17) : (FriendLinkType) map3.get(str17);
            String str18 = str17;
            this.c.get();
            if (j3.a.h || j3.a.g || a10 == FriendLinkType.FOLLOWING || a10 == FriendLinkType.OUTGOING) {
                str14 = str6;
                obj3 = 1;
            } else {
                str14 = str6;
                obj3 = null;
            }
            obj2 = (a10 == FriendLinkType.BLOCKED || ((a10 == FriendLinkType.MUTUAL && vgy == null) || obj3 == null)) ? 1 : null;
            if (obj2 != null) {
                return null;
            }
            kfu a11;
            z4 = ((a10 == FriendLinkType.OUTGOING ? 1 : 0) | ((a10 == FriendLinkType.FOLLOWING ? 1 : 0) | z3)) | j3.a.i;
            str6 = j3.a.c;
            if (vgy != null) {
                str6 = vgy.b;
                alch alch = new alch();
                str17 = vgy.a;
                if (str17 != null) {
                    String str19;
                    alcg alcg;
                    alch.b = str17;
                    alch.a |= 1;
                    alch.d = vgy.d;
                    alch.a(str6);
                    if (abps.b(vgy.c)) {
                        str19 = str6;
                        alcg = null;
                    } else {
                        alcg = new alcg();
                        str19 = str6;
                        str6 = vgy.c;
                        if (str6 != null) {
                            alcg.c = str6;
                            alcg.a |= 2;
                            str6 = vgy.c;
                            if (str6 != null) {
                                alcg.b = str6;
                                alcg.a |= 1;
                            } else {
                                throw new NullPointerException();
                            }
                        }
                        throw new NullPointerException();
                    }
                    alch.h = alcg;
                    a11 = ((kfn) this.e.get()).a(new kgf(alch)).a();
                    str6 = str19;
                } else {
                    throw new NullPointerException();
                }
            }
            a11 = null;
            hjg.a b2 = new hii.a().a(j2).a(hiy.a(vii2.d)).a(str8).a(hkc.a(vii)).b(vdi.a(vii2.d)).a(a).a(a2).b(z4);
            boolean z10 = vii.r() && vii2.h;
            hjg.a i10 = b2.j(z10).a(vii2.i).c(vii2.j).a(j3.a.k).c(j3.c == null ? 0 : (int) j3.c.a).a(j3.a.l).d(str16).e(j3.a.b.a).b(i9).f(String.valueOf(vii2.f)).a(hiv).c(z9).g(str14).i(z5).h(str3).a(hpg.a(j3.b)).i(str6);
            str6 = str13;
            return new hjx(i10.j(str6).k(str6).l(str6).m(str6).q(j3.a.f).b(j3.a.d).a(null).a(hke).n(str18).o(j3.a.a).p(j3.a.j).d(true).a(a11).e(j3.a.g).f(j3.a.h).g(false).h(true).a(), Integer.valueOf(i2));
        }
        str6 = a5;
        z9 = z4;
        str5 = str9;
        if (vii.g()) {
            str8 = str5;
            return ((hpj) this.b.get()).a(j2, vii, str2, i2, a, z3, str3, a2, hiv2, str4);
        }
        if ((vii2.a == 5 ? 1 : null) != null) {
            vhe vhe = vii2.a == 5 ? (vhe) vii2.b : null;
            viq viq = vhe.a;
            vda vda = vhe.j;
            return new hjx(new hik.a().a(j2).a(hiy.a(vii2.d)).a(str8).a(hkc.a(vii)).b(vdi.a(vii2.d)).a(a).a(a2).b(vii2.g).a(vii2.i).c(vii2.j).a().b().d(str16).e(viq.a).a(i9).f(String.valueOf(vii2.f)).a(hiv2).a(hph.a(vhe.a, null)).c(false).g(str6).d(z9).h(str5).i(vhe.e).j(vhe.b).k(vhe.f).l(vhe.g).m(vhe.d).b(vhe.c).a(vda.c).b(vda.a).c(vda.b).n(vhe.h).d((double) vhe.i).c(), Integer.valueOf(i2));
        }
        if (((ezb) this.g.get()).a() && ((hoy) this.f.get()).F()) {
            if ((vii2.a == 25 ? 1 : null) != null) {
                vgr vgr = vii2.a == 25 ? (vgr) vii2.b : null;
                hbk a12 = hiy.a(vii2.d);
                vgr vgr2 = vgr;
                if (vgr.b.equals("Battleship") && !((ezb) this.g.get()).b()) {
                    return null;
                }
                str5 = a12.b();
                fgm a13 = ((ezb) this.g.get()).a(str5);
                str12 = a13 == null ? null : a13.f();
                hix.a g = new hig.a().a(j2).a(a12).a(str8).a(hkc.a(vii)).b(vdi.a(vii2.d)).a(a).a(a2).b(z3).a(vii2.i).c(vii2.j).d(str16).a(i9).e(String.valueOf(vii2.f)).a(hiv2).a().b().c(false).f(str6).d(z9).g(str3);
                vgr vgr3 = vgr2;
                return new hjx(g.k(vgr3.f).a(hph.a(vgr3.a, null)).j(vgr3.e).h(vgr3.b).i(vgr3.c).l(vgr3.d).k(vgr3.f).j(vgr3.e).m(str5).n(str12).c(), Integer.valueOf(i2));
            }
        }
        hjx = null;
        return hjx;
    }

    private static Long a(vip[] vipArr) {
        if (vipArr == null) {
            return null;
        }
        long j = 0;
        for (vip vip : vipArr) {
            j = Math.max(j, vip.b);
        }
        return j == 0 ? null : Long.valueOf(j);
    }

    public final hjx a(vii vii, String str, String str2, hjd hjd) {
        return a(vii, str, str2, false, "", hjd, null);
    }

    public final hjx a(vii vii, String str, String str2, boolean z, String str3, hjd hjd, String str4) {
        try {
            return a(vii, str, str2, 0, 0, z, str3, hjd, str4, null);
        } catch (Throwable th) {
            Throwable th2 = th;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x00b7 */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            defpackage.ieg.a(java.lang.String.format(java.util.Locale.getDefault(), "Unable to convert model for card at location %d", new java.lang.Object[]{java.lang.Integer.valueOf(r15)}), true, 0);
     */
    public final java.util.List<defpackage.hjx> a(java.util.List<defpackage.vii> r20, java.util.Map<defpackage.vii, java.lang.String> r21, defpackage.hjd r22) {
        /*
        r19 = this;
        r12 = r19;
        r0 = com.google.common.collect.Lists.newArrayList();
        r1 = r20.iterator();
    L_0x000a:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0028;
    L_0x0010:
        r2 = r1.next();
        r2 = (defpackage.vii) r2;
        r3 = r2.i();
        if (r3 == 0) goto L_0x000a;
    L_0x001c:
        r2 = r2.j();
        r2 = r2.a;
        r2 = r2.e;
        r0.add(r2);
        goto L_0x000a;
    L_0x0028:
        r1 = 0;
        r2 = r0.isEmpty();
        if (r2 != 0) goto L_0x003c;
    L_0x002f:
        r1 = r12.c;
        r1 = r1.get();
        r1 = (defpackage.hcf) r1;
        r0 = r1.a(r0);
        goto L_0x003d;
    L_0x003c:
        r0 = r1;
    L_0x003d:
        r13 = com.google.common.collect.Lists.newArrayList();
        r15 = 0;
    L_0x0042:
        r1 = r20.size();
        if (r15 >= r1) goto L_0x00d3;
    L_0x0048:
        r11 = r20;
        r1 = r11.get(r15);	 Catch:{ RuntimeException -> 0x00b7 }
        r2 = r1;
        r2 = (defpackage.vii) r2;	 Catch:{ RuntimeException -> 0x00b7 }
        r10 = defpackage.hkc.a(r2);	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = r12.i;	 Catch:{ RuntimeException -> 0x00b7 }
        r1.get();	 Catch:{ RuntimeException -> 0x00b7 }
        r16 = android.os.SystemClock.elapsedRealtime();	 Catch:{ RuntimeException -> 0x00b7 }
        r3 = r2.c;	 Catch:{ RuntimeException -> 0x00b7 }
        r9 = r21;
        r1 = r9.get(r2);	 Catch:{ RuntimeException -> 0x00b7 }
        r4 = r1;
        r4 = (java.lang.String) r4;	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = new java.util.Random;	 Catch:{ RuntimeException -> 0x00b7 }
        r1.<init>();	 Catch:{ RuntimeException -> 0x00b7 }
        r5 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r6 = 256; // 0x100 float:3.59E-43 double:1.265E-321;
        r7 = r1.nextInt(r6);	 Catch:{ RuntimeException -> 0x00b7 }
        r8 = r1.nextInt(r6);	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = r1.nextInt(r6);	 Catch:{ RuntimeException -> 0x00b7 }
        r6 = android.graphics.Color.argb(r5, r7, r8, r1);	 Catch:{ RuntimeException -> 0x00b7 }
        r7 = 0;
        r8 = "";
        r18 = 0;
        r1 = r19;
        r5 = r15;
        r9 = r22;
        r14 = r10;
        r10 = r18;
        r11 = r0;
        r1 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ RuntimeException -> 0x00b7 }
        r2 = r12.i;	 Catch:{ RuntimeException -> 0x00b7 }
        r2.get();	 Catch:{ RuntimeException -> 0x00b7 }
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ RuntimeException -> 0x00b7 }
        r2 = r2 - r16;
        if (r1 == 0) goto L_0x00b3;
    L_0x00a1:
        r13.add(r1);	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = defpackage.hbj.PROMOTED_STORY_CARD;	 Catch:{ RuntimeException -> 0x00b7 }
        if (r14 != r1) goto L_0x00b3;
    L_0x00a8:
        r1 = r12.j;	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = r1.get();	 Catch:{ RuntimeException -> 0x00b7 }
        r1 = (defpackage.hno) r1;	 Catch:{ RuntimeException -> 0x00b7 }
        r1.b(r2);	 Catch:{ RuntimeException -> 0x00b7 }
    L_0x00b3:
        r6 = 0;
        goto L_0x00ce;
    L_0x00b5:
        r0 = move-exception;
        goto L_0x00d2;
    L_0x00b7:
        r1 = java.util.Locale.getDefault();	 Catch:{ all -> 0x00b5 }
        r2 = "Unable to convert model for card at location %d";
        r3 = 1;
        r4 = new java.lang.Object[r3];	 Catch:{ all -> 0x00b5 }
        r5 = java.lang.Integer.valueOf(r15);	 Catch:{ all -> 0x00b5 }
        r6 = 0;
        r4[r6] = r5;	 Catch:{ all -> 0x00b5 }
        r1 = java.lang.String.format(r1, r2, r4);	 Catch:{ all -> 0x00b5 }
        defpackage.ieg.a(r1, r3, r6);	 Catch:{ all -> 0x00b5 }
    L_0x00ce:
        r15 = r15 + 1;
        goto L_0x0042;
    L_0x00d2:
        throw r0;
    L_0x00d3:
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hpg.a(java.util.List, java.util.Map, hjd):java.util.List");
    }
}
