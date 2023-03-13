public class OperacionesTDD {
    public String calculos(String numero){
        String num=String.valueOf(numero);
        return num;
    }

    public static String suma(String numero){
        int contador=numero.length();
        int suma=0;
        String sumas;
        if (numero==""){
            return "0";
        }

        for (int i=0; i< contador; i++){
            if (i%2==0){
                int x=Integer.parseInt(numero.substring(i, i+1));
                suma += x;
            }
        }
        sumas=String.valueOf(suma);
        return sumas;
    }
}