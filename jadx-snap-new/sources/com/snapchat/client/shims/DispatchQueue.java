package com.snapchat.client.shims;

public abstract class DispatchQueue {
    public abstract void submit(DispatchTask dispatchTask);

    public abstract void submitWithDelay(DispatchTask dispatchTask, long j);
}
