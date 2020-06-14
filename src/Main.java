public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float index = service.calculate(60, 170);
        System.out.println(index);

        float index1 = service.calculate(90, 170);
        System.out.println(index1);

        float index2 = service.calculate(50, 170);
        System.out.println(index2);
    }
}