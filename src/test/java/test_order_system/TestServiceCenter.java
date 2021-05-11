
package test_order_system;

import org.junit.Test;
import com.lab.order_system.ServiceCenter;

public class TestServiceCenter {
   @Test
   public void Test_printCatalog(){
       ServiceCenter sc=new ServiceCenter();
       sc.printCatalog();
   }
}
