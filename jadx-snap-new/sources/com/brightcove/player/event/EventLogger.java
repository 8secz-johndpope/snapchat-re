package com.brightcove.player.event;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map.Entry;

public class EventLogger {
    boolean a;
    ArrayList<String> b;
    ArrayList<String> c;
    String d;
    LoggerCallback e;
    private EventEmitter f;
    private EventListener g;
    private int h;

    public interface LoggerCallback {
        void logError(String str, Throwable th);

        void logMessage(String str);
    }

    public EventLogger(EventEmitter eventEmitter, boolean z) {
        this(eventEmitter, z, "EventLogger");
    }

    public EventLogger(EventEmitter eventEmitter, boolean z, LoggerCallback loggerCallback) {
        this(eventEmitter, z, "EventLogger", loggerCallback);
    }

    public EventLogger(EventEmitter eventEmitter, boolean z, String str) {
        this(eventEmitter, z, str, null);
    }

    public EventLogger(EventEmitter eventEmitter, boolean z, String str, LoggerCallback loggerCallback) {
        this.h = 0;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.f = eventEmitter;
        this.a = z;
        this.d = str;
        this.e = loggerCallback;
        this.b.add(EventType.BUFFERED_UPDATE);
        this.b.add("progress");
        this.b.add(EventType.AD_PROGRESS);
        start();
    }

    public void addExclude(String str) {
        if (!this.b.contains(str)) {
            this.b.add(str);
        }
    }

    public void addWhitelist(String str) {
        if (!this.c.contains(str)) {
            this.c.add(str);
        }
    }

    public void clearExcludes() {
        this.b.clear();
    }

    public void clearWhitelist() {
        this.c.clear();
    }

    public void removeExclude(String str) {
        this.b.remove(str);
    }

    public void removeFromWhitelist(String str) {
        this.c.remove(str);
    }

    public void setVerbose(boolean z) {
        this.a = z;
    }

    public void start() {
        stop();
        this.g = new EventListener() {
            private void a(Event event) {
                StringBuffer stringBuffer = new StringBuffer(event.getType());
                Object obj = event.properties.get(Event.EMITTER);
                if (obj != null) {
                    stringBuffer.append(" (");
                    stringBuffer.append(obj);
                    stringBuffer.append(')');
                }
                if (EventLogger.this.a) {
                    stringBuffer.append(" { ");
                    for (Entry entry : event.properties.entrySet()) {
                        stringBuffer.append((String) entry.getKey());
                        stringBuffer.append(": ");
                        stringBuffer.append(entry.getValue());
                        stringBuffer.append(' ');
                    }
                    stringBuffer.append('}');
                }
                if (EventLogger.this.e != null) {
                    EventLogger.this.e.logMessage(stringBuffer.toString());
                } else {
                    Log.d(EventLogger.this.d, stringBuffer.toString());
                }
                String str = "error";
                if (str.equals(event.getType()) && event.properties.containsKey(str)) {
                    String str2 = "Unhandled error event";
                    Throwable th = (Throwable) event.properties.get(str);
                    if (EventLogger.this.e != null) {
                        EventLogger.this.e.logError(str2, th);
                        return;
                    }
                    Log.e("EventLogger", str2, th);
                }
            }

            public final void processEvent(Event event) {
                if (EventLogger.this.c.isEmpty()) {
                    if (!EventLogger.this.b.contains(event.getType())) {
                        a(event);
                    }
                } else if (EventLogger.this.c.contains(event.getType())) {
                    a(event);
                }
            }
        };
        this.h = this.f.on(EventType.ANY, this.g);
    }

    public void stop() {
        int i = this.h;
        if (i > 0) {
            this.f.off(EventType.ANY, i);
            this.h = 0;
        }
    }
}
