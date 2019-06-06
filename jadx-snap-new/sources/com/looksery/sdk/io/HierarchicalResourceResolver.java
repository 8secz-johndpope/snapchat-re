package com.looksery.sdk.io;

import android.net.Uri;

public interface HierarchicalResourceResolver extends ResourceResolver {

    public enum NodeType {
        RegularFile,
        Directory
    }

    String[] childNamesForNode(Uri uri);

    NodeType nodeType(Uri uri);
}
