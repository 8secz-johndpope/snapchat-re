package defpackage;

import android.text.TextUtils;
import com.snap.scan.scannable.ScannableHttpInterface;
import defpackage.vve.a;
import defpackage.vve.b;
import defpackage.vve.c;
import defpackage.vve.d;
import defpackage.vve.e;
import defpackage.vve.f;
import defpackage.vve.g;
import defpackage.vve.h;
import defpackage.vve.i;
import defpackage.vve.k;
import defpackage.vve.l;
import defpackage.vve.m;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: vva */
public final class vva implements vvf {
    public iib a;
    public ajdx<iha> b;
    private final aipn<ScannableHttpInterface> c;
    private final aipn<ftl> d;
    private final zfw e = zfy.a(vpg.e.callsite("DefaultScannableQueryTask"));

    public vva(aipn<ScannableHttpInterface> aipn, aipn<ftl> aipn2) {
        zfy zfy = new zfy("Camera");
        this.c = aipn;
        this.d = aipn2;
    }

    private vvh a(ahov ahov, String str, int i) {
        ahov ahov2 = ahov;
        String str2 = str;
        if (!ahov2.a.isEmpty()) {
            try {
                for (ahmc ahmc : ahov2.a) {
                    String str3;
                    if (ahmc.b.equalsIgnoreCase(ahlu.ADD_FRIEND.a())) {
                        str3 = (String) akly.c(ahov2.b, "scan-add_friend");
                        ahmj ahmj = (ahmj) ((iha) this.b.b()).a(ahmc.c, ahmj.class);
                        vve vve = r5;
                        vve bVar = new b(ahmj.a, ahmj.b, ahmj.c, ahmj.d, ahmj.g, ahmj.f, ahmj.e, Boolean.TRUE.equals(ahmj.h), false, false, false, str3);
                        return new vvh(str3, str2, vve);
                    } else if (ahmc.b.equalsIgnoreCase(ahlu.UNLOCKABLE.a())) {
                        aenr aenr = (aenr) ((iha) this.b.b()).a(ahmc.c, aenr.class);
                        if (aenr.ak == null || aenr.ak.a == null) {
                            aenr.ak = new aibc();
                            aenr.ak.a = vwy.a(i, str2);
                        }
                        ftl ftl = (ftl) this.d.get();
                        int i2 = 1;
                        Object obj = (ftl.a(vsg.TWEAK_ENABLE_CREATOR_PROFILE) && ftl.a(vsg.TWEAK_OVERRIDE_CREATORS_PROFILE_ID_WITH_TEST_ID) && aenr.u.booleanValue()) ? 1 : null;
                        if (!(obj == null || aenr.v == null)) {
                            aenr.v.E = "d962f97f-54cf-4f3f-95fc-311d6286e4f7";
                            aenr.v.F = Boolean.FALSE;
                        }
                        while (i2 < ahov2.a.size() && aenr.u.booleanValue()) {
                            aenr = (aenr) ((iha) this.b.b()).a(((ahmc) ahov2.a.get(i2)).c, aenr.class);
                            i2++;
                        }
                        return new vvh((String) akly.c(ahov2.b, "scan-unlockable"), str2, new k(aenr, ahmc.a));
                    } else {
                        int i3 = i;
                        if (ahmc.b.equalsIgnoreCase(ahlu.MARCO_ACTION.a())) {
                            return new vvh((String) akly.c(ahov2.b, "scan-product"), str2, new i(ahmc.a, ((ahmr) ((iha) this.b.b()).a(ahmc.c, ahmr.class)).a));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.UNLOCKABLE_STICKER.a())) {
                            return new vvh((String) akly.c(ahov2.b, "scan-unlockable-sticker"), str2, new l((ahnf) ((iha) this.b.b()).a(ahmc.c, ahnf.class)));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.AD_CREATIVE_PREVIEW.a())) {
                            return new vvh((String) akly.c(ahov2.b, "ad"), str2, new a((ahmh) ((iha) this.b.b()).a(ahmc.c, ahmh.class)));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.DEEP_LINK.a())) {
                            return new vvh((String) akly.c(ahov2.b, "scan-deeplink"), str2, new c((ahmn) ((iha) this.b.b()).a(ahmc.c, ahmn.class)));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.MESSAGE.a())) {
                            str3 = (String) akly.c(ahov2.b, "scan-message");
                            return new vvh(str3, str2, new h((ahmt) ((iha) this.b.b()).a(ahmc.c, ahmt.class), str3));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.URL_ONLY.a())) {
                            return new vvh((String) akly.c(ahov2.b, "scan-url_only"), str2, new m.b(((ahnh) ((iha) this.b.b()).a(ahmc.c, ahnh.class)).a));
                        } else if (ahmc.b.equalsIgnoreCase(ahlu.OPEN_URL.a())) {
                            return new vvh((String) akly.c(ahov2.b, "scan-open_url"), str2, new m.a(((ahmz) ((iha) this.b.b()).a(ahmc.c, ahmz.class)).c));
                        }
                    }
                }
            } catch (Exception e) {
                return a(e);
            }
        }
        return new vvh((String) akly.c(ahov2.b, "scan-no_support"), str2, d.a);
    }

    private vvh a(Throwable th) {
        String str = "";
        return new vvh("scan-error", str, new e(str, th));
    }

    private static /* synthetic */ void b(String str, int i) {
    }

    private static /* synthetic */ void b(String str, int i, ahov ahov) {
    }

    public final ajdx<vvh> a(String str, int i) {
        if (i != 2) {
            String a = vwy.a(i, str);
            vvg vvg = new vvg(i);
            TextUtils.isEmpty(null);
            vvg.a("create");
            return this.a.b().a(new -$$Lambda$vva$GS1eOGUVMutKfDu_1L1RYUA6iVM(this, vvg, a)).c(new -$$Lambda$vva$5vb_sBMRZebzlX0BdwZ_QVWCiMM(str, i)).c(new -$$Lambda$vva$0RQW0XF7VNmJ6FvtQeR-TRjs580(str, i)).a((ajdw) this.e.g()).f(new -$$Lambda$vva$bJWcx2OulNvrfevTK35mj8ILf4E(this, str, i)).d(new -$$Lambda$vva$vGYUGTD-clUlSfWLYmWPuEDd6kU(str, i)).g(new -$$Lambda$vva$6Ke2qqDj8ojvoQaAXFb6B3-TDtk(this));
        } else if (str.isEmpty()) {
            return ajdx.b(new vvh("scan-studio-unpair", str, g.a));
        } else {
            String a2 = vwy.a(str);
            akcr.b(a2, "receiver$0");
            Object compile = Pattern.compile("(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})", 0);
            akcr.a(compile, "java.util.regex.Pattern.compile(this, flags)");
            Object uuid = UUID.fromString(compile.matcher(a2).replaceAll("$1-$2-$3-$4-$5")).toString();
            akcr.a(uuid, "UUID.fromString(pattern.…$2-$3-$4-$5\")).toString()");
            return ajdx.b(new vvh("scan-studio-pair", str, new f(uuid)));
        }
    }
}
