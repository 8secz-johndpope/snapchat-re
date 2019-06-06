package com.snapchat.client.composer;

import com.snapchat.client.shims.DataProvider;

public abstract class BundleManager {
    public abstract Bundle loadBundle(String str);

    public abstract DataProvider loadBundleContent(String str);

    public abstract boolean shouldUnloadBundle(Bundle bundle);
}
