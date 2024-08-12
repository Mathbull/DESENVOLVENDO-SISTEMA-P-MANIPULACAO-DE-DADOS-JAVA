import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.NoSuchElementException;

public abstract class Seguranca  {
    // Classe para controles de erros e tipos de entradas 

    public static Scanner key_ = new Scanner(System.in); 

    public static Object validarAno(Object... args){
        // Valida a entrada de ano

        Scanner key = new Scanner(System.in); 
         try{
            while (true) {
                if(key.hasNextLine()){
                    int ano = key.nextInt();
                    if(Integer.toString(ano).length() !=4 ){
                        if(ano == 0){ 
                            return 0; }
                        Menu.LimparTerminal();
                        Menu.menu("add", args[0]);
                        System.out.println("O ano deve conter 4 digitos");
                        return validarAno(args[0]);
                    }else{ 
                        return ano; }
                }
            }
         }catch( InputMismatchException e){
            Menu.LimparTerminal();
            Menu.menu("add",args[0]);
            System.out.println("Digite somente valores do tipo numérico");
            return validarAno(args[0]);
         }  
    }
    
    static public int op(){
        // Valida o tipo de operação 
        
        Scanner key = new Scanner(System.in); 
         try{
            while (true) {
                if(key.hasNextLine()){
                    int op = key.nextInt();
                    return op;
                }
            }
         }catch( InputMismatchException e){
            Menu.LimparTerminal();
            Menu.menu("");
            System.out.println("Digite somente valores do tipo numérico");
            return op();
         }
        
     }

    static public String validarPlaca(String menu){
        Scanner key = new Scanner(System.in);   
            String op = key.next();
            if(op.length() == 5){
                if(Character.isLetter(op.charAt(0)) || Character.isLetter(1)){
                    if(op.charAt(2) == '-'){
                        if(Character.isDigit(op.charAt(3)) || Character.isDigit(op.charAt(4))){
                            String retorno = "" + op.charAt(0) + op.charAt(1);
                            retorno = retorno.toUpperCase();
                            return op = retorno + op.charAt(2) + op.charAt(3) + op.charAt(4);
                        }else{
                            Menu.menu(menu); 
                            System.out.println("Err -> Os ultimos digitos deve ser números !!");
                            return validarPlaca(menu);
                        }
                    }else{
                        Menu.menu(menu); 
                        System.out.println("Err -> Entre os Digitos deve conter - !!");
                        return validarPlaca("");
                    }

                }else{
                    Menu.menu(menu); 
                    System.out.println("Err -> Os dois primeiros digitos devem ser letras !!");
                    return validarPlaca(menu);
                }

            }else if(op.equals("0")){

                return "0";
                
            }else{
                Menu.menu(menu);
                System.out.println("Err -> Deve conter 5 digitos");
                return validarPlaca(menu);
            }
    } 

    static public Object validarMarca(Object... args){
        Scanner key = new Scanner(System.in);  
        String marcaCar = key.next();
        String str = "";

        for(int i = 0; i<marcaCar.length(); i++){
            if(Character.isDigit(marcaCar.charAt(i))){ 
                str = "false"; }
        }

        if(str.equals("false")){ 
            Menu.LimparTerminal();
            Menu.menu("add",args[0],args[1]);
             System.out.println("A marca do carro não pode conter só digitos ");
            return validarMarca(args[0],args[1]);
        }else if(marcaCar.length() >=2){ 
            String firstLetr ="" + marcaCar.charAt(0);
            firstLetr = firstLetr.toUpperCase();
            return marcaCar = firstLetr + marcaCar.substring(1); 
        }else{
            Menu.LimparTerminal();
            Menu.menu("add",args[0],args[1]);
             System.out.println("A marca do carro não pode conter menos de 2 digitos ");
            return validarMarca(args[0],args[1]);
        }

    }

    static public Object validarModelo(Object... args){
        String modelo = key_.next();
        
        if(modelo.length()<=1){
            if(modelo.equals("0")){ return "0";}

            Menu.LimparTerminal();
            Menu.menu("add",args[0],args[1],args[2]);
            System.out.println("O modelo deve ter no mínimo 2 caracteres ");
        }else {
            String firstLetr = ""+ modelo.charAt(0);
            firstLetr = firstLetr.toUpperCase();
            return modelo = firstLetr + modelo.substring(1);
        }
        return "";
    }
}
