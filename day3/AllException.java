
public class AllException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
        int b = 0;
         
        try 
        {
        	int i = a/b;
			
		} 
        catch (java.lang.Exception e)
        {
			// TODO: handle exception
			 System.out.println(e.getMessage());
			
		}
        
        finally 
        {
        
        	System.out.println("some error");
        }
	}

}
