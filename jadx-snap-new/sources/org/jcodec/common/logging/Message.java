package org.jcodec.common.logging;

public class Message {
    private Object[] args;
    private String className;
    private String fileName;
    private LogLevel level;
    private int lineNumber;
    private String message;
    private String methodName;

    public Message(LogLevel logLevel, String str, String str2, String str3, int i, String str4, Object[] objArr) {
        this.level = logLevel;
        this.fileName = str;
        this.className = str2;
        this.methodName = str3;
        this.message = str3;
        this.lineNumber = i;
        this.message = str4;
        this.args = objArr;
    }

    public String getClassName() {
        return this.className;
    }

    public String getFileName() {
        return this.fileName;
    }

    public LogLevel getLevel() {
        return this.level;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
