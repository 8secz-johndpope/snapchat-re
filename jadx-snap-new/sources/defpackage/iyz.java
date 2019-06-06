package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.base.Preconditions;
import com.samsung.android.sdk.camera.SCamera;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.api.SnapDb;
import com.snap.core.db.column.FriendSuggestionPlacement;
import com.snap.core.db.record.FriendModel.SelectAllFriendUserScoresModel;
import com.snap.identity.AuthHttpInterface;
import com.snap.identity.IdentityHttpInterface;
import com.snap.identity.job.MultiAddFriendDurableJob;
import com.snap.settings.api.SettingsHttpInterface;
import defpackage.ahcb.a;
import defpackage.ahcb.c;
import defpackage.ira.b;
import defpackage.iyl.d;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: iyz */
public final class iyz implements ira {
    private final aipn<iqe> A;
    private final ajwy<iyl> B;
    private final aipn<iyv> C;
    private final aipn<ilv> D;
    private final ajwy<isa> E;
    private final ajwy<jkd> F;
    private final zfw a;
    private final aipn<SnapDb> b;
    private final DbClient c;
    private final aipn<AuthHttpInterface> d;
    private final aipn<IdentityHttpInterface> e;
    private final aipn<SettingsHttpInterface> f;
    private final aipn<iib> g;
    private final aipn<hwl> h;
    private final aipn<gpb> i;
    private final aipn<ixj> j;
    private final aipn<ixp> k;
    private final aipn<ixq> l;
    private final aipn<whj> m;
    private final aipn<wni> n;
    private final ajwy<abna> o;
    private final aipn<whk> p;
    private final aipn<iqj> q;
    private final aipn<jlk> r;
    private final aipn<hyz> s;
    private final aipn<hyj> t;
    private final aipn<hyq> u;
    private final aipn<iha> v;
    private final ajwy<isc> w;
    private final aipn<ixk> x;
    private final aipn<tnj> y;
    private final aipn<ftl> z;

    /* renamed from: iyz$a */
    public static class a {
        public final List<SelectAllFriendUserScoresModel> a;
        final alet b;
        public final aleu c;

        public a(List<SelectAllFriendUserScoresModel> list, alet alet, aleu aleu) {
            this.a = list;
            this.b = alet;
            this.c = aleu;
        }
    }

    public iyz(aipn<SnapDb> aipn, aipn<ixj> aipn2, aipn<ixp> aipn3, aipn<ixq> aipn4, aipn<AuthHttpInterface> aipn5, aipn<IdentityHttpInterface> aipn6, aipn<iib> aipn7, aipn<hwl> aipn8, aipn<gpb> aipn9, aipn<whj> aipn10, aipn<wni> aipn11, ajwy<abna> ajwy, aipn<whk> aipn12, aipn<iqj> aipn13, aipn<jlk> aipn14, aipn<hyz> aipn15, aipn<hyj> aipn16, aipn<hyq> aipn17, aipn<iha> aipn18, ajwy<isc> ajwy2, aipn<SettingsHttpInterface> aipn19, aipn<ixk> aipn20, aipn<tnj> aipn21, aipn<ftl> aipn22, aipn<iqe> aipn23, ajwy<iyl> ajwy3, aipn<iyv> aipn24, aipn<ilv> aipn25, ajwy<isa> ajwy4, ajwy<jkd> ajwy5) {
        idd callsite = irc.t.callsite("IdentityApi");
        this.a = zgb.a(callsite);
        this.b = aipn;
        this.c = ((SnapDb) aipn.get()).getDbClient(callsite);
        this.j = aipn2;
        this.k = aipn3;
        this.l = aipn4;
        this.d = aipn5;
        this.e = aipn6;
        this.g = aipn7;
        this.h = aipn8;
        this.i = aipn9;
        this.m = aipn10;
        this.n = aipn11;
        this.o = ajwy;
        this.p = aipn12;
        this.q = aipn13;
        this.r = aipn14;
        this.s = aipn15;
        this.t = aipn16;
        this.u = aipn17;
        this.v = aipn18;
        this.w = ajwy2;
        this.f = aipn19;
        this.x = aipn20;
        this.y = aipn21;
        this.z = aipn22;
        this.A = aipn23;
        this.B = ajwy3;
        this.C = aipn24;
        this.D = aipn25;
        this.E = ajwy4;
        this.F = ajwy5;
    }

    private ajdx<aext> a(aext aext) {
        return ajdx.c(new -$$Lambda$iyz$DlVPz1PgqwTQFVc0a9AbUoMhSxY(this)).f(new -$$Lambda$iyz$yKcUH7taVzD6yinAgBoeL2dtTmA(this, aext));
    }

    private <T> ajdx<b<T>> a(akxa<T> akxa, Class<T> cls) {
        String str = "response empty";
        if (akxa.c()) {
            return ajdx.b(new Exception(str));
        }
        akws akws = akxa.a;
        if (akws == null) {
            return ajdx.b(new Exception(str));
        }
        akrk akrk = new akrk(akxa.a.a.k);
        akrk akrk2 = new akrk(akxa.a.a.l);
        if (akws.a.c()) {
            Object obj = akws.b;
            return obj != null ? ajdx.b(new b(akws.a.c, obj, akrk, akrk2)) : ajdx.b(new Exception(str));
        } else {
            akhw akhw = akws.c;
            if (akhw == null) {
                return ajdx.b(new Exception(str));
            }
            try {
                return ajdx.b(new b(akws.a.c, ((iha) this.v.get()).a.a.fromJson(akhw.f(), (Class) cls), akrk, akrk2));
            } catch (Exception unused) {
                return ajdx.b(new Exception("couldn't parse body"));
            }
        }
    }

    private ajdx<b<aert>> a(b<aert> bVar) {
        aert aert = (aert) bVar.b;
        ((hyq) this.u.get()).a(aert.J, aert.M, "register");
        return ajdx.b((Object) bVar);
    }

    private ajeb<aecw> a(aecw aecw) {
        return ((iib) this.g.get()).b().f(new -$$Lambda$iyz$oAWUWj_KWYRfhYG6prl6Agzn-Kk(aecw));
    }

    private void a(Throwable th) {
    }

    private static /* synthetic */ ahcb b(String str, String str2, ahcb.b bVar, c cVar) {
        ahcb ahcb = new ahcb();
        ahcb.c = str;
        ahcb.b = str2;
        ahcb.a = a.UPDATEPHONENUMBER.a();
        ahcb.e = bVar.a();
        ahcb.f = Boolean.valueOf(cVar == c.IN_APP_FORGOT_PASSWORD_TYPE);
        ahcb.d = Boolean.TRUE;
        ahcb.g = cVar.a();
        return ahcb;
    }

    private static /* synthetic */ ahcr b(List list, List list2, List list3, List list4, Map map) {
        ahcr ahcr = new ahcr();
        ahcr.a = list;
        ahcr.b = list2;
        ahcr.c = list3;
        ahcr.d = list4;
        ahcr.e = map;
        return ahcr;
    }

    private ajdx<aecw> b(aecw aecw) {
        aecw.m = s();
        return ajdx.b((Object) aecw);
    }

    private ajdx<b<ahcd>> b(b<ahcd> bVar) {
        if (((ahcd) bVar.b).b.booleanValue()) {
            ((tnj) this.y.get()).b().a(jic.PHONE_VERIFICATION_SMS_FORMAT, ((ahcd) bVar.b).e).b();
        }
        return ajdx.b((Object) bVar);
    }

    private /* synthetic */ ahft e(String str, String str2) {
        ahft ahft = new ahft();
        ahft.d = str;
        ahft.c = "verifyPhoneNumber";
        ahft.e = ahft.a.TWO_FA_TYPE.a();
        ahft.g = null;
        ahft.i = Boolean.FALSE;
        Pair a = ((abna) this.o.get()).a(str2, ahft.C, ahft.D);
        if (a != null) {
            ahft.a = (String) a.first;
            ahft.b = (String) a.second;
        }
        return ahft;
    }

    private static /* synthetic */ ahdz f(String str, String str2, String str3) {
        ahdz ahdz = new ahdz();
        ahdz.b = str;
        ahdz.c = str2;
        ahdz.d = str3;
        return ahdz;
    }

    private static /* synthetic */ ahfa f(String str, String str2) {
        ahfa ahfa = new ahfa();
        ahfa.a = "requestTwoFactorCode";
        ahfa.E = str;
        ahfa.b = str2;
        return ahfa;
    }

    private aemx s() {
        aemx aemx = new aemx();
        String a = ((ixj) this.j.get()).a();
        if (a == null) {
            a = "";
        }
        aemx.a = a;
        if (((ftl) this.z.get()).a(jic.IS_INCOMING_FRIENDS_DELTA_SYNC_ENABLED)) {
            aemx.c = ((ftl) this.z.get()).j(jic.ADDED_FRIENDS_SYNC_TOKEN);
        }
        return aemx;
    }

    private /* synthetic */ ick t() {
        return ((hyz) this.s.get()).a("register");
    }

    private static /* synthetic */ agxu v() {
        agxu agxu = new agxu();
        agxu.c = agxu.a.DELETEALL.a();
        return agxu;
    }

    private static /* synthetic */ agxu w() {
        agxu agxu = new agxu();
        agxu.c = agxu.a.LIST.a();
        return agxu;
    }

    private static /* synthetic */ ahed x() {
        ahed ahed = new ahed();
        ahed.a = izg.LIST.mServerActionName;
        return ahed;
    }

    private /* synthetic */ List y() {
        return ((ixj) this.j.get()).c();
    }

    public final ajcx a(isu isu) {
        ahed ahed = new ahed();
        ahed.a = izg.HIDE_UNIT.mServerActionName;
        ahed.h = isu.a.getLocation();
        return ((IdentityHttpInterface) this.e.get()).submitSuggestedFriendsAction(ahed).b((ajdw) this.a.g()).c(new -$$Lambda$iyz$9uptV9lzRE6iovGC9X1FkE7Uoro(this)).h(-$$Lambda$iyz$0Am6Ph99nfofXllqX9WtNqJy0ao.INSTANCE).d();
    }

    public final ajcx a(String str, String str2) {
        ((iyv) this.C.get()).a(ixt.SET_DISPLAY_NAME, str, null, null, null);
        agzq agzq = new agzq();
        agzq.a = ixt.SET_DISPLAY_NAME.serverActionName;
        agzq.b = str;
        agzq.h = str2;
        return ((IdentityHttpInterface) this.e.get()).submitFriendAction(agzq).b((ajdw) this.a.g()).c(new -$$Lambda$iyz$Mhz3z143-J2AoWIYFIblKb6vwpA(this, str2, str)).d(-$$Lambda$iyz$UWX33mgDp_Y9k3grj8RBQE4soYU.INSTANCE).d();
    }

    public final ajcx a(List<String> list, FriendSuggestionPlacement friendSuggestionPlacement, Long l) {
        ixq ixq = (ixq) this.l.get();
        long longValue = l.longValue();
        akcr.b(list, "topSuggestedFriendIds");
        akcr.b(friendSuggestionPlacement, "friendSuggestionPlacement");
        return ixq.a.runInTransaction("TopSuggestedFriendRepository:applyUpdates", new ixq.a(ixq, list, friendSuggestionPlacement, longValue));
    }

    public final ajcx a(Map<Long, String> map) {
        hwl hwl = (hwl) this.h.get();
        akcr.b(map, "friendKeyToUsernameMap");
        return hwl.a(new MultiAddFriendDurableJob(new ixw(map)));
    }

    public final ajcx a(boolean z) {
        return ((ftl) this.z.get()).b(jic.ALL_UPDATES_CHECKSUM_ENABLED).a(new -$$Lambda$iyz$64g9B-N9lOvEXzh9i1EsgXajx88(this)).f(new -$$Lambda$iyz$BXm8hPltlQcBP95EJgASOTV6Or0(z)).a(new -$$Lambda$iyz$5BAhCjXZFz81QIoBKyhLqEWJrsI(this)).a(new -$$Lambda$iyz$HGxZUxDtSIhBJGWnDzPezFiHsy8(this)).a(new -$$Lambda$iyz$1E1y_k17W0p9yCCzluyrw8_bU-U(this)).b((ajdw) this.a.g()).d();
    }

    public final ajdx<agyk> a(Uri uri) {
        aipn aipn = this.e;
        aipn.getClass();
        return ajdx.c(new -$$Lambda$b80GggLgQBWY39DhcCio9MKhwyg(aipn)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$v12qpvbf-FB5Duw5zYe3kpjor9Y(uri)).f(-$$Lambda$rqcTV7quJ12fI5dFkIULQdByqB4.INSTANCE);
    }

    public final ajdx<ahef> a(FriendSuggestionPlacement friendSuggestionPlacement, long j, List<ira.a> list, List<ira.a> list2) {
        return ajdx.c(new -$$Lambda$iyz$A9r1X3ocVizTbIJmKeZHZYOsYiM(this, list2, new ArrayList(), new ArrayList(), list, new ArrayList(), friendSuggestionPlacement, j)).a(new -$$Lambda$iyz$UyxT9MVttV7uUAsBDoxNuHL5Fbg(this)).b((ajdw) this.a.g()).h(-$$Lambda$iyz$lNphhy8h5Hzf_tIl008ZI0eoLuA.INSTANCE);
    }

    public final ajdx<b<agyu>> a(iqp iqp, String str, String str2) {
        iyl iyl = (iyl) this.B.get();
        Object h = ajdx.c((Callable) new iyl.b(iyl)).a(1).b((ajdw) ((zfw) iyl.a.b()).f()).a((ajfc) iyl.c.a).h(d.a);
        akcr.a(h, "Single.fromCallable { Ad…lType))\n                }");
        return h.a((ajdw) this.a.g()).f(new -$$Lambda$iyz$0564OIrxzEo-82UUyBLnqTf6MaQ(iqp, str2, str)).a(new -$$Lambda$iyz$h6JG4rd4vRRgJHJP_xKwmk8ThSE(this, iqp)).a(new -$$Lambda$iyz$4-4H0fHLTFTJSPAo6n_pe_ABjFk(this)).c(new -$$Lambda$iyz$c6gY13SWjvrbwcEheiK_c1QoS68(this, iqp)).d(new -$$Lambda$iyz$WvORPsEla6KM_UdA5BdIoXDML8Q(this, iqp));
    }

    public final ajdx<agzs> a(isj isj) {
        String toLowerCase = isj.e.name().toLowerCase(Locale.US);
        ((iyv) this.C.get()).a(ixt.ADD, isj.a, isj.c, isj.d, toLowerCase);
        return ajdx.c(new -$$Lambda$iyz$WUiKPhRABV3KC0Vl-XtfraMgHQk(isj, toLowerCase)).a(new -$$Lambda$iyz$tD29iMq8gVDj_bbiWzxp4qUxhro(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler());
    }

    public final ajdx<agzs> a(isl isl) {
        ((iyv) this.C.get()).a(ixt.BLOCK, isl.b, null, null, null);
        return ajdx.c(new -$$Lambda$iyz$XihEblBTBJX6C3eALHdXfEL_kAQ(isl)).a(new -$$Lambda$iyz$M7kHQghdJvwdQw6EV_TqePre4Ck(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler()).c(new -$$Lambda$iyz$sZMKKdOefuLwTskrDSfkAPiJCvo(this, isl)).d(-$$Lambda$iyz$Wv5AH3EKZyUQU2r5V5JsV9QgmMk.INSTANCE).a(ajvo.a(ajsn.a));
    }

    public final ajdx<ahef> a(ist ist) {
        return ajdx.c(new -$$Lambda$iyz$S0_oF0lfmOE3oGjVyYEBxKSVQkA(ist)).a(new -$$Lambda$iyz$6FWa9x0UASS8dCjKs8kGQZhuS_M(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler());
    }

    public final ajdx<agzs> a(isv isv) {
        ((iyv) this.C.get()).a(ixt.IGNORE, isv.a, null, null, null);
        return ajdx.c(new -$$Lambda$iyz$aYOwev0mQFJG9y78gqc_he1y4l4(isv)).a(new -$$Lambda$iyz$DPptX7IIqCJUhOJTM-hhUVtZP1E(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler());
    }

    public final ajdx<agzs> a(isz isz) {
        return ajdx.c(new -$$Lambda$iyz$VMtC0QuMJVnQV5Z6yHlZU90u6T8(isz)).a(new -$$Lambda$iyz$Fes5EY4SZYI72NKCW1xi1UIkI4U(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler());
    }

    public final ajdx<agzs> a(itc itc) {
        ((iyv) this.C.get()).a(ixt.DELETE, itc.a, null, null, null);
        return ajdx.c(new -$$Lambda$iyz$omU6jmBapCW6LsywmnZ5wj1oeno(itc)).a(new -$$Lambda$iyz$dxobp2vDiVPG4Z_Q-ZKkFPDyEa0(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler());
    }

    public final ajdx<agzs> a(itf itf) {
        ((iyv) this.C.get()).a(ixt.UNBLOCK, itf.b, null, null, null);
        return ajdx.c(new -$$Lambda$iyz$GmT_rs3fNCh778W9Hbd98WRoPdw(itf)).a(new -$$Lambda$iyz$04UrLWu8REfLXcAmSKXvqIc0yfg(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler()).c(new -$$Lambda$iyz$t3qA0HQKF9BjpL0hqvt-c7Ad1P0(this, itf)).d(-$$Lambda$iyz$bleoDvP1ZuehKowY-qK93xpg-LU.INSTANCE).a(ajvo.a(ajsn.a));
    }

    public final ajdx<agzs> a(String str) {
        Object agzs = new agzs();
        agzs.d = Boolean.FALSE;
        return ((gpb) this.i.get()).c().e().f(new -$$Lambda$iyz$SQ9hSl9RrVQ71yt4axGif86OCKM(this, str)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$wDrRbVjI7SUlIvjjiLSM6vrjoEU(this)).a(new -$$Lambda$iyz$EEOFTFYzCrzVrmXr38WO9Yn-EbE(this, str)).d(-$$Lambda$iyz$uvapEsRk9AvYP-bl-jzrPjcSnJA.INSTANCE).c(agzs);
    }

    public final ajdx<akxa<aekb>> a(String str, aeka aeka, String str2) {
        aejy aejy = new aejy();
        if (aeka != null) {
            aejy.a = Integer.valueOf(aeka.a());
        }
        aejy.b = str2;
        return ajdx.b(new aemt()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$AjLaGwUAjHqE3OLBjmyXV23412E(str, aejy)).a(new -$$Lambda$iyz$dCvWTIgY5ZeJAtAyNoZs_Nz5VNc(this));
    }

    public final ajdx<b<ahfv>> a(String str, ahft.a aVar) {
        return ajdx.c(new -$$Lambda$iyz$d5hqqsrE0OTuGWNO5Lho48So-TI(str, aVar)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$dgEeg3JMVOvREi523a7ZgFqqoCQ(this)).a(new -$$Lambda$iyz$CIAv4Lk_n8oO6PCIBVvSImc2skg(this));
    }

    public final ajdx<b<ahcd>> a(String str, String str2, ahcb.b bVar, c cVar) {
        return ajdx.c(new -$$Lambda$iyz$kc_vPLauSMP-u6J1I0bOr_yMFxA(str2, str, bVar, cVar)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$cprD3axWyAonDRjcPgGtieonD6U(this)).a(new -$$Lambda$iyz$zxzwcihhTUlE4nNeTH1QKeGz8rA(this)).a(new -$$Lambda$iyz$ykQaIjREbNdNttUcP5SuLy3Li3I(this));
    }

    public final ajdx<b<aheb>> a(String str, String str2, String str3) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(str2);
        Preconditions.checkNotNull(str3);
        return ajdx.c(new -$$Lambda$iyz$x7i2DJjEZP_PJzM8TQCmDt7nVGs(str, str2, str3)).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$osR3d7uDQQp_a_EcWOAjFf71r2w(this)).a(new -$$Lambda$iyz$_JmRGsizdpVyjYHsv7SSTcA2O4Y(this)).a(new -$$Lambda$iyz$uDUOQZGPuCg3LwhBexkTIFMuFnM(this));
    }

    public final ajdx<b<ahcd>> a(String str, String str2, String str3, ahcb.b bVar, String str4) {
        Preconditions.checkArgument(abps.b(str2) ^ 1);
        Preconditions.checkArgument(abps.b(str) ^ 1);
        Preconditions.checkArgument(abps.b(str3) ^ 1);
        Preconditions.checkNotNull(bVar);
        return ajdx.b(new ahfx()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$bJNxcFjJDHkKeUX4G_ApfpUAYlQ(str2, str, bVar, str3, str4)).f(new -$$Lambda$iyz$wYcVaYBqxueiciWt_kaNwsTcxRI(this)).a(new -$$Lambda$iyz$7RKlXX_-8_xplpCkfeTAgAsP9lk(this)).a(new -$$Lambda$iyz$cyJK-CDDicU4Vw9fO5CBLBQVtmM(this)).a(new -$$Lambda$iyz$ykQaIjREbNdNttUcP5SuLy3Li3I(this));
    }

    public final ajdx<b<ahcd>> a(String str, String str2, String str3, String str4, String str5, ahcb.b bVar) {
        Preconditions.checkArgument(abps.b(str) ^ 1);
        Preconditions.checkArgument(abps.b(str3) ^ 1);
        Preconditions.checkArgument(abps.b(str2) ^ 1);
        Preconditions.checkArgument(abps.b(str4) ^ 1);
        Preconditions.checkArgument(abps.b(str5) ^ 1);
        Preconditions.checkNotNull(bVar);
        return ajdx.b(new ahfx()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$0TllEfvJhz2mU3WLZ-XSNZwN-so(str3, str2, bVar, str5, str4, str)).f(new -$$Lambda$iyz$LoyKe8U3P5eubCIUsLswBOT-5q4(this)).a(new -$$Lambda$iyz$4kG9oC7vx3R1ahyQAr5XF-8QGoc(this)).a(new -$$Lambda$iyz$6qR_0wjSBOn5p0dm4YYJSeaCMns(this)).a(new -$$Lambda$iyz$ykQaIjREbNdNttUcP5SuLy3Li3I(this));
    }

    public final ajdx<iql> a(String str, String str2, String str3, String str4, String str5, String str6, isf isf) {
        isf isf2 = isf;
        return ajdx.c(new -$$Lambda$iyz$0pSbYjUgNED_PqwxfNpIvDQtAQo(this, isf, str, str2, str3, str4, str5, str6)).a(new -$$Lambda$iyz$kE-taNkIs_pphbOXKpjrCiJR9DA(this)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$hKT_5ZrHxsXWkneUGk9jsInekyw(this, isf2)).a(new -$$Lambda$iyz$7SeMMJaiq6wbUTZhS4bAff7nHCM(this, isf2)).d(new -$$Lambda$iyz$lMlBGYAfX9dcErnHEXqpiNlQNYY(this)).a(new -$$Lambda$iyz$xGPNgt72KINh4_J4IpGHt6AQ2Q8(this)).a((ajdw) this.a.h()).a(new -$$Lambda$iyz$peFfXwJ_lsBiNkyrfjShNBq9Smw(this));
    }

    public final ajdx<akxa<ahdx>> a(String str, List<Boolean> list, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Boolean booleanValue : list) {
            stringBuilder.append(booleanValue.booleanValue() ? SCamera.CAMERA_ID_FRONT : "0");
        }
        return ajdx.b(new ahdv()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$M5u-vxQ6-qBLVEjURbjzAmX3P4g(str, str2, stringBuilder)).a(new -$$Lambda$iyz$-baJj4hnob7rJbO6mh_yCC_kaS4(this));
    }

    public final ajdx<aepa> a(GregorianCalendar gregorianCalendar, boolean z) {
        Object aepa = new aepa();
        aepa.b = Boolean.FALSE;
        return ((gpb) this.i.get()).c().e().f(new -$$Lambda$iyz$Av407AZk6yXHMoQPRJ_P19BezOA(gregorianCalendar, z)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$B93GpTOAu0YMoOV0qNumd9ktGuk(this)).a(new -$$Lambda$iyz$2GCJiW6JjtMgFg7eR0gbotpNFkE(this, gregorianCalendar, aepa)).d(-$$Lambda$iyz$mqwgaW1AIetYL_vcBzadzCmseKM.INSTANCE).c(aepa);
    }

    public final ajdx<akxa<Void>> a(List<String> list, List<String> list2, List<String> list3, List<String> list4, Map<String, String> map) {
        return ajdx.c(new -$$Lambda$iyz$DGknolRE7QVMnTa1JMCWTio8-Kg(list, list2, list3, list4, map)).a(new -$$Lambda$iyz$lgWLvUXGS2WPloOvl8SZNAW4ThU(this)).b((ajdw) this.a.g()).h(-$$Lambda$iyz$Khoxfu0qMj5h2JvaVZu49ntesA8.INSTANCE);
    }

    public final String a() {
        return ((isc) this.w.get()).a();
    }

    public final ajcx b() {
        return ajdx.c(-$$Lambda$42y-hdLkGDhGfCimtf3L8ODKMzY.INSTANCE).a(new -$$Lambda$iyz$3ww00jPm1BKC3JXO4CA37axprkg(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler()).e(new -$$Lambda$iyz$Am39Wu9gWIRJW7UqczOx9vz_nIU(this));
    }

    public final ajdx<b<ahdj>> b(String str) {
        return ajdx.c(new -$$Lambda$iyz$__93NMFHeVizEaNplziFhAvpVuY(str)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$tCD_U0mXab_ww-IkCq1kwn12c68(this)).a(new -$$Lambda$iyz$obEaKucUQrKsyFQHSmcEzwhWSWs(this));
    }

    public final ajdx<ahao> b(String str, String str2) {
        return ajdx.c(new -$$Lambda$iyz$3B6BDaObr-mdW9UvX2KqrAiTXHU(str2, str)).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$AaxTSKIePiTiTFBnrfqybKcnfMs(this)).a(new -$$Lambda$iyz$UsTBC3OIQMU9aNCpPLfqOlhx3Yg(this)).a(-$$Lambda$iyz$CHauK0ic2dVYdfAS7HPIPyD53TQ.INSTANCE);
    }

    public final ajdx<ahro> b(String str, String str2, String str3) {
        ajdx b = ajdx.b(new ahrm()).f(new -$$Lambda$iyz$UoGXR7H6fFRb0ivnCzi8CQCGfZQ(str, str2, str3)).b((ajdw) this.a.g());
        whj whj = (whj) this.m.get();
        whj.getClass();
        return b.f(new -$$Lambda$_Oprri5QCeyg0OopdhPVw-HF15U(whj)).a(new -$$Lambda$iyz$02L-XCC-hMeS6KVpgiJRtk0vVRQ(this)).h(new -$$Lambda$iyz$EdTccckDLoBVO3-8XKRRAm6rdc0(this));
    }

    public final ajdx<akxa<aexn>> b(boolean z) {
        return ajdx.b(new aexl()).f(new -$$Lambda$iyz$sLSGxMpRHaD4Sge4UDb_lmYJmXg(z)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$8ixKPLBmKGT5ruP1DSqI6VLiTA8(this));
    }

    public final ajcx c() {
        return ajdx.b(new aemv()).a((ajdw) this.a.f()).f(new -$$Lambda$iyz$haTbSjLdgzYRWPyzu6vUT52BmvY(this)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$EWQb4X3Js1P01zt1qmoF8lbFqb4(this)).a(((SnapDb) this.b.get()).scheduler()).e(new -$$Lambda$iyz$RE0rTJ5XoLbVYNUeqh0gKRJx6U0(this));
    }

    public final ajdx<akxa<ahcj>> c(String str) {
        ahch ahch = new ahch();
        ahch.a = str;
        return ((AuthHttpInterface) this.d.get()).reauth(ahch);
    }

    public final ajdx<b<ahfv>> c(String str, String str2) {
        return ajdx.c(new -$$Lambda$iyz$ca10IroTNkyxeZGjLce2pHeQ9Jc(this, str, str2)).a((ajdw) this.a.g()).a(new -$$Lambda$iyz$nZoUuKHbzLHQxUk6pAszBBHgH60(this)).a(new -$$Lambda$iyz$dcW5AMKdndyOA4-iZkmZuSienCg(this)).c(new -$$Lambda$iyz$7fZ97E2lxv-sx2qLv8SROgEUmDw(this));
    }

    public final ajdx<akxa<aexn>> c(String str, String str2, String str3) {
        return ajdx.b(new aexl()).f(new -$$Lambda$iyz$N9VaKD_Xt4N3f98MxuGtV5CoYZk(this, str2, str, str3)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$onuYJxcOpd0TtfXGzDF0dcJRAjk(this)).c(new -$$Lambda$iyz$mEqHOiwiJ1ze_IZH--L_pDXacJQ(this));
    }

    public final ajdx<Boolean> c(boolean z) {
        return ajdx.c(new -$$Lambda$iyz$y8HH7IgER0bSW1YYyXOUkkD-WYo(z)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$d6BJUUg9RAqrxM9oQpdbXhHmuEg(this)).f(new -$$Lambda$iyz$U5ZsQZsxyT6rGzt7dYgxtmAOKE8(this, z));
    }

    public final ajcx d() {
        return ajdx.c(new -$$Lambda$iyz$5EN9YuadjaWtRWqf3fnV3NM62oQ(this)).b(((SnapDb) this.b.get()).scheduler()).f(-$$Lambda$iyz$uymiDSRgNaaYFfPfSSO3PkeY5D4.INSTANCE).a((ajdw) this.a.g()).a(new -$$Lambda$iyz$ny6m9SzMvPiT2UyiLox16eg7E30(this)).a(((SnapDb) this.b.get()).scheduler()).e(new -$$Lambda$iyz$T2fSUg6UYHs6pzX25Dri0x1Heic(this));
    }

    public final ajdx<b<aheb>> d(String str) {
        return ajdx.c(new -$$Lambda$iyz$7ft74BJzfhTqEMr53LWrXGVVLuE(str)).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$sjQUlEjqD-lZLrSrDrBjDHSktEA(this)).a(new -$$Lambda$iyz$_uzYAHSKdeuOwCqNDGk6Ww1IWFY(this)).a(new -$$Lambda$iyz$OcNV5rdRIctOcg39iVAZt31h2Xo(this));
    }

    public final ajdx<akxa<aexn>> d(String str, String str2) {
        return ((gpb) this.i.get()).c().e().a(new -$$Lambda$iyz$wqJKrX-OD1ugBrMFl6XZGA_MACE(this, str, str2)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$sRz-0kdPrCNo-nYckh4RdmAV2yc(this)).c(new -$$Lambda$iyz$XEegib0TQMP82RQM8EC3k9R06FA(this));
    }

    public final ajdx<ahac> d(String str, String str2, String str3) {
        return ajdx.b(new agzy()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$4M_zsFiEYeI3J4dXYnSxjAWeSIs(str3, str2, str)).f(new -$$Lambda$iyz$HJkT_3qWh7E4Ey7DWrUfx8_mnsQ(this)).a(new -$$Lambda$iyz$X6tg0rBiy8iwVsHl6qxUXH-q644(this));
    }

    public final ajcx e() {
        return ajdx.c(-$$Lambda$iyz$qRhVl_w_0bQTMry_cyKEXmZiYpU.INSTANCE).a(new -$$Lambda$iyz$gVP5_HQGFsJEdabey-AO74g9B30(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler()).e(new -$$Lambda$iyz$nPzilDuG-DAGruawh1-HVsrH94I(this));
    }

    public final ajdx<String> e(String str) {
        return ((whk) this.p.get()).a(str, IdentityHttpInterface.PATH_REGISTER).b((ajdw) this.a.g());
    }

    public final ajdx<akxa<ahao>> e(String str, String str2, String str3) {
        return ajdx.b(new agxo()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$hOusQtse_8NCgm74emuKFzxzZQw(str3, str2, str)).f(new -$$Lambda$iyz$awkEzuIPU-PEBh3d6LvRhgqNgDw(this)).a(new -$$Lambda$iyz$iHpuqs4SCntCfPxfHRX5tb-VIUw(this));
    }

    public final ajcx f() {
        ixq ixq = (ixq) this.l.get();
        return ixq.a.runInTransaction("TopSuggestedFriendRepository:purge", new ixq.c(ixq));
    }

    public final ajdx<akxa<ahao>> f(String str) {
        return ajdx.b(new agxq()).f(new -$$Lambda$iyz$0jQfzeOV-vpNfaIyqo8mROTYkgU(str)).a((ajdw) this.a.g()).a(new -$$Lambda$iyz$3LcxDbotIFNpLG2V8YSEag4_5yE(this));
    }

    public final ajdx<agxw> g() {
        return ajdx.c(-$$Lambda$iyz$zAxABMNOzlKFB4fzOfLSQ5dVGzU.INSTANCE).a(new -$$Lambda$iyz$cNVbzISCWm-ou8jfcSNVpd9iQiE(this)).b((ajdw) this.a.g());
    }

    public final ajdx<ahac> g(String str) {
        return ajdx.b(new ahaa()).f(new -$$Lambda$iyz$x_WjwAACjvlLX4QF8-CBKE7qgpc(str)).a((ajdw) this.a.g()).a(new -$$Lambda$iyz$urR2PMJ5tjYeqXvUArg3h1mmRrE(this));
    }

    public final ajdx<agxw> h() {
        return ajdx.c(-$$Lambda$iyz$ewWP_HaymD59egLwc4t4sgiu684.INSTANCE).a(new -$$Lambda$iyz$40jedVHf--XNAGZPvZlIKsFRsw4(this)).b((ajdw) this.a.g()).a(((SnapDb) this.b.get()).scheduler()).c(new -$$Lambda$iyz$54ZIcjIHNL1uvSic_vepw-DvVSw(this));
    }

    public final ajdx<akxa<aexn>> h(String str) {
        return ajdx.b(new aexl()).f(new -$$Lambda$iyz$6nDUrzmln4yglUqbIKXXRoEFKIU(str)).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$_c3jCIVW-naN4Ftfou4JcB1-Pzo(this));
    }

    public final ajdx<akxa<aepa>> i() {
        return ((gpb) this.i.get()).c().e().f(-$$Lambda$iyz$_gi7lKjQJIscN2tPo4zAyYE_0JM.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$61_EJxhYBiXEGQMozl15emm9dfM(this));
    }

    public final ajdx<akxa<agzo>> i(String str) {
        return ajdx.b(new agzm()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$Daf1f4zghw6SlfRFyJaUk1VmNVM(str)).a(new -$$Lambda$iyz$aPCkGvDDWVp7BQAdWjGprjS-Dmg(this));
    }

    public final ajdx<String> j() {
        return ajdx.c(-$$Lambda$iyz$d3_Qnuq1JvkgAe7frd16n6Gtny0.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$o4IHUEJp8nb6BnHyeWH7UufFVAo(this)).f(new -$$Lambda$iyz$0l6E1hslzBmwxzLNM6dhgtpmG5w(this)).d(-$$Lambda$iyz$RA0D8gTx2dSTvbrIzz2SQ5csRdc.INSTANCE);
    }

    public final ajdx<akxa<akhw>> j(String str) {
        return ajdx.b(new aedh()).b((ajdw) this.a.g()).f(new -$$Lambda$iyz$83rY944boYMwgc0-FcqUgTdJg2Q(str)).a(new -$$Lambda$iyz$B1ycEDGBbzuB37JBF_yofdQj2fA(this));
    }

    public final ajdx<akxa<aexn>> k() {
        return ajdx.b(new aexl()).f(-$$Lambda$iyz$S6xhsaIQkH3fRjoPCR_U6p1d1PQ.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$5jlvmqsKYxpV6C6D4oYQJRCy9g0(this)).c(new -$$Lambda$iyz$lib7qgYN7TRJPeQ5Ndz0H3DlJn8(this));
    }

    public final ajdx<akxa<aexn>> l() {
        return ajdx.b(new aexl()).f(-$$Lambda$iyz$B06McDiW13lShw5D_jXMbybrPUY.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$XagP2MD4eqvdoxAAmXSNtd7gSiI(this)).c(new -$$Lambda$iyz$IPJsNzdpHRhXaZVzUmrcmhIxTJg(this));
    }

    public final ajdx<akxa<aexn>> m() {
        return ajdx.b(new aexl()).f(-$$Lambda$iyz$ieu7fHFJT39GyDEvGv_Al0YM3JM.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$Qeu8qaviGtA98KQNLp7K31esUDE(this));
    }

    public final ajdx<akxa<ahao>> n() {
        return ajdx.b(new aedh()).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$Uz5KVwuh0O9bpbNU7cs32HrOkGU(this));
    }

    public final ajdx<akxa<aexn>> o() {
        return ajdx.b(new aexl()).f(-$$Lambda$iyz$In69dLMvBzF7aLeV1LGiZPctiRQ.INSTANCE).b((ajdw) this.a.g()).a(new -$$Lambda$iyz$ho4jgy_Exy2FYOneiEuiA0vOw9c(this)).f(new -$$Lambda$iyz$M-HG1aaodP-sRkasEnu80DwUV5k(this));
    }

    public final ajdp<Boolean> p() {
        isa isa = (isa) this.E.get();
        jkd jkd = (jkd) this.F.get();
        akcr.b(isa, "userSegmentApi");
        akcr.b(jkd, "dataProvider");
        Object i = isa.a().i();
        akcr.a(i, "userSegmentApi.isInNewUserSegment().toObservable()");
        Object i2 = isa.b().i();
        akcr.a(i2, "userSegmentApi.isInChurn…rSegment().toObservable()");
        ajdp a = ajdp.a((ajdt) i, (ajdt) i2, (ajdt) jkd.e(), (ajfd) new izh.a());
        if (a == null) {
            akcr.a();
        }
        return a;
    }

    public final ajdp<Boolean> q() {
        Iterable arrayList = new ArrayList();
        for (jlk.c cVar : jlk.c.values()) {
            arrayList.add(ajwa.a(((ftl) this.z.get()).p(cVar.newCardKey), ((jlk) this.r.get()).a).p(new -$$Lambda$iyz$zlCYP3Kk-bg-5dORUlCM1IxIWpM(cVar)));
        }
        return ajdp.a(arrayList, -$$Lambda$iyz$X40VwNtktmrD6XQOuZngjH6R6xk.INSTANCE).b((ajdw) this.a.b());
    }

    public final ajdx<akxa<aekb>> r() {
        return ajdx.b(new aemt()).b((ajdw) this.a.g()).f(-$$Lambda$iyz$WITooVjeJd-0l7MnqxvodIaAmcE.INSTANCE).a(new -$$Lambda$iyz$2DEh_3XLiceSX222_RV9-talF-E(this));
    }
}
