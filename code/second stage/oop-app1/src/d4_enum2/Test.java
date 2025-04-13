package d4_enum2;

public class Test {


    public static void main(String[] args) {
        //check(Constant.BOY);

        check(Constant2.BOY);
    }

    public static void check(Constant2 sex){

        switch (sex){
            case BOY:
                System.out.println("展示一些美女图片~~");
                break;
            case GIRL:
                System.out.println("展示一些帅哥图片~~");
                break;
        }
    }

//    public static void check(int sex){
//
//        switch (sex){
//            case Constant.BOY:
//                System.out.println("展示一些美女图片~~");
//                break;
//            case Constant.GIRL:
//                System.out.println("展示一些帅哥图片~~");
//                break;
//        }
//    }
}
