package defpackage;

import com.brightcove.player.event.Event;
import defpackage.rzu.b;

/* renamed from: ght */
public final class ght implements gfx {
    final ryw<ryz> a;

    /* renamed from: ght$a */
    static final class a<T> implements ajea<T> {
        private /* synthetic */ ght a;
        private /* synthetic */ ryz b;
        private /* synthetic */ b c;

        /* renamed from: ght$a$a */
        static final class a implements defpackage.ryw.a {
            private /* synthetic */ a a;
            private /* synthetic */ ajdy b;

            a(a aVar, ajdy ajdy) {
                this.a = aVar;
                this.b = ajdy;
            }

            public final void onComplete(sat<sai> sat) {
                Object obj = this.b;
                akcr.a(obj, Event.EMITTER);
                if (!obj.isDisposed()) {
                    Object sat2;
                    ajdy ajdy = this.b;
                    akcr.a((Object) sat2, "result");
                    Object a = sat2.a();
                    String str = "originalResult.response";
                    akcr.a(a, str);
                    a = (sai) a.g();
                    if (a != null) {
                        akcr.a(a, "originalResult.response.… ?: return originalResult");
                        a = sbg.a(a.b(), a.c(), a.d(), defpackage.sbe.a.a(a.e()));
                        akcr.a(a, "Payloads.create(\n       …lPayload.asByteStream()))");
                        Object a2 = sat2.a();
                        akcr.a(a2, str);
                        sat2 = sbk.a((sat) sat2, a2.f().a(a).a(), sat2.c());
                        akcr.a(sat2, "Results.create(originalR…ginalResult.responseInfo)");
                    }
                    ajdy.a(sat2);
                }
            }
        }

        a(ght ght, ryz ryz, b bVar) {
            this.a = ght;
            this.b = ryz;
            this.c = bVar;
        }

        public final void subscribe(ajdy<sat<sai>> ajdy) {
            akcr.b(ajdy, Event.EMITTER);
            final Object a = this.a.a.a(this.b, new a(this, ajdy));
            akcr.a(a, "networkManager.submit(re…          }\n            }");
            b bVar = this.c;
            if (bVar != null) {
                a.a(bVar);
            }
            ajdy.a((ajfa) new ajfa() {
                public final void cancel() {
                    a.b();
                }
            });
        }
    }

    public ght(ryw<ryz> ryw) {
        akcr.b(ryw, "networkManager");
        this.a = ryw;
    }

    public final ajdx<sat<sai>> a(ryz ryz, b bVar) {
        akcr.b(ryz, "request");
        Object a = ajdx.a((ajea) new a(this, ryz, bVar));
        akcr.a(a, "Single.create { emitter …ller.cancel() }\n        }");
        return a;
    }
}
