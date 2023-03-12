package ice;

import Ice.Communicator;
import Ice.Identity;
import Ice.ObjectAdapter;
import Ice.Util;

public class Serve {
    public static void main(String[] args) {
        Communicator ic = Util.initialize();
        ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("HelloServiceAdapter", "default -p 1888");
        MyDataI servant = new MyDataI();
        Identity id = Util.stringToIdentity("HelloIce");
        adapter.add(servant, id);
        adapter.activate();
        System.out.println("服务器启动成功");
    }
}
