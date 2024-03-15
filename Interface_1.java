import java.util.*;

// interface 1
interface Technology {
    // method declaration 
    void tech(); 
}

// interface 2
interface Development {
    // method declaration 
    void dev(); 
}

// Country class implementing both Technology and Development interfaces
class Country implements Technology, Development {
    private String CountryName; 
    
    // Constructor to initialize CountryName
    public Country(String CountryName) {
        this.CountryName = CountryName;
    }
    
    // Overridden method from Technology interface
    @Override
    public void tech() {
        System.out.println(CountryName + " is a global leader in technology");
    }
    
    // Overridden method from Development interface
    @Override
    public void dev() {
        System.out.println(CountryName + " development reflects on world");
    }
}


public class Interface_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CountryName: ");
        String name = sc.nextLine(); 
        Country c = new Country(name); 
        c.tech(); // Call tech method 
        c.dev(); // Call dev method 
    }
}
