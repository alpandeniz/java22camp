public class Main {
    public static void main(String[] args) {
        //Alttaki şekilde temel bir bağlantı kurduk böylece; Employee ve Customer dosyaları ortak niteliklerini Person dosyasından alıyor
        // farklılıklarını ise kendi dosyalarından alıyor ve böylece tekrar tekrar aynı kodları yazmamız gerekmiyor
    Customer customer = new Customer();
    Employee employee = new Employee();
    EmployeeManager employeeManager= new EmployeeManager();
    CustomerManager customerManager = new CustomerManager();



    }
}