package com.snapchat.client.composer;

public abstract class FlexBoxAttributeHandler {
    public abstract void applyAttributeAuto(Object obj, Animator animator);

    public abstract void applyAttributePercent(Object obj, double d, Animator animator);

    public abstract void applyAttributeRaw(Object obj, double d, Animator animator);

    public abstract void resetAttribute(Object obj, Animator animator);
}
