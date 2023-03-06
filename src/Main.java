import homework.hw;
public class Main {
    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            switch (i) {
                case 0:
                    hw.exercise1();
                    break;
                case 1:
                    hw.exercise2();
                    break;
                case 2:
                    hw.exercise3();
                    break;
                default:
                    System.out.println("Something goes wrong!");
            }
        }
    }
}