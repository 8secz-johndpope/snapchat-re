package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: aknu */
public final class aknu {
    private static String a = "\r\n";
    private static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss:SSS");

    public static String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        String toLowerCase = b.format(new Date()).toLowerCase();
        stringBuffer.append(a);
        String str = "Throwable: ";
        StringBuffer stringBuffer2 = new StringBuffer(str);
        StringBuffer stringBuffer3 = new StringBuffer("(");
        stringBuffer3.append(th.getClass().getName());
        stringBuffer3.append(")");
        stringBuffer2.append(stringBuffer3.toString());
        stringBuffer2.append(":");
        stringBuffer2.append(toLowerCase);
        stringBuffer2.append(a);
        stringBuffer.append(stringBuffer2.toString());
        StringBuffer stringBuffer4 = new StringBuffer(str);
        stringBuffer4.append(th.getLocalizedMessage());
        stringBuffer4.append(a);
        stringBuffer.append(stringBuffer4.toString());
        stringBuffer.append(a);
        stringBuffer.append(aknu.b(th));
        StringBuffer stringBuffer5 = new StringBuffer("Caught here:");
        stringBuffer5.append(a);
        stringBuffer.append(stringBuffer5.toString());
        stringBuffer.append(aknu.a(new Exception(), -1, 1));
        stringBuffer.append(a);
        return stringBuffer.toString();
    }

    private static String a(Throwable th, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer();
        if (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                while (i2 < stackTrace.length) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    StringBuffer stringBuffer2 = new StringBuffer("\tat ");
                    stringBuffer2.append(stackTraceElement.getClassName());
                    stringBuffer2.append(".");
                    stringBuffer2.append(stackTraceElement.getMethodName());
                    stringBuffer2.append("(");
                    stringBuffer2.append(stackTraceElement.getFileName());
                    stringBuffer2.append(":");
                    stringBuffer2.append(stackTraceElement.getLineNumber());
                    stringBuffer2.append(")");
                    stringBuffer2.append(a);
                    stringBuffer.append(stringBuffer2.toString());
                    i2++;
                }
            }
            stringBuffer.append(a);
        }
        return stringBuffer.toString();
    }

    private static String b(Throwable th) {
        return aknu.a(th, -1, 0);
    }
}
