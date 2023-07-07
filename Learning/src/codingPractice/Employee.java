package codingPractice;

class Employee {
    String name;
    final int salary = 50000;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1=new Employee();
        e1.setName("santhu");
        e.setName("Hari");
        System.out.println("name:"+e1.name);
        System.out.println("Name: " + e.name);
        System.out.println("Salary: " + e.salary);
        System.out.println("Salary: " + e1.salary);
    }
}
