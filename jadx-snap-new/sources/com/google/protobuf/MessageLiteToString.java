package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite.ExtendableMessage;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeSet;

final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final String LIST_SUFFIX = "List";

    MessageLiteToString() {
    }

    private static final String camelCaseToSnakeCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                stringBuilder.append("_");
            }
            stringBuilder.append(Character.toLowerCase(charAt));
        }
        return stringBuilder.toString();
    }

    private static boolean isDefaultValue(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        } else {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue() == 0;
            } else {
                if (obj instanceof Float) {
                    return ((Float) obj).floatValue() == MapboxConstants.MINIMUM_ZOOM;
                } else {
                    if (obj instanceof Double) {
                        return ((Double) obj).doubleValue() == 0.0d;
                    } else {
                        Object obj2;
                        if (obj instanceof String) {
                            obj2 = "";
                        } else if (!(obj instanceof ByteString)) {
                            return obj instanceof MessageLite ? obj == ((MessageLite) obj).getDefaultInstanceForType() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
                        } else {
                            obj2 = ByteString.EMPTY;
                        }
                        return obj.equals(obj2);
                    }
                }
            }
        }
    }

    static final void printField(StringBuilder stringBuilder, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object printField : (List) obj) {
                printField(stringBuilder, i, str, printField);
            }
            return;
        }
        stringBuilder.append(10);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuilder.append(' ');
        }
        stringBuilder.append(str);
        String str2 = ": \"";
        if (obj instanceof String) {
            stringBuilder.append(str2);
            stringBuilder.append(TextFormatEscaper.escapeText((String) obj));
            stringBuilder.append('\"');
        } else if (obj instanceof ByteString) {
            stringBuilder.append(str2);
            stringBuilder.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            stringBuilder.append('\"');
        } else if (obj instanceof GeneratedMessageLite) {
            stringBuilder.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, stringBuilder, i + 2);
            stringBuilder.append("\n");
            for (int i3 = 0; i3 < i; i3++) {
                stringBuilder.append(' ');
            }
            stringBuilder.append("}");
        } else {
            stringBuilder.append(": ");
            stringBuilder.append(obj.toString());
        }
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder stringBuilder, int i) {
        String str;
        Method method;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        Method[] declaredMethods = messageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i2 = 0;
        while (true) {
            str = "get";
            if (i2 >= length) {
                break;
            }
            method = declaredMethods[i2];
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith(str)) {
                    treeSet.add(method.getName());
                }
            }
            i2++;
        }
        for (String replaceFirst : treeSet) {
            StringBuilder stringBuilder2;
            String stringBuilder3;
            String replaceFirst2 = replaceFirst2.replaceFirst(str, "");
            if (replaceFirst2.endsWith(LIST_SUFFIX) && !replaceFirst2.endsWith(BUILDER_LIST_SUFFIX)) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(replaceFirst2.substring(0, 1).toLowerCase());
                stringBuilder2.append(replaceFirst2.substring(1, replaceFirst2.length() - 4));
                stringBuilder3 = stringBuilder2.toString();
                method = (Method) hashMap.get(str.concat(String.valueOf(replaceFirst2)));
                if (method != null) {
                    printField(stringBuilder, i, camelCaseToSnakeCase(stringBuilder3), GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]));
                }
            }
            if (((Method) hashMap2.get("set".concat(String.valueOf(replaceFirst2)))) != null) {
                if (replaceFirst2.endsWith(BYTES_SUFFIX)) {
                    stringBuilder2 = new StringBuilder(str);
                    stringBuilder2.append(replaceFirst2.substring(0, replaceFirst2.length() - 5));
                    if (hashMap.containsKey(stringBuilder2.toString())) {
                    }
                }
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append(replaceFirst2.substring(0, 1).toLowerCase());
                stringBuilder2.append(replaceFirst2.substring(1));
                stringBuilder3 = stringBuilder2.toString();
                method = (Method) hashMap.get(str.concat(String.valueOf(replaceFirst2)));
                Method method2 = (Method) hashMap.get("has".concat(String.valueOf(replaceFirst2)));
                if (method != null) {
                    Object invokeOrDie = GeneratedMessageLite.invokeOrDie(method, messageLite, new Object[0]);
                    boolean booleanValue = method2 == null ? !isDefaultValue(invokeOrDie) : ((Boolean) GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0])).booleanValue();
                    if (booleanValue) {
                        printField(stringBuilder, i, camelCaseToSnakeCase(stringBuilder3), invokeOrDie);
                    }
                }
            }
        }
        if (messageLite instanceof ExtendableMessage) {
            Iterator it = ((ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                StringBuilder stringBuilder4 = new StringBuilder("[");
                stringBuilder4.append(((ExtensionDescriptor) entry.getKey()).getNumber());
                stringBuilder4.append("]");
                printField(stringBuilder, i, stringBuilder4.toString(), entry.getValue());
            }
        }
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) messageLite;
        if (generatedMessageLite.unknownFields != null) {
            generatedMessageLite.unknownFields.printWithIndent(stringBuilder, i);
        }
    }

    static String toString(MessageLite messageLite, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(str);
        reflectivePrintWithIndent(messageLite, stringBuilder, 0);
        return stringBuilder.toString();
    }
}
