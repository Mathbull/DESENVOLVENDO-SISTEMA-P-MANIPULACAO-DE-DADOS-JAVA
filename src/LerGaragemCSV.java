import java.io.*;
import java.nio.charset.StandardCharsets;


public class LerGaragemCSV {
    // Classe que serve para ler, escrever e remover dados no CSV

    public String pegaCsv(String file){
        // Método para ler o q conteúdo q esta no CSV

        String linee = "";
        try(
            InputStream pathArq = new FileInputStream(file);
            InputStreamReader readerAq = new InputStreamReader(pathArq, StandardCharsets.UTF_8);
            BufferedReader linhaArq = new BufferedReader(readerAq);
        ){
            String line;
            while (( line = linhaArq.readLine())!= null) {
                linee += line + ";";
            }
        }catch(IOException e){
            System.out.println("erro pegaCsv");
        }
        return linee;
    }

    public void guardarCarro(Carro aCar, String filePath){
        // Esse metodo serve para adicionar/escrever um novo carro no CSV

        try(
            FileWriter wayFile = new FileWriter(filePath, true);
            BufferedWriter fileUtf = new BufferedWriter(wayFile);
            PrintWriter salvarFile = new PrintWriter(fileUtf);

        ){
            salvarFile.println(
                aCar.getAno() + "," + aCar.getMarca() + "," +
                aCar.getModelo() + "," + aCar.getPlaca());

        }catch(IOException e){
            System.out.println();
        }
        
    }

    public void removerCar( String filePath, String aGaragem){
       // Reescreve o CSV sem o carro passado para remover, criando a ilusão de ter apagado o carro
        try(
            OutputStream wayFile = new FileOutputStream(filePath);
            OutputStreamWriter fileUtf = new OutputStreamWriter(wayFile, StandardCharsets.UTF_8);
            PrintWriter slvNeuFile = new PrintWriter(fileUtf, true);
        ){
            String[] Garagem = aGaragem.split(";");
            for( int i =0; i <Garagem.length; i++){
                slvNeuFile.println(Garagem[i]);
            }
        }catch(IOException e){
            System.out.println("Erro na removerCar");
            }
        }
    }





