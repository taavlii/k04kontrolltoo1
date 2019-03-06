import java.io.*;
import java.util.*;
public class kt1_2{
  public static double kronkesk(int mitu, List<Double> listname){
      double summa=0;
      double arv=0;
      for(int i=0;i<mitu;i++){
        arv=listname.get(i);
        if(i==0 || i==mitu-1){
        arv=arv/2;
      }
      summa=summa+arv;
    }
    return summa/(mitu-1);
  }


  public static void main(String[] arg) throws Exception {
    BufferedReader lugeja = new BufferedReader(new FileReader("sisend1.txt"));
    int mitu = Integer.parseInt(lugeja.readLine());
    List<Double> hoidla = new ArrayList<Double>();
    for(int i=0;i<mitu;i++){
      Double rida=Double.parseDouble(lugeja.readLine());
      hoidla.add(rida);
    }
    System.out.println(kronkesk(mitu,hoidla));
    //System.out.println(hoidla.get(2));


    BufferedReader lugeja2 = new BufferedReader(new FileReader("sisend2.txt"));
    int mitu2 = Integer.parseInt(lugeja2.readLine());
    for(int j=0;j<mitu2;j++){
      String rida=lugeja2.readLine();
      String[] split=rida.split(",");
      String kpv=split[0];
      Double summa2=0.0;
      for(int k=1;k<6;k++){
        if(k==1||k==5){
          summa2=summa2+(Double.parseDouble(split[k])/2);
          //System.out.println(Double.parseDouble(split[k])/2);
        }else{
          summa2=summa2+Double.parseDouble(split[k]);
          //System.out.println(Double.parseDouble(split[k]));
        }
      }

      Double kesktemp=summa2/5;
      System.out.println("kuupaeval "+ j+1+" oli keskmine temp " +kesktemp);
      //System.out.println("kuupaeval"+ j);



    }

    }
  }
