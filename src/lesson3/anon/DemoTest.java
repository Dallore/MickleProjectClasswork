package lesson3.anon;

public class DemoTest {

    private static Demo demo;
    private static DemoChild demoChild;
    private static Demo demoChild2 = new Demo() {
        @Override
        public void show(){
            super.show();
            System.out.println("Anonymous demo show");
        }


    };

    public static void main(String[] args) {

        Demo demo = new Demo();
        demo.show();

        DemoChild demoChild = new DemoChild();
        demoChild.show();

        demoChild2.show();

        final int showCount = 0;

        Demo demoChild3 = new Demo(){
            @Override
            public void show() {

                System.out.println(showCount);

                System.out.println("demoChild3");
            }
        };

        demoChild3.show();


    }
}

