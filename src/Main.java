public class Main {
    public static void main(String[] args) {
        Info info = new Info(1,"Suzi Parker","suzi23@gmail.com","summertime34"+Gender.FEMALE);
        Info info1 = new Info(2,"Evan Halstead","evantead12@gmail.com","evan234"+Gender.MALE);
        System.out.println(info+"\n"+info1);
    }

    public static void mission2() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}