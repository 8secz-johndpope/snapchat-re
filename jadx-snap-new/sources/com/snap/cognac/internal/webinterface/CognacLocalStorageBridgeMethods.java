package com.snap.cognac.internal.webinterface;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.snap.core.db.api.DbClient;
import com.snap.core.db.record.CognacLocalStorageRecord;
import com.snap.core.db.record.UnlockablesModel;
import com.snapchat.bridgeWebview.Message;
import defpackage.acbq;
import defpackage.ajcx;
import defpackage.ajdw;
import defpackage.ajei;
import defpackage.akbl;
import defpackage.akcr;
import defpackage.ezz;
import defpackage.ezz.e;
import defpackage.ezz.g;
import defpackage.fgy;
import defpackage.fgz;
import defpackage.fha.a;
import defpackage.fha.b;
import defpackage.fhd;
import defpackage.zfw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CognacLocalStorageBridgeMethods extends fgz {
    private static final String TAG = "CognacLocalStorageBridgeMethods";
    private static final Set<String> methods = ImmutableSet.of("localStorageSetData", "localStorageGetData", "localStorageDeleteData");
    private final String mAppId;
    private final ajei mDisposables = new ajei();
    private final ezz mRepository;
    private final zfw mSchedulers;

    public CognacLocalStorageBridgeMethods(acbq acbq, ezz ezz, String str, zfw zfw) {
        super(acbq);
        this.mAppId = str;
        this.mRepository = ezz;
        this.mSchedulers = zfw;
    }

    public void clear() {
        this.mDisposables.a();
    }

    public Set<String> getMethods() {
        return methods;
    }

    public /* synthetic */ void lambda$localStorageDeleteData$6$CognacLocalStorageBridgeMethods(Message message) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fgy.create(null)));
    }

    public /* synthetic */ void lambda$localStorageDeleteData$7$CognacLocalStorageBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public /* synthetic */ void lambda$localStorageGetData$4$CognacLocalStorageBridgeMethods(List list, Message message, List list2) {
        HashMap hashMap = new HashMap();
        for (CognacLocalStorageRecord cognacLocalStorageRecord : list2) {
            if (list.contains(cognacLocalStorageRecord.key())) {
                hashMap.put(cognacLocalStorageRecord.key(), cognacLocalStorageRecord.value());
            }
        }
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fhd.create(hashMap)));
    }

    public /* synthetic */ void lambda$localStorageGetData$5$CognacLocalStorageBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public /* synthetic */ List lambda$localStorageSetData$0$CognacLocalStorageBridgeMethods(Message message, Map map, List list) {
        HashMap hashMap = new HashMap();
        int i = 0;
        for (CognacLocalStorageRecord cognacLocalStorageRecord : list) {
            i = (i + cognacLocalStorageRecord.key().getBytes().length) + cognacLocalStorageRecord.value().getBytes().length;
            hashMap.put(cognacLocalStorageRecord.key(), cognacLocalStorageRecord.value());
        }
        if (i >= 100000) {
            errorCallback(message, a.CLIENT_STATE_INVALID, b.RATE_LIMITED);
            return ImmutableList.of();
        }
        ArrayList arrayList = new ArrayList();
        for (Entry entry : map.entrySet()) {
            String str;
            DbClient dbClient;
            akbl gVar;
            String str2 = "value";
            String str3 = "key";
            String str4 = "appId";
            ezz ezz;
            String str5;
            String str6;
            if (hashMap.containsKey(entry.getKey())) {
                ezz = this.mRepository;
                str5 = this.mAppId;
                str6 = (String) entry.getKey();
                str = (String) entry.getValue();
                akcr.b(str5, str4);
                akcr.b(str6, str3);
                akcr.b(str, str2);
                dbClient = ezz.a;
                gVar = new g(ezz, str, str5, str6);
                str = "CognacLocalStorageRepository:UpdateData";
            } else {
                ezz = this.mRepository;
                str5 = this.mAppId;
                str6 = (String) entry.getKey();
                str = (String) entry.getValue();
                akcr.b(str5, str4);
                akcr.b(str6, str3);
                akcr.b(str, str2);
                dbClient = ezz.a;
                gVar = new e(ezz, str5, str6, str);
                str = "CognacLocalStorageRepository:InsertData";
            }
            arrayList.add(dbClient.runInTransaction(str, gVar));
        }
        return arrayList;
    }

    public /* synthetic */ void lambda$localStorageSetData$2$CognacLocalStorageBridgeMethods(Message message) {
        this.mBridgeWebview.a(message, this.mGson.a.toJson(fgy.create(null)));
    }

    public /* synthetic */ void lambda$localStorageSetData$3$CognacLocalStorageBridgeMethods(Message message, Throwable th) {
        errorCallback(message, a.CLIENT_STATE_INVALID, b.UNKNOWN);
    }

    public void localStorageDeleteData(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
        }
        List<String> list = (List) ((Map) obj).get("keys");
        Iterable arrayList = new ArrayList();
        for (String str : list) {
            ezz ezz = this.mRepository;
            String str2 = this.mAppId;
            akcr.b(str2, "appId");
            akcr.b(str, "key");
            arrayList.add(ezz.a.runInTransaction("CognacLocalStorageRepository:DeleteData", new ezz.b(ezz, str2, str)));
        }
        this.mDisposables.a(ajcx.b(arrayList).b((ajdw) this.mSchedulers.m()).a(new -$$Lambda$CognacLocalStorageBridgeMethods$Ip9BP73wlwb4UZhwDDnmXS43Eqo(this, message), new -$$Lambda$CognacLocalStorageBridgeMethods$b4QBiN1jC9pSifaBfwvnL3Eo3eI(this, message)));
    }

    public void localStorageGetData(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
        }
        this.mDisposables.a(this.mRepository.a(this.mAppId).b((ajdw) this.mSchedulers.i()).a(new -$$Lambda$CognacLocalStorageBridgeMethods$ZiXFT11GH5KtQ-OY_kRXIdCwQkU(this, (List) ((Map) obj).get("keys"), message), new -$$Lambda$CognacLocalStorageBridgeMethods$i6uT9ajOU-xlRjYare1PdYytqy4(this, message)));
    }

    public void localStorageSetData(Message message) {
        Object obj = message.params;
        if (!isValidParamsMap(obj)) {
            errorCallback(message, a.INVALID_PARAM, b.INVALID_PARAM);
        }
        this.mDisposables.a(this.mRepository.a(this.mAppId).f(new -$$Lambda$CognacLocalStorageBridgeMethods$6W279GAKIDvaT3OIRXBUhIPKcOg(this, message, (Map) ((Map) obj).get(UnlockablesModel.DATA))).e(-$$Lambda$CognacLocalStorageBridgeMethods$99kqekQ7_SJRRwxTeKuvqh3l_TI.INSTANCE).b((ajdw) this.mSchedulers.m()).a(new -$$Lambda$CognacLocalStorageBridgeMethods$6bhcrWT22HLUO97zGQaHfnp_tvo(this, message), new -$$Lambda$CognacLocalStorageBridgeMethods$VFPRXLTu-n4Grf8kjankDaeJYpw(this, message)));
    }
}
