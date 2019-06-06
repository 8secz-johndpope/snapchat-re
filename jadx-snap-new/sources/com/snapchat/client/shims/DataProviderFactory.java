package com.snapchat.client.shims;

import java.nio.ByteBuffer;

public abstract class DataProviderFactory {
    public abstract DataProvider makeDataProvider(long j);

    public abstract DataProvider makeDataProviderFromMalloc(ByteBuffer byteBuffer);
}
