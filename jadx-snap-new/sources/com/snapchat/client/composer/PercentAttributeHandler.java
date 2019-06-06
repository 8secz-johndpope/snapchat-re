package com.snapchat.client.composer;

public abstract class PercentAttributeHandler {
    public abstract void applyAttributePercent(Object obj, double d, Animator animator);

    public abstract void applyAttributeRaw(Object obj, double d, Animator animator);

    public abstract void resetAttribute(Object obj, Animator animator);
}