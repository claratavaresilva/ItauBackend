package br.com.itau.extrato.api.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import br.com.itau.extrato.api.model.ApiDTO;
import br.com.itau.extrato.api.params.ParamsExtrato;
import br.com.itau.extrato.utils.ClientWebTarget;
import br.com.itau.extrato.api.model.Saldo;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Service
public class SaldoServiceImpl implements SaldoService {
	
	private final static String PATH_API_SALDO = "/conta/saldo";

    private ClientWebTarget webTarget;
    
    
    @Autowired
    SaldoServiceImpl(ClientWebTarget webTarget){
        this.webTarget = webTarget;
    }
    
    
	@Override
	public ApiDTO getSaldo(ParamsExtrato params) throws Exception {
		Response response = this.webTarget
                .client()
                .path(PATH_API_SALDO)
                .request()
                .post(Entity.entity(params, MediaType.APPLICATION_JSON_TYPE));
        if(response.getStatus() != HttpStatus.OK.value()) {
            throw new Exception("erro de api");
        }

        return response.readEntity(Saldo.class);
	}
} 


