package com.snapchat.client.composer;

public abstract class DoubleAttributeHandler {
    public abstract void applyAttribute(Object obj, double d, Animator animator);

    public abstract void resetAttribute(Object obj, Animator animator);
}
