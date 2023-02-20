public class CurrencyConverter{


    double[] exchange;
    
    void setRates(double[] rates){
        exchange=rates;
    }
    
    void printCurrencies(){
    
    System.out.println("rupee:"+exchange[0]);    
    System.out.println("dirham:"+exchange[1]);
    System.out.println("real:"+exchange[2]);
    System.out.println("chilean_peso:"+exchange[3]);
    System.out.println("maxico_peso:"+exchange[4]);
    System.out.println("_yen:"+exchange[5]);
    System.out.println("$australian:"+exchange[exchange.length-1]);
    // System.out.println("dollar:"+dollar);
    // System.out.println("rupee:"+rupee);
    }
    
    public static void main(String [] args){
    
    CurrencyConverter cc = new CurrencyConverter();
    double[] rates ={83.0,3.0,3.0,595.0,18.0,107.0,2.0};
    cc.setRates(rates);
    cc.printCurrencies();
    
    }
    
    }
    
    