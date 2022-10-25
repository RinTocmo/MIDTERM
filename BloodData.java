class BloodData {
    private String bloodType;
    private String rhFactor;
    
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    public BloodData(String bt, String rh) {
        bloodType = bt;
        rhFactor = rh;
    }
    
    public void display(){
        System.out.println(bloodType + rhFactor + "is added to the blood bank.");
    }
    
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
    public String getBloodType(){
        return bloodType;
    }
    
    public void setRhFactor(String rhFactor){
        this.rhFactor = rhFactor;        
    }
    
    public String getRhFactor(){
        return rhFactor;
        
    }
    
        
}

