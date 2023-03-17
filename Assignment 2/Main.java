// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
class MyInteger
{
    static int value;
    public MyInteger(int valuee)
    {
        value = valuee;
    }
    static public int getValue()
    {
        return value;
    }
    static public boolean isEven()
    {
        return !(value%2);
    }
    static public boolean isOdd()
    {
        return (value%2);
    }
    static public boolean isPrime()
    {
        boolean flag = true;
        for(int i = 2; i < value/2; i++)
        {
            if(value % i == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
    public boolean equals(int test)
    {
        return value == test;
    }
}