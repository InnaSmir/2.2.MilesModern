public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket = 36_750;
        int miles = service.calculate(priceTicket);
        System.out.println(miles);
    }
}
