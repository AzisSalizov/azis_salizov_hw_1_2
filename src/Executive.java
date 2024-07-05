public final class Executive extends Manager{
    private double bonus;

    public Executive(String name, int age, Address address, DepartmentEnum departmentEnum, double bonus) {
        super(name, age, address, departmentEnum);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Bonus: " + bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }
}
