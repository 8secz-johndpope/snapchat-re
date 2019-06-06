package com.snapchat.client.learned_search;

public abstract class ModelCacheExecutor {
    public abstract ModelMetaData getCachedModelMetaData(String str);

    public abstract boolean setCachedModelMetaData(String str, ModelMetaData modelMetaData);
}
