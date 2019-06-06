package com.snap.composer.bundle;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Looper;
import com.snap.composer.logger.Logger;
import com.snap.composer.utils.ByteBufferUtils;
import com.snap.composer.utils.IScheduler;
import com.snapchat.client.composer.Bundle;
import com.snapchat.client.composer.BundleManager;
import com.snapchat.client.shims.DataProvider;
import defpackage.ajxw;
import defpackage.akax;
import defpackage.akbk;
import defpackage.akcr;
import defpackage.akcs;
import defpackage.akdd.e;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

public final class BundleManagerImpl extends BundleManager {
    private final AssetManager a = this.c.getAssets();
    private final Logger b;
    private final Context c;
    private final IScheduler d;

    static final class a extends akcs implements akbk<BundleManagerImpl$loadBundleContent$1$1> {
        private /* synthetic */ BundleManagerImpl a;
        private /* synthetic */ String b;

        a(BundleManagerImpl bundleManagerImpl, String str) {
            this.a = bundleManagerImpl;
            this.b = str;
            super(0);
        }

        private BundleManagerImpl$loadBundleContent$1$1 a() {
            Throwable th;
            Throwable th2;
            try {
                Closeable open = this.a.a.open(this.b);
                try {
                    Object obj = (InputStream) open;
                    ByteBufferUtils byteBufferUtils = ByteBufferUtils.INSTANCE;
                    akcr.a(obj, "it");
                    ByteBuffer fromStream = byteBufferUtils.fromStream(obj);
                    akax.a(open, null);
                    return new BundleManagerImpl$loadBundleContent$1$1(fromStream);
                } catch (Throwable th22) {
                    Throwable th3 = th22;
                    th22 = th;
                    th = th3;
                }
                akax.a(open, th22);
                throw th;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }

        public final /* synthetic */ Object invoke() {
            return a();
        }
    }

    static final class b extends akcs implements akbk<ajxw> {
        private /* synthetic */ e a;
        private /* synthetic */ akbk b;
        private /* synthetic */ CountDownLatch c;

        b(e eVar, akbk akbk, CountDownLatch countDownLatch) {
            this.a = eVar;
            this.b = akbk;
            this.c = countDownLatch;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            try {
                this.a.a = this.b.invoke();
                return ajxw.a;
            } finally {
                this.c.countDown();
            }
        }
    }

    public BundleManagerImpl(Logger logger, Context context, IScheduler iScheduler) {
        akcr.b(logger, "logger");
        akcr.b(context, "context");
        akcr.b(iScheduler, "scheduler");
        this.b = logger;
        this.c = context;
        this.d = iScheduler;
    }

    public final Bundle loadBundle(String str) {
        return null;
    }

    public final DataProvider loadBundleContent(String str) {
        akcr.b(str, "bundleName");
        akbk aVar = new a(this, str);
        Object currentThread = Thread.currentThread();
        Object mainLooper = Looper.getMainLooper();
        akcr.a(mainLooper, "Looper.getMainLooper()");
        if (akcr.a(currentThread, mainLooper.getThread())) {
            e eVar = new e();
            eVar.a = null;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.d.schedule(new b(eVar, aVar, countDownLatch));
            countDownLatch.await();
            currentThread = eVar.a;
            if (currentThread == null) {
                akcr.a();
            }
        } else {
            currentThread = aVar.invoke();
        }
        return (DataProvider) currentThread;
    }

    public final boolean shouldUnloadBundle(Bundle bundle) {
        return false;
    }
}
