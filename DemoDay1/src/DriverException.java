
public class DriverException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to my app..");

		// funA();

		try {
			// int i = 100/0;
			// java.lang.ArithmeticException
			funA();
			
		}

		catch (ArithmeticException e) { // specefic exception handling
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (MedicineOutOfStockException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		finally { // always executed // deallocate resources
			System.out.println("Am there always");
		}

		System.out.println("Thank you for using my app..");
	}

	public static void funA() throws MedicineOutOfStockException2   {

		try {
			
			funcB();
			
		} catch (ArithmeticException e) { // specefic exception handling
			// TODO: handle exception
			System.out.println(e.getMessage());
		} catch (MedicineOutOfStockException2 e) {
			// own handling
			//for further handling
			throw e; // re throw
		} catch (MedicineOutOfStockException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new MedicineOutOfStockException2("message ");
		}
	}

	public static void funcB() throws MedicineOutOfStockException2, MedicineOutOfStockException  {
		//int i = 100 / 0;
		if(true)
		throw new MedicineOutOfStockException("No stock");
		else
		throw new MedicineOutOfStockException2("No stock");
		
	}

}
