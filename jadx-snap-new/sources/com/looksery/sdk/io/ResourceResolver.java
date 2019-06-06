package com.looksery.sdk.io;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.InputStream;

public interface ResourceResolver {
    InputStream openResource(Uri uri);

    AssetFileDescriptor openResourceFd(Uri uri);
}
