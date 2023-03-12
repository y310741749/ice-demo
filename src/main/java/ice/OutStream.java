package ice;

import ComplexData.DataInfo;
import Ice.Communicator;
import Ice.Util;
import cn.hutool.core.util.HexUtil;

public class OutStream {
    public static void main(String[] args) {
        final String[] seq = { "Ice", "rocks!" };
        Communicator communicator = Util.initialize();
        Ice.OutputStream out = Ice.Util.createOutputStream(communicator);
        try {
            DataInfo dataInfo = new DataInfo("1", "张三", "1.1");
            out.writeByte((byte)1);
            out.writeInt(2);
            out.writeString(dataInfo.age);
            out.writeString(dataInfo.name);
            out.writeString(dataInfo.score);
            byte[] data = out.finished();
            System.out.println(HexUtil.encodeHex(data));
        } finally {
            out.destroy();
        }
    }
}
