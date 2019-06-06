package com.snap.cognac.internal.webinterface;

import android.text.TextUtils;
import com.google.common.collect.ImmutableSet;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import com.snap.core.db.record.CognacRVModel;
import com.snap.core.db.record.CognacRVRecord;
import com.snapchat.bridgeWebview.Message;
import defpackage.aaee;
import defpackage.aaek;
import defpackage.aaem;
import defpackage.acbq;
import defpackage.aipn;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajwy;
import defpackage.akcr;
import defpackage.cvz;
import defpackage.exy;
import defpackage.ezd;
import defpackage.faa;
import defpackage.fap;
import defpackage.faq;
import defpackage.ffn;
import defpackage.ffo;
import defpackage.ffp;
import defpackage.fgq;
import defpackage.fgr;
import defpackage.fgy;
import defpackage.fgz;
import defpackage.fha.a;
import defpackage.fha.b;
import defpackage.fhj;
import defpackage.fho;
import defpackage.fhp;
import defpackage.iig;
import defpackage.ppy;
import defpackage.zfw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CognacRewardedVideoBridgeMethods extends fgz {
    private static final String TAG = "RewardedVideoBridgeMethods";
    private final Map<String, fho> mAdStateMap = new HashMap();
    private final exy mAdsService;
    private final String mAppId;
    private final String mBuildId;
    private final ajwy<fap> mCognacAnalytics;
    private boolean mIsAdPlayerOpen;
    private final CognacSettingsBridgeMethods mMethods;
    private final faa mRVRepository;
    private final zfw mSchedulers;
    private final aipn<ezd> mTweakService;

    public CognacRewardedVideoBridgeMethods(acbq acbq, exy exy, faa faa, zfw zfw, String str, String str2, aipn<ezd> aipn, ajwy<fap> ajwy, CognacSettingsBridgeMethods cognacSettingsBridgeMethods) {
        super(acbq);
        this.mAdsService = exy;
        this.mTweakService = aipn;
        this.mRVRepository = faa;
        this.mSchedulers = zfw;
        this.mAppId = str;
        this.mBuildId = str2;
        this.mCognacAnalytics = ajwy;
        this.mMethods = cognacSettingsBridgeMethods;
    }

    public static void adComplete(acbq acbq, boolean z, String str, String str2, String str3, fhj fhj) {
        Message message = new Message();
        message.method = "adComplete";
        HashMap hashMap = new HashMap();
        message.params = hashMap;
        hashMap.put("success", String.valueOf(z));
        hashMap.put(CognacRVModel.SLOTID, str);
        hashMap.put(CognacRVModel.REQUESTID, str2);
        hashMap.put("developerPayload", str3);
        hashMap.put("error", fhj);
        acbq.a(message, null);
    }

    public static void adReady(acbq acbq, String str) {
        Message message = new Message();
        message.method = "adReady";
        message.params = str;
        acbq.a(message, null);
    }

    private void initializeAdStateMap(List<String> list) {
        fho create = fho.create(false, fhj.create(a.RV_NOT_LOADED, b.RV_NOT_LOADED), 0);
        for (String put : list) {
            this.mAdStateMap.put(put, create);
        }
    }

    static /* synthetic */ void lambda$getUnconsumedAds$1(Throwable th) {
    }

    public void clear() {
        super.clear();
        this.mAdsService.a();
    }

    public void consumeAd(Message message) {
        Map map = (Map) message.params;
        if (isValidParamsMap(map)) {
            String str = (String) map.get(CognacRVModel.REQUESTID);
            if (str != null) {
                this.mDisposable.a(this.mRVRepository.b(str).a(new -$$Lambda$CognacRewardedVideoBridgeMethods$QtxhdMN3234QpTAVAwFmABAXsZw(this, message, str), new -$$Lambda$CognacRewardedVideoBridgeMethods$Mwhnt_CTLVHOVMiJfBwtxaRha38(this, message)));
                return;
            }
            ((fap) this.mCognacAnalytics.get()).b(str, a.INVALID_PARAM.toString(), aaee.FAILURE);
            errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
            return;
        }
        ((fap) this.mCognacAnalytics.get()).b(null, a.INVALID_PARAM.toString(), aaee.FAILURE);
        errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
    }

    public Set<String> getMethods() {
        return ImmutableSet.of("initializeAds", "watchAd", "isAdReady", "getUnconsumedAds", "consumeAd");
    }

    public void getUnconsumedAds(Message message) {
        this.mDisposable.a(this.mRVRepository.a(this.mAppId).b((ajdw) this.mSchedulers.i()).a(new -$$Lambda$CognacRewardedVideoBridgeMethods$62iw5ctpgVnIUultQpmLC8s7FjU(this, message), -$$Lambda$CognacRewardedVideoBridgeMethods$OTFMiA3_P3qUyuCHdKG_09Kq3w4.INSTANCE));
    }

    public void initializeAds(Message message) {
        Object obj = message.params;
        if (isValidParamsMap(obj)) {
            List list = (List) ((Map) obj).get("slotIds");
            boolean s = ((ezd) this.mTweakService.get()).s();
            String str = ppy.b;
            if (s) {
                ((fap) this.mCognacAnalytics.get()).a(TextUtils.join(str, list), null, aaee.SUCCESS);
                ffo ffo = new ffo(this.mAppId, list, this.mBuildId);
                ffn ffn = new ffn(((ezd) this.mTweakService.get()).p(), ((ezd) this.mTweakService.get()).q(), ((ezd) this.mTweakService.get()).r());
                initializeAdStateMap(list);
                this.mBridgeWebview.a(message, this.mGson.a.toJson(fgy.create(null)));
                this.mAdsService.a(ffo, ffn, new exy.a() {
                    public void onAdError(String str, String str2, cvz cvz) {
                        CognacRewardedVideoBridgeMethods.this.mAdStateMap.put(str, fho.create(false, fhj.create(a.CLIENT_STATE_INVALID, b.UNKNOWN), 0));
                    }

                    public void onAdRateLimited(String str, String str2, int i) {
                        CognacRewardedVideoBridgeMethods.this.mAdStateMap.put(str, fho.create(false, fhj.create(a.RV_RATE_LIMITED, b.RATE_LIMITED), (long) i));
                    }

                    public void onAdReady(String str, String str2) {
                        CognacRewardedVideoBridgeMethods.this.mAdStateMap.put(str, fho.create(true, null, 0));
                        CognacRewardedVideoBridgeMethods.adReady(CognacRewardedVideoBridgeMethods.this.mBridgeWebview, str);
                    }
                });
                return;
            }
            ((fap) this.mCognacAnalytics.get()).a(TextUtils.join(str, list), a.RESOURCE_NOT_AVAILABLE.toString(), aaee.FAILURE);
            errorCallback(message, a.RESOURCE_NOT_AVAILABLE, b.RESOURCE_NOT_AVAILABLE);
            return;
        }
        ((fap) this.mCognacAnalytics.get()).a(null, a.INVALID_PARAM.toString(), aaee.FAILURE);
        errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
    }

    public void isAdReady(Message message) {
        Map map = (Map) message.params;
        if (isValidParamsMap(map)) {
            Object obj = (fho) this.mAdStateMap.get((String) map.get(CognacRVModel.SLOTID));
            if (obj == null) {
                errorCallback(message, a.RV_NO_MATCH, b.RV_NO_MATCH);
                return;
            } else {
                this.mBridgeWebview.a(message, this.mGson.a(obj));
                return;
            }
        }
        errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
    }

    public /* synthetic */ void lambda$consumeAd$2$CognacRewardedVideoBridgeMethods(Message message, String str) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fgy.create(null)));
        ((fap) this.mCognacAnalytics.get()).b(str, null, aaee.SUCCESS);
    }

    public /* synthetic */ void lambda$consumeAd$3$CognacRewardedVideoBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public /* synthetic */ void lambda$getUnconsumedAds$0$CognacRewardedVideoBridgeMethods(Message message, List list) {
        ArrayList arrayList = new ArrayList();
        for (CognacRVRecord cognacRVRecord : list) {
            arrayList.add(new fgr.a(cognacRVRecord.slotId(), Long.valueOf(cognacRVRecord.timestamp()), cognacRVRecord.requestId(), cognacRVRecord.payload()));
        }
        this.mBridgeWebview.a(message, this.mGson.a(new fgq(arrayList)));
    }

    public void watchAd(Message message) {
        if (isValidParamsMap(message.params)) {
            Map map = (Map) message.params;
            final String str = (String) map.get(CognacRVModel.SLOTID);
            final String str2 = (String) map.get("developerPayload");
            final String uuid = iig.a().toString();
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.mIsAdPlayerOpen) {
                ((fap) this.mCognacAnalytics.get()).a(str, uuid, a.CONFLICT_REQUEST.toString(), aaee.FAILURE);
                errorCallback(message, a.CONFLICT_REQUEST, b.VIEW_OVERTAKEN);
                return;
            }
            final Message message2 = message;
            this.mAdsService.a(new ffp(str), new exy.b() {
                static /* synthetic */ void lambda$onCompleted$1(String str, Throwable th) {
                }

                public /* synthetic */ void lambda$onCompleted$0$CognacRewardedVideoBridgeMethods$2(String str, String str2, String str3) {
                    CognacRewardedVideoBridgeMethods.adComplete(CognacRewardedVideoBridgeMethods.this.mBridgeWebview, true, str, str2, str3, null);
                }

                public void onBackPressed() {
                    CognacRewardedVideoBridgeMethods.this.mIsAdPlayerOpen = false;
                    ((fap) CognacRewardedVideoBridgeMethods.this.mCognacAnalytics.get()).a(str, uuid, a.USER_REJECTION.toString(), aaee.FAILURE);
                    CognacRewardedVideoBridgeMethods.adComplete(CognacRewardedVideoBridgeMethods.this.mBridgeWebview, false, str, uuid, str2, fhj.create(a.USER_REJECTION, b.USER_REJECTION));
                    CognacRewardedVideoBridgeMethods.this.mMethods.setVolume(1.0f);
                }

                public void onCompleted() {
                    CognacRewardedVideoBridgeMethods.this.mIsAdPlayerOpen = false;
                    CognacRewardedVideoBridgeMethods.this.mMethods.setVolume(1.0f);
                    fap fap = (fap) CognacRewardedVideoBridgeMethods.this.mCognacAnalytics.get();
                    String str = str;
                    String str2 = uuid;
                    aaee aaee = aaee.SUCCESS;
                    akcr.b(aaee, "status");
                    aaek a = faq.a(str, str2, null, aaee);
                    aaem aaem = new aaem();
                    aaem.a(fap.c);
                    aaem.a(a);
                    fap.e.a(aaem);
                    ajcx a2 = CognacRewardedVideoBridgeMethods.this.mRVRepository.a(CognacRewardedVideoBridgeMethods.this.mAppId, new fgr.a(str, Long.valueOf(currentTimeMillis), uuid, str2));
                    str = str;
                    str2 = uuid;
                    CognacRewardedVideoBridgeMethods.this.mDisposable.a(a2.a(new -$$Lambda$CognacRewardedVideoBridgeMethods$2$Rx9IWEf8fGo22bSseUIklFHFLoA(this, str, str2, str2), new -$$Lambda$CognacRewardedVideoBridgeMethods$2$iwRrrlqEtctYDFY95sTz9iLbICs(str2)));
                }

                public void onError(String str) {
                    CognacRewardedVideoBridgeMethods.this.mIsAdPlayerOpen = false;
                    str = CognacRewardedVideoBridgeMethods.this.mGson.a.toJson(fhp.create(fhj.create(a.CLIENT_STATE_INVALID, b.UNKNOWN), uuid));
                    ((fap) CognacRewardedVideoBridgeMethods.this.mCognacAnalytics.get()).a(str, uuid, a.CLIENT_STATE_INVALID.toString(), aaee.FAILURE);
                    CognacRewardedVideoBridgeMethods.this.mBridgeWebview.a(message2, str);
                    CognacRewardedVideoBridgeMethods.this.mMethods.setVolume(1.0f);
                }

                public void onOpened() {
                    CognacRewardedVideoBridgeMethods.this.mIsAdPlayerOpen = true;
                    CognacRewardedVideoBridgeMethods.this.mMethods.setVolume(MapboxConstants.MINIMUM_ZOOM);
                    String toJson = CognacRewardedVideoBridgeMethods.this.mGson.a.toJson(fhp.create(null, uuid));
                    ((fap) CognacRewardedVideoBridgeMethods.this.mCognacAnalytics.get()).a(str, uuid, null, aaee.SUCCESS);
                    CognacRewardedVideoBridgeMethods.this.mBridgeWebview.a(message2, toJson);
                    CognacSettingsBridgeMethods.didLoseFocus(CognacRewardedVideoBridgeMethods.this.mBridgeWebview, "REWARDED_VIDEO");
                }
            });
            return;
        }
        ((fap) this.mCognacAnalytics.get()).a(null, null, a.INVALID_PARAM.toString(), aaee.FAILURE);
        errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
    }
}
