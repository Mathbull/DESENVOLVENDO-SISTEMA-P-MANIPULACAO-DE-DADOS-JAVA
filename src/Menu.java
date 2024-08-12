public class Menu {
    // Classe Menu gerencia o q será demonstrado ou não para o usuario
    
    static void title(){
        String title = "APS - ORIENTAÇÃO A OBJETO COM JAVA";
        String separator = "=".repeat(title.length()+30);

        System.out.println(" ".repeat((230 - title.length())/2) + separator);
        System.out.println(" ".repeat((260 - title.length())/2) + title);
        System.out.println(" ".repeat((230 - title.length())/2) + separator);
        System.out.println();
    }

    static void menu(Object... op){

        if(op[0] == "remover"){
            LimparTerminal();

            title();
            
            System.out.println(" ".repeat((280 - 34)/2) + " RETIRADA DE VEICULOS ");
            System.out.println();
            
            System.out.println(" ".repeat((260 - 34)/2) + " **** OBSERVAÇÕES ****"); 
            System.out.println(" ".repeat((260 - 34)/2) + " A Placa deve ter: 2 letras, - , 2 Números");
            System.out.println(" ".repeat((260 - 34)/2) + " A Placa dever ser assim: [XX-00]");
            System.out.println(" ".repeat((260 - 34)/2));
            System.out.println(" ".repeat((260 - 34)/2) + " 0 - Para voltar ao menu principal");
            
            System.out.println("Placa: ");
             
            
        }else if(op[0] == "views"){
           
            
            System.out.println(" ".repeat((230 - 34)/2));
            System.out.println(" ".repeat((230 - 34)/2) + " Esses são todos os Carros que se encontram na garagem :3");
            System.out.println(" ".repeat((250 - 34)/2) + " Pressione enter para voltar ao menu");
             
            
        }else if( op[0] == "add"){
            Object placa;
            Object ano;
            Object marca;
            Object modelo;
            int sceew = 240 ;
            if(op.length > 1){ placa = op[1] ;
            sceew = 235;} else{placa = "";}
            if(op.length > 2){ ano = op[2] ;
            sceew = 230;} else{ano = "";
            }if(op.length > 3){ marca = op[3] ;
            sceew = 225;} else{marca = "";
            }if(op.length > 4){ modelo = op[4] ;
            sceew = 220;} else{modelo = "";}

            

  
            LimparTerminal();
            title();

            System.out.println(" ".repeat((270 - 34)/2) + " ENTRADA NOVOS VEICULOS ");
            System.out.println();
            
            System.out.println(" ".repeat((272 - 34)/2) + " **** OBSERVAÇÕES ****"); 
            System.out.println(" ".repeat((240 - 34)/2) + " A Placa deve ter: 2 letras, - , 2 Números ->  [XX-00]");
            System.out.println(" ".repeat((240 - 34)/2) + " A marca do carro não pode conter só digitos -> [Nissan]");
            System.out.println(" ".repeat((240 - 34)/2) + " O modelo deve conter no minimo 2 caractere -> [A3]");
            System.out.println(" ".repeat((240 - 34)/2) + " O ano deve conter 4 digitos -> [2024]");
           
            System.out.println(" ".repeat((260 - 34)/2) + "* Não podem haver placaras igual !! *");
            System.out.println(" ".repeat((260 - 34)/2));
            System.out.println(" ".repeat((260 - 34)/2) + " 0 - Para voltar ao menu principal");

           System.out.format(" ".repeat((sceew - 34)/2) + " <- PLACA[ %s ] - ANO[ %s ] - MARCA[ %s ] - MODELO[ %s ] ->%n", placa, ano, marca, modelo);
 

           if(op.length == 1){ System.out.println("Digite a placa do novo veículo: "); 
            }else if(op.length == 2){ System.out.println("Digite o ano do novo veículo: "); 
            }else if(op.length ==3){System.out.println("Digite a marca do novo veículo: ");
            }else if(op.length == 4){System.out.println("Digite o modelo do novo veículo: ");}
            
            
             

        }else if(op[0]==""){
            LimparTerminal();
            title();
            System.out.println(" ".repeat((260 - 34)/2) + "Pressione os seguintes comandos para: ");
            System.out.println(" ".repeat((260 - 34)/2) + " 1 - Para ver os carros na garagem");
            System.out.println(" ".repeat((260 - 34)/2) + " 2 - Para add algum carro na garagem");
            System.out.println(" ".repeat((260 - 34)/2) + " 3 - Para Remover algum carro da garagem");
            System.out.println(" ".repeat((260 - 34)/2) + " 0 - Sair");
            System.out.println("Qual a operação desejada: ");
              

        }
        
    }

    static void LimparTerminal() {
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println();
                System.out.println("ERRO limpar terminal");
            }
        
    }  
}
