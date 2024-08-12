<div align="center" id="top"> 
  <img src="./img/java_persistencia.jpg" alt="Java Persistencia de dados" />
</div>

<h1 align="center">Desenvolvimento de Sitesma para Manipulação de Dados</h1>

<h3 align="center">Trabalho para conclusão semestral da disciplina de Orientação a Objetos com JAVA</h3>

<p align="center">
  <img alt="Principal linguagem do projeto" src="https://img.shields.io/github/languages/top/Mathbull/DESENVOLVENDO-SISTEMA-P-MANIPULACAO-DE-DADOS-JAVA?color=56BEB8">

  <img alt="Quantidade de linguagens utilizadas" src="https://img.shields.io/github/languages/count/Mathbull/DESENVOLVENDO-SISTEMA-P-MANIPULACAO-DE-DADOS-JAVA?color=56BEB8">

  <img alt="Tamanho do repositório" src="https://img.shields.io/github/repo-size/Mathbull/DESENVOLVENDO-SISTEMA-P-MANIPULACAO-DE-DADOS-JAVA?color=56BEB8">
 
</p>

<p align="center">
  <a href="#dart-sobre">Sobre</a> &#xa0; | &#xa0; 
  <a href="#memo-licença">Licença</a> &#xa0; | &#xa0;
  <a href="https://github.com/isabellazramos" target="_blank">Autor</a>
</p>

<h2 align='center'>  :dart: Sobre </h2>

<p align="justify">
  Trabalho de conclusão de semestre sobre a persistência de dados, visando contribuir para o avanço do conhecimento em paradigmas orientados a objetos, bem como destacando a importância do armazenamento de dados para garantir a continuidade e viabilizar futuras manipulações do programa pelos usuários.
</p>

<h2 align='center'>📽️ Projeto</h2>
<p align="center">Detalhamento do projeto com o uso de diagrama UML:</p>

<div  align="center" >
    <img src="./img/uml.png" alt="Estrutura do programa usando diagrama UML" />
 </div>


<h2 align="center" > 🏗️ Estrutura </h2>

<details>
  <summary> <h3> Processo de acesso aos dados </h3> </summary>
 
A Classe `LerGaragemCSV`  é onde está todo o método utilizado para ler e retornar os dados presentes no csv, são eles: 
 
O método `pegaCsv(String file)` lê o conteúdo de um arquivo CSV e retorna os dados como uma única string. Ele primeiro abre o arquivo especificado usando um `FileInputStream` e, em seguida, usa um `InputStreamReader` com codificação UTF-8 para lê-lo como texto. O método cria um `BufferReader ` para facilitar a leitura da linha. Enquanto o arquivo CSV tiver linha, o método lê e adiciona a linha à variável de string criada, separando cada linha por um ponto e vírgula (;) entre elas. Caso ocorra uma exceção de E/S(IOException), o método imprimirá “erro pegaCsv”. Finalmente, a string de concatenação com o arquivo CSV é retornada. 

O método `guardarCarro(Carro aCar, String filePath)` adiciona uma nova entrada de carro no final do arquivo CSV. Ele abre o arquivo em modo de anexação utilizando um `FileWriter` com o parâmetro `true`, permitindo adicionar dados sem sobrescrever o conteúdo já existente. Esse `FileWriter` é envolvido em um `BufferedWriter` para melhorar a eficiência da escrita, e um `PrintWriter` é usado para facilitar a formatação da saída. Os dados do carro (ano, marca, modelo e placa) são então escritos no arquivo CSV, separados por vírgulas para que não ocorra erros, caso ocorra, uma exceção de E/S (IOException) acontecerá e o método simplesmente imprime uma linha em branco. 

O método `removerCar(String filePath, String aGaragem)` reescreve o arquivo CSV sem a entrada do carro especificado, passando a ideia de que o carro foi removido. Ele abre o arquivo em modo de escrita utilizando um `FileOutputStream`, o que sobrescreve todo o conteúdo existente. O `FileOutputStream` é envolvido em um `OutputStreamWriter` com codificação UTF-8, e um `PrintWriter` é criado para facilitar a escrita no arquivo. A string `aGaragem` é dividida em um array de strings utilizando o delimitador `;`, e o método itera sobre este array, escrevendo cada linha no arquivo CSV. Em caso de uma exceção de E/S (IOException), o método imprime "Erro na removerCar". 

</details>

## :memo: Licença ##

Este projeto está sob licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.


Feito com :heart: por <a href="https://github.com/Mathbull" target="_blank">Matheus Santos</a>

&#xa0;

<a href="#top">Voltar para o topo</a>
