package com.brightcove.player.captioning;

import android.util.Log;
import android.util.Xml;
import com.brightcove.player.model.Block;
import com.brightcove.player.model.Element;
import com.brightcove.player.model.Length;
import com.brightcove.player.model.Region;
import com.brightcove.player.model.Region.DisplayAlign;
import com.brightcove.player.model.Span;
import com.brightcove.player.model.StyledElement;
import com.brightcove.player.model.StyledElement.FontStyle;
import com.brightcove.player.model.StyledElement.FontWeight;
import com.brightcove.player.model.StyledElement.TextAlign;
import com.brightcove.player.model.StyledElement.TextDecoration;
import com.brightcove.player.model.TTMLDocument;
import com.brightcove.player.util.StringUtil;
import com.mapbox.services.android.telemetry.constants.TelemetryConstants;
import com.snap.ui.view.multisnap.MultiSnapThumbnailTilesViewControllerKt;
import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class TTMLParser {
    private static final String a = "TTMLParser";
    private static final Pattern b = Pattern.compile("^(\\d{2}+):(\\d{2}+):(\\d{2}+)[:.](\\d{2,3}+)$");

    public static class Attributes {
        public static final String BEGIN = "begin";
        public static final String BG_COLOR = "backgroundColor";
        public static final String COLOR = "color";
        public static final String DISPLAY_ALIGN = "displayAlign";
        public static final String END = "end";
        public static final String EXTENT = "extent";
        public static final String FONT_FAMILY = "fontFamily";
        public static final String FONT_SIZE = "fontSize";
        public static final String FONT_STYLE = "fontStyle";
        public static final String FONT_WEIGHT = "fontWeight";
        public static final String ID = "id";
        public static final String ORIGIN = "origin";
        public static final String REGION = "region";
        public static final String STYLE = "style";
        public static final String TEXT_ALIGN = "textAlign";
        public static final String TEXT_DECORATION = "textDecoration";
    }

    public static class Namespaces {
        public static final String DEFAULT = null;
        public static final String TTM = "http://www.w3.org/ns/ttml#metadata";
        public static final String TTS = "http://www.w3.org/ns/ttml#styling";
        public static final String XML = "http://www.w3.org/XML/1998/namespace";
    }

    public static class Tags {
        public static final String BODY = "body";
        public static final String BR = "br";
        public static final String CAPTION = "p";
        public static final String HEAD = "head";
        public static final String LAYOUT = "layout";
        public static final String REGION = "region";
        public static final String ROOT = "tt";
        public static final String SPAN = "span";
        public static final String STYLE = "style";
        public static final String STYLING = "styling";
    }

    private TTMLParser() {
    }

    private static TTMLDocument a(XmlPullParser xmlPullParser) {
        Map hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, Namespaces.DEFAULT, Tags.ROOT);
        Map map = null;
        Block block = map;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals(Tags.STYLING)) {
                    map = b(xmlPullParser);
                } else if (name.equals(Tags.LAYOUT)) {
                    hashMap = c(xmlPullParser);
                } else if (name.equals(Tags.BODY)) {
                    block = new Block();
                    a((StyledElement) block, xmlPullParser);
                    a(block, xmlPullParser);
                } else if (name.equals(Tags.CAPTION)) {
                    arrayList.add(d(xmlPullParser));
                }
            }
        }
        xmlPullParser.require(1, Namespaces.DEFAULT, null);
        return new TTMLDocument(hashMap, map, block, arrayList);
    }

    private static void a(Block block, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(Namespaces.DEFAULT, Attributes.BEGIN);
        String attributeValue2 = xmlPullParser.getAttributeValue(Namespaces.DEFAULT, Attributes.END);
        int parseTimeValue = parseTimeValue(attributeValue);
        int parseTimeValue2 = parseTimeValue(attributeValue2);
        String attributeValue3 = xmlPullParser.getAttributeValue(Namespaces.DEFAULT, "region");
        block.setBeginTime(parseTimeValue);
        block.setEndTime(parseTimeValue2);
        if (!StringUtil.isEmpty(attributeValue3)) {
            block.setRegion(attributeValue3);
        }
    }

    private static void a(Element element, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(Namespaces.XML, "id");
        if (!StringUtil.isEmpty(attributeValue)) {
            element.setID(attributeValue);
        }
    }

    private static void a(Region region, XmlPullParser xmlPullParser) {
        String[] split;
        String str = Namespaces.TTS;
        String attributeValue = xmlPullParser.getAttributeValue(str, Attributes.ORIGIN);
        String attributeValue2 = xmlPullParser.getAttributeValue(str, Attributes.EXTENT);
        String attributeValue3 = xmlPullParser.getAttributeValue(str, Attributes.DISPLAY_ALIGN);
        String str2 = " ";
        if (!StringUtil.isEmpty(attributeValue)) {
            split = attributeValue.split(str2);
            region.setOriginX(new Length(split[0]));
            region.setOriginY(new Length(split[1]));
        }
        if (!StringUtil.isEmpty(attributeValue2)) {
            split = attributeValue2.split(str2);
            region.setExtentX(new Length(split[0]));
            region.setExtentY(new Length(split[1]));
        }
        if (!StringUtil.isEmpty(attributeValue3)) {
            region.setDisplayAlign(DisplayAlign.fromString(attributeValue3));
        }
    }

    private static void a(StyledElement styledElement, XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(Namespaces.DEFAULT, "style");
        if (!StringUtil.isEmpty(attributeValue)) {
            styledElement.setStyleName(attributeValue);
        }
        attributeValue = Namespaces.TTS;
        String attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, "color");
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setColor(attributeValue2);
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.BG_COLOR);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setBackgroundColor(attributeValue2);
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.FONT_STYLE);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setFontStyle(FontStyle.valueOf(attributeValue2.toUpperCase(Locale.getDefault())));
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.TEXT_ALIGN);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setTextAlign(TextAlign.valueOf(attributeValue2.toUpperCase(Locale.getDefault())));
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.FONT_WEIGHT);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setFontWeight(FontWeight.valueOf(attributeValue2.toUpperCase(Locale.getDefault())));
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.TEXT_DECORATION);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setTextDecoration(TextDecoration.valueOf(attributeValue2.toUpperCase(Locale.getDefault())));
        }
        attributeValue2 = xmlPullParser.getAttributeValue(attributeValue, Attributes.FONT_SIZE);
        if (!StringUtil.isEmpty(attributeValue2)) {
            styledElement.setFontSize(new Length(attributeValue2));
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(attributeValue, Attributes.FONT_FAMILY);
        if (!StringUtil.isEmpty(attributeValue3)) {
            styledElement.setFontFamily(attributeValue3);
        }
    }

    private static Map<String, StyledElement> b(XmlPullParser xmlPullParser) {
        String str = Namespaces.DEFAULT;
        String str2 = Tags.STYLING;
        xmlPullParser.require(2, str, str2);
        HashMap hashMap = new HashMap();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(str2)) {
                xmlPullParser.require(3, Namespaces.DEFAULT, str2);
                return hashMap;
            } else if (xmlPullParser.getEventType() == 2) {
                String str3 = "style";
                if (xmlPullParser.getName().equals(str3)) {
                    xmlPullParser.require(2, Namespaces.DEFAULT, str3);
                    StyledElement styledElement = new StyledElement();
                    a((Element) styledElement, xmlPullParser);
                    a(styledElement, xmlPullParser);
                    hashMap.put(styledElement.getID(), styledElement);
                }
            }
        }
    }

    private static Map<String, Region> c(XmlPullParser xmlPullParser) {
        String str = Namespaces.DEFAULT;
        String str2 = Tags.LAYOUT;
        xmlPullParser.require(2, str, str2);
        HashMap hashMap = new HashMap();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(str2)) {
                xmlPullParser.require(3, Namespaces.DEFAULT, str2);
                return hashMap;
            } else if (xmlPullParser.getEventType() == 2) {
                String str3 = "region";
                if (xmlPullParser.getName().equals(str3)) {
                    xmlPullParser.require(2, Namespaces.DEFAULT, str3);
                    Region region = new Region();
                    a((Element) region, xmlPullParser);
                    a((StyledElement) region, xmlPullParser);
                    a(region, xmlPullParser);
                    if (xmlPullParser.nextTag() == 2 && xmlPullParser.getName().equals("style")) {
                        a((StyledElement) region, xmlPullParser);
                        a(region, xmlPullParser);
                    }
                    hashMap.put(region.getID(), region);
                }
            }
        }
    }

    private static BrightcoveClosedCaption d(XmlPullParser xmlPullParser) {
        String str = Namespaces.DEFAULT;
        String str2 = Tags.CAPTION;
        xmlPullParser.require(2, str, str2);
        Block brightcoveClosedCaption = new BrightcoveClosedCaption();
        a((StyledElement) brightcoveClosedCaption, xmlPullParser);
        a(brightcoveClosedCaption, xmlPullParser);
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        Span span = new Span();
        StringBuilder stringBuilder = new StringBuilder();
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals(str2)) {
                break;
            }
            int eventType = xmlPullParser.getEventType();
            String text;
            if (eventType == 4) {
                text = xmlPullParser.getText();
                if (!StringUtil.isEmpty(text)) {
                    if (span == null) {
                        span = new Span();
                    }
                    stringBuilder.append(text);
                }
            } else {
                String str3 = Tags.SPAN;
                if (eventType == 2) {
                    text = xmlPullParser.getName();
                    if (text.equals(str3)) {
                        if (span != null) {
                            span.setText(stringBuilder.toString());
                            arrayList2.add(span);
                            stringBuilder.delete(0, stringBuilder.length());
                        }
                        span = new Span();
                        a((StyledElement) span, xmlPullParser);
                    } else if (text.equals(Tags.BR)) {
                        if (stringBuilder.length() > 0) {
                            StyledElement span2;
                            if (span == null) {
                                span2 = new Span();
                            }
                            span2.setText(stringBuilder.toString());
                            arrayList2.add(span2);
                            stringBuilder.delete(0, stringBuilder.length());
                            span = new Span(span2);
                        }
                        arrayList.add(arrayList2);
                        arrayList2 = new ArrayList();
                    }
                } else if (eventType == 3 && xmlPullParser.getName().equals(str3)) {
                    span.setText(stringBuilder.toString());
                    arrayList2.add(span);
                    span = null;
                    stringBuilder.delete(0, stringBuilder.length());
                }
            }
        }
        if (stringBuilder.length() > 0) {
            if (span == null) {
                span = new Span();
            }
            span.setText(stringBuilder.toString());
            arrayList2.add(span);
        }
        arrayList.add(arrayList2);
        brightcoveClosedCaption.setLines(arrayList);
        return brightcoveClosedCaption;
    }

    public static int parseTimeValue(String str) {
        if (!StringUtil.isEmpty(str)) {
            try {
                Matcher matcher = b.matcher(str);
                if (matcher.find() && matcher.groupCount() >= 4) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    String group3 = matcher.group(3);
                    String group4 = matcher.group(4);
                    if (!(StringUtil.isEmpty(group) || StringUtil.isEmpty(group2) || StringUtil.isEmpty(group3) || StringUtil.isEmpty(group4))) {
                        return (((Integer.parseInt(group) * TelemetryConstants.ONE_HOUR_IN_MS) + (Integer.parseInt(group2) * 60000)) + (Integer.parseInt(group3) * MultiSnapThumbnailTilesViewControllerKt.THUMBNAIL_SELECTED_INTERVAL)) + Integer.parseInt(group4);
                    }
                }
            } catch (NumberFormatException unused) {
                Log.w(a, "got invalid time format for caption: ".concat(String.valueOf(str)));
            }
        }
        return -1;
    }

    public static TTMLDocument parseXml(InputStream inputStream, String str) {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(inputStream, str);
            newPullParser.nextTag();
            TTMLDocument a = a(newPullParser);
            return a;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static TTMLDocument parseXml(Reader reader) {
        try {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            newPullParser.setInput(reader);
            newPullParser.nextTag();
            String str = a;
            StringBuilder stringBuilder = new StringBuilder("detected XML encoding for TTML is: ");
            stringBuilder.append(newPullParser.getInputEncoding());
            Log.i(str, stringBuilder.toString());
            TTMLDocument a = a(newPullParser);
            return a;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
