package ice;

import ComplexData.DataInfo;
import ComplexData.IMyDataPrx;
import ComplexData.IMyDataPrxHelper;
import Ice.Communicator;
import Ice.ObjectPrx;
import Ice.Util;
import demo.HelloPrx;
import demo.HelloPrxHelper;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端启动...");
        Communicator ic = Util.initialize();
        ObjectPrx proxy = ic.stringToProxy("HelloIce:default -p 1888");
        IMyDataPrx iMyDataPrx = IMyDataPrxHelper.checkedCast(proxy);
        DataInfo[] dataList = iMyDataPrx.getDataList();
        System.out.println("客户端调用返回结果:"+dataList[0].toString());
    }
}
