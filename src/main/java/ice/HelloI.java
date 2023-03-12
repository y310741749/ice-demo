package ice;

import Ice.Current;
import demo._HelloDisp;

public class HelloI extends _HelloDisp {

    public String sayHello(String s, Current __current) {
        System.out.println("具体的服务实现类中sayHello方法被调用了...");
        return "Hello "+s;
    }
}
