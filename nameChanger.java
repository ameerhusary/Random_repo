public class nameChanger{
    public static void main(String[] args){
      System.out.println(namechanger("jake jackson"));
      System.out.println(namechanger("AMEER HUSARY"));
      System.out.println(namechanger("jAke jAckSon"));
      System.out.println(namechanger("kHaliL HuSaRy"));
    }
    public static String namechanger(String s1){
      String pattern = "(.*)(\\s)(.*)";
      String[] arrays = new String[2];
      arrays[0] = s1.replaceAll(pattern, "$1");
      arrays[1] = s1.replaceAll(pattern, "$3");
      String b = arrays[0].substring(0,1).toUpperCase();
      String c = arrays[0].substring(1).toLowerCase();
      String d = arrays[1].substring(0,1).toUpperCase();
      String e = arrays[1].substring(1).toLowerCase();
      return s1.replaceAll(pattern, b+c+"$2"+d+e);
    }
}