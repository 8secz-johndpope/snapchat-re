package com.snap.cognac.internal.webinterface;

import com.google.common.collect.ImmutableSet;
import com.snapchat.bridgeWebview.Message;
import defpackage.aaeb;
import defpackage.aaec;
import defpackage.aaed;
import defpackage.acbq;
import defpackage.acdr;
import defpackage.ajdx;
import defpackage.ajeb;
import defpackage.ajwy;
import defpackage.eyh;
import defpackage.eyp;
import defpackage.fan;
import defpackage.fap;
import defpackage.fcj;
import defpackage.ffv;
import defpackage.fgb;
import defpackage.fgz;
import defpackage.fha.a;
import defpackage.fha.b;
import defpackage.fhf;
import defpackage.fhg;
import defpackage.fhl;
import defpackage.ryk;
import java.util.Map;
import java.util.Set;

public class CognacDiscoverBridgeMethods extends fgz {
    private static final String TAG = "CogancDiscoverBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("playWithFriends", "playWithStrangers");
    private final String mAppId;
    private final fcj mCognacActionHandler;
    private final ajwy<fap> mCognacAnalytics;
    private final eyh mCognacConversationService;
    private final eyp mCognacInviteFriendsService;
    private final boolean mHasPuppyBuilds;
    private final ffv mMyself;
    private final fan mNetworkHandler;
    private final ryk mNetworkStatusManager;

    public CognacDiscoverBridgeMethods(acbq acbq, ffv ffv, String str, fcj fcj, eyp eyp, eyh eyh, ryk ryk, ajwy<fap> ajwy, fan fan, boolean z) {
        super(acbq);
        this.mCognacActionHandler = fcj;
        this.mCognacInviteFriendsService = eyp;
        this.mCognacConversationService = eyh;
        this.mNetworkStatusManager = ryk;
        this.mCognacAnalytics = ajwy;
        this.mNetworkHandler = fan;
        this.mMyself = ffv;
        this.mHasPuppyBuilds = z;
        this.mAppId = str;
    }

    private ajdx<fgb> launchApp(String str, boolean z) {
        return this.mCognacActionHandler.a(str, this.mAppId, z).h().a(new -$$Lambda$CognacDiscoverBridgeMethods$WfY91XSVlc_sxuNW2Zn8yBLvH-4(this, str, z));
    }

    private void onFriendsSelected(String str, String str2, boolean z, Message message) {
        String str3 = str;
        String str4 = str2;
        boolean z2 = z;
        Message message2 = message;
        this.mDisposable.a(this.mNetworkHandler.a(this.mHasPuppyBuilds ? "6258bb46-35c2-4091-8a42-2d69a53fd2d6" : this.mAppId, this.mMyself.d()).a(new -$$Lambda$CognacDiscoverBridgeMethods$q1thKzKAh-6_ZfV5h5lvQjo3Dc8(this, str3, str4, z2, message2), new -$$Lambda$CognacDiscoverBridgeMethods$R_mB_GXuPv_WxpitAXBn9HaF0Gc(this, str3, str4, z2, message2)));
    }

    private void openPlayWithComponent(Message message, int i) {
        CognacSettingsBridgeMethods.didLoseFocus(this.mBridgeWebview, "PLAY_WITH_SCREEN");
        fap fap = (fap) this.mCognacAnalytics.get();
        aaec aaec = new aaec();
        aaec.a(fap.c);
        aaec.a(fap.d);
        fap.e.a(aaec);
        this.mCognacInviteFriendsService.a(i, new -$$Lambda$CognacDiscoverBridgeMethods$nCcqZPpEr_Jb0mJhwvJLukMPVII(this, message));
    }

    private void playWithFriendCallback(String str, String str2, String str3, String str4, boolean z, Message message) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fhf.create(new fhl(this.mMyself, str3, str4, true), str, str2, z)));
    }

    public Set<String> getMethods() {
        return methods;
    }

    public /* synthetic */ ajeb lambda$launchApp$5$CognacDiscoverBridgeMethods(String str, boolean z, String str2) {
        return this.mCognacConversationService.a(str, str2, z ^ 1);
    }

    public /* synthetic */ void lambda$null$2$CognacDiscoverBridgeMethods(Message message, fgb fgb) {
        onFriendsSelected(fgb.b, fgb.c, true, message);
    }

    public /* synthetic */ void lambda$null$3$CognacDiscoverBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public /* synthetic */ void lambda$onFriendsSelected$6$CognacDiscoverBridgeMethods(String str, String str2, boolean z, Message message, acdr acdr) {
        playWithFriendCallback(str, str2, acdr.a, acdr.b, z, message);
    }

    public /* synthetic */ void lambda$onFriendsSelected$7$CognacDiscoverBridgeMethods(String str, String str2, boolean z, Message message, Throwable th) {
        playWithFriendCallback(str, str2, null, null, z, message);
    }

    public /* synthetic */ void lambda$openPlayWithComponent$4$CognacDiscoverBridgeMethods(Message message, String str, long j) {
        fap fap = (fap) this.mCognacAnalytics.get();
        aaed aaed = new aaed();
        aaed.a(fap.c);
        aaed.a = Long.valueOf(j);
        aaed.a(fap.d);
        fap.e.a(aaed);
        CognacSettingsBridgeMethods.didGainFocus(this.mBridgeWebview, "PLAY_WITH_SCREEN");
        this.mDisposable.a(launchApp(str, true).a(new -$$Lambda$CognacDiscoverBridgeMethods$aL44CivaOr2AFGvAu7Jmx5oduE0(this, message), new -$$Lambda$CognacDiscoverBridgeMethods$-T8awsj69wQlccjq-WNmuYupLmg(this, message)));
    }

    public /* synthetic */ void lambda$playWithStrangers$0$CognacDiscoverBridgeMethods(Message message, fgb fgb) {
        if (fgb.b == null) {
            errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
            return;
        }
        this.mBridgeWebview.a(message, this.mGson.a.toJson(new fhg(fgb.b)));
    }

    public /* synthetic */ void lambda$playWithStrangers$1$CognacDiscoverBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public void playWithFriends(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
        } else if (this.mNetworkStatusManager.l()) {
            openPlayWithComponent(message, (int) ((Double) ((Map) obj).get("maxNumberOfPlayers")).doubleValue());
        } else {
            errorCallback(message, a.NETWORK_NOT_REACHABLE, b.NETWORK_NOT_REACHABLE);
        }
    }

    public void playWithStrangers(Message message) {
        if (!this.mNetworkStatusManager.l()) {
            errorCallback(message, a.NETWORK_NOT_REACHABLE, b.NETWORK_NOT_REACHABLE);
        } else if (this.mMyself.a() == null) {
            errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
        } else {
            fap fap = (fap) this.mCognacAnalytics.get();
            aaeb aaeb = new aaeb();
            aaeb.a(fap.c);
            aaeb.a(fap.d);
            fap.e.a(aaeb);
            this.mDisposable.a(launchApp(this.mMyself.a(), false).a(new -$$Lambda$CognacDiscoverBridgeMethods$xxycAF55E-N4uKOb_QLsp7btX-s(this, message), new -$$Lambda$CognacDiscoverBridgeMethods$DR5wEU289ucD0MbRPBAAcoeMnQU(this, message)));
        }
    }
}
