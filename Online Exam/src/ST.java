
import java.io.InputStream;


public class ST {
    int id;
    int pass;
    int re_pass; 
    ST(int a,int b,int c){
       id=a;
       pass=b;
       re_pass=c;
    }

    ST(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    int id(){
      if(id==123)
            System.out.println("Success");
        return 0;
    }
     int pass(){
      if(pass==123)
            System.out.println("Success");
        return 0;
    }
      int repass(){
      if(re_pass==123)
            System.out.println("Success");
        return 0;
    }
    
}
