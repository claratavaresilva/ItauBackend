package br.com.itau.extrato.api.services;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.model.ContaCorrente;
import br.com.itau.extrato.api.params.ParamsConta;
import br.com.itau.extrato.utils.ClientWebTarget;

@Service
public class ContaServiceImpl implements ContaService {

	
	private final static String PATH_API_CONTA = "/conta/conta-corrente";

    private ClientWebTarget webTarget;

    @Autowired
    ContaServiceImpl(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }
    
	@Override
	public ApiDTO getConta(ParamsConta params) throws Exception {
		Response response = this.webTarget
                .client()
                .path(PATH_API_CONTA)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()){
        	if(params.getAgencia().length() != 4) {
        		throw new Exception("número da agência precisa ter 4 caracteres");
        	}else if(params.getConta().length() != 5) {
        		throw new Exception("número da conta precisa ter 5 caracteres");
        	}else if (params.getDac().length() != 1) {
        		throw new Exception("dac precisa ter 1 carater");
        	}else if(params.getSenha() != "123456") {
        		throw new Exception("senha incorreta");
        	}
        }
        return response.readEntity(ContaCorrente.class);
	}
	

}
