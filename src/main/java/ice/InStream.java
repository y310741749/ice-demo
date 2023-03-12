package ice;

import Ice.Communicator;
import Ice.Util;
import cn.hutool.core.util.HexUtil;

public class InStream {
    public static void main(String[] args) {
        byte[] bytes = HexUtil.decodeHex("01013106e5bca0e4b88903312e31");
        Communicator initialize = Util.initialize();
        Ice.InputStream in = Util.createInputStream(initialize,bytes);
        String s = in.readString();
        String s1 = in.readString();
        String s2 = in.readString();
        System.out.println("===");
    }
}
