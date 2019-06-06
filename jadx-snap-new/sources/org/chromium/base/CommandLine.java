package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine {
    private static final AtomicReference<CommandLine> a = new AtomicReference();
    private static /* synthetic */ boolean b = (CommandLine.class.desiredAssertionStatus() ^ 1);

    private CommandLine() {
    }

    public static CommandLine c() {
        CommandLine commandLine = (CommandLine) a.get();
        if (b || commandLine != null) {
            return commandLine;
        }
        throw new AssertionError();
    }

    private static native void nativeAppendSwitch(String str);

    private static native void nativeAppendSwitchWithValue(String str, String str2);

    private static native void nativeAppendSwitchesAndArguments(String[] strArr);

    private static native String nativeGetSwitchValue(String str);

    private static native boolean nativeHasSwitch(String str);

    private static native void nativeInit(String[] strArr);

    public abstract boolean a();

    public abstract String b();
}
