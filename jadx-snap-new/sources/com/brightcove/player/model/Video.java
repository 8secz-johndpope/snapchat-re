package com.brightcove.player.model;

import android.util.Log;
import com.brightcove.player.media.DeliveryType;
import com.brightcove.player.util.ErrorUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class Video extends MetadataObject {
    private Map<DeliveryType, SourceCollection> b;
    private List<CuePoint> c;

    public static class Fields {
        public static final String CAPTION_SOURCES = "captionSources";
        public static final String CONTENT_ID = "contentId";
        public static final String CUSTOM_FIELDS = "customFields";
        public static final String DURATION = "duration";
        public static final String HEADERS = "headers";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String PROJECTION_FORMAT = "projectionFormat";
        public static final String PUBLISHER_ID = "pubId";
        public static final String REFERENCE_ID = "referenceId";
        public static final String SHORT_DESCRIPTION = "shortDescription";
        public static final String STILL_IMAGE_URI = "stillImageUri";
    }

    public enum ProjectionFormat {
        NORMAL("normal"),
        EQUIRECTANGULAR("equirectangular");
        
        public final String name;

        private ProjectionFormat(String str) {
            this.name = str;
        }

        public static ProjectionFormat parse(Object obj) {
            return parse(obj, null);
        }

        public static ProjectionFormat parse(Object obj, ProjectionFormat projectionFormat) {
            if (obj instanceof ProjectionFormat) {
                return (ProjectionFormat) obj;
            }
            if (obj != null) {
                String obj2 = obj.toString();
                for (ProjectionFormat projectionFormat2 : values()) {
                    if (obj2.equalsIgnoreCase(projectionFormat2.name)) {
                        return projectionFormat2;
                    }
                }
            }
            return projectionFormat;
        }

        public final String toString() {
            return this.name;
        }
    }

    public Video(Map<String, Object> map) {
        super(map);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:14:0x0047 in {7, 9, 11, 13} preds:[]
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
    public Video(java.util.Map<java.lang.String, java.lang.Object> r3, java.util.Set<com.brightcove.player.model.SourceCollection> r4) {
        /*
        r2 = this;
        r2.<init>(r3);
        if (r4 == 0) goto L_0x003b;
        r3 = new java.util.HashMap;
        r3.<init>();
        r4 = r4.iterator();
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x0038;
        r0 = r4.next();
        r0 = (com.brightcove.player.model.SourceCollection) r0;
        r1 = r0.getDeliveryType();
        r1 = r3.containsKey(r1);
        if (r1 != 0) goto L_0x002c;
        r1 = r0.getDeliveryType();
        r3.put(r1, r0);
        goto L_0x000e;
        r3 = new java.lang.IllegalStateException;
        r4 = "duplicateDeliveryTypes";
        r4 = com.brightcove.player.util.ErrorUtil.getMessage(r4);
        r3.<init>(r4);
        throw r3;
        r2.b = r3;
        return;
        r3 = new java.lang.IllegalArgumentException;
        r4 = "sourceCollectionsRequired";
        r4 = com.brightcove.player.util.ErrorUtil.getMessage(r4);
        r3.<init>(r4);
        throw r3;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.model.Video.<init>(java.util.Map, java.util.Set):void");
    }

    public Video(Map<String, Object> map, Set<SourceCollection> set, List<CuePoint> list) {
        this(map, set);
        if (list != null) {
            this.c = list;
            return;
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.CUE_POINTS_REQUIRED));
    }

    public static Video createVideo(String str) {
        return createVideo(str, null, null);
    }

    public static Video createVideo(String str, DeliveryType deliveryType) {
        return createVideo(str, deliveryType, null);
    }

    public static Video createVideo(String str, DeliveryType deliveryType, ProjectionFormat projectionFormat) {
        if (str != null) {
            Object projectionFormat2;
            if (deliveryType == null) {
                deliveryType = DeliveryType.UNKNOWN;
                String toLowerCase = str.split("[?]")[0].toLowerCase(Locale.getDefault());
                if (toLowerCase.endsWith(".mp4")) {
                    deliveryType = DeliveryType.MP4;
                } else if (toLowerCase.endsWith(".m3u") || toLowerCase.endsWith(".m3u8")) {
                    deliveryType = DeliveryType.HLS;
                } else if (toLowerCase.endsWith(".mpd")) {
                    deliveryType = DeliveryType.DASH;
                }
            }
            if (projectionFormat2 == null) {
                projectionFormat2 = ProjectionFormat.NORMAL;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(new SourceCollection(new Source(str, deliveryType), deliveryType));
            HashMap hashMap = new HashMap();
            hashMap.put("projectionFormat", projectionFormat2);
            return new Video(hashMap, hashSet, new ArrayList());
        }
        throw new IllegalArgumentException(ErrorUtil.getMessage(ErrorUtil.URI_REQUIRED));
    }

    public static Video createVideo(String str, ProjectionFormat projectionFormat) {
        return createVideo(str, null, projectionFormat);
    }

    public List<CuePoint> getCuePoints() {
        return this.c;
    }

    public int getDuration() {
        String str = "duration";
        if (this.a.containsKey(str)) {
            try {
                return Integer.parseInt(this.a.get(str).toString());
            } catch (NumberFormatException unused) {
                String str2 = TAG;
                StringBuilder stringBuilder = new StringBuilder("Invalid number value seen for duration in Video: ");
                stringBuilder.append(this.a.get(str));
                Log.e(str2, stringBuilder.toString());
            }
        }
        return 0;
    }

    public String getId() {
        String str = "id";
        return this.a.containsKey(str) ? this.a.get(str).toString() : "";
    }

    public ProjectionFormat getProjectionFormat() {
        return ProjectionFormat.parse(this.a.get("projectionFormat"), ProjectionFormat.NORMAL);
    }

    public Map<DeliveryType, SourceCollection> getSourceCollections() {
        return this.b;
    }

    public boolean isVideo360() {
        return getProjectionFormat() != ProjectionFormat.NORMAL;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Video{");
        String str = "name";
        String str2 = "\"";
        if (this.a.get(str) != null) {
            stringBuilder.append("name: \"");
            stringBuilder.append(this.a.get(str));
            stringBuilder.append(str2);
        }
        str = "shortDescription";
        if (this.a.get(str) != null) {
            stringBuilder.append(", shortDescription: \"");
            stringBuilder.append(this.a.get(str));
            stringBuilder.append(str2);
        }
        stringBuilder.append(", sourceCollections: ");
        Map map = this.b;
        int i = 0;
        stringBuilder.append(map != null ? map.size() : 0);
        stringBuilder.append(", cuePoints: ");
        List list = this.c;
        if (list != null) {
            i = list.size();
        }
        stringBuilder.append(i);
        str = "customFields";
        if (this.a.get(str) != null) {
            stringBuilder.append(", custom fields: \"");
            stringBuilder.append(this.a.get(str));
            stringBuilder.append(str2);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
