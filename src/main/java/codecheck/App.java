package codecheck;

public class App {
    public static void main(String[] args) {

        for(String arg : args){

            if(!isInt(arg) || Integer.parseInt(arg) > 1000 || Integer.parseInt(arg) < 0){
                o("invalid");
            }else{
                int intArg = Integer.parseInt(arg);

                if(intArg % 3 == 0 && arg.contains("3")){
                    o("dumb");
                }else if(intArg % 3 == 0){
                    o("idiot");
                }else if(arg.toString().contains("3")){
                    o("stupid");
                }else{
                    o("smart");
                }
            }
        }
    }

    private static boolean isInt(String obj){
        try {
            Integer.parseInt(obj);
            return obj.getBytes().length == obj.length();
        }catch(Exception e){
            return false;
        }
    }

    private static void o(String str){
        System.out.println(str);
    }
}
