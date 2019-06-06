package com.snapchat.client.network_api;

import com.snapchat.client.mdp_common.MediaContextType;
import com.snapchat.client.network.NetworkManager;
import com.snapchat.client.network_types.ConnectivityChangeNotifier;
import com.snapchat.client.network_types.DataSaverModeChangeNotifier;
import com.snapchat.client.network_types.Executor;
import com.snapchat.client.network_types.HttpRequest;
import com.snapchat.client.network_types.HttpRequestCallback;
import com.snapchat.client.network_types.HttpRequestKey;
import com.snapchat.client.network_types.HttpRequestProgressiveCallback;
import com.snapchat.client.network_types.RankingSignals;
import com.snapchat.client.network_types.UIPageInfo;
import com.snapchat.client.network_types.UiPageChangeNotifier;
import com.snapchat.client.network_types.UploadDataProvider;
import com.snapchat.client.network_types.UserLogOutNotifier;
import com.snapchat.client.shims.DataProviderFactory;
import com.snapchat.client.shims.Logger;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class NetworkApi {

    static final class CppProxy extends NetworkApi {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);
        private final long nativeRef;

        static {
            Class cls = NetworkApi.class;
        }

        private CppProxy(long j) {
            if (j != 0) {
                this.nativeRef = j;
                return;
            }
            throw new RuntimeException("nativeRef is zero");
        }

        private native void nativeDestroy(long j);

        private native void native_cancel(long j, HttpRequestKey httpRequestKey);

        private native void native_submit(long j, HttpRequest httpRequest, RankingSignals rankingSignals, Executor executor, HttpRequestProgressiveCallback httpRequestProgressiveCallback, HttpRequestCallback httpRequestCallback, UploadDataProvider uploadDataProvider);

        private native void native_update(long j, HttpRequestKey httpRequestKey, RankingSignals rankingSignals);

        private native void native_updateDefaultRankingOrder(long j, ArrayList<UIPageInfo> arrayList, UIPageInfo uIPageInfo, MediaContextType mediaContextType);

        public final void cancel(HttpRequestKey httpRequestKey) {
            native_cancel(this.nativeRef, httpRequestKey);
        }

        public final void destroy() {
            if (!this.destroyed.getAndSet(true)) {
                nativeDestroy(this.nativeRef);
            }
        }

        /* Access modifiers changed, original: protected|final */
        public final void finalize() {
            destroy();
            super.finalize();
        }

        public final void submit(HttpRequest httpRequest, RankingSignals rankingSignals, Executor executor, HttpRequestProgressiveCallback httpRequestProgressiveCallback, HttpRequestCallback httpRequestCallback, UploadDataProvider uploadDataProvider) {
            native_submit(this.nativeRef, httpRequest, rankingSignals, executor, httpRequestProgressiveCallback, httpRequestCallback, uploadDataProvider);
        }

        public final void update(HttpRequestKey httpRequestKey, RankingSignals rankingSignals) {
            native_update(this.nativeRef, httpRequestKey, rankingSignals);
        }

        public final void updateDefaultRankingOrder(ArrayList<UIPageInfo> arrayList, UIPageInfo uIPageInfo, MediaContextType mediaContextType) {
            native_updateDefaultRankingOrder(this.nativeRef, arrayList, uIPageInfo, mediaContextType);
        }
    }

    public static native NetworkApi createInstance(Logger logger, UiPageChangeNotifier uiPageChangeNotifier, DataSaverModeChangeNotifier dataSaverModeChangeNotifier, ConnectivityChangeNotifier connectivityChangeNotifier, UserLogOutNotifier userLogOutNotifier, NetworkManager networkManager, DataProviderFactory dataProviderFactory, boolean z);

    public abstract void cancel(HttpRequestKey httpRequestKey);

    public abstract void submit(HttpRequest httpRequest, RankingSignals rankingSignals, Executor executor, HttpRequestProgressiveCallback httpRequestProgressiveCallback, HttpRequestCallback httpRequestCallback, UploadDataProvider uploadDataProvider);

    public abstract void update(HttpRequestKey httpRequestKey, RankingSignals rankingSignals);

    public abstract void updateDefaultRankingOrder(ArrayList<UIPageInfo> arrayList, UIPageInfo uIPageInfo, MediaContextType mediaContextType);
}
