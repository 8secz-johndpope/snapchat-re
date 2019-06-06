package com.google.android.gms.internal;

public abstract class zzfgk<MessageType extends zzfgj<MessageType, BuilderType>, BuilderType extends zzfgk<MessageType, BuilderType>> implements zzfjd {
    public abstract BuilderType zza(MessageType messageType);

    /* renamed from: zzcxj */
    public abstract BuilderType clone();

    public final /* synthetic */ zzfjd zzd(zzfjc zzfjc) {
        if (zzczu().getClass().isInstance(zzfjc)) {
            return zza((zzfgj) zzfjc);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
