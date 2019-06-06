package com.snap.discover.playback.content.parser;

import android.support.annotation.Keep;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.snap.discover.playback.content.model.PageContent;

@Keep
public final class PageContentDeserializer implements JsonDeserializer<PageContent> {
    private final String getNullableStringValue(JsonElement jsonElement) {
        return (jsonElement == null || jsonElement.isJsonNull()) ? null : jsonElement.getAsString();
    }

    public final com.snap.discover.playback.content.model.PageContent deserialize(com.google.gson.JsonElement r22, java.lang.reflect.Type r23, com.google.gson.JsonDeserializationContext r24) {
        /*
        r21 = this;
        r0 = defpackage.iha.a();
        r1 = "SerializationHelper.getInstance()";
        defpackage.akcr.a(r0, r1);
        r0 = r0.b();
        if (r22 == 0) goto L_0x0279;
    L_0x000f:
        r1 = r22.getAsJsonObject();
        if (r1 == 0) goto L_0x0279;
    L_0x0015:
        r2 = "type";
        r3 = r1.get(r2);
        r4 = "get(PROPERTY_TYPE)";
        defpackage.akcr.a(r3, r4);
        r3 = r3.getAsString();
        r4 = "id";
        r4 = r1.get(r4);
        r5 = "get(PROPERTY_ID)";
        defpackage.akcr.a(r4, r5);
        r4 = r4.getAsString();
        r5 = "name";
        r5 = r1.get(r5);
        r15 = r21;
        r14 = r15.getNullableStringValue(r5);
        r5 = "properties";
        r1 = r1.get(r5);
        r5 = "get(PROPERTY_PROPERTIES)";
        defpackage.akcr.a(r1, r5);
        r1 = r1.getAsJsonObject();
        if (r3 != 0) goto L_0x0051;
    L_0x0050:
        goto L_0x0058;
    L_0x0051:
        r5 = r3.hashCode();
        switch(r5) {
            case -1978573590: goto L_0x0228;
            case -1035403226: goto L_0x01fb;
            case -602412325: goto L_0x01ce;
            case -178195843: goto L_0x01a0;
            case 285614498: goto L_0x0172;
            case 301048642: goto L_0x0144;
            case 514841930: goto L_0x0116;
            case 704091517: goto L_0x00e8;
            case 945559861: goto L_0x00ba;
            case 1106995198: goto L_0x008c;
            case 2079936271: goto L_0x005c;
            default: goto L_0x0058;
        };
    L_0x0058:
        r20 = r14;
        goto L_0x0255;
    L_0x005c:
        r5 = "local_webpage";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0058;
    L_0x0064:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.LocalWebContent.class;
        r0 = r0.fromJson(r1, r5);
        r13 = r0;
        r13 = (com.snap.discover.playback.content.model.LocalWebContent) r13;
        r0 = 0;
        r1 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 3966; // 0xf7e float:5.558E-42 double:1.9595E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r20 = r14;
        r14 = r0;
        r15 = r1;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x008c:
        r20 = r14;
        r5 = "top_snap_item";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x0096:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.SnapContent.class;
        r0 = r0.fromJson(r1, r5);
        r8 = r0;
        r8 = (com.snap.discover.playback.content.model.SnapContent) r8;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4090; // 0xffa float:5.731E-42 double:2.0207E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x00ba:
        r20 = r14;
        r5 = "deep_link_attachment";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x00c4:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.DeepLinkContent.class;
        r0 = r0.fromJson(r1, r5);
        r15 = r0;
        r15 = (com.snap.discover.playback.content.model.DeepLinkContent) r15;
        r16 = 0;
        r17 = 0;
        r18 = 3582; // 0xdfe float:5.02E-42 double:1.7697E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x00e8:
        r20 = r14;
        r5 = "app_install";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x00f2:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.AppInstallContent.class;
        r0 = r0.fromJson(r1, r5);
        r14 = r0;
        r14 = (com.snap.discover.playback.content.model.AppInstallContent) r14;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 3838; // 0xefe float:5.378E-42 double:1.896E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x0116:
        r20 = r14;
        r5 = "subscribe";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x0120:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.SubscriptionContent.class;
        r0 = r0.fromJson(r1, r5);
        r10 = r0;
        r10 = (com.snap.discover.playback.content.model.SubscriptionContent) r10;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4078; // 0xfee float:5.714E-42 double:2.015E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x0144:
        r20 = r14;
        r5 = "remote_video";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x014e:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.VideoViewContent.class;
        r0 = r0.fromJson(r1, r5);
        r9 = r0;
        r9 = (com.snap.discover.playback.content.model.VideoViewContent) r9;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4086; // 0xff6 float:5.726E-42 double:2.0188E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x0172:
        r20 = r14;
        r5 = "overlay_item";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x017c:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.OverlayContent.class;
        r0 = r0.fromJson(r1, r5);
        r11 = r0;
        r11 = (com.snap.discover.playback.content.model.OverlayContent) r11;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4062; // 0xfde float:5.692E-42 double:2.007E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x01a0:
        r20 = r14;
        r5 = "camera_attachment";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x01aa:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.CameraAttachmentContent.class;
        r0 = r0.fromJson(r1, r5);
        r17 = r0;
        r17 = (com.snap.discover.playback.content.model.CameraAttachmentContent) r17;
        r18 = 2046; // 0x7fe float:2.867E-42 double:1.011E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x01ce:
        r20 = r14;
        r5 = "commerce";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x01d8:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.CommerceContent.class;
        r0 = r0.fromJson(r1, r5);
        r12 = r0;
        r12 = (com.snap.discover.playback.content.model.CommerceContent) r12;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4030; // 0xfbe float:5.647E-42 double:1.991E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x01fb:
        r20 = r14;
        r5 = "ad_to_lens";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x0205:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.AdToLensContent.class;
        r0 = r0.fromJson(r1, r5);
        r16 = r0;
        r16 = (com.snap.discover.playback.content.model.AdToLensContent) r16;
        r17 = 0;
        r18 = 3070; // 0xbfe float:4.302E-42 double:1.517E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x0228:
        r20 = r14;
        r5 = "remote_webpage";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x0255;
    L_0x0232:
        r2 = new com.snap.discover.playback.content.model.ItemContent;
        r1 = (com.google.gson.JsonElement) r1;
        r5 = com.snap.discover.playback.content.model.WebViewContent.class;
        r0 = r0.fromJson(r1, r5);
        r7 = r0;
        r7 = (com.snap.discover.playback.content.model.WebViewContent) r7;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4092; // 0xffc float:5.734E-42 double:2.0217E-320;
        r19 = 0;
        r5 = r2;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        goto L_0x0271;
    L_0x0255:
        r0 = new com.snap.discover.playback.content.model.ItemContent;
        defpackage.akcr.a(r3, r2);
        r7 = 0;
        r8 = 0;
        r9 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r13 = 0;
        r14 = 0;
        r15 = 0;
        r16 = 0;
        r17 = 0;
        r18 = 4080; // 0xff0 float:5.717E-42 double:2.016E-320;
        r19 = 0;
        r5 = r0;
        r6 = r3;
        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
        r2 = r0;
    L_0x0271:
        r0 = new com.snap.discover.playback.content.model.PageContent;
        r1 = r20;
        r0.<init>(r1, r2, r4, r3);
        return r0;
    L_0x0279:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snap.discover.playback.content.parser.PageContentDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):com.snap.discover.playback.content.model.PageContent");
    }
}
