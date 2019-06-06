package defpackage;

import com.snap.cognac.network.CognacHttpInterfaceV2;
import java.util.List;

/* renamed from: fan */
public final class fan {
    public aipn<CognacHttpInterfaceV2> a;
    public aipn<eyz> b;
    public zfw c;
    private final ajdx<String> d;

    public fan(aipn<eze> aipn) {
        this.d = ((eze) aipn.get()).a().a();
    }

    private /* synthetic */ ajdx b(String str, String str2, String str3) {
        CognacHttpInterfaceV2 cognacHttpInterfaceV2 = (CognacHttpInterfaceV2) this.a.get();
        aceb aceb = new aceb();
        if (str != null) {
            aceb.b = str;
            aceb.a |= 1;
            return cognacHttpInterfaceV2.createUserAppSession("https://cognac-prod.appspot.com/cognac-api/v2/CreateUserAppSession", str2, str3, aceb);
        }
        throw new NullPointerException();
    }

    private /* synthetic */ ajdx b(String str, List list, String str2, String str3) {
        acdv acdv = new acdv();
        if (str != null) {
            acdv.b = str;
            acdv.a |= 1;
            acdv.c = (String[]) list.toArray(new String[list.size()]);
            return ((CognacHttpInterfaceV2) this.a.get()).inviteFriends("https://cognac-prod.appspot.com/cognac-api/v2/InviteFriends", str2, str3, acdv);
        }
        throw new NullPointerException();
    }

    private /* synthetic */ ajdx c(String str, String str2, String str3) {
        accn a = new accn().a(str);
        accu accu = new accu();
        accu.a = a;
        return ((CognacHttpInterfaceV2) this.a.get()).getChatDock("https://cognac-prod.appspot.com/cognac-api/v2/GetChatDock", str2, str3, accu);
    }

    private /* synthetic */ ajdx d(String str, String str2, String str3) {
        CognacHttpInterfaceV2 cognacHttpInterfaceV2 = (CognacHttpInterfaceV2) this.a.get();
        accs accs = new accs();
        if (str != null) {
            accs.b = str;
            accs.a |= 1;
            return cognacHttpInterfaceV2.getAppInstanceAuthToken("https://cognac-prod.appspot.com/cognac-api/v2/GetAppInstanceAuthToken", str2, str3, accs);
        }
        throw new NullPointerException();
    }

    private /* synthetic */ ajdx e(String str, String str2, String str3) {
        CognacHttpInterfaceV2 cognacHttpInterfaceV2 = (CognacHttpInterfaceV2) this.a.get();
        accz accz = new accz();
        if (str != null) {
            accz.b = str;
            accz.a |= 1;
            return cognacHttpInterfaceV2.terminateAppInstance("https://cognac-prod.appspot.com/cognac-api/v2/TerminateAppInstance", str2, str3, accz);
        }
        throw new NullPointerException();
    }

    private /* synthetic */ ajdx f(String str, String str2, String str3) {
        CognacHttpInterfaceV2 cognacHttpInterfaceV2 = (CognacHttpInterfaceV2) this.a.get();
        acdd acdd = new acdd();
        if (str != null) {
            acdd.b = str;
            acdd.a |= 1;
            return cognacHttpInterfaceV2.getApp("https://cognac-prod.appspot.com/cognac-api/v2/GetApp", str2, str3, acdd);
        }
        throw new NullPointerException();
    }

    private static /* synthetic */ ajeb g(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ ajeb h(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ ajeb i(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ ajeb j(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ ajeb k(ajdx ajdx) {
        return ajdx;
    }

    private static /* synthetic */ ajeb l(ajdx ajdx) {
        return ajdx;
    }

    public final ajdx<acdg> a() {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$m-4SPRe_yc3c4CF9U4zRMUKP6RY(this)).a(-$$Lambda$fan$cx7aBKdKFDpxTxaDum-hA6OIOGQ.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<accx> a(accn accn, String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$5izhi0TQLN7-oTdJhJM0A2o4hxU(this, str, accn)).a(-$$Lambda$fan$oRWLobroO1s5c5Z_7ctqjQLC4xw.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acdb> a(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$e3byaDnFpprFn48g0wxNoXzuN1E(this, str)).a(-$$Lambda$fan$NFJuEfwxeEOCExQSSh9oxTDtFhc.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acdr> a(String str, String str2) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$lZO84rqfj3GqOBY1aJ0vqAgjpt4(this, str2, str)).a(-$$Lambda$fan$TyCggKLtqF6cEX2wmnuKdrusvxg.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acdw> a(String str, List<String> list) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$d7J1rPhax4IA6WkYdl0AIW5yOCc(this, str, list)).a(-$$Lambda$fan$YgqCVpnjOsmBpVgDXtXXKN0GohE.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<accp> a(List<String> list) {
        accn[] accnArr = new accn[list.size()];
        for (int i = 0; i < list.size(); i++) {
            accnArr[i] = new accn().a((String) list.get(i));
        }
        acco acco = new acco();
        acco.a = accnArr;
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$zSMSHI6NmhQSSm8kLoD6R2I_4CU(this, acco)).a(-$$Lambda$fan$urs3tXY0E4LwOichXC3YMxf2bzg.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acda> b(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$g1CF6ECfXTVGziS7XuR-xsPphFk(this, str)).a(-$$Lambda$fan$6Klp7mIJOa2kfrEAdIgLazVkiDw.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<Void> b(String str, List<String> list) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$J2niCHyqxjxNVyjDx411ejsCARg(this, str, list)).a(-$$Lambda$fan$uZrlNXfHrIKVRG7fxoDcU0wN3VE.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acct> c(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$gBVvKS6ez8WyUIDeucoO7RPC9Rk(this, str)).a(-$$Lambda$fan$oxmDWfcsGzbnS-BJOa0-QT0E4TE.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<accv> d(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$8YSiytch26Rnrq_Wkfmw8SBULyM(this, str)).a(-$$Lambda$fan$NnW5CbF5q0DvVo1fvOAlk9d0MXo.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<acec> e(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$yxZkclq1f60_zlgcQK0wFzIOdc0(this, str)).a(-$$Lambda$fan$hD5StkXM51WdIhz3worfLfP-zVk.INSTANCE).b((ajdw) this.c.g());
    }

    public final ajdx<Void> f(String str) {
        return ajdx.a(((eyz) this.b.get()).a(wjd.COGNAC), this.d, new -$$Lambda$fan$jYQdgJmMGZ37OFDP2xh6kFpw-N0(this, str)).a(-$$Lambda$fan$rYndpVowWxmx_XKNJsMxvWPVWpw.INSTANCE).b((ajdw) this.c.g());
    }
}
