package com.snapchat.client.grpc;

public abstract class AuthContextDelegate {
    public abstract void getAuthContext(AuthContextCallback authContextCallback);
}
