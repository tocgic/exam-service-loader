package module.impl1;

import module.interf.IHello;

public class HelloEng implements IHello {
    @Override
    public String sayHello() {
        return "Hi";
    }
}
