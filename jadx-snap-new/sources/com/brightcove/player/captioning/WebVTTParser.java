package com.brightcove.player.captioning;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebVTTParser {
    private static final String a = "WebVTTParser";
    private static final Pattern b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern c = Pattern.compile("(\\d+:)?[0-5]\\d:[0-5]\\d\\.\\d{3}");
    private static final Pattern d = Pattern.compile("\\s+(\\S+):(\\S+)");
    private static final Pattern e;
    private static final Pattern f;

    static {
        String str = "([\\S&&[^,]]+),?(\\S+)?";
        e = Pattern.compile(str);
        f = Pattern.compile(str);
    }

    private static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        Matcher matcher = d.matcher(str);
        while (matcher.find()) {
            hashMap.put(matcher.group(1), matcher.group(2));
        }
        return hashMap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x0042 in {4, 6, 8} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    private static long b(java.lang.String r8) {
        /*
        r0 = c;
        r0 = r0.matcher(r8);
        r0 = r0.find();
        if (r0 == 0) goto L_0x003a;
        r0 = 2;
        r1 = "\\.";
        r8 = r8.split(r1, r0);
        r0 = 0;
        r2 = 0;
        r3 = r8[r2];
        r4 = ":";
        r3 = r3.split(r4);
        r4 = r3.length;
        if (r2 >= r4) goto L_0x002e;
        r5 = r3[r2];
        r6 = 60;
        r0 = r0 * r6;
        r5 = java.lang.Long.parseLong(r5);
        r0 = r0 + r5;
        r2 = r2 + 1;
        goto L_0x001f;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r2;
        r2 = 1;
        r8 = r8[r2];
        r2 = java.lang.Long.parseLong(r8);
        r0 = r0 + r2;
        return r0;
        r8 = new java.lang.NumberFormatException;
        r0 = "has invalid format";
        r8.<init>(r0);
        throw r8;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.WebVTTParser.b(java.lang.String):long");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:153:0x02f3 in {4, 30, 31, 39, 42, 45, 48, 51, 54, 57, 58, 67, 68, 69, 70, 71, 72, 73, 74, 78, 81, 82, 91, 94, 97, 100, 101, 105, 106, 107, 108, 109, 113, 116, 117, 125, 128, 131, 134, 135, 139, 140, 141, 142, 143, 144, 146, 148, 150, 152} preds:[]
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:242)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:42)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:292)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
        */
    public static com.brightcove.player.model.WebVTTDocument parse(java.io.InputStream r18, java.lang.String r19) {
        /*
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = new java.util.HashMap;
        r1.<init>();
        r2 = new java.io.BufferedReader;
        r3 = new java.io.InputStreamReader;
        r4 = r18;
        r5 = r19;
        r3.<init>(r4, r5);
        r2.<init>(r3);
        r3 = r2.readLine();
        if (r3 == 0) goto L_0x02eb;
        r5 = "﻿";
        r5 = r3.startsWith(r5);
        r6 = 1;
        if (r5 == 0) goto L_0x0032;
        r5 = a;
        r7 = "BOMs in UTF-8 files are not necessary or recommended.  Please remove.";
        android.util.Log.w(r5, r7);
        r3 = r3.substring(r6);
        r5 = "WEBVTT";
        r5 = r3.startsWith(r5);
        if (r5 == 0) goto L_0x02db;
        r3 = r2.readLine();
        if (r3 == 0) goto L_0x02d3;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x003a;
        r3 = r2.readLine();
        if (r3 == 0) goto L_0x02c7;
        r5 = b;
        r3 = r5.matcher(r3);
        r5 = r3.find();
        if (r5 == 0) goto L_0x0046;
        r5 = r3.group(r6);
        r7 = b(r5);
        r5 = 2;
        r9 = r3.group(r5);
        r9 = b(r9);
        r11 = 3;
        r3 = r3.group(r11);
        r3 = a(r3);
        r12 = "";
        r13 = r2.readLine();
        if (r13 == 0) goto L_0x00c9;
        r14 = r13.isEmpty();
        if (r14 != 0) goto L_0x00c9;
        r14 = r12.length();
        if (r14 <= 0) goto L_0x00b5;
        r14 = "<br>";
        r14 = r12.endsWith(r14);
        if (r14 != 0) goto L_0x00b5;
        r14 = "<br >";
        r14 = r12.endsWith(r14);
        if (r14 != 0) goto L_0x00b5;
        r14 = "<br/>";
        r15 = r12.endsWith(r14);
        if (r15 != 0) goto L_0x00b5;
        r15 = "<br />";
        r15 = r12.endsWith(r15);
        if (r15 != 0) goto L_0x00b5;
        r15 = new java.lang.StringBuilder;
        r15.<init>();
        r15.append(r12);
        r15.append(r14);
        r12 = r15.toString();
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r14.append(r12);
        r12 = r13.trim();
        r14.append(r12);
        r12 = r14.toString();
        goto L_0x0074;
        r13 = new com.brightcove.player.captioning.BrightcoveClosedCaption;
        r8 = (int) r7;
        r7 = (int) r9;
        r13.<init>(r8, r7, r12);
        r3 = r3.entrySet();
        r3 = r3.iterator();
        r8 = 0;
        r9 = r3.hasNext();
        if (r9 == 0) goto L_0x02c2;
        r9 = r3.next();
        r9 = (java.util.Map.Entry) r9;
        r10 = r9.getKey();
        r10 = (java.lang.String) r10;
        r12 = "align";
        r10 = r10.equals(r12);
        r12 = "start";
        r14 = "end";
        r7 = "center";
        r16 = -1;
        if (r10 == 0) goto L_0x0183;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.UNDEFINED;
        r17 = r9.getValue();
        r15 = r17;
        r15 = (java.lang.String) r15;
        r17 = r15.hashCode();
        r11 = 4;
        switch(r17) {
            case -1364013995: goto L_0x013c;
            case -1074341483: goto L_0x0132;
            case 100571: goto L_0x012a;
            case 3317767: goto L_0x0120;
            case 108511772: goto L_0x0116;
            case 109757538: goto L_0x010e;
            default: goto L_0x010d;
        };
        goto L_0x0144;
        r7 = r15.equals(r12);
        if (r7 == 0) goto L_0x0144;
        r7 = 0;
        goto L_0x0145;
        r7 = "right";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x0144;
        r7 = 4;
        goto L_0x0145;
        r7 = "left";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x0144;
        r7 = 1;
        goto L_0x0145;
        r7 = r15.equals(r14);
        if (r7 == 0) goto L_0x0144;
        r7 = 5;
        goto L_0x0145;
        r7 = "middle";
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x0144;
        r7 = 2;
        goto L_0x0145;
        r7 = r15.equals(r7);
        if (r7 == 0) goto L_0x0144;
        r7 = 3;
        goto L_0x0145;
        r7 = -1;
        if (r7 == 0) goto L_0x017b;
        if (r7 == r6) goto L_0x0177;
        if (r7 == r5) goto L_0x0173;
        r15 = 3;
        if (r7 == r15) goto L_0x0174;
        if (r7 == r11) goto L_0x0170;
        r11 = 5;
        if (r7 == r11) goto L_0x016d;
        r7 = a;
        r11 = new java.lang.StringBuilder;
        r12 = "unexpected align value: ";
        r11.<init>(r12);
        r9 = r9.getValue();
        r9 = (java.lang.String) r9;
        r11.append(r9);
        r9 = r11.toString();
        android.util.Log.w(r7, r9);
        goto L_0x017e;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.END;
        goto L_0x017e;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.RIGHT;
        goto L_0x017e;
        r15 = 3;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.CENTER;
        goto L_0x017e;
        r15 = 3;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.LEFT;
        goto L_0x017e;
        r15 = 3;
        r10 = com.brightcove.player.model.StyledElement.TextAlign.START;
        r13.setTextAlign(r10);
        goto L_0x02bf;
        r15 = 3;
        r10 = r9.getKey();
        r10 = (java.lang.String) r10;
        r11 = "line";
        r10 = r10.equals(r11);
        r11 = -1364013995; // 0xffffffffaeb2cc55 float:-8.1307995E-11 double:NaN;
        if (r10 == 0) goto L_0x0222;
        if (r8 != 0) goto L_0x01b2;
        r8 = new com.brightcove.player.model.Region;
        r8.<init>();
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r15 = r1.size();
        r10.append(r15);
        r10 = r10.toString();
        r1.put(r10, r8);
        r13.setRegion(r10);
        r9 = r9.getValue();
        r9 = (java.lang.String) r9;
        r10 = e;
        r9 = r10.matcher(r9);
        r10 = r9.find();
        if (r10 == 0) goto L_0x01d2;
        r10 = new xy;
        r15 = r9.group(r6);
        r9 = r9.group(r5);
        r10.<init>(r15, r9);
        goto L_0x01d3;
        r10 = 0;
        r9 = new com.brightcove.player.model.Length;
        r15 = r10.a;
        r9.<init>(r15);
        r8.setOriginY(r9);
        r9 = r10.b;
        if (r9 == 0) goto L_0x02bf;
        r9 = r10.b;
        r10 = r9.hashCode();
        if (r10 == r11) goto L_0x0204;
        r7 = 100571; // 0x188db float:1.4093E-40 double:4.96887E-319;
        if (r10 == r7) goto L_0x01fc;
        r7 = 109757538; // 0x68ac462 float:5.219839E-35 double:5.4227429E-316;
        if (r10 == r7) goto L_0x01f4;
        goto L_0x020c;
        r7 = r9.equals(r12);
        if (r7 == 0) goto L_0x020c;
        r7 = 0;
        goto L_0x020d;
        r7 = r9.equals(r14);
        if (r7 == 0) goto L_0x020c;
        r7 = 2;
        goto L_0x020d;
        r7 = r9.equals(r7);
        if (r7 == 0) goto L_0x020c;
        r7 = 1;
        goto L_0x020d;
        r7 = -1;
        if (r7 == 0) goto L_0x021b;
        if (r7 == r6) goto L_0x0218;
        if (r7 == r5) goto L_0x0215;
        goto L_0x02bf;
        r7 = com.brightcove.player.model.Region.DisplayAlign.AFTER;
        goto L_0x021d;
        r7 = com.brightcove.player.model.Region.DisplayAlign.CENTER;
        goto L_0x021d;
        r7 = com.brightcove.player.model.Region.DisplayAlign.BEFORE;
        r8.setDisplayAlign(r7);
        goto L_0x02bf;
        r10 = r9.getKey();
        r10 = (java.lang.String) r10;
        r12 = "position";
        r10 = r10.equals(r12);
        if (r10 == 0) goto L_0x02bf;
        if (r8 != 0) goto L_0x024d;
        r8 = new com.brightcove.player.model.Region;
        r8.<init>();
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r12 = r1.size();
        r10.append(r12);
        r10 = r10.toString();
        r1.put(r10, r8);
        r13.setRegion(r10);
        r9 = r9.getValue();
        r9 = (java.lang.String) r9;
        r10 = f;
        r9 = r10.matcher(r9);
        r10 = r9.find();
        if (r10 == 0) goto L_0x026d;
        r10 = new xz;
        r12 = r9.group(r6);
        r9 = r9.group(r5);
        r10.<init>(r12, r9);
        goto L_0x026e;
        r10 = 0;
        r9 = new com.brightcove.player.model.Length;
        r12 = r10.a;
        r9.<init>(r12);
        r8.setOriginX(r9);
        r9 = r10.b;
        if (r9 == 0) goto L_0x02bf;
        r9 = r10.b;
        r10 = r9.hashCode();
        r12 = -1842484672; // 0xffffffff922dea40 float:-5.487791E-28 double:NaN;
        if (r10 == r12) goto L_0x02a1;
        if (r10 == r11) goto L_0x0299;
        r7 = -1276788989; // 0xffffffffb3e5bf03 float:-1.0698388E-7 double:NaN;
        if (r10 == r7) goto L_0x028f;
        goto L_0x02ab;
        r7 = "line-right";
        r7 = r9.equals(r7);
        if (r7 == 0) goto L_0x02ab;
        r7 = 2;
        goto L_0x02ac;
        r7 = r9.equals(r7);
        if (r7 == 0) goto L_0x02ab;
        r7 = 1;
        goto L_0x02ac;
        r7 = "line-left";
        r7 = r9.equals(r7);
        if (r7 == 0) goto L_0x02ab;
        r7 = 0;
        goto L_0x02ac;
        r7 = -1;
        if (r7 == 0) goto L_0x02bb;
        if (r7 == r6) goto L_0x02b7;
        if (r7 == r5) goto L_0x02b3;
        goto L_0x02bf;
        r7 = com.brightcove.player.model.Region.DisplayAlign.AFTER;
        goto L_0x021d;
        r7 = com.brightcove.player.model.Region.DisplayAlign.CENTER;
        goto L_0x021d;
        r7 = com.brightcove.player.model.Region.DisplayAlign.BEFORE;
        goto L_0x021d;
        r11 = 3;
        goto L_0x00d9;
        r0.add(r13);
        goto L_0x0046;
        r2.close();
        r18.close();
        r2 = new com.brightcove.player.model.WebVTTDocument;
        r2.<init>(r1, r0);
        return r2;
        r0 = new java.io.IOException;
        r1 = "Expected an empty line after webvtt header";
        r0.<init>(r1);
        throw r0;
        r0 = new java.io.IOException;
        r1 = java.lang.String.valueOf(r3);
        r2 = "Expected WEBVTT. Got ";
        r1 = r2.concat(r1);
        r0.<init>(r1);
        throw r0;
        r0 = new java.io.IOException;
        r1 = "Expected WEBVTT. Got null";
        r0.<init>(r1);
        throw r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.brightcove.player.captioning.WebVTTParser.parse(java.io.InputStream, java.lang.String):com.brightcove.player.model.WebVTTDocument");
    }
}
