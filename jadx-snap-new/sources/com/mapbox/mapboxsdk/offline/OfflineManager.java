package com.mapbox.mapboxsdk.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mapbox.mapboxsdk.MapboxNatives;
import com.mapbox.mapboxsdk.R;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.mapboxsdk.net.ConnectivityReceiver;
import com.mapbox.mapboxsdk.storage.FileSource;
import defpackage.alsj;
import java.io.File;

public class OfflineManager {
    private static OfflineManager instance;
    private Context context;
    private final FileSource fileSource;
    private Handler handler;
    private long nativePtr;

    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String str);
    }

    public interface ListOfflineRegionsCallback {
        void onError(String str);

        void onList(OfflineRegion[] offlineRegionArr);
    }

    static {
        MapboxNatives.load();
    }

    private OfflineManager(Context context) {
        this.context = context.getApplicationContext();
        this.fileSource = FileSource.getInstance(context);
        initialize(this.fileSource);
        deleteAmbientDatabase(context);
    }

    private native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, CreateOfflineRegionCallback createOfflineRegionCallback);

    private void deleteAmbientDatabase(final Context context) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(context.getCacheDir().getAbsolutePath());
                    stringBuilder.append(File.separator);
                    stringBuilder.append("mbgl-cache.db");
                    String stringBuilder2 = stringBuilder.toString();
                    File file = new File(stringBuilder2);
                    if (file.exists()) {
                        file.delete();
                        alsj.b("Old ambient cache database deleted to save space: ".concat(String.valueOf(stringBuilder2)), new Object[0]);
                    }
                } catch (Exception e) {
                    alsj.d("Failed to delete old ambient cache database: ", e);
                }
            }
        }).start();
    }

    private Handler getHandler() {
        if (this.handler == null) {
            this.handler = new Handler(Looper.getMainLooper());
        }
        return this.handler;
    }

    public static synchronized OfflineManager getInstance(Context context) {
        OfflineManager offlineManager;
        synchronized (OfflineManager.class) {
            if (instance == null) {
                instance = new OfflineManager(context);
            }
            offlineManager = instance;
        }
        return offlineManager;
    }

    private native void initialize(FileSource fileSource);

    private boolean isValidOfflineRegionDefinition(OfflineRegionDefinition offlineRegionDefinition) {
        return LatLngBounds.world().contains(offlineRegionDefinition.getBounds());
    }

    private native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback listOfflineRegionsCallback);

    public void createOfflineRegion(OfflineRegionDefinition offlineRegionDefinition, byte[] bArr, final CreateOfflineRegionCallback createOfflineRegionCallback) {
        if (isValidOfflineRegionDefinition(offlineRegionDefinition)) {
            ConnectivityReceiver.instance(this.context).activate();
            createOfflineRegion(this.fileSource, offlineRegionDefinition, bArr, new CreateOfflineRegionCallback() {
                public void onCreate(final OfflineRegion offlineRegion) {
                    OfflineManager.this.getHandler().post(new Runnable() {
                        public void run() {
                            ConnectivityReceiver.instance(OfflineManager.this.context).deactivate();
                            createOfflineRegionCallback.onCreate(offlineRegion);
                        }
                    });
                }

                public void onError(final String str) {
                    OfflineManager.this.getHandler().post(new Runnable() {
                        public void run() {
                            ConnectivityReceiver.instance(OfflineManager.this.context).deactivate();
                            createOfflineRegionCallback.onError(str);
                        }
                    });
                }
            });
            return;
        }
        createOfflineRegionCallback.onError(String.format(this.context.getString(R.string.mapbox_offline_error_region_definition_invalid), new Object[]{offlineRegionDefinition.getBounds()}));
    }

    public native void finalize();

    public void listOfflineRegions(final ListOfflineRegionsCallback listOfflineRegionsCallback) {
        listOfflineRegions(this.fileSource, new ListOfflineRegionsCallback() {
            public void onError(final String str) {
                OfflineManager.this.getHandler().post(new Runnable() {
                    public void run() {
                        listOfflineRegionsCallback.onError(str);
                    }
                });
            }

            public void onList(final OfflineRegion[] offlineRegionArr) {
                OfflineManager.this.getHandler().post(new Runnable() {
                    public void run() {
                        listOfflineRegionsCallback.onList(offlineRegionArr);
                    }
                });
            }
        });
    }

    public native void setOfflineMapboxTileCountLimit(long j);
}
