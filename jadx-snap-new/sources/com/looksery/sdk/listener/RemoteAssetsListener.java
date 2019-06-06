package com.looksery.sdk.listener;

import com.looksery.sdk.domain.RemoteAssetType;

public interface RemoteAssetsListener {
    String requestEncryptAndUploadAsset(String str, String str2, byte[] bArr, byte[] bArr2, boolean z);

    void requestEncryptedRemoteAsset(String str, RemoteAssetType remoteAssetType, String str2, String str3, byte[] bArr, byte[] bArr2);

    void requestRemoteAsset(String str, RemoteAssetType remoteAssetType, String str2, String str3);

    void requestRemoteAssetByUrl(String str, RemoteAssetType remoteAssetType, String str2, String str3);

    String requestUploadAsset(String str, String str2, boolean z);
}
