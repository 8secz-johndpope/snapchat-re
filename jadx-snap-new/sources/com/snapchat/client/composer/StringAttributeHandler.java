package com.snapchat.client.composer;

public abstract class StringAttributeHandler {
    public abstract void applyAttribute(Object obj, String str, Animator animator);

    public abstract void resetAttribute(Object obj, Animator animator);
}
