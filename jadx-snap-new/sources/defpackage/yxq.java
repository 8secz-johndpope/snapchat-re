package defpackage;

import android.os.Handler;
import com.snapchat.talkcorev3.AsyncTask;
import com.snapchat.talkcorev3.TalkCoreDelegate;

/* renamed from: yxq */
public final class yxq extends TalkCoreDelegate {
    private final yxv a;
    private final Handler b;

    public yxq(yxv yxv, Handler handler) {
        this.a = yxv;
        this.b = handler;
    }

    private static /* synthetic */ void a(AsyncTask asyncTask) {
        try {
            asyncTask.run();
        } catch (Exception unused) {
        }
    }

    public final void postDelayedInMainThread(AsyncTask asyncTask, long j) {
        this.b.postDelayed(new -$$Lambda$yxq$qdH7lGMU60BvKXgShH5TLiXsj34(asyncTask), j);
    }
}
