package com.brightcove.player.media.tasks;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.util.Log;
import com.brightcove.player.event.Component;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.event.RegisteringEventEmitter;
import com.brightcove.player.media.ErrorFields;
import com.brightcove.player.media.HttpService;
import com.brightcove.player.media.MediaService;
import com.brightcove.player.media.VideoFields;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import defpackage.ppy;
import java.io.IOException;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@ListensFor(events = {})
@Emits(events = {"analyticsCatalogRequest", "analyticsCatalogResponse", "error"})
@Deprecated
public class FindMediaTask extends AsyncTask<URI, Void, JSONObject> implements Component {
    private static final String e = "FindMediaTask";
    protected EventEmitter a;
    protected URI b;
    protected Event c;
    protected long d;
    private String f;
    private Map<String, String> g;
    private HttpService h;

    protected FindMediaTask(EventEmitter eventEmitter, Event event, String str, Map<String, String> map) {
        if (eventEmitter == null) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.EVENT_EMITTER_REQUIRED));
        } else if (event == null) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.EVENT_REQUIRED));
        } else if (str == null || str.trim().equals("")) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.BASE_URL_REQUIRED));
        } else {
            String str2 = (String) map.get("token");
            if (str2 == null || str2.trim().isEmpty()) {
                throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.TOKEN_REQUIRED));
            }
            str2 = (String) map.get(MediaService.MEDIA_DELIVERY);
            if (str2 == null || str2.trim().isEmpty()) {
                throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.MEDIA_DELIVERY_REQUIRED));
            }
            this.a = RegisteringEventEmitter.build(eventEmitter, FindMediaTask.class);
            this.c = event;
            this.f = str;
            this.g = map;
            this.h = new HttpService();
        }
    }

    private JSONObject a(URI... uriArr) {
        JSONObject jSONObject;
        Exception e;
        String format;
        if (uriArr == null || uriArr.length != 1) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URI_REQUIRED));
        }
        jSONObject = null;
        this.b = uriArr[0];
        try {
            jSONObject = this.h.doJSONGetRequest(this.b);
            return jSONObject;
        } catch (IOException e2) {
            e = e2;
            Log.e(e, "IOException: ".concat(String.valueOf(e)));
            format = String.format(ErrorUtil.getMessage(ErrorUtil.URI_ERROR), new Object[]{this.b.toString()});
        } catch (JSONException e3) {
            e = e3;
            Log.e(e, "JSONException".concat(String.valueOf(e)));
            format = "Not a valid JSON Response";
        }
        a(format, e);
        return jSONObject;
    }

    private void a(String str, Exception exception) {
        Log.e(e, str, exception);
        HashMap hashMap = new HashMap();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(": ");
        stringBuilder.append(exception.getMessage());
        hashMap.put(ErrorFields.MESSAGE, stringBuilder.toString());
        this.a.emit("error", hashMap);
    }

    private void a(URI uri) {
        HashMap hashMap = new HashMap();
        hashMap.put(Event.CATALOG_URL, uri);
        this.a.emit(EventType.ANALYTICS_CATALOG_REQUEST, hashMap);
        this.d = System.currentTimeMillis();
    }

    public URI buildURI(String str, String str2, String str3) {
        HashMap hashMap = new HashMap(this.g);
        hashMap.put(MediaService.COMMAND, str);
        hashMap.put(str2, str3);
        Map map = this.g;
        str2 = MediaService.VIDEO_FIELDS;
        str = (String) map.get(str2);
        if (str == null) {
            hashMap.put(str2, StringUtil.join(VideoFields.DEFAULT_FIELDS, ppy.b));
        } else {
            Object obj = VideoFields.ACCOUNT_ID;
            if (!str.contains(obj)) {
                if (str.length() != 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(str);
                    stringBuilder.append(",accountId");
                    obj = stringBuilder.toString();
                }
                hashMap.put(str2, obj);
            }
        }
        return HttpService.buildURIWithQueryParameters(this.f, hashMap);
    }

    /* Access modifiers changed, original: protected|synthetic */
    public /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((URI[]) objArr);
    }

    @SuppressLint({"NewApi"})
    public void executeWithCommand(String str, String str2, String str3) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.MEDIA_API_COMMAND_REQUIRED));
        } else if (str2 == null || str2.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.ID_FIELD_REQUIRED));
        } else if (str3 == null || str3.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.ID_REQUIRED));
        } else {
            URI buildURI = buildURI(str, str2, str3);
            if (VERSION.SDK_INT >= 11) {
                executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new URI[]{buildURI});
            } else {
                execute(new URI[]{buildURI});
            }
            a(buildURI);
        }
    }

    @SuppressLint({"NewApi"})
    public void executeWithURI(URI uri) {
        if (uri != null) {
            if (VERSION.SDK_INT >= 11) {
                executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new URI[]{uri});
            } else {
                execute(new URI[]{uri});
            }
            a(uri);
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URI_REQUIRED));
    }
}
