package com.mapbox.mapboxsdk.offline;

import android.os.Handler;
import android.os.Looper;
import com.mapbox.mapboxsdk.MapboxNatives;
import com.mapbox.mapboxsdk.storage.FileSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class OfflineRegion {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_INACTIVE = 0;
    private OfflineRegionDefinition definition;
    private boolean deliverInactiveMessages = false;
    private FileSource fileSource;
    private Handler handler;
    private long id;
    private boolean isDeleted;
    private byte[] metadata;
    private long nativePtr;
    private int state = 0;

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadState {
    }

    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String str);
    }

    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long j);

        void onError(OfflineRegionError offlineRegionError);

        void onStatusChanged(OfflineRegionStatus offlineRegionStatus);
    }

    public interface OfflineRegionStatusCallback {
        void onError(String str);

        void onStatus(OfflineRegionStatus offlineRegionStatus);
    }

    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String str);

        void onUpdate(byte[] bArr);
    }

    static {
        MapboxNatives.load();
    }

    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.fileSource = fileSource;
        this.id = j2;
        this.definition = offlineRegionDefinition;
        this.metadata = bArr;
        initialize(j, fileSource);
    }

    private native void deleteOfflineRegion(OfflineRegionDeleteCallback offlineRegionDeleteCallback);

    private boolean deliverMessages() {
        return this.state == 1 ? true : isDeliveringInactiveMessages();
    }

    private Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        return this.handler;
    }

    private native void getOfflineRegionStatus(OfflineRegionStatusCallback offlineRegionStatusCallback);

    private native void initialize(long j, FileSource fileSource);

    private native void setOfflineRegionDownloadState(int i);

    private native void setOfflineRegionObserver(OfflineRegionObserver offlineRegionObserver);

    private native void updateOfflineRegionMetadata(byte[] bArr, OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback);

    public void delete(final OfflineRegionDeleteCallback offlineRegionDeleteCallback) {
        if (!this.isDeleted) {
            deleteOfflineRegion(new OfflineRegionDeleteCallback() {
                public void onDelete() {
                    OfflineRegion.this.isDeleted = true;
                    OfflineRegion.this.getHandler().post(new Runnable() {
                        public void run() {
                            offlineRegionDeleteCallback.onDelete();
                            OfflineRegion.this.finalize();
                        }
                    });
                }

                public void onError(final String str) {
                    OfflineRegion.this.getHandler().post(new Runnable() {
                        public void run() {
                            offlineRegionDeleteCallback.onError(str);
                        }
                    });
                }
            });
        }
    }

    public native void finalize();

    public OfflineRegionDefinition getDefinition() {
        return this.definition;
    }

    public long getID() {
        return this.id;
    }

    public byte[] getMetadata() {
        return this.metadata;
    }

    public void getStatus(final OfflineRegionStatusCallback offlineRegionStatusCallback) {
        getOfflineRegionStatus(new OfflineRegionStatusCallback() {
            public void onError(final String str) {
                OfflineRegion.this.getHandler().post(new Runnable() {
                    public void run() {
                        offlineRegionStatusCallback.onError(str);
                    }
                });
            }

            public void onStatus(final OfflineRegionStatus offlineRegionStatus) {
                OfflineRegion.this.getHandler().post(new Runnable() {
                    public void run() {
                        offlineRegionStatusCallback.onStatus(offlineRegionStatus);
                    }
                });
            }
        });
    }

    public boolean isDeliveringInactiveMessages() {
        return this.deliverInactiveMessages;
    }

    public void setDeliverInactiveMessages(boolean z) {
        this.deliverInactiveMessages = z;
    }

    public void setDownloadState(int i) {
        this.state = i;
        setOfflineRegionDownloadState(i);
    }

    public void setObserver(final OfflineRegionObserver offlineRegionObserver) {
        setOfflineRegionObserver(new OfflineRegionObserver() {
            public void mapboxTileCountLimitExceeded(final long j) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.getHandler().post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.mapboxTileCountLimitExceeded(j);
                            }
                        }
                    });
                }
            }

            public void onError(final OfflineRegionError offlineRegionError) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.getHandler().post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.onError(offlineRegionError);
                            }
                        }
                    });
                }
            }

            public void onStatusChanged(final OfflineRegionStatus offlineRegionStatus) {
                if (OfflineRegion.this.deliverMessages()) {
                    OfflineRegion.this.getHandler().post(new Runnable() {
                        public void run() {
                            if (offlineRegionObserver != null) {
                                offlineRegionObserver.onStatusChanged(offlineRegionStatus);
                            }
                        }
                    });
                }
            }
        });
    }

    public void updateMetadata(byte[] bArr, final OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback) {
        updateOfflineRegionMetadata(bArr, new OfflineRegionUpdateMetadataCallback() {
            public void onError(final String str) {
                OfflineRegion.this.getHandler().post(new Runnable() {
                    public void run() {
                        offlineRegionUpdateMetadataCallback.onError(str);
                    }
                });
            }

            public void onUpdate(final byte[] bArr) {
                OfflineRegion.this.getHandler().post(new Runnable() {
                    public void run() {
                        OfflineRegion.this.metadata = bArr;
                        offlineRegionUpdateMetadataCallback.onUpdate(bArr);
                    }
                });
            }
        });
    }
}
