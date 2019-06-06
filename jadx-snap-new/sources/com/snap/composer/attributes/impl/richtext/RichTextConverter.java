package com.snap.composer.attributes.impl.richtext;

import android.graphics.Color;
import android.text.SpannedString;
import com.brightcove.player.captioning.TTMLParser.Attributes;
import com.snap.composer.attributes.conversions.ColorConversions;
import com.snap.composer.attributes.impl.fonts.FontCache;
import com.snap.composer.exceptions.AttributeError;
import defpackage.ajxt;
import defpackage.ajyx;
import defpackage.akcr;
import java.util.Map;
import java.util.Map.Entry;

public final class RichTextConverter {
    private final FontCache a;

    public RichTextConverter(FontCache fontCache) {
        akcr.b(fontCache, "fontCache");
        this.a = fontCache;
    }

    private final void a(SpanBuilder spanBuilder, Object obj, Map<String, ? extends Object> map, TextAttributes textAttributes) {
        SpanBuilder spanBuilder2 = spanBuilder;
        Object obj2 = obj;
        TextAttributes copy$default = TextAttributes.copy$default(textAttributes, null, null, null, 0, null, null, null, null, 0, null, 1023, null);
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            switch (str.hashCode()) {
                case -1550943582:
                    if (str.equals(Attributes.FONT_STYLE) && (value instanceof String)) {
                        copy$default.applyFontStyle((String) value);
                        break;
                    }
                case -1224696685:
                    if (!str.equals(Attributes.FONT_FAMILY)) {
                        break;
                    }
                    if (!(value instanceof String)) {
                        value = null;
                    }
                    copy$default.setFontFamily((String) value);
                    break;
                case -1065511464:
                    if (str.equals(Attributes.TEXT_ALIGN) && (value instanceof String)) {
                        copy$default.applyTextAlign((String) value);
                        break;
                    }
                case -879295043:
                    if (str.equals(Attributes.TEXT_DECORATION) && (value instanceof String)) {
                        copy$default.applyTextDecoration((String) value);
                        break;
                    }
                case -734428249:
                    if (str.equals(Attributes.FONT_WEIGHT) && (value instanceof String)) {
                        copy$default.applyFontWeight((String) value);
                        break;
                    }
                case -515807685:
                    if (str.equals("lineHeight") && (value instanceof Float)) {
                        copy$default.setLineHeight((Float) value);
                        break;
                    }
                case 3148879:
                    if (str.equals("font") && (value instanceof String)) {
                        copy$default.applyFont((String) value);
                        break;
                    }
                case 94842723:
                    if (str.equals("color")) {
                        if (!(value instanceof Long)) {
                            if (!(value instanceof String)) {
                                break;
                            }
                            try {
                                copy$default.setColor(Color.parseColor((String) value));
                                break;
                            } catch (Exception e) {
                                StringBuilder stringBuilder = new StringBuilder("Invalid font ");
                                stringBuilder.append(value);
                                stringBuilder.append(": ");
                                stringBuilder.append(e.getMessage());
                                throw new AttributeError(stringBuilder.toString());
                            }
                        }
                        copy$default.setColor(ColorConversions.Companion.fromRGBA(((Number) value).longValue()));
                        break;
                    }
                    break;
                case 365443962:
                    if (!str.equals("fontName")) {
                        break;
                    }
                    if (!(value instanceof String)) {
                        value = null;
                    }
                    copy$default.setFontName((String) value);
                    break;
                case 365601008:
                    if (str.equals(Attributes.FONT_SIZE)) {
                        if (!(value instanceof Long)) {
                            if (!(value instanceof Double)) {
                                break;
                            }
                            copy$default.setFontSize((int) ((Number) value).doubleValue());
                            break;
                        }
                        copy$default.setFontSize((int) ((Number) value).longValue());
                        break;
                    }
                    break;
                case 2111078717:
                    if (str.equals("letterSpacing") && (value instanceof Float)) {
                        copy$default.setLetterSpacing((Float) value);
                        break;
                    }
                default:
                    break;
            }
        }
        Object[] objArr = (Object[]) (!(obj2 instanceof Object[]) ? null : obj2);
        int i = 0;
        if (objArr == null) {
            objArr = new Object[]{obj2};
        }
        int length = objArr.length;
        while (i < length) {
            Object obj3 = objArr[i];
            if (obj3 instanceof String) {
                int length2 = spanBuilder.getLength();
                spanBuilder2.append((String) obj3);
                if (spanBuilder.getLength() > length2) {
                    spanBuilder2.addSpans(copy$default.getSpans(length2, spanBuilder.getLength(), this.a));
                }
            } else {
                Map map2;
                if (obj3 instanceof Map) {
                    Map map3 = (Map) obj3;
                    Object obj4 = map3.get("style");
                    if (!(obj4 instanceof Map)) {
                        obj4 = null;
                    }
                    map2 = (Map) obj4;
                    if (map2 == null) {
                        map2 = ajyx.a;
                    }
                    obj3 = map3.get("content");
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    if (map2 == null) {
                        throw new ajxt("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
                    }
                } else if (obj3 instanceof Object[]) {
                    map2 = ajyx.a;
                }
                a(spanBuilder2, obj3, map2, copy$default);
            }
            i++;
        }
    }

    public final FontCache getFontCache() {
        return this.a;
    }

    public final SpannedString parseTextJson(Object obj, Map<String, ? extends Object> map, TextAttributes textAttributes) {
        Object obj2 = obj;
        Map<String, ? extends Object> map2 = map;
        akcr.b(obj2, "textJson");
        akcr.b(map2, "composerAttributes");
        TextAttributes textAttributes2 = textAttributes;
        akcr.b(textAttributes2, "startingAttributes");
        SpanBuilder spanBuilder = new SpanBuilder();
        a(spanBuilder, obj2, map2, TextAttributes.copy$default(textAttributes2, null, null, null, 0, null, null, null, null, 0, null, 1023, null));
        return spanBuilder.build();
    }
}
