package com.google.ar.core;

public class ArCoreApk {

    public enum a {
        ;
        
        final int nativeCode;

        private a(int i) {
            this.nativeCode = i;
        }
    }

    public interface b {
        void a(a aVar);
    }

    public enum c {
        REQUIRED(0),
        OPTIONAL(1);
        
        final int nativeCode;

        private c(int i) {
            this.nativeCode = i;
        }
    }

    public enum d {
        APPLICATION(0),
        FEATURE(1),
        USER_ALREADY_INFORMED(2);
        
        final int nativeCode;

        private d(int i) {
            this.nativeCode = i;
        }
    }

    protected ArCoreApk() {
    }

    private native void nativeFunctionToForceJavahOutput();
}
