package com.looksery.sdk;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

final class SensorThreadManager {
    private static final String SENSOR_THREAD_NAME = "LookserySensorThread";
    private boolean mIsRunning;
    private final List<SensorEventListener> mRegisteredListeners = new ArrayList();
    private final SensorEventListener mSensorEventListener = new SensorEventListener() {
        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0026 in {6, 8, 11} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public void onAccuracyChanged(android.hardware.Sensor r4, int r5) {
            /*
            r3 = this;
            r0 = com.looksery.sdk.SensorThreadManager.this;
            r0 = r0.mRegisteredListeners;
            monitor-enter(r0);
            r1 = com.looksery.sdk.SensorThreadManager.this;	 Catch:{ all -> 0x0023 }
            r1 = r1.mRegisteredListeners;	 Catch:{ all -> 0x0023 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0023 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0021;	 Catch:{ all -> 0x0023 }
            r2 = r1.next();	 Catch:{ all -> 0x0023 }
            r2 = (android.hardware.SensorEventListener) r2;	 Catch:{ all -> 0x0023 }
            r2.onAccuracyChanged(r4, r5);	 Catch:{ all -> 0x0023 }
            goto L_0x0011;	 Catch:{ all -> 0x0023 }
            monitor-exit(r0);	 Catch:{ all -> 0x0023 }
            return;	 Catch:{ all -> 0x0023 }
            r4 = move-exception;	 Catch:{ all -> 0x0023 }
            monitor-exit(r0);	 Catch:{ all -> 0x0023 }
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.SensorThreadManager$AnonymousClass1.onAccuracyChanged(android.hardware.Sensor, int):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:12:0x0026 in {6, 8, 11} preds:[]
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
            	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.util.ArrayList.forEach(ArrayList.java:1257)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:32)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
            	at java.lang.Iterable.forEach(Iterable.java:75)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
            	at jadx.core.ProcessClass.process(ProcessClass.java:37)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
            */
        public void onSensorChanged(android.hardware.SensorEvent r4) {
            /*
            r3 = this;
            r0 = com.looksery.sdk.SensorThreadManager.this;
            r0 = r0.mRegisteredListeners;
            monitor-enter(r0);
            r1 = com.looksery.sdk.SensorThreadManager.this;	 Catch:{ all -> 0x0023 }
            r1 = r1.mRegisteredListeners;	 Catch:{ all -> 0x0023 }
            r1 = r1.iterator();	 Catch:{ all -> 0x0023 }
            r2 = r1.hasNext();	 Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0021;	 Catch:{ all -> 0x0023 }
            r2 = r1.next();	 Catch:{ all -> 0x0023 }
            r2 = (android.hardware.SensorEventListener) r2;	 Catch:{ all -> 0x0023 }
            r2.onSensorChanged(r4);	 Catch:{ all -> 0x0023 }
            goto L_0x0011;	 Catch:{ all -> 0x0023 }
            monitor-exit(r0);	 Catch:{ all -> 0x0023 }
            return;	 Catch:{ all -> 0x0023 }
            r4 = move-exception;	 Catch:{ all -> 0x0023 }
            monitor-exit(r0);	 Catch:{ all -> 0x0023 }
            throw r4;
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.looksery.sdk.SensorThreadManager$AnonymousClass1.onSensorChanged(android.hardware.SensorEvent):void");
        }
    };
    private Looper mSensorLooper;
    private final SensorManager mSensorManager;

    SensorThreadManager(SensorManager sensorManager) {
        this.mSensorManager = sensorManager;
    }

    /* Access modifiers changed, original: final */
    public final void registerListener(SensorEventListener sensorEventListener) {
        synchronized (this.mRegisteredListeners) {
            this.mRegisteredListeners.add(sensorEventListener);
        }
    }

    /* Access modifiers changed, original: final */
    public final void start(Collection<Sensor> collection) {
        if (!this.mIsRunning && !collection.isEmpty()) {
            final Collection unmodifiableCollection = Collections.unmodifiableCollection(collection);
            AnonymousClass2 anonymousClass2 = new HandlerThread(SENSOR_THREAD_NAME) {
                /* Access modifiers changed, original: protected */
                public void onLooperPrepared() {
                    Handler handler = new Handler(Looper.myLooper());
                    for (Sensor registerListener : unmodifiableCollection) {
                        SensorThreadManager.this.mSensorManager.registerListener(SensorThreadManager.this.mSensorEventListener, registerListener, 0, handler);
                    }
                }
            };
            anonymousClass2.start();
            this.mSensorLooper = anonymousClass2.getLooper();
            this.mIsRunning = true;
        }
    }

    /* Access modifiers changed, original: final */
    public final void stop() {
        if (this.mIsRunning) {
            this.mSensorManager.unregisterListener(this.mSensorEventListener);
            this.mSensorLooper.quit();
            this.mSensorLooper = null;
            this.mIsRunning = false;
        }
    }

    /* Access modifiers changed, original: final */
    public final void unregisterListener(SensorEventListener sensorEventListener) {
        synchronized (this.mRegisteredListeners) {
            this.mRegisteredListeners.remove(sensorEventListener);
        }
    }
}
