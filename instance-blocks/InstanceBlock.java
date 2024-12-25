public class InstanceBlock extends ParentClass {

    {
        System.out.println("InstanceBlock is being instantiated!");
    }

    public InstanceBlock(String a) {
        super(a);
        System.out.println("The constructor has finished!");
    }

    public static void main(String... args) {
        new InstanceBlock("");
    }
}