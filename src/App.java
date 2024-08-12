 
public class App {
    public static void main(String[] args) throws Exception {
        
        int op; 
        String op2 = "";
        System.out.print("\033[H\033[2J");

        while (true) {
            GaragemMap garagem = new GaragemMap();
            
            Menu.menu("");
            
            if(op2.equals("")){ op = Seguranca.op();
            }else{ op = 2;}
            
            if(op == 1){
                System.out.print("\033[H\033[2J");
                Menu.title();
                garagem.getCarros();
                Menu.menu("views");
                
                Seguranca.key_.nextLine();
                Menu.LimparTerminal();

            }else if(op == 2){
                Menu.menu("add");
                if(!op2.equals("")){ System.out.println("Essa placa já existe !"); }
                String placa = Seguranca.validarPlaca("add");

                if(!placa.equals("0") ){
                    
                    if( garagem.validarPlaca(placa)){
                        Menu.menu("add", placa);
                        op2 = "";
                       
                        Object Ano = Seguranca.validarAno(placa);
                        int ano = (int) Ano;
                        if(ano != 0){
                            Menu.menu("add", placa, ano);
                            Object marca = Seguranca.validarMarca(placa, ano);
                            String Marca = (String) marca;
                            
                            if(!Marca.equals("0")){
                                Menu.menu("add", placa, ano, Marca);
                                Object modelo = Seguranca.validarModelo(placa, ano, Marca);
                                String Modelo = (String) modelo;
                                if(!Modelo.equals("0")){
                                    Menu.menu("add", placa, ano, Marca, Modelo);
                                    garagem.addCar(new Carro(ano, Marca, Modelo, placa));
                                    System.out.println(" ".repeat((260 - 34)/2) + " Carro inserido com sucesso!!!");
                                    System.out.println(" ".repeat((260 - 34)/2) + "QQ tenha e enter para voltar ao menu");
                                    Seguranca.key_.next();
                                    Menu.LimparTerminal();
                                }
                            }
                        }
                    }else{
                        op2 = "2";
                    }
                }
             
            }else if(op == 3){
                
                Menu.menu("remover");
                String placa = Seguranca.validarPlaca("remover");
                if(!placa.equals("0")){
                    garagem.removeCar(placa);
                }
                
            }else if (op == 0){
                break;
            }else{
                Menu.LimparTerminal();
            }
        }
    }
        
}
