package defpackage;

import com.addlive.impl.video.AndroidVideoService;
import com.addlive.impl.video.VideoFrameReceiver;
import com.addlive.impl.video.VideoFrameReceiverLifecycle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yxy */
public final class yxy {
    final Map<VideoFrameReceiver, a> a = new ConcurrentHashMap();
    AndroidVideoService b;
    abjd c;
    final VideoFrameReceiverLifecycle d = new 1();

    /* renamed from: yxy$1 */
    class 1 implements VideoFrameReceiverLifecycle {
        1() {
        }

        public final void onReceiverActivated(VideoFrameReceiver videoFrameReceiver) {
            abjx aVar = new a(videoFrameReceiver);
            yxy.this.a.put(videoFrameReceiver, aVar);
            yxy.this.c.a(aVar);
        }

        public final void onReceiverDeactivated(VideoFrameReceiver videoFrameReceiver) {
            yxy.this.c.b((a) yxy.this.a.get(videoFrameReceiver));
            yxy.this.a.remove(videoFrameReceiver);
        }
    }

    /* renamed from: yxy$a */
    static class a implements abjx {
        private final VideoFrameReceiver a;

        public a(VideoFrameReceiver videoFrameReceiver) {
            this.a = videoFrameReceiver;
        }

        public final defpackage.abjx.a a() {
            return new defpackage.abjx.a(this.a.getInputSurface());
        }

        public final void b() {
            this.a.reset();
        }

        public final void c() {
            this.a.release();
        }
    }
}
