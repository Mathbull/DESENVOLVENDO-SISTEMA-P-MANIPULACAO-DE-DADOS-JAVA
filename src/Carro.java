public class Carro {
    private int ano;
    private String marca;
    private String modelo;
    private String placa;

    public Carro(int aAno, String aMarca, String aModelo, String aPlaca){
        this.ano = aAno;
        this.marca = aMarca;
        this.modelo = aModelo;
        this.placa = aPlaca;
    }

    public int getAno(){ return this.ano;}
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public String getPlaca(){ return this.placa;}

    public void imprimirFormatado() {
        // Imprime os cabeçalhos da tabela

        // Imprime os dados do carro formatados
        System.out.format("\t".repeat(12) + "| %-4d | %-20s | %-20s | %-10s |%n", ano, marca, modelo, placa);

        // Imprime linha final da tabela
        System.out.format("\t".repeat(12) + "+------+----------------------+----------------------+------------+%n");
    }

    @Override
    public String toString(){
        String res = "Ano: " + this.ano;
        res += "\nMarca: " + this.marca;
        res += "\nModelo: " + this.modelo;
        res += "\nPlaca: " + this.placa;
        
        return res;
    }
}
