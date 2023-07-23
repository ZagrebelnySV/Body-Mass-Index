public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int index = (int) service.calculate(86,1.76);
        System.out.println(index);
    }
}
