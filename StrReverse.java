 public class StrReverse {
    public static void PrintReverse(String s) {
    if(s==null|| s.isEmpty()){
      return;
        }
    else{
        System.out.println(s.charAt(s.length()-1));
        PrintReverse(s.substring(0,s.length()-1));
    }
    }
    public static void main(String[] args) {
        String s="Ali Murtaza ";
        PrintReverse(s);
    }
    }



