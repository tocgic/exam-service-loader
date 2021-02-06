package module.impl1;

import module.interf.IHello;

public class HelloKor implements IHello {
    @Override
    public String sayHello() {
        return "안녕하세요";
    }
}
