package defpackage;

import com.brightcove.player.event.Event;

/* renamed from: gek */
public final class gek {

    /* renamed from: gek$a */
    static final class a<T, R> implements ajfc<T, ajeb<? extends R>> {
        public static final a a = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            final gej gej = (gej) obj;
            akcr.b(gej, "result");
            return ajdx.a((ajea) new ajea<T>() {
                public final void subscribe(ajdy<T> ajdy) {
                    akcr.b(ajdy, Event.EMITTER);
                    if (gej.a()) {
                        ajdy.a(gej);
                        return;
                    }
                    try {
                        Object obj = gej;
                        akcr.a(obj, "result");
                        obj = obj.e();
                        akcr.a(obj, "result.failureReason");
                        ajdy.b(new gex(null, obj.c(), 1));
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public static final <T extends gej> ajdx<T> a(ajdx<T> ajdx, igm<T> igm) {
        akcr.b(ajdx, "receiver$0");
        akcr.b(igm, "backoff");
        Object a = ajdx.a((ajfc) a.a).a((ajec) igm);
        akcr.a(a, "this.flatMap { result ->… }\n    }.compose(backoff)");
        return a;
    }
}
