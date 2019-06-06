package defpackage;

import com.brightcove.player.event.Event;
import java.util.List;

/* renamed from: qzs */
public final class qzs extends hmk<rdt> {
    private final hmg b;

    /* renamed from: qzs$a */
    static final class a extends akcq implements akbl<hoz, hmj> {
        a(qzs qzs) {
            super(1, qzs);
        }

        public final String getName() {
            return "toPrefetchStoryModel";
        }

        public final akej getOwner() {
            return akde.a(qzs.class);
        }

        public final String getSignature() {
            return "toPrefetchStoryModel(Lcom/snap/discoverfeed/shared/impression/FeedImpressionEvent;)Lcom/snap/discoverfeed/prefetch/Story;";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            hoz hoz = (hoz) obj;
            akcr.b(hoz, "p1");
            zmy zmy = hoz.c;
            if (!(zmy instanceof rdt)) {
                zmy = null;
            }
            rdt rdt = (rdt) zmy;
            if (rdt != null) {
                String e;
                if (rdt.f() && akcr.a(rdt.h(), Boolean.FALSE)) {
                    e = rdt.e();
                    if (e == null) {
                        akcr.a();
                    }
                    return new hmj(e, false, rdt.L.friendStoryFirstUnviewedSnapId(), hoz.a, hoz.a(), hmp.FRIEND, rdt);
                } else if (rdt.d() && akcr.a(rdt.L.storyViewed(), Boolean.FALSE)) {
                    e = rdt.e();
                    if (e == null) {
                        akcr.a();
                    }
                    return new hmj(e, false, rdt.L.storyFirstUnviewedSnapId(), hoz.a, hoz.a(), hmp.FRIEND, rdt);
                }
            }
            return null;
        }
    }

    public qzs(hmg hmg, hmo<rdt> hmo, hmm hmm, zfw zfw) {
        akcr.b(hmg, "snapshot");
        akcr.b(hmo, "downloader");
        akcr.b(hmm, Event.CONFIGURATION);
        akcr.b(zfw, "schedulers");
        super(hmg, hmo, hmm, zfw);
        this.b = hmg;
    }

    public final void a(List<? extends hoz> list) {
        akcr.b(list, aqd.a);
        List d = akfh.d(akfh.d(ajyu.v(list), new a(this)));
        if ((d.isEmpty() ^ 1) == 0) {
            d = null;
        }
        if (d != null) {
            this.b.a(hmh.FF_FRIEND, d);
        }
    }
}
