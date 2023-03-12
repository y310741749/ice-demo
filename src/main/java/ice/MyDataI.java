package ice;

import ComplexData.DataInfo;
import ComplexData._IMyDataDisp;
import Ice.Current;

public class MyDataI extends _IMyDataDisp {
    public DataInfo[] getDataList(Current __current) {
        DataInfo dataInfo = new DataInfo("1", "张三", "1.1");
        DataInfo[] dataInfos = new DataInfo[1];
        dataInfos[0] = dataInfo;
        return dataInfos;
    }
}
