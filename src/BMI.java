public class BMI {
   private double højde;
   private double vægt;

   public BMI (double højde, double vægt){
       this.højde = højde;
       this.vægt = vægt;
   }

   public double bmiCalculate (double højde, double vægt){
       double bmianswer = 0;

       bmianswer = vægt / (højde*højde);

       return bmianswer;
   }

   public void isUnderWeight (){
       System.out.println("You are too skinny");
   }
   public void isOverveight(){
       System.out.println("You are obese");
   }
   public void isNormalWeight (){
       System.out.println("You are normal");

   }

    public double getHøjde() {
        return højde;
    }
    public double getVægt() {
        return vægt;
    }
}
