public class AntiPatternRefaktor {

    interface bangun {
        double luas(); 
    }
    
    record lingkarandata (double r )implements bangun{
    
    @Override 
    public double luas(){
        return Math.PI * r * r;
    }
    }
    record persegidata(double sisi) implements bangun{
        @Override 
        public double luas(){
            return sisi * sisi;

        }

    }

    
    record segitigadata(double alas, double tinggi) implements bangun   {
        @Override 
        public double luas (){
        return 0.5 * alas * tinggi;
    }
    }

    public static void main (String[] args) {
        bangun [] daftar ={
            new lingkarandata(7),
            new persegidata(5),
            new segitigadata(4,3)
        };
        double total = 0;
        for (bangun b : daftar){
            total += b.luas();
        }
        System.out.printf("total luas (cara polimorfik): %.2f%n", total);
    }
   

}