package defpackage;

import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventType;
import com.looksery.sdk.audio.AudioPlaybackService;
import com.looksery.sdk.audio.ScenariumAudioPlaybackService;
import defpackage.mjh.a;

/* renamed from: mkd */
public final class mkd implements mjh {
    final AudioPlaybackService a;
    final ScenariumAudioPlaybackService b;
    private final ajxe c = ajxh.a(ajxj.PUBLICATION, new a(this));
    private final ajxe d = ajxh.a(ajxj.PUBLICATION, new b(this));

    /* renamed from: mkd$a */
    static final class a extends akcs implements akbk<mid<? super Object, ajxw>> {
        final /* synthetic */ mkd a;

        /* renamed from: mkd$a$1 */
        static final class 1 extends akcs implements akbl<Object, ajxw> {
            private /* synthetic */ a a;

            1(a aVar) {
                this.a = aVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                this.a.a.a.stopAll();
                this.a.a.b.closeAll();
                return ajxw.a;
            }
        }

        a(mkd mkd) {
            this.a = mkd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return mif.a((akbl) new 1(this));
        }
    }

    /* renamed from: mkd$b */
    static final class b extends akcs implements akbk<mid<? super a, ajxw>> {
        final /* synthetic */ mkd a;

        /* renamed from: mkd$b$1 */
        static final class 1 extends akcs implements akbl<a, ajxw> {
            private /* synthetic */ b a;

            1(b bVar) {
                this.a = bVar;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                a aVar = (a) obj;
                akcr.b(aVar, "volumeAdjust");
                this.a.a.a.setVolume(aVar.a, aVar.b);
                this.a.a.b.setMasterVolume(aVar.a, aVar.b);
                return ajxw.a;
            }
        }

        b(mkd mkd) {
            this.a = mkd;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return mif.a((akbl) new 1(this));
        }
    }

    static {
        aken[] akenArr = new aken[]{new akdc(akde.a(mkd.class), EventType.STOP, "getStop()Lcom/snap/lenses/common/Operation;"), new akdc(akde.a(mkd.class), Event.VOLUME, "getVolume()Lcom/snap/lenses/common/Operation;")};
    }

    public mkd(AudioPlaybackService audioPlaybackService, ScenariumAudioPlaybackService scenariumAudioPlaybackService) {
        akcr.b(audioPlaybackService, "legacyAudioPlaybackService");
        akcr.b(scenariumAudioPlaybackService, "scenariumAudioPlaybackService");
        this.a = audioPlaybackService;
        this.b = scenariumAudioPlaybackService;
    }

    public final mid<Object, ajxw> a() {
        return (mid) this.c.b();
    }

    public final mid<a, ajxw> b() {
        return (mid) this.d.b();
    }
}
