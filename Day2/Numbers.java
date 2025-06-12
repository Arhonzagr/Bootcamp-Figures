package Day2;

public class Numbers{
    public static void main (String[] args){
        int ac =7;
        double sc =9.53;
        int[] dc ={1,2,3,4,5};
        System.out.println(ac); 
        System.out.println(sc);
        for (int o =0; o<dc.length; o++){
            System.out.println(dc[o]);
        } 

        for(int num : dc ){
            System.out.println(num);
       }
       int as=0;
       double ad=0.1;
       String af="0.2";
       boolean ag=true;
       float ah=0.3;
       System.out.println(as);
       System.out.println(ad);
       System.out.println(af);
       System.out.println(ag);
       System.out.println(ah);
    }
}