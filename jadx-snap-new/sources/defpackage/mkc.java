package defpackage;

import com.brightcove.player.model.Video.Fields;
import com.looksery.sdk.LSCoreManagerWrapper;
import com.looksery.sdk.domain.EventData;
import com.looksery.sdk.listener.AnalyticsListener;
import com.snap.core.db.record.LocalMessageActionModel;
import defpackage.mjf.b;
import java.util.Map;

/* renamed from: mkc */
public final class mkc implements mjf {
    final ajws<b> a;
    private final ajxe b = ajxh.a(new a(this));

    /* renamed from: mkc$1 */
    static final class 1 extends akcs implements akbl<LSCoreManagerWrapper, ajxw> {
        final /* synthetic */ mkc a;

        /* renamed from: mkc$1$a */
        public static final class a implements AnalyticsListener {
            private /* synthetic */ 1 a;

            a(1 1) {
                this.a = 1;
            }

            public final void onAnalyticsReady(Map<String, Object> map) {
                akcr.b(map, LocalMessageActionModel.ANALYTICS);
            }

            public final void onContentChanged(String str) {
                akcr.b(str, Fields.CONTENT_ID);
            }

            public final void onLensEventsReady(EventData[] eventDataArr) {
                Object obj = eventDataArr;
                akcr.b(obj, "eventsDatas");
                for (Object obj2 : obj) {
                    ajws ajws = this.a.a.a;
                    akcr.b(obj2, "receiver$0");
                    Object interactionName = obj2.getInteractionName();
                    akcr.a(interactionName, "interactionName");
                    int count = obj2.getCount();
                    int maxTimeCount = obj2.getMaxTimeCount();
                    double totalTime = obj2.getTotalTime();
                    double maxTime = obj2.getMaxTime();
                    Object interactionValue = obj2.getInteractionValue();
                    akcr.a(interactionValue, "interactionValue");
                    ajws.a((Object) new defpackage.mjf.b.a(interactionName, count, maxTimeCount, totalTime, maxTime, interactionValue, obj2.getSequence(), obj2.isFrontFacedCamera()));
                }
            }
        }

        1(mkc mkc) {
            this.a = mkc;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            LSCoreManagerWrapper lSCoreManagerWrapper = (LSCoreManagerWrapper) obj;
            akcr.b(lSCoreManagerWrapper, "receiver$0");
            lSCoreManagerWrapper.setAnalyticsListener(new a(this));
            return ajxw.a;
        }
    }

    /* renamed from: mkc$a */
    static final class a extends akcs implements akbk<ajdp<b>> {
        private /* synthetic */ mkc a;

        a(mkc mkc) {
            this.a = mkc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.a.a.f();
        }
    }

    static {
        new aken[1][0] = new akdc(akde.a(mkc.class), "reports", "getReports()Lio/reactivex/Observable;");
    }

    public mkc(mkx mkx) {
        akcr.b(mkx, "lensCore");
        Object r = new ajwo().r();
        akcr.a(r, "PublishSubject.create<An….Report>().toSerialized()");
        this.a = r;
        mkx.c(new 1(this));
    }

    public final ajdp<b> a() {
        return (ajdp) this.b.b();
    }
}
