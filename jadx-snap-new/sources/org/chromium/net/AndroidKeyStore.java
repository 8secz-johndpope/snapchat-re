package org.chromium.net;

import defpackage.akoo;
import java.lang.reflect.Method;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import org.chromium.base.annotations.CalledByNative;

public class AndroidKeyStore {
    private static Object a(PrivateKey privateKey) {
        String str = "AndroidKeyStore";
        if (privateKey == null) {
            akoo.c(str, "privateKey == null", new Object[0]);
            return null;
        } else if (privateKey instanceof RSAPrivateKey) {
            try {
                Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLRSAPrivateKey");
                if (cls.isInstance(privateKey)) {
                    Method declaredMethod;
                    try {
                        declaredMethod = cls.getDeclaredMethod("getOpenSSLKey", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object invoke = declaredMethod.invoke(privateKey, new Object[0]);
                        declaredMethod.setAccessible(false);
                        if (invoke != null) {
                            return invoke;
                        }
                        akoo.c(str, "getOpenSSLKey() returned null", new Object[0]);
                        return null;
                    } catch (Exception e) {
                        akoo.c(str, "Exception while trying to retrieve system EVP_PKEY handle: ".concat(String.valueOf(e)), new Object[0]);
                        return null;
                    } catch (Throwable th) {
                        declaredMethod.setAccessible(false);
                    }
                }
                StringBuilder stringBuilder = new StringBuilder("Private key is not an OpenSSLRSAPrivateKey instance, its class name is:");
                stringBuilder.append(privateKey.getClass().getCanonicalName());
                akoo.c(str, stringBuilder.toString(), new Object[0]);
                return null;
            } catch (Exception e2) {
                akoo.c(str, "Cannot find system OpenSSLRSAPrivateKey class: ".concat(String.valueOf(e2)), new Object[0]);
                return null;
            }
        } else {
            akoo.c(str, "does not implement RSAPrivateKey", new Object[0]);
            return null;
        }
    }

    @CalledByNative
    private static Object getOpenSSLEngineForPrivateKey(PrivateKey privateKey) {
        String valueOf;
        String str;
        String str2 = "AndroidKeyStore";
        try {
            Class cls = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLEngine");
            Object a = a(privateKey);
            if (a == null) {
                return null;
            }
            try {
                Method declaredMethod = a.getClass().getDeclaredMethod("getEngine", new Class[0]);
                try {
                    declaredMethod.setAccessible(true);
                    a = declaredMethod.invoke(a, new Object[0]);
                    declaredMethod.setAccessible(false);
                    if (a == null) {
                        akoo.c(str2, "getEngine() returned null", new Object[0]);
                    }
                    if (cls.isInstance(a)) {
                        return a;
                    }
                    StringBuilder stringBuilder = new StringBuilder("Engine is not an OpenSSLEngine instance, its class name is:");
                    stringBuilder.append(a.getClass().getCanonicalName());
                    akoo.c(str2, stringBuilder.toString(), new Object[0]);
                    return null;
                } catch (Exception e) {
                    valueOf = String.valueOf(e);
                    str = "Exception while trying to retrieve OpenSSLEngine object: ";
                    akoo.c(str2, str.concat(valueOf), new Object[0]);
                    return null;
                } catch (Throwable th) {
                    declaredMethod.setAccessible(false);
                }
            } catch (Exception e2) {
                akoo.c(str2, "No getEngine() method on OpenSSLKey member:".concat(String.valueOf(e2)), new Object[0]);
                return null;
            }
        } catch (Exception e22) {
            valueOf = String.valueOf(e22);
            str = "Cannot find system OpenSSLEngine class: ";
            akoo.c(str2, str.concat(valueOf), new Object[0]);
            return null;
        }
    }

    @CalledByNative
    private static long getOpenSSLHandleForPrivateKey(PrivateKey privateKey) {
        String str = "AndroidKeyStore";
        Object a = a(privateKey);
        if (a == null) {
            return 0;
        }
        try {
            Method declaredMethod = a.getClass().getDeclaredMethod("getPkeyContext", new Class[0]);
            try {
                declaredMethod.setAccessible(true);
                long longValue = ((Number) declaredMethod.invoke(a, new Object[0])).longValue();
                declaredMethod.setAccessible(false);
                if (longValue == 0) {
                    akoo.c(str, "getPkeyContext() returned null", new Object[0]);
                }
                return longValue;
            } catch (Exception e) {
                akoo.c(str, "Exception while trying to retrieve system EVP_PKEY handle: ".concat(String.valueOf(e)), new Object[0]);
                return 0;
            } catch (Throwable th) {
                declaredMethod.setAccessible(false);
            }
        } catch (Exception e2) {
            akoo.c(str, "No getPkeyContext() method on OpenSSLKey member:".concat(String.valueOf(e2)), new Object[0]);
            return 0;
        }
    }

    @CalledByNative
    private static byte[] signWithPrivateKey(PrivateKey privateKey, String str, byte[] bArr) {
        String stringBuilder;
        String str2 = "AndroidKeyStore";
        try {
            Signature instance = Signature.getInstance(str);
            try {
                instance.initSign(privateKey);
                instance.update(bArr);
                privateKey = instance.sign();
                return privateKey;
            } catch (Exception e) {
                StringBuilder stringBuilder2 = new StringBuilder("Exception while signing message with ");
                stringBuilder2.append(str);
                stringBuilder2.append(" and ");
                stringBuilder2.append(privateKey.getAlgorithm());
                stringBuilder2.append(" private key (");
                stringBuilder2.append(privateKey.getClass().getName());
                stringBuilder2.append("): ");
                stringBuilder2.append(e);
                stringBuilder = stringBuilder2.toString();
                akoo.c(str2, stringBuilder, new Object[0]);
                return null;
            }
        } catch (NoSuchAlgorithmException e2) {
            StringBuilder stringBuilder3 = new StringBuilder("Signature algorithm ");
            stringBuilder3.append(str);
            stringBuilder3.append(" not supported: ");
            stringBuilder3.append(e2);
            stringBuilder = stringBuilder3.toString();
            akoo.c(str2, stringBuilder, new Object[0]);
            return null;
        }
    }
}
