import java.util.Map;
import java.util.TreeMap;

public class GaragemMap {
    // Classe para guardar cada cara carro que esta dentro do CSV

    private Map<String, Carro> GaragemMap = new TreeMap<>();
    // Criamos a instância que sera a garagem do nossos carros no CSV

    private LerGaragemCSV storage = new LerGaragemCSV();
    // Criamos a instacia do obj que irá ler e escrever no CSV

    private String file = ".\Garagem.csv";
    // Caminho onde esta o CSV

    public GaragemMap(){
        // Sempre que for instaciado essa classe automaticamente ela verifica o CSV

        String car = storage.pegaCsv(file);
        // Armazena tudo que estiver no cvs em uma única string

        if(car != ""){
            String[] cars = car.split(";");
            // Quebra todo conteudo de car  onde tem o ;

            for(String caro: cars){
                String[] c = caro.split(",");
                Carro newCar = new Carro(Integer.parseInt(c[0]), c[1], c[2], c[3]);
                GaragemMap.put(newCar.getPlaca(), newCar);
            }
            // Quebra cada elemento de cars e quebra mais ainda para ser cara atributo do carro
        }
    }

    public void getCarros(){
        // Demonstra todos os carros que foi encontrado no CSV

        System.out.format("\t".repeat(12) + "+------+----------------------+----------------------+------------+%n");
        System.out.format("\t".repeat(12) + "| ANO  | MARCA                | MODELO               | PLACA      |%n");
        System.out.format("\t".repeat(12) + "+------+----------------------+----------------------+------------+%n");

        for(String car: GaragemMap.keySet()){ GaragemMap.get(car).imprimirFormatado(); }
    }

    public void addCar(Carro newCar){
        // Verifica se a placa do carro já foi craida, somente placas que não estão no CSV

        if(!GaragemMap.containsKey(newCar.getPlaca())){
            this.GaragemMap.put(newCar.getPlaca(), newCar);
            this.storage.guardarCarro(newCar, file);
        }
    }

    public boolean validarPlaca(String placaValid){
        // Valida se existe ou não a placa passado pelo usuario

        if(GaragemMap.containsKey(placaValid)){
            return false;
        }else{
            return true;
        }
    }

    public void removeCar(String placaRemove){
        // Cria um novo CSV, mas sem o que foi passado para remover
        String newGaragemRemovida = "";

        for(String placa: GaragemMap.keySet()){

            if(!GaragemMap.get(placa).getPlaca().equals(placaRemove)){
                newGaragemRemovida += (GaragemMap.get(placa).getAno() + ","
                + GaragemMap.get(placa).getMarca() + "," + GaragemMap.get(placa).getModelo() + ","
                + GaragemMap.get(placa).getPlaca()) + ";";
            } 
        }
        if(newGaragemRemovida != ""){ storage.removerCar(file, newGaragemRemovida); }
        this.GaragemMap.clear();
    }


}
