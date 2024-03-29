package com.google.android.gms.internal;

import android.support.v7.widget.helper.ItemTouchHelper.Callback;
import com.brightcove.player.media.MediaService;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class zzflt {
    private static void zza(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            if (obj instanceof zzfls) {
                String name;
                String str2;
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(zzub(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    name = field.getName();
                    if (!("cachedSize".equals(name) || (modifiers & 1) != 1 || (modifiers & 8) == 8)) {
                        str2 = "_";
                        if (!(name.startsWith(str2) || name.endsWith(str2))) {
                            Class type = field.getType();
                            Object obj2 = field.get(obj);
                            if (!type.isArray() || type.getComponentType() == Byte.TYPE) {
                                zza(name, obj2, stringBuffer, stringBuffer2);
                            } else {
                                modifiers = obj2 == null ? 0 : Array.getLength(obj2);
                                for (int i = 0; i < modifiers; i++) {
                                    zza(name, Array.get(obj2, i), stringBuffer, stringBuffer2);
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
                            str2 = "has";
                            name = String.valueOf(name3);
                            if (((Boolean) cls.getMethod(name.length() != 0 ? str2.concat(name) : new String(str2), new Class[0]).invoke(obj, new Object[0])).booleanValue()) {
                                str2 = "get";
                                name = String.valueOf(name3);
                                zza(name3, cls.getMethod(name.length() != 0 ? str2.concat(name) : new String(str2), new Class[0]).invoke(obj, new Object[0]), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
                return;
            }
            str = zzub(str);
            stringBuffer2.append(stringBuffer);
            stringBuffer2.append(str);
            stringBuffer2.append(": ");
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (!str3.startsWith(MediaService.DEFAULT_MEDIA_DELIVERY) && str3.length() > Callback.DEFAULT_DRAG_ANIMATION_DURATION) {
                    str3 = String.valueOf(str3.substring(0, Callback.DEFAULT_DRAG_ANIMATION_DURATION)).concat("[...]");
                }
                str = zzha(str3);
                str3 = "\"";
                stringBuffer2.append(str3);
                stringBuffer2.append(str);
                stringBuffer2.append(str3);
            } else if (obj instanceof byte[]) {
                zza((byte[]) obj, stringBuffer2);
            } else {
                stringBuffer2.append(obj);
            }
            stringBuffer2.append("\n");
        }
    }

    private static void zza(byte[] bArr, StringBuffer stringBuffer) {
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

    public static <T extends zzfls> String zzd(T t) {
        String valueOf;
        String str = "Error printing proto: ";
        if (t == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            zza(null, t, new StringBuffer(), stringBuffer);
            return stringBuffer.toString();
        } catch (IllegalAccessException e) {
            valueOf = String.valueOf(e.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } catch (InvocationTargetException e2) {
            valueOf = String.valueOf(e2.getMessage());
            return valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        }
    }

    private static String zzha(String str) {
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

    private static String zzub(String str) {
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
}
