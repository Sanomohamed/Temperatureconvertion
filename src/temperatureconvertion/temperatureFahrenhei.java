
package temperatureconvertion;


public class temperatureFahrenhei {
     double temp;
       
        public temperatureFahrenhei(double temp){
            this.temp=temp;
        }
       
       
        public double Kelvin(){
          
            return temp+ 273.15;
        }
        
        public double Fahrenhei(){
           
            return  (temp * 9/5) + 32;
        }
        
        
}
