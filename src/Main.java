public class Main {
    public static void main(String[] args) {
        // Unit Test for Cash class

        // Test setup
        Exchange exchange = new Exchange(){
            @Override
            public float rate(String origin, String target) {
                return origin.equals("USD") && target.equals("Euro") ? 0.85f : 1.0f;
            }
        };
        Cash dollar = new Cash(exchange, 100);
        System.out.println("Dollar: " + dollar.toString());

        // Test 'in' method of Cash
        Cash euro = dollar.in("Euro");
        System.out.println("Dollar to Euro: " + euro.toString());
    }
}