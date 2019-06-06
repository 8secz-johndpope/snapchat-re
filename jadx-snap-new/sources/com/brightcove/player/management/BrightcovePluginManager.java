package com.brightcove.player.management;

import android.util.Log;
import com.brightcove.player.BuildConfig;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Default;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ListensFor(events = {"registerPlugin"})
@Emits(events = {"version"})
public class BrightcovePluginManager extends AbstractComponent {
    static final String a = "BrightcovePluginManager";
    List<String> b = new ArrayList();
    private Class<?> c;
    private Method d;
    private boolean e;
    private OnRegisterPluginListener f = new OnRegisterPluginListener();

    public class OnRegisterPluginListener implements EventListener {
        protected OnRegisterPluginListener() {
        }

        @Default
        public void processEvent(Event event) {
            Map map = event.properties;
            String str = Event.PLUGIN_NAME;
            if (map.containsKey(str)) {
                String str2 = (String) event.properties.get(str);
                Log.v(BrightcovePluginManager.a, "OnRegisterPluginListener: plugin: ".concat(String.valueOf(str2)));
                if (!BrightcovePluginManager.this.b.contains(str2)) {
                    BrightcovePluginManager.this.b.add(str2);
                }
            }
        }
    }

    public BrightcovePluginManager(EventEmitter eventEmitter) {
        super(eventEmitter, BrightcovePluginManager.class);
        addListener(EventType.REGISTER_PLUGIN, this.f);
        try {
            this.c = Class.forName("aqr");
            this.e = true;
        } catch (ClassNotFoundException unused) {
            Log.i(a, "Crashlytics was not found. Logging to console only.");
            this.e = false;
        }
        if (this.e) {
            try {
                this.d = this.c.getMethod("log", new Class[]{String.class});
            } catch (NoSuchMethodException unused2) {
                Log.i(a, "Failed to wrap crashlytics methods.");
            }
        }
        crashlyticsLog("Git Commit SHA: 58a2ef7e6ac1effa364d4688626b6fc8c0febf8f");
        crashlyticsLog("Release Number: 4.13.0");
        HashMap hashMap = new HashMap();
        hashMap.put(Event.BUILD_VERSION, BuildConfig.RELEASE_ID);
        getEventEmitter().emit("version", hashMap);
    }

    public void crashlyticsLog(String str) {
        String str2;
        Log.d(a, "crashlyticsLog: ".concat(String.valueOf(str)));
        if (this.e) {
            Method method = this.d;
            if (method != null) {
                try {
                    method.invoke(null, new Object[]{str});
                } catch (IllegalArgumentException unused) {
                    str = a;
                    str2 = "crashlyticsLog: Illegal argument exception occurred.";
                    Log.i(str, str2);
                } catch (IllegalAccessException unused2) {
                    str = a;
                    str2 = "crashlyticsLog: Illegal access exception occurred.";
                    Log.i(str, str2);
                } catch (InvocationTargetException unused3) {
                    Log.i(a, "crashlyticsLog: Invocation target exception occurred.");
                }
            }
        }
    }

    public String getCommitIdentifier() {
        return BuildConfig.COMMIT_ID;
    }

    public List<String> getPluginsInUse() {
        return this.b;
    }

    public String getReleaseIdentifier() {
        return BuildConfig.RELEASE_ID;
    }
}
