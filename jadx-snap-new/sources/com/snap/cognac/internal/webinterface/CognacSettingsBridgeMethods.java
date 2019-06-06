package com.snap.cognac.internal.webinterface;

import android.content.res.Resources;
import android.text.TextUtils;
import com.brightcove.player.event.EventType;
import com.google.common.collect.ImmutableSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.record.DiscoverStorySnapModel;
import com.snapchat.android.R;
import com.snapchat.bridgeWebview.Message;
import defpackage.acbq;
import defpackage.acbq.a;
import defpackage.acct;
import defpackage.acdr;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.exz;
import defpackage.eym;
import defpackage.eyo;
import defpackage.eyq;
import defpackage.eyr;
import defpackage.eyu;
import defpackage.fan;
import defpackage.fdd;
import defpackage.fgb;
import defpackage.fgm;
import defpackage.fgo;
import defpackage.fgz;
import defpackage.fha;
import defpackage.fha.b;
import defpackage.fhb;
import defpackage.fhh;
import defpackage.fhi;
import defpackage.fhk;
import defpackage.fhl;
import defpackage.zfw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CognacSettingsBridgeMethods extends fgz {
    private static final double COGNAC_CURRENT_CLIENT_VERSION = 2.0190415E7d;
    private static final String TAG = "CognacSettingsBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("initialize", "fetchAuthToken", "deepLinkToLens", "presentPrivacyPolicy", "presentTermsOfService");
    private final exz mAlertService;
    private final String mAppId;
    private String mAppInstanceId;
    private final String mAppName;
    private final String mContext;
    private final fgb mConversation;
    private final aipn<eyo> mFragmentService;
    private final boolean mHasPuppyBuilds;
    protected boolean mIsMuted;
    private final boolean mIsPuppyApp;
    private final eyq mLensListener;
    private final eyr mLensService;
    private List<SnapCanvasInitializeListener> mListeners = new ArrayList();
    private final eyu mNavigationController;
    private final fan mNetworkHandlerV2;
    private String mPrivacyPolicyUrl;
    private final zfw mSchedulers;
    private String mTermsOfServiceUrl;

    public interface SnapCanvasInitializeListener {
        void onInitialized();
    }

    public CognacSettingsBridgeMethods(acbq acbq, fgb fgb, String str, String str2, String str3, String str4, String str5, fan fan, eyr eyr, eyq eyq, aipn<eyo> aipn, exz exz, eyu eyu, fdd fdd, zfw zfw, boolean z, boolean z2) {
        fdd fdd2 = fdd;
        super(acbq);
        this.mAppId = str;
        this.mAppName = str4;
        this.mAppInstanceId = str3;
        this.mContext = str5;
        this.mConversation = fgb;
        this.mNetworkHandlerV2 = fan;
        this.mLensService = eyr;
        this.mFragmentService = aipn;
        this.mAlertService = exz;
        this.mNavigationController = eyu;
        this.mLensListener = eyq;
        this.mSchedulers = zfw;
        this.mHasPuppyBuilds = z;
        this.mIsPuppyApp = z2;
        if (fdd.f()) {
            String str6 = str2;
            this.mDisposable.a(fdd2.a(this.mAppId).e(new -$$Lambda$CognacSettingsBridgeMethods$F7uP_BSf9ePzIsLrUil1j4DPK-g(this, str2)));
            return;
        }
        fgm b = fdd2.b(this.mAppId);
        if (b != null) {
            this.mPrivacyPolicyUrl = b.n();
            this.mTermsOfServiceUrl = b.o();
        }
    }

    public static void addUser(acbq acbq, String str, a aVar) {
        Message message = new Message();
        message.method = "addUser";
        HashMap hashMap = new HashMap();
        hashMap.put("user", str);
        message.params = hashMap;
        acbq.a(message, aVar);
    }

    public static void didGainFocus(acbq acbq, String str) {
        Message message = new Message();
        message.method = "didGainFocus";
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        message.params = hashMap;
        acbq.a(message, null);
    }

    public static void didLoseFocus(acbq acbq, String str) {
        Message message = new Message();
        message.method = "didLoseFocus";
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        message.params = hashMap;
        acbq.a(message, null);
    }

    private boolean isValidInitializeRequest(Message message) {
        Object obj = message.params;
        if (obj == null) {
            return true;
        }
        fha.a aVar;
        b bVar;
        if (isValidParamsMap(obj)) {
            Map map = (Map) obj;
            String str = "minimumClientSupportedVersion";
            if (!map.containsKey(str) || ((Double) map.get(str)).doubleValue() <= COGNAC_CURRENT_CLIENT_VERSION) {
                return true;
            }
            this.mDisposable.a(ajcx.a(new -$$Lambda$CognacSettingsBridgeMethods$05MPW9_5FCChencke_Kb0_3uPsg(this)).b((ajdw) this.mSchedulers.l()).e());
            aVar = fha.a.CLIENT_UNSUPPORTED;
            bVar = b.CLIENT_UNSUPPORTED;
        } else {
            aVar = fha.a.INVALID_PARAM;
            bVar = b.INVALID_PARAM;
        }
        errorCallback(message, aVar, bVar);
        return false;
    }

    private void onAuthTokenFetched(Message message, String str) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fhb.create(str)));
    }

    private void showIncompatibleSDKAlert() {
        Resources resources = this.mBridgeWebview.getContext().getResources();
        this.mAlertService.a(this.mBridgeWebview.getContext(), resources.getString(R.string.cognac_client_unsupported_alert_message, new Object[]{this.mAppName}), resources.getString(R.string.cognac_learn_more), resources.getString(R.string.okay), new -$$Lambda$CognacSettingsBridgeMethods$WldprMk3lcGGquk9MjQZ7_0pWjI(this), eym.a);
    }

    public void addInitializeListener(SnapCanvasInitializeListener snapCanvasInitializeListener) {
        this.mListeners.add(snapCanvasInitializeListener);
    }

    public void deepLinkToLens(Message message) {
        Object obj = message.params;
        if (isValidParamsMap(obj)) {
            this.mDisposable.a(this.mLensService.a((String) ((Map) obj).get(DiscoverStorySnapModel.LENSID), this.mLensListener).e());
            return;
        }
        errorCallback(message, fha.a.INVALID_PARAM, b.INVALID_PARAM);
    }

    public void fetchAuthToken(Message message) {
        this.mDisposable.a(this.mNetworkHandlerV2.c(this.mAppInstanceId).a(new -$$Lambda$CognacSettingsBridgeMethods$sAwu-4qYAWQcftTyX8nNBVCzsGQ(this, message), new -$$Lambda$CognacSettingsBridgeMethods$c81E3lonB-FP4LZXNvzutID9R1w(this, message)));
    }

    public Set<String> getMethods() {
        return methods;
    }

    public void initialize(Message message) {
        if (isValidInitializeRequest(message)) {
            Resources resources = this.mBridgeWebview.getContext().getResources();
            Locale locale = resources.getConfiguration().locale;
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.cognac_presence_bar_safe_height);
            Object fhk = new fhk();
            fhk.applicationId = this.mAppId;
            fhk.sessionId = this.mConversation.b;
            fhk.safeAreaInsets = new fhh(0, dimensionPixelSize);
            fhk.conversationSize = this.mConversation.b();
            fhk.context = this.mContext;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(locale.getLanguage());
            stringBuilder.append('-');
            stringBuilder.append(locale.getCountry());
            fhk.locale = stringBuilder.toString();
            fhk.env = this.mIsPuppyApp ? "DEV" : "PROD";
            fhk.volume = this.mIsMuted ? MapboxConstants.MINIMUM_ZOOM : 1.0f;
            if (this.mIsPuppyApp) {
                fhk.user = new fhl(this.mConversation.k, true);
                this.mBridgeWebview.a(message, this.mGson.a.toJson(fhk));
                return;
            }
            this.mDisposable.a(this.mNetworkHandlerV2.a(this.mHasPuppyBuilds ? "6258bb46-35c2-4091-8a42-2d69a53fd2d6" : this.mAppId, this.mConversation.k.d()).a(new -$$Lambda$CognacSettingsBridgeMethods$1EpK0d4qu1cbieOWyBbNDrAvupY(this, fhk, message), new -$$Lambda$CognacSettingsBridgeMethods$0oBltVuCprPTU6H2JBmpT3yLU9k(this, fhk, message)));
            for (SnapCanvasInitializeListener onInitialized : this.mListeners) {
                onInitialized.onInitialized();
            }
        }
    }

    public /* synthetic */ void lambda$fetchAuthToken$3$CognacSettingsBridgeMethods(Message message, acct acct) {
        int i = 1;
        if ((acct.a & 1) == 0) {
            i = 0;
        }
        if (i == 0) {
            errorCallback(message, fha.a.RESOURCE_NOT_AVAILABLE, b.RESOURCE_NOT_AVAILABLE);
        } else {
            onAuthTokenFetched(message, acct.b);
        }
    }

    public /* synthetic */ void lambda$fetchAuthToken$4$CognacSettingsBridgeMethods(Message message, Throwable th) {
        errorCallback(message, fha.a.NETWORK_FAILURE, b.NETWORK_FAILURE);
    }

    public /* synthetic */ void lambda$initialize$1$CognacSettingsBridgeMethods(fhk fhk, Message message, acdr acdr) {
        String str = acdr.b;
        fhk.user = new fhl(this.mConversation.k, acdr.a, str, true);
        this.mBridgeWebview.a(message, this.mGson.a.toJson((Object) fhk));
    }

    public /* synthetic */ void lambda$initialize$2$CognacSettingsBridgeMethods(fhk fhk, Message message, Throwable th) {
        fhk.user = new fhl(this.mConversation.k, true);
        this.mBridgeWebview.a(message, this.mGson.a.toJson((Object) fhk));
    }

    public /* synthetic */ void lambda$new$0$CognacSettingsBridgeMethods(String str, List list) {
        for (fgo fgo : list) {
            if (fgo.e() != null && fgo.e().equals(str)) {
                break;
            }
        }
        fgo fgo2 = null;
        if (fgo2 != null) {
            this.mPrivacyPolicyUrl = fgo2.f();
            this.mTermsOfServiceUrl = fgo2.g();
        }
    }

    public /* synthetic */ void lambda$showIncompatibleSDKAlert$5$CognacSettingsBridgeMethods(boolean z) {
        if (z) {
            ((eyo) this.mFragmentService.get()).a("https://support.snapchat.com/article/games");
        } else {
            this.mNavigationController.a(this.mBridgeWebview.getContext());
        }
    }

    public void mute() {
        setVolume(MapboxConstants.MINIMUM_ZOOM);
        this.mIsMuted = true;
    }

    public void presentPrivacyPolicy(Message message) {
        if (TextUtils.isEmpty(this.mPrivacyPolicyUrl)) {
            errorCallback(message, fha.a.RESOURCE_NOT_FOUND, b.RESOURCE_NOT_AVAILABLE);
        } else {
            ((eyo) this.mFragmentService.get()).a(this.mPrivacyPolicyUrl);
        }
    }

    public void presentTermsOfService(Message message) {
        if (TextUtils.isEmpty(this.mTermsOfServiceUrl)) {
            errorCallback(message, fha.a.RESOURCE_NOT_FOUND, b.RESOURCE_NOT_AVAILABLE);
        } else {
            ((eyo) this.mFragmentService.get()).a(this.mTermsOfServiceUrl);
        }
    }

    public void setVolume(float f) {
        if (!this.mIsMuted) {
            Message message = new Message();
            message.method = EventType.SET_VOLUME;
            message.params = Float.toString(f);
            this.mBridgeWebview.a(message, null);
        }
    }

    public void unmute() {
        this.mIsMuted = false;
        setVolume(1.0f);
    }

    public void updateAppInstanceId(String str) {
        this.mAppInstanceId = str;
    }

    public void updateSafeArea() {
        Message message = new Message();
        message.method = "safeAreaDidUpdate";
        int dimensionPixelSize = this.mBridgeWebview.getResources().getDimensionPixelSize(R.dimen.cognac_presence_bar_safe_height);
        fhi fhi = new fhi();
        fhi.safeAreaInsets = new fhh(0, dimensionPixelSize);
        message.params = fhi;
        this.mBridgeWebview.a(message, null);
    }
}
