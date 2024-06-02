package OutsidePackage;

import advanced.accessmodifiers.BaseClass;
import advanced.accessmodifiers.DerivedClass;

public class OutsideClass1 {

	public static void main(String[] args) {
	
			DerivedClass derive = new DerivedClass();

	        // Accessing public members of DerivedClass
	        System.out.println("Accessing public members of DerivedClass:");
	        System.out.println(derive.derivedVariable);
	        derive.baseMethod();
	        derive.derivedMethod();

	           
	        // Creating an object of BaseClass
	        BaseClass base = new BaseClass();
	        
	        
	        // Trying to access private member of BaseClass
	        // This will result in a compilation error
	        // System.out.println(derivedObject.baseVariable);

	        // Trying to access protected member of BaseClass from outside the package
	        // This will result in a compilation error
	        // derivedObject.baseMethod();

	        // Trying to access private member of BaseClass
	        // This will result in a compilation error
	        // System.out.println(baseObject.baseVariable);

	        // Trying to access protected member of BaseClass from outside the package
	        // This will result in a compilation error
	        // baseObject.baseMethod();


		}

	}


