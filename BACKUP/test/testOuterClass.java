public class testOuterClass {
    public static void main(String[] args) {
OuterClass oct= new OuterClass();
OuterClass.InnerClassTest ict = oct.new InnerClassTest();
System.out.println(ict);
}


}
