package com.snapchat.client.network_types;

import com.snapchat.client.mdp_common.MediaContextType;

public final class RankingSignal {
    final FetchPriority mFetchPriority;
    final MediaContextType mMediaContextType;
    final PrefetchConsumptionLikelihood mPrefetchConsumptionLikelihood;
    final UIPageInfo mUiPageInfo;

    public RankingSignal(MediaContextType mediaContextType, UIPageInfo uIPageInfo, FetchPriority fetchPriority, PrefetchConsumptionLikelihood prefetchConsumptionLikelihood) {
        this.mMediaContextType = mediaContextType;
        this.mUiPageInfo = uIPageInfo;
        this.mFetchPriority = fetchPriority;
        this.mPrefetchConsumptionLikelihood = prefetchConsumptionLikelihood;
    }

    public final FetchPriority getFetchPriority() {
        return this.mFetchPriority;
    }

    public final MediaContextType getMediaContextType() {
        return this.mMediaContextType;
    }

    public final PrefetchConsumptionLikelihood getPrefetchConsumptionLikelihood() {
        return this.mPrefetchConsumptionLikelihood;
    }

    public final UIPageInfo getUiPageInfo() {
        return this.mUiPageInfo;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RankingSignal{mMediaContextType=");
        stringBuilder.append(this.mMediaContextType);
        stringBuilder.append(",mUiPageInfo=");
        stringBuilder.append(this.mUiPageInfo);
        stringBuilder.append(",mFetchPriority=");
        stringBuilder.append(this.mFetchPriority);
        stringBuilder.append(",mPrefetchConsumptionLikelihood=");
        stringBuilder.append(this.mPrefetchConsumptionLikelihood);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
