package com.brightcove.player.event;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.Thread.State;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class BackgroundEventListener implements EventListener {
    static final String a = "BackgroundEventListener";
    ExecutorService b;
    a c;
    private Runnable d = new Runnable() {
        public final void run() {
            Looper.prepare();
            BackgroundEventListener backgroundEventListener = BackgroundEventListener.this;
            backgroundEventListener.c = new a(backgroundEventListener);
            Looper.loop();
        }
    };

    static class a extends Handler {
        private final WeakReference<BackgroundEventListener> a;

        a(BackgroundEventListener backgroundEventListener) {
            this.a = new WeakReference(backgroundEventListener);
        }

        static String a(int i) {
            return i != 1 ? i != 2 ? null : "MESSAGE_PROCESS_EVENT" : "MESSAGE_SHUTDOWN";
        }

        public final void a(Message message) {
            Looper looper = getLooper();
            String str = "(";
            String str2 = "Unable to send message of type ";
            if (looper == null) {
                String str3 = BackgroundEventListener.a;
                StringBuilder stringBuilder = new StringBuilder(str2);
                stringBuilder.append(a(message.what));
                stringBuilder.append(str);
                stringBuilder.append(message.what);
                stringBuilder.append(") safely as looper is null");
                Log.w(str3, stringBuilder.toString());
                return;
            }
            Thread thread = looper.getThread();
            if (thread.getState() == State.RUNNABLE) {
                sendMessage(message);
                return;
            }
            String str4 = BackgroundEventListener.a;
            StringBuilder stringBuilder2 = new StringBuilder(str2);
            stringBuilder2.append(a(message.what));
            stringBuilder2.append(str);
            stringBuilder2.append(message.what);
            stringBuilder2.append(") safely as thread's state is ");
            stringBuilder2.append(thread.getState());
            Log.w(str4, stringBuilder2.toString());
        }

        @TargetApi(18)
        public final void handleMessage(Message message) {
            BackgroundEventListener backgroundEventListener = (BackgroundEventListener) this.a.get();
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    backgroundEventListener.backgroundProcessEvent((Event) message.obj);
                }
                return;
            }
            if (VERSION.SDK_INT >= 18) {
                getLooper().quitSafely();
            } else {
                getLooper().quit();
            }
            if (!(backgroundEventListener.b == null || backgroundEventListener.b.isShutdown())) {
                backgroundEventListener.b.shutdown();
            }
            backgroundEventListener.c = null;
        }
    }

    public BackgroundEventListener() {
        a();
    }

    private void a() {
        ExecutorService executorService = this.b;
        if (executorService == null || executorService.isShutdown()) {
            this.b = Executors.newSingleThreadExecutor();
            this.b.execute(this.d);
        }
    }

    private void a(int i, Object obj) {
        a();
        long currentTimeMillis = System.currentTimeMillis();
        while (this.c == null) {
            if (System.currentTimeMillis() - currentTimeMillis >= 500) {
                break;
            }
        }
        a aVar = this.c;
        if (aVar == null) {
            String str = a;
            StringBuilder stringBuilder = new StringBuilder("Unable to send message of type ");
            stringBuilder.append(a.a(i));
            stringBuilder.append("(");
            stringBuilder.append(i);
            stringBuilder.append(") because there is no background handler.");
            Log.w(str, stringBuilder.toString());
            return;
        }
        this.c.a(aVar.obtainMessage(i, obj));
    }

    public abstract void backgroundProcessEvent(Event event);

    public void destroyBackgroundThread() {
        a(1, null);
    }

    public final void processEvent(Event event) {
        a(2, event);
    }
}
