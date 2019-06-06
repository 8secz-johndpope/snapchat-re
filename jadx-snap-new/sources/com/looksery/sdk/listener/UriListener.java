package com.looksery.sdk.listener;

import com.looksery.sdk.domain.UriRequest;

public interface UriListener {
    void cancelRequest(String str);

    void requestUriData(UriRequest uriRequest);
}
