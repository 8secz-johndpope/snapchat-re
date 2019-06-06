package defpackage;

import com.brightcove.player.media.ErrorFields;

/* renamed from: qev */
public final class qev implements pqs {
    final adqo a;

    /* renamed from: qev$a */
    static final class a<T> implements ajea<T> {
        private /* synthetic */ qev a;
        private /* synthetic */ aeie b;

        a(qev qev, aeie aeie) {
            this.a = qev;
            this.b = aeie;
        }

        public final void subscribe(final ajdy<psn> ajdy) {
            akcr.b(ajdy, "it");
            this.a.a.a(this.b, new qqe() {
                public final void onWriteCompleted(psd psd, String str) {
                    ajdy ajdy = ajdy;
                    akcr.a((Object) psd, "status");
                    ajdy.a(new psn(psd, str));
                }
            });
        }
    }

    public qev(adqo adqo) {
        akcr.b(adqo, "chatService");
        this.a = adqo;
    }

    public final ajdx<psn> a(aeie aeie) {
        akcr.b(aeie, ErrorFields.MESSAGE);
        Object a = ajdx.a((ajea) new a(this, aeie));
        akcr.a(a, "Single.create {\n        …)\n            }\n        }");
        return a;
    }
}
