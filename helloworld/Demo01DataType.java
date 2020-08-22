/*
当数据类型不一样时，将会发生数据类型转换
自动类型转换（隐式）
    1.特点：代码不需要特殊处理，自动完成
    2.规则：数据范围从小到大

 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024);//这是一个整数，默认时int类型
        System.out.println(3.14);//这是一个浮点数，默认double

        //long num1 = 100L;
        //左边规定long类型，右边不加L默认int类型，左右不一样
        //将右侧的int类型，交给左侧的long变量存储，符合从小到大的要求
        long num1 = 100;
        System.out.println(num1);

        //左边double比右边float大，符合从小到大
        double num2 = 2.5F;
        System.out.println(num2);

        //左边是float类型，右边是long类型，float虽然只占4个字节，但是数据范围比8个字节的long要大，符合从小到大
        //显示出300.0才是float，小数会自动补0
        float num3 = 300L;
        System.out.println(num3);
    }
}
