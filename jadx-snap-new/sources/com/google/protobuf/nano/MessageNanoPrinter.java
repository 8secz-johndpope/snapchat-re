package com.google.protobuf.nano;

import com.brightcove.player.media.MediaService;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Map.Entry;

public final class MessageNanoPrinter {
    private static final String INDENT = "  ";
    private static final int MAX_STRING_LEN = 200;

    private MessageNanoPrinter() {
    }

    private static void appendQuotedBytes(byte[] bArr, StringBuffer stringBuffer) {
        if (bArr == null) {
            stringBuffer.append("\"\"");
            return;
        }
        stringBuffer.append('\"');
        for (byte b : bArr) {
            int i = b & 255;
            if (i == 92 || i == 34) {
                stringBuffer.append('\\');
            } else if (i < 32 || i >= 127) {
                stringBuffer.append(String.format("\\%03o", new Object[]{Integer.valueOf(i)}));
            }
            stringBuffer.append((char) i);
        }
        stringBuffer.append('\"');
    }

    private static String deCamelCaseify(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i != 0) {
                if (Character.isUpperCase(charAt)) {
                    stringBuffer.append('_');
                }
                stringBuffer.append(charAt);
            }
            charAt = Character.toLowerCase(charAt);
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    private static String escapeString(String str) {
        int length = str.length();
        StringBuilder stringBuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                stringBuilder.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
            } else {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    public static <T extends MessageNano> String print(T t) {
        StringBuilder stringBuilder;
        String message;
        String str = "Error printing proto: ";
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            print(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            stringBuilder = new StringBuilder(str);
            message = e.getMessage();
            stringBuilder.append(message);
            return stringBuilder.toString();
        } catch (InvocationTargetException e2) {
            stringBuilder = new StringBuilder(str);
            message = e2.getMessage();
            stringBuilder.append(message);
            return stringBuilder.toString();
        }
    }

    private static void print(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            boolean z = obj instanceof MessageNano;
            String str2 = ">\n";
            String str3 = INDENT;
            String str4 = " <\n";
            int length;
            if (z) {
                int length2 = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(deCamelCaseify(str));
                    stringBuffer2.append(str4);
                    stringBuffer.append(str3);
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8)) {
                        String str5 = "_";
                        if (!(name.startsWith(str5) || name.endsWith(str5))) {
                            Class type = field.getType();
                            Object obj2 = field.get(obj);
                            if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                                print(name, obj2, stringBuffer, stringBuffer2);
                            } else {
                                modifiers = obj2 == null ? 0 : Array.getLength(obj2);
                                for (int i = 0; i < modifiers; i++) {
                                    print(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
                                }
                            }
                        }
                    }
                }
                for (Method name2 : cls.getMethods()) {
                    String name3 = name2.getName();
                    if (name3.startsWith("set")) {
                        name3 = name3.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has".concat(String.valueOf(name3)), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                print(name3, cls.getMethod("get".concat(String.valueOf(name3)), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length2);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(str2);
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                str = deCamelCaseify(str);
                for (Entry entry : map.entrySet()) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(str);
                    stringBuffer2.append(str4);
                    length = stringBuffer.length();
                    stringBuffer.append(str3);
                    print("key", entry.getKey(), stringBuffer, stringBuffer2);
                    print("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(str2);
                }
            } else {
                str = deCamelCaseify(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(str);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    str = sanitizeString((String) obj);
                    String str6 = "\"";
                    stringBuffer2.append(str6);
                    stringBuffer2.append(str);
                    stringBuffer2.append(str6);
                } else if (obj instanceof byte[]) {
                    appendQuotedBytes((byte[]) obj, stringBuffer2);
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
            }
        }
    }

    private static String sanitizeString(String str) {
        if (!str.startsWith(MediaService.DEFAULT_MEDIA_DELIVERY) && str.length() > 200) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str.substring(0, 200));
            stringBuilder.append("[...]");
            str = stringBuilder.toString();
        }
        return escapeString(str);
    }
}
