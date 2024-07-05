public class Manager extends Employee{
    private DepartmentEnum departmentEnum;

    public Manager(String name, int age, Address address, DepartmentEnum departmentEnum) {
        super(name, age, address);
        this.departmentEnum = departmentEnum;
    }

    public DepartmentEnum getDepartmentEnum() {
        return departmentEnum;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Department: " + departmentEnum);
    }

    public void displayInfo(String prefix) {
        System.out.println(prefix + " Name: " + getName());
        System.out.println(prefix + " Address: " + getAddress());
        System.out.println(prefix + " Department: " + departmentEnum);
    }

    public final void displayDetailedInfo() {
        System.out.println("Detailed info :\nName: " + getName() + "\nAge: " + getAge() + "\nAddress: " + getAddress() + "\nDepartment: " + departmentEnum);
    }

    @Override
    public String toString() {
        return "Manager " + "departmentEnum=" + departmentEnum;
    }
}
