package com.google.android.gms.vision;

import android.util.SparseArray;

public abstract class Detector<T> {
    private final Object zzlft = new Object();
    private Processor<T> zzlfu;

    public interface Processor<T> {
        void release();
    }

    public abstract SparseArray<T> detect(Frame frame);

    public boolean isOperational() {
        return true;
    }

    public void release() {
        synchronized (this.zzlft) {
            if (this.zzlfu != null) {
                this.zzlfu.release();
                this.zzlfu = null;
            }
        }
    }
}
