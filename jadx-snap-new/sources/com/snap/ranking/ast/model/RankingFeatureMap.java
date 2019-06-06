package com.snap.ranking.ast.model;

import android.util.LongSparseArray;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.snap.ranking.ast.model.AutoValue_RankingFeatureMap.GsonTypeAdapter;
import com.snap.ranking.ast.model.RankingFeature.SignalIdentifierType;
import defpackage.abss;
import java.util.ArrayList;
import java.util.List;

@AutoValue
public abstract class RankingFeatureMap {
    private static final String TAG = "RankingFeatureMap";

    /* renamed from: com.snap.ranking.ast.model.RankingFeatureMap$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$snap$ranking$ast$model$RankingFeature$SignalIdentifierType = new int[SignalIdentifierType.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Missing block: B:7:?, code skipped:
            return;
     */
        static {
            /*
            r0 = com.snap.ranking.ast.model.RankingFeature.SignalIdentifierType.values();
            r0 = r0.length;
            r0 = new int[r0];
            $SwitchMap$com$snap$ranking$ast$model$RankingFeature$SignalIdentifierType = r0;
            r0 = $SwitchMap$com$snap$ranking$ast$model$RankingFeature$SignalIdentifierType;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.snap.ranking.ast.model.RankingFeature.SignalIdentifierType.CLIENT_SIDE_SIGNAL;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = $SwitchMap$com$snap$ranking$ast$model$RankingFeature$SignalIdentifierType;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.snap.ranking.ast.model.RankingFeature.SignalIdentifierType.SERVER_SIDE_SIGNAL;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.snap.ranking.ast.model.RankingFeatureMap$AnonymousClass1.<clinit>():void");
        }
    }

    public static RankingFeatureMap create(Iterable<RankingFeature> iterable) {
        LongSparseArray longSparseArray = new LongSparseArray();
        LongSparseArray longSparseArray2 = new LongSparseArray();
        boolean z = abss.a().b;
        for (RankingFeature rankingFeature : iterable) {
            if (!isMalformedFeature(z, rankingFeature)) {
                int i = AnonymousClass1.$SwitchMap$com$snap$ranking$ast$model$RankingFeature$SignalIdentifierType[rankingFeature.identifierType.ordinal()];
                if (i == 1) {
                    longSparseArray.put((long) rankingFeature.key, rankingFeature);
                } else if (i == 2) {
                    longSparseArray2.put((long) rankingFeature.key, rankingFeature);
                }
            }
        }
        return new AutoValue_RankingFeatureMap(longSparseArray, longSparseArray2);
    }

    private static boolean isMalformedFeature(boolean z, RankingFeature rankingFeature) {
        boolean z2 = rankingFeature == null || rankingFeature.identifierType == null;
        if (!z2 || !z) {
            return z2;
        }
        throw new IllegalStateException("Encountered malformed RankingFeature: ".concat(String.valueOf(rankingFeature == null ? "null feature" : rankingFeature.toString())));
    }

    public static TypeAdapter<RankingFeatureMap> typeAdapter(Gson gson) {
        return new GsonTypeAdapter(gson);
    }

    public abstract LongSparseArray<RankingFeature> clientSideFeatures();

    public List<RankingFeature> getAllRankingFeatures() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < clientSideFeatures().size(); i++) {
            arrayList.add(clientSideFeatures().valueAt(i));
        }
        for (int i2 = 0; i2 < serverSideFeatures().size(); i2++) {
            arrayList.add(serverSideFeatures().valueAt(i2));
        }
        return arrayList;
    }

    public abstract LongSparseArray<RankingFeature> serverSideFeatures();
}
