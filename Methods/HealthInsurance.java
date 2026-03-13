class HealthInsurance{
    public static double searchInsurancePremium(String insuranceName) {
        System.out.println("Search insurance premium invoked...");

        if(insuranceName == "HDFC Ergo"){
            return 8999.67;
        }
        else if(insuranceName == "star"){
            return 7888.99;
        }
        else if(insuranceName == "ICICI lombard"){
            return 6999.99;
        }
        else if(insuranceName == "Aditya Birla"){
            return 5999.89;
        }
        else if(insuranceName == "Care Health"){
            return 4999.79;
        }
        else if(insuranceName == "SBI General"){
            return 9999.56;
        }
        System.out.println("Insurance not found"); 
        return 0.0; 
         
    }
}