package cn.itcast.day10.demo07;

public class DemoMain {
    public static void main(String[] args) {
        //首先创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标，供电脑使用
        //Mouse mouse = new Mouse();//创建一个鼠标类，但是我们可以用多态的写法
        USB usbMouse = new Mouse();//向上转型
        //方法参数是USB类型的接口，传进去的就是usb鼠标
        computer.useDevice(usbMouse);

        System.out.println("==================");

        Keyboard keyboard = new Keyboard();//没有使用多态写法
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboard);//发生了自动向上转型
        //computer.useDevice(new Keyboard());//发生了自动向上转型

        computer.powerOff();
    }
}
