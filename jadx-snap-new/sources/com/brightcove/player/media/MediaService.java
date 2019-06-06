package com.brightcove.player.media;

import android.net.Uri;
import android.util.Pair;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Emits;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.event.ListensFor;
import com.brightcove.player.media.tasks.FindPlaylistTask;
import com.brightcove.player.media.tasks.FindVideoTask;
import com.brightcove.player.model.CuePoint;
import com.brightcove.player.model.Source;
import com.brightcove.player.model.SourceCollection;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.Video.Fields;
import com.brightcove.player.util.ErrorUtil;
import com.brightcove.player.util.StringUtil;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

@ListensFor(events = {"findVideo", "findPlaylist"})
@Emits(events = {"error"})
public class MediaService extends AbstractComponent {
    public static final String COMMAND = "command";
    public static final String DEFAULT_MEDIA_DELIVERY = "http";
    public static final String DEFAULT_QUERY_BASE_URL = "https://api.brightcove.com/services/library";
    public static final String FIND_PLAYLIST_BY_ID = "find_playlist_by_id";
    public static final String FIND_PLAYLIST_BY_REFERENCE_ID = "find_playlist_by_reference_id";
    public static final String FIND_VIDEO_BY_ID = "find_video_by_id";
    public static final String FIND_VIDEO_BY_REFERENCE_ID = "find_video_by_reference_id";
    public static final String HLS_MEDIA_DELIVERY = "http_ios";
    public static final String ID = "id";
    public static final String KK_QUERY_BASE_URL = "https://api.brightcove.co.jp/services/library";
    public static final String MEDIA_DELIVERY = "media_delivery";
    public static final String OPTIONS = "options";
    public static final String PLAYLIST_ID = "playlist_id";
    public static final String REFERENCE_ID = "reference_id";
    public static final String TAG = "MediaService";
    public static final String TOKEN = "token";
    public static final String VIDEO_FIELDS = "video_fields";
    public static final String VIDEO_ID = "video_id";
    String a;
    String b;
    private a c;

    class a implements EventListener {
        private a() {
        }

        /* synthetic */ a(MediaService mediaService, byte b) {
            this();
        }

        public final void processEvent(Event event) {
            String str = Catalog.PLAYLIST_REFERENCE_ID;
            String str2 = Catalog.PLAYLIST_ID;
            String str3 = Catalog.VIDEO_REFERENCE_ID;
            String str4 = Catalog.VIDEO_ID;
            HashMap hashMap = new HashMap();
            hashMap.put("token", MediaService.this.a);
            hashMap.put(MediaService.MEDIA_DELIVERY, MediaService.DEFAULT_MEDIA_DELIVERY);
            Map map = event.properties;
            String str5 = MediaService.OPTIONS;
            if (map.containsKey(str5)) {
                hashMap.putAll((Map) event.properties.get(str5));
            }
            try {
                if (event.properties.containsKey(str4)) {
                    new FindVideoTask(MediaService.this.eventEmitter, event, MediaService.this.b, hashMap).findVideoById((String) event.properties.get(str4));
                } else if (event.properties.containsKey(str3)) {
                    new FindVideoTask(MediaService.this.eventEmitter, event, MediaService.this.b, hashMap).findVideoByReferenceId((String) event.properties.get(str3));
                } else if (event.properties.containsKey(str2)) {
                    new FindPlaylistTask(MediaService.this.eventEmitter, event, MediaService.this.b, hashMap).findPlaylistById((String) event.properties.get(str2));
                } else if (event.properties.containsKey(str)) {
                    new FindPlaylistTask(MediaService.this.eventEmitter, event, MediaService.this.b, hashMap).findPlaylistByReferenceId((String) event.properties.get(str));
                } else {
                    throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.KEY_NOT_FOUND));
                }
            } catch (UnsupportedEncodingException | URISyntaxException e) {
                MediaService.a(MediaService.this, event, e);
            }
        }
    }

    public MediaService(EventEmitter eventEmitter, String str) {
        this(eventEmitter, str, null);
    }

    public MediaService(EventEmitter eventEmitter, String str, String str2) {
        super(eventEmitter, MediaService.class);
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.READ_TOKEN_REQUIRED));
        }
        if (str2 == null) {
            str2 = DEFAULT_QUERY_BASE_URL;
        }
        this.a = str;
        this.b = str2;
        this.c = new a(this, (byte) 0);
        addListener(EventType.FIND_VIDEO, this.c);
        addListener(EventType.FIND_PLAYLIST, this.c);
    }

    private static Serializable a(Object obj) {
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        if (!(obj instanceof JSONObject)) {
            return null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            hashMap.put(str, a(jSONObject.get(str)));
        }
        return hashMap;
    }

    private static List<CuePoint> a(JSONObject jSONObject, EventEmitter eventEmitter, List<String> list) {
        String str = VideoFields.CUE_POINTS;
        if (jSONObject.isNull(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(buildCuePointFromJSON(jSONArray.getJSONObject(i), eventEmitter, list));
        }
        return arrayList;
    }

    private static Map<String, Object> a(JSONObject jSONObject, List<String> list) {
        Map hashMap = new HashMap();
        String str = VideoFields.ACCOUNT_ID;
        if (!jSONObject.isNull(str)) {
            hashMap.put(Fields.PUBLISHER_ID, jSONObject.getString(str));
        }
        str = "id";
        if (!jSONObject.isNull(str)) {
            hashMap.put(str, Long.valueOf(jSONObject.getLong(str)));
        }
        str = "referenceId";
        if (!jSONObject.isNull(str)) {
            hashMap.put(str, jSONObject.getString(str));
        }
        str = "name";
        if (!jSONObject.isNull(str)) {
            hashMap.put(str, jSONObject.getString(str));
        }
        str = "shortDescription";
        if (!jSONObject.isNull(str)) {
            hashMap.put(str, jSONObject.getString(str));
        }
        str = VideoFields.DURATION;
        if (!jSONObject.isNull(str)) {
            hashMap.put("duration", Integer.valueOf(jSONObject.getInt(str)));
        }
        str = VideoFields.VIDEO_STILL_URL;
        if (!jSONObject.isNull(str)) {
            try {
                hashMap.put(Fields.STILL_IMAGE_URI, new URI(jSONObject.getString(str)));
            } catch (URISyntaxException unused) {
                list.add(String.format(ErrorUtil.getMessage(ErrorUtil.INVALID_URI), new Object[]{str}));
            }
        }
        String str2 = "customFields";
        String str3 = "en";
        if (!jSONObject.isNull(str2)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            HashMap hashMap2 = new HashMap();
            if (jSONObject2 != null && jSONObject2.length() > 0) {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str4 = (String) keys.next();
                    if (str4 != null) {
                        hashMap2.put(str4, jSONObject2.getString(str4));
                    }
                }
                if (hashMap2.size() > 0) {
                    hashMap.put(str2, hashMap2);
                    for (Entry entry : hashMap2.entrySet()) {
                        String str5 = (String) entry.getKey();
                        if (str5.equals("captions")) {
                            a(str3, (String) entry.getValue(), hashMap);
                        } else if (str5.startsWith("captions_") && str5.length() > 9) {
                            a(str5.split("_")[1], (String) entry.getValue(), hashMap);
                        }
                    }
                }
            }
        }
        str2 = VideoFields.CAPTIONING;
        if (!jSONObject.isNull(str2)) {
            jSONObject = (JSONObject) jSONObject.getJSONObject(str2).getJSONArray(Fields.CAPTION_SOURCES).get(0);
            if (jSONObject != null && jSONObject.length() > 0) {
                String string = jSONObject.getString("url");
                if (string != null) {
                    a(str3, string, hashMap);
                }
            }
        }
        return hashMap;
    }

    private static Set<SourceCollection> a(JSONObject jSONObject) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        String str = VideoFields.HLS_URL;
        if (!jSONObject.isNull(str)) {
            SourceCollection b = b(jSONObject, str);
            if (b != null) {
                hashSet.add(b);
                hashSet2.add(DeliveryType.HLS);
            }
        }
        HashSet<Source> hashSet3 = new HashSet();
        hashSet3.addAll(a(jSONObject, VideoFields.RENDITIONS));
        hashSet3.addAll(a(jSONObject, VideoFields.WVM_RENDITIONS));
        hashSet3.addAll(a(jSONObject, VideoFields.IOS_RENDITIONS));
        if (!hashSet3.isEmpty()) {
            HashMap hashMap = new HashMap();
            for (Source source : hashSet3) {
                DeliveryType deliveryType = source.getDeliveryType();
                if (!hashSet2.contains(deliveryType)) {
                    if (hashMap.get(deliveryType) == null) {
                        hashMap.put(deliveryType, new HashSet());
                    }
                    ((Set) hashMap.get(deliveryType)).add(source);
                }
            }
            for (DeliveryType deliveryType2 : hashMap.keySet()) {
                hashSet.add(new SourceCollection((Set) hashMap.get(deliveryType2), deliveryType2));
                hashSet2.add(deliveryType2);
            }
        }
        str = VideoFields.VIDEO_FULL_LENGTH;
        if (!jSONObject.isNull(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Set hashSet4 = new HashSet();
            Source buildSourceFromJSON = buildSourceFromJSON(jSONObject2);
            hashSet4.add(buildSourceFromJSON);
            SourceCollection sourceCollection = new SourceCollection(hashSet4, buildSourceFromJSON.getDeliveryType());
            DeliveryType deliveryType3 = sourceCollection.getDeliveryType();
            if (!hashSet2.contains(deliveryType3)) {
                hashSet.add(sourceCollection);
                hashSet2.add(deliveryType3);
            }
        }
        if (!hashSet2.contains(DeliveryType.HLS)) {
            String str2 = "FLVURL";
            if (!jSONObject.isNull(str2)) {
                SourceCollection b2 = b(jSONObject, str2);
                if (b2 != null) {
                    hashSet.add(b2);
                }
            }
        }
        return hashSet;
    }

    private static Set<Source> a(JSONObject jSONObject, String str) {
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                hashSet.add(buildSourceFromJSON(optJSONArray.getJSONObject(i)));
            }
        }
        return hashSet;
    }

    private static void a(String str, String str2, Map<String, Object> map) {
        if (!StringUtil.isEmpty(str2)) {
            String str3 = Fields.CAPTION_SOURCES;
            List list = (List) map.get(str3);
            if (list == null) {
                list = new ArrayList();
                map.put(str3, list);
            }
            list.add(Pair.create(Uri.parse(str2), BrightcoveCaptionFormat.createCaptionFormat("text/unknown", str)));
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:24:0x005a in {3, 15, 18, 19, 21, 23} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static void a(org.json.JSONObject r3, java.util.Map<java.lang.String, java.lang.Object> r4, java.util.List<java.lang.String> r5) {
        /*
        if (r3 == 0) goto L_0x004e;
        if (r4 == 0) goto L_0x004e;
        if (r5 != 0) goto L_0x000b;
        r5 = new java.util.ArrayList;
        r5.<init>();
        r0 = r3.keys();
        r1 = r0.hasNext();
        if (r1 == 0) goto L_0x004d;
        r1 = r0.next();
        r1 = (java.lang.String) r1;
        r2 = com.brightcove.player.util.StringUtil.isEmpty(r1);
        if (r2 != 0) goto L_0x000f;
        r2 = r3.isNull(r1);
        if (r2 != 0) goto L_0x000f;
        r2 = r5.contains(r1);
        if (r2 != 0) goto L_0x000f;
        r2 = r3.getJSONObject(r1);	 Catch:{ JSONException -> 0x0039 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0039 }
        r4.put(r1, r2);	 Catch:{ JSONException -> 0x0039 }
        goto L_0x000f;
    L_0x0039:
        r2 = r3.getJSONArray(r1);	 Catch:{ JSONException -> 0x0045 }
        r2 = r2.toString();	 Catch:{ JSONException -> 0x0045 }
        r4.put(r1, r2);	 Catch:{ JSONException -> 0x0045 }
        goto L_0x000f;
        r2 = r3.getString(r1);
        r4.put(r1, r2);
        goto L_0x000f;
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "jsonAndPropertiesRequired";
        r4 = com.brightcove.player.util.ErrorUtil.getMessage(r4);
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.MediaService.a(org.json.JSONObject, java.util.Map, java.util.List):void");
    }

    private static SourceCollection b(JSONObject jSONObject, String str) {
        String string = jSONObject.getString(str);
        return string.indexOf(".m3u8") > 0 ? new SourceCollection(new Source(string, DeliveryType.HLS), DeliveryType.HLS) : null;
    }

    public static CuePoint buildCuePointFromJSON(JSONObject jSONObject, EventEmitter eventEmitter, List<String> list) {
        Object format;
        String str = CuePointFields.TIME;
        boolean isNull = jSONObject.isNull(str);
        String str2 = ErrorUtil.MISSING_CUE_POINT_PROPERTY;
        String str3 = null;
        int i = 0;
        if (isNull) {
            format = String.format(ErrorUtil.getMessage(str2), new Object[]{str});
        } else {
            String str4 = CuePointFields.TYPE_ENUM;
            if (jSONObject.isNull(str4)) {
                format = String.format(ErrorUtil.getMessage(str2), new Object[]{str4});
            } else {
                Iterator keys = jSONObject.keys();
                Map hashMap = new HashMap();
                while (keys.hasNext()) {
                    str2 = (String) keys.next();
                    if (str2.equals(str)) {
                        i = jSONObject.getInt(str);
                    } else if (str2.equals(str4)) {
                        str3 = jSONObject.getString(str4);
                    } else {
                        hashMap.put(str2, a(jSONObject.get(str2)));
                    }
                }
                a(jSONObject, hashMap, Arrays.asList(CuePointFields.DEFAULT_FIELDS));
                return new CuePoint(i, str3, hashMap);
            }
        }
        list.add(format);
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:29:0x0099 in {3, 6, 9, 12, 15, 23, 24, 26, 28} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static com.brightcove.player.model.Playlist buildPlaylistFromJSON(org.json.JSONObject r5, com.brightcove.player.event.EventEmitter r6, java.util.List<java.lang.String> r7) {
        /*
        if (r5 == 0) goto L_0x008d;
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "id";
        r2 = r5.isNull(r1);
        if (r2 != 0) goto L_0x001a;
        r2 = r5.getLong(r1);
        r2 = java.lang.Long.valueOf(r2);
        r0.put(r1, r2);
        r1 = "referenceId";
        r2 = r5.isNull(r1);
        if (r2 != 0) goto L_0x0029;
        r2 = r5.getString(r1);
        r0.put(r1, r2);
        r1 = "name";
        r2 = r5.isNull(r1);
        if (r2 != 0) goto L_0x0038;
        r2 = r5.getString(r1);
        r0.put(r1, r2);
        r1 = "shortDescription";
        r2 = r5.isNull(r1);
        if (r2 != 0) goto L_0x0047;
        r2 = r5.getString(r1);
        r0.put(r1, r2);
        r1 = "thumbnailURL";
        r2 = r5.isNull(r1);
        if (r2 != 0) goto L_0x0056;
        r2 = r5.getString(r1);
        r0.put(r1, r2);
        r1 = new java.util.ArrayList;
        r1.<init>();
        r2 = "videos";
        r3 = r5.isNull(r2);
        if (r3 != 0) goto L_0x007e;
        r2 = r5.getJSONArray(r2);
        r3 = 0;
        r4 = r2.length();
        if (r3 >= r4) goto L_0x007e;
        r4 = r2.getJSONObject(r3);
        if (r4 == 0) goto L_0x007b;
        r4 = buildVideoFromJSON(r4, r6, r7);
        r1.add(r4);
        r3 = r3 + 1;
        goto L_0x0068;
        r6 = com.brightcove.player.media.PlaylistFields.DEFAULT_FIELDS;
        r6 = java.util.Arrays.asList(r6);
        a(r5, r0, r6);
        r5 = new com.brightcove.player.model.Playlist;
        r5.<init>(r0, r1);
        return r5;
        r5 = new java.lang.IllegalArgumentException;
        r6 = "jsonRequired";
        r6 = com.brightcove.player.util.ErrorUtil.getMessage(r6);
        r5.<init>(r6);
        throw r5;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.MediaService.buildPlaylistFromJSON(org.json.JSONObject, com.brightcove.player.event.EventEmitter, java.util.List):com.brightcove.player.model.Playlist");
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    public static com.brightcove.player.model.Source buildSourceFromJSON(org.json.JSONObject r6) {
        /*
        r0 = new java.util.HashMap;
        r0.<init>();
        r1 = "url";
        r2 = r6.isNull(r1);
        if (r2 != 0) goto L_0x0014;
    L_0x000d:
        r2 = r6.getString(r1);
        r0.put(r1, r2);
    L_0x0014:
        r2 = "videoDuration";
        r3 = r6.isNull(r2);
        if (r3 != 0) goto L_0x0029;
    L_0x001c:
        r2 = r6.getLong(r2);
        r2 = java.lang.Long.valueOf(r2);
        r3 = "duration";
        r0.put(r3, r2);
    L_0x0029:
        r2 = "encodingRate";
        r3 = r6.isNull(r2);
        if (r3 != 0) goto L_0x003e;
    L_0x0031:
        r2 = r6.getInt(r2);
        r2 = java.lang.Integer.valueOf(r2);
        r3 = "bitRate";
        r0.put(r3, r2);
    L_0x003e:
        r2 = "videoContainer";
        r3 = r6.isNull(r2);
        if (r3 != 0) goto L_0x00b6;
    L_0x0046:
        r2 = r6.getString(r2);
        r3 = 0;
        r4 = 0;
        r1 = r0.get(r1);	 Catch:{ URISyntaxException -> 0x0070 }
        r1 = (java.lang.String) r1;	 Catch:{ URISyntaxException -> 0x0070 }
        if (r1 == 0) goto L_0x0080;
    L_0x0054:
        r3 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x0071 }
        r3.<init>(r1);	 Catch:{ URISyntaxException -> 0x0071 }
        r3 = r3.getScheme();	 Catch:{ URISyntaxException -> 0x0071 }
        r5 = "http";
        r5 = r3.equals(r5);	 Catch:{ URISyntaxException -> 0x0071 }
        if (r5 != 0) goto L_0x006d;
    L_0x0065:
        r5 = "https";
        r1 = r3.equals(r5);	 Catch:{ URISyntaxException -> 0x0071 }
        if (r1 == 0) goto L_0x0080;
    L_0x006d:
        r1 = 1;
        r4 = 1;
        goto L_0x0080;
    L_0x0070:
        r1 = r3;
    L_0x0071:
        r3 = TAG;
        r1 = java.lang.String.valueOf(r1);
        r5 = "Invalid URI syntax found: ";
        r1 = r5.concat(r1);
        android.util.Log.e(r3, r1);
    L_0x0080:
        r1 = "deliveryType";
        if (r4 != 0) goto L_0x008a;
    L_0x0084:
        r2 = com.brightcove.player.media.DeliveryType.UNKNOWN;
    L_0x0086:
        r0.put(r1, r2);
        goto L_0x00b6;
    L_0x008a:
        r3 = "MP4";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x0095;
    L_0x0092:
        r2 = com.brightcove.player.media.DeliveryType.MP4;
        goto L_0x0086;
    L_0x0095:
        r3 = "M2TS";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x00a0;
    L_0x009d:
        r2 = com.brightcove.player.media.DeliveryType.HLS;
        goto L_0x0086;
    L_0x00a0:
        r3 = "FLV";
        r3 = r2.equals(r3);
        if (r3 == 0) goto L_0x00ab;
    L_0x00a8:
        r2 = com.brightcove.player.media.DeliveryType.FLV;
        goto L_0x0086;
    L_0x00ab:
        r3 = "WVM";
        r2 = r2.equals(r3);
        if (r2 == 0) goto L_0x0084;
    L_0x00b3:
        r2 = com.brightcove.player.media.DeliveryType.WVM;
        goto L_0x0086;
    L_0x00b6:
        r1 = com.brightcove.player.media.SourceFields.DEFAULT_FIELDS;
        r1 = java.util.Arrays.asList(r1);
        a(r6, r0, r1);
        r6 = new com.brightcove.player.model.Source;
        r6.<init>(r0);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.media.MediaService.buildSourceFromJSON(org.json.JSONObject):com.brightcove.player.model.Source");
    }

    public static Video buildVideoFromJSON(JSONObject jSONObject, EventEmitter eventEmitter, List<String> list) {
        if (jSONObject != null) {
            Map a = a(jSONObject, (List) list);
            Set a2 = a(jSONObject);
            List a3 = a(jSONObject, eventEmitter, (List) list);
            a(jSONObject, a, Arrays.asList(VideoFields.DEFAULT_FIELDS));
            return a3 != null ? new Video(a, a2, a3) : new Video(a, a2);
        } else {
            throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.JSON_REQUIRED));
        }
    }
}
