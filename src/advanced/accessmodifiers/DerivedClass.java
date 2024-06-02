package advanced.accessmodifiers;

public class DerivedClass extends BaseClass {
	 public String derivedVariable = "Derived Class Variable";

	    @Override
	    public void baseMethod() {
	        System.out.println("Derived Class Method");
	    }

	    public void derivedMethod() {
	        System.out.println("Derived Class Additional Method");
	    }

}
