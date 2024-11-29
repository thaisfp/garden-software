package control;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import model.Endereco;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import org.json.JSONObject;


public class BuscarCEP {

    /**
     * Recupera objeto Endereco pelo CEP
     * @param cep String no formato 00000000
     * @return instancia de br.com.correios.Endereco
     */
    
    public static Endereco consultarCEP(String cep) throws MalformedURLException, IOException  {

        Endereco ender = null;
        
        // Definir a URL do serviço ViaCEP
        URL url = new URL("https://viacep.com.br/ws/" + cep + "/json/");

        // Definir a URL do serviço GOV.BR
        //URL url = new URL("https://h-apigateway.conectagov.estaleiro.serpro.gov.br/api-cep/v1/consulta/cep/" + cep);

        // Abrir conexão HTTP
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Ler a resposta
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        // Converter a resposta JSON em um objeto JSONObject
        JSONObject jsonObject = new JSONObject(response.toString());

        // Exibir as informações do endereço
        if (!jsonObject.has("erro")) {                            

            ender = new Endereco();
            ender.setRua(jsonObject.getString("logradouro"));
            ender.setBairro(jsonObject.getString("bairro") );
            ender.setCidade(jsonObject.getString("localidade") );

        } else {
            System.out.println("CEP não encontrado.");
               
        }

        // Fechar conexão
        connection.disconnect();
        return ender;

    }

}

