package com.google.android.gms.internal;

import com.addlive.djinni.LogicError;
import com.google.android.gms.internal.zzfhu.zzg;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.IOException;

public final class zziw {

    public static final class zza extends zzfhu<zza, zza> implements zzfje {
        private static final zza zzbbl;
        private static volatile zzfjl<zza> zzbbm;

        public enum zzb implements zzfia {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL),
            REQUEST_DID_UPDATE_GMS_SIGNALS(LogicError.INVALID_SCOPE),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(LogicError.INVALID_ARGUMENT),
            REQUEST_FAILED_TO_BUILD_URL(LogicError.INVALID_PROPERTY_NAME),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(LogicError.PLATFORM_INIT_FAILED),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005);
            
            private static final zzfib<zzb> zzbcn = null;
            private final int value;

            static {
                zzbcn = new zziy();
            }

            private zzb(int i) {
                this.value = i;
            }

            public final int zzhu() {
                return this.value;
            }
        }

        public static final class zza extends com.google.android.gms.internal.zzfhu.zza<zza, zza> implements zzfje {
            private zza() {
                super(zza.zzbbl);
            }

            /* synthetic */ zza(zzix zzix) {
                this();
            }
        }

        static {
            zza zza = new zza();
            zzbbl = zza;
            zza.zza(zzg.zzppw, null, null);
            zza.zzpph.zzbkr();
        }

        private zza() {
        }

        /* Access modifiers changed, original: protected|final */
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzix.zzbbk[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return zzbbl;
                case 3:
                    return null;
                case 4:
                    return new zza();
                case 5:
                    return this;
                case 6:
                    zzfhb zzfhb = (zzfhb) obj;
                    if (((zzfhm) obj2) != null) {
                        Object obj3 = null;
                        while (obj3 == null) {
                            try {
                                int zzcxx = zzfhb.zzcxx();
                                if (zzcxx == 0 || !zza(zzcxx, zzfhb)) {
                                    obj3 = 1;
                                }
                            } catch (zzfie e) {
                                throw new RuntimeException(e.zzi(this));
                            } catch (IOException e2) {
                                throw new RuntimeException(new zzfie(e2.getMessage()).zzi(this));
                            }
                        }
                        break;
                    }
                    throw new NullPointerException();
                case 7:
                    break;
                case 8:
                    if (zzbbm == null) {
                        synchronized (zza.class) {
                            if (zzbbm == null) {
                                zzbbm = new com.google.android.gms.internal.zzfhu.zzb(zzbbl);
                            }
                        }
                    }
                    return zzbbm;
                case 9:
                    return Byte.valueOf((byte) 1);
                case 10:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
            return zzbbl;
        }

        public final void zza(zzfhg zzfhg) {
            this.zzpph.zza(zzfhg);
        }

        public final int zzhs() {
            int i = this.zzppi;
            if (i != -1) {
                return i;
            }
            i = this.zzpph.zzhs() + 0;
            this.zzppi = i;
            return i;
        }
    }
}
