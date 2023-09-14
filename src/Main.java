public class Main {
    public static void main(String[] args) {
        world();
        Info info = new Info(1,"Suzi Parker","suzi23@gmail.com","summertime34"+Gender.FEMALE);
        Info info1 = new Info(2,"Evan Halstead","evantead12@gmail.com","evan234"+Gender.MALE);
//        System.out.println(info+"\n"+info1);
    }

    public static void mission2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
    public static void world(){
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World");
        sb.delete(1,3);
        sb.delete(4,5);
        sb.delete(5,6);
        System.out.println(sb);
    }
}