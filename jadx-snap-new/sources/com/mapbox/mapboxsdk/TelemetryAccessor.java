package com.mapbox.mapboxsdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import com.mapbox.services.android.telemetry.MapboxTelemetry;
import com.mapbox.services.android.telemetry.TelemetryException;
import com.mapbox.services.android.telemetry.location.LocationEngine;
import com.mapbox.services.android.telemetry.location.LocationEngine.Type;
import defpackage.alsj;
import java.util.Hashtable;

public class TelemetryAccessor {
    public static TelemetryAccessorInterface DEFAULT = new DefaultTelemetryAccessor();
    public static TelemetryAccessorInterface sCustom = null;

    public interface TelemetryAccessorInterface {
        void initializeTelemetry(Context context, String str, LocationEngine locationEngine);

        void pushEvent(Hashtable<String, Object> hashtable);

        void setTelemetryEnabled(boolean z);
    }

    public static class DefaultTelemetryAccessor implements TelemetryAccessorInterface {
        private Boolean sTelemetryEnabled;
        private boolean sTelemetryEverInitialized;

        static class TelemetryInitializer {
            private static boolean isInitialized;

            static class NoOpLocationEngine extends LocationEngine {
                private NoOpLocationEngine() {
                }

                public void activate() {
                }

                public void deactivate() {
                }

                @SuppressLint({"MissingPermission"})
                public Location getLastLocation() {
                    return null;
                }

                public boolean isConnected() {
                    return false;
                }

                public Type obtainType() {
                    return Type.MOCK;
                }

                public void removeLocationUpdates() {
                }

                public void requestLocationUpdates() {
                }
            }

            private TelemetryInitializer() {
            }

            public static void initialize(Context context) {
                String str = "";
                if (onInitialized()) {
                    try {
                        MapboxTelemetry.getInstance().initialize(context, str, str, new NoOpLocationEngine());
                    } catch (TelemetryException unused) {
                    }
                }
            }

            private static synchronized boolean onInitialized() {
                synchronized (TelemetryInitializer.class) {
                    if (isInitialized) {
                        return false;
                    }
                    isInitialized = true;
                    return true;
                }
            }
        }

        public void initializeTelemetry(Context context, String str, LocationEngine locationEngine) {
            try {
                MapboxTelemetry.getInstance().initialize(context, str, BuildConfig.MAPBOX_EVENTS_USER_AGENT, locationEngine);
                synchronized (TelemetryAccessor.class) {
                    if (!this.sTelemetryEverInitialized) {
                        this.sTelemetryEverInitialized = true;
                        if (this.sTelemetryEnabled != null) {
                            try {
                                MapboxTelemetry.getInstance().setTelemetryEnabled(this.sTelemetryEnabled.booleanValue());
                            } catch (Throwable th) {
                                StringBuilder stringBuilder = new StringBuilder("Unable to set Mapbox telemetry state to ");
                                stringBuilder.append(this.sTelemetryEnabled);
                                alsj.a(th, stringBuilder.toString(), new Object[0]);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                alsj.a(th2, "Unable to instantiate Mapbox telemetry", new Object[0]);
            }
        }

        public void preInitialize(Context context) {
            TelemetryInitializer.initialize(context);
        }

        public void pushEvent(Hashtable<String, Object> hashtable) {
            MapboxTelemetry.getInstance().pushEvent(hashtable);
        }

        public synchronized void setTelemetryEnabled(boolean z) {
            this.sTelemetryEnabled = Boolean.valueOf(z);
            if (this.sTelemetryEverInitialized) {
                if (z) {
                    try {
                        MapboxTelemetry.getInstance().setSessionIdRotationTime(1);
                    } catch (Throwable th) {
                        alsj.a(th, "Unable to set Mapbox telemetry state to ".concat(String.valueOf(z)), new Object[0]);
                        return;
                    }
                }
                MapboxTelemetry.getInstance().setTelemetryEnabled(z);
            }
        }
    }

    public static TelemetryAccessorInterface getImpl() {
        TelemetryAccessorInterface telemetryAccessorInterface = sCustom;
        return telemetryAccessorInterface != null ? telemetryAccessorInterface : DEFAULT;
    }

    public static void initializeTelemetry(Context context, String str, LocationEngine locationEngine) {
        getImpl().initializeTelemetry(context, str, locationEngine);
    }

    public static void pushEvent(Hashtable<String, Object> hashtable) {
        getImpl().pushEvent(hashtable);
    }

    public static void setTelemetryEnabled(boolean z) {
        getImpl().setTelemetryEnabled(z);
    }
}
