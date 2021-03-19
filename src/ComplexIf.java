public class ComplexIf {
    public static void main(String[] args) {
   
        double n1 = 4.5 , n2 = -5.3, n3 = -1.0, largest;
        if (n1 >= n2) {
            if (n1 >= n3) {
                largest = n1;
            }
            else {
                largest = n3;
                
            }
        }   else {
            
            if (n2 >= n3) {
                largest = n2;
                
            }
            else { 
                largest = n3;
            }
        }
        
        System.out.println("Largest Number: " + largest);
            
     
        
    }
    
}
