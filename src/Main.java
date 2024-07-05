public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Bishkek" , "Lenina", 18);
        Address address2 = new Address("Kazakhstan" , "Almagul", 16);

        Manager manager = new Manager("Anton Mikhailov" , 32, address1 , DepartmentEnum.IT);
        Executive executive1 = new Executive("Alim Danilov", 28, address2, DepartmentEnum.SALES,15000);
        Executive executive2 = new Executive("Anya Huseinova", 23, address2, DepartmentEnum.MARKETING,20000);

        System.out.println(manager);
        manager.displayInfo();
        manager.displayInfo("Prefix: ");
        manager.displayDetailedInfo();
        System.out.println("------------------");

        System.out.println(executive1);
        executive1.displayInfo();
        System.out.println("------------------");

        System.out.println(executive2);
        executive2.displayInfo();
    }
}