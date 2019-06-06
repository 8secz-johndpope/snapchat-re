package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.mapbox.mapboxsdk.constants.MapboxConstants;
import org.opencv.imgproc.Imgproc;

/* renamed from: acgb */
public final class acgb extends ExtendableMessageNano<acgb> {
    private static volatile acgb[] c;
    private int a;
    private Object b;
    private int d;
    private int e;
    private acgc f;
    private int g;

    public acgb() {
        this.a = 0;
        this.d = 0;
        this.e = 0;
        this.f = null;
        this.g = 0;
        this.a = 0;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public static acgb a(byte[] bArr) {
        return (acgb) MessageNano.mergeFrom(new acgb(), bArr);
    }

    public static acgb[] a() {
        if (c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (c == null) {
                    c = new acgb[0];
                }
            }
        }
        return c;
    }

    public final acev b() {
        return this.a == 10 ? (acev) this.b : null;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if ((this.d & 1) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, this.e);
        }
        acgc acgc = this.f;
        if (acgc != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, acgc);
        }
        if ((this.d & 2) != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, this.g);
        }
        return this.a == 10 ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(10, (MessageNano) this.b) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                readTag = codedInputByteBufferNano.readInt32();
                switch (readTag) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 10:
                    case 15:
                    case 16:
                    case 17:
                    case 20:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 35:
                    case 36:
                    case 37:
                    case 40:
                    case 45:
                    case 46:
                    case 47:
                    case 50:
                    case 55:
                    case 56:
                    case 57:
                    case 60:
                    case 65:
                    case 66:
                    case 67:
                    case 70:
                    case 75:
                    case 76:
                    case 77:
                    case 80:
                    case 85:
                    case 86:
                    case 87:
                    case 90:
                    case 95:
                    case 96:
                    case 97:
                    case 100:
                    case 105:
                    case 106:
                    case 107:
                    case 110:
                    case 115:
                    case 116:
                    case 117:
                    case 120:
                    case 125:
                    case 126:
                    case 127:
                    case 130:
                    case 135:
                    case 136:
                    case 137:
                    case 140:
                    case 145:
                    case 146:
                    case 147:
                    case 260:
                    case 265:
                    case 266:
                    case 267:
                    case 268:
                    case 269:
                    case 270:
                    case 275:
                    case 276:
                    case 277:
                    case 278:
                    case 279:
                    case 280:
                    case 285:
                    case 286:
                    case 287:
                    case 288:
                    case 289:
                    case 290:
                    case 295:
                    case 296:
                    case 297:
                    case 298:
                    case 299:
                    case MapboxConstants.ANIMATION_DURATION /*300*/:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 315:
                    case 316:
                    case 317:
                    case 318:
                    case 319:
                    case 320:
                    case 325:
                    case 326:
                    case 327:
                    case 328:
                    case 329:
                    case 330:
                    case 335:
                    case 336:
                    case 337:
                    case 338:
                    case 339:
                    case 340:
                    case 345:
                    case 346:
                    case 347:
                    case 348:
                    case 349:
                    case 350:
                    case 355:
                    case 356:
                    case 357:
                    case 358:
                    case 359:
                    case 360:
                    case 365:
                    case 366:
                    case 367:
                    case 368:
                    case 369:
                    case Imgproc.INTER_TAB_SIZE2 /*1024*/:
                    case 1030:
                    case 1040:
                    case 1041:
                    case 1042:
                    case 1050:
                    case 1060:
                    case 1070:
                    case 1075:
                    case 1076:
                    case 1077:
                    case 1078:
                    case 1079:
                    case 1080:
                    case 1081:
                    case 1082:
                    case 1083:
                    case 1084:
                    case 1085:
                    case 1086:
                    case 1087:
                    case 1088:
                    case 1089:
                    case 1090:
                    case 1091:
                    case 1092:
                    case 1093:
                    case 1094:
                    case 1095:
                    case 1096:
                    case 1097:
                    case 1098:
                    case 1099:
                    case 1100:
                    case 1200:
                    case 1201:
                    case 1202:
                    case 1203:
                    case 1204:
                    case 1205:
                    case 1206:
                    case 1207:
                    case 1208:
                    case 1209:
                    case 1210:
                    case 1211:
                    case 1212:
                    case 1213:
                    case 1214:
                    case 1215:
                    case 1216:
                    case 1217:
                    case 1218:
                    case 1219:
                    case 1220:
                    case 1221:
                    case 1222:
                    case 1223:
                    case 1224:
                        this.e = readTag;
                        readTag = this.d | 1;
                        break;
                    default:
                        continue;
                }
            } else if (readTag == 18) {
                if (this.f == null) {
                    this.f = new acgc();
                }
                codedInputByteBufferNano.readMessage(this.f);
            } else if (readTag == 24) {
                readTag = codedInputByteBufferNano.readInt32();
                if (readTag == 0 || readTag == 1 || readTag == 2 || readTag == 3 || readTag == 10) {
                    this.g = readTag;
                    readTag = this.d | 2;
                }
            } else if (readTag == 82) {
                if (this.a != 10) {
                    this.b = new acev();
                }
                codedInputByteBufferNano.readMessage((MessageNano) this.b);
                this.a = 10;
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
            this.d = readTag;
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if ((this.d & 1) != 0) {
            codedOutputByteBufferNano.writeInt32(1, this.e);
        }
        acgc acgc = this.f;
        if (acgc != null) {
            codedOutputByteBufferNano.writeMessage(2, acgc);
        }
        if ((this.d & 2) != 0) {
            codedOutputByteBufferNano.writeInt32(3, this.g);
        }
        if (this.a == 10) {
            codedOutputByteBufferNano.writeMessage(10, (MessageNano) this.b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
