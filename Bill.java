public class Bill{

    public char gender;
    public int berr;
    public int barbecure;
    public int softDrink;

    public double feeding(){
        return berr*5+softDrink*3+barbecure*7;
    }
    public double cover(){
        if (feeding()<30.0){
            return 4.00;
        }else{
            return 0.00;
        }
    }
    public double ticket(){
        if (gender == 'F' || gender == 'f'){
            return 8.00;
        }else if(gender == 'M' || gender == 'm'){
            return 10.00;
        }else{
            return 0.00;
        }
    }
    public double total(){
        return feeding()+cover()+ticket();
    }
}