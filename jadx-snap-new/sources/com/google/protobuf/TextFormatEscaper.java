package com.google.protobuf;

final class TextFormatEscaper {

    interface ByteSequence {
        byte byteAt(int i);

        int size();
    }

    private TextFormatEscaper() {
    }

    static String escapeBytes(final ByteString byteString) {
        return escapeBytes(new ByteSequence() {
            public final byte byteAt(int i) {
                return byteString.byteAt(i);
            }

            public final int size() {
                return byteString.size();
            }
        });
    }

    static String escapeBytes(ByteSequence byteSequence) {
        StringBuilder stringBuilder = new StringBuilder(byteSequence.size());
        for (int i = 0; i < byteSequence.size(); i++) {
            String str;
            int byteAt = byteSequence.byteAt(i);
            if (byteAt == 34) {
                str = "\\\"";
            } else if (byteAt == 39) {
                str = "\\'";
            } else if (byteAt != 92) {
                switch (byteAt) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (byteAt < 32 || byteAt > 126) {
                            stringBuilder.append('\\');
                            stringBuilder.append((char) (((byteAt >>> 6) & 3) + 48));
                            stringBuilder.append((char) (((byteAt >>> 3) & 7) + 48));
                            byteAt = (byteAt & 7) + 48;
                        }
                        stringBuilder.append((char) byteAt);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            stringBuilder.append(str);
        }
        return stringBuilder.toString();
    }

    static String escapeBytes(final byte[] bArr) {
        return escapeBytes(new ByteSequence() {
            public final byte byteAt(int i) {
                return bArr[i];
            }

            public final int size() {
                return bArr.length;
            }
        });
    }

    static String escapeDoubleQuotesAndBackslashes(String str) {
        return str.replace("\\", "\\\\").replace("\"", "\\\"");
    }

    static String escapeText(String str) {
        return escapeBytes(ByteString.copyFromUtf8(str));
    }
}
