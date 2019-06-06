package defpackage;

import android.text.TextUtils;
import com.snap.discoverfeed.shared.net.StoriesHttpInterface;

/* renamed from: hpt */
public final class hpt implements hpv {
    private final aipn<hpm> a;
    private final aipn<StoriesHttpInterface> b;
    private final zfw c = zgb.a(hbn.f, "RetroStoriesNetworkApi");
    private final ajwy<hoy> d;
    private final ajwy<hpu> e;

    public hpt(aipn<hpm> aipn, aipn<StoriesHttpInterface> aipn2, ajwy<hoy> ajwy, ajwy<hpu> ajwy2) {
        this.a = aipn;
        this.b = aipn2;
        this.d = ajwy;
        this.e = ajwy2;
    }

    private ajdx<vik> b(hpw hpw) {
        return ajdx.c(new -$$Lambda$hpt$FU9CkD-di8_WC6gsZLpBZ1SCdBg(this, hpw)).b((ajdw) this.c.f());
    }

    private /* synthetic */ vik c(hpw hpw) {
        hpm hpm = (hpm) this.a.get();
        akcr.b(hpw, "query");
        vik vik = new vik();
        vik.e = 1;
        vik.c |= 4;
        int i = hpo.a[hpw.a - 1];
        int i2 = 2;
        if (i == 1) {
            i2 = 1;
        } else if (i != 2) {
            throw new ajxk();
        }
        vik.g = i2;
        vik.c |= 8;
        vik.f = hpm.a();
        String uuid = abpu.a().toString();
        if (uuid != null) {
            vik.d = uuid;
            vik.c = 1 | vik.c;
            hpm.b.get();
            vik.a(System.currentTimeMillis());
            vcy vcy = hpw.b;
            if (vcy == null) {
                String str = hpw.c;
                if (!TextUtils.isEmpty(str)) {
                    vik.a = 7;
                    vik.b = str;
                }
            } else if (vcy != null) {
                vik.a = 6;
                vik.b = vcy;
            } else {
                throw new NullPointerException();
            }
            vik.a(System.currentTimeMillis());
            return vik;
        }
        throw new NullPointerException();
    }

    public final ajdx<vim> a(hpw hpw) {
        return ((hoy) this.d.get()).j().a(new -$$Lambda$hpt$QnLoxW5GyKT6sXFKdCF8p8Ha_ms(this, hpw));
    }

    public final ajdx<agmh> a(String str) {
        agmf agmf = new agmf();
        agmf.a = str;
        return ((StoriesHttpInterface) this.b.get()).sharedPublisherSnapLinkableCheck(juk.c, str, agmf).f(-$$Lambda$mg7TTPEuCV3Bre-Nves0-7NM-WE.INSTANCE).b((ajdw) this.c.f());
    }

    public final ajdx<viz> a(String str, String str2, int i) {
        StoriesHttpInterface storiesHttpInterface = (StoriesHttpInterface) this.b.get();
        this.a.get();
        akcr.b(str, "storyId");
        akcr.b(str2, "destinationId");
        viy viy = new viy();
        if (str != null) {
            viy.d = str;
            viy.a |= 4;
            viy.e = str2;
            viy.a |= 8;
            viy.b = 1;
            viy.a = 1 | viy.a;
            viy.c = i;
            viy.a |= 2;
            return storiesHttpInterface.shareStoriesUrl(vdm.a("/sharing/create", viy)).f(-$$Lambda$s3csaAeLkQimmg2O1u6M-MuGL4Q.INSTANCE);
        }
        throw new NullPointerException();
    }
}
