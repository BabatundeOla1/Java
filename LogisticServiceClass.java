public class LogisticServiceClass{

	public static double successfulDelivery(double successful_delivery){
		
			double wages = 0;
			double basePay = 5000;
		
		if(successful_delivery <= 50){

			double amountPerParcel = 160;
		  	wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}
	
			
		if(successful_delivery >= 50 && successful_delivery <= 59){

			double amountPerParcel = 200;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}


		if(successful_delivery >= 60 && successful_delivery <= 69){
				
			double amountPerParcel = 250;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;
		}


		if(successful_delivery >= 70){

			double amountPerParcel = 500;
			wages = successful_delivery * amountPerParcel + basePay;
			return wages;

		} return wages;

	}

}
